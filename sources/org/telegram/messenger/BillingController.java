package org.telegram.messenger;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import com.android.billingclient.api.Purchase;
import com.google.android.gms.internal.play_billing.r;
import j$.util.Map;
import j$.util.concurrent.ConcurrentHashMap;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Currency;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONObject;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.og0;
import org.telegram.ui.zy;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes.dex */
public class BillingController implements p2.o, p2.c {
    public static final p2.p PREMIUM_PRODUCT;
    public static p2.m PREMIUM_PRODUCT_DETAILS = null;
    public static final String PREMIUM_PRODUCT_ID = "telegram_premium";
    public static boolean billingClientEmpty;
    private static NumberFormat currencyInstance;
    private static NumberFormat currencyInstanceRounded;
    private static BillingController instance;
    private final p2.a billingClient;
    private boolean isDisconnected;
    private String lastPremiumToken;
    private String lastPremiumTransaction;
    private Runnable onCanceled;
    private final Map<String, q0.a> resultListeners = new HashMap();
    private final Set<String> requestingTokens = Collections.newSetFromMap(new ConcurrentHashMap());
    private final Map<String, Integer> currencyExpMap = new HashMap();
    private ArrayList<Runnable> setupListeners = new ArrayList<>();
    private int triesLeft = 0;

    /* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
    public interface ProductDetailsResponseListenerLegacy {
        void onProductDetailsResponse(p2.h hVar, List<p2.m> list);
    }

    static {
        b6.h hVar = new b6.h();
        hVar.c = "subs";
        hVar.b = PREMIUM_PRODUCT_ID;
        PREMIUM_PRODUCT = hVar.a();
    }

    private BillingController(Context context) {
        p2.a xVar;
        androidx.emoji2.text.f fVar = new androidx.emoji2.text.f(context);
        fVar.a = new cb.b(18);
        fVar.b = this;
        if (context == null) {
            throw new IllegalArgumentException("Please provide a valid Context.");
        }
        if (((BillingController) fVar.b) == null) {
            throw new IllegalArgumentException("Please provide a valid listener for purchases updates.");
        }
        if (((cb.b) fVar.a) == null) {
            throw new IllegalArgumentException("Pending purchases for one-time products must be supported.");
        }
        ((cb.b) fVar.a).getClass();
        if (((BillingController) fVar.b) != null) {
            cb.b bVar = (cb.b) fVar.a;
            BillingController billingController = (BillingController) fVar.b;
            xVar = fVar.a() ? new p2.x(bVar, context, billingController, fVar) : new p2.b(bVar, context, billingController, fVar);
        } else {
            cb.b bVar2 = (cb.b) fVar.a;
            xVar = fVar.a() ? new p2.x(bVar2, context, fVar) : new p2.b(bVar2, context, fVar);
        }
        this.billingClient = xVar;
    }

    public static BillingController getInstance() {
        if (instance == null) {
            instance = new BillingController(ApplicationLoader.applicationContext);
        }
        return instance;
    }

    public static String getResponseCodeString(int i10) {
        if (i10 == 12) {
            return "NETWORK_ERROR";
        }
        switch (i10) {
            case -3:
                return "SERVICE_TIMEOUT";
            case -2:
                return "FEATURE_NOT_SUPPORTED";
            case -1:
                return "SERVICE_DISCONNECTED";
            case 0:
                return "OK";
            case 1:
                return "USER_CANCELED";
            case 2:
                return "SERVICE_UNAVAILABLE";
            case 3:
                return "BILLING_UNAVAILABLE";
            case 4:
                return "ITEM_UNAVAILABLE";
            case 5:
                return "DEVELOPER_ERROR";
            case 6:
                return "ERROR";
            case 7:
                return "ITEM_ALREADY_OWNED";
            case 8:
                return "ITEM_NOT_OWNED";
            default:
                return "BILLING_UNKNOWN_ERROR";
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void lambda$consumeGiftPurchase$12(TLRPC.InputStorePaymentPurpose inputStorePaymentPurpose, Purchase purchase, Runnable runnable, p2.h hVar, String str) {
        StringBuilder sb = new StringBuilder("BillingController consumeGiftPurchase ");
        sb.append(inputStorePaymentPurpose);
        sb.append(" ");
        sb.append(purchase.a());
        sb.append(" ");
        sb.append(purchase.c());
        sb.append(" done: ");
        int i10 = hVar.a;
        sb.append(i10 == 0 ? "OK" : Integer.valueOf(i10));
        sb.append(" ");
        org.telegram.ui.yh.v(hVar.c, sb);
        if (runnable != null) {
            runnable.run();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$launchBillingFlow$1(Activity activity, AccountInstance accountInstance, TLRPC.InputStorePaymentPurpose inputStorePaymentPurpose, List list, p2.e eVar) {
        launchBillingFlow(activity, accountInstance, inputStorePaymentPurpose, list, eVar, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void lambda$launchBillingFlow$2(Purchase purchase, List list, String str, AtomicInteger atomicInteger, Runnable runnable, p2.h hVar, String str2) {
        if (hVar.a == 0) {
            FileLog.d("BillingController.launchBillingFlow, consumed " + purchase.c() + ": OK");
            list.add(str);
            if (atomicInteger.get() == list.size()) {
                runnable.run();
                return;
            }
            return;
        }
        FileLog.d("BillingController.launchBillingFlow, consumed " + purchase.c() + ": " + hVar.a + " " + hVar.c);
        list.add(null);
        if (atomicInteger.get() == list.size()) {
            runnable.run();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$launchBillingFlow$3(List list, AtomicInteger atomicInteger, Runnable runnable) {
        list.add(null);
        if (atomicInteger.get() == list.size()) {
            runnable.run();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0026, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void lambda$launchBillingFlow$4(Activity activity, AccountInstance accountInstance, TLRPC.InputStorePaymentPurpose inputStorePaymentPurpose, List list, p2.e eVar, p2.h hVar, List list2) {
        if (hVar.a != 0) {
            StringBuilder sb = new StringBuilder("BillingController.launchBillingFlow, checked consumables: ");
            sb.append(hVar.a);
            sb.append(" ");
            org.telegram.ui.yh.v(hVar.c, sb);
            launchBillingFlow(activity, accountInstance, inputStorePaymentPurpose, list, eVar, false);
            return;
        }
        FileLog.d("BillingController.launchBillingFlow, checked consumables: OK");
        b0 b0Var = new b0(this, activity, accountInstance, inputStorePaymentPurpose, list, eVar, 0);
        final AtomicInteger atomicInteger = new AtomicInteger(0);
        final ArrayList arrayList = new ArrayList();
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            final Purchase purchase = (Purchase) it.next();
            if (purchase.c.optBoolean("acknowledged", true)) {
                Iterator it2 = list.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        final String str = ((p2.d) it2.next()).a.c;
                        if (purchase.b().contains(str)) {
                            atomicInteger.incrementAndGet();
                            FileLog.d("BillingController.launchBillingFlow, consuming " + purchase.c());
                            p2.a aVar = this.billingClient;
                            String c3 = purchase.c();
                            if (c3 == null) {
                                throw new IllegalArgumentException("Purchase token must be set");
                            }
                            com.google.android.gms.internal.clearcut.e eVar2 = new com.google.android.gms.internal.clearcut.e();
                            eVar2.b = c3;
                            final b0 b0Var2 = b0Var;
                            b0Var = b0Var2;
                            aVar.a(eVar2, new p2.i() { // from class: org.telegram.messenger.c0
                                @Override // p2.i
                                public final void a(p2.h hVar2, String str2) {
                                    BillingController.lambda$launchBillingFlow$2(Purchase.this, arrayList, str, atomicInteger, b0Var2, hVar2, str2);
                                }
                            });
                        }
                    }
                }
            } else {
                atomicInteger.incrementAndGet();
                p2.g a2 = p2.h.a();
                a2.a = 0;
                onPurchasesUpdatedInternal(a2.e(), Collections.singletonList(purchase), new g0(8, atomicInteger, b0Var, arrayList));
            }
        }
        if (atomicInteger.get() == 0) {
            b0Var.run();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lambda$onPurchasesUpdatedInternal$10(org.telegram.ui.ActionBar.d2[] d2VarArr, Purchase purchase, TLRPC.TL_payments_assignPlayMarketTransaction tL_payments_assignPlayMarketTransaction, AccountInstance accountInstance, p2.h hVar, AtomicInteger atomicInteger, AtomicInteger atomicInteger2, Runnable runnable, TLObject tLObject, TLRPC.TL_error tL_error) {
        int i10;
        AndroidUtilities.runOnUIThread(new f0(d2VarArr, 0));
        this.requestingTokens.remove(purchase.c());
        int i11 = 1;
        if (!(tLObject instanceof TLRPC.Updates)) {
            StringBuilder sb = new StringBuilder("BillingController.onPurchasesUpdatedInternal: ");
            sb.append(purchase.a());
            sb.append(" purchase is purchased and failed to assign: ");
            org.telegram.ui.yh.v(tL_error == null ? null : tL_error.text, sb);
            Runnable runnable2 = this.onCanceled;
            if (runnable2 != null) {
                runnable2.run();
                this.onCanceled = null;
            }
            if (tL_error != null) {
                i10 = 2;
                NotificationCenter.getGlobalInstance().postNotificationNameOnUIThread(NotificationCenter.billingConfirmPurchaseError, tL_payments_assignPlayMarketTransaction, tL_error);
            } else {
                i10 = 2;
            }
            AndroidUtilities.runOnUIThread(new y(atomicInteger, atomicInteger2, runnable, i10));
            return;
        }
        FileLog.d("BillingController.onPurchasesUpdatedInternal: " + purchase.a() + " purchase is purchased and now assigned");
        if (tL_payments_assignPlayMarketTransaction.purpose instanceof TLRPC.TL_inputStorePaymentAuthCode) {
            ArrayList findUpdatesAndRemove = MessagesController.findUpdatesAndRemove((TLRPC.Updates) tLObject, TL_update.TL_updateSentPhoneCode.class);
            int size = findUpdatesAndRemove.size();
            int i12 = 0;
            while (i12 < size) {
                Object obj = findUpdatesAndRemove.get(i12);
                i12++;
                AndroidUtilities.runOnUIThread(new g0(accountInstance, tL_payments_assignPlayMarketTransaction, (TL_update.TL_updateSentPhoneCode) obj, 9));
            }
        }
        accountInstance.getMessagesController().processUpdates((TLRPC.Updates) tLObject, false);
        ArrayList b10 = purchase.b();
        int size2 = b10.size();
        int i13 = 0;
        while (i13 < size2) {
            Object obj2 = b10.get(i13);
            i13++;
            q0.a remove = this.resultListeners.remove((String) obj2);
            if (remove != null) {
                remove.accept(hVar);
            }
        }
        consumeGiftPurchase(purchase, tL_payments_assignPlayMarketTransaction.purpose, new y(atomicInteger, atomicInteger2, runnable, i11));
        JSONObject jSONObject = purchase.c;
        String optString = jSONObject.optString("obfuscatedAccountId");
        String optString2 = jSONObject.optString("obfuscatedProfileId");
        String str = ((optString == null && optString2 == null) ? null : new b6.h(2, optString, optString2)).c;
        try {
            FileLog.d("BillingUtilities.clearPurpose: got {" + str + "}");
            SerializedData serializedData = new SerializedData(Utilities.hexToBytes(str));
            lf.a a2 = lf.a.a(serializedData, serializedData.readInt32(true));
            SerializedData serializedData2 = new SerializedData(8);
            serializedData2.writeInt64(a2.b);
            String bytesToHex = Utilities.bytesToHex(serializedData2.toByteArray());
            serializedData2.cleanup();
            FileLog.d("BillingUtilities.clearPurpose: id_hex = " + bytesToHex);
            ApplicationLoader.applicationContext.getSharedPreferences("purchases", 0).edit().remove(bytesToHex).apply();
        } catch (Exception e6) {
            FileLog.e(e6);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$onPurchasesUpdatedInternal$11(AtomicInteger atomicInteger, AtomicInteger atomicInteger2, Runnable runnable) {
        if (atomicInteger.incrementAndGet() != atomicInteger2.get() || runnable == null) {
            return;
        }
        runnable.run();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void lambda$onPurchasesUpdatedInternal$5(org.telegram.ui.ActionBar.d2[] d2VarArr) {
        org.telegram.ui.ActionBar.d2 d2Var = new org.telegram.ui.ActionBar.d2(ApplicationLoader.applicationContext, 3, null);
        d2VarArr[0] = d2Var;
        d2Var.q(500L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$onPurchasesUpdatedInternal$6(org.telegram.ui.ActionBar.d2[] d2VarArr) {
        org.telegram.ui.ActionBar.d2 d2Var = d2VarArr[0];
        if (d2Var != null) {
            d2Var.dismiss();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$onPurchasesUpdatedInternal$7(AccountInstance accountInstance, TLRPC.TL_payments_assignPlayMarketTransaction tL_payments_assignPlayMarketTransaction, TL_update.TL_updateSentPhoneCode tL_updateSentPhoneCode) {
        og0 og0Var = (og0) LaunchActivity.N();
        if (og0Var == null) {
            og0Var = new og0(accountInstance.getCurrentAccount());
            org.telegram.ui.ActionBar.p2 U = LaunchActivity.U();
            if (U != null) {
                U.presentFragment(og0Var);
            }
        }
        og0Var.q1(((TLRPC.TL_inputStorePaymentAuthCode) tL_payments_assignPlayMarketTransaction.purpose).phone_number, tL_updateSentPhoneCode.sent_code);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$onPurchasesUpdatedInternal$8(AtomicInteger atomicInteger, AtomicInteger atomicInteger2, Runnable runnable) {
        if (atomicInteger.incrementAndGet() != atomicInteger2.get() || runnable == null) {
            return;
        }
        runnable.run();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$onPurchasesUpdatedInternal$9(AtomicInteger atomicInteger, AtomicInteger atomicInteger2, Runnable runnable) {
        if (atomicInteger.incrementAndGet() != atomicInteger2.get() || runnable == null) {
            return;
        }
        runnable.run();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onQueriedPremiumProductDetails$14() {
        try {
            queryProductDetails(Collections.singletonList(PREMIUM_PRODUCT), new e0(this));
        } catch (Exception e6) {
            FileLog.e(e6);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void lambda$queryProductDetails$0(ProductDetailsResponseListenerLegacy productDetailsResponseListenerLegacy, p2.h hVar, p2.q qVar) {
        productDetailsResponseListenerLegacy.onProductDetailsResponse(hVar, qVar.a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onQueriedPremiumProductDetails(p2.h hVar, List<p2.m> list) {
        FileLog.d("Billing: Query product details finished " + hVar + ", " + list);
        if (hVar.a != 0) {
            switchToInvoice();
            int i10 = this.triesLeft - 1;
            this.triesLeft = i10;
            if (i10 > 0) {
                AndroidUtilities.runOnUIThread(new z(this, 0), i10 == 2 ? 1000L : 10000L);
                return;
            }
            return;
        }
        for (p2.m mVar : list) {
            if (mVar.c.equals(PREMIUM_PRODUCT_ID)) {
                PREMIUM_PRODUCT_DETAILS = mVar;
            }
        }
        if (PREMIUM_PRODUCT_DETAILS == null) {
            switchToInvoice();
        } else {
            switchBackFromInvoice();
            NotificationCenter.getGlobalInstance().postNotificationNameOnUIThread(NotificationCenter.billingProductDetailsUpdated, new Object[0]);
        }
    }

    private void switchBackFromInvoice() {
        if (billingClientEmpty) {
            billingClientEmpty = false;
            NotificationCenter.getGlobalInstance().postNotificationNameOnUIThread(NotificationCenter.billingProductDetailsUpdated, new Object[0]);
        }
    }

    private void switchToInvoice() {
        if (billingClientEmpty) {
            return;
        }
        billingClientEmpty = true;
        NotificationCenter.getGlobalInstance().postNotificationNameOnUIThread(NotificationCenter.billingProductDetailsUpdated, new Object[0]);
    }

    public void addResultListener(String str, q0.a aVar) {
        this.resultListeners.put(str, aVar);
    }

    public void consumeGiftPurchase(Purchase purchase, TLRPC.InputStorePaymentPurpose inputStorePaymentPurpose, Runnable runnable) {
        if ((inputStorePaymentPurpose instanceof TLRPC.TL_inputStorePaymentGiftPremium) || (inputStorePaymentPurpose instanceof TLRPC.TL_inputStorePaymentPremiumGiftCode) || (inputStorePaymentPurpose instanceof TLRPC.TL_inputStorePaymentStarsTopup) || (inputStorePaymentPurpose instanceof TLRPC.TL_inputStorePaymentStarsGift) || (inputStorePaymentPurpose instanceof TLRPC.TL_inputStorePaymentPremiumGiveaway) || (inputStorePaymentPurpose instanceof TLRPC.TL_inputStorePaymentStarsGiveaway) || (inputStorePaymentPurpose instanceof TLRPC.TL_inputStorePaymentAuthCode)) {
            FileLog.d("BillingController consumeGiftPurchase " + inputStorePaymentPurpose + " " + purchase.a() + " " + purchase.c());
            p2.a aVar = this.billingClient;
            String c3 = purchase.c();
            if (c3 == null) {
                throw new IllegalArgumentException("Purchase token must be set");
            }
            com.google.android.gms.internal.clearcut.e eVar = new com.google.android.gms.internal.clearcut.e();
            eVar.b = c3;
            aVar.a(eVar, new f(inputStorePaymentPurpose, purchase, runnable));
        }
    }

    public String formatCurrency(long j10, String str) {
        return formatCurrency(j10, str, getCurrencyExp(str));
    }

    public int getCurrencyExp(String str) {
        lf.b.a(this.currencyExpMap);
        return ((Integer) Map.-EL.getOrDefault(this.currencyExpMap, str, 0)).intValue();
    }

    public String getLastPremiumToken() {
        return this.lastPremiumToken;
    }

    public String getLastPremiumTransaction() {
        return this.lastPremiumTransaction;
    }

    public boolean isReady() {
        p2.b bVar = (p2.b) this.billingClient;
        bVar.getClass();
        return bVar.o();
    }

    public void launchBillingFlow(Activity activity, AccountInstance accountInstance, TLRPC.InputStorePaymentPurpose inputStorePaymentPurpose, List<p2.d> list) {
        launchBillingFlow(activity, accountInstance, inputStorePaymentPurpose, list, null, false);
    }

    @Override // p2.c
    public void onBillingServiceDisconnected() {
        FileLog.d("Billing: Service disconnected");
        int i10 = this.isDisconnected ? 15000 : 5000;
        this.isDisconnected = true;
        AndroidUtilities.runOnUIThread(new z(this, 1), i10);
    }

    @Override // p2.c
    public void onBillingSetupFinished(p2.h hVar) {
        FileLog.d("Billing: Setup finished with result " + hVar);
        if (hVar.a != 0) {
            if (this.isDisconnected) {
                return;
            }
            switchToInvoice();
            return;
        }
        this.isDisconnected = false;
        this.triesLeft = 3;
        try {
            queryProductDetails(Collections.singletonList(PREMIUM_PRODUCT), new e0(this));
        } catch (Exception e6) {
            FileLog.e(e6);
        }
        queryPurchases("inapp", new e0(this));
        queryPurchases("subs", new e0(this));
        if (this.setupListeners.isEmpty()) {
            return;
        }
        for (int i10 = 0; i10 < this.setupListeners.size(); i10++) {
            AndroidUtilities.runOnUIThread(this.setupListeners.get(i10));
        }
        this.setupListeners.clear();
    }

    @Override // p2.o
    public void onPurchasesUpdated(p2.h hVar, List<Purchase> list) {
        onPurchasesUpdatedInternal(hVar, list, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x018b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onPurchasesUpdatedInternal(p2.h hVar, List<Purchase> list, final Runnable runnable) {
        TLRPC.InputStorePaymentPurpose inputStorePaymentPurpose;
        AccountInstance accountInstance;
        q0.b bVar;
        final p2.h hVar2 = hVar;
        FileLog.d("Billing: Purchases updated: " + hVar2 + ", " + list);
        int i10 = hVar2.a;
        int i11 = 1;
        if (i10 != 0) {
            if (i10 == 1) {
                TLRPC.TL_help_saveAppLog tL_help_saveAppLog = new TLRPC.TL_help_saveAppLog();
                TLRPC.TL_inputAppEvent tL_inputAppEvent = new TLRPC.TL_inputAppEvent();
                tL_inputAppEvent.time = ConnectionsManager.getInstance(UserConfig.selectedAccount).getCurrentTime();
                tL_inputAppEvent.type = "premium.promo_screen_fail";
                tL_inputAppEvent.data = new TLRPC.TL_jsonNull();
                tL_help_saveAppLog.events.add(tL_inputAppEvent);
                ConnectionsManager.getInstance(UserConfig.selectedAccount).sendRequest(tL_help_saveAppLog, new oh.p5(4));
            }
            Runnable runnable2 = this.onCanceled;
            if (runnable2 != null) {
                runnable2.run();
                this.onCanceled = null;
            }
            if (runnable != null) {
                runnable.run();
                return;
            }
            return;
        }
        if (list == null || list.isEmpty()) {
            if (runnable != null) {
                runnable.run();
                return;
            }
            return;
        }
        final AtomicInteger atomicInteger = new AtomicInteger(0);
        final AtomicInteger atomicInteger2 = new AtomicInteger(0);
        this.lastPremiumTransaction = null;
        for (final Purchase purchase : list) {
            ArrayList b10 = purchase.b();
            JSONObject jSONObject = purchase.c;
            if (b10.contains(PREMIUM_PRODUCT_ID)) {
                this.lastPremiumTransaction = purchase.a();
                this.lastPremiumToken = purchase.c();
            }
            if (this.requestingTokens.contains(purchase.c())) {
                FileLog.d("BillingController.onPurchasesUpdatedInternal: " + purchase.a() + " purchase is already requesting...");
            } else if (jSONObject.optInt("purchaseState", i11) != 4) {
                String optString = jSONObject.optString("obfuscatedAccountId");
                String optString2 = jSONObject.optString("obfuscatedProfileId");
                b6.h hVar3 = (optString == null && optString2 == null) ? null : new b6.h(2, optString, optString2);
                if (hVar3 == null) {
                    FileLog.d("Billing: Extract payload. No AccountIdentifiers");
                } else {
                    String str = hVar3.b;
                    String str2 = hVar3.c;
                    if (str == null || str.isEmpty() || str2 == null || str2.isEmpty()) {
                        FileLog.d("Billing: Extract payload. Empty AccountIdentifiers");
                    } else {
                        try {
                            inputStorePaymentPurpose = lf.b.b(str2);
                        } catch (Exception e6) {
                            FileLog.e("Billing: Extract payload, failed to get purpose", e6);
                            inputStorePaymentPurpose = null;
                        }
                        String str3 = new String(Base64.decode(str, 0), r8.d.c);
                        FileLog.d("Billing: Extract payload. obfuscatedAccountIdString=".concat(str3));
                        if (str3.startsWith("account-")) {
                            try {
                                accountInstance = AccountInstance.getInstance(Integer.parseInt(str3.substring(8)));
                            } catch (Exception e10) {
                                FileLog.e("Billing: Extract Payload", e10);
                            }
                        } else {
                            long parseLong = Long.parseLong(str3);
                            int i12 = 0;
                            while (true) {
                                if (i12 >= 4) {
                                    accountInstance = null;
                                    break;
                                }
                                AccountInstance accountInstance2 = AccountInstance.getInstance(i12);
                                if (accountInstance2.getUserConfig().getClientUserId() == parseLong) {
                                    accountInstance = accountInstance2;
                                    break;
                                }
                                i12++;
                            }
                            if (accountInstance == null) {
                                FileLog.d("Billing: Extract payload. AccountInstance not found, accountId=" + parseLong);
                            }
                        }
                        bVar = new q0.b(accountInstance, inputStorePaymentPurpose);
                        if (bVar != null) {
                            Object obj = bVar.a;
                            Object obj2 = bVar.b;
                            if (obj != null && obj2 != null) {
                                if (jSONObject.optBoolean("acknowledged", true)) {
                                    FileLog.d("BillingController.onPurchasesUpdatedInternal: " + purchase.a() + " purchase is purchased and acknowledged: consuming");
                                    atomicInteger.incrementAndGet();
                                    consumeGiftPurchase(purchase, (TLRPC.InputStorePaymentPurpose) obj2, new y(atomicInteger2, atomicInteger, runnable, 0));
                                } else {
                                    StringBuilder sb = new StringBuilder("BillingController.onPurchasesUpdatedInternal: ");
                                    sb.append(purchase.a());
                                    sb.append(" purchase is purchased and not acknowledged: assigning (accountId=");
                                    final AccountInstance accountInstance3 = (AccountInstance) obj;
                                    sb.append(accountInstance3.getCurrentAccount());
                                    sb.append(") (purpose=");
                                    sb.append(obj2);
                                    sb.append(")");
                                    FileLog.d(sb.toString());
                                    this.requestingTokens.add(purchase.c());
                                    final TLRPC.TL_payments_assignPlayMarketTransaction tL_payments_assignPlayMarketTransaction = new TLRPC.TL_payments_assignPlayMarketTransaction();
                                    TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
                                    tL_payments_assignPlayMarketTransaction.receipt = tL_dataJSON;
                                    tL_dataJSON.data = purchase.a;
                                    tL_payments_assignPlayMarketTransaction.purpose = (TLRPC.InputStorePaymentPurpose) obj2;
                                    final org.telegram.ui.ActionBar.d2[] d2VarArr = new org.telegram.ui.ActionBar.d2[1];
                                    AndroidUtilities.runOnUIThread(new f0(d2VarArr, 1));
                                    atomicInteger.incrementAndGet();
                                    accountInstance3.getConnectionsManager().sendRequest(tL_payments_assignPlayMarketTransaction, new RequestDelegate() { // from class: org.telegram.messenger.x
                                        @Override // org.telegram.tgnet.RequestDelegate
                                        public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                                            BillingController.this.lambda$onPurchasesUpdatedInternal$10(d2VarArr, purchase, tL_payments_assignPlayMarketTransaction, accountInstance3, hVar2, atomicInteger2, atomicInteger, runnable, tLObject, tL_error);
                                        }
                                    }, tL_payments_assignPlayMarketTransaction.purpose instanceof TLRPC.TL_inputStorePaymentAuthCode ? 65608 : 65600);
                                }
                            }
                        }
                        FileLog.d("BillingController.onPurchasesUpdatedInternal: " + purchase.a() + " purchase is purchased, but failed to extract saved payload");
                    }
                }
                bVar = null;
                if (bVar != null) {
                }
                FileLog.d("BillingController.onPurchasesUpdatedInternal: " + purchase.a() + " purchase is purchased, but failed to extract saved payload");
            } else {
                StringBuilder sb2 = new StringBuilder("BillingController.onPurchasesUpdatedInternal: ");
                sb2.append(purchase.a());
                sb2.append(" purchase is (state=");
                sb2.append(jSONObject.optInt("purchaseState", 1) != 4 ? 1 : 2);
                sb2.append("), (isAcknowledged=");
                sb2.append(jSONObject.optBoolean("acknowledged", true));
                sb2.append(")");
                FileLog.d(sb2.toString());
            }
            hVar2 = hVar;
            i11 = 1;
        }
        if (atomicInteger.get() != 0 || runnable == null) {
            return;
        }
        runnable.run();
    }

    public void queryProductDetails(List<p2.p> list, ProductDetailsResponseListenerLegacy productDetailsResponseListenerLegacy) {
        if (!isReady()) {
            throw new IllegalStateException("Billing: Controller should be ready for this call!");
        }
        p2.a aVar = this.billingClient;
        oh.h4 h4Var = new oh.h4(7, false);
        if (list == null || list.isEmpty()) {
            throw new IllegalArgumentException("Product list cannot be empty.");
        }
        HashSet hashSet = new HashSet();
        for (p2.p pVar : list) {
            if (!"play_pass_subs".equals(pVar.b)) {
                hashSet.add(pVar.b);
            }
        }
        if (hashSet.size() > 1) {
            throw new IllegalArgumentException("All products should be of the same product type.");
        }
        r u10 = r.u(list);
        h4Var.b = u10;
        if (u10 == null) {
            throw new IllegalArgumentException("Product list must be set to a non empty list.");
        }
        aVar.c(new org.telegram.ui.web.e0(h4Var), new d0(productDetailsResponseListenerLegacy, 0));
    }

    public void queryPurchases(String str, p2.n nVar) {
        p2.a aVar = this.billingClient;
        if (str == null) {
            throw new IllegalArgumentException("Product type must be set");
        }
        p2.b bVar = (p2.b) aVar;
        bVar.getClass();
        if (p2.b.f(new p2.s(bVar, nVar, str), 30000L, new zy(bVar, nVar, false, 4), bVar.r(), bVar.e()) == null) {
            p2.h u10 = bVar.u();
            bVar.y(25, 9, u10);
            com.google.android.gms.internal.play_billing.p pVar = r.b;
            nVar.b(u10, com.google.android.gms.internal.play_billing.v.e);
        }
    }

    public void setOnCanceled(Runnable runnable) {
        this.onCanceled = runnable;
    }

    /* renamed from: startConnection, reason: merged with bridge method [inline-methods] */
    public void lambda$onBillingServiceDisconnected$13() {
        if (isReady()) {
            return;
        }
        try {
            lf.b.a(this.currencyExpMap);
            if (BuildVars.useInvoiceBilling()) {
                return;
            }
            this.billingClient.d(this);
        } catch (Exception e6) {
            FileLog.e(e6);
        }
    }

    public boolean startManageSubscription(Context context, String str) {
        try {
            context.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://play.google.com/store/account/subscriptions?sku=" + str + "&package=" + context.getPackageName())));
            return true;
        } catch (ActivityNotFoundException unused) {
            return false;
        }
    }

    public void whenSetuped(Runnable runnable) {
        this.setupListeners.add(runnable);
    }

    public String formatCurrency(long j10, String str, int i10) {
        return formatCurrency(j10, str, i10, false);
    }

    public void launchBillingFlow(final Activity activity, final AccountInstance accountInstance, final TLRPC.InputStorePaymentPurpose inputStorePaymentPurpose, final List<p2.d> list, final p2.e eVar, boolean z4) {
        String encodeToString;
        if (!isReady() || activity == null) {
            return;
        }
        if (((inputStorePaymentPurpose instanceof TLRPC.TL_inputStorePaymentGiftPremium) || (inputStorePaymentPurpose instanceof TLRPC.TL_inputStorePaymentStarsTopup) || (inputStorePaymentPurpose instanceof TLRPC.TL_inputStorePaymentStarsGift)) && !z4) {
            FileLog.d("BillingController.launchBillingFlow, checking consumables");
            queryPurchases("inapp", new p2.n() { // from class: org.telegram.messenger.a0
                @Override // p2.n
                public final void b(p2.h hVar, List list2) {
                    BillingController.this.lambda$launchBillingFlow$4(activity, accountInstance, inputStorePaymentPurpose, list, eVar, hVar, list2);
                }
            });
            return;
        }
        if (z4) {
            FileLog.d("BillingController.launchBillingFlow, consumables checked, launching flow...");
        }
        boolean isClientActivated = accountInstance.getUserConfig().isClientActivated();
        boolean z10 = false;
        if (isClientActivated) {
            encodeToString = Base64.encodeToString(String.valueOf(accountInstance.getUserConfig().getClientUserId()).getBytes(r8.d.c), 0);
        } else {
            encodeToString = Base64.encodeToString(("account-" + accountInstance.getCurrentAccount()).getBytes(r8.d.c), 0);
        }
        long nextLong = Utilities.random.nextLong();
        FileLog.d("BillingUtilities.savePurpose id=" + nextLong + " paymentPurpose=" + inputStorePaymentPurpose);
        SerializedData serializedData = new SerializedData(8);
        serializedData.writeInt64(nextLong);
        String bytesToHex = Utilities.bytesToHex(serializedData.toByteArray());
        serializedData.cleanup();
        FileLog.d("BillingUtilities.savePurpose id_hex=" + bytesToHex + " paymentPurpose=" + inputStorePaymentPurpose);
        lf.a aVar = new lf.a();
        aVar.b = nextLong;
        aVar.a = 1;
        aVar.c = inputStorePaymentPurpose;
        SerializedData serializedData2 = new SerializedData(aVar.getObjectSize());
        aVar.serializeToStream(serializedData2);
        String bytesToHex2 = Utilities.bytesToHex(serializedData2.toByteArray());
        serializedData2.cleanup();
        if (aVar.getObjectSize() > 28) {
            FileLog.d("BillingUtilities.savePurpose: sending short version, original size is " + aVar.getObjectSize() + " bytes");
            aVar.a = 0;
            aVar.c = null;
        }
        SerializedData serializedData3 = new SerializedData(aVar.getObjectSize());
        aVar.serializeToStream(serializedData3);
        String bytesToHex3 = Utilities.bytesToHex(serializedData3.toByteArray());
        serializedData3.cleanup();
        ApplicationLoader.applicationContext.getSharedPreferences("purchases", 0).edit().putString(bytesToHex, bytesToHex2).apply();
        FileLog.d("BillingUtilities.savePurpose: saved {" + bytesToHex2 + "} under " + bytesToHex);
        StringBuilder sb = new StringBuilder("BillingUtilities.savePurpose: but sending {");
        sb.append(bytesToHex3);
        sb.append("}");
        FileLog.d(sb.toString());
        b7.l0 l0Var = new b7.l0();
        l0Var.b = 0;
        l0Var.a = true;
        ArrayList arrayList = new ArrayList(list);
        if (eVar != null) {
            l0Var = new b7.l0();
            l0Var.c = eVar.a;
            l0Var.b = eVar.b;
        }
        p2.a aVar2 = this.billingClient;
        boolean isEmpty = arrayList.isEmpty();
        if (isEmpty) {
            throw new IllegalArgumentException("Details of the products must be provided.");
        }
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            if (((p2.d) obj) == null) {
                throw new IllegalArgumentException("ProductDetailsParams cannot be null.");
            }
        }
        p2.f fVar = new p2.f();
        if (!isEmpty && !((p2.d) arrayList.get(0)).a.b.optString("packageName").isEmpty()) {
            z10 = true;
        }
        fVar.a = z10;
        fVar.b = encodeToString;
        fVar.c = bytesToHex3;
        boolean z11 = true;
        if (TextUtils.isEmpty((String) l0Var.c) && TextUtils.isEmpty(null)) {
            z11 = false;
        }
        boolean isEmpty2 = TextUtils.isEmpty(null);
        if (z11 && !isEmpty2) {
            throw new IllegalArgumentException("Please provide Old SKU purchase information(token/id) or original external transaction id, not both.");
        }
        if (!l0Var.a && !z11 && isEmpty2) {
            throw new IllegalArgumentException("Old SKU purchase information(token/id) or original external transaction id must be provided.");
        }
        p2.e eVar2 = new p2.e();
        eVar2.a = (String) l0Var.c;
        eVar2.b = l0Var.b;
        fVar.d = eVar2;
        fVar.f = new ArrayList();
        fVar.e = r.u(arrayList);
        int i11 = aVar2.b(activity, fVar).a;
        if (i11 != 0) {
            StringBuilder sb2 = new StringBuilder("Billing: Launch Error: ");
            sb2.append(i11);
            sb2.append(", ");
            sb2.append(encodeToString);
            sb2.append(", ");
            org.telegram.ui.yh.v(bytesToHex3, sb2);
        }
    }

    public String formatCurrency(long j10, String str, int i10, boolean z4) {
        if (str != null && !str.isEmpty()) {
            if ("TON".equalsIgnoreCase(str)) {
                return "TON " + (j10 / 1.0E9d);
            }
            if ("XTR".equalsIgnoreCase(str)) {
                return l.d.l(j10, ',', new StringBuilder("XTR "));
            }
            Currency currency = Currency.getInstance(str);
            if (currency != null) {
                if (currencyInstance == null) {
                    currencyInstance = NumberFormat.getCurrencyInstance();
                }
                currencyInstance.setCurrency(currency);
                if (z4) {
                    currencyInstance.setMaximumFractionDigits(0);
                    currencyInstance.setMinimumFractionDigits(0);
                    return currencyInstance.format(Math.round(j10 / Math.pow(10.0d, i10)));
                }
                int defaultFractionDigits = currency.getDefaultFractionDigits();
                currencyInstance.setMinimumFractionDigits(defaultFractionDigits);
                currencyInstance.setMaximumFractionDigits(defaultFractionDigits);
                return currencyInstance.format(j10 / Math.pow(10.0d, i10));
            }
            return j10 + " " + str;
        }
        return String.valueOf(j10);
    }
}

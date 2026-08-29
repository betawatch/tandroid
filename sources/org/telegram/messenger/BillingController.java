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
import org.telegram.ui.fg0;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public class BillingController implements p2.n, p2.c {
    public static final p2.o PREMIUM_PRODUCT;
    public static p2.l PREMIUM_PRODUCT_DETAILS = null;
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

    /* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
    public interface ProductDetailsResponseListenerLegacy {
        void onProductDetailsResponse(p2.g gVar, List<p2.l> list);
    }

    static {
        d9.c cVar = new d9.c();
        cVar.c = "subs";
        cVar.b = PREMIUM_PRODUCT_ID;
        PREMIUM_PRODUCT = cVar.a();
    }

    private BillingController(Context context) {
        p2.a wVar;
        androidx.emoji2.text.f fVar = new androidx.emoji2.text.f(context);
        fVar.a = new f7.v(19);
        fVar.b = this;
        if (context == null) {
            throw new IllegalArgumentException("Please provide a valid Context.");
        }
        if (((BillingController) fVar.b) == null) {
            throw new IllegalArgumentException("Please provide a valid listener for purchases updates.");
        }
        if (((f7.v) fVar.a) == null) {
            throw new IllegalArgumentException("Pending purchases for one-time products must be supported.");
        }
        ((f7.v) fVar.a).getClass();
        if (((BillingController) fVar.b) != null) {
            f7.v vVar = (f7.v) fVar.a;
            BillingController billingController = (BillingController) fVar.b;
            wVar = fVar.a() ? new p2.w(vVar, context, billingController, fVar) : new p2.b(vVar, context, billingController, fVar);
        } else {
            f7.v vVar2 = (f7.v) fVar.a;
            wVar = fVar.a() ? new p2.w(vVar2, context, fVar) : new p2.b(vVar2, context, fVar);
        }
        this.billingClient = wVar;
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
    public static void lambda$consumeGiftPurchase$12(TLRPC.InputStorePaymentPurpose inputStorePaymentPurpose, Purchase purchase, Runnable runnable, p2.g gVar, String str) {
        StringBuilder sb2 = new StringBuilder("BillingController consumeGiftPurchase ");
        sb2.append(inputStorePaymentPurpose);
        sb2.append(" ");
        sb2.append(purchase.a());
        sb2.append(" ");
        sb2.append(purchase.c());
        sb2.append(" done: ");
        int i10 = gVar.a;
        sb2.append(i10 == 0 ? "OK" : Integer.valueOf(i10));
        sb2.append(" ");
        org.telegram.ui.th.v(gVar.c, sb2);
        if (runnable != null) {
            runnable.run();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$launchBillingFlow$1(Activity activity, AccountInstance accountInstance, TLRPC.InputStorePaymentPurpose inputStorePaymentPurpose, List list, p2.e eVar) {
        launchBillingFlow(activity, accountInstance, inputStorePaymentPurpose, list, eVar, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void lambda$launchBillingFlow$2(Purchase purchase, List list, String str, AtomicInteger atomicInteger, Runnable runnable, p2.g gVar, String str2) {
        if (gVar.a == 0) {
            FileLog.d("BillingController.launchBillingFlow, consumed " + purchase.c() + ": OK");
            list.add(str);
            if (atomicInteger.get() == list.size()) {
                runnable.run();
                return;
            }
            return;
        }
        FileLog.d("BillingController.launchBillingFlow, consumed " + purchase.c() + ": " + gVar.a + " " + gVar.c);
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
    public void lambda$launchBillingFlow$4(Activity activity, AccountInstance accountInstance, TLRPC.InputStorePaymentPurpose inputStorePaymentPurpose, List list, p2.e eVar, p2.g gVar, List list2) {
        if (gVar.a != 0) {
            StringBuilder sb2 = new StringBuilder("BillingController.launchBillingFlow, checked consumables: ");
            sb2.append(gVar.a);
            sb2.append(" ");
            org.telegram.ui.th.v(gVar.c, sb2);
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
                            g5.c cVar = new g5.c();
                            cVar.a = c3;
                            final b0 b0Var2 = b0Var;
                            b0Var = b0Var2;
                            aVar.a(cVar, new p2.h() { // from class: org.telegram.messenger.c0
                                @Override // p2.h
                                public final void a(p2.g gVar2, String str2) {
                                    BillingController.lambda$launchBillingFlow$2(Purchase.this, arrayList, str, atomicInteger, b0Var2, gVar2, str2);
                                }
                            });
                        }
                    }
                }
            } else {
                atomicInteger.incrementAndGet();
                l3.a a2 = p2.g.a();
                a2.a = 0;
                onPurchasesUpdatedInternal(a2.a(), Collections.singletonList(purchase), new f0(arrayList, (Object) atomicInteger, (Object) b0Var, 7));
            }
        }
        if (atomicInteger.get() == 0) {
            b0Var.run();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lambda$onPurchasesUpdatedInternal$10(org.telegram.ui.ActionBar.c2[] c2VarArr, Purchase purchase, TLRPC.TL_payments_assignPlayMarketTransaction tL_payments_assignPlayMarketTransaction, AccountInstance accountInstance, p2.g gVar, AtomicInteger atomicInteger, AtomicInteger atomicInteger2, Runnable runnable, TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new e0(c2VarArr, 0));
        this.requestingTokens.remove(purchase.c());
        int i10 = 1;
        if (!(tLObject instanceof TLRPC.Updates)) {
            StringBuilder sb2 = new StringBuilder("BillingController.onPurchasesUpdatedInternal: ");
            sb2.append(purchase.a());
            sb2.append(" purchase is purchased and failed to assign: ");
            org.telegram.ui.th.v(tL_error == null ? null : tL_error.text, sb2);
            Runnable runnable2 = this.onCanceled;
            if (runnable2 != null) {
                runnable2.run();
                this.onCanceled = null;
            }
            int i11 = 2;
            if (tL_error != null) {
                NotificationCenter.getGlobalInstance().postNotificationNameOnUIThread(NotificationCenter.billingConfirmPurchaseError, tL_payments_assignPlayMarketTransaction, tL_error);
            }
            AndroidUtilities.runOnUIThread(new y(atomicInteger, atomicInteger2, runnable, i11));
            return;
        }
        FileLog.d("BillingController.onPurchasesUpdatedInternal: " + purchase.a() + " purchase is purchased and now assigned");
        int i12 = 8;
        if (tL_payments_assignPlayMarketTransaction.purpose instanceof TLRPC.TL_inputStorePaymentAuthCode) {
            ArrayList findUpdatesAndRemove = MessagesController.findUpdatesAndRemove((TLRPC.Updates) tLObject, TL_update.TL_updateSentPhoneCode.class);
            int size = findUpdatesAndRemove.size();
            int i13 = 0;
            while (i13 < size) {
                Object obj = findUpdatesAndRemove.get(i13);
                i13++;
                AndroidUtilities.runOnUIThread(new f0(accountInstance, tL_payments_assignPlayMarketTransaction, (TL_update.TL_updateSentPhoneCode) obj, i12));
            }
        }
        accountInstance.getMessagesController().processUpdates((TLRPC.Updates) tLObject, false);
        ArrayList b10 = purchase.b();
        int size2 = b10.size();
        int i14 = 0;
        while (i14 < size2) {
            Object obj2 = b10.get(i14);
            i14++;
            q0.a remove = this.resultListeners.remove((String) obj2);
            if (remove != null) {
                remove.accept(gVar);
            }
        }
        consumeGiftPurchase(purchase, tL_payments_assignPlayMarketTransaction.purpose, new y(atomicInteger, atomicInteger2, runnable, i10));
        JSONObject jSONObject = purchase.c;
        String optString = jSONObject.optString("obfuscatedAccountId");
        String optString2 = jSONObject.optString("obfuscatedProfileId");
        String str = ((optString == null && optString2 == null) ? null : new d9.c(i10, optString, optString2)).c;
        try {
            FileLog.d("BillingUtilities.clearPurpose: got {" + str + "}");
            SerializedData serializedData = new SerializedData(Utilities.hexToBytes(str));
            jf.a a2 = jf.a.a(serializedData, serializedData.readInt32(true));
            SerializedData serializedData2 = new SerializedData(8);
            serializedData2.writeInt64(a2.b);
            String bytesToHex = Utilities.bytesToHex(serializedData2.toByteArray());
            serializedData2.cleanup();
            FileLog.d("BillingUtilities.clearPurpose: id_hex = " + bytesToHex);
            ApplicationLoader.applicationContext.getSharedPreferences("purchases", 0).edit().remove(bytesToHex).apply();
        } catch (Exception e10) {
            FileLog.e(e10);
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
    public static void lambda$onPurchasesUpdatedInternal$5(org.telegram.ui.ActionBar.c2[] c2VarArr) {
        org.telegram.ui.ActionBar.c2 c2Var = new org.telegram.ui.ActionBar.c2(ApplicationLoader.applicationContext, 3, null);
        c2VarArr[0] = c2Var;
        c2Var.q(500L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$onPurchasesUpdatedInternal$6(org.telegram.ui.ActionBar.c2[] c2VarArr) {
        org.telegram.ui.ActionBar.c2 c2Var = c2VarArr[0];
        if (c2Var != null) {
            c2Var.dismiss();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$onPurchasesUpdatedInternal$7(AccountInstance accountInstance, TLRPC.TL_payments_assignPlayMarketTransaction tL_payments_assignPlayMarketTransaction, TL_update.TL_updateSentPhoneCode tL_updateSentPhoneCode) {
        fg0 fg0Var = (fg0) LaunchActivity.N();
        if (fg0Var == null) {
            fg0Var = new fg0(accountInstance.getCurrentAccount());
            org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
            if (U != null) {
                U.presentFragment(fg0Var);
            }
        }
        fg0Var.q1(((TLRPC.TL_inputStorePaymentAuthCode) tL_payments_assignPlayMarketTransaction.purpose).phone_number, tL_updateSentPhoneCode.sent_code);
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
            queryProductDetails(Collections.singletonList(PREMIUM_PRODUCT), new d0(this));
        } catch (Exception e10) {
            FileLog.e(e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void lambda$queryProductDetails$0(ProductDetailsResponseListenerLegacy productDetailsResponseListenerLegacy, p2.g gVar, p2.p pVar) {
        productDetailsResponseListenerLegacy.onProductDetailsResponse(gVar, pVar.a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onQueriedPremiumProductDetails(p2.g gVar, List<p2.l> list) {
        FileLog.d("Billing: Query product details finished " + gVar + ", " + list);
        if (gVar.a != 0) {
            switchToInvoice();
            int i10 = this.triesLeft - 1;
            this.triesLeft = i10;
            if (i10 > 0) {
                AndroidUtilities.runOnUIThread(new z(this, 0), i10 == 2 ? 1000L : 10000L);
                return;
            }
            return;
        }
        for (p2.l lVar : list) {
            if (lVar.c.equals(PREMIUM_PRODUCT_ID)) {
                PREMIUM_PRODUCT_DETAILS = lVar;
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
            g5.c cVar = new g5.c();
            cVar.a = c3;
            aVar.a(cVar, new f(inputStorePaymentPurpose, purchase, runnable));
        }
    }

    public String formatCurrency(long j10, String str) {
        return formatCurrency(j10, str, getCurrencyExp(str));
    }

    public int getCurrencyExp(String str) {
        jf.b.a(this.currencyExpMap);
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
    public void onBillingSetupFinished(p2.g gVar) {
        FileLog.d("Billing: Setup finished with result " + gVar);
        if (gVar.a != 0) {
            if (this.isDisconnected) {
                return;
            }
            switchToInvoice();
            return;
        }
        this.isDisconnected = false;
        this.triesLeft = 3;
        try {
            queryProductDetails(Collections.singletonList(PREMIUM_PRODUCT), new d0(this));
        } catch (Exception e10) {
            FileLog.e(e10);
        }
        queryPurchases("inapp", new d0(this));
        queryPurchases("subs", new d0(this));
        if (this.setupListeners.isEmpty()) {
            return;
        }
        for (int i10 = 0; i10 < this.setupListeners.size(); i10++) {
            AndroidUtilities.runOnUIThread(this.setupListeners.get(i10));
        }
        this.setupListeners.clear();
    }

    @Override // p2.n
    public void onPurchasesUpdated(p2.g gVar, List<Purchase> list) {
        onPurchasesUpdatedInternal(gVar, list, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x018b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onPurchasesUpdatedInternal(p2.g gVar, List<Purchase> list, final Runnable runnable) {
        TLRPC.InputStorePaymentPurpose inputStorePaymentPurpose;
        AccountInstance accountInstance;
        q0.b bVar;
        final p2.g gVar2 = gVar;
        FileLog.d("Billing: Purchases updated: " + gVar2 + ", " + list);
        int i10 = gVar2.a;
        int i11 = 1;
        if (i10 != 0) {
            if (i10 == 1) {
                TLRPC.TL_help_saveAppLog tL_help_saveAppLog = new TLRPC.TL_help_saveAppLog();
                TLRPC.TL_inputAppEvent tL_inputAppEvent = new TLRPC.TL_inputAppEvent();
                tL_inputAppEvent.time = ConnectionsManager.getInstance(UserConfig.selectedAccount).getCurrentTime();
                tL_inputAppEvent.type = "premium.promo_screen_fail";
                tL_inputAppEvent.data = new TLRPC.TL_jsonNull();
                tL_help_saveAppLog.events.add(tL_inputAppEvent);
                ConnectionsManager.getInstance(UserConfig.selectedAccount).sendRequest(tL_help_saveAppLog, new lh.o5(5));
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
                d9.c cVar = (optString == null && optString2 == null) ? null : new d9.c(1, optString, optString2);
                if (cVar == null) {
                    FileLog.d("Billing: Extract payload. No AccountIdentifiers");
                } else {
                    String str = cVar.b;
                    String str2 = cVar.c;
                    if (str == null || str.isEmpty() || str2 == null || str2.isEmpty()) {
                        FileLog.d("Billing: Extract payload. Empty AccountIdentifiers");
                    } else {
                        try {
                            inputStorePaymentPurpose = jf.b.b(str2);
                        } catch (Exception e10) {
                            FileLog.e("Billing: Extract payload, failed to get purpose", e10);
                            inputStorePaymentPurpose = null;
                        }
                        String str3 = new String(Base64.decode(str, 0), p8.d.c);
                        FileLog.d("Billing: Extract payload. obfuscatedAccountIdString=".concat(str3));
                        if (str3.startsWith("account-")) {
                            try {
                                accountInstance = AccountInstance.getInstance(Integer.parseInt(str3.substring(8)));
                            } catch (Exception e11) {
                                FileLog.e("Billing: Extract Payload", e11);
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
                                    StringBuilder sb2 = new StringBuilder("BillingController.onPurchasesUpdatedInternal: ");
                                    sb2.append(purchase.a());
                                    sb2.append(" purchase is purchased and not acknowledged: assigning (accountId=");
                                    final AccountInstance accountInstance3 = (AccountInstance) obj;
                                    sb2.append(accountInstance3.getCurrentAccount());
                                    sb2.append(") (purpose=");
                                    sb2.append(obj2);
                                    sb2.append(")");
                                    FileLog.d(sb2.toString());
                                    this.requestingTokens.add(purchase.c());
                                    final TLRPC.TL_payments_assignPlayMarketTransaction tL_payments_assignPlayMarketTransaction = new TLRPC.TL_payments_assignPlayMarketTransaction();
                                    TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
                                    tL_payments_assignPlayMarketTransaction.receipt = tL_dataJSON;
                                    tL_dataJSON.data = purchase.a;
                                    tL_payments_assignPlayMarketTransaction.purpose = (TLRPC.InputStorePaymentPurpose) obj2;
                                    final org.telegram.ui.ActionBar.c2[] c2VarArr = new org.telegram.ui.ActionBar.c2[1];
                                    AndroidUtilities.runOnUIThread(new e0(c2VarArr, 1));
                                    atomicInteger.incrementAndGet();
                                    accountInstance3.getConnectionsManager().sendRequest(tL_payments_assignPlayMarketTransaction, new RequestDelegate() { // from class: org.telegram.messenger.x
                                        @Override // org.telegram.tgnet.RequestDelegate
                                        public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                                            BillingController.this.lambda$onPurchasesUpdatedInternal$10(c2VarArr, purchase, tL_payments_assignPlayMarketTransaction, accountInstance3, gVar2, atomicInteger2, atomicInteger, runnable, tLObject, tL_error);
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
                StringBuilder sb3 = new StringBuilder("BillingController.onPurchasesUpdatedInternal: ");
                sb3.append(purchase.a());
                sb3.append(" purchase is (state=");
                sb3.append(jSONObject.optInt("purchaseState", 1) != 4 ? 1 : 2);
                sb3.append("), (isAcknowledged=");
                sb3.append(jSONObject.optBoolean("acknowledged", true));
                sb3.append(")");
                FileLog.d(sb3.toString());
            }
            gVar2 = gVar;
            i11 = 1;
        }
        if (atomicInteger.get() != 0 || runnable == null) {
            return;
        }
        runnable.run();
    }

    public void queryProductDetails(List<p2.o> list, ProductDetailsResponseListenerLegacy productDetailsResponseListenerLegacy) {
        if (!isReady()) {
            throw new IllegalStateException("Billing: Controller should be ready for this call!");
        }
        p2.a aVar = this.billingClient;
        org.telegram.ui.Components.n nVar = new org.telegram.ui.Components.n(5);
        if (list == null || list.isEmpty()) {
            throw new IllegalArgumentException("Product list cannot be empty.");
        }
        HashSet hashSet = new HashSet();
        for (p2.o oVar : list) {
            if (!"play_pass_subs".equals(oVar.b)) {
                hashSet.add(oVar.b);
            }
        }
        if (hashSet.size() > 1) {
            throw new IllegalArgumentException("All products should be of the same product type.");
        }
        r u10 = r.u(list);
        nVar.b = u10;
        if (u10 == null) {
            throw new IllegalArgumentException("Product list must be set to a non empty list.");
        }
        aVar.c(new nh.d6(nVar), new d(productDetailsResponseListenerLegacy, 1));
    }

    public void queryPurchases(String str, p2.m mVar) {
        p2.a aVar = this.billingClient;
        if (str == null) {
            throw new IllegalArgumentException("Product type must be set");
        }
        p2.b bVar = (p2.b) aVar;
        bVar.getClass();
        if (p2.b.f(new p2.r(bVar, mVar, str), 30000L, new od.i(bVar, mVar, false, 7), bVar.r(), bVar.e()) == null) {
            p2.g u10 = bVar.u();
            bVar.y(25, 9, u10);
            com.google.android.gms.internal.play_billing.p pVar = r.b;
            mVar.b(u10, com.google.android.gms.internal.play_billing.v.e);
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
            jf.b.a(this.currencyExpMap);
            if (BuildVars.useInvoiceBilling()) {
                return;
            }
            this.billingClient.d(this);
        } catch (Exception e10) {
            FileLog.e(e10);
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

    public void launchBillingFlow(final Activity activity, final AccountInstance accountInstance, final TLRPC.InputStorePaymentPurpose inputStorePaymentPurpose, final List<p2.d> list, final p2.e eVar, boolean z10) {
        String encodeToString;
        if (!isReady() || activity == null) {
            return;
        }
        if (((inputStorePaymentPurpose instanceof TLRPC.TL_inputStorePaymentGiftPremium) || (inputStorePaymentPurpose instanceof TLRPC.TL_inputStorePaymentStarsTopup) || (inputStorePaymentPurpose instanceof TLRPC.TL_inputStorePaymentStarsGift)) && !z10) {
            FileLog.d("BillingController.launchBillingFlow, checking consumables");
            queryPurchases("inapp", new p2.m() { // from class: org.telegram.messenger.a0
                @Override // p2.m
                public final void b(p2.g gVar, List list2) {
                    BillingController.this.lambda$launchBillingFlow$4(activity, accountInstance, inputStorePaymentPurpose, list, eVar, gVar, list2);
                }
            });
            return;
        }
        if (z10) {
            FileLog.d("BillingController.launchBillingFlow, consumables checked, launching flow...");
        }
        boolean isClientActivated = accountInstance.getUserConfig().isClientActivated();
        boolean z11 = false;
        if (isClientActivated) {
            encodeToString = Base64.encodeToString(String.valueOf(accountInstance.getUserConfig().getClientUserId()).getBytes(p8.d.c), 0);
        } else {
            encodeToString = Base64.encodeToString(("account-" + accountInstance.getCurrentAccount()).getBytes(p8.d.c), 0);
        }
        long nextLong = Utilities.random.nextLong();
        FileLog.d("BillingUtilities.savePurpose id=" + nextLong + " paymentPurpose=" + inputStorePaymentPurpose);
        SerializedData serializedData = new SerializedData(8);
        serializedData.writeInt64(nextLong);
        String bytesToHex = Utilities.bytesToHex(serializedData.toByteArray());
        serializedData.cleanup();
        FileLog.d("BillingUtilities.savePurpose id_hex=" + bytesToHex + " paymentPurpose=" + inputStorePaymentPurpose);
        jf.a aVar = new jf.a();
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
        StringBuilder sb2 = new StringBuilder("BillingUtilities.savePurpose: but sending {");
        sb2.append(bytesToHex3);
        sb2.append("}");
        FileLog.d(sb2.toString());
        m.a aVar2 = new m.a();
        aVar2.b = 0;
        aVar2.a = true;
        ArrayList arrayList = new ArrayList(list);
        if (eVar != null) {
            aVar2 = new m.a();
            aVar2.c = eVar.a;
            aVar2.b = eVar.b;
        }
        p2.a aVar3 = this.billingClient;
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
            z11 = true;
        }
        fVar.a = z11;
        fVar.b = encodeToString;
        fVar.c = bytesToHex3;
        boolean z12 = true;
        if (TextUtils.isEmpty((String) aVar2.c) && TextUtils.isEmpty(null)) {
            z12 = false;
        }
        boolean isEmpty2 = TextUtils.isEmpty(null);
        if (z12 && !isEmpty2) {
            throw new IllegalArgumentException("Please provide Old SKU purchase information(token/id) or original external transaction id, not both.");
        }
        if (!aVar2.a && !z12 && isEmpty2) {
            throw new IllegalArgumentException("Old SKU purchase information(token/id) or original external transaction id must be provided.");
        }
        p2.e eVar2 = new p2.e();
        eVar2.a = (String) aVar2.c;
        eVar2.b = aVar2.b;
        fVar.d = eVar2;
        fVar.f = new ArrayList();
        fVar.e = r.u(arrayList);
        int i11 = aVar3.b(activity, fVar).a;
        if (i11 != 0) {
            StringBuilder sb3 = new StringBuilder("Billing: Launch Error: ");
            sb3.append(i11);
            sb3.append(", ");
            sb3.append(encodeToString);
            sb3.append(", ");
            org.telegram.ui.th.v(bytesToHex3, sb3);
        }
    }

    public String formatCurrency(long j10, String str, int i10, boolean z10) {
        if (str != null && !str.isEmpty()) {
            if ("TON".equalsIgnoreCase(str)) {
                return "TON " + (j10 / 1.0E9d);
            }
            if ("XTR".equalsIgnoreCase(str)) {
                return j7.l1.m(j10, ',', new StringBuilder("XTR "));
            }
            Currency currency = Currency.getInstance(str);
            if (currency != null) {
                if (currencyInstance == null) {
                    currencyInstance = NumberFormat.getCurrencyInstance();
                }
                currencyInstance.setCurrency(currency);
                if (z10) {
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

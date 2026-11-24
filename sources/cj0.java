// default package

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.util.Base64;
import com.android.billingclient.api.Purchase;
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
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONObject;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.a;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_update;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class cj0 implements vi0 {
    public static final zy8 k;
    public static ln8 l;
    public static cj0 m;
    public static boolean n;
    public static NumberFormat o;
    public final ui0 d;
    public String e;
    public String f;
    public boolean g;
    public Runnable h;
    public final HashMap a = new HashMap();
    public final Set b = Collections.newSetFromMap(new ConcurrentHashMap());
    public final HashMap c = new HashMap();
    public final ArrayList i = new ArrayList();
    public int j = 0;

    static {
        i5 i5Var = new i5();
        i5Var.b = "subs";
        i5Var.a = "telegram_premium";
        k = i5Var.a();
    }

    public cj0(Context context) {
        ui0 nkdVar;
        sk skVar = new sk(context);
        skVar.a = new f8e();
        skVar.c = this;
        if (context == null) {
            u36.j("Please provide a valid Context.");
            throw null;
        }
        if (((cj0) skVar.c) == null) {
            u36.j("Please provide a valid listener for purchases updates.");
            throw null;
        }
        if (((f8e) skVar.a) == null) {
            u36.j("Pending purchases for one-time products must be supported.");
            throw null;
        }
        ((f8e) skVar.a).getClass();
        cj0 cj0Var = (cj0) skVar.c;
        f8e f8eVar = (f8e) skVar.a;
        if (cj0Var != null) {
            cj0 cj0Var2 = (cj0) skVar.c;
            nkdVar = skVar.a() ? new nkd(f8eVar, context, cj0Var2, skVar) : new ui0(f8eVar, context, cj0Var2, skVar);
        } else {
            nkdVar = skVar.a() ? new nkd(f8eVar, context, skVar) : new ui0(f8eVar, context, skVar);
        }
        this.d = nkdVar;
    }

    public static String f(String str, int i, long j, boolean z) {
        if (str == null || str.isEmpty()) {
            return String.valueOf(j);
        }
        if ("TON".equalsIgnoreCase(str)) {
            return "TON " + (j / 1.0E9d);
        }
        if ("XTR".equalsIgnoreCase(str)) {
            return "XTR ".concat(jb6.E(j, ','));
        }
        Currency currency = Currency.getInstance(str);
        if (currency == null) {
            return j + " " + str;
        }
        NumberFormat numberFormat = o;
        if (numberFormat == null) {
            numberFormat = NumberFormat.getCurrencyInstance();
            o = numberFormat;
        }
        numberFormat.setCurrency(currency);
        if (z) {
            o.setMaximumFractionDigits(0);
            o.setMinimumFractionDigits(0);
            return o.format(Math.round(j / Math.pow(10.0d, i)));
        }
        int defaultFractionDigits = currency.getDefaultFractionDigits();
        o.setMinimumFractionDigits(defaultFractionDigits);
        o.setMaximumFractionDigits(defaultFractionDigits);
        return o.format(j / Math.pow(10.0d, i));
    }

    public static cj0 h() {
        cj0 cj0Var = m;
        if (cj0Var != null) {
            return cj0Var;
        }
        cj0 cj0Var2 = new cj0(a.b);
        m = cj0Var2;
        return cj0Var2;
    }

    public static String i(int i) {
        if (i == 12) {
            return "NETWORK_ERROR";
        }
        switch (i) {
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

    public static void r() {
        if (n) {
            return;
        }
        n = true;
        nm7.e().m(nm7.n5, new Object[0]);
    }

    @Override // vi0
    public final void a(fj0 fj0Var) {
        fc4.b("Billing: Setup finished with result " + fj0Var);
        if (fj0Var.a != 0) {
            if (this.g) {
                return;
            }
            r();
            return;
        }
        this.g = false;
        this.j = 3;
        try {
            o(Collections.singletonList(k), new yi0(this, (byte) 1));
        } catch (Exception e) {
            fc4.g(e, true);
        }
        byte b = 2;
        p("inapp", new yi0(this, b));
        p("subs", new yi0(this, b));
        ArrayList arrayList = this.i;
        if (arrayList.isEmpty()) {
            return;
        }
        for (int i = 0; i < arrayList.size(); i++) {
            gm.c3((Runnable) arrayList.get(i));
        }
        arrayList.clear();
    }

    @Override // vi0
    public final void b() {
        fc4.b("Billing: Service disconnected");
        int i = this.g ? 15000 : 5000;
        this.g = true;
        gm.d3(new xi0(this, (byte) 1), i);
    }

    public final void c(String str, gu2 gu2Var) {
        this.a.put(str, gu2Var);
    }

    public final void d(Purchase purchase, TLRPC.InputStorePaymentPurpose inputStorePaymentPurpose, Runnable runnable) {
        if ((inputStorePaymentPurpose instanceof TLRPC.TL_inputStorePaymentGiftPremium) || (inputStorePaymentPurpose instanceof TLRPC.TL_inputStorePaymentPremiumGiftCode) || (inputStorePaymentPurpose instanceof TLRPC.TL_inputStorePaymentStarsTopup) || (inputStorePaymentPurpose instanceof TLRPC.TL_inputStorePaymentStarsGift) || (inputStorePaymentPurpose instanceof TLRPC.TL_inputStorePaymentPremiumGiveaway) || (inputStorePaymentPurpose instanceof TLRPC.TL_inputStorePaymentStarsGiveaway) || (inputStorePaymentPurpose instanceof TLRPC.TL_inputStorePaymentAuthCode)) {
            fc4.b("BillingController consumeGiftPurchase " + inputStorePaymentPurpose + " " + purchase.a() + " " + purchase.b());
            String b = purchase.b();
            if (b == null) {
                u36.j("Purchase token must be set");
                return;
            }
            du2 du2Var = new du2();
            du2Var.b = b;
            this.d.a(du2Var, new jf((Object) inputStorePaymentPurpose, (Object) purchase, (Object) runnable, (byte) 4));
        }
    }

    public final String e(long j, String str) {
        return f(str, g(str), j, false);
    }

    public final int g(String str) {
        HashMap hashMap = this.c;
        hj0.a(hashMap);
        return ((Integer) Map.-EL.getOrDefault(hashMap, str, 0)).intValue();
    }

    public final boolean j() {
        ui0 ui0Var = this.d;
        ui0Var.getClass();
        return ui0Var.o();
    }

    public final void k(Activity activity, j5 j5Var, TLRPC.InputStorePaymentPurpose inputStorePaymentPurpose, List list) {
        l(activity, j5Var, inputStorePaymentPurpose, list, null, false);
    }

    public final void l(Activity activity, j5 j5Var, TLRPC.InputStorePaymentPurpose inputStorePaymentPurpose, List list, ohd ohdVar, boolean z) {
        if (!j() || activity == null) {
            return;
        }
        if (((inputStorePaymentPurpose instanceof TLRPC.TL_inputStorePaymentGiftPremium) || (inputStorePaymentPurpose instanceof TLRPC.TL_inputStorePaymentStarsTopup) || (inputStorePaymentPurpose instanceof TLRPC.TL_inputStorePaymentStarsGift)) && !z) {
            fc4.b("BillingController.launchBillingFlow, checking consumables");
            p("inapp", new ze(this, activity, j5Var, inputStorePaymentPurpose, list, ohdVar));
            return;
        }
        if (z) {
            fc4.b("BillingController.launchBillingFlow, consumables checked, launching flow...");
        }
        boolean o2 = z8c.h(j5Var.a).o();
        int i = j5Var.a;
        boolean z2 = false;
        String encodeToString = o2 ? Base64.encodeToString(String.valueOf(z8c.h(i).e()).getBytes(kl1.a), 0) : Base64.encodeToString(hg9.j(i, "account-").getBytes(kl1.a), 0);
        long nextLong = Utilities.b.nextLong();
        fc4.b("BillingUtilities.savePurpose id=" + nextLong + " paymentPurpose=" + inputStorePaymentPurpose);
        SerializedData serializedData = new SerializedData(8);
        serializedData.writeInt64(nextLong);
        String f = Utilities.f(serializedData.toByteArray());
        serializedData.cleanup();
        fc4.b("BillingUtilities.savePurpose id_hex=" + f + " paymentPurpose=" + inputStorePaymentPurpose);
        gj0 gj0Var = new gj0();
        gj0Var.b = nextLong;
        gj0Var.a = 1;
        gj0Var.c = inputStorePaymentPurpose;
        SerializedData serializedData2 = new SerializedData(gj0Var.getObjectSize());
        gj0Var.serializeToStream(serializedData2);
        String f2 = Utilities.f(serializedData2.toByteArray());
        serializedData2.cleanup();
        ohd ohdVar2 = null;
        if (gj0Var.getObjectSize() > 28) {
            fc4.b("BillingUtilities.savePurpose: sending short version, original size is " + gj0Var.getObjectSize() + " bytes");
            gj0Var.a = 0;
            gj0Var.c = null;
        }
        SerializedData serializedData3 = new SerializedData(gj0Var.getObjectSize());
        gj0Var.serializeToStream(serializedData3);
        String f3 = Utilities.f(serializedData3.toByteArray());
        serializedData3.cleanup();
        a.b.getSharedPreferences("purchases", 0).edit().putString(f, f2).apply();
        fc4.b("BillingUtilities.savePurpose: saved {" + f2 + "} under " + f);
        StringBuilder sb = new StringBuilder("BillingUtilities.savePurpose: but sending {");
        sb.append(f3);
        sb.append("}");
        fc4.b(sb.toString());
        bc3 bc3Var = new bc3();
        bc3Var.b = (byte) 0;
        bc3Var.a = true;
        ArrayList arrayList = new ArrayList(list);
        if (ohdVar != null) {
            bc3Var = new bc3();
            bc3Var.c = (String) ohdVar.b;
            bc3Var.b = ohdVar.a;
        }
        ui0 ui0Var = this.d;
        boolean isEmpty = arrayList.isEmpty();
        if (isEmpty) {
            u36.j("Details of the products must be provided.");
            return;
        }
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            if (((dj0) obj) == null) {
                u36.j("ProductDetailsParams cannot be null.");
                return;
            }
        }
        ej0 ej0Var = new ej0();
        if (!isEmpty && !((dj0) arrayList.get(0)).a.b.optString("packageName").isEmpty()) {
            z2 = true;
        }
        ej0Var.b = z2;
        ej0Var.a = encodeToString;
        ej0Var.c = f3;
        boolean isEmpty2 = TextUtils.isEmpty((String) bc3Var.c);
        if (bc3Var.a || !isEmpty2) {
            ohdVar2 = new ohd();
            ohdVar2.b = (String) bc3Var.c;
            ohdVar2.a = bc3Var.b;
        } else {
            u36.j("Old SKU purchase information(token/id) or original external transaction id must be provided.");
        }
        ej0Var.d = ohdVar2;
        ej0Var.f = new ArrayList();
        ej0Var.e = fhd.p(arrayList);
        int i3 = ui0Var.b(activity, ej0Var).a;
        if (i3 != 0) {
            StringBuilder sb2 = new StringBuilder("Billing: Launch Error: ");
            sb2.append(i3);
            sb2.append(", ");
            sb2.append(encodeToString);
            sb2.append(", ");
            hg9.r(f3, sb2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x017f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m(fj0 fj0Var, List list, final op6 op6Var) {
        byte b;
        int i;
        cj0 cj0Var;
        TLRPC.InputStorePaymentPurpose inputStorePaymentPurpose;
        j5 a;
        mw7 mw7Var;
        j5 j5Var;
        cj0 cj0Var2 = this;
        final fj0 fj0Var2 = fj0Var;
        fc4.b("Billing: Purchases updated: " + fj0Var2 + ", " + list);
        int i2 = fj0Var2.a;
        byte b2 = 0;
        int i3 = 1;
        if (i2 != 0) {
            if (i2 == 1) {
                TLRPC.TL_help_saveAppLog tL_help_saveAppLog = new TLRPC.TL_help_saveAppLog();
                TLRPC.TL_inputAppEvent tL_inputAppEvent = new TLRPC.TL_inputAppEvent();
                tL_inputAppEvent.time = ConnectionsManager.getInstance(z8c.t0).getCurrentTime();
                tL_inputAppEvent.type = "premium.promo_screen_fail";
                tL_inputAppEvent.data = new TLRPC.TL_jsonNull();
                tL_help_saveAppLog.events.add(tL_inputAppEvent);
                ConnectionsManager.getInstance(z8c.t0).sendRequest(tL_help_saveAppLog, new nf2(b2));
            }
            Runnable runnable = cj0Var2.h;
            if (runnable != null) {
                runnable.run();
                cj0Var2.h = null;
            }
            if (op6Var != null) {
                op6Var.run();
                return;
            }
            return;
        }
        if (list == null || list.isEmpty()) {
            if (op6Var != null) {
                op6Var.run();
                return;
            }
            return;
        }
        final AtomicInteger atomicInteger = new AtomicInteger(0);
        final AtomicInteger atomicInteger2 = new AtomicInteger(0);
        cj0Var2.e = null;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            final Purchase purchase = (Purchase) it.next();
            ArrayList c = purchase.c();
            JSONObject jSONObject = purchase.c;
            if (c.contains("telegram_premium")) {
                cj0Var2.e = purchase.a();
                cj0Var2.f = purchase.b();
            }
            String b3 = purchase.b();
            Set set = cj0Var2.b;
            if (set.contains(b3)) {
                b = b2;
                i = i3;
                cj0Var = cj0Var2;
                fc4.b("BillingController.onPurchasesUpdatedInternal: " + purchase.a() + " purchase is already requesting...");
            } else if (jSONObject.optInt("purchaseState", i3) != 4) {
                String optString = jSONObject.optString("obfuscatedAccountId");
                String optString2 = jSONObject.optString("obfuscatedProfileId");
                i5 i5Var = (optString == null && optString2 == null) ? null : new i5(optString, optString2);
                if (i5Var == null) {
                    fc4.b("Billing: Extract payload. No AccountIdentifiers");
                } else {
                    String str = i5Var.a;
                    String str2 = i5Var.b;
                    if (str == null || str.isEmpty() || str2 == null || str2.isEmpty()) {
                        fc4.b("Billing: Extract payload. Empty AccountIdentifiers");
                    } else {
                        try {
                            inputStorePaymentPurpose = hj0.b(str2);
                        } catch (Exception e) {
                            fc4.e("Billing: Extract payload, failed to get purpose", e);
                            inputStorePaymentPurpose = null;
                        }
                        String str3 = new String(Base64.decode(str, b2), kl1.a);
                        fc4.b("Billing: Extract payload. obfuscatedAccountIdString=".concat(str3));
                        if (str3.startsWith("account-")) {
                            try {
                                a = j5.a(Integer.parseInt(str3.substring(8)));
                            } catch (Exception e2) {
                                fc4.e("Billing: Extract Payload", e2);
                            }
                        } else {
                            long parseLong = Long.parseLong(str3);
                            int i4 = 0;
                            while (true) {
                                if (i4 >= 4) {
                                    j5Var = null;
                                    break;
                                }
                                j5Var = j5.a(i4);
                                if (z8c.h(j5Var.a).e() == parseLong) {
                                    break;
                                } else {
                                    i4++;
                                }
                            }
                            if (j5Var == null) {
                                fc4.b("Billing: Extract payload. AccountInstance not found, accountId=" + parseLong);
                            } else {
                                a = j5Var;
                            }
                        }
                        mw7Var = new mw7(a, inputStorePaymentPurpose);
                        if (mw7Var != null) {
                            Object obj = mw7Var.a;
                            Object obj2 = mw7Var.b;
                            if (obj != null && obj2 != null) {
                                if (jSONObject.optBoolean("acknowledged", true)) {
                                    cj0Var = this;
                                    fc4.b("BillingController.onPurchasesUpdatedInternal: " + purchase.a() + " purchase is purchased and acknowledged: consuming");
                                    atomicInteger.incrementAndGet();
                                    b = 0;
                                    cj0Var.d(purchase, (TLRPC.InputStorePaymentPurpose) obj2, new aj0(atomicInteger2, atomicInteger, op6Var, b));
                                } else {
                                    StringBuilder sb = new StringBuilder("BillingController.onPurchasesUpdatedInternal: ");
                                    sb.append(purchase.a());
                                    sb.append(" purchase is purchased and not acknowledged: assigning (accountId=");
                                    final j5 j5Var2 = (j5) obj;
                                    int i5 = j5Var2.a;
                                    sb.append(i5);
                                    sb.append(") (purpose=");
                                    sb.append(obj2);
                                    sb.append(")");
                                    fc4.b(sb.toString());
                                    set.add(purchase.b());
                                    final TLRPC.TL_payments_assignPlayMarketTransaction tL_payments_assignPlayMarketTransaction = new TLRPC.TL_payments_assignPlayMarketTransaction();
                                    TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
                                    tL_payments_assignPlayMarketTransaction.receipt = tL_dataJSON;
                                    tL_dataJSON.data = purchase.a;
                                    tL_payments_assignPlayMarketTransaction.purpose = (TLRPC.InputStorePaymentPurpose) obj2;
                                    final he[] heVarArr = new he[1];
                                    gm.c3(new wi0(heVarArr, (byte) 0));
                                    atomicInteger.incrementAndGet();
                                    int i6 = tL_payments_assignPlayMarketTransaction.purpose instanceof TLRPC.TL_inputStorePaymentAuthCode ? 65608 : 65600;
                                    ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i5);
                                    RequestDelegate requestDelegate = new RequestDelegate() { // from class: zi0
                                        @Override // org.telegram.tgnet.RequestDelegate
                                        public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                                            cj0 cj0Var3 = cj0.this;
                                            he[] heVarArr2 = heVarArr;
                                            Purchase purchase2 = purchase;
                                            TLRPC.TL_payments_assignPlayMarketTransaction tL_payments_assignPlayMarketTransaction2 = tL_payments_assignPlayMarketTransaction;
                                            j5 j5Var3 = j5Var2;
                                            fj0 fj0Var3 = fj0Var2;
                                            AtomicInteger atomicInteger3 = atomicInteger2;
                                            AtomicInteger atomicInteger4 = atomicInteger;
                                            op6 op6Var2 = op6Var;
                                            gm.c3(new wi0(heVarArr2, (byte) 1));
                                            cj0Var3.b.remove(purchase2.b());
                                            if (!(tLObject instanceof TLRPC.Updates)) {
                                                StringBuilder sb2 = new StringBuilder("BillingController.onPurchasesUpdatedInternal: ");
                                                sb2.append(purchase2.a());
                                                sb2.append(" purchase is purchased and failed to assign: ");
                                                hg9.r(tL_error == null ? null : tL_error.text, sb2);
                                                Runnable runnable2 = cj0Var3.h;
                                                if (runnable2 != null) {
                                                    runnable2.run();
                                                    cj0Var3.h = null;
                                                }
                                                if (tL_error != null) {
                                                    nm7.e().m(nm7.o5, tL_payments_assignPlayMarketTransaction2, tL_error);
                                                }
                                                gm.c3(new aj0(atomicInteger3, atomicInteger4, op6Var2, (byte) 2));
                                                return;
                                            }
                                            fc4.b("BillingController.onPurchasesUpdatedInternal: " + purchase2.a() + " purchase is purchased and now assigned");
                                            if (tL_payments_assignPlayMarketTransaction2.purpose instanceof TLRPC.TL_inputStorePaymentAuthCode) {
                                                ArrayList x0 = oc7.x0((TLRPC.Updates) tLObject, TL_update.TL_updateSentPhoneCode.class);
                                                int size = x0.size();
                                                int i7 = 0;
                                                while (i7 < size) {
                                                    Object obj3 = x0.get(i7);
                                                    i7++;
                                                    gm.c3(new op6((Object) j5Var3, (Object) tL_payments_assignPlayMarketTransaction2, obj3, (byte) 18));
                                                }
                                            }
                                            oc7.r1(j5Var3.a).T3((TLRPC.Updates) tLObject, false);
                                            ArrayList c2 = purchase2.c();
                                            int size2 = c2.size();
                                            int i8 = 0;
                                            while (i8 < size2) {
                                                Object obj4 = c2.get(i8);
                                                i8++;
                                                gu2 gu2Var = (gu2) cj0Var3.a.remove((String) obj4);
                                                if (gu2Var != null) {
                                                    gu2Var.accept(fj0Var3);
                                                }
                                            }
                                            cj0Var3.d(purchase2, tL_payments_assignPlayMarketTransaction2.purpose, new aj0(atomicInteger3, atomicInteger4, op6Var2, (byte) 1));
                                            JSONObject jSONObject2 = purchase2.c;
                                            String optString3 = jSONObject2.optString("obfuscatedAccountId");
                                            String optString4 = jSONObject2.optString("obfuscatedProfileId");
                                            String str4 = ((optString3 == null && optString4 == null) ? null : new i5(optString3, optString4)).b;
                                            try {
                                                fc4.b("BillingUtilities.clearPurpose: got {" + str4 + "}");
                                                SerializedData serializedData = new SerializedData(Utilities.v(str4));
                                                gj0 a2 = gj0.a(serializedData.readInt32(true), serializedData);
                                                SerializedData serializedData2 = new SerializedData(8);
                                                serializedData2.writeInt64(a2.b);
                                                String f = Utilities.f(serializedData2.toByteArray());
                                                serializedData2.cleanup();
                                                fc4.b("BillingUtilities.clearPurpose: id_hex = ".concat(f));
                                                a.b.getSharedPreferences("purchases", 0).edit().remove(f).apply();
                                            } catch (Exception e3) {
                                                fc4.g(e3, true);
                                            }
                                        }
                                    };
                                    cj0Var = this;
                                    connectionsManager.sendRequest(tL_payments_assignPlayMarketTransaction, requestDelegate, i6);
                                    b = 0;
                                }
                                i = 1;
                            }
                        }
                        fc4.b("BillingController.onPurchasesUpdatedInternal: " + purchase.a() + " purchase is purchased, but failed to extract saved payload");
                        cj0Var2 = this;
                        b2 = (byte) 0;
                        i3 = 1;
                        fj0Var2 = fj0Var;
                    }
                }
                mw7Var = null;
                if (mw7Var != null) {
                }
                fc4.b("BillingController.onPurchasesUpdatedInternal: " + purchase.a() + " purchase is purchased, but failed to extract saved payload");
                cj0Var2 = this;
                b2 = (byte) 0;
                i3 = 1;
                fj0Var2 = fj0Var;
            } else {
                b = b2;
                cj0Var = cj0Var2;
                StringBuilder sb2 = new StringBuilder("BillingController.onPurchasesUpdatedInternal: ");
                sb2.append(purchase.a());
                sb2.append(" purchase is (state=");
                i = 1;
                sb2.append(jSONObject.optInt("purchaseState", 1) != 4 ? 1 : 2);
                sb2.append("), (isAcknowledged=");
                sb2.append(jSONObject.optBoolean("acknowledged", true));
                hg9.r(")", sb2);
            }
            cj0Var2 = cj0Var;
            i3 = i;
            b2 = b;
            fj0Var2 = fj0Var;
        }
        if (atomicInteger.get() != 0 || op6Var == null) {
            return;
        }
        op6Var.run();
    }

    public final void n(fj0 fj0Var, List list) {
        fc4.b("Billing: Query product details finished " + fj0Var + ", " + list);
        byte b = 0;
        if (fj0Var.a != 0) {
            r();
            int i = this.j - 1;
            this.j = i;
            if (i > 0) {
                gm.d3(new xi0(this, b), i == 2 ? 1000L : 10000L);
                return;
            }
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ln8 ln8Var = (ln8) it.next();
            if (ln8Var.c.equals("telegram_premium")) {
                l = ln8Var;
            }
        }
        if (l == null) {
            r();
            return;
        }
        boolean z = n;
        int i2 = nm7.n5;
        if (z) {
            n = false;
            nm7.e().m(i2, new Object[0]);
        }
        nm7.e().m(i2, new Object[0]);
    }

    public final void o(List list, bj0 bj0Var) {
        if (!j()) {
            dq9.m("Billing: Controller should be ready for this call!");
            return;
        }
        ai4 ai4Var = new ai4((byte) 25, false);
        if (list == null || list.isEmpty()) {
            u36.j("Product list cannot be empty.");
            return;
        }
        HashSet hashSet = new HashSet();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            zy8 zy8Var = (zy8) it.next();
            if (!"play_pass_subs".equals(zy8Var.b)) {
                hashSet.add(zy8Var.b);
            }
        }
        if (hashSet.size() > 1) {
            u36.j("All products should be of the same product type.");
            return;
        }
        fhd p = fhd.p(list);
        ai4Var.b = p;
        if (p == null) {
            u36.j("Product list must be set to a non empty list.");
            return;
        }
        this.d.c(new oo8(ai4Var), new xg0(bj0Var, (byte) 3));
    }

    public final void p(String str, xw8 xw8Var) {
        ui0 ui0Var = this.d;
        ui0Var.getClass();
        if (ui0.f(new r6d(ui0Var, xw8Var, str), 30000L, new us4((Object) ui0Var, (Object) xw8Var, (byte) 18), ui0Var.r(), ui0Var.e()) == null) {
            fj0 u = ui0Var.u();
            ui0Var.x(25, 9, u);
            tgd tgdVar = fhd.b;
            xw8Var.a(u, ojd.e);
        }
    }

    public final void q() {
        if (j()) {
            return;
        }
        try {
            hj0.a(this.c);
            if (e21.b()) {
                return;
            }
            this.d.d(this);
        } catch (Exception e) {
            fc4.g(e, true);
        }
    }
}

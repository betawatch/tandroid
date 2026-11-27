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

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final class di0 implements wh0 {
    public static final j09 k;
    public static wo8 l;
    public static di0 m;
    public static boolean n;
    public static NumberFormat o;
    public final vh0 d;
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
        we3 we3Var = new we3();
        we3Var.b = "subs";
        we3Var.a = "telegram_premium";
        k = we3Var.a();
    }

    public di0(Context context) {
        vh0 cndVar;
        tj tjVar = new tj(context);
        tjVar.a = new sae();
        tjVar.c = this;
        if (context == null) {
            lq5.j("Please provide a valid Context.");
            throw null;
        }
        if (((di0) tjVar.c) == null) {
            lq5.j("Please provide a valid listener for purchases updates.");
            throw null;
        }
        if (((sae) tjVar.a) == null) {
            lq5.j("Pending purchases for one-time products must be supported.");
            throw null;
        }
        ((sae) tjVar.a).getClass();
        di0 di0Var = (di0) tjVar.c;
        sae saeVar = (sae) tjVar.a;
        if (di0Var != null) {
            di0 di0Var2 = (di0) tjVar.c;
            cndVar = tjVar.a() ? new cnd(saeVar, context, di0Var2, tjVar) : new vh0(saeVar, context, di0Var2, tjVar);
        } else {
            cndVar = tjVar.a() ? new cnd(saeVar, context, tjVar) : new vh0(saeVar, context, tjVar);
        }
        this.d = cndVar;
    }

    public static String f(String str, int i, long j, boolean z) {
        if (str == null || str.isEmpty()) {
            return String.valueOf(j);
        }
        if ("TON".equalsIgnoreCase(str)) {
            return "TON " + (j / 1.0E9d);
        }
        if ("XTR".equalsIgnoreCase(str)) {
            return "XTR ".concat(ob6.E(j, ','));
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

    public static di0 h() {
        di0 di0Var = m;
        if (di0Var != null) {
            return di0Var;
        }
        di0 di0Var2 = new di0(a.b);
        m = di0Var2;
        return di0Var2;
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
        jn7.e().m(jn7.m5, new Object[0]);
    }

    @Override // wh0
    public final void a(gi0 gi0Var) {
        cc4.b("Billing: Setup finished with result " + gi0Var);
        if (gi0Var.a != 0) {
            if (this.g) {
                return;
            }
            r();
            return;
        }
        this.g = false;
        this.j = 3;
        try {
            o(Collections.singletonList(k), new zh0(this, (byte) 1));
        } catch (Exception e) {
            cc4.g(e, true);
        }
        byte b = 2;
        p("inapp", new zh0(this, b));
        p("subs", new zh0(this, b));
        ArrayList arrayList = this.i;
        if (arrayList.isEmpty()) {
            return;
        }
        for (int i = 0; i < arrayList.size(); i++) {
            hl.c3((Runnable) arrayList.get(i));
        }
        arrayList.clear();
    }

    @Override // wh0
    public final void b() {
        cc4.b("Billing: Service disconnected");
        int i = this.g ? 15000 : 5000;
        this.g = true;
        hl.d3(new yh0(this, (byte) 1), i);
    }

    public final void c(String str, pt2 pt2Var) {
        this.a.put(str, pt2Var);
    }

    public final void d(Purchase purchase, TLRPC.InputStorePaymentPurpose inputStorePaymentPurpose, Runnable runnable) {
        if ((inputStorePaymentPurpose instanceof TLRPC.TL_inputStorePaymentGiftPremium) || (inputStorePaymentPurpose instanceof TLRPC.TL_inputStorePaymentPremiumGiftCode) || (inputStorePaymentPurpose instanceof TLRPC.TL_inputStorePaymentStarsTopup) || (inputStorePaymentPurpose instanceof TLRPC.TL_inputStorePaymentStarsGift) || (inputStorePaymentPurpose instanceof TLRPC.TL_inputStorePaymentPremiumGiveaway) || (inputStorePaymentPurpose instanceof TLRPC.TL_inputStorePaymentStarsGiveaway) || (inputStorePaymentPurpose instanceof TLRPC.TL_inputStorePaymentAuthCode)) {
            cc4.b("BillingController consumeGiftPurchase " + inputStorePaymentPurpose + " " + purchase.a() + " " + purchase.b());
            String b = purchase.b();
            if (b == null) {
                lq5.j("Purchase token must be set");
                return;
            }
            mt2 mt2Var = new mt2((byte) 0);
            mt2Var.b = b;
            this.d.a(mt2Var, new ie((Object) inputStorePaymentPurpose, (Object) purchase, (Object) runnable, (byte) 4));
        }
    }

    public final String e(long j, String str) {
        return f(str, g(str), j, false);
    }

    public final int g(String str) {
        HashMap hashMap = this.c;
        ii0.a(hashMap);
        return ((Integer) Map.-EL.getOrDefault(hashMap, str, 0)).intValue();
    }

    public final boolean j() {
        vh0 vh0Var = this.d;
        vh0Var.getClass();
        return vh0Var.o();
    }

    public final void k(Activity activity, k5 k5Var, TLRPC.InputStorePaymentPurpose inputStorePaymentPurpose, List list) {
        l(activity, k5Var, inputStorePaymentPurpose, list, null, false);
    }

    public final void l(Activity activity, k5 k5Var, TLRPC.InputStorePaymentPurpose inputStorePaymentPurpose, List list, ekd ekdVar, boolean z) {
        if (!j() || activity == null) {
            return;
        }
        if (((inputStorePaymentPurpose instanceof TLRPC.TL_inputStorePaymentGiftPremium) || (inputStorePaymentPurpose instanceof TLRPC.TL_inputStorePaymentStarsTopup) || (inputStorePaymentPurpose instanceof TLRPC.TL_inputStorePaymentStarsGift)) && !z) {
            cc4.b("BillingController.launchBillingFlow, checking consumables");
            p("inapp", new kh(this, activity, k5Var, inputStorePaymentPurpose, list, ekdVar));
            return;
        }
        if (z) {
            cc4.b("BillingController.launchBillingFlow, consumables checked, launching flow...");
        }
        boolean o2 = yac.h(k5Var.a).o();
        int i = k5Var.a;
        boolean z2 = false;
        String encodeToString = o2 ? Base64.encodeToString(String.valueOf(yac.h(i).e()).getBytes(lk1.a), 0) : Base64.encodeToString(uh9.k(i, "account-").getBytes(lk1.a), 0);
        long nextLong = Utilities.b.nextLong();
        cc4.b("BillingUtilities.savePurpose id=" + nextLong + " paymentPurpose=" + inputStorePaymentPurpose);
        SerializedData serializedData = new SerializedData(8);
        serializedData.writeInt64(nextLong);
        String f = Utilities.f(serializedData.toByteArray());
        serializedData.cleanup();
        cc4.b("BillingUtilities.savePurpose id_hex=" + f + " paymentPurpose=" + inputStorePaymentPurpose);
        hi0 hi0Var = new hi0();
        hi0Var.b = nextLong;
        hi0Var.a = 1;
        hi0Var.c = inputStorePaymentPurpose;
        SerializedData serializedData2 = new SerializedData(hi0Var.getObjectSize());
        hi0Var.serializeToStream(serializedData2);
        String f2 = Utilities.f(serializedData2.toByteArray());
        serializedData2.cleanup();
        ekd ekdVar2 = null;
        if (hi0Var.getObjectSize() > 28) {
            cc4.b("BillingUtilities.savePurpose: sending short version, original size is " + hi0Var.getObjectSize() + " bytes");
            hi0Var.a = 0;
            hi0Var.c = null;
        }
        SerializedData serializedData3 = new SerializedData(hi0Var.getObjectSize());
        hi0Var.serializeToStream(serializedData3);
        String f3 = Utilities.f(serializedData3.toByteArray());
        serializedData3.cleanup();
        a.b.getSharedPreferences("purchases", 0).edit().putString(f, f2).apply();
        cc4.b("BillingUtilities.savePurpose: saved {" + f2 + "} under " + f);
        StringBuilder sb = new StringBuilder("BillingUtilities.savePurpose: but sending {");
        sb.append(f3);
        sb.append("}");
        cc4.b(sb.toString());
        ib3 ib3Var = new ib3();
        ib3Var.b = (byte) 0;
        ib3Var.a = true;
        ArrayList arrayList = new ArrayList(list);
        if (ekdVar != null) {
            ib3Var = new ib3();
            ib3Var.c = (String) ekdVar.b;
            ib3Var.b = ekdVar.a;
        }
        vh0 vh0Var = this.d;
        boolean isEmpty = arrayList.isEmpty();
        if (isEmpty) {
            lq5.j("Details of the products must be provided.");
            return;
        }
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            if (((ei0) obj) == null) {
                lq5.j("ProductDetailsParams cannot be null.");
                return;
            }
        }
        fi0 fi0Var = new fi0();
        if (!isEmpty && !((ei0) arrayList.get(0)).a.b.optString("packageName").isEmpty()) {
            z2 = true;
        }
        fi0Var.b = z2;
        fi0Var.a = encodeToString;
        fi0Var.c = f3;
        boolean isEmpty2 = TextUtils.isEmpty((String) ib3Var.c);
        if (ib3Var.a || !isEmpty2) {
            ekdVar2 = new ekd();
            ekdVar2.b = (String) ib3Var.c;
            ekdVar2.a = ib3Var.b;
        } else {
            lq5.j("Old SKU purchase information(token/id) or original external transaction id must be provided.");
        }
        fi0Var.d = ekdVar2;
        fi0Var.f = new ArrayList();
        fi0Var.e = vjd.p(arrayList);
        int i3 = vh0Var.b(activity, fi0Var).a;
        if (i3 != 0) {
            StringBuilder sb2 = new StringBuilder("Billing: Launch Error: ");
            sb2.append(i3);
            sb2.append(", ");
            sb2.append(encodeToString);
            sb2.append(", ");
            uh9.s(f3, sb2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x017f  */
    /* JADX WARN: Type inference failed for: r10v0 */
    /* JADX WARN: Type inference failed for: r10v1, types: [boolean, byte, int] */
    /* JADX WARN: Type inference failed for: r10v13 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m(gi0 gi0Var, List list, final es6 es6Var) {
        byte b;
        int i;
        di0 di0Var;
        byte b2;
        TLRPC.InputStorePaymentPurpose inputStorePaymentPurpose;
        k5 a;
        sx7 sx7Var;
        k5 k5Var;
        di0 di0Var2 = this;
        final gi0 gi0Var2 = gi0Var;
        cc4.b("Billing: Purchases updated: " + gi0Var2 + ", " + list);
        int i2 = gi0Var2.a;
        ?? r10 = 0;
        boolean z = false;
        int i3 = 1;
        if (i2 != 0) {
            if (i2 == 1) {
                TLRPC.TL_help_saveAppLog tL_help_saveAppLog = new TLRPC.TL_help_saveAppLog();
                TLRPC.TL_inputAppEvent tL_inputAppEvent = new TLRPC.TL_inputAppEvent();
                tL_inputAppEvent.time = ConnectionsManager.getInstance(yac.t0).getCurrentTime();
                tL_inputAppEvent.type = "premium.promo_screen_fail";
                tL_inputAppEvent.data = new TLRPC.TL_jsonNull();
                tL_help_saveAppLog.events.add(tL_inputAppEvent);
                ConnectionsManager.getInstance(yac.t0).sendRequest(tL_help_saveAppLog, new xe2(z ? 1 : 0));
            }
            Runnable runnable = di0Var2.h;
            if (runnable != null) {
                runnable.run();
                di0Var2.h = null;
            }
            if (es6Var != null) {
                es6Var.run();
                return;
            }
            return;
        }
        if (list == null || list.isEmpty()) {
            if (es6Var != null) {
                es6Var.run();
                return;
            }
            return;
        }
        final AtomicInteger atomicInteger = new AtomicInteger(0);
        final AtomicInteger atomicInteger2 = new AtomicInteger(0);
        di0Var2.e = null;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            final Purchase purchase = (Purchase) it.next();
            ArrayList c = purchase.c();
            JSONObject jSONObject = purchase.c;
            if (c.contains("telegram_premium")) {
                di0Var2.e = purchase.a();
                di0Var2.f = purchase.b();
            }
            String b3 = purchase.b();
            Set set = di0Var2.b;
            if (set.contains(b3)) {
                b = r10;
                i = i3;
                di0Var = di0Var2;
                cc4.b("BillingController.onPurchasesUpdatedInternal: " + purchase.a() + " purchase is already requesting...");
            } else if (jSONObject.optInt("purchaseState", i3) != 4) {
                String optString = jSONObject.optString("obfuscatedAccountId");
                String optString2 = jSONObject.optString("obfuscatedProfileId");
                j5 j5Var = (optString == null && optString2 == null) ? null : new j5(optString, optString2, r10, r10);
                if (j5Var == null) {
                    cc4.b("Billing: Extract payload. No AccountIdentifiers");
                } else {
                    String str = j5Var.b;
                    String str2 = j5Var.c;
                    if (str == null || str.isEmpty() || str2 == null || str2.isEmpty()) {
                        cc4.b("Billing: Extract payload. Empty AccountIdentifiers");
                    } else {
                        try {
                            inputStorePaymentPurpose = ii0.b(str2);
                        } catch (Exception e) {
                            cc4.e("Billing: Extract payload, failed to get purpose", e);
                            inputStorePaymentPurpose = null;
                        }
                        String str3 = new String(Base64.decode(str, (int) r10), lk1.a);
                        cc4.b("Billing: Extract payload. obfuscatedAccountIdString=".concat(str3));
                        if (str3.startsWith("account-")) {
                            try {
                                a = k5.a(Integer.parseInt(str3.substring(8)));
                            } catch (Exception e2) {
                                cc4.e("Billing: Extract Payload", e2);
                            }
                        } else {
                            long parseLong = Long.parseLong(str3);
                            int i4 = 0;
                            while (true) {
                                if (i4 >= 4) {
                                    k5Var = null;
                                    break;
                                }
                                k5Var = k5.a(i4);
                                if (yac.h(k5Var.a).e() == parseLong) {
                                    break;
                                } else {
                                    i4++;
                                }
                            }
                            if (k5Var == null) {
                                cc4.b("Billing: Extract payload. AccountInstance not found, accountId=" + parseLong);
                            } else {
                                a = k5Var;
                            }
                        }
                        sx7Var = new sx7(a, inputStorePaymentPurpose);
                        if (sx7Var != null) {
                            Object obj = sx7Var.a;
                            Object obj2 = sx7Var.b;
                            if (obj != null && obj2 != null) {
                                if (jSONObject.optBoolean("acknowledged", true)) {
                                    di0Var = this;
                                    cc4.b("BillingController.onPurchasesUpdatedInternal: " + purchase.a() + " purchase is purchased and acknowledged: consuming");
                                    atomicInteger.incrementAndGet();
                                    b = 0;
                                    di0Var.d(purchase, (TLRPC.InputStorePaymentPurpose) obj2, new bi0(atomicInteger2, atomicInteger, es6Var, b));
                                } else {
                                    StringBuilder sb = new StringBuilder("BillingController.onPurchasesUpdatedInternal: ");
                                    sb.append(purchase.a());
                                    sb.append(" purchase is purchased and not acknowledged: assigning (accountId=");
                                    final k5 k5Var2 = (k5) obj;
                                    int i5 = k5Var2.a;
                                    sb.append(i5);
                                    sb.append(") (purpose=");
                                    sb.append(obj2);
                                    sb.append(")");
                                    cc4.b(sb.toString());
                                    set.add(purchase.b());
                                    final TLRPC.TL_payments_assignPlayMarketTransaction tL_payments_assignPlayMarketTransaction = new TLRPC.TL_payments_assignPlayMarketTransaction();
                                    TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
                                    tL_payments_assignPlayMarketTransaction.receipt = tL_dataJSON;
                                    tL_dataJSON.data = purchase.a;
                                    tL_payments_assignPlayMarketTransaction.purpose = (TLRPC.InputStorePaymentPurpose) obj2;
                                    final id[] idVarArr = new id[1];
                                    hl.c3(new xh0(idVarArr, (byte) 0));
                                    atomicInteger.incrementAndGet();
                                    int i6 = tL_payments_assignPlayMarketTransaction.purpose instanceof TLRPC.TL_inputStorePaymentAuthCode ? 65608 : 65600;
                                    ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i5);
                                    RequestDelegate requestDelegate = new RequestDelegate() { // from class: ai0
                                        @Override // org.telegram.tgnet.RequestDelegate
                                        public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                                            di0 di0Var3 = di0.this;
                                            id[] idVarArr2 = idVarArr;
                                            Purchase purchase2 = purchase;
                                            TLRPC.TL_payments_assignPlayMarketTransaction tL_payments_assignPlayMarketTransaction2 = tL_payments_assignPlayMarketTransaction;
                                            k5 k5Var3 = k5Var2;
                                            gi0 gi0Var3 = gi0Var2;
                                            AtomicInteger atomicInteger3 = atomicInteger2;
                                            AtomicInteger atomicInteger4 = atomicInteger;
                                            es6 es6Var2 = es6Var;
                                            hl.c3(new xh0(idVarArr2, (byte) 1));
                                            di0Var3.b.remove(purchase2.b());
                                            if (!(tLObject instanceof TLRPC.Updates)) {
                                                StringBuilder sb2 = new StringBuilder("BillingController.onPurchasesUpdatedInternal: ");
                                                sb2.append(purchase2.a());
                                                sb2.append(" purchase is purchased and failed to assign: ");
                                                uh9.s(tL_error == null ? null : tL_error.text, sb2);
                                                Runnable runnable2 = di0Var3.h;
                                                if (runnable2 != null) {
                                                    runnable2.run();
                                                    di0Var3.h = null;
                                                }
                                                if (tL_error != null) {
                                                    jn7.e().m(jn7.n5, tL_payments_assignPlayMarketTransaction2, tL_error);
                                                }
                                                hl.c3(new bi0(atomicInteger3, atomicInteger4, es6Var2, (byte) 2));
                                                return;
                                            }
                                            cc4.b("BillingController.onPurchasesUpdatedInternal: " + purchase2.a() + " purchase is purchased and now assigned");
                                            if (tL_payments_assignPlayMarketTransaction2.purpose instanceof TLRPC.TL_inputStorePaymentAuthCode) {
                                                ArrayList z0 = uc7.z0((TLRPC.Updates) tLObject, TL_update.TL_updateSentPhoneCode.class);
                                                int size = z0.size();
                                                int i7 = 0;
                                                while (i7 < size) {
                                                    Object obj3 = z0.get(i7);
                                                    i7++;
                                                    hl.c3(new es6((Object) k5Var3, (Object) tL_payments_assignPlayMarketTransaction2, obj3, (byte) 18));
                                                }
                                            }
                                            uc7.s1(k5Var3.a).Y3((TLRPC.Updates) tLObject, false);
                                            ArrayList c2 = purchase2.c();
                                            int size2 = c2.size();
                                            int i8 = 0;
                                            while (i8 < size2) {
                                                Object obj4 = c2.get(i8);
                                                i8++;
                                                pt2 pt2Var = (pt2) di0Var3.a.remove((String) obj4);
                                                if (pt2Var != null) {
                                                    pt2Var.accept(gi0Var3);
                                                }
                                            }
                                            di0Var3.d(purchase2, tL_payments_assignPlayMarketTransaction2.purpose, new bi0(atomicInteger3, atomicInteger4, es6Var2, (byte) 1));
                                            JSONObject jSONObject2 = purchase2.c;
                                            String optString3 = jSONObject2.optString("obfuscatedAccountId");
                                            String optString4 = jSONObject2.optString("obfuscatedProfileId");
                                            String str4 = ((optString3 == null && optString4 == null) ? null : new j5(optString3, optString4, (byte) 0, false)).c;
                                            try {
                                                cc4.b("BillingUtilities.clearPurpose: got {" + str4 + "}");
                                                SerializedData serializedData = new SerializedData(Utilities.v(str4));
                                                hi0 a2 = hi0.a(serializedData.readInt32(true), serializedData);
                                                SerializedData serializedData2 = new SerializedData(8);
                                                serializedData2.writeInt64(a2.b);
                                                String f = Utilities.f(serializedData2.toByteArray());
                                                serializedData2.cleanup();
                                                cc4.b("BillingUtilities.clearPurpose: id_hex = ".concat(f));
                                                a.b.getSharedPreferences("purchases", 0).edit().remove(f).apply();
                                            } catch (Exception e3) {
                                                cc4.g(e3, true);
                                            }
                                        }
                                    };
                                    di0Var = this;
                                    connectionsManager.sendRequest(tL_payments_assignPlayMarketTransaction, requestDelegate, i6);
                                    b = 0;
                                }
                                i = 1;
                            }
                        }
                        cc4.b("BillingController.onPurchasesUpdatedInternal: " + purchase.a() + " purchase is purchased, but failed to extract saved payload");
                        di0Var2 = this;
                        b2 = (byte) 0;
                        i3 = 1;
                        gi0Var2 = gi0Var;
                        r10 = b2;
                    }
                }
                sx7Var = null;
                if (sx7Var != null) {
                }
                cc4.b("BillingController.onPurchasesUpdatedInternal: " + purchase.a() + " purchase is purchased, but failed to extract saved payload");
                di0Var2 = this;
                b2 = (byte) 0;
                i3 = 1;
                gi0Var2 = gi0Var;
                r10 = b2;
            } else {
                b = r10;
                di0Var = di0Var2;
                StringBuilder sb2 = new StringBuilder("BillingController.onPurchasesUpdatedInternal: ");
                sb2.append(purchase.a());
                sb2.append(" purchase is (state=");
                i = 1;
                sb2.append(jSONObject.optInt("purchaseState", 1) != 4 ? 1 : 2);
                sb2.append("), (isAcknowledged=");
                sb2.append(jSONObject.optBoolean("acknowledged", true));
                uh9.s(")", sb2);
            }
            di0Var2 = di0Var;
            i3 = i;
            b2 = b;
            gi0Var2 = gi0Var;
            r10 = b2;
        }
        if (atomicInteger.get() != 0 || es6Var == null) {
            return;
        }
        es6Var.run();
    }

    public final void n(gi0 gi0Var, List list) {
        cc4.b("Billing: Query product details finished " + gi0Var + ", " + list);
        byte b = 0;
        if (gi0Var.a != 0) {
            r();
            int i = this.j - 1;
            this.j = i;
            if (i > 0) {
                hl.d3(new yh0(this, b), i == 2 ? 1000L : 10000L);
                return;
            }
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            wo8 wo8Var = (wo8) it.next();
            if (wo8Var.c.equals("telegram_premium")) {
                l = wo8Var;
            }
        }
        if (l == null) {
            r();
            return;
        }
        boolean z = n;
        int i2 = jn7.m5;
        if (z) {
            n = false;
            jn7.e().m(i2, new Object[0]);
        }
        jn7.e().m(i2, new Object[0]);
    }

    public final void o(List list, ci0 ci0Var) {
        if (!j()) {
            grb.i("Billing: Controller should be ready for this call!");
            return;
        }
        i09 i09Var = new i09((byte) 0);
        if (list == null || list.isEmpty()) {
            lq5.j("Product list cannot be empty.");
            return;
        }
        HashSet hashSet = new HashSet();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            j09 j09Var = (j09) it.next();
            if (!"play_pass_subs".equals(j09Var.b)) {
                hashSet.add(j09Var.b);
            }
        }
        byte b = 1;
        if (hashSet.size() > 1) {
            lq5.j("All products should be of the same product type.");
            return;
        }
        vjd p = vjd.p(list);
        i09Var.b = p;
        if (p == null) {
            lq5.j("Product list must be set to a non empty list.");
            return;
        }
        this.d.c(new k09(i09Var), new tg0(ci0Var, b));
    }

    public final void p(String str, fy8 fy8Var) {
        vh0 vh0Var = this.d;
        vh0Var.getClass();
        if (vh0.f(new h9d(vh0Var, fy8Var, str), 30000L, new xs4((Object) vh0Var, (Object) fy8Var, (byte) 18), vh0Var.r(), vh0Var.e()) == null) {
            gi0 u = vh0Var.u();
            vh0Var.x(25, 9, u);
            jjd jjdVar = vjd.b;
            fy8Var.a(u, emd.e);
        }
    }

    public final void q() {
        if (j()) {
            return;
        }
        try {
            ii0.a(this.c);
            if (f11.b()) {
                return;
            }
            this.d.d(this);
        } catch (Exception e) {
            cc4.g(e, true);
        }
    }
}

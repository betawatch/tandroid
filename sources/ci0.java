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

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class ci0 implements vh0 {
    public static final yw8 k;
    public static kl8 l;
    public static ci0 m;
    public static boolean n;
    public static NumberFormat o;
    public final uh0 d;
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

    public ci0(Context context) {
        uh0 lidVar;
        sj sjVar = new sj(context);
        sjVar.a = new c6e();
        sjVar.c = this;
        if (context == null) {
            w26.j("Please provide a valid Context.");
            throw null;
        }
        if (((ci0) sjVar.c) == null) {
            w26.j("Please provide a valid listener for purchases updates.");
            throw null;
        }
        if (((c6e) sjVar.a) == null) {
            w26.j("Pending purchases for one-time products must be supported.");
            throw null;
        }
        ((c6e) sjVar.a).getClass();
        ci0 ci0Var = (ci0) sjVar.c;
        c6e c6eVar = (c6e) sjVar.a;
        if (ci0Var != null) {
            ci0 ci0Var2 = (ci0) sjVar.c;
            lidVar = sjVar.a() ? new lid(c6eVar, context, ci0Var2, sjVar) : new uh0(c6eVar, context, ci0Var2, sjVar);
        } else {
            lidVar = sjVar.a() ? new lid(c6eVar, context, sjVar) : new uh0(c6eVar, context, sjVar);
        }
        this.d = lidVar;
    }

    public static String f(String str, int i, long j, boolean z) {
        if (str == null || str.isEmpty()) {
            return String.valueOf(j);
        }
        if ("TON".equalsIgnoreCase(str)) {
            return "TON " + (j / 1.0E9d);
        }
        if ("XTR".equalsIgnoreCase(str)) {
            return "XTR ".concat(k96.E(j, ','));
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

    public static ci0 h() {
        ci0 ci0Var = m;
        if (ci0Var != null) {
            return ci0Var;
        }
        ci0 ci0Var2 = new ci0(a.b);
        m = ci0Var2;
        return ci0Var2;
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
        kk7.e().m(kk7.l5, new Object[0]);
    }

    @Override // vh0
    public final void a(fi0 fi0Var) {
        fa4.b("Billing: Setup finished with result " + fi0Var);
        if (fi0Var.a != 0) {
            if (this.g) {
                return;
            }
            r();
            return;
        }
        this.g = false;
        this.j = 3;
        try {
            o(Collections.singletonList(k), new yh0(this, (byte) 1));
        } catch (Exception e) {
            fa4.g(e, true);
        }
        byte b = 2;
        p("inapp", new yh0(this, b));
        p("subs", new yh0(this, b));
        ArrayList arrayList = this.i;
        if (arrayList.isEmpty()) {
            return;
        }
        for (int i = 0; i < arrayList.size(); i++) {
            gl.d3((Runnable) arrayList.get(i));
        }
        arrayList.clear();
    }

    @Override // vh0
    public final void b() {
        fa4.b("Billing: Service disconnected");
        int i = this.g ? 15000 : 5000;
        this.g = true;
        gl.e3(new xh0(this, (byte) 1), i);
    }

    public final void c(String str, vs2 vs2Var) {
        this.a.put(str, vs2Var);
    }

    public final void d(Purchase purchase, TLRPC.InputStorePaymentPurpose inputStorePaymentPurpose, Runnable runnable) {
        if ((inputStorePaymentPurpose instanceof TLRPC.TL_inputStorePaymentGiftPremium) || (inputStorePaymentPurpose instanceof TLRPC.TL_inputStorePaymentPremiumGiftCode) || (inputStorePaymentPurpose instanceof TLRPC.TL_inputStorePaymentStarsTopup) || (inputStorePaymentPurpose instanceof TLRPC.TL_inputStorePaymentStarsGift) || (inputStorePaymentPurpose instanceof TLRPC.TL_inputStorePaymentPremiumGiveaway) || (inputStorePaymentPurpose instanceof TLRPC.TL_inputStorePaymentStarsGiveaway) || (inputStorePaymentPurpose instanceof TLRPC.TL_inputStorePaymentAuthCode)) {
            fa4.b("BillingController consumeGiftPurchase " + inputStorePaymentPurpose + " " + purchase.a() + " " + purchase.b());
            String b = purchase.b();
            if (b == null) {
                w26.j("Purchase token must be set");
                return;
            }
            ss2 ss2Var = new ss2();
            ss2Var.a = b;
            this.d.a(ss2Var, new ie((Object) inputStorePaymentPurpose, (Object) purchase, (Object) runnable, (byte) 4));
        }
    }

    public final String e(long j, String str) {
        return f(str, g(str), j, false);
    }

    public final int g(String str) {
        HashMap hashMap = this.c;
        hi0.a(hashMap);
        return ((Integer) Map.-EL.getOrDefault(hashMap, str, 0)).intValue();
    }

    public final boolean j() {
        uh0 uh0Var = this.d;
        uh0Var.getClass();
        return uh0Var.o();
    }

    public final void k(Activity activity, j5 j5Var, TLRPC.InputStorePaymentPurpose inputStorePaymentPurpose, List list) {
        l(activity, j5Var, inputStorePaymentPurpose, list, null, false);
    }

    public final void l(Activity activity, j5 j5Var, TLRPC.InputStorePaymentPurpose inputStorePaymentPurpose, List list, nfd nfdVar, boolean z) {
        if (!j() || activity == null) {
            return;
        }
        if (((inputStorePaymentPurpose instanceof TLRPC.TL_inputStorePaymentGiftPremium) || (inputStorePaymentPurpose instanceof TLRPC.TL_inputStorePaymentStarsTopup) || (inputStorePaymentPurpose instanceof TLRPC.TL_inputStorePaymentStarsGift)) && !z) {
            fa4.b("BillingController.launchBillingFlow, checking consumables");
            p("inapp", new zd(this, activity, j5Var, inputStorePaymentPurpose, list, nfdVar));
            return;
        }
        if (z) {
            fa4.b("BillingController.launchBillingFlow, consumables checked, launching flow...");
        }
        boolean o2 = y6c.h(j5Var.a).o();
        int i = j5Var.a;
        boolean z2 = false;
        String encodeToString = o2 ? Base64.encodeToString(String.valueOf(y6c.h(i).e()).getBytes(ck1.a), 0) : Base64.encodeToString(de9.k(i, "account-").getBytes(ck1.a), 0);
        long nextLong = Utilities.b.nextLong();
        fa4.b("BillingUtilities.savePurpose id=" + nextLong + " paymentPurpose=" + inputStorePaymentPurpose);
        SerializedData serializedData = new SerializedData(8);
        serializedData.writeInt64(nextLong);
        String f = Utilities.f(serializedData.toByteArray());
        serializedData.cleanup();
        fa4.b("BillingUtilities.savePurpose id_hex=" + f + " paymentPurpose=" + inputStorePaymentPurpose);
        gi0 gi0Var = new gi0();
        gi0Var.b = nextLong;
        gi0Var.a = 1;
        gi0Var.c = inputStorePaymentPurpose;
        SerializedData serializedData2 = new SerializedData(gi0Var.getObjectSize());
        gi0Var.serializeToStream(serializedData2);
        String f2 = Utilities.f(serializedData2.toByteArray());
        serializedData2.cleanup();
        nfd nfdVar2 = null;
        if (gi0Var.getObjectSize() > 28) {
            fa4.b("BillingUtilities.savePurpose: sending short version, original size is " + gi0Var.getObjectSize() + " bytes");
            gi0Var.a = 0;
            gi0Var.c = null;
        }
        SerializedData serializedData3 = new SerializedData(gi0Var.getObjectSize());
        gi0Var.serializeToStream(serializedData3);
        String f3 = Utilities.f(serializedData3.toByteArray());
        serializedData3.cleanup();
        a.b.getSharedPreferences("purchases", 0).edit().putString(f, f2).apply();
        fa4.b("BillingUtilities.savePurpose: saved {" + f2 + "} under " + f);
        StringBuilder sb = new StringBuilder("BillingUtilities.savePurpose: but sending {");
        sb.append(f3);
        sb.append("}");
        fa4.b(sb.toString());
        pa3 pa3Var = new pa3();
        pa3Var.b = (byte) 0;
        pa3Var.a = true;
        ArrayList arrayList = new ArrayList(list);
        if (nfdVar != null) {
            pa3Var = new pa3();
            pa3Var.c = (String) nfdVar.b;
            pa3Var.b = nfdVar.a;
        }
        uh0 uh0Var = this.d;
        boolean isEmpty = arrayList.isEmpty();
        if (isEmpty) {
            w26.j("Details of the products must be provided.");
            return;
        }
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            if (((di0) obj) == null) {
                w26.j("ProductDetailsParams cannot be null.");
                return;
            }
        }
        ei0 ei0Var = new ei0();
        if (!isEmpty && !((di0) arrayList.get(0)).a.b.optString("packageName").isEmpty()) {
            z2 = true;
        }
        ei0Var.b = z2;
        ei0Var.a = encodeToString;
        ei0Var.c = f3;
        boolean isEmpty2 = TextUtils.isEmpty((String) pa3Var.c);
        if (pa3Var.a || !isEmpty2) {
            nfdVar2 = new nfd();
            nfdVar2.b = (String) pa3Var.c;
            nfdVar2.a = pa3Var.b;
        } else {
            w26.j("Old SKU purchase information(token/id) or original external transaction id must be provided.");
        }
        ei0Var.d = nfdVar2;
        ei0Var.f = new ArrayList();
        ei0Var.e = efd.p(arrayList);
        int i3 = uh0Var.b(activity, ei0Var).a;
        if (i3 != 0) {
            StringBuilder sb2 = new StringBuilder("Billing: Launch Error: ");
            sb2.append(i3);
            sb2.append(", ");
            sb2.append(encodeToString);
            sb2.append(", ");
            de9.s(f3, sb2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x017f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m(fi0 fi0Var, List list, final nn6 nn6Var) {
        byte b;
        int i;
        ci0 ci0Var;
        TLRPC.InputStorePaymentPurpose inputStorePaymentPurpose;
        j5 a;
        lu7 lu7Var;
        j5 j5Var;
        ci0 ci0Var2 = this;
        final fi0 fi0Var2 = fi0Var;
        fa4.b("Billing: Purchases updated: " + fi0Var2 + ", " + list);
        int i2 = fi0Var2.a;
        byte b2 = 0;
        int i3 = 1;
        if (i2 != 0) {
            if (i2 == 1) {
                TLRPC.TL_help_saveAppLog tL_help_saveAppLog = new TLRPC.TL_help_saveAppLog();
                TLRPC.TL_inputAppEvent tL_inputAppEvent = new TLRPC.TL_inputAppEvent();
                tL_inputAppEvent.time = ConnectionsManager.getInstance(y6c.t0).getCurrentTime();
                tL_inputAppEvent.type = "premium.promo_screen_fail";
                tL_inputAppEvent.data = new TLRPC.TL_jsonNull();
                tL_help_saveAppLog.events.add(tL_inputAppEvent);
                ConnectionsManager.getInstance(y6c.t0).sendRequest(tL_help_saveAppLog, new ce2(b2));
            }
            Runnable runnable = ci0Var2.h;
            if (runnable != null) {
                runnable.run();
                ci0Var2.h = null;
            }
            if (nn6Var != null) {
                nn6Var.run();
                return;
            }
            return;
        }
        if (list == null || list.isEmpty()) {
            if (nn6Var != null) {
                nn6Var.run();
                return;
            }
            return;
        }
        final AtomicInteger atomicInteger = new AtomicInteger(0);
        final AtomicInteger atomicInteger2 = new AtomicInteger(0);
        ci0Var2.e = null;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            final Purchase purchase = (Purchase) it.next();
            ArrayList c = purchase.c();
            JSONObject jSONObject = purchase.c;
            if (c.contains("telegram_premium")) {
                ci0Var2.e = purchase.a();
                ci0Var2.f = purchase.b();
            }
            String b3 = purchase.b();
            Set set = ci0Var2.b;
            if (set.contains(b3)) {
                b = b2;
                i = i3;
                ci0Var = ci0Var2;
                fa4.b("BillingController.onPurchasesUpdatedInternal: " + purchase.a() + " purchase is already requesting...");
            } else if (jSONObject.optInt("purchaseState", i3) != 4) {
                String optString = jSONObject.optString("obfuscatedAccountId");
                String optString2 = jSONObject.optString("obfuscatedProfileId");
                i5 i5Var = (optString == null && optString2 == null) ? null : new i5(optString, optString2, b2);
                if (i5Var == null) {
                    fa4.b("Billing: Extract payload. No AccountIdentifiers");
                } else {
                    String str = i5Var.a;
                    String str2 = i5Var.b;
                    if (str == null || str.isEmpty() || str2 == null || str2.isEmpty()) {
                        fa4.b("Billing: Extract payload. Empty AccountIdentifiers");
                    } else {
                        try {
                            inputStorePaymentPurpose = hi0.b(str2);
                        } catch (Exception e) {
                            fa4.e("Billing: Extract payload, failed to get purpose", e);
                            inputStorePaymentPurpose = null;
                        }
                        String str3 = new String(Base64.decode(str, b2), ck1.a);
                        fa4.b("Billing: Extract payload. obfuscatedAccountIdString=".concat(str3));
                        if (str3.startsWith("account-")) {
                            try {
                                a = j5.a(Integer.parseInt(str3.substring(8)));
                            } catch (Exception e2) {
                                fa4.e("Billing: Extract Payload", e2);
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
                                if (y6c.h(j5Var.a).e() == parseLong) {
                                    break;
                                } else {
                                    i4++;
                                }
                            }
                            if (j5Var == null) {
                                fa4.b("Billing: Extract payload. AccountInstance not found, accountId=" + parseLong);
                            } else {
                                a = j5Var;
                            }
                        }
                        lu7Var = new lu7(a, inputStorePaymentPurpose);
                        if (lu7Var != null) {
                            Object obj = lu7Var.a;
                            Object obj2 = lu7Var.b;
                            if (obj != null && obj2 != null) {
                                if (jSONObject.optBoolean("acknowledged", true)) {
                                    ci0Var = this;
                                    fa4.b("BillingController.onPurchasesUpdatedInternal: " + purchase.a() + " purchase is purchased and acknowledged: consuming");
                                    atomicInteger.incrementAndGet();
                                    b = 0;
                                    ci0Var.d(purchase, (TLRPC.InputStorePaymentPurpose) obj2, new ai0(atomicInteger2, atomicInteger, nn6Var, b));
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
                                    fa4.b(sb.toString());
                                    set.add(purchase.b());
                                    final TLRPC.TL_payments_assignPlayMarketTransaction tL_payments_assignPlayMarketTransaction = new TLRPC.TL_payments_assignPlayMarketTransaction();
                                    TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
                                    tL_payments_assignPlayMarketTransaction.receipt = tL_dataJSON;
                                    tL_dataJSON.data = purchase.a;
                                    tL_payments_assignPlayMarketTransaction.purpose = (TLRPC.InputStorePaymentPurpose) obj2;
                                    final hd[] hdVarArr = new hd[1];
                                    gl.d3(new wh0(hdVarArr, (byte) 0));
                                    atomicInteger.incrementAndGet();
                                    int i6 = tL_payments_assignPlayMarketTransaction.purpose instanceof TLRPC.TL_inputStorePaymentAuthCode ? 65608 : 65600;
                                    ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i5);
                                    RequestDelegate requestDelegate = new RequestDelegate() { // from class: zh0
                                        @Override // org.telegram.tgnet.RequestDelegate
                                        public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                                            ci0 ci0Var3 = ci0.this;
                                            hd[] hdVarArr2 = hdVarArr;
                                            Purchase purchase2 = purchase;
                                            TLRPC.TL_payments_assignPlayMarketTransaction tL_payments_assignPlayMarketTransaction2 = tL_payments_assignPlayMarketTransaction;
                                            j5 j5Var3 = j5Var2;
                                            fi0 fi0Var3 = fi0Var2;
                                            AtomicInteger atomicInteger3 = atomicInteger2;
                                            AtomicInteger atomicInteger4 = atomicInteger;
                                            nn6 nn6Var2 = nn6Var;
                                            gl.d3(new wh0(hdVarArr2, (byte) 1));
                                            ci0Var3.b.remove(purchase2.b());
                                            if (!(tLObject instanceof TLRPC.Updates)) {
                                                StringBuilder sb2 = new StringBuilder("BillingController.onPurchasesUpdatedInternal: ");
                                                sb2.append(purchase2.a());
                                                sb2.append(" purchase is purchased and failed to assign: ");
                                                de9.s(tL_error == null ? null : tL_error.text, sb2);
                                                Runnable runnable2 = ci0Var3.h;
                                                if (runnable2 != null) {
                                                    runnable2.run();
                                                    ci0Var3.h = null;
                                                }
                                                if (tL_error != null) {
                                                    kk7.e().m(kk7.m5, tL_payments_assignPlayMarketTransaction2, tL_error);
                                                }
                                                gl.d3(new ai0(atomicInteger3, atomicInteger4, nn6Var2, (byte) 2));
                                                return;
                                            }
                                            fa4.b("BillingController.onPurchasesUpdatedInternal: " + purchase2.a() + " purchase is purchased and now assigned");
                                            if (tL_payments_assignPlayMarketTransaction2.purpose instanceof TLRPC.TL_inputStorePaymentAuthCode) {
                                                ArrayList x0 = na7.x0((TLRPC.Updates) tLObject, TL_update.TL_updateSentPhoneCode.class);
                                                int size = x0.size();
                                                int i7 = 0;
                                                while (i7 < size) {
                                                    Object obj3 = x0.get(i7);
                                                    i7++;
                                                    gl.d3(new nn6(j5Var3, tL_payments_assignPlayMarketTransaction2, (TL_update.TL_updateSentPhoneCode) obj3, (byte) 18));
                                                }
                                            }
                                            na7.q1(j5Var3.a).Q3((TLRPC.Updates) tLObject, false);
                                            ArrayList c2 = purchase2.c();
                                            int size2 = c2.size();
                                            int i8 = 0;
                                            while (i8 < size2) {
                                                Object obj4 = c2.get(i8);
                                                i8++;
                                                vs2 vs2Var = (vs2) ci0Var3.a.remove((String) obj4);
                                                if (vs2Var != null) {
                                                    vs2Var.accept(fi0Var3);
                                                }
                                            }
                                            ci0Var3.d(purchase2, tL_payments_assignPlayMarketTransaction2.purpose, new ai0(atomicInteger3, atomicInteger4, nn6Var2, (byte) 1));
                                            JSONObject jSONObject2 = purchase2.c;
                                            String optString3 = jSONObject2.optString("obfuscatedAccountId");
                                            String optString4 = jSONObject2.optString("obfuscatedProfileId");
                                            String str4 = ((optString3 == null && optString4 == null) ? null : new i5(optString3, optString4, (byte) 0)).b;
                                            try {
                                                fa4.b("BillingUtilities.clearPurpose: got {" + str4 + "}");
                                                SerializedData serializedData = new SerializedData(Utilities.v(str4));
                                                gi0 a2 = gi0.a(serializedData.readInt32(true), serializedData);
                                                SerializedData serializedData2 = new SerializedData(8);
                                                serializedData2.writeInt64(a2.b);
                                                String f = Utilities.f(serializedData2.toByteArray());
                                                serializedData2.cleanup();
                                                fa4.b("BillingUtilities.clearPurpose: id_hex = ".concat(f));
                                                a.b.getSharedPreferences("purchases", 0).edit().remove(f).apply();
                                            } catch (Exception e3) {
                                                fa4.g(e3, true);
                                            }
                                        }
                                    };
                                    ci0Var = this;
                                    connectionsManager.sendRequest(tL_payments_assignPlayMarketTransaction, requestDelegate, i6);
                                    b = 0;
                                }
                                i = 1;
                            }
                        }
                        fa4.b("BillingController.onPurchasesUpdatedInternal: " + purchase.a() + " purchase is purchased, but failed to extract saved payload");
                        ci0Var2 = this;
                        b2 = (byte) 0;
                        i3 = 1;
                        fi0Var2 = fi0Var;
                    }
                }
                lu7Var = null;
                if (lu7Var != null) {
                }
                fa4.b("BillingController.onPurchasesUpdatedInternal: " + purchase.a() + " purchase is purchased, but failed to extract saved payload");
                ci0Var2 = this;
                b2 = (byte) 0;
                i3 = 1;
                fi0Var2 = fi0Var;
            } else {
                b = b2;
                ci0Var = ci0Var2;
                StringBuilder sb2 = new StringBuilder("BillingController.onPurchasesUpdatedInternal: ");
                sb2.append(purchase.a());
                sb2.append(" purchase is (state=");
                i = 1;
                sb2.append(jSONObject.optInt("purchaseState", 1) != 4 ? 1 : 2);
                sb2.append("), (isAcknowledged=");
                sb2.append(jSONObject.optBoolean("acknowledged", true));
                de9.s(")", sb2);
            }
            ci0Var2 = ci0Var;
            i3 = i;
            b2 = b;
            fi0Var2 = fi0Var;
        }
        if (atomicInteger.get() != 0 || nn6Var == null) {
            return;
        }
        nn6Var.run();
    }

    public final void n(fi0 fi0Var, List list) {
        fa4.b("Billing: Query product details finished " + fi0Var + ", " + list);
        byte b = 0;
        if (fi0Var.a != 0) {
            r();
            int i = this.j - 1;
            this.j = i;
            if (i > 0) {
                gl.e3(new xh0(this, b), i == 2 ? 1000L : 10000L);
                return;
            }
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            kl8 kl8Var = (kl8) it.next();
            if (kl8Var.c.equals("telegram_premium")) {
                l = kl8Var;
            }
        }
        if (l == null) {
            r();
            return;
        }
        boolean z = n;
        int i2 = kk7.l5;
        if (z) {
            n = false;
            kk7.e().m(i2, new Object[0]);
        }
        kk7.e().m(i2, new Object[0]);
    }

    public final void o(List list, bi0 bi0Var) {
        if (!j()) {
            sc8.j("Billing: Controller should be ready for this call!");
            return;
        }
        ln8 ln8Var = new ln8((byte) 2, false);
        if (list == null || list.isEmpty()) {
            w26.j("Product list cannot be empty.");
            return;
        }
        HashSet hashSet = new HashSet();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            yw8 yw8Var = (yw8) it.next();
            if (!"play_pass_subs".equals(yw8Var.b)) {
                hashSet.add(yw8Var.b);
            }
        }
        byte b = 1;
        if (hashSet.size() > 1) {
            w26.j("All products should be of the same product type.");
            return;
        }
        efd p = efd.p(list);
        ln8Var.b = p;
        if (p == null) {
            w26.j("Product list must be set to a non empty list.");
            return;
        }
        this.d.c(new z24(ln8Var), new sg0(bi0Var, b));
    }

    public final void p(String str, wu8 wu8Var) {
        uh0 uh0Var = this.d;
        uh0Var.getClass();
        if (uh0.f(new p4d(uh0Var, wu8Var, str), 30000L, new tq4((Object) uh0Var, (Object) wu8Var, (byte) 18), uh0Var.r(), uh0Var.e()) == null) {
            fi0 u = uh0Var.u();
            uh0Var.x(25, 9, u);
            sed sedVar = efd.b;
            wu8Var.a(u, nhd.e);
        }
    }

    public final void q() {
        if (j()) {
            return;
        }
        try {
            hi0.a(this.c);
            if (w01.b()) {
                return;
            }
            this.d.d(this);
        } catch (Exception e) {
            fa4.g(e, true);
        }
    }
}

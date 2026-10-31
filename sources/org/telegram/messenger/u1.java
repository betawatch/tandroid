package org.telegram.messenger;

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
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_update;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class u1 implements c5.o, c5.c {
    public static final c5.p k;
    public static c5.m l;
    public static u1 m;
    public static boolean n;
    public static NumberFormat o;
    public final c5.b d;
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
        c5.a aVar = new c5.a();
        aVar.c = "subs";
        aVar.b = "telegram_premium";
        k = aVar.a();
    }

    public u1(Context context) {
        c5.b zVar;
        androidx.emoji2.text.f fVar = new androidx.emoji2.text.f(context);
        fVar.a = new oa.d(4);
        fVar.c = this;
        if (context == null) {
            throw new IllegalArgumentException("Please provide a valid Context.");
        }
        if (((u1) fVar.c) == null) {
            throw new IllegalArgumentException("Please provide a valid listener for purchases updates.");
        }
        if (((oa.d) fVar.a) == null) {
            throw new IllegalArgumentException("Pending purchases for one-time products must be supported.");
        }
        ((oa.d) fVar.a).getClass();
        if (((u1) fVar.c) != null) {
            oa.d dVar = (oa.d) fVar.a;
            u1 u1Var = (u1) fVar.c;
            zVar = fVar.a() ? new c5.z(dVar, context, u1Var, fVar) : new c5.b(dVar, context, u1Var, fVar);
        } else {
            oa.d dVar2 = (oa.d) fVar.a;
            zVar = fVar.a() ? new c5.z(dVar2, context, fVar) : new c5.b(dVar2, context, fVar);
        }
        this.d = zVar;
    }

    public static void c(u1 u1Var, c5.g gVar, List list) {
        f8.b("Billing: Query product details finished " + gVar + ", " + list);
        if (gVar.a != 0) {
            r();
            int i10 = u1Var.j - 1;
            u1Var.j = i10;
            if (i10 > 0) {
                i0.h3(new m1(u1Var, 0), i10 == 2 ? 1000L : 10000L);
                return;
            }
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            c5.m mVar = (c5.m) it.next();
            if (mVar.c.equals("telegram_premium")) {
                l = mVar;
            }
        }
        if (l == null) {
            r();
            return;
        }
        boolean z10 = n;
        int i11 = zs.j5;
        if (z10) {
            n = false;
            zs.e().m(i11, new Object[0]);
        }
        zs.e().m(i11, new Object[0]);
    }

    public static String g(String str, int i10, long j10, boolean z10) {
        if (str == null || str.isEmpty()) {
            return String.valueOf(j10);
        }
        if ("TON".equalsIgnoreCase(str)) {
            return "TON " + (j10 / 1.0E9d);
        }
        if ("XTR".equalsIgnoreCase(str)) {
            return i0.a.k(j10, ',', new StringBuilder("XTR "));
        }
        Currency currency = Currency.getInstance(str);
        if (currency == null) {
            return j10 + " " + str;
        }
        if (o == null) {
            o = NumberFormat.getCurrencyInstance();
        }
        o.setCurrency(currency);
        if (z10) {
            o.setMaximumFractionDigits(0);
            o.setMinimumFractionDigits(0);
            return o.format(Math.round(j10 / Math.pow(10.0d, i10)));
        }
        int defaultFractionDigits = currency.getDefaultFractionDigits();
        o.setMinimumFractionDigits(defaultFractionDigits);
        o.setMaximumFractionDigits(defaultFractionDigits);
        return o.format(j10 / Math.pow(10.0d, i10));
    }

    public static u1 i() {
        if (m == null) {
            m = new u1(w0.b);
        }
        return m;
    }

    public static String j(int i10) {
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

    public static void r() {
        if (n) {
            return;
        }
        n = true;
        zs.e().m(zs.j5, new Object[0]);
    }

    @Override // c5.c
    public final void a(c5.g gVar) {
        f8.b("Billing: Setup finished with result " + gVar);
        if (gVar.a != 0) {
            if (this.g) {
                return;
            }
            r();
            return;
        }
        this.g = false;
        this.j = 3;
        try {
            o(Collections.singletonList(k), new p1(this));
        } catch (Exception e) {
            f8.g(e, true);
        }
        p("inapp", new p1(this));
        p("subs", new p1(this));
        ArrayList arrayList = this.i;
        if (arrayList.isEmpty()) {
            return;
        }
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            i0.g3((Runnable) arrayList.get(i10));
        }
        arrayList.clear();
    }

    @Override // c5.c
    public final void b() {
        f8.b("Billing: Service disconnected");
        int i10 = this.g ? 15000 : 5000;
        this.g = true;
        i0.h3(new m1(this, 1), i10);
    }

    public final void d(String str, q0.a aVar) {
        this.a.put(str, aVar);
    }

    public final void e(Purchase purchase, TLRPC.InputStorePaymentPurpose inputStorePaymentPurpose, Runnable runnable) {
        if ((inputStorePaymentPurpose instanceof TLRPC.TL_inputStorePaymentGiftPremium) || (inputStorePaymentPurpose instanceof TLRPC.TL_inputStorePaymentPremiumGiftCode) || (inputStorePaymentPurpose instanceof TLRPC.TL_inputStorePaymentStarsTopup) || (inputStorePaymentPurpose instanceof TLRPC.TL_inputStorePaymentStarsGift) || (inputStorePaymentPurpose instanceof TLRPC.TL_inputStorePaymentPremiumGiveaway) || (inputStorePaymentPurpose instanceof TLRPC.TL_inputStorePaymentStarsGiveaway) || (inputStorePaymentPurpose instanceof TLRPC.TL_inputStorePaymentAuthCode)) {
            f8.b("BillingController consumeGiftPurchase " + inputStorePaymentPurpose + " " + purchase.a() + " " + purchase.c());
            String c10 = purchase.c();
            if (c10 == null) {
                throw new IllegalArgumentException("Purchase token must be set");
            }
            k6.h hVar = new k6.h(13);
            hVar.b = c10;
            this.d.a(new j(inputStorePaymentPurpose, purchase, runnable), hVar);
        }
    }

    public final String f(long j10, String str) {
        return g(str, h(str), j10, false);
    }

    public final int h(String str) {
        HashMap hashMap = this.c;
        rf.b.a(hashMap);
        return ((Integer) Map.-EL.getOrDefault(hashMap, str, 0)).intValue();
    }

    public final boolean k() {
        c5.b bVar = this.d;
        bVar.getClass();
        return bVar.o();
    }

    public final void l(Activity activity, c cVar, TLRPC.InputStorePaymentPurpose inputStorePaymentPurpose, List list) {
        m(activity, cVar, inputStorePaymentPurpose, list, null, false);
    }

    public final void m(final Activity activity, final c cVar, final TLRPC.InputStorePaymentPurpose inputStorePaymentPurpose, final List list, final ba.a aVar, boolean z10) {
        String encodeToString;
        if (!k() || activity == null) {
            return;
        }
        if (((inputStorePaymentPurpose instanceof TLRPC.TL_inputStorePaymentGiftPremium) || (inputStorePaymentPurpose instanceof TLRPC.TL_inputStorePaymentStarsTopup) || (inputStorePaymentPurpose instanceof TLRPC.TL_inputStorePaymentStarsGift)) && !z10) {
            f8.b("BillingController.launchBillingFlow, checking consumables");
            p("inapp", new c5.n() { // from class: org.telegram.messenger.n1
                /* JADX WARN: Code restructure failed: missing block: B:28:0x0032, code lost:
                
                    continue;
                 */
                @Override // c5.n
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final void b(c5.g gVar, List list2) {
                    int i10 = gVar.a;
                    u1 u1Var = u1.this;
                    Activity activity2 = activity;
                    c cVar2 = cVar;
                    TLRPC.InputStorePaymentPurpose inputStorePaymentPurpose2 = inputStorePaymentPurpose;
                    List list3 = list;
                    ba.a aVar2 = aVar;
                    if (i10 != 0) {
                        StringBuilder sb2 = new StringBuilder("BillingController.launchBillingFlow, checked consumables: ");
                        sb2.append(gVar.a);
                        sb2.append(" ");
                        a1.g.z(gVar.c, sb2);
                        u1Var.m(activity2, cVar2, inputStorePaymentPurpose2, list3, aVar2, false);
                        return;
                    }
                    f8.b("BillingController.launchBillingFlow, checked consumables: OK");
                    final ek ekVar = new ek(u1Var, activity2, cVar2, inputStorePaymentPurpose2, list3, aVar2, 2);
                    final AtomicInteger atomicInteger = new AtomicInteger(0);
                    final ArrayList arrayList = new ArrayList();
                    Iterator it = list2.iterator();
                    while (it.hasNext()) {
                        final Purchase purchase = (Purchase) it.next();
                        if (purchase.c.optBoolean("acknowledged", true)) {
                            Iterator it2 = list3.iterator();
                            while (true) {
                                if (it2.hasNext()) {
                                    final String str = ((c5.d) it2.next()).a.c;
                                    if (purchase.b().contains(str)) {
                                        atomicInteger.incrementAndGet();
                                        f8.b("BillingController.launchBillingFlow, consuming " + purchase.c());
                                        c5.b bVar = u1Var.d;
                                        String c10 = purchase.c();
                                        if (c10 == null) {
                                            throw new IllegalArgumentException("Purchase token must be set");
                                        }
                                        k6.h hVar = new k6.h(13);
                                        hVar.b = c10;
                                        bVar.a(new c5.h() { // from class: org.telegram.messenger.o1
                                            @Override // c5.h
                                            public final void a(c5.g gVar2) {
                                                int i11 = gVar2.a;
                                                Purchase purchase2 = Purchase.this;
                                                ArrayList arrayList2 = arrayList;
                                                AtomicInteger atomicInteger2 = atomicInteger;
                                                ek ekVar2 = ekVar;
                                                if (i11 == 0) {
                                                    f8.b("BillingController.launchBillingFlow, consumed " + purchase2.c() + ": OK");
                                                    arrayList2.add(str);
                                                    if (atomicInteger2.get() == arrayList2.size()) {
                                                        ekVar2.run();
                                                        return;
                                                    }
                                                    return;
                                                }
                                                f8.b("BillingController.launchBillingFlow, consumed " + purchase2.c() + ": " + gVar2.a + " " + gVar2.c);
                                                arrayList2.add(null);
                                                if (atomicInteger2.get() == arrayList2.size()) {
                                                    ekVar2.run();
                                                }
                                            }
                                        }, hVar);
                                    }
                                }
                            }
                        } else {
                            atomicInteger.incrementAndGet();
                            c3.a a2 = c5.g.a();
                            a2.b = 0;
                            u1Var.n(a2.a(), Collections.singletonList(purchase), new mg(arrayList, atomicInteger, ekVar, 8));
                        }
                    }
                    if (atomicInteger.get() == 0) {
                        ekVar.run();
                    }
                }
            });
            return;
        }
        if (z10) {
            f8.b("BillingController.launchBillingFlow, consumables checked, launching flow...");
        }
        boolean p5 = d20.i(cVar.a).p();
        boolean z11 = false;
        if (p5) {
            encodeToString = Base64.encodeToString(String.valueOf(d20.i(cVar.a).e()).getBytes(d9.j.a), 0);
        } else {
            encodeToString = Base64.encodeToString(("account-" + cVar.a).getBytes(d9.j.a), 0);
        }
        long nextLong = Utilities.b.nextLong();
        f8.b("BillingUtilities.savePurpose id=" + nextLong + " paymentPurpose=" + inputStorePaymentPurpose);
        SerializedData serializedData = new SerializedData(8);
        serializedData.writeInt64(nextLong);
        String f7 = Utilities.f(serializedData.toByteArray());
        serializedData.cleanup();
        f8.b("BillingUtilities.savePurpose id_hex=" + f7 + " paymentPurpose=" + inputStorePaymentPurpose);
        rf.a aVar2 = new rf.a();
        aVar2.b = nextLong;
        aVar2.a = 1;
        aVar2.c = inputStorePaymentPurpose;
        SerializedData serializedData2 = new SerializedData(aVar2.getObjectSize());
        aVar2.serializeToStream(serializedData2);
        String f10 = Utilities.f(serializedData2.toByteArray());
        serializedData2.cleanup();
        if (aVar2.getObjectSize() > 28) {
            f8.b("BillingUtilities.savePurpose: sending short version, original size is " + aVar2.getObjectSize() + " bytes");
            aVar2.a = 0;
            aVar2.c = null;
        }
        SerializedData serializedData3 = new SerializedData(aVar2.getObjectSize());
        aVar2.serializeToStream(serializedData3);
        String f11 = Utilities.f(serializedData3.toByteArray());
        serializedData3.cleanup();
        w0.b.getSharedPreferences("purchases", 0).edit().putString(f7, f10).apply();
        f8.b("BillingUtilities.savePurpose: saved {" + f10 + "} under " + f7);
        StringBuilder sb2 = new StringBuilder("BillingUtilities.savePurpose: but sending {");
        sb2.append(f11);
        sb2.append("}");
        f8.b(sb2.toString());
        c5.e eVar = new c5.e();
        eVar.a = 0;
        eVar.b = true;
        ArrayList arrayList = new ArrayList(list);
        if (aVar != null) {
            eVar = new c5.e();
            eVar.c = aVar.b;
            eVar.a = aVar.c;
        }
        c5.b bVar = this.d;
        boolean isEmpty = arrayList.isEmpty();
        if (isEmpty) {
            throw new IllegalArgumentException("Details of the products must be provided.");
        }
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            if (((c5.d) obj) == null) {
                throw new IllegalArgumentException("ProductDetailsParams cannot be null.");
            }
        }
        c5.f fVar = new c5.f();
        if (!isEmpty && !((c5.d) arrayList.get(0)).a.b.optString("packageName").isEmpty()) {
            z11 = true;
        }
        fVar.a = z11;
        fVar.b = encodeToString;
        fVar.c = f11;
        boolean z12 = true;
        if (TextUtils.isEmpty((String) eVar.c) && TextUtils.isEmpty(null)) {
            z12 = false;
        }
        boolean isEmpty2 = TextUtils.isEmpty(null);
        if (z12 && !isEmpty2) {
            throw new IllegalArgumentException("Please provide Old SKU purchase information(token/id) or original external transaction id, not both.");
        }
        if (!eVar.b && !z12 && isEmpty2) {
            throw new IllegalArgumentException("Old SKU purchase information(token/id) or original external transaction id must be provided.");
        }
        ba.a aVar3 = new ba.a(1);
        aVar3.b = (String) eVar.c;
        aVar3.c = eVar.a;
        fVar.d = aVar3;
        fVar.f = new ArrayList();
        fVar.e = com.google.android.gms.internal.play_billing.r.t(arrayList);
        int i11 = bVar.b(activity, fVar).a;
        if (i11 != 0) {
            StringBuilder sb3 = new StringBuilder("Billing: Launch Error: ");
            sb3.append(i11);
            sb3.append(", ");
            sb3.append(encodeToString);
            sb3.append(", ");
            a1.g.z(f11, sb3);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x019a A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void n(c5.g gVar, List list, final mg mgVar) {
        int i10;
        u1 u1Var;
        TLRPC.InputStorePaymentPurpose inputStorePaymentPurpose;
        c cVar;
        q0.b bVar;
        u1 u1Var2 = this;
        final c5.g gVar2 = gVar;
        f8.b("Billing: Purchases updated: " + gVar2 + ", " + list);
        int i11 = gVar2.a;
        int i12 = 1;
        if (i11 != 0) {
            if (i11 == 1) {
                TLRPC.TL_help_saveAppLog tL_help_saveAppLog = new TLRPC.TL_help_saveAppLog();
                TLRPC.TL_inputAppEvent tL_inputAppEvent = new TLRPC.TL_inputAppEvent();
                tL_inputAppEvent.time = ConnectionsManager.getInstance(d20.s0).getCurrentTime();
                tL_inputAppEvent.type = "premium.promo_screen_fail";
                tL_inputAppEvent.data = new TLRPC.TL_jsonNull();
                tL_help_saveAppLog.events.add(tL_inputAppEvent);
                ConnectionsManager.getInstance(d20.s0).sendRequest(tL_help_saveAppLog, new ag.c3(4));
            }
            Runnable runnable = u1Var2.h;
            if (runnable != null) {
                runnable.run();
                u1Var2.h = null;
            }
            if (mgVar != null) {
                mgVar.run();
                return;
            }
            return;
        }
        if (list == null || list.isEmpty()) {
            if (mgVar != null) {
                mgVar.run();
                return;
            }
            return;
        }
        final AtomicInteger atomicInteger = new AtomicInteger(0);
        final AtomicInteger atomicInteger2 = new AtomicInteger(0);
        u1Var2.e = null;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            final Purchase purchase = (Purchase) it.next();
            ArrayList b10 = purchase.b();
            JSONObject jSONObject = purchase.c;
            if (b10.contains("telegram_premium")) {
                u1Var2.e = purchase.a();
                u1Var2.f = purchase.c();
            }
            String c10 = purchase.c();
            Set set = u1Var2.b;
            if (set.contains(c10)) {
                i10 = i12;
                u1Var = u1Var2;
                f8.b("BillingController.onPurchasesUpdatedInternal: " + purchase.a() + " purchase is already requesting...");
            } else if (jSONObject.optInt("purchaseState", i12) != 4) {
                String optString = jSONObject.optString("obfuscatedAccountId");
                String optString2 = jSONObject.optString("obfuscatedProfileId");
                c5.a aVar = (optString == null && optString2 == null) ? null : new c5.a(0, optString, optString2);
                if (aVar == null) {
                    f8.b("Billing: Extract payload. No AccountIdentifiers");
                } else {
                    String str = aVar.b;
                    String str2 = aVar.c;
                    if (str == null || str.isEmpty() || str2 == null || str2.isEmpty()) {
                        f8.b("Billing: Extract payload. Empty AccountIdentifiers");
                    } else {
                        try {
                            inputStorePaymentPurpose = rf.b.b(str2);
                        } catch (Exception e) {
                            f8.e("Billing: Extract payload, failed to get purpose", e);
                            inputStorePaymentPurpose = null;
                        }
                        try {
                            String str3 = new String(Base64.decode(str, 0), d9.j.a);
                            f8.b("Billing: Extract payload. obfuscatedAccountIdString=".concat(str3));
                            if (str3.startsWith("account-")) {
                                cVar = c.a(Integer.parseInt(str3.substring(8)));
                            } else {
                                long parseLong = Long.parseLong(str3);
                                int i13 = 0;
                                while (true) {
                                    if (i13 >= 4) {
                                        cVar = null;
                                        break;
                                    }
                                    c a2 = c.a(i13);
                                    if (d20.i(a2.a).e() == parseLong) {
                                        cVar = a2;
                                        break;
                                    }
                                    i13++;
                                }
                                if (cVar == null) {
                                    f8.b("Billing: Extract payload. AccountInstance not found, accountId=" + parseLong);
                                }
                            }
                            bVar = new q0.b(cVar, inputStorePaymentPurpose);
                        } catch (Exception e7) {
                            f8.e("Billing: Extract Payload", e7);
                        }
                        if (bVar == null) {
                            Object obj = bVar.a;
                            Object obj2 = bVar.b;
                            if (obj != null && obj2 != null) {
                                if (jSONObject.optBoolean("acknowledged", true)) {
                                    u1Var = this;
                                    f8.b("BillingController.onPurchasesUpdatedInternal: " + purchase.a() + " purchase is purchased and acknowledged: consuming");
                                    atomicInteger.incrementAndGet();
                                    u1Var.e(purchase, (TLRPC.InputStorePaymentPurpose) obj2, new l1(atomicInteger2, atomicInteger, mgVar, 2));
                                } else {
                                    StringBuilder sb2 = new StringBuilder("BillingController.onPurchasesUpdatedInternal: ");
                                    sb2.append(purchase.a());
                                    sb2.append(" purchase is purchased and not acknowledged: assigning (accountId=");
                                    final c cVar2 = (c) obj;
                                    int i14 = cVar2.a;
                                    sb2.append(i14);
                                    sb2.append(") (purpose=");
                                    sb2.append(obj2);
                                    sb2.append(")");
                                    f8.b(sb2.toString());
                                    set.add(purchase.c());
                                    final TLRPC.TL_payments_assignPlayMarketTransaction tL_payments_assignPlayMarketTransaction = new TLRPC.TL_payments_assignPlayMarketTransaction();
                                    TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
                                    tL_payments_assignPlayMarketTransaction.receipt = tL_dataJSON;
                                    tL_dataJSON.data = purchase.a;
                                    tL_payments_assignPlayMarketTransaction.purpose = (TLRPC.InputStorePaymentPurpose) obj2;
                                    final org.telegram.ui.ActionBar.x1[] x1VarArr = new org.telegram.ui.ActionBar.x1[1];
                                    i0.g3(new q1(x1VarArr, 0));
                                    atomicInteger.incrementAndGet();
                                    int i15 = tL_payments_assignPlayMarketTransaction.purpose instanceof TLRPC.TL_inputStorePaymentAuthCode ? 65608 : 65600;
                                    ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i14);
                                    RequestDelegate requestDelegate = new RequestDelegate() { // from class: org.telegram.messenger.r1
                                        @Override // org.telegram.tgnet.RequestDelegate
                                        public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                                            int i16;
                                            u1 u1Var3 = u1.this;
                                            org.telegram.ui.ActionBar.x1[] x1VarArr2 = x1VarArr;
                                            Purchase purchase2 = purchase;
                                            TLRPC.TL_payments_assignPlayMarketTransaction tL_payments_assignPlayMarketTransaction2 = tL_payments_assignPlayMarketTransaction;
                                            c cVar3 = cVar2;
                                            c5.g gVar3 = gVar2;
                                            AtomicInteger atomicInteger3 = atomicInteger2;
                                            AtomicInteger atomicInteger4 = atomicInteger;
                                            Runnable runnable2 = mgVar;
                                            i0.g3(new q1(x1VarArr2, 1));
                                            u1Var3.b.remove(purchase2.c());
                                            if (!(tLObject instanceof TLRPC.Updates)) {
                                                StringBuilder sb3 = new StringBuilder("BillingController.onPurchasesUpdatedInternal: ");
                                                sb3.append(purchase2.a());
                                                sb3.append(" purchase is purchased and failed to assign: ");
                                                a1.g.z(tL_error == null ? null : tL_error.text, sb3);
                                                Runnable runnable3 = u1Var3.h;
                                                if (runnable3 != null) {
                                                    runnable3.run();
                                                    u1Var3.h = null;
                                                }
                                                if (tL_error != null) {
                                                    i16 = 1;
                                                    zs.e().m(zs.k5, tL_payments_assignPlayMarketTransaction2, tL_error);
                                                } else {
                                                    i16 = 1;
                                                }
                                                i0.g3(new l1(atomicInteger3, atomicInteger4, runnable2, i16));
                                                return;
                                            }
                                            f8.b("BillingController.onPurchasesUpdatedInternal: " + purchase2.a() + " purchase is purchased and now assigned");
                                            if (tL_payments_assignPlayMarketTransaction2.purpose instanceof TLRPC.TL_inputStorePaymentAuthCode) {
                                                ArrayList z02 = vp.z0((TLRPC.Updates) tLObject, TL_update.TL_updateSentPhoneCode.class);
                                                int size = z02.size();
                                                int i17 = 0;
                                                while (i17 < size) {
                                                    Object obj3 = z02.get(i17);
                                                    i17++;
                                                    i0.g3(new mg(cVar3, tL_payments_assignPlayMarketTransaction2, (TL_update.TL_updateSentPhoneCode) obj3, 9));
                                                }
                                            }
                                            vp.r1(cVar3.a).L3((TLRPC.Updates) tLObject, false);
                                            ArrayList b11 = purchase2.b();
                                            int size2 = b11.size();
                                            int i18 = 0;
                                            while (i18 < size2) {
                                                Object obj4 = b11.get(i18);
                                                i18++;
                                                q0.a aVar2 = (q0.a) u1Var3.a.remove((String) obj4);
                                                if (aVar2 != null) {
                                                    aVar2.accept(gVar3);
                                                }
                                            }
                                            u1Var3.e(purchase2, tL_payments_assignPlayMarketTransaction2.purpose, new l1(atomicInteger3, atomicInteger4, runnable2, 0));
                                            JSONObject jSONObject2 = purchase2.c;
                                            String optString3 = jSONObject2.optString("obfuscatedAccountId");
                                            String optString4 = jSONObject2.optString("obfuscatedProfileId");
                                            String str4 = ((optString3 == null && optString4 == null) ? null : new c5.a(0, optString3, optString4)).c;
                                            try {
                                                f8.b("BillingUtilities.clearPurpose: got {" + str4 + "}");
                                                SerializedData serializedData = new SerializedData(Utilities.v(str4));
                                                rf.a a10 = rf.a.a(serializedData.readInt32(true), serializedData);
                                                SerializedData serializedData2 = new SerializedData(8);
                                                serializedData2.writeInt64(a10.b);
                                                String f7 = Utilities.f(serializedData2.toByteArray());
                                                serializedData2.cleanup();
                                                f8.b("BillingUtilities.clearPurpose: id_hex = ".concat(f7));
                                                w0.b.getSharedPreferences("purchases", 0).edit().remove(f7).apply();
                                            } catch (Exception e10) {
                                                f8.g(e10, true);
                                            }
                                        }
                                    };
                                    u1Var = this;
                                    connectionsManager.sendRequest(tL_payments_assignPlayMarketTransaction, requestDelegate, i15);
                                }
                                i10 = 1;
                            }
                        }
                        f8.b("BillingController.onPurchasesUpdatedInternal: " + purchase.a() + " purchase is purchased, but failed to extract saved payload");
                        gVar2 = gVar;
                        u1Var2 = this;
                        i12 = 1;
                    }
                }
                bVar = null;
                if (bVar == null) {
                }
                f8.b("BillingController.onPurchasesUpdatedInternal: " + purchase.a() + " purchase is purchased, but failed to extract saved payload");
                gVar2 = gVar;
                u1Var2 = this;
                i12 = 1;
            } else {
                u1Var = u1Var2;
                StringBuilder sb3 = new StringBuilder("BillingController.onPurchasesUpdatedInternal: ");
                sb3.append(purchase.a());
                sb3.append(" purchase is (state=");
                i10 = 1;
                sb3.append(jSONObject.optInt("purchaseState", 1) != 4 ? 1 : 2);
                sb3.append("), (isAcknowledged=");
                sb3.append(jSONObject.optBoolean("acknowledged", true));
                sb3.append(")");
                f8.b(sb3.toString());
            }
            u1Var2 = u1Var;
            i12 = i10;
            gVar2 = gVar;
        }
        if (atomicInteger.get() != 0 || mgVar == null) {
            return;
        }
        mgVar.run();
    }

    public final void o(List list, t1 t1Var) {
        if (!k()) {
            throw new IllegalStateException("Billing: Controller should be ready for this call!");
        }
        a6.i iVar = new a6.i(13);
        if (list == null || list.isEmpty()) {
            throw new IllegalArgumentException("Product list cannot be empty.");
        }
        HashSet hashSet = new HashSet();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            c5.p pVar = (c5.p) it.next();
            if (!"play_pass_subs".equals(pVar.b)) {
                hashSet.add(pVar.b);
            }
        }
        if (hashSet.size() > 1) {
            throw new IllegalArgumentException("All products should be of the same product type.");
        }
        com.google.android.gms.internal.play_billing.r t10 = com.google.android.gms.internal.play_billing.r.t(list);
        iVar.b = t10;
        if (t10 == null) {
            throw new IllegalArgumentException("Product list must be set to a non empty list.");
        }
        this.d.c(new a4.l(iVar), new s1(t1Var, 0));
    }

    public final void p(String str, c5.n nVar) {
        c5.b bVar = this.d;
        bVar.getClass();
        if (c5.b.f(new c5.r(bVar, nVar, str), 30000L, new j9.u(6, bVar, nVar), bVar.r(), bVar.e()) == null) {
            c5.g u10 = bVar.u();
            bVar.y(25, 9, u10);
            com.google.android.gms.internal.play_billing.p pVar = com.google.android.gms.internal.play_billing.r.b;
            nVar.b(u10, com.google.android.gms.internal.play_billing.v.e);
        }
    }

    public final void q() {
        if (k()) {
            return;
        }
        try {
            rf.b.a(this.c);
            if (v2.b()) {
                return;
            }
            this.d.d(this);
        } catch (Exception e) {
            f8.g(e, true);
        }
    }
}

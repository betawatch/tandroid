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

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public final class r1 implements f5.n, f5.c {
    public static final f5.o k;
    public static f5.l l;
    public static r1 m;
    public static boolean n;
    public static NumberFormat o;
    public final f5.b d;
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
        f5.a aVar = new f5.a();
        aVar.b = "subs";
        aVar.a = "telegram_premium";
        k = aVar.a();
    }

    public r1(Context context) {
        f5.b wVar;
        androidx.emoji2.text.f fVar = new androidx.emoji2.text.f(context);
        fVar.a = new sa.d(8);
        fVar.c = this;
        if (context == null) {
            throw new IllegalArgumentException("Please provide a valid Context.");
        }
        if (((r1) fVar.c) == null) {
            throw new IllegalArgumentException("Please provide a valid listener for purchases updates.");
        }
        if (((sa.d) fVar.a) == null) {
            throw new IllegalArgumentException("Pending purchases for one-time products must be supported.");
        }
        ((sa.d) fVar.a).getClass();
        if (((r1) fVar.c) != null) {
            sa.d dVar = (sa.d) fVar.a;
            r1 r1Var = (r1) fVar.c;
            wVar = fVar.a() ? new f5.w(dVar, context, r1Var, fVar) : new f5.b(dVar, context, r1Var, fVar);
        } else {
            sa.d dVar2 = (sa.d) fVar.a;
            wVar = fVar.a() ? new f5.w(dVar2, context, fVar) : new f5.b(dVar2, context, fVar);
        }
        this.d = wVar;
    }

    public static void c(r1 r1Var, f5.f fVar, List list) {
        a8.b("Billing: Query product details finished " + fVar + ", " + list);
        if (fVar.a != 0) {
            r();
            int i7 = r1Var.j - 1;
            r1Var.j = i7;
            if (i7 > 0) {
                g0.i3(new k1(r1Var, 0), i7 == 2 ? 1000L : 10000L);
                return;
            }
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            f5.l lVar = (f5.l) it.next();
            if (lVar.c.equals("telegram_premium")) {
                l = lVar;
            }
        }
        if (l == null) {
            r();
            return;
        }
        boolean z9 = n;
        int i10 = qs.j5;
        if (z9) {
            n = false;
            qs.e().m(i10, new Object[0]);
        }
        qs.e().m(i10, new Object[0]);
    }

    public static String g(String str, int i7, long j3, boolean z9) {
        if (str == null || str.isEmpty()) {
            return String.valueOf(j3);
        }
        if ("TON".equalsIgnoreCase(str)) {
            return "TON " + (j3 / 1.0E9d);
        }
        if ("XTR".equalsIgnoreCase(str)) {
            return jg.g.m(j3, ',', new StringBuilder("XTR "));
        }
        Currency currency = Currency.getInstance(str);
        if (currency == null) {
            return j3 + " " + str;
        }
        if (o == null) {
            o = NumberFormat.getCurrencyInstance();
        }
        o.setCurrency(currency);
        if (z9) {
            o.setMaximumFractionDigits(0);
            o.setMinimumFractionDigits(0);
            return o.format(Math.round(j3 / Math.pow(10.0d, i7)));
        }
        int defaultFractionDigits = currency.getDefaultFractionDigits();
        o.setMinimumFractionDigits(defaultFractionDigits);
        o.setMaximumFractionDigits(defaultFractionDigits);
        return o.format(j3 / Math.pow(10.0d, i7));
    }

    public static r1 i() {
        if (m == null) {
            m = new r1(t0.b);
        }
        return m;
    }

    public static String j(int i7) {
        if (i7 == 12) {
            return "NETWORK_ERROR";
        }
        switch (i7) {
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
        qs.e().m(qs.j5, new Object[0]);
    }

    @Override // f5.c
    public final void a(f5.f fVar) {
        a8.b("Billing: Setup finished with result " + fVar);
        if (fVar.a != 0) {
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
        } catch (Exception e10) {
            a8.g(e10, true);
        }
        p("inapp", new p1(this));
        p("subs", new p1(this));
        ArrayList arrayList = this.i;
        if (arrayList.isEmpty()) {
            return;
        }
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            g0.h3((Runnable) arrayList.get(i7));
        }
        arrayList.clear();
    }

    @Override // f5.c
    public final void b() {
        a8.b("Billing: Service disconnected");
        int i7 = this.g ? 15000 : 5000;
        this.g = true;
        g0.i3(new k1(this, 1), i7);
    }

    public final void d(String str, q0.a aVar) {
        this.a.put(str, aVar);
    }

    public final void e(Purchase purchase, TLRPC.InputStorePaymentPurpose inputStorePaymentPurpose, Runnable runnable) {
        if ((inputStorePaymentPurpose instanceof TLRPC.TL_inputStorePaymentGiftPremium) || (inputStorePaymentPurpose instanceof TLRPC.TL_inputStorePaymentPremiumGiftCode) || (inputStorePaymentPurpose instanceof TLRPC.TL_inputStorePaymentStarsTopup) || (inputStorePaymentPurpose instanceof TLRPC.TL_inputStorePaymentStarsGift) || (inputStorePaymentPurpose instanceof TLRPC.TL_inputStorePaymentPremiumGiveaway) || (inputStorePaymentPurpose instanceof TLRPC.TL_inputStorePaymentStarsGiveaway) || (inputStorePaymentPurpose instanceof TLRPC.TL_inputStorePaymentAuthCode)) {
            a8.b("BillingController consumeGiftPurchase " + inputStorePaymentPurpose + " " + purchase.a() + " " + purchase.c());
            String c10 = purchase.c();
            if (c10 == null) {
                throw new IllegalArgumentException("Purchase token must be set");
            }
            aa.c0 c0Var = new aa.c0();
            c0Var.a = c10;
            this.d.a(c0Var, new i(inputStorePaymentPurpose, purchase, runnable));
        }
    }

    public final String f(long j3, String str) {
        return g(str, h(str), j3, false);
    }

    public final int h(String str) {
        HashMap hashMap = this.c;
        bg.b.a(hashMap);
        return ((Integer) Map.-EL.getOrDefault(hashMap, str, 0)).intValue();
    }

    public final boolean k() {
        f5.b bVar = this.d;
        bVar.getClass();
        return bVar.o();
    }

    public final void l(Activity activity, c cVar, TLRPC.InputStorePaymentPurpose inputStorePaymentPurpose, List list) {
        m(activity, cVar, inputStorePaymentPurpose, list, null, false);
    }

    public final void m(final Activity activity, final c cVar, final TLRPC.InputStorePaymentPurpose inputStorePaymentPurpose, final List list, final com.google.android.gms.internal.clearcut.z0 z0Var, boolean z9) {
        String encodeToString;
        if (!k() || activity == null) {
            return;
        }
        if (((inputStorePaymentPurpose instanceof TLRPC.TL_inputStorePaymentGiftPremium) || (inputStorePaymentPurpose instanceof TLRPC.TL_inputStorePaymentStarsTopup) || (inputStorePaymentPurpose instanceof TLRPC.TL_inputStorePaymentStarsGift)) && !z9) {
            a8.b("BillingController.launchBillingFlow, checking consumables");
            p("inapp", new f5.m() { // from class: org.telegram.messenger.l1
                /* JADX WARN: Code restructure failed: missing block: B:28:0x0032, code lost:
                
                    continue;
                 */
                @Override // f5.m
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final void b(f5.f fVar, List list2) {
                    int i7 = fVar.a;
                    r1 r1Var = r1.this;
                    Activity activity2 = activity;
                    c cVar2 = cVar;
                    TLRPC.InputStorePaymentPurpose inputStorePaymentPurpose2 = inputStorePaymentPurpose;
                    List list3 = list;
                    com.google.android.gms.internal.clearcut.z0 z0Var2 = z0Var;
                    if (i7 != 0) {
                        StringBuilder sb2 = new StringBuilder("BillingController.launchBillingFlow, checked consumables: ");
                        sb2.append(fVar.a);
                        sb2.append(" ");
                        org.telegram.ui.Cells.f1.u(fVar.c, sb2);
                        r1Var.m(activity2, cVar2, inputStorePaymentPurpose2, list3, z0Var2, false);
                        return;
                    }
                    a8.b("BillingController.launchBillingFlow, checked consumables: OK");
                    final yj yjVar = new yj(r1Var, activity2, cVar2, inputStorePaymentPurpose2, list3, z0Var2, 2);
                    final AtomicInteger atomicInteger = new AtomicInteger(0);
                    final ArrayList arrayList = new ArrayList();
                    Iterator it = list2.iterator();
                    while (it.hasNext()) {
                        final Purchase purchase = (Purchase) it.next();
                        if (purchase.c.optBoolean("acknowledged", true)) {
                            Iterator it2 = list3.iterator();
                            while (true) {
                                if (it2.hasNext()) {
                                    final String str = ((f5.d) it2.next()).a.c;
                                    if (purchase.b().contains(str)) {
                                        atomicInteger.incrementAndGet();
                                        a8.b("BillingController.launchBillingFlow, consuming " + purchase.c());
                                        f5.b bVar = r1Var.d;
                                        String c10 = purchase.c();
                                        if (c10 == null) {
                                            throw new IllegalArgumentException("Purchase token must be set");
                                        }
                                        aa.c0 c0Var = new aa.c0();
                                        c0Var.a = c10;
                                        bVar.a(c0Var, new f5.g() { // from class: org.telegram.messenger.m1
                                            @Override // f5.g
                                            public final void a(f5.f fVar2) {
                                                int i10 = fVar2.a;
                                                Purchase purchase2 = Purchase.this;
                                                ArrayList arrayList2 = arrayList;
                                                AtomicInteger atomicInteger2 = atomicInteger;
                                                yj yjVar2 = yjVar;
                                                if (i10 == 0) {
                                                    a8.b("BillingController.launchBillingFlow, consumed " + purchase2.c() + ": OK");
                                                    arrayList2.add(str);
                                                    if (atomicInteger2.get() == arrayList2.size()) {
                                                        yjVar2.run();
                                                        return;
                                                    }
                                                    return;
                                                }
                                                a8.b("BillingController.launchBillingFlow, consumed " + purchase2.c() + ": " + fVar2.a + " " + fVar2.c);
                                                arrayList2.add(null);
                                                if (atomicInteger2.get() == arrayList2.size()) {
                                                    yjVar2.run();
                                                }
                                            }
                                        });
                                    }
                                }
                            }
                        } else {
                            atomicInteger.incrementAndGet();
                            f3.a a10 = f5.f.a();
                            a10.b = 0;
                            r1Var.n(a10.a(), Collections.singletonList(purchase), new ng(arrayList, atomicInteger, yjVar, 8));
                        }
                    }
                    if (atomicInteger.get() == 0) {
                        yjVar.run();
                    }
                }
            });
            return;
        }
        if (z9) {
            a8.b("BillingController.launchBillingFlow, consumables checked, launching flow...");
        }
        boolean p10 = p10.i(cVar.a).p();
        boolean z10 = false;
        if (p10) {
            encodeToString = Base64.encodeToString(String.valueOf(p10.i(cVar.a).e()).getBytes(g9.j.a), 0);
        } else {
            encodeToString = Base64.encodeToString(("account-" + cVar.a).getBytes(g9.j.a), 0);
        }
        long nextLong = Utilities.b.nextLong();
        a8.b("BillingUtilities.savePurpose id=" + nextLong + " paymentPurpose=" + inputStorePaymentPurpose);
        SerializedData serializedData = new SerializedData(8);
        serializedData.writeInt64(nextLong);
        String f10 = Utilities.f(serializedData.toByteArray());
        serializedData.cleanup();
        a8.b("BillingUtilities.savePurpose id_hex=" + f10 + " paymentPurpose=" + inputStorePaymentPurpose);
        bg.a aVar = new bg.a();
        aVar.b = nextLong;
        aVar.a = 1;
        aVar.c = inputStorePaymentPurpose;
        SerializedData serializedData2 = new SerializedData(aVar.getObjectSize());
        aVar.serializeToStream(serializedData2);
        String f11 = Utilities.f(serializedData2.toByteArray());
        serializedData2.cleanup();
        if (aVar.getObjectSize() > 28) {
            a8.b("BillingUtilities.savePurpose: sending short version, original size is " + aVar.getObjectSize() + " bytes");
            aVar.a = 0;
            aVar.c = null;
        }
        SerializedData serializedData3 = new SerializedData(aVar.getObjectSize());
        aVar.serializeToStream(serializedData3);
        String f12 = Utilities.f(serializedData3.toByteArray());
        serializedData3.cleanup();
        t0.b.getSharedPreferences("purchases", 0).edit().putString(f10, f11).apply();
        a8.b("BillingUtilities.savePurpose: saved {" + f11 + "} under " + f10);
        StringBuilder sb2 = new StringBuilder("BillingUtilities.savePurpose: but sending {");
        sb2.append(f12);
        sb2.append("}");
        a8.b(sb2.toString());
        bg.w0 w0Var = new bg.w0();
        w0Var.b = 0;
        w0Var.a = true;
        ArrayList arrayList = new ArrayList(list);
        if (z0Var != null) {
            w0Var = new bg.w0();
            w0Var.c = z0Var.c;
            w0Var.b = z0Var.b;
        }
        f5.b bVar = this.d;
        boolean isEmpty = arrayList.isEmpty();
        if (isEmpty) {
            throw new IllegalArgumentException("Details of the products must be provided.");
        }
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            if (((f5.d) obj) == null) {
                throw new IllegalArgumentException("ProductDetailsParams cannot be null.");
            }
        }
        f5.e eVar = new f5.e();
        if (!isEmpty && !((f5.d) arrayList.get(0)).a.b.optString("packageName").isEmpty()) {
            z10 = true;
        }
        eVar.a = z10;
        eVar.b = encodeToString;
        eVar.c = f12;
        boolean z11 = true;
        if (TextUtils.isEmpty((String) w0Var.c) && TextUtils.isEmpty(null)) {
            z11 = false;
        }
        boolean isEmpty2 = TextUtils.isEmpty(null);
        if (z11 && !isEmpty2) {
            throw new IllegalArgumentException("Please provide Old SKU purchase information(token/id) or original external transaction id, not both.");
        }
        if (!w0Var.a && !z11 && isEmpty2) {
            throw new IllegalArgumentException("Old SKU purchase information(token/id) or original external transaction id must be provided.");
        }
        com.google.android.gms.internal.clearcut.z0 z0Var2 = new com.google.android.gms.internal.clearcut.z0(2);
        z0Var2.c = (String) w0Var.c;
        z0Var2.b = w0Var.b;
        eVar.d = z0Var2;
        eVar.f = new ArrayList();
        eVar.e = com.google.android.gms.internal.play_billing.r.p(arrayList);
        int i10 = bVar.b(activity, eVar).a;
        if (i10 != 0) {
            StringBuilder sb3 = new StringBuilder("Billing: Launch Error: ");
            sb3.append(i10);
            sb3.append(", ");
            sb3.append(encodeToString);
            sb3.append(", ");
            org.telegram.ui.Cells.f1.u(f12, sb3);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x019b A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void n(f5.f fVar, List list, final ng ngVar) {
        int i7;
        r1 r1Var;
        TLRPC.InputStorePaymentPurpose inputStorePaymentPurpose;
        c cVar;
        q0.b bVar;
        r1 r1Var2 = this;
        final f5.f fVar2 = fVar;
        a8.b("Billing: Purchases updated: " + fVar2 + ", " + list);
        int i10 = fVar2.a;
        int i11 = 1;
        if (i10 != 0) {
            if (i10 == 1) {
                TLRPC.TL_help_saveAppLog tL_help_saveAppLog = new TLRPC.TL_help_saveAppLog();
                TLRPC.TL_inputAppEvent tL_inputAppEvent = new TLRPC.TL_inputAppEvent();
                tL_inputAppEvent.time = ConnectionsManager.getInstance(p10.s0).getCurrentTime();
                tL_inputAppEvent.type = "premium.promo_screen_fail";
                tL_inputAppEvent.data = new TLRPC.TL_jsonNull();
                tL_help_saveAppLog.events.add(tL_inputAppEvent);
                ConnectionsManager.getInstance(p10.s0).sendRequest(tL_help_saveAppLog, new di.u5(9));
            }
            Runnable runnable = r1Var2.h;
            if (runnable != null) {
                runnable.run();
                r1Var2.h = null;
            }
            if (ngVar != null) {
                ngVar.run();
                return;
            }
            return;
        }
        if (list == null || list.isEmpty()) {
            if (ngVar != null) {
                ngVar.run();
                return;
            }
            return;
        }
        final AtomicInteger atomicInteger = new AtomicInteger(0);
        final AtomicInteger atomicInteger2 = new AtomicInteger(0);
        r1Var2.e = null;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            final Purchase purchase = (Purchase) it.next();
            ArrayList b10 = purchase.b();
            JSONObject jSONObject = purchase.c;
            if (b10.contains("telegram_premium")) {
                r1Var2.e = purchase.a();
                r1Var2.f = purchase.c();
            }
            String c10 = purchase.c();
            Set set = r1Var2.b;
            if (set.contains(c10)) {
                i7 = i11;
                r1Var = r1Var2;
                a8.b("BillingController.onPurchasesUpdatedInternal: " + purchase.a() + " purchase is already requesting...");
            } else if (jSONObject.optInt("purchaseState", i11) != 4) {
                String optString = jSONObject.optString("obfuscatedAccountId");
                String optString2 = jSONObject.optString("obfuscatedProfileId");
                f5.a aVar = (optString == null && optString2 == null) ? null : new f5.a(optString, optString2, false);
                if (aVar == null) {
                    a8.b("Billing: Extract payload. No AccountIdentifiers");
                } else {
                    String str = aVar.a;
                    String str2 = aVar.b;
                    if (str == null || str.isEmpty() || str2 == null || str2.isEmpty()) {
                        a8.b("Billing: Extract payload. Empty AccountIdentifiers");
                    } else {
                        try {
                            inputStorePaymentPurpose = bg.b.b(str2);
                        } catch (Exception e10) {
                            a8.e("Billing: Extract payload, failed to get purpose", e10);
                            inputStorePaymentPurpose = null;
                        }
                        try {
                            String str3 = new String(Base64.decode(str, 0), g9.j.a);
                            a8.b("Billing: Extract payload. obfuscatedAccountIdString=".concat(str3));
                            if (str3.startsWith("account-")) {
                                cVar = c.a(Integer.parseInt(str3.substring(8)));
                            } else {
                                long parseLong = Long.parseLong(str3);
                                int i12 = 0;
                                while (true) {
                                    if (i12 >= 4) {
                                        cVar = null;
                                        break;
                                    }
                                    c a10 = c.a(i12);
                                    if (p10.i(a10.a).e() == parseLong) {
                                        cVar = a10;
                                        break;
                                    }
                                    i12++;
                                }
                                if (cVar == null) {
                                    a8.b("Billing: Extract payload. AccountInstance not found, accountId=" + parseLong);
                                }
                            }
                            bVar = new q0.b(cVar, inputStorePaymentPurpose);
                        } catch (Exception e11) {
                            a8.e("Billing: Extract Payload", e11);
                        }
                        if (bVar == null) {
                            Object obj = bVar.a;
                            Object obj2 = bVar.b;
                            if (obj != null && obj2 != null) {
                                if (jSONObject.optBoolean("acknowledged", true)) {
                                    r1Var = this;
                                    a8.b("BillingController.onPurchasesUpdatedInternal: " + purchase.a() + " purchase is purchased and acknowledged: consuming");
                                    atomicInteger.incrementAndGet();
                                    r1Var.e(purchase, (TLRPC.InputStorePaymentPurpose) obj2, new i1(atomicInteger2, atomicInteger, ngVar, 1));
                                } else {
                                    StringBuilder sb2 = new StringBuilder("BillingController.onPurchasesUpdatedInternal: ");
                                    sb2.append(purchase.a());
                                    sb2.append(" purchase is purchased and not acknowledged: assigning (accountId=");
                                    final c cVar2 = (c) obj;
                                    int i13 = cVar2.a;
                                    sb2.append(i13);
                                    sb2.append(") (purpose=");
                                    sb2.append(obj2);
                                    sb2.append(")");
                                    a8.b(sb2.toString());
                                    set.add(purchase.c());
                                    final TLRPC.TL_payments_assignPlayMarketTransaction tL_payments_assignPlayMarketTransaction = new TLRPC.TL_payments_assignPlayMarketTransaction();
                                    TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
                                    tL_payments_assignPlayMarketTransaction.receipt = tL_dataJSON;
                                    tL_dataJSON.data = purchase.a;
                                    tL_payments_assignPlayMarketTransaction.purpose = (TLRPC.InputStorePaymentPurpose) obj2;
                                    final org.telegram.ui.ActionBar.u1[] u1VarArr = new org.telegram.ui.ActionBar.u1[1];
                                    g0.h3(new n1(u1VarArr, 0));
                                    atomicInteger.incrementAndGet();
                                    int i14 = tL_payments_assignPlayMarketTransaction.purpose instanceof TLRPC.TL_inputStorePaymentAuthCode ? 65608 : 65600;
                                    ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i13);
                                    RequestDelegate requestDelegate = new RequestDelegate() { // from class: org.telegram.messenger.o1
                                        @Override // org.telegram.tgnet.RequestDelegate
                                        public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                                            int i15;
                                            r1 r1Var3 = r1.this;
                                            org.telegram.ui.ActionBar.u1[] u1VarArr2 = u1VarArr;
                                            Purchase purchase2 = purchase;
                                            TLRPC.TL_payments_assignPlayMarketTransaction tL_payments_assignPlayMarketTransaction2 = tL_payments_assignPlayMarketTransaction;
                                            c cVar3 = cVar2;
                                            f5.f fVar3 = fVar2;
                                            AtomicInteger atomicInteger3 = atomicInteger2;
                                            AtomicInteger atomicInteger4 = atomicInteger;
                                            Runnable runnable2 = ngVar;
                                            g0.h3(new n1(u1VarArr2, 1));
                                            r1Var3.b.remove(purchase2.c());
                                            if (!(tLObject instanceof TLRPC.Updates)) {
                                                StringBuilder sb3 = new StringBuilder("BillingController.onPurchasesUpdatedInternal: ");
                                                sb3.append(purchase2.a());
                                                sb3.append(" purchase is purchased and failed to assign: ");
                                                org.telegram.ui.Cells.f1.u(tL_error == null ? null : tL_error.text, sb3);
                                                Runnable runnable3 = r1Var3.h;
                                                if (runnable3 != null) {
                                                    runnable3.run();
                                                    r1Var3.h = null;
                                                }
                                                if (tL_error != null) {
                                                    i15 = 0;
                                                    qs.e().m(qs.k5, tL_payments_assignPlayMarketTransaction2, tL_error);
                                                } else {
                                                    i15 = 0;
                                                }
                                                g0.h3(new i1(atomicInteger3, atomicInteger4, runnable2, i15));
                                                return;
                                            }
                                            a8.b("BillingController.onPurchasesUpdatedInternal: " + purchase2.a() + " purchase is purchased and now assigned");
                                            if (tL_payments_assignPlayMarketTransaction2.purpose instanceof TLRPC.TL_inputStorePaymentAuthCode) {
                                                ArrayList z02 = qp.z0((TLRPC.Updates) tLObject, TL_update.TL_updateSentPhoneCode.class);
                                                int size = z02.size();
                                                int i16 = 0;
                                                while (i16 < size) {
                                                    Object obj3 = z02.get(i16);
                                                    i16++;
                                                    g0.h3(new ng(cVar3, tL_payments_assignPlayMarketTransaction2, (TL_update.TL_updateSentPhoneCode) obj3, 9));
                                                }
                                            }
                                            qp.s1(cVar3.a).O3((TLRPC.Updates) tLObject, false);
                                            ArrayList b11 = purchase2.b();
                                            int size2 = b11.size();
                                            int i17 = 0;
                                            while (i17 < size2) {
                                                Object obj4 = b11.get(i17);
                                                i17++;
                                                q0.a aVar2 = (q0.a) r1Var3.a.remove((String) obj4);
                                                if (aVar2 != null) {
                                                    aVar2.accept(fVar3);
                                                }
                                            }
                                            r1Var3.e(purchase2, tL_payments_assignPlayMarketTransaction2.purpose, new i1(atomicInteger3, atomicInteger4, runnable2, 2));
                                            JSONObject jSONObject2 = purchase2.c;
                                            String optString3 = jSONObject2.optString("obfuscatedAccountId");
                                            String optString4 = jSONObject2.optString("obfuscatedProfileId");
                                            String str4 = ((optString3 == null && optString4 == null) ? null : new f5.a(optString3, optString4, false)).b;
                                            try {
                                                a8.b("BillingUtilities.clearPurpose: got {" + str4 + "}");
                                                SerializedData serializedData = new SerializedData(Utilities.v(str4));
                                                bg.a a11 = bg.a.a(serializedData.readInt32(true), serializedData);
                                                SerializedData serializedData2 = new SerializedData(8);
                                                serializedData2.writeInt64(a11.b);
                                                String f10 = Utilities.f(serializedData2.toByteArray());
                                                serializedData2.cleanup();
                                                a8.b("BillingUtilities.clearPurpose: id_hex = ".concat(f10));
                                                t0.b.getSharedPreferences("purchases", 0).edit().remove(f10).apply();
                                            } catch (Exception e12) {
                                                a8.g(e12, true);
                                            }
                                        }
                                    };
                                    r1Var = this;
                                    connectionsManager.sendRequest(tL_payments_assignPlayMarketTransaction, requestDelegate, i14);
                                }
                                i7 = 1;
                            }
                        }
                        a8.b("BillingController.onPurchasesUpdatedInternal: " + purchase.a() + " purchase is purchased, but failed to extract saved payload");
                        fVar2 = fVar;
                        r1Var2 = this;
                        i11 = 1;
                    }
                }
                bVar = null;
                if (bVar == null) {
                }
                a8.b("BillingController.onPurchasesUpdatedInternal: " + purchase.a() + " purchase is purchased, but failed to extract saved payload");
                fVar2 = fVar;
                r1Var2 = this;
                i11 = 1;
            } else {
                r1Var = r1Var2;
                StringBuilder sb3 = new StringBuilder("BillingController.onPurchasesUpdatedInternal: ");
                sb3.append(purchase.a());
                sb3.append(" purchase is (state=");
                i7 = 1;
                sb3.append(jSONObject.optInt("purchaseState", 1) != 4 ? 1 : 2);
                sb3.append("), (isAcknowledged=");
                sb3.append(jSONObject.optBoolean("acknowledged", true));
                sb3.append(")");
                a8.b(sb3.toString());
            }
            r1Var2 = r1Var;
            i11 = i7;
            fVar2 = fVar;
        }
        if (atomicInteger.get() != 0 || ngVar == null) {
            return;
        }
        ngVar.run();
    }

    public final void o(List list, q1 q1Var) {
        if (!k()) {
            throw new IllegalStateException("Billing: Controller should be ready for this call!");
        }
        d6.i iVar = new d6.i(21, false);
        if (list == null || list.isEmpty()) {
            throw new IllegalArgumentException("Product list cannot be empty.");
        }
        HashSet hashSet = new HashSet();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            f5.o oVar = (f5.o) it.next();
            if (!"play_pass_subs".equals(oVar.b)) {
                hashSet.add(oVar.b);
            }
        }
        if (hashSet.size() > 1) {
            throw new IllegalArgumentException("All products should be of the same product type.");
        }
        com.google.android.gms.internal.play_billing.r p10 = com.google.android.gms.internal.play_billing.r.p(list);
        iVar.b = p10;
        if (p10 == null) {
            throw new IllegalArgumentException("Product list must be set to a non empty list.");
        }
        this.d.c(new aa.n(iVar), new j1(q1Var, 0));
    }

    public final void p(String str, f5.m mVar) {
        f5.b bVar = this.d;
        bVar.getClass();
        if (f5.b.f(new f5.q(bVar, mVar, str), 30000L, new m9.u(17, bVar, mVar), bVar.r(), bVar.e()) == null) {
            f5.f u10 = bVar.u();
            bVar.y(25, 9, u10);
            com.google.android.gms.internal.play_billing.p pVar = com.google.android.gms.internal.play_billing.r.b;
            mVar.b(u10, com.google.android.gms.internal.play_billing.v.e);
        }
    }

    public final void q() {
        if (k()) {
            return;
        }
        try {
            bg.b.a(this.c);
            if (r2.b()) {
                return;
            }
            this.d.d(this);
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }
}

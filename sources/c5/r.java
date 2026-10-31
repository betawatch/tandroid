package c5;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Parcel;
import android.text.TextUtils;
import com.android.billingclient.api.Purchase;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import org.json.JSONException;
import org.json.JSONObject;
import org.scilab.forge.jlatexmath.TeXSymbolParser;
import org.telegram.messenger.s1;
import org.telegram.messenger.t1;
import org.telegram.messenger.zs;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final /* synthetic */ class r implements Callable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ r(Object obj, Object obj2, Object obj3, int i10) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:96:0x00b3, code lost:
    
        r0 = r2.s(c5.c0.h, org.telegram.messenger.zs.s1, "Service has been reset to null.", r5);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object a() {
        a5.a aVar;
        com.google.android.gms.internal.play_billing.c cVar;
        int i10;
        int i11;
        b bVar = (b) this.b;
        s1 s1Var = (s1) this.c;
        a4.l lVar = (a4.l) this.d;
        Exception exc = null;
        if (!bVar.n()) {
            g gVar = c0.h;
            bVar.y(2, 7, gVar);
            com.google.android.gms.internal.play_billing.p pVar = com.google.android.gms.internal.play_billing.r.b;
            ((t1) s1Var.b).a(gVar, com.google.android.gms.internal.play_billing.v.e);
            return null;
        }
        if (!bVar.r) {
            com.google.android.gms.internal.play_billing.u.h("BillingClient", "Querying product details is not supported.");
            g gVar2 = c0.m;
            bVar.y(20, 7, gVar2);
            com.google.android.gms.internal.play_billing.p pVar2 = com.google.android.gms.internal.play_billing.r.b;
            ((t1) s1Var.b).a(gVar2, com.google.android.gms.internal.play_billing.v.e);
            return null;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int i12 = 0;
        String str = ((p) ((com.google.android.gms.internal.play_billing.r) lVar.b).get(0)).b;
        com.google.android.gms.internal.play_billing.r rVar = (com.google.android.gms.internal.play_billing.r) lVar.b;
        int size = rVar.size();
        int i13 = 0;
        while (true) {
            if (i13 >= size) {
                aVar = new a5.a(0, "", arrayList, arrayList2);
                break;
            }
            int i14 = i13 + 20;
            ArrayList arrayList3 = new ArrayList(rVar.subList(i13, i14 > size ? size : i14));
            ArrayList<String> arrayList4 = new ArrayList<>();
            int size2 = arrayList3.size();
            for (int i15 = i12; i15 < size2; i15++) {
                arrayList4.add(((p) arrayList3.get(i15)).a);
            }
            Bundle bundle = new Bundle();
            bundle.putStringArrayList("ITEM_ID_LIST", arrayList4);
            String str2 = bVar.c;
            bundle.putString("playBillingLibraryVersion", str2);
            try {
                synchronized (bVar.a) {
                    try {
                        cVar = bVar.i;
                    } finally {
                        th = th;
                        i12 = 43;
                        while (true) {
                            try {
                            } catch (Throwable th2) {
                                th = th2;
                            }
                        }
                    }
                }
                if (cVar == null) {
                    break;
                }
                if (bVar.s) {
                    bVar.x.getClass();
                }
                bVar.v();
                bVar.v();
                bVar.v();
                bVar.v();
                int i16 = i14;
                try {
                    Bundle d12 = ((com.google.android.gms.internal.play_billing.a) cVar).d1(true != bVar.t ? 17 : 20, bVar.g.getPackageName(), str, bundle, com.google.android.gms.internal.play_billing.u.d(str2, bVar.d, arrayList3, new com.google.android.gms.internal.play_billing.t1(1), bVar.A.longValue()));
                    if (d12 == null) {
                        aVar = bVar.s(c0.n, 44, "queryProductDetailsAsync got empty product details response.", null);
                        break;
                    }
                    if (d12.containsKey("DETAILS_LIST")) {
                        ArrayList<String> stringArrayList = d12.getStringArrayList("DETAILS_LIST");
                        if (stringArrayList == null) {
                            aVar = bVar.s(c0.n, 46, "queryProductDetailsAsync got null response list", null);
                            break;
                        }
                        ArrayList arrayList5 = new ArrayList();
                        int size3 = stringArrayList.size();
                        int i17 = 0;
                        while (i17 < size3) {
                            com.google.android.gms.internal.play_billing.r rVar2 = rVar;
                            try {
                                m mVar = new m(stringArrayList.get(i17));
                                com.google.android.gms.internal.play_billing.u.g("BillingClient", "Got product details: ".concat(mVar.toString()));
                                arrayList5.add(mVar);
                                i17++;
                                rVar = rVar2;
                            } catch (JSONException e) {
                                aVar = bVar.s(c0.a(6, "Error trying to decode SkuDetails."), 47, "Got a JSON exception trying to decode ProductDetails. \n Exception: ", e);
                            }
                        }
                        com.google.android.gms.internal.play_billing.r rVar3 = rVar;
                        ArrayList<String> stringArrayList2 = d12.getStringArrayList("UNFETCHED_PRODUCT_LIST");
                        new ArrayList();
                        try {
                            ArrayList arrayList6 = new ArrayList();
                            if (stringArrayList2 != null) {
                                int size4 = stringArrayList2.size();
                                int i18 = 0;
                                while (i18 < size4) {
                                    String str3 = stringArrayList2.get(i18);
                                    i18++;
                                    q qVar = new q(str3);
                                    com.google.android.gms.internal.play_billing.u.g("BillingClient", "Got unfetchedProduct: ".concat(qVar.toString()));
                                    arrayList6.add(qVar);
                                }
                            } else {
                                int size5 = arrayList3.size();
                                int i19 = 0;
                                while (i19 < size5) {
                                    Object obj = arrayList3.get(i19);
                                    i19++;
                                    p pVar3 = (p) obj;
                                    int size6 = arrayList5.size();
                                    int i20 = 0;
                                    while (true) {
                                        if (i20 >= size6) {
                                            i10 = size5;
                                            i11 = i16;
                                            arrayList6.add(new q(new JSONObject().put("productId", pVar3.a).put(TeXSymbolParser.TYPE_ATTR, pVar3.b).put("statusCode", 0).toString()));
                                            break;
                                        }
                                        Object obj2 = arrayList5.get(i20);
                                        i20++;
                                        m mVar2 = (m) obj2;
                                        i10 = size5;
                                        i11 = i16;
                                        if (!pVar3.a.equals(mVar2.c) || !pVar3.b.equals(mVar2.d)) {
                                            size5 = i10;
                                            i16 = i11;
                                        }
                                    }
                                    size5 = i10;
                                    i16 = i11;
                                }
                            }
                            int i21 = i16;
                            arrayList.addAll(arrayList5);
                            arrayList2.addAll(arrayList6);
                            rVar = rVar3;
                            i13 = i21;
                            exc = null;
                            i12 = 0;
                        } catch (JSONException e7) {
                            aVar = bVar.s(c0.a(6, "Error trying to decode SkuDetails."), 47, "Got a JSON exception trying to decode UnfetchedProduct. \n Exception: ", e7);
                        }
                    } else {
                        int a2 = com.google.android.gms.internal.play_billing.u.a("BillingClient", d12);
                        String f7 = com.google.android.gms.internal.play_billing.u.f("BillingClient", d12);
                        aVar = a2 != 0 ? bVar.s(c0.a(a2, f7), 23, i0.a.i(a2, "getSkuDetails() failed for queryProductDetailsAsync. Response code: "), null) : bVar.s(c0.a(6, f7), 45, "getSkuDetails() returned a bundle with neither an error nor a product detail list for queryProductDetailsAsync.", null);
                    }
                } catch (DeadObjectException e10) {
                    e = e10;
                    aVar = bVar.s(c0.h, i12, "queryProductDetailsAsync got a remote exception (try to reconnect).", e);
                    ((t1) s1Var.b).a(c0.a(aVar.b, (String) aVar.c), (ArrayList) aVar.d);
                    return null;
                } catch (Exception e11) {
                    e = e11;
                    aVar = bVar.s(c0.f, i12, "queryProductDetailsAsync got a remote exception (try to reconnect).", e);
                    ((t1) s1Var.b).a(c0.a(aVar.b, (String) aVar.c), (ArrayList) aVar.d);
                    return null;
                }
            } catch (DeadObjectException e12) {
                e = e12;
                i12 = 43;
            } catch (Exception e13) {
                e = e13;
                i12 = 43;
            }
        }
        ((t1) s1Var.b).a(c0.a(aVar.b, (String) aVar.c), (ArrayList) aVar.d);
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:93:0x0088, code lost:
    
        r0 = r2.x(c5.c0.h, org.telegram.messenger.zs.s1, "Service has been reset to null", r3);
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0239  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0245  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x016c A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object b() {
        Exception exc;
        n4.q x10;
        List list;
        com.google.android.gms.internal.play_billing.c cVar;
        g a2;
        int i10;
        b bVar = (b) this.b;
        Exception exc2 = null;
        int i11 = 9;
        if (!bVar.n()) {
            g gVar = c0.h;
            bVar.y(2, 9, gVar);
            n nVar = (n) this.c;
            com.google.android.gms.internal.play_billing.p pVar = com.google.android.gms.internal.play_billing.r.b;
            nVar.b(gVar, com.google.android.gms.internal.play_billing.v.e);
            return null;
        }
        String str = (String) this.d;
        if (TextUtils.isEmpty(str)) {
            com.google.android.gms.internal.play_billing.u.h("BillingClient", "Please provide a valid product type.");
            g gVar2 = c0.d;
            bVar.y(50, 9, gVar2);
            n nVar2 = (n) this.c;
            com.google.android.gms.internal.play_billing.p pVar2 = com.google.android.gms.internal.play_billing.r.b;
            nVar2.b(gVar2, com.google.android.gms.internal.play_billing.v.e);
            return null;
        }
        com.google.android.gms.internal.play_billing.u.g("BillingClient", "Querying owned items, item type: ".concat(str));
        ArrayList arrayList = new ArrayList();
        boolean z10 = bVar.n;
        bVar.x.getClass();
        bVar.x.getClass();
        long longValue = bVar.A.longValue();
        Bundle bundle = new Bundle();
        com.google.android.gms.internal.play_billing.u.b(bundle, bVar.c, bVar.d, longValue);
        int i12 = 1;
        if (z10) {
            bundle.putBoolean("enablePendingPurchases", true);
        }
        String str2 = null;
        while (true) {
            try {
                synchronized (bVar.a) {
                    try {
                        cVar = bVar.i;
                    } catch (Throwable th2) {
                        th = th2;
                        exc = exc2;
                        while (true) {
                            try {
                                try {
                                    throw th;
                                } catch (DeadObjectException e) {
                                    e = e;
                                    x10 = bVar.x(c0.h, 52, "Got exception trying to get purchases try to reconnect", e);
                                    list = (List) x10.a;
                                    if (list != null) {
                                    }
                                    return exc;
                                } catch (Exception e7) {
                                    e = e7;
                                    x10 = bVar.x(c0.f, 52, "Got exception trying to get purchases try to reconnect", e);
                                    list = (List) x10.a;
                                    if (list != null) {
                                    }
                                    return exc;
                                }
                            } catch (Throwable th3) {
                                th = th3;
                            }
                        }
                    }
                }
                if (cVar == null) {
                    break;
                }
                Bundle c12 = bVar.n ? ((com.google.android.gms.internal.play_billing.a) cVar).c1(bVar.w ? 26 : bVar.v ? 24 : bVar.s ? 19 : i11, bVar.g.getPackageName(), str, str2, bundle) : ((com.google.android.gms.internal.play_billing.a) cVar).b1(bVar.g.getPackageName(), str, str2);
                g gVar3 = c0.f;
                if (c12 == null) {
                    com.google.android.gms.internal.play_billing.u.h("BillingClient", "getPurchase() got null owned items list");
                    i10 = 54;
                } else {
                    int a10 = com.google.android.gms.internal.play_billing.u.a("BillingClient", c12);
                    String f7 = com.google.android.gms.internal.play_billing.u.f("BillingClient", c12);
                    c3.a a11 = g.a();
                    a11.b = a10;
                    a11.a = f7;
                    a2 = a11.a();
                    if (a10 != 0) {
                        com.google.android.gms.internal.play_billing.u.h("BillingClient", "getPurchase() failed. Response code: " + a10);
                        i10 = 23;
                    } else if (c12.containsKey("INAPP_PURCHASE_ITEM_LIST") && c12.containsKey("INAPP_PURCHASE_DATA_LIST") && c12.containsKey("INAPP_DATA_SIGNATURE_LIST")) {
                        ArrayList<String> stringArrayList = c12.getStringArrayList("INAPP_PURCHASE_ITEM_LIST");
                        ArrayList<String> stringArrayList2 = c12.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
                        ArrayList<String> stringArrayList3 = c12.getStringArrayList("INAPP_DATA_SIGNATURE_LIST");
                        if (stringArrayList == null) {
                            com.google.android.gms.internal.play_billing.u.h("BillingClient", "Bundle returned from getPurchase() contains null SKUs list.");
                            i10 = 56;
                        } else if (stringArrayList2 == null) {
                            com.google.android.gms.internal.play_billing.u.h("BillingClient", "Bundle returned from getPurchase() contains null purchases list.");
                            i10 = 57;
                        } else if (stringArrayList3 == null) {
                            com.google.android.gms.internal.play_billing.u.h("BillingClient", "Bundle returned from getPurchase() contains null signatures list.");
                            i10 = 58;
                        } else {
                            a2 = c0.g;
                            i10 = i12;
                        }
                    } else {
                        com.google.android.gms.internal.play_billing.u.h("BillingClient", "Bundle returned from getPurchase() doesn't contain required fields.");
                        i10 = 55;
                    }
                    if (a2 == c0.g) {
                        x10 = bVar.x(a2, i10, "Purchase bundle invalid", exc2);
                        break;
                    }
                    ArrayList<String> stringArrayList4 = c12.getStringArrayList("INAPP_PURCHASE_ITEM_LIST");
                    ArrayList<String> stringArrayList5 = c12.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
                    ArrayList<String> stringArrayList6 = c12.getStringArrayList("INAPP_DATA_SIGNATURE_LIST");
                    exc = exc2;
                    boolean z11 = false;
                    for (int i13 = 0; i13 < stringArrayList5.size(); i13++) {
                        String str3 = stringArrayList5.get(i13);
                        String str4 = stringArrayList6.get(i13);
                        com.google.android.gms.internal.play_billing.u.g("BillingClient", "Sku is owned: ".concat(String.valueOf(stringArrayList4.get(i13))));
                        try {
                            Purchase purchase = new Purchase(str3, str4);
                            if (TextUtils.isEmpty(purchase.c())) {
                                com.google.android.gms.internal.play_billing.u.h("BillingClient", "BUG: empty/null token!");
                                z11 = true;
                            }
                            arrayList.add(purchase);
                        } catch (JSONException e10) {
                            x10 = bVar.x(c0.f, 51, "Got an exception trying to decode the purchase!", e10);
                        }
                    }
                    if (z11) {
                        i11 = 9;
                        bVar.y(26, 9, gVar3);
                    } else {
                        i11 = 9;
                    }
                    str2 = c12.getString("INAPP_CONTINUATION_TOKEN");
                    com.google.android.gms.internal.play_billing.u.g("BillingClient", "Continuation token: ".concat(String.valueOf(str2)));
                    if (TextUtils.isEmpty(str2)) {
                        x10 = new n4.q(c0.g, arrayList, false);
                        break;
                    }
                    exc2 = exc;
                    i12 = 1;
                }
                a2 = gVar3;
                if (a2 == c0.g) {
                }
            } catch (DeadObjectException e11) {
                e = e11;
                exc = exc2;
            } catch (Exception e12) {
                e = e12;
                exc = exc2;
            }
        }
        exc = exc2;
        list = (List) x10.a;
        if (list != null) {
            ((n) this.c).b((g) x10.b, list);
        } else {
            n nVar3 = (n) this.c;
            g gVar4 = (g) x10.b;
            com.google.android.gms.internal.play_billing.p pVar3 = com.google.android.gms.internal.play_billing.r.b;
            nVar3.b(gVar4, com.google.android.gms.internal.play_billing.v.e);
        }
        return exc;
    }

    private final Object c() {
        Bundle c10;
        com.google.android.gms.internal.play_billing.c cVar;
        b bVar = (b) this.b;
        String str = (String) this.c;
        String str2 = (String) this.d;
        try {
            synchronized (bVar.a) {
                cVar = bVar.i;
            }
            if (cVar == null) {
                return com.google.android.gms.internal.play_billing.u.c(zs.s1, c0.h);
            }
            return ((com.google.android.gms.internal.play_billing.a) cVar).Z0(bVar.g.getPackageName(), str, str2);
        } catch (DeadObjectException e) {
            g gVar = c0.h;
            String a2 = a0.a(e);
            c10 = com.google.android.gms.internal.play_billing.u.c(5, gVar);
            if (a2 != null) {
                c10.putString("ADDITIONAL_LOG_DETAILS", a2);
            }
            return c10;
        } catch (Exception e7) {
            g gVar2 = c0.f;
            String a10 = a0.a(e7);
            c10 = com.google.android.gms.internal.play_billing.u.c(5, gVar2);
            if (a10 != null) {
                c10.putString("ADDITIONAL_LOG_DETAILS", a10);
            }
            return c10;
        }
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        Exception exc;
        DeadObjectException deadObjectException;
        com.google.android.gms.internal.play_billing.c cVar;
        int readInt;
        String str;
        switch (this.a) {
            case 0:
                b bVar = (b) this.b;
                h hVar = (h) this.c;
                k6.h hVar2 = (k6.h) this.d;
                if (!bVar.n()) {
                    g gVar = c0.h;
                    bVar.y(2, 4, gVar);
                    hVar.a(gVar);
                    return null;
                }
                String str2 = "Error consuming purchase with token. Response code: ";
                String str3 = (String) hVar2.b;
                try {
                    com.google.android.gms.internal.play_billing.u.g("BillingClient", "Consuming purchase with token: ".concat(str3));
                    try {
                        synchronized (bVar.a) {
                            try {
                                cVar = bVar.i;
                            } catch (Throwable th2) {
                                th = th2;
                                while (true) {
                                    try {
                                        throw th;
                                    } catch (Throwable th3) {
                                        th = th3;
                                    }
                                }
                            }
                        }
                        try {
                            if (cVar == null) {
                                str2 = str3;
                                try {
                                    bVar.g(hVar, str2, c0.h, zs.s1, "Service has been reset to null.", null);
                                    return null;
                                } catch (DeadObjectException e) {
                                    e = e;
                                    deadObjectException = e;
                                    bVar.g(hVar, str2, c0.h, 29, "Error consuming purchase!", deadObjectException);
                                    return null;
                                } catch (Exception e7) {
                                    e = e7;
                                    exc = e;
                                    bVar.g(hVar, str2, c0.f, 29, "Error consuming purchase!", exc);
                                    return null;
                                }
                            }
                            if (bVar.n) {
                                String packageName = bVar.g.getPackageName();
                                boolean z10 = bVar.n;
                                String str4 = bVar.c;
                                String str5 = bVar.d;
                                long longValue = bVar.A.longValue();
                                Bundle bundle = new Bundle();
                                if (z10) {
                                    com.google.android.gms.internal.play_billing.u.b(bundle, str4, str5, longValue);
                                }
                                Bundle Y0 = ((com.google.android.gms.internal.play_billing.a) cVar).Y0(packageName, str3, bundle);
                                readInt = Y0.getInt("RESPONSE_CODE");
                                str = com.google.android.gms.internal.play_billing.u.f("BillingClient", Y0);
                            } else {
                                String packageName2 = bVar.g.getPackageName();
                                com.google.android.gms.internal.play_billing.a aVar = (com.google.android.gms.internal.play_billing.a) cVar;
                                Parcel V0 = aVar.V0();
                                V0.writeInt(3);
                                V0.writeString(packageName2);
                                V0.writeString(str3);
                                Parcel W0 = aVar.W0(V0, 5);
                                readInt = W0.readInt();
                                W0.recycle();
                                str = "";
                            }
                            g a2 = c0.a(readInt, str);
                            if (readInt == 0) {
                                com.google.android.gms.internal.play_billing.u.g("BillingClient", "Successfully consumed purchase.");
                                hVar.a(a2);
                                return null;
                            }
                            bVar.g(hVar, str3, a2, 23, "Error consuming purchase with token. Response code: " + readInt, null);
                            return null;
                        } catch (DeadObjectException e10) {
                            deadObjectException = e10;
                            str2 = str3;
                            bVar.g(hVar, str2, c0.h, 29, "Error consuming purchase!", deadObjectException);
                            return null;
                        } catch (Exception e11) {
                            exc = e11;
                            str2 = str3;
                            bVar.g(hVar, str2, c0.f, 29, "Error consuming purchase!", exc);
                            return null;
                        }
                    } catch (DeadObjectException e12) {
                        e = e12;
                    } catch (Exception e13) {
                        e = e13;
                    }
                } catch (DeadObjectException e14) {
                    e = e14;
                    str2 = str3;
                } catch (Exception e15) {
                    e = e15;
                    str2 = str3;
                }
            case 1:
                return a();
            case 2:
                return b();
            case 3:
                return c();
            case 4:
                return Boolean.valueOf(((SharedPreferences) this.b).getBoolean((String) this.c, ((Boolean) this.d).booleanValue()));
            case 5:
                return Integer.valueOf(((SharedPreferences) this.b).getInt((String) this.c, ((Integer) this.d).intValue()));
            case 6:
                return Long.valueOf(((SharedPreferences) this.b).getLong((String) this.c, ((Long) this.d).longValue()));
            default:
                return ((SharedPreferences) this.b).getString((String) this.c, (String) this.d);
        }
    }

    public r(b bVar, n nVar, String str) {
        this.a = 2;
        this.c = nVar;
        this.d = str;
        Objects.requireNonNull(bVar);
        this.b = bVar;
    }
}

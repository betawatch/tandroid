package e5;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Parcel;
import android.text.TextUtils;
import b8.kg;
import com.android.billingclient.api.Purchase;
import com.google.android.gms.internal.play_billing.t1;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import org.json.JSONException;
import org.json.JSONObject;
import org.scilab.forge.jlatexmath.TeXSymbolParser;
import org.telegram.messenger.hs;
import org.telegram.messenger.p1;
import org.telegram.messenger.q1;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final /* synthetic */ class q implements Callable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ q(Object obj, Object obj2, Object obj3, int i3) {
        this.a = i3;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:96:0x00b3, code lost:
    
        r0 = r2.s(e5.z.h, org.telegram.messenger.hs.s1, "Service has been reset to null.", r5);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object a() {
        kg kgVar;
        com.google.android.gms.internal.play_billing.c cVar;
        int i3;
        int i10;
        b bVar = (b) this.b;
        p1 p1Var = (p1) this.c;
        android.support.v4.media.c cVar2 = (android.support.v4.media.c) this.d;
        Exception exc = null;
        if (!bVar.n()) {
            f fVar = z.h;
            bVar.y(2, 7, fVar);
            com.google.android.gms.internal.play_billing.p pVar = com.google.android.gms.internal.play_billing.r.b;
            ((q1) p1Var.b).k(fVar, com.google.android.gms.internal.play_billing.v.e);
            return null;
        }
        if (!bVar.r) {
            com.google.android.gms.internal.play_billing.u.h("BillingClient", "Querying product details is not supported.");
            f fVar2 = z.m;
            bVar.y(20, 7, fVar2);
            com.google.android.gms.internal.play_billing.p pVar2 = com.google.android.gms.internal.play_billing.r.b;
            ((q1) p1Var.b).k(fVar2, com.google.android.gms.internal.play_billing.v.e);
            return null;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int i11 = 0;
        String str = ((o) ((com.google.android.gms.internal.play_billing.r) cVar2.b).get(0)).b;
        com.google.android.gms.internal.play_billing.r rVar = (com.google.android.gms.internal.play_billing.r) cVar2.b;
        int size = rVar.size();
        int i12 = 0;
        while (true) {
            if (i12 >= size) {
                kgVar = new kg(0, "", arrayList, arrayList2);
                break;
            }
            int i13 = i12 + 20;
            ArrayList arrayList3 = new ArrayList(rVar.subList(i12, i13 > size ? size : i13));
            ArrayList<String> arrayList4 = new ArrayList<>();
            int size2 = arrayList3.size();
            for (int i14 = i11; i14 < size2; i14++) {
                arrayList4.add(((o) arrayList3.get(i14)).a);
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
                        i11 = 43;
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
                int i15 = i13;
                try {
                    Bundle d12 = ((com.google.android.gms.internal.play_billing.a) cVar).d1(true != bVar.t ? 17 : 20, bVar.g.getPackageName(), str, bundle, com.google.android.gms.internal.play_billing.u.d(str2, bVar.d, arrayList3, new t1(1), bVar.A.longValue()));
                    if (d12 == null) {
                        kgVar = bVar.s(z.n, 44, "queryProductDetailsAsync got empty product details response.", null);
                        break;
                    }
                    if (d12.containsKey("DETAILS_LIST")) {
                        ArrayList<String> stringArrayList = d12.getStringArrayList("DETAILS_LIST");
                        if (stringArrayList == null) {
                            kgVar = bVar.s(z.n, 46, "queryProductDetailsAsync got null response list", null);
                            break;
                        }
                        ArrayList arrayList5 = new ArrayList();
                        int size3 = stringArrayList.size();
                        int i16 = 0;
                        while (i16 < size3) {
                            com.google.android.gms.internal.play_billing.r rVar2 = rVar;
                            try {
                                l lVar = new l(stringArrayList.get(i16));
                                com.google.android.gms.internal.play_billing.u.g("BillingClient", "Got product details: ".concat(lVar.toString()));
                                arrayList5.add(lVar);
                                i16++;
                                rVar = rVar2;
                            } catch (JSONException e10) {
                                kgVar = bVar.s(z.a(6, "Error trying to decode SkuDetails."), 47, "Got a JSON exception trying to decode ProductDetails. \n Exception: ", e10);
                            }
                        }
                        com.google.android.gms.internal.play_billing.r rVar3 = rVar;
                        ArrayList<String> stringArrayList2 = d12.getStringArrayList("UNFETCHED_PRODUCT_LIST");
                        new ArrayList();
                        try {
                            ArrayList arrayList6 = new ArrayList();
                            if (stringArrayList2 != null) {
                                int size4 = stringArrayList2.size();
                                int i17 = 0;
                                while (i17 < size4) {
                                    String str3 = stringArrayList2.get(i17);
                                    i17++;
                                    p pVar3 = new p(str3);
                                    com.google.android.gms.internal.play_billing.u.g("BillingClient", "Got unfetchedProduct: ".concat(pVar3.toString()));
                                    arrayList6.add(pVar3);
                                }
                            } else {
                                int size5 = arrayList3.size();
                                int i18 = 0;
                                while (i18 < size5) {
                                    Object obj = arrayList3.get(i18);
                                    i18++;
                                    o oVar = (o) obj;
                                    int size6 = arrayList5.size();
                                    int i19 = 0;
                                    while (true) {
                                        if (i19 >= size6) {
                                            i3 = size5;
                                            i10 = i15;
                                            arrayList6.add(new p(new JSONObject().put("productId", oVar.a).put(TeXSymbolParser.TYPE_ATTR, oVar.b).put("statusCode", 0).toString()));
                                            break;
                                        }
                                        Object obj2 = arrayList5.get(i19);
                                        i19++;
                                        l lVar2 = (l) obj2;
                                        i3 = size5;
                                        i10 = i15;
                                        if (!oVar.a.equals(lVar2.c) || !oVar.b.equals(lVar2.d)) {
                                            size5 = i3;
                                            i15 = i10;
                                        }
                                    }
                                    size5 = i3;
                                    i15 = i10;
                                }
                            }
                            int i20 = i15;
                            arrayList.addAll(arrayList5);
                            arrayList2.addAll(arrayList6);
                            rVar = rVar3;
                            i12 = i20;
                            exc = null;
                            i11 = 0;
                        } catch (JSONException e11) {
                            kgVar = bVar.s(z.a(6, "Error trying to decode SkuDetails."), 47, "Got a JSON exception trying to decode UnfetchedProduct. \n Exception: ", e11);
                        }
                    } else {
                        int a10 = com.google.android.gms.internal.play_billing.u.a("BillingClient", d12);
                        String f10 = com.google.android.gms.internal.play_billing.u.f("BillingClient", d12);
                        kgVar = a10 != 0 ? bVar.s(z.a(a10, f10), 23, k2.p1.i(a10, "getSkuDetails() failed for queryProductDetailsAsync. Response code: "), null) : bVar.s(z.a(6, f10), 45, "getSkuDetails() returned a bundle with neither an error nor a product detail list for queryProductDetailsAsync.", null);
                    }
                } catch (DeadObjectException e12) {
                    e = e12;
                    kgVar = bVar.s(z.h, i11, "queryProductDetailsAsync got a remote exception (try to reconnect).", e);
                    ((q1) p1Var.b).k(z.a(kgVar.b, (String) kgVar.d), (ArrayList) kgVar.c);
                    return null;
                } catch (Exception e13) {
                    e = e13;
                    kgVar = bVar.s(z.f, i11, "queryProductDetailsAsync got a remote exception (try to reconnect).", e);
                    ((q1) p1Var.b).k(z.a(kgVar.b, (String) kgVar.d), (ArrayList) kgVar.c);
                    return null;
                }
            } catch (DeadObjectException e14) {
                e = e14;
                i11 = 43;
            } catch (Exception e15) {
                e = e15;
                i11 = 43;
            }
        }
        ((q1) p1Var.b).k(z.a(kgVar.b, (String) kgVar.d), (ArrayList) kgVar.c);
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:93:0x0088, code lost:
    
        r0 = r2.x(e5.z.h, org.telegram.messenger.hs.s1, "Service has been reset to null", r3);
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
        p4.q x10;
        List list;
        com.google.android.gms.internal.play_billing.c cVar;
        f a10;
        int i3;
        b bVar = (b) this.b;
        Exception exc2 = null;
        int i10 = 9;
        if (!bVar.n()) {
            f fVar = z.h;
            bVar.y(2, 9, fVar);
            m mVar = (m) this.c;
            com.google.android.gms.internal.play_billing.p pVar = com.google.android.gms.internal.play_billing.r.b;
            mVar.a(fVar, com.google.android.gms.internal.play_billing.v.e);
            return null;
        }
        String str = (String) this.d;
        if (TextUtils.isEmpty(str)) {
            com.google.android.gms.internal.play_billing.u.h("BillingClient", "Please provide a valid product type.");
            f fVar2 = z.d;
            bVar.y(50, 9, fVar2);
            m mVar2 = (m) this.c;
            com.google.android.gms.internal.play_billing.p pVar2 = com.google.android.gms.internal.play_billing.r.b;
            mVar2.a(fVar2, com.google.android.gms.internal.play_billing.v.e);
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
        int i11 = 1;
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
                                } catch (DeadObjectException e10) {
                                    e = e10;
                                    x10 = bVar.x(z.h, 52, "Got exception trying to get purchases try to reconnect", e);
                                    list = (List) x10.a;
                                    if (list != null) {
                                    }
                                    return exc;
                                } catch (Exception e11) {
                                    e = e11;
                                    x10 = bVar.x(z.f, 52, "Got exception trying to get purchases try to reconnect", e);
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
                Bundle c12 = bVar.n ? ((com.google.android.gms.internal.play_billing.a) cVar).c1(bVar.w ? 26 : bVar.v ? 24 : bVar.s ? 19 : i10, bVar.g.getPackageName(), str, str2, bundle) : ((com.google.android.gms.internal.play_billing.a) cVar).b1(bVar.g.getPackageName(), str, str2);
                f fVar3 = z.f;
                if (c12 == null) {
                    com.google.android.gms.internal.play_billing.u.h("BillingClient", "getPurchase() got null owned items list");
                    i3 = 54;
                } else {
                    int a11 = com.google.android.gms.internal.play_billing.u.a("BillingClient", c12);
                    String f10 = com.google.android.gms.internal.play_billing.u.f("BillingClient", c12);
                    e3.a a12 = f.a();
                    a12.b = a11;
                    a12.a = f10;
                    a10 = a12.a();
                    if (a11 != 0) {
                        com.google.android.gms.internal.play_billing.u.h("BillingClient", "getPurchase() failed. Response code: " + a11);
                        i3 = 23;
                    } else if (c12.containsKey("INAPP_PURCHASE_ITEM_LIST") && c12.containsKey("INAPP_PURCHASE_DATA_LIST") && c12.containsKey("INAPP_DATA_SIGNATURE_LIST")) {
                        ArrayList<String> stringArrayList = c12.getStringArrayList("INAPP_PURCHASE_ITEM_LIST");
                        ArrayList<String> stringArrayList2 = c12.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
                        ArrayList<String> stringArrayList3 = c12.getStringArrayList("INAPP_DATA_SIGNATURE_LIST");
                        if (stringArrayList == null) {
                            com.google.android.gms.internal.play_billing.u.h("BillingClient", "Bundle returned from getPurchase() contains null SKUs list.");
                            i3 = 56;
                        } else if (stringArrayList2 == null) {
                            com.google.android.gms.internal.play_billing.u.h("BillingClient", "Bundle returned from getPurchase() contains null purchases list.");
                            i3 = 57;
                        } else if (stringArrayList3 == null) {
                            com.google.android.gms.internal.play_billing.u.h("BillingClient", "Bundle returned from getPurchase() contains null signatures list.");
                            i3 = 58;
                        } else {
                            a10 = z.g;
                            i3 = i11;
                        }
                    } else {
                        com.google.android.gms.internal.play_billing.u.h("BillingClient", "Bundle returned from getPurchase() doesn't contain required fields.");
                        i3 = 55;
                    }
                    if (a10 == z.g) {
                        x10 = bVar.x(a10, i3, "Purchase bundle invalid", exc2);
                        break;
                    }
                    ArrayList<String> stringArrayList4 = c12.getStringArrayList("INAPP_PURCHASE_ITEM_LIST");
                    ArrayList<String> stringArrayList5 = c12.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
                    ArrayList<String> stringArrayList6 = c12.getStringArrayList("INAPP_DATA_SIGNATURE_LIST");
                    exc = exc2;
                    boolean z11 = false;
                    for (int i12 = 0; i12 < stringArrayList5.size(); i12++) {
                        String str3 = stringArrayList5.get(i12);
                        String str4 = stringArrayList6.get(i12);
                        com.google.android.gms.internal.play_billing.u.g("BillingClient", "Sku is owned: ".concat(String.valueOf(stringArrayList4.get(i12))));
                        try {
                            Purchase purchase = new Purchase(str3, str4);
                            if (TextUtils.isEmpty(purchase.c())) {
                                com.google.android.gms.internal.play_billing.u.h("BillingClient", "BUG: empty/null token!");
                                z11 = true;
                            }
                            arrayList.add(purchase);
                        } catch (JSONException e12) {
                            x10 = bVar.x(z.f, 51, "Got an exception trying to decode the purchase!", e12);
                        }
                    }
                    if (z11) {
                        i10 = 9;
                        bVar.y(26, 9, fVar3);
                    } else {
                        i10 = 9;
                    }
                    str2 = c12.getString("INAPP_CONTINUATION_TOKEN");
                    com.google.android.gms.internal.play_billing.u.g("BillingClient", "Continuation token: ".concat(String.valueOf(str2)));
                    if (TextUtils.isEmpty(str2)) {
                        x10 = new p4.q(z.g, arrayList, false);
                        break;
                    }
                    exc2 = exc;
                    i11 = 1;
                }
                a10 = fVar3;
                if (a10 == z.g) {
                }
            } catch (DeadObjectException e13) {
                e = e13;
                exc = exc2;
            } catch (Exception e14) {
                e = e14;
                exc = exc2;
            }
        }
        exc = exc2;
        list = (List) x10.a;
        if (list != null) {
            ((m) this.c).a((f) x10.b, list);
        } else {
            m mVar3 = (m) this.c;
            f fVar4 = (f) x10.b;
            com.google.android.gms.internal.play_billing.p pVar3 = com.google.android.gms.internal.play_billing.r.b;
            mVar3.a(fVar4, com.google.android.gms.internal.play_billing.v.e);
        }
        return exc;
    }

    private final Object c() {
        Bundle c2;
        com.google.android.gms.internal.play_billing.c cVar;
        b bVar = (b) this.b;
        String str = (String) this.c;
        String str2 = (String) this.d;
        try {
            synchronized (bVar.a) {
                cVar = bVar.i;
            }
            if (cVar == null) {
                return com.google.android.gms.internal.play_billing.u.c(hs.s1, z.h);
            }
            return ((com.google.android.gms.internal.play_billing.a) cVar).Z0(bVar.g.getPackageName(), str, str2);
        } catch (DeadObjectException e10) {
            f fVar = z.h;
            String a10 = x.a(e10);
            c2 = com.google.android.gms.internal.play_billing.u.c(5, fVar);
            if (a10 != null) {
                c2.putString("ADDITIONAL_LOG_DETAILS", a10);
            }
            return c2;
        } catch (Exception e11) {
            f fVar2 = z.f;
            String a11 = x.a(e11);
            c2 = com.google.android.gms.internal.play_billing.u.c(5, fVar2);
            if (a11 != null) {
                c2.putString("ADDITIONAL_LOG_DETAILS", a11);
            }
            return c2;
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
                g gVar = (g) this.c;
                com.google.android.gms.internal.clearcut.e eVar = (com.google.android.gms.internal.clearcut.e) this.d;
                if (!bVar.n()) {
                    f fVar = z.h;
                    bVar.y(2, 4, fVar);
                    gVar.a(fVar);
                    return null;
                }
                String str2 = "Error consuming purchase with token. Response code: ";
                String str3 = eVar.a;
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
                                    bVar.g(gVar, str2, z.h, hs.s1, "Service has been reset to null.", null);
                                    return null;
                                } catch (DeadObjectException e10) {
                                    e = e10;
                                    deadObjectException = e;
                                    bVar.g(gVar, str2, z.h, 29, "Error consuming purchase!", deadObjectException);
                                    return null;
                                } catch (Exception e11) {
                                    e = e11;
                                    exc = e;
                                    bVar.g(gVar, str2, z.f, 29, "Error consuming purchase!", exc);
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
                            f a10 = z.a(readInt, str);
                            if (readInt == 0) {
                                com.google.android.gms.internal.play_billing.u.g("BillingClient", "Successfully consumed purchase.");
                                gVar.a(a10);
                                return null;
                            }
                            bVar.g(gVar, str3, a10, 23, "Error consuming purchase with token. Response code: " + readInt, null);
                            return null;
                        } catch (DeadObjectException e12) {
                            deadObjectException = e12;
                            str2 = str3;
                            bVar.g(gVar, str2, z.h, 29, "Error consuming purchase!", deadObjectException);
                            return null;
                        } catch (Exception e13) {
                            exc = e13;
                            str2 = str3;
                            bVar.g(gVar, str2, z.f, 29, "Error consuming purchase!", exc);
                            return null;
                        }
                    } catch (DeadObjectException e14) {
                        e = e14;
                    } catch (Exception e15) {
                        e = e15;
                    }
                } catch (DeadObjectException e16) {
                    e = e16;
                    str2 = str3;
                } catch (Exception e17) {
                    e = e17;
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

    public q(b bVar, m mVar, String str) {
        this.a = 2;
        this.c = mVar;
        this.d = str;
        Objects.requireNonNull(bVar);
        this.b = bVar;
    }
}

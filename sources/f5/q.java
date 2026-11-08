package f5;

import a8.wa;
import aa.c0;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Parcel;
import android.text.TextUtils;
import com.android.billingclient.api.Purchase;
import com.google.android.gms.internal.play_billing.t1;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import org.json.JSONException;
import org.json.JSONObject;
import org.scilab.forge.jlatexmath.TeXSymbolParser;
import org.telegram.messenger.j1;
import org.telegram.messenger.q1;
import org.telegram.messenger.qs;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes.dex */
public final /* synthetic */ class q implements Callable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ q(Object obj, Object obj2, Object obj3, int i7) {
        this.a = i7;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:96:0x00b3, code lost:
    
        r0 = r2.s(f5.z.h, org.telegram.messenger.qs.s1, "Service has been reset to null.", r5);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object a() {
        wa waVar;
        com.google.android.gms.internal.play_billing.c cVar;
        int i7;
        int i10;
        b bVar = (b) this.b;
        j1 j1Var = (j1) this.c;
        aa.n nVar = (aa.n) this.d;
        Exception exc = null;
        if (!bVar.n()) {
            f fVar = z.h;
            bVar.y(2, 7, fVar);
            com.google.android.gms.internal.play_billing.p pVar = com.google.android.gms.internal.play_billing.r.b;
            ((q1) j1Var.b).a(fVar, com.google.android.gms.internal.play_billing.v.e);
            return null;
        }
        if (!bVar.r) {
            com.google.android.gms.internal.play_billing.u.h("BillingClient", "Querying product details is not supported.");
            f fVar2 = z.m;
            bVar.y(20, 7, fVar2);
            com.google.android.gms.internal.play_billing.p pVar2 = com.google.android.gms.internal.play_billing.r.b;
            ((q1) j1Var.b).a(fVar2, com.google.android.gms.internal.play_billing.v.e);
            return null;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int i11 = 0;
        String str = ((o) ((com.google.android.gms.internal.play_billing.r) nVar.b).get(0)).b;
        com.google.android.gms.internal.play_billing.r rVar = (com.google.android.gms.internal.play_billing.r) nVar.b;
        int size = rVar.size();
        int i12 = 0;
        while (true) {
            if (i12 >= size) {
                waVar = new wa(0, "", arrayList, arrayList2);
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
                    Bundle D1 = ((com.google.android.gms.internal.play_billing.a) cVar).D1(true != bVar.t ? 17 : 20, bVar.g.getPackageName(), str, bundle, com.google.android.gms.internal.play_billing.u.d(str2, bVar.d, arrayList3, new t1(1), bVar.A.longValue()));
                    if (D1 == null) {
                        waVar = bVar.s(z.n, 44, "queryProductDetailsAsync got empty product details response.", null);
                        break;
                    }
                    if (D1.containsKey("DETAILS_LIST")) {
                        ArrayList<String> stringArrayList = D1.getStringArrayList("DETAILS_LIST");
                        if (stringArrayList == null) {
                            waVar = bVar.s(z.n, 46, "queryProductDetailsAsync got null response list", null);
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
                                waVar = bVar.s(z.a(6, "Error trying to decode SkuDetails."), 47, "Got a JSON exception trying to decode ProductDetails. \n Exception: ", e10);
                            }
                        }
                        com.google.android.gms.internal.play_billing.r rVar3 = rVar;
                        ArrayList<String> stringArrayList2 = D1.getStringArrayList("UNFETCHED_PRODUCT_LIST");
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
                                            i7 = size5;
                                            i10 = i15;
                                            arrayList6.add(new p(new JSONObject().put("productId", oVar.a).put(TeXSymbolParser.TYPE_ATTR, oVar.b).put("statusCode", 0).toString()));
                                            break;
                                        }
                                        Object obj2 = arrayList5.get(i19);
                                        i19++;
                                        l lVar2 = (l) obj2;
                                        i7 = size5;
                                        i10 = i15;
                                        if (!oVar.a.equals(lVar2.c) || !oVar.b.equals(lVar2.d)) {
                                            size5 = i7;
                                            i15 = i10;
                                        }
                                    }
                                    size5 = i7;
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
                            waVar = bVar.s(z.a(6, "Error trying to decode SkuDetails."), 47, "Got a JSON exception trying to decode UnfetchedProduct. \n Exception: ", e11);
                        }
                    } else {
                        int a10 = com.google.android.gms.internal.play_billing.u.a("BillingClient", D1);
                        String f10 = com.google.android.gms.internal.play_billing.u.f("BillingClient", D1);
                        waVar = a10 != 0 ? bVar.s(z.a(a10, f10), 23, jg.g.j(a10, "getSkuDetails() failed for queryProductDetailsAsync. Response code: "), null) : bVar.s(z.a(6, f10), 45, "getSkuDetails() returned a bundle with neither an error nor a product detail list for queryProductDetailsAsync.", null);
                    }
                } catch (DeadObjectException e12) {
                    e = e12;
                    waVar = bVar.s(z.h, i11, "queryProductDetailsAsync got a remote exception (try to reconnect).", e);
                    ((q1) j1Var.b).a(z.a(waVar.b, (String) waVar.d), (ArrayList) waVar.c);
                    return null;
                } catch (Exception e13) {
                    e = e13;
                    waVar = bVar.s(z.f, i11, "queryProductDetailsAsync got a remote exception (try to reconnect).", e);
                    ((q1) j1Var.b).a(z.a(waVar.b, (String) waVar.d), (ArrayList) waVar.c);
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
        ((q1) j1Var.b).a(z.a(waVar.b, (String) waVar.d), (ArrayList) waVar.c);
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:93:0x0088, code lost:
    
        r0 = r2.x(f5.z.h, org.telegram.messenger.qs.s1, "Service has been reset to null", r3);
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x023b  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0247  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x016c A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object b() {
        Exception exc;
        wf.b x10;
        List list;
        com.google.android.gms.internal.play_billing.c cVar;
        f a10;
        int i7;
        b bVar = (b) this.b;
        Exception exc2 = null;
        int i10 = 9;
        if (!bVar.n()) {
            f fVar = z.h;
            bVar.y(2, 9, fVar);
            m mVar = (m) this.c;
            com.google.android.gms.internal.play_billing.p pVar = com.google.android.gms.internal.play_billing.r.b;
            mVar.b(fVar, com.google.android.gms.internal.play_billing.v.e);
            return null;
        }
        String str = (String) this.d;
        if (TextUtils.isEmpty(str)) {
            com.google.android.gms.internal.play_billing.u.h("BillingClient", "Please provide a valid product type.");
            f fVar2 = z.d;
            bVar.y(50, 9, fVar2);
            m mVar2 = (m) this.c;
            com.google.android.gms.internal.play_billing.p pVar2 = com.google.android.gms.internal.play_billing.r.b;
            mVar2.b(fVar2, com.google.android.gms.internal.play_billing.v.e);
            return null;
        }
        com.google.android.gms.internal.play_billing.u.g("BillingClient", "Querying owned items, item type: ".concat(str));
        ArrayList arrayList = new ArrayList();
        boolean z9 = bVar.n;
        bVar.x.getClass();
        bVar.x.getClass();
        long longValue = bVar.A.longValue();
        Bundle bundle = new Bundle();
        com.google.android.gms.internal.play_billing.u.b(bundle, bVar.c, bVar.d, longValue);
        int i11 = 1;
        if (z9) {
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
                                    list = (List) x10.b;
                                    if (list != null) {
                                    }
                                    return exc;
                                } catch (Exception e11) {
                                    e = e11;
                                    x10 = bVar.x(z.f, 52, "Got exception trying to get purchases try to reconnect", e);
                                    list = (List) x10.b;
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
                Bundle C1 = bVar.n ? ((com.google.android.gms.internal.play_billing.a) cVar).C1(bVar.w ? 26 : bVar.v ? 24 : bVar.s ? 19 : i10, bVar.g.getPackageName(), str, str2, bundle) : ((com.google.android.gms.internal.play_billing.a) cVar).B1(bVar.g.getPackageName(), str, str2);
                f fVar3 = z.f;
                if (C1 == null) {
                    com.google.android.gms.internal.play_billing.u.h("BillingClient", "getPurchase() got null owned items list");
                    i7 = 54;
                } else {
                    int a11 = com.google.android.gms.internal.play_billing.u.a("BillingClient", C1);
                    String f10 = com.google.android.gms.internal.play_billing.u.f("BillingClient", C1);
                    f3.a a12 = f.a();
                    a12.b = a11;
                    a12.a = f10;
                    a10 = a12.a();
                    if (a11 != 0) {
                        com.google.android.gms.internal.play_billing.u.h("BillingClient", "getPurchase() failed. Response code: " + a11);
                        i7 = 23;
                    } else if (C1.containsKey("INAPP_PURCHASE_ITEM_LIST") && C1.containsKey("INAPP_PURCHASE_DATA_LIST") && C1.containsKey("INAPP_DATA_SIGNATURE_LIST")) {
                        ArrayList<String> stringArrayList = C1.getStringArrayList("INAPP_PURCHASE_ITEM_LIST");
                        ArrayList<String> stringArrayList2 = C1.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
                        ArrayList<String> stringArrayList3 = C1.getStringArrayList("INAPP_DATA_SIGNATURE_LIST");
                        if (stringArrayList == null) {
                            com.google.android.gms.internal.play_billing.u.h("BillingClient", "Bundle returned from getPurchase() contains null SKUs list.");
                            i7 = 56;
                        } else if (stringArrayList2 == null) {
                            com.google.android.gms.internal.play_billing.u.h("BillingClient", "Bundle returned from getPurchase() contains null purchases list.");
                            i7 = 57;
                        } else if (stringArrayList3 == null) {
                            com.google.android.gms.internal.play_billing.u.h("BillingClient", "Bundle returned from getPurchase() contains null signatures list.");
                            i7 = 58;
                        } else {
                            a10 = z.g;
                            i7 = i11;
                        }
                    } else {
                        com.google.android.gms.internal.play_billing.u.h("BillingClient", "Bundle returned from getPurchase() doesn't contain required fields.");
                        i7 = 55;
                    }
                    if (a10 == z.g) {
                        x10 = bVar.x(a10, i7, "Purchase bundle invalid", exc2);
                        break;
                    }
                    ArrayList<String> stringArrayList4 = C1.getStringArrayList("INAPP_PURCHASE_ITEM_LIST");
                    ArrayList<String> stringArrayList5 = C1.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
                    ArrayList<String> stringArrayList6 = C1.getStringArrayList("INAPP_DATA_SIGNATURE_LIST");
                    exc = exc2;
                    boolean z10 = false;
                    for (int i12 = 0; i12 < stringArrayList5.size(); i12++) {
                        String str3 = stringArrayList5.get(i12);
                        String str4 = stringArrayList6.get(i12);
                        com.google.android.gms.internal.play_billing.u.g("BillingClient", "Sku is owned: ".concat(String.valueOf(stringArrayList4.get(i12))));
                        try {
                            Purchase purchase = new Purchase(str3, str4);
                            if (TextUtils.isEmpty(purchase.c())) {
                                com.google.android.gms.internal.play_billing.u.h("BillingClient", "BUG: empty/null token!");
                                z10 = true;
                            }
                            arrayList.add(purchase);
                        } catch (JSONException e12) {
                            x10 = bVar.x(z.f, 51, "Got an exception trying to decode the purchase!", e12);
                        }
                    }
                    if (z10) {
                        i10 = 9;
                        bVar.y(26, 9, fVar3);
                    } else {
                        i10 = 9;
                    }
                    str2 = C1.getString("INAPP_CONTINUATION_TOKEN");
                    com.google.android.gms.internal.play_billing.u.g("BillingClient", "Continuation token: ".concat(String.valueOf(str2)));
                    if (TextUtils.isEmpty(str2)) {
                        x10 = new wf.b(z.g, arrayList, false, 17);
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
        list = (List) x10.b;
        if (list != null) {
            ((m) this.c).b((f) x10.c, list);
        } else {
            m mVar3 = (m) this.c;
            f fVar4 = (f) x10.c;
            com.google.android.gms.internal.play_billing.p pVar3 = com.google.android.gms.internal.play_billing.r.b;
            mVar3.b(fVar4, com.google.android.gms.internal.play_billing.v.e);
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
                return com.google.android.gms.internal.play_billing.u.c(qs.s1, z.h);
            }
            return ((com.google.android.gms.internal.play_billing.a) cVar).z1(bVar.g.getPackageName(), str, str2);
        } catch (DeadObjectException e10) {
            f fVar = z.h;
            String a10 = x.a(e10);
            c10 = com.google.android.gms.internal.play_billing.u.c(5, fVar);
            if (a10 != null) {
                c10.putString("ADDITIONAL_LOG_DETAILS", a10);
            }
            return c10;
        } catch (Exception e11) {
            f fVar2 = z.f;
            String a11 = x.a(e11);
            c10 = com.google.android.gms.internal.play_billing.u.c(5, fVar2);
            if (a11 != null) {
                c10.putString("ADDITIONAL_LOG_DETAILS", a11);
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
                g gVar = (g) this.c;
                c0 c0Var = (c0) this.d;
                if (!bVar.n()) {
                    f fVar = z.h;
                    bVar.y(2, 4, fVar);
                    gVar.a(fVar);
                    return null;
                }
                String str2 = "Error consuming purchase with token. Response code: ";
                String str3 = c0Var.a;
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
                                    bVar.g(gVar, str2, z.h, qs.s1, "Service has been reset to null.", null);
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
                                boolean z9 = bVar.n;
                                String str4 = bVar.c;
                                String str5 = bVar.d;
                                long longValue = bVar.A.longValue();
                                Bundle bundle = new Bundle();
                                if (z9) {
                                    com.google.android.gms.internal.play_billing.u.b(bundle, str4, str5, longValue);
                                }
                                Bundle y12 = ((com.google.android.gms.internal.play_billing.a) cVar).y1(packageName, str3, bundle);
                                readInt = y12.getInt("RESPONSE_CODE");
                                str = com.google.android.gms.internal.play_billing.u.f("BillingClient", y12);
                            } else {
                                String packageName2 = bVar.g.getPackageName();
                                com.google.android.gms.internal.play_billing.a aVar = (com.google.android.gms.internal.play_billing.a) cVar;
                                Parcel v12 = aVar.v1();
                                v12.writeInt(3);
                                v12.writeString(packageName2);
                                v12.writeString(str3);
                                Parcel w12 = aVar.w1(v12, 5);
                                readInt = w12.readInt();
                                w12.recycle();
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

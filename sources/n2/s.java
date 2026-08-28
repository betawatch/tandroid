package n2;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Parcel;
import android.text.TextUtils;
import com.android.billingclient.api.Purchase;
import com.google.android.gms.internal.play_billing.t1;
import f7.d7;
import j$.util.Objects;
import j3.r0;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import org.json.JSONException;
import org.json.JSONObject;
import org.scilab.forge.jlatexmath.TeXSymbolParser;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final /* synthetic */ class s implements Callable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ s(Object obj, Object obj2, Object obj3, int i9) {
        this.a = i9;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x00b6, code lost:
    
        r0 = r2.s(n2.b0.h, 107, "Service has been reset to null.", r5);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object a() {
        t5.l lVar;
        int i9;
        com.google.android.gms.internal.play_billing.c cVar;
        int i10;
        int i11;
        b bVar = (b) this.b;
        org.telegram.messenger.d dVar = (org.telegram.messenger.d) this.c;
        p pVar = (p) this.d;
        Exception exc = null;
        if (!bVar.n()) {
            g gVar = b0.h;
            bVar.y(2, 7, gVar);
            com.google.android.gms.internal.play_billing.p pVar2 = com.google.android.gms.internal.play_billing.r.b;
            com.google.android.gms.internal.play_billing.v vVar = com.google.android.gms.internal.play_billing.v.e;
            dVar.a(gVar, new q(vVar, vVar));
            return null;
        }
        if (!bVar.r) {
            com.google.android.gms.internal.play_billing.u.h("BillingClient", "Querying product details is not supported.");
            g gVar2 = b0.m;
            bVar.y(20, 7, gVar2);
            com.google.android.gms.internal.play_billing.p pVar3 = com.google.android.gms.internal.play_billing.r.b;
            com.google.android.gms.internal.play_billing.v vVar2 = com.google.android.gms.internal.play_billing.v.e;
            dVar.a(gVar2, new q(vVar2, vVar2));
            return null;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        String str = ((o) ((com.google.android.gms.internal.play_billing.r) pVar.b).get(0)).b;
        com.google.android.gms.internal.play_billing.r rVar = (com.google.android.gms.internal.play_billing.r) pVar.b;
        int size = rVar.size();
        int i12 = 0;
        while (true) {
            if (i12 >= size) {
                lVar = new t5.l(0, "", arrayList, arrayList2);
                break;
            }
            int i13 = i12 + 20;
            ArrayList arrayList3 = new ArrayList(rVar.subList(i12, i13 > size ? size : i13));
            ArrayList<String> arrayList4 = new ArrayList<>();
            int size2 = arrayList3.size();
            for (int i14 = 0; i14 < size2; i14++) {
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
                        i9 = 43;
                        while (true) {
                            try {
                            } catch (Throwable th) {
                                th = th;
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
                    Bundle a12 = ((com.google.android.gms.internal.play_billing.a) cVar).a1(true != bVar.t ? 17 : 20, bVar.g.getPackageName(), str, bundle, com.google.android.gms.internal.play_billing.u.d(str2, bVar.d, arrayList3, new t1(1), bVar.A.longValue()));
                    if (a12 == null) {
                        lVar = bVar.s(b0.n, 44, "queryProductDetailsAsync got empty product details response.", null);
                        break;
                    }
                    if (a12.containsKey("DETAILS_LIST")) {
                        ArrayList<String> stringArrayList = a12.getStringArrayList("DETAILS_LIST");
                        if (stringArrayList == null) {
                            lVar = bVar.s(b0.n, 46, "queryProductDetailsAsync got null response list", null);
                            break;
                        }
                        ArrayList arrayList5 = new ArrayList();
                        int size3 = stringArrayList.size();
                        int i16 = 0;
                        while (i16 < size3) {
                            com.google.android.gms.internal.play_billing.r rVar2 = rVar;
                            try {
                                l lVar2 = new l(stringArrayList.get(i16));
                                com.google.android.gms.internal.play_billing.u.g("BillingClient", "Got product details: ".concat(lVar2.toString()));
                                arrayList5.add(lVar2);
                                i16++;
                                rVar = rVar2;
                            } catch (JSONException e10) {
                                lVar = bVar.s(b0.a(6, "Error trying to decode SkuDetails."), 47, "Got a JSON exception trying to decode ProductDetails. \n Exception: ", e10);
                            }
                        }
                        com.google.android.gms.internal.play_billing.r rVar3 = rVar;
                        ArrayList<String> stringArrayList2 = a12.getStringArrayList("UNFETCHED_PRODUCT_LIST");
                        new ArrayList();
                        try {
                            ArrayList arrayList6 = new ArrayList();
                            if (stringArrayList2 != null) {
                                int size4 = stringArrayList2.size();
                                int i17 = 0;
                                while (i17 < size4) {
                                    String str3 = stringArrayList2.get(i17);
                                    i17++;
                                    r rVar4 = new r(str3);
                                    com.google.android.gms.internal.play_billing.u.g("BillingClient", "Got unfetchedProduct: ".concat(rVar4.toString()));
                                    arrayList6.add(rVar4);
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
                                            i10 = size5;
                                            i11 = i15;
                                            arrayList6.add(new r(new JSONObject().put("productId", oVar.a).put(TeXSymbolParser.TYPE_ATTR, oVar.b).put("statusCode", 0).toString()));
                                            break;
                                        }
                                        Object obj2 = arrayList5.get(i19);
                                        i19++;
                                        l lVar3 = (l) obj2;
                                        i10 = size5;
                                        i11 = i15;
                                        if (!oVar.a.equals(lVar3.c) || !oVar.b.equals(lVar3.d)) {
                                            size5 = i10;
                                            i15 = i11;
                                        }
                                    }
                                    size5 = i10;
                                    i15 = i11;
                                }
                            }
                            int i20 = i15;
                            arrayList.addAll(arrayList5);
                            arrayList2.addAll(arrayList6);
                            rVar = rVar3;
                            i12 = i20;
                            exc = null;
                        } catch (JSONException e11) {
                            lVar = bVar.s(b0.a(6, "Error trying to decode SkuDetails."), 47, "Got a JSON exception trying to decode UnfetchedProduct. \n Exception: ", e11);
                        }
                    } else {
                        int a2 = com.google.android.gms.internal.play_billing.u.a("BillingClient", a12);
                        String f10 = com.google.android.gms.internal.play_billing.u.f("BillingClient", a12);
                        lVar = a2 != 0 ? bVar.s(b0.a(a2, f10), 23, r0.l(a2, "getSkuDetails() failed for queryProductDetailsAsync. Response code: "), null) : bVar.s(b0.a(6, f10), 45, "getSkuDetails() returned a bundle with neither an error nor a product detail list for queryProductDetailsAsync.", null);
                    }
                } catch (DeadObjectException e12) {
                    e = e12;
                    lVar = bVar.s(b0.h, i9, "queryProductDetailsAsync got a remote exception (try to reconnect).", e);
                    dVar.a(b0.a(lVar.a, (String) lVar.d), new q((ArrayList) lVar.b, (ArrayList) lVar.c));
                    return null;
                } catch (Exception e13) {
                    e = e13;
                    lVar = bVar.s(b0.f, i9, "queryProductDetailsAsync got a remote exception (try to reconnect).", e);
                    dVar.a(b0.a(lVar.a, (String) lVar.d), new q((ArrayList) lVar.b, (ArrayList) lVar.c));
                    return null;
                }
            } catch (DeadObjectException e14) {
                e = e14;
                i9 = 43;
            } catch (Exception e15) {
                e = e15;
                i9 = 43;
            }
        }
        dVar.a(b0.a(lVar.a, (String) lVar.d), new q((ArrayList) lVar.b, (ArrayList) lVar.c));
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:93:0x008c, code lost:
    
        r0 = r2.x(n2.b0.h, 107, "Service has been reset to null", r3);
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0240  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x024c  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0171 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object b() {
        Exception exc;
        g5.b x10;
        List list;
        com.google.android.gms.internal.play_billing.c cVar;
        g a2;
        int i9;
        b bVar = (b) this.b;
        Exception exc2 = null;
        if (!bVar.n()) {
            g gVar = b0.h;
            bVar.y(2, 9, gVar);
            m mVar = (m) this.c;
            com.google.android.gms.internal.play_billing.p pVar = com.google.android.gms.internal.play_billing.r.b;
            mVar.c(gVar, com.google.android.gms.internal.play_billing.v.e);
            return null;
        }
        String str = (String) this.d;
        if (TextUtils.isEmpty(str)) {
            com.google.android.gms.internal.play_billing.u.h("BillingClient", "Please provide a valid product type.");
            g gVar2 = b0.d;
            bVar.y(50, 9, gVar2);
            m mVar2 = (m) this.c;
            com.google.android.gms.internal.play_billing.p pVar2 = com.google.android.gms.internal.play_billing.r.b;
            mVar2.c(gVar2, com.google.android.gms.internal.play_billing.v.e);
            return null;
        }
        com.google.android.gms.internal.play_billing.u.g("BillingClient", "Querying owned items, item type: ".concat(String.valueOf(str)));
        ArrayList arrayList = new ArrayList();
        boolean z10 = bVar.n;
        bVar.x.getClass();
        bVar.x.getClass();
        long longValue = bVar.A.longValue();
        Bundle bundle = new Bundle();
        com.google.android.gms.internal.play_billing.u.b(bundle, bVar.c, bVar.d, longValue);
        if (z10) {
            bundle.putBoolean("enablePendingPurchases", true);
        }
        String str2 = null;
        while (true) {
            try {
                synchronized (bVar.a) {
                    try {
                        cVar = bVar.i;
                    } catch (Throwable th) {
                        th = th;
                        exc = exc2;
                        while (true) {
                            try {
                                try {
                                    throw th;
                                } catch (DeadObjectException e10) {
                                    e = e10;
                                    x10 = bVar.x(b0.h, 52, "Got exception trying to get purchases try to reconnect", e);
                                    list = (List) x10.b;
                                    if (list != null) {
                                    }
                                    return exc;
                                } catch (Exception e11) {
                                    e = e11;
                                    x10 = bVar.x(b0.f, 52, "Got exception trying to get purchases try to reconnect", e);
                                    list = (List) x10.b;
                                    if (list != null) {
                                    }
                                    return exc;
                                }
                            } catch (Throwable th2) {
                                th = th2;
                            }
                        }
                    }
                }
                if (cVar == null) {
                    break;
                }
                Bundle Z0 = bVar.n ? ((com.google.android.gms.internal.play_billing.a) cVar).Z0(bVar.w ? 26 : bVar.v ? 24 : bVar.s ? 19 : 9, bVar.g.getPackageName(), str, str2, bundle) : ((com.google.android.gms.internal.play_billing.a) cVar).Y0(bVar.g.getPackageName(), str, str2);
                g gVar3 = b0.f;
                if (Z0 == null) {
                    com.google.android.gms.internal.play_billing.u.h("BillingClient", "getPurchase() got null owned items list");
                    i9 = 54;
                } else {
                    int a3 = com.google.android.gms.internal.play_billing.u.a("BillingClient", Z0);
                    String f10 = com.google.android.gms.internal.play_billing.u.f("BillingClient", Z0);
                    j3.a a10 = g.a();
                    a10.a = a3;
                    a10.c = f10;
                    a2 = a10.a();
                    if (a3 != 0) {
                        com.google.android.gms.internal.play_billing.u.h("BillingClient", "getPurchase() failed. Response code: " + a3);
                        i9 = 23;
                    } else if (Z0.containsKey("INAPP_PURCHASE_ITEM_LIST") && Z0.containsKey("INAPP_PURCHASE_DATA_LIST") && Z0.containsKey("INAPP_DATA_SIGNATURE_LIST")) {
                        ArrayList<String> stringArrayList = Z0.getStringArrayList("INAPP_PURCHASE_ITEM_LIST");
                        ArrayList<String> stringArrayList2 = Z0.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
                        ArrayList<String> stringArrayList3 = Z0.getStringArrayList("INAPP_DATA_SIGNATURE_LIST");
                        if (stringArrayList == null) {
                            com.google.android.gms.internal.play_billing.u.h("BillingClient", "Bundle returned from getPurchase() contains null SKUs list.");
                            i9 = 56;
                        } else if (stringArrayList2 == null) {
                            com.google.android.gms.internal.play_billing.u.h("BillingClient", "Bundle returned from getPurchase() contains null purchases list.");
                            i9 = 57;
                        } else if (stringArrayList3 == null) {
                            com.google.android.gms.internal.play_billing.u.h("BillingClient", "Bundle returned from getPurchase() contains null signatures list.");
                            i9 = 58;
                        } else {
                            a2 = b0.g;
                            i9 = 1;
                        }
                    } else {
                        com.google.android.gms.internal.play_billing.u.h("BillingClient", "Bundle returned from getPurchase() doesn't contain required fields.");
                        i9 = 55;
                    }
                    if (a2 == b0.g) {
                        x10 = bVar.x(a2, i9, "Purchase bundle invalid", exc2);
                        break;
                    }
                    ArrayList<String> stringArrayList4 = Z0.getStringArrayList("INAPP_PURCHASE_ITEM_LIST");
                    ArrayList<String> stringArrayList5 = Z0.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
                    ArrayList<String> stringArrayList6 = Z0.getStringArrayList("INAPP_DATA_SIGNATURE_LIST");
                    exc = exc2;
                    boolean z11 = false;
                    for (int i10 = 0; i10 < stringArrayList5.size(); i10++) {
                        String str3 = stringArrayList5.get(i10);
                        String str4 = stringArrayList6.get(i10);
                        com.google.android.gms.internal.play_billing.u.g("BillingClient", "Sku is owned: ".concat(String.valueOf(stringArrayList4.get(i10))));
                        try {
                            Purchase purchase = new Purchase(str3, str4);
                            if (TextUtils.isEmpty(purchase.c())) {
                                com.google.android.gms.internal.play_billing.u.h("BillingClient", "BUG: empty/null token!");
                                z11 = true;
                            }
                            arrayList.add(purchase);
                        } catch (JSONException e12) {
                            x10 = bVar.x(b0.f, 51, "Got an exception trying to decode the purchase!", e12);
                        }
                    }
                    if (z11) {
                        bVar.y(26, 9, gVar3);
                    }
                    str2 = Z0.getString("INAPP_CONTINUATION_TOKEN");
                    com.google.android.gms.internal.play_billing.u.g("BillingClient", "Continuation token: ".concat(String.valueOf(str2)));
                    if (TextUtils.isEmpty(str2)) {
                        x10 = new g5.b(b0.g, arrayList, false, 25);
                        break;
                    }
                    exc2 = exc;
                }
                a2 = gVar3;
                if (a2 == b0.g) {
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
            ((m) this.c).c((g) x10.c, list);
        } else {
            m mVar3 = (m) this.c;
            g gVar4 = (g) x10.c;
            com.google.android.gms.internal.play_billing.p pVar3 = com.google.android.gms.internal.play_billing.r.b;
            mVar3.c(gVar4, com.google.android.gms.internal.play_billing.v.e);
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
                return com.google.android.gms.internal.play_billing.u.c(107, b0.h);
            }
            return ((com.google.android.gms.internal.play_billing.a) cVar).W0(bVar.g.getPackageName(), str, str2);
        } catch (DeadObjectException e10) {
            g gVar = b0.h;
            String a2 = z.a(e10);
            c10 = com.google.android.gms.internal.play_billing.u.c(5, gVar);
            if (a2 != null) {
                c10.putString("ADDITIONAL_LOG_DETAILS", a2);
            }
            return c10;
        } catch (Exception e11) {
            g gVar2 = b0.f;
            String a3 = z.a(e11);
            c10 = com.google.android.gms.internal.play_billing.u.c(5, gVar2);
            if (a3 != null) {
                c10.putString("ADDITIONAL_LOG_DETAILS", a3);
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
                d7 d7Var = (d7) this.d;
                if (!bVar.n()) {
                    g gVar = b0.h;
                    bVar.y(2, 4, gVar);
                    hVar.a(gVar, d7Var.a);
                    return null;
                }
                String str2 = "Error consuming purchase with token. Response code: ";
                String str3 = d7Var.a;
                try {
                    com.google.android.gms.internal.play_billing.u.g("BillingClient", "Consuming purchase with token: ".concat(str3));
                    try {
                        synchronized (bVar.a) {
                            try {
                                cVar = bVar.i;
                            } catch (Throwable th) {
                                th = th;
                                while (true) {
                                    try {
                                        throw th;
                                    } catch (Throwable th2) {
                                        th = th2;
                                    }
                                }
                            }
                        }
                        try {
                            if (cVar == null) {
                                str2 = str3;
                                try {
                                    bVar.g(hVar, str2, b0.h, 107, "Service has been reset to null.", null);
                                    return null;
                                } catch (DeadObjectException e10) {
                                    e = e10;
                                    deadObjectException = e;
                                    bVar.g(hVar, str2, b0.h, 29, "Error consuming purchase!", deadObjectException);
                                    return null;
                                } catch (Exception e11) {
                                    e = e11;
                                    exc = e;
                                    bVar.g(hVar, str2, b0.f, 29, "Error consuming purchase!", exc);
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
                                Bundle V0 = ((com.google.android.gms.internal.play_billing.a) cVar).V0(packageName, str3, bundle);
                                readInt = V0.getInt("RESPONSE_CODE");
                                str = com.google.android.gms.internal.play_billing.u.f("BillingClient", V0);
                            } else {
                                String packageName2 = bVar.g.getPackageName();
                                com.google.android.gms.internal.play_billing.a aVar = (com.google.android.gms.internal.play_billing.a) cVar;
                                Parcel S0 = aVar.S0();
                                S0.writeInt(3);
                                S0.writeString(packageName2);
                                S0.writeString(str3);
                                Parcel T0 = aVar.T0(S0, 5);
                                readInt = T0.readInt();
                                T0.recycle();
                                str = "";
                            }
                            g a2 = b0.a(readInt, str);
                            if (readInt == 0) {
                                com.google.android.gms.internal.play_billing.u.g("BillingClient", "Successfully consumed purchase.");
                                hVar.a(a2, str3);
                                return null;
                            }
                            bVar.g(hVar, str3, a2, 23, "Error consuming purchase with token. Response code: " + readInt, null);
                            return null;
                        } catch (DeadObjectException e12) {
                            deadObjectException = e12;
                            str2 = str3;
                            bVar.g(hVar, str2, b0.h, 29, "Error consuming purchase!", deadObjectException);
                            return null;
                        } catch (Exception e13) {
                            exc = e13;
                            str2 = str3;
                            bVar.g(hVar, str2, b0.f, 29, "Error consuming purchase!", exc);
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

    public s(b bVar, m mVar, String str) {
        this.a = 2;
        this.c = mVar;
        this.d = str;
        Objects.requireNonNull(bVar);
        this.b = bVar;
    }
}

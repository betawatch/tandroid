package c5;

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

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public final /* synthetic */ class u implements Callable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ u(Object obj, Object obj2, Object obj3, int i10) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x00b6, code lost:
    
        r0 = r2.s(c5.g0.h, 107, "Service has been reset to null.", r5);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object a() {
        j6.l lVar;
        int i10;
        com.google.android.gms.internal.play_billing.c cVar;
        int i11;
        int i12;
        c cVar2 = (c) this.b;
        org.telegram.messenger.c0 c0Var = (org.telegram.messenger.c0) this.c;
        xa.c cVar3 = (xa.c) this.d;
        Exception exc = null;
        if (!cVar2.n()) {
            h hVar = g0.h;
            cVar2.y(2, 7, hVar);
            com.google.android.gms.internal.play_billing.p pVar = com.google.android.gms.internal.play_billing.r.b;
            com.google.android.gms.internal.play_billing.v vVar = com.google.android.gms.internal.play_billing.v.e;
            c0Var.a(hVar, new s(vVar, vVar));
            return null;
        }
        if (!cVar2.r) {
            com.google.android.gms.internal.play_billing.u.h("BillingClient", "Querying product details is not supported.");
            h hVar2 = g0.m;
            cVar2.y(20, 7, hVar2);
            com.google.android.gms.internal.play_billing.p pVar2 = com.google.android.gms.internal.play_billing.r.b;
            com.google.android.gms.internal.play_billing.v vVar2 = com.google.android.gms.internal.play_billing.v.e;
            c0Var.a(hVar2, new s(vVar2, vVar2));
            return null;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        String str = ((r) ((com.google.android.gms.internal.play_billing.r) cVar3.b).get(0)).b;
        com.google.android.gms.internal.play_billing.r rVar = (com.google.android.gms.internal.play_billing.r) cVar3.b;
        int size = rVar.size();
        int i13 = 0;
        while (true) {
            if (i13 >= size) {
                lVar = new j6.l(0, "", arrayList, arrayList2);
                break;
            }
            int i14 = i13 + 20;
            ArrayList arrayList3 = new ArrayList(rVar.subList(i13, i14 > size ? size : i14));
            ArrayList<String> arrayList4 = new ArrayList<>();
            int size2 = arrayList3.size();
            for (int i15 = 0; i15 < size2; i15++) {
                arrayList4.add(((r) arrayList3.get(i15)).a);
            }
            Bundle bundle = new Bundle();
            bundle.putStringArrayList("ITEM_ID_LIST", arrayList4);
            String str2 = cVar2.c;
            bundle.putString("playBillingLibraryVersion", str2);
            try {
                synchronized (cVar2.a) {
                    try {
                        cVar = cVar2.i;
                    } finally {
                        th = th;
                        i10 = 43;
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
                if (cVar2.s) {
                    cVar2.x.getClass();
                }
                cVar2.v();
                cVar2.v();
                cVar2.v();
                cVar2.v();
                int i16 = i14;
                try {
                    Bundle c12 = ((com.google.android.gms.internal.play_billing.a) cVar).c1(true != cVar2.t ? 17 : 20, cVar2.g.getPackageName(), str, bundle, com.google.android.gms.internal.play_billing.u.d(str2, cVar2.d, arrayList3, new t1(1), cVar2.A.longValue()));
                    if (c12 == null) {
                        lVar = cVar2.s(g0.n, 44, "queryProductDetailsAsync got empty product details response.", null);
                        break;
                    }
                    if (c12.containsKey("DETAILS_LIST")) {
                        ArrayList<String> stringArrayList = c12.getStringArrayList("DETAILS_LIST");
                        if (stringArrayList == null) {
                            lVar = cVar2.s(g0.n, 46, "queryProductDetailsAsync got null response list", null);
                            break;
                        }
                        ArrayList arrayList5 = new ArrayList();
                        int size3 = stringArrayList.size();
                        int i17 = 0;
                        while (i17 < size3) {
                            com.google.android.gms.internal.play_billing.r rVar2 = rVar;
                            try {
                                o oVar = new o(stringArrayList.get(i17));
                                com.google.android.gms.internal.play_billing.u.g("BillingClient", "Got product details: ".concat(oVar.toString()));
                                arrayList5.add(oVar);
                                i17++;
                                rVar = rVar2;
                            } catch (JSONException e) {
                                lVar = cVar2.s(g0.a(6, "Error trying to decode SkuDetails."), 47, "Got a JSON exception trying to decode ProductDetails. \n Exception: ", e);
                            }
                        }
                        com.google.android.gms.internal.play_billing.r rVar3 = rVar;
                        ArrayList<String> stringArrayList2 = c12.getStringArrayList("UNFETCHED_PRODUCT_LIST");
                        new ArrayList();
                        try {
                            ArrayList arrayList6 = new ArrayList();
                            if (stringArrayList2 != null) {
                                int size4 = stringArrayList2.size();
                                int i18 = 0;
                                while (i18 < size4) {
                                    String str3 = stringArrayList2.get(i18);
                                    i18++;
                                    t tVar = new t(str3);
                                    com.google.android.gms.internal.play_billing.u.g("BillingClient", "Got unfetchedProduct: ".concat(tVar.toString()));
                                    arrayList6.add(tVar);
                                }
                            } else {
                                int size5 = arrayList3.size();
                                int i19 = 0;
                                while (i19 < size5) {
                                    Object obj = arrayList3.get(i19);
                                    i19++;
                                    r rVar4 = (r) obj;
                                    int size6 = arrayList5.size();
                                    int i20 = 0;
                                    while (true) {
                                        if (i20 >= size6) {
                                            i11 = size5;
                                            i12 = i16;
                                            arrayList6.add(new t(new JSONObject().put("productId", rVar4.a).put(TeXSymbolParser.TYPE_ATTR, rVar4.b).put("statusCode", 0).toString()));
                                            break;
                                        }
                                        Object obj2 = arrayList5.get(i20);
                                        i20++;
                                        o oVar2 = (o) obj2;
                                        i11 = size5;
                                        i12 = i16;
                                        if (!rVar4.a.equals(oVar2.c) || !rVar4.b.equals(oVar2.d)) {
                                            size5 = i11;
                                            i16 = i12;
                                        }
                                    }
                                    size5 = i11;
                                    i16 = i12;
                                }
                            }
                            int i21 = i16;
                            arrayList.addAll(arrayList5);
                            arrayList2.addAll(arrayList6);
                            rVar = rVar3;
                            i13 = i21;
                            exc = null;
                        } catch (JSONException e7) {
                            lVar = cVar2.s(g0.a(6, "Error trying to decode SkuDetails."), 47, "Got a JSON exception trying to decode UnfetchedProduct. \n Exception: ", e7);
                        }
                    } else {
                        int a2 = com.google.android.gms.internal.play_billing.u.a("BillingClient", c12);
                        String f7 = com.google.android.gms.internal.play_billing.u.f("BillingClient", c12);
                        lVar = a2 != 0 ? cVar2.s(g0.a(a2, f7), 23, hc.b.j(a2, "getSkuDetails() failed for queryProductDetailsAsync. Response code: "), null) : cVar2.s(g0.a(6, f7), 45, "getSkuDetails() returned a bundle with neither an error nor a product detail list for queryProductDetailsAsync.", null);
                    }
                } catch (DeadObjectException e10) {
                    e = e10;
                    lVar = cVar2.s(g0.h, i10, "queryProductDetailsAsync got a remote exception (try to reconnect).", e);
                    c0Var.a(g0.a(lVar.a, (String) lVar.d), new s((ArrayList) lVar.b, (ArrayList) lVar.c));
                    return null;
                } catch (Exception e11) {
                    e = e11;
                    lVar = cVar2.s(g0.f, i10, "queryProductDetailsAsync got a remote exception (try to reconnect).", e);
                    c0Var.a(g0.a(lVar.a, (String) lVar.d), new s((ArrayList) lVar.b, (ArrayList) lVar.c));
                    return null;
                }
            } catch (DeadObjectException e12) {
                e = e12;
                i10 = 43;
            } catch (Exception e13) {
                e = e13;
                i10 = 43;
            }
        }
        c0Var.a(g0.a(lVar.a, (String) lVar.d), new s((ArrayList) lVar.b, (ArrayList) lVar.c));
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:93:0x008c, code lost:
    
        r0 = r2.x(c5.g0.h, 107, "Service has been reset to null", r3);
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
        of.b x10;
        List list;
        com.google.android.gms.internal.play_billing.c cVar;
        Bundle b12;
        h a2;
        int i10;
        c cVar2 = (c) this.b;
        Exception exc2 = null;
        if (!cVar2.n()) {
            h hVar = g0.h;
            cVar2.y(2, 9, hVar);
            p pVar = (p) this.c;
            com.google.android.gms.internal.play_billing.p pVar2 = com.google.android.gms.internal.play_billing.r.b;
            pVar.a(hVar, com.google.android.gms.internal.play_billing.v.e);
            return null;
        }
        String str = (String) this.d;
        if (TextUtils.isEmpty(str)) {
            com.google.android.gms.internal.play_billing.u.h("BillingClient", "Please provide a valid product type.");
            h hVar2 = g0.d;
            cVar2.y(50, 9, hVar2);
            p pVar3 = (p) this.c;
            com.google.android.gms.internal.play_billing.p pVar4 = com.google.android.gms.internal.play_billing.r.b;
            pVar3.a(hVar2, com.google.android.gms.internal.play_billing.v.e);
            return null;
        }
        com.google.android.gms.internal.play_billing.u.g("BillingClient", "Querying owned items, item type: ".concat(String.valueOf(str)));
        ArrayList arrayList = new ArrayList();
        boolean z10 = cVar2.n;
        cVar2.x.getClass();
        cVar2.x.getClass();
        long longValue = cVar2.A.longValue();
        Bundle bundle = new Bundle();
        com.google.android.gms.internal.play_billing.u.b(bundle, cVar2.c, cVar2.d, longValue);
        if (z10) {
            bundle.putBoolean("enablePendingPurchases", true);
        }
        String str2 = null;
        while (true) {
            try {
                synchronized (cVar2.a) {
                    try {
                        cVar = cVar2.i;
                    } catch (Throwable th2) {
                        th = th2;
                        exc = exc2;
                        while (true) {
                            try {
                                try {
                                    throw th;
                                } catch (DeadObjectException e) {
                                    e = e;
                                    x10 = cVar2.x(g0.h, 52, "Got exception trying to get purchases try to reconnect", e);
                                    list = (List) x10.b;
                                    if (list != null) {
                                    }
                                    return exc;
                                } catch (Exception e7) {
                                    e = e7;
                                    x10 = cVar2.x(g0.f, 52, "Got exception trying to get purchases try to reconnect", e);
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
                if (cVar2.n) {
                    b12 = ((com.google.android.gms.internal.play_billing.a) cVar).b1(cVar2.w ? 26 : cVar2.v ? 24 : cVar2.s ? 19 : 9, cVar2.g.getPackageName(), str, str2, bundle);
                } else {
                    b12 = ((com.google.android.gms.internal.play_billing.a) cVar).a1(cVar2.g.getPackageName(), str, str2);
                }
                h hVar3 = g0.f;
                if (b12 == null) {
                    com.google.android.gms.internal.play_billing.u.h("BillingClient", "getPurchase() got null owned items list");
                    i10 = 54;
                } else {
                    int a10 = com.google.android.gms.internal.play_billing.u.a("BillingClient", b12);
                    String f7 = com.google.android.gms.internal.play_billing.u.f("BillingClient", b12);
                    c3.a a11 = h.a();
                    a11.b = a10;
                    a11.a = f7;
                    a2 = a11.a();
                    if (a10 != 0) {
                        com.google.android.gms.internal.play_billing.u.h("BillingClient", "getPurchase() failed. Response code: " + a10);
                        i10 = 23;
                    } else if (b12.containsKey("INAPP_PURCHASE_ITEM_LIST") && b12.containsKey("INAPP_PURCHASE_DATA_LIST") && b12.containsKey("INAPP_DATA_SIGNATURE_LIST")) {
                        ArrayList<String> stringArrayList = b12.getStringArrayList("INAPP_PURCHASE_ITEM_LIST");
                        ArrayList<String> stringArrayList2 = b12.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
                        ArrayList<String> stringArrayList3 = b12.getStringArrayList("INAPP_DATA_SIGNATURE_LIST");
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
                            a2 = g0.g;
                            i10 = 1;
                        }
                    } else {
                        com.google.android.gms.internal.play_billing.u.h("BillingClient", "Bundle returned from getPurchase() doesn't contain required fields.");
                        i10 = 55;
                    }
                    if (a2 == g0.g) {
                        x10 = cVar2.x(a2, i10, "Purchase bundle invalid", exc2);
                        break;
                    }
                    ArrayList<String> stringArrayList4 = b12.getStringArrayList("INAPP_PURCHASE_ITEM_LIST");
                    ArrayList<String> stringArrayList5 = b12.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
                    ArrayList<String> stringArrayList6 = b12.getStringArrayList("INAPP_DATA_SIGNATURE_LIST");
                    int i11 = 0;
                    exc = exc2;
                    boolean z11 = false;
                    while (i11 < stringArrayList5.size()) {
                        String str3 = stringArrayList5.get(i11);
                        String str4 = stringArrayList6.get(i11);
                        ArrayList<String> arrayList2 = stringArrayList4;
                        com.google.android.gms.internal.play_billing.u.g("BillingClient", "Sku is owned: ".concat(String.valueOf(stringArrayList4.get(i11))));
                        try {
                            Purchase purchase = new Purchase(str3, str4);
                            if (TextUtils.isEmpty(purchase.c())) {
                                com.google.android.gms.internal.play_billing.u.h("BillingClient", "BUG: empty/null token!");
                                z11 = true;
                            }
                            arrayList.add(purchase);
                            i11++;
                            stringArrayList4 = arrayList2;
                        } catch (JSONException e10) {
                            x10 = cVar2.x(g0.f, 51, "Got an exception trying to decode the purchase!", e10);
                        }
                    }
                    if (z11) {
                        cVar2.y(26, 9, hVar3);
                    }
                    str2 = b12.getString("INAPP_CONTINUATION_TOKEN");
                    com.google.android.gms.internal.play_billing.u.g("BillingClient", "Continuation token: ".concat(String.valueOf(str2)));
                    if (TextUtils.isEmpty(str2)) {
                        x10 = new of.b(6, g0.g, arrayList);
                        break;
                    }
                    exc2 = exc;
                }
                a2 = hVar3;
                if (a2 == g0.g) {
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
        list = (List) x10.b;
        if (list != null) {
            ((p) this.c).a((h) x10.c, list);
        } else {
            p pVar5 = (p) this.c;
            h hVar4 = (h) x10.c;
            com.google.android.gms.internal.play_billing.p pVar6 = com.google.android.gms.internal.play_billing.r.b;
            pVar5.a(hVar4, com.google.android.gms.internal.play_billing.v.e);
        }
        return exc;
    }

    private final Object c() {
        Bundle c10;
        com.google.android.gms.internal.play_billing.c cVar;
        c cVar2 = (c) this.b;
        String str = (String) this.c;
        String str2 = (String) this.d;
        try {
            synchronized (cVar2.a) {
                cVar = cVar2.i;
            }
            if (cVar == null) {
                return com.google.android.gms.internal.play_billing.u.c(107, g0.h);
            }
            return ((com.google.android.gms.internal.play_billing.a) cVar).Y0(cVar2.g.getPackageName(), str, str2);
        } catch (DeadObjectException e) {
            h hVar = g0.h;
            String a2 = e0.a(e);
            c10 = com.google.android.gms.internal.play_billing.u.c(5, hVar);
            if (a2 != null) {
                c10.putString("ADDITIONAL_LOG_DETAILS", a2);
            }
            return c10;
        } catch (Exception e7) {
            h hVar2 = g0.f;
            String a10 = e0.a(e7);
            c10 = com.google.android.gms.internal.play_billing.u.c(5, hVar2);
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
                c cVar2 = (c) this.b;
                j jVar = (j) this.c;
                i iVar = (i) this.d;
                if (!cVar2.n()) {
                    h hVar = g0.h;
                    cVar2.y(2, 4, hVar);
                    jVar.a(hVar, iVar.a);
                    return null;
                }
                String str2 = "Error consuming purchase with token. Response code: ";
                String str3 = iVar.a;
                try {
                    com.google.android.gms.internal.play_billing.u.g("BillingClient", "Consuming purchase with token: ".concat(str3));
                    try {
                        synchronized (cVar2.a) {
                            try {
                                cVar = cVar2.i;
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
                                    cVar2.g(jVar, str2, g0.h, 107, "Service has been reset to null.", null);
                                    return null;
                                } catch (DeadObjectException e) {
                                    e = e;
                                    deadObjectException = e;
                                    cVar2.g(jVar, str2, g0.h, 29, "Error consuming purchase!", deadObjectException);
                                    return null;
                                } catch (Exception e7) {
                                    e = e7;
                                    exc = e;
                                    cVar2.g(jVar, str2, g0.f, 29, "Error consuming purchase!", exc);
                                    return null;
                                }
                            }
                            if (cVar2.n) {
                                String packageName = cVar2.g.getPackageName();
                                boolean z10 = cVar2.n;
                                String str4 = cVar2.c;
                                String str5 = cVar2.d;
                                long longValue = cVar2.A.longValue();
                                Bundle bundle = new Bundle();
                                if (z10) {
                                    com.google.android.gms.internal.play_billing.u.b(bundle, str4, str5, longValue);
                                }
                                Bundle X0 = ((com.google.android.gms.internal.play_billing.a) cVar).X0(packageName, str3, bundle);
                                readInt = X0.getInt("RESPONSE_CODE");
                                str = com.google.android.gms.internal.play_billing.u.f("BillingClient", X0);
                            } else {
                                String packageName2 = cVar2.g.getPackageName();
                                com.google.android.gms.internal.play_billing.a aVar = (com.google.android.gms.internal.play_billing.a) cVar;
                                Parcel U0 = aVar.U0();
                                U0.writeInt(3);
                                U0.writeString(packageName2);
                                U0.writeString(str3);
                                Parcel V0 = aVar.V0(U0, 5);
                                readInt = V0.readInt();
                                V0.recycle();
                                str = "";
                            }
                            h a2 = g0.a(readInt, str);
                            if (readInt == 0) {
                                com.google.android.gms.internal.play_billing.u.g("BillingClient", "Successfully consumed purchase.");
                                jVar.a(a2, str3);
                                return null;
                            }
                            cVar2.g(jVar, str3, a2, 23, "Error consuming purchase with token. Response code: " + readInt, null);
                            return null;
                        } catch (DeadObjectException e10) {
                            deadObjectException = e10;
                            str2 = str3;
                            cVar2.g(jVar, str2, g0.h, 29, "Error consuming purchase!", deadObjectException);
                            return null;
                        } catch (Exception e11) {
                            exc = e11;
                            str2 = str3;
                            cVar2.g(jVar, str2, g0.f, 29, "Error consuming purchase!", exc);
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

    public u(c cVar, p pVar, String str) {
        this.a = 2;
        this.c = pVar;
        this.d = str;
        Objects.requireNonNull(cVar);
        this.b = cVar;
    }
}

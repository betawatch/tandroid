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

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes.dex */
public final /* synthetic */ class v implements Callable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ v(Object obj, Object obj2, Object obj3, int i10) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x00b6, code lost:
    
        r0 = r2.s(c5.h0.h, 107, "Service has been reset to null.", r5);
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
        org.telegram.messenger.d0 d0Var = (org.telegram.messenger.d0) this.c;
        a6.i iVar = (a6.i) this.d;
        Exception exc = null;
        if (!cVar2.n()) {
            i iVar2 = h0.h;
            cVar2.y(2, 7, iVar2);
            com.google.android.gms.internal.play_billing.p pVar = com.google.android.gms.internal.play_billing.r.b;
            com.google.android.gms.internal.play_billing.v vVar = com.google.android.gms.internal.play_billing.v.e;
            d0Var.a(iVar2, new t(vVar, vVar));
            return null;
        }
        if (!cVar2.r) {
            com.google.android.gms.internal.play_billing.u.h("BillingClient", "Querying product details is not supported.");
            i iVar3 = h0.m;
            cVar2.y(20, 7, iVar3);
            com.google.android.gms.internal.play_billing.p pVar2 = com.google.android.gms.internal.play_billing.r.b;
            com.google.android.gms.internal.play_billing.v vVar2 = com.google.android.gms.internal.play_billing.v.e;
            d0Var.a(iVar3, new t(vVar2, vVar2));
            return null;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int i13 = 0;
        String str = ((s) ((com.google.android.gms.internal.play_billing.r) iVar.b).get(0)).b;
        com.google.android.gms.internal.play_billing.r rVar = (com.google.android.gms.internal.play_billing.r) iVar.b;
        int size = rVar.size();
        int i14 = 0;
        while (true) {
            if (i14 >= size) {
                lVar = new j6.l(0, "", arrayList, arrayList2);
                break;
            }
            int i15 = i14 + 20;
            ArrayList arrayList3 = new ArrayList(rVar.subList(i14, i15 > size ? size : i15));
            ArrayList<String> arrayList4 = new ArrayList<>();
            int size2 = arrayList3.size();
            for (int i16 = i13; i16 < size2; i16++) {
                arrayList4.add(((s) arrayList3.get(i16)).a);
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
                int i17 = i15;
                try {
                    Bundle b12 = ((com.google.android.gms.internal.play_billing.a) cVar).b1(true != cVar2.t ? 17 : 20, cVar2.g.getPackageName(), str, bundle, com.google.android.gms.internal.play_billing.u.d(str2, cVar2.d, arrayList3, new t1(1), cVar2.A.longValue()));
                    if (b12 == null) {
                        lVar = cVar2.s(h0.n, 44, "queryProductDetailsAsync got empty product details response.", null);
                        break;
                    }
                    if (b12.containsKey("DETAILS_LIST")) {
                        ArrayList<String> stringArrayList = b12.getStringArrayList("DETAILS_LIST");
                        if (stringArrayList == null) {
                            lVar = cVar2.s(h0.n, 46, "queryProductDetailsAsync got null response list", null);
                            break;
                        }
                        ArrayList arrayList5 = new ArrayList();
                        int size3 = stringArrayList.size();
                        int i18 = 0;
                        while (i18 < size3) {
                            com.google.android.gms.internal.play_billing.r rVar2 = rVar;
                            try {
                                p pVar3 = new p(stringArrayList.get(i18));
                                com.google.android.gms.internal.play_billing.u.g("BillingClient", "Got product details: ".concat(pVar3.toString()));
                                arrayList5.add(pVar3);
                                i18++;
                                rVar = rVar2;
                            } catch (JSONException e) {
                                lVar = cVar2.s(h0.a(6, "Error trying to decode SkuDetails."), 47, "Got a JSON exception trying to decode ProductDetails. \n Exception: ", e);
                            }
                        }
                        com.google.android.gms.internal.play_billing.r rVar3 = rVar;
                        ArrayList<String> stringArrayList2 = b12.getStringArrayList("UNFETCHED_PRODUCT_LIST");
                        new ArrayList();
                        try {
                            ArrayList arrayList6 = new ArrayList();
                            if (stringArrayList2 != null) {
                                int size4 = stringArrayList2.size();
                                int i19 = 0;
                                while (i19 < size4) {
                                    String str3 = stringArrayList2.get(i19);
                                    i19++;
                                    u uVar = new u(str3);
                                    com.google.android.gms.internal.play_billing.u.g("BillingClient", "Got unfetchedProduct: ".concat(uVar.toString()));
                                    arrayList6.add(uVar);
                                }
                            } else {
                                int size5 = arrayList3.size();
                                int i20 = 0;
                                while (i20 < size5) {
                                    Object obj = arrayList3.get(i20);
                                    i20++;
                                    s sVar = (s) obj;
                                    int size6 = arrayList5.size();
                                    int i21 = 0;
                                    while (true) {
                                        if (i21 >= size6) {
                                            i11 = size5;
                                            i12 = i17;
                                            arrayList6.add(new u(new JSONObject().put("productId", sVar.a).put(TeXSymbolParser.TYPE_ATTR, sVar.b).put("statusCode", 0).toString()));
                                            break;
                                        }
                                        Object obj2 = arrayList5.get(i21);
                                        i21++;
                                        p pVar4 = (p) obj2;
                                        i11 = size5;
                                        i12 = i17;
                                        if (!sVar.a.equals(pVar4.c) || !sVar.b.equals(pVar4.d)) {
                                            size5 = i11;
                                            i17 = i12;
                                        }
                                    }
                                    size5 = i11;
                                    i17 = i12;
                                }
                            }
                            int i22 = i17;
                            arrayList.addAll(arrayList5);
                            arrayList2.addAll(arrayList6);
                            rVar = rVar3;
                            i14 = i22;
                            exc = null;
                            i13 = 0;
                        } catch (JSONException e7) {
                            lVar = cVar2.s(h0.a(6, "Error trying to decode SkuDetails."), 47, "Got a JSON exception trying to decode UnfetchedProduct. \n Exception: ", e7);
                        }
                    } else {
                        int a2 = com.google.android.gms.internal.play_billing.u.a("BillingClient", b12);
                        String f7 = com.google.android.gms.internal.play_billing.u.f("BillingClient", b12);
                        lVar = a2 != 0 ? cVar2.s(h0.a(a2, f7), 23, i2.e.j(a2, "getSkuDetails() failed for queryProductDetailsAsync. Response code: "), null) : cVar2.s(h0.a(6, f7), 45, "getSkuDetails() returned a bundle with neither an error nor a product detail list for queryProductDetailsAsync.", null);
                    }
                } catch (DeadObjectException e10) {
                    e = e10;
                    lVar = cVar2.s(h0.h, i10, "queryProductDetailsAsync got a remote exception (try to reconnect).", e);
                    d0Var.a(h0.a(lVar.a, (String) lVar.d), new t((ArrayList) lVar.b, (ArrayList) lVar.c));
                    return null;
                } catch (Exception e11) {
                    e = e11;
                    lVar = cVar2.s(h0.f, i10, "queryProductDetailsAsync got a remote exception (try to reconnect).", e);
                    d0Var.a(h0.a(lVar.a, (String) lVar.d), new t((ArrayList) lVar.b, (ArrayList) lVar.c));
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
        d0Var.a(h0.a(lVar.a, (String) lVar.d), new t((ArrayList) lVar.b, (ArrayList) lVar.c));
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:93:0x008c, code lost:
    
        r0 = r2.x(c5.h0.h, 107, "Service has been reset to null", r3);
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x023f  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x024b  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0170 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object b() {
        Exception exc;
        qf.b x10;
        List list;
        com.google.android.gms.internal.play_billing.c cVar;
        i a2;
        int i10;
        c cVar2 = (c) this.b;
        Exception exc2 = null;
        int i11 = 9;
        if (!cVar2.n()) {
            i iVar = h0.h;
            cVar2.y(2, 9, iVar);
            q qVar = (q) this.c;
            com.google.android.gms.internal.play_billing.p pVar = com.google.android.gms.internal.play_billing.r.b;
            qVar.b(iVar, com.google.android.gms.internal.play_billing.v.e);
            return null;
        }
        String str = (String) this.d;
        if (TextUtils.isEmpty(str)) {
            com.google.android.gms.internal.play_billing.u.h("BillingClient", "Please provide a valid product type.");
            i iVar2 = h0.d;
            cVar2.y(50, 9, iVar2);
            q qVar2 = (q) this.c;
            com.google.android.gms.internal.play_billing.p pVar2 = com.google.android.gms.internal.play_billing.r.b;
            qVar2.b(iVar2, com.google.android.gms.internal.play_billing.v.e);
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
        int i12 = 1;
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
                                    x10 = cVar2.x(h0.h, 52, "Got exception trying to get purchases try to reconnect", e);
                                    list = (List) x10.b;
                                    if (list != null) {
                                    }
                                    return exc;
                                } catch (Exception e7) {
                                    e = e7;
                                    x10 = cVar2.x(h0.f, 52, "Got exception trying to get purchases try to reconnect", e);
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
                Bundle a12 = cVar2.n ? ((com.google.android.gms.internal.play_billing.a) cVar).a1(cVar2.w ? 26 : cVar2.v ? 24 : cVar2.s ? 19 : i11, cVar2.g.getPackageName(), str, str2, bundle) : ((com.google.android.gms.internal.play_billing.a) cVar).Z0(cVar2.g.getPackageName(), str, str2);
                i iVar3 = h0.f;
                if (a12 == null) {
                    com.google.android.gms.internal.play_billing.u.h("BillingClient", "getPurchase() got null owned items list");
                    i10 = 54;
                } else {
                    int a10 = com.google.android.gms.internal.play_billing.u.a("BillingClient", a12);
                    String f7 = com.google.android.gms.internal.play_billing.u.f("BillingClient", a12);
                    c3.a a11 = i.a();
                    a11.b = a10;
                    a11.a = f7;
                    a2 = a11.a();
                    if (a10 != 0) {
                        com.google.android.gms.internal.play_billing.u.h("BillingClient", "getPurchase() failed. Response code: " + a10);
                        i10 = 23;
                    } else if (a12.containsKey("INAPP_PURCHASE_ITEM_LIST") && a12.containsKey("INAPP_PURCHASE_DATA_LIST") && a12.containsKey("INAPP_DATA_SIGNATURE_LIST")) {
                        ArrayList<String> stringArrayList = a12.getStringArrayList("INAPP_PURCHASE_ITEM_LIST");
                        ArrayList<String> stringArrayList2 = a12.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
                        ArrayList<String> stringArrayList3 = a12.getStringArrayList("INAPP_DATA_SIGNATURE_LIST");
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
                            a2 = h0.g;
                            i10 = i12;
                        }
                    } else {
                        com.google.android.gms.internal.play_billing.u.h("BillingClient", "Bundle returned from getPurchase() doesn't contain required fields.");
                        i10 = 55;
                    }
                    if (a2 == h0.g) {
                        x10 = cVar2.x(a2, i10, "Purchase bundle invalid", exc2);
                        break;
                    }
                    ArrayList<String> stringArrayList4 = a12.getStringArrayList("INAPP_PURCHASE_ITEM_LIST");
                    ArrayList<String> stringArrayList5 = a12.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
                    ArrayList<String> stringArrayList6 = a12.getStringArrayList("INAPP_DATA_SIGNATURE_LIST");
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
                            x10 = cVar2.x(h0.f, 51, "Got an exception trying to decode the purchase!", e10);
                        }
                    }
                    if (z11) {
                        i11 = 9;
                        cVar2.y(26, 9, iVar3);
                    } else {
                        i11 = 9;
                    }
                    str2 = a12.getString("INAPP_CONTINUATION_TOKEN");
                    com.google.android.gms.internal.play_billing.u.g("BillingClient", "Continuation token: ".concat(String.valueOf(str2)));
                    if (TextUtils.isEmpty(str2)) {
                        x10 = new qf.b(h0.g, arrayList, false, 8);
                        break;
                    }
                    exc2 = exc;
                    i12 = 1;
                }
                a2 = iVar3;
                if (a2 == h0.g) {
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
            ((q) this.c).b((i) x10.c, list);
        } else {
            q qVar3 = (q) this.c;
            i iVar4 = (i) x10.c;
            com.google.android.gms.internal.play_billing.p pVar3 = com.google.android.gms.internal.play_billing.r.b;
            qVar3.b(iVar4, com.google.android.gms.internal.play_billing.v.e);
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
                return com.google.android.gms.internal.play_billing.u.c(107, h0.h);
            }
            return ((com.google.android.gms.internal.play_billing.a) cVar).X0(cVar2.g.getPackageName(), str, str2);
        } catch (DeadObjectException e) {
            i iVar = h0.h;
            String a2 = f0.a(e);
            c10 = com.google.android.gms.internal.play_billing.u.c(5, iVar);
            if (a2 != null) {
                c10.putString("ADDITIONAL_LOG_DETAILS", a2);
            }
            return c10;
        } catch (Exception e7) {
            i iVar2 = h0.f;
            String a10 = f0.a(e7);
            c10 = com.google.android.gms.internal.play_billing.u.c(5, iVar2);
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
                k kVar = (k) this.c;
                j jVar = (j) this.d;
                if (!cVar2.n()) {
                    i iVar = h0.h;
                    cVar2.y(2, 4, iVar);
                    kVar.a(iVar, jVar.a);
                    return null;
                }
                String str2 = "Error consuming purchase with token. Response code: ";
                String str3 = jVar.a;
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
                                    cVar2.g(kVar, str2, h0.h, 107, "Service has been reset to null.", null);
                                    return null;
                                } catch (DeadObjectException e) {
                                    e = e;
                                    deadObjectException = e;
                                    cVar2.g(kVar, str2, h0.h, 29, "Error consuming purchase!", deadObjectException);
                                    return null;
                                } catch (Exception e7) {
                                    e = e7;
                                    exc = e;
                                    cVar2.g(kVar, str2, h0.f, 29, "Error consuming purchase!", exc);
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
                                Bundle W0 = ((com.google.android.gms.internal.play_billing.a) cVar).W0(packageName, str3, bundle);
                                readInt = W0.getInt("RESPONSE_CODE");
                                str = com.google.android.gms.internal.play_billing.u.f("BillingClient", W0);
                            } else {
                                String packageName2 = cVar2.g.getPackageName();
                                com.google.android.gms.internal.play_billing.a aVar = (com.google.android.gms.internal.play_billing.a) cVar;
                                Parcel T0 = aVar.T0();
                                T0.writeInt(3);
                                T0.writeString(packageName2);
                                T0.writeString(str3);
                                Parcel U0 = aVar.U0(T0, 5);
                                readInt = U0.readInt();
                                U0.recycle();
                                str = "";
                            }
                            i a2 = h0.a(readInt, str);
                            if (readInt == 0) {
                                com.google.android.gms.internal.play_billing.u.g("BillingClient", "Successfully consumed purchase.");
                                kVar.a(a2, str3);
                                return null;
                            }
                            cVar2.g(kVar, str3, a2, 23, "Error consuming purchase with token. Response code: " + readInt, null);
                            return null;
                        } catch (DeadObjectException e10) {
                            deadObjectException = e10;
                            str2 = str3;
                            cVar2.g(kVar, str2, h0.h, 29, "Error consuming purchase!", deadObjectException);
                            return null;
                        } catch (Exception e11) {
                            exc = e11;
                            str2 = str3;
                            cVar2.g(kVar, str2, h0.f, 29, "Error consuming purchase!", exc);
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

    public v(c cVar, q qVar, String str) {
        this.a = 2;
        this.c = qVar;
        this.d = str;
        Objects.requireNonNull(cVar);
        this.b = cVar;
    }
}

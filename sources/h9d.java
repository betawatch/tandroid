// default package

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Parcel;
import android.text.TextUtils;
import com.android.billingclient.api.Purchase;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import org.json.JSONException;
import org.json.JSONObject;
import org.scilab.forge.jlatexmath.TeXSymbolParser;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class h9d implements Callable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public h9d(vh0 vh0Var, fy8 fy8Var, String str) {
        this.a = (byte) 3;
        this.b = fy8Var;
        this.c = str;
        Objects.requireNonNull(vh0Var);
        this.d = vh0Var;
    }

    private final Object a() {
        xcd xcdVar;
        int readInt;
        String str;
        vh0 vh0Var = (vh0) this.b;
        nt2 nt2Var = (nt2) this.c;
        mt2 mt2Var = (mt2) this.d;
        if (!vh0Var.n()) {
            gi0 gi0Var = hod.h;
            vh0Var.x(2, 4, gi0Var);
            nt2Var.e(gi0Var);
            return null;
        }
        String str2 = mt2Var.b;
        try {
            old.g("BillingClient", "Consuming purchase with token: ".concat(str2));
            synchronized (vh0Var.a) {
                xcdVar = vh0Var.i;
            }
            if (xcdVar == null) {
                vh0Var.g(nt2Var, str2, hod.h, jn7.r1, "Service has been reset to null.", null);
                return null;
            }
            boolean z = vh0Var.n;
            Context context = vh0Var.g;
            if (z) {
                String packageName = context.getPackageName();
                boolean z2 = vh0Var.n;
                String str3 = vh0Var.c;
                String str4 = vh0Var.d;
                long longValue = vh0Var.A.longValue();
                Bundle bundle = new Bundle();
                if (z2) {
                    old.b(bundle, str3, str4, longValue);
                }
                Bundle Z = ((mcd) xcdVar).Z(packageName, str2, bundle);
                readInt = Z.getInt("RESPONSE_CODE");
                str = old.f("BillingClient", Z);
            } else {
                String packageName2 = context.getPackageName();
                mcd mcdVar = (mcd) xcdVar;
                Parcel X = mcdVar.X();
                X.writeInt(3);
                X.writeString(packageName2);
                X.writeString(str2);
                Parcel Y = mcdVar.Y(X, 5);
                readInt = Y.readInt();
                Y.recycle();
                str = "";
            }
            gi0 a = hod.a(readInt, str);
            if (readInt == 0) {
                old.g("BillingClient", "Successfully consumed purchase.");
                nt2Var.e(a);
                return null;
            }
            vh0Var.g(nt2Var, str2, a, 23, "Error consuming purchase with token. Response code: " + readInt, null);
            return null;
        } catch (DeadObjectException e) {
            vh0Var.g(nt2Var, str2, hod.h, 29, "Error consuming purchase!", e);
            return null;
        } catch (Exception e2) {
            vh0Var.g(nt2Var, str2, hod.f, 29, "Error consuming purchase!", e2);
            return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:98:0x00ab, code lost:
    
        r0 = r1.s(hod.h, jn7.r1, "Service has been reset to null.", r4);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object b() {
        lp lpVar;
        int i;
        xcd xcdVar;
        int i2;
        int i3;
        vh0 vh0Var = (vh0) this.b;
        tg0 tg0Var = (tg0) this.c;
        l09 l09Var = (l09) this.d;
        Exception exc = null;
        if (!vh0Var.n()) {
            gi0 gi0Var = hod.h;
            vh0Var.x(2, 7, gi0Var);
            jjd jjdVar = vjd.b;
            ((ci0) tg0Var.b).c(gi0Var, emd.e);
            return null;
        }
        if (!vh0Var.r) {
            old.h("BillingClient", "Querying product details is not supported.");
            gi0 gi0Var2 = hod.m;
            vh0Var.x(20, 7, gi0Var2);
            jjd jjdVar2 = vjd.b;
            ((ci0) tg0Var.b).c(gi0Var2, emd.e);
            return null;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int i4 = 0;
        String str = ((k09) ((vjd) l09Var.b).get(0)).b;
        vjd vjdVar = (vjd) l09Var.b;
        int size = vjdVar.size();
        int i5 = 0;
        while (true) {
            if (i5 >= size) {
                lpVar = new lp(0, "", arrayList, arrayList2);
                break;
            }
            int i6 = i5 + 20;
            ArrayList arrayList3 = new ArrayList(vjdVar.subList(i5, i6 > size ? size : i6));
            ArrayList<String> arrayList4 = new ArrayList<>();
            int size2 = arrayList3.size();
            for (int i7 = i4; i7 < size2; i7++) {
                arrayList4.add(((k09) arrayList3.get(i7)).a);
            }
            Bundle bundle = new Bundle();
            bundle.putStringArrayList("ITEM_ID_LIST", arrayList4);
            String str2 = vh0Var.c;
            bundle.putString("playBillingLibraryVersion", str2);
            try {
                synchronized (vh0Var.a) {
                    try {
                        xcdVar = vh0Var.i;
                    } finally {
                        th = th;
                        i = 43;
                        while (true) {
                            try {
                            } catch (Throwable th) {
                                th = th;
                            }
                        }
                    }
                }
                if (xcdVar == null) {
                    break;
                }
                if (vh0Var.s) {
                    vh0Var.x.getClass();
                }
                vh0Var.g.getPackageName();
                vh0Var.g.getPackageName();
                vh0Var.g.getPackageName();
                vh0Var.g.getPackageName();
                i = 43;
                try {
                    Bundle e0 = ((mcd) xcdVar).e0(true != vh0Var.t ? 17 : 20, vh0Var.g.getPackageName(), str, bundle, old.d(str2, vh0Var.d, arrayList3, new i9d(), vh0Var.A.longValue()));
                    if (e0 == null) {
                        lpVar = vh0Var.s(hod.n, 44, "queryProductDetailsAsync got empty product details response.", null);
                        break;
                    }
                    if (e0.containsKey("DETAILS_LIST")) {
                        ArrayList<String> stringArrayList = e0.getStringArrayList("DETAILS_LIST");
                        if (stringArrayList == null) {
                            lpVar = vh0Var.s(hod.n, 46, "queryProductDetailsAsync got null response list", null);
                            break;
                        }
                        ArrayList arrayList5 = new ArrayList();
                        int size3 = stringArrayList.size();
                        int i8 = 0;
                        while (i8 < size3) {
                            try {
                                wo8 wo8Var = new wo8(stringArrayList.get(i8));
                                old.g("BillingClient", "Got product details: ".concat(wo8Var.toString()));
                                arrayList5.add(wo8Var);
                                i8++;
                                vjdVar = vjdVar;
                            } catch (JSONException e) {
                                lpVar = vh0Var.s(hod.a(6, "Error trying to decode SkuDetails."), 47, "Got a JSON exception trying to decode ProductDetails. \n Exception: ", e);
                            }
                        }
                        vjd vjdVar2 = vjdVar;
                        ArrayList<String> stringArrayList2 = e0.getStringArrayList("UNFETCHED_PRODUCT_LIST");
                        try {
                            ArrayList arrayList6 = new ArrayList();
                            if (stringArrayList2 != null) {
                                int size4 = stringArrayList2.size();
                                int i9 = 0;
                                while (i9 < size4) {
                                    String str3 = stringArrayList2.get(i9);
                                    i9++;
                                    e9c e9cVar = new e9c(str3);
                                    old.g("BillingClient", "Got unfetchedProduct: ".concat(e9cVar.toString()));
                                    arrayList6.add(e9cVar);
                                }
                            } else {
                                int size5 = arrayList3.size();
                                int i10 = 0;
                                while (i10 < size5) {
                                    Object obj = arrayList3.get(i10);
                                    i10++;
                                    k09 k09Var = (k09) obj;
                                    int size6 = arrayList5.size();
                                    int i11 = 0;
                                    while (true) {
                                        if (i11 >= size6) {
                                            i2 = size5;
                                            i3 = size;
                                            arrayList6.add(new e9c(new JSONObject().put("productId", k09Var.a).put(TeXSymbolParser.TYPE_ATTR, k09Var.b).put("statusCode", 0).toString()));
                                            break;
                                        }
                                        Object obj2 = arrayList5.get(i11);
                                        i11++;
                                        wo8 wo8Var2 = (wo8) obj2;
                                        i2 = size5;
                                        i3 = size;
                                        if (!k09Var.a.equals(wo8Var2.c) || !k09Var.b.equals(wo8Var2.d)) {
                                            size5 = i2;
                                            size = i3;
                                        }
                                    }
                                    size5 = i2;
                                    size = i3;
                                }
                            }
                            arrayList.addAll(arrayList5);
                            arrayList2.addAll(arrayList6);
                            i5 = i6;
                            vjdVar = vjdVar2;
                            size = size;
                            exc = null;
                            i4 = 0;
                        } catch (JSONException e2) {
                            lpVar = vh0Var.s(hod.a(6, "Error trying to decode SkuDetails."), 47, "Got a JSON exception trying to decode UnfetchedProduct. \n Exception: ", e2);
                        }
                    } else {
                        int a = old.a("BillingClient", e0);
                        String f = old.f("BillingClient", e0);
                        lpVar = a != 0 ? vh0Var.s(hod.a(a, f), 23, uh9.k(a, "getSkuDetails() failed for queryProductDetailsAsync. Response code: "), null) : vh0Var.s(hod.a(6, f), 45, "getSkuDetails() returned a bundle with neither an error nor a product detail list for queryProductDetailsAsync.", null);
                    }
                } catch (DeadObjectException e3) {
                    e = e3;
                    lpVar = vh0Var.s(hod.h, i, "queryProductDetailsAsync got a remote exception (try to reconnect).", e);
                    ((ci0) tg0Var.b).c(hod.a(lpVar.b, (String) lpVar.d), (ArrayList) lpVar.c);
                    return null;
                } catch (Exception e4) {
                    e = e4;
                    lpVar = vh0Var.s(hod.f, i, "queryProductDetailsAsync got a remote exception (try to reconnect).", e);
                    ((ci0) tg0Var.b).c(hod.a(lpVar.b, (String) lpVar.d), (ArrayList) lpVar.c);
                    return null;
                }
            } catch (DeadObjectException e5) {
                e = e5;
                i = 43;
            } catch (Exception e6) {
                e = e6;
            }
        }
        ((ci0) tg0Var.b).c(hod.a(lpVar.b, (String) lpVar.d), (ArrayList) lpVar.c);
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:93:0x0088, code lost:
    
        r0 = r2.w(hod.h, jn7.r1, "Service has been reset to null", r3);
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0243  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0247  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0168 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object c() {
        Exception exc;
        zhc w;
        ArrayList arrayList;
        xcd xcdVar;
        Bundle d0;
        gi0 a;
        int i;
        vh0 vh0Var = (vh0) this.d;
        Exception exc2 = null;
        int i2 = 9;
        if (!vh0Var.n()) {
            gi0 gi0Var = hod.h;
            vh0Var.x(2, 9, gi0Var);
            fy8 fy8Var = (fy8) this.b;
            jjd jjdVar = vjd.b;
            fy8Var.a(gi0Var, emd.e);
            return null;
        }
        String str = (String) this.c;
        if (TextUtils.isEmpty(str)) {
            old.h("BillingClient", "Please provide a valid product type.");
            gi0 gi0Var2 = hod.d;
            vh0Var.x(50, 9, gi0Var2);
            fy8 fy8Var2 = (fy8) this.b;
            jjd jjdVar2 = vjd.b;
            fy8Var2.a(gi0Var2, emd.e);
            return null;
        }
        old.g("BillingClient", "Querying owned items, item type: ".concat(str));
        ArrayList arrayList2 = new ArrayList();
        boolean z = vh0Var.n;
        vh0Var.x.getClass();
        vh0Var.x.getClass();
        long longValue = vh0Var.A.longValue();
        Bundle bundle = new Bundle();
        old.b(bundle, vh0Var.c, vh0Var.d, longValue);
        int i3 = 1;
        if (z) {
            bundle.putBoolean("enablePendingPurchases", true);
        }
        String str2 = null;
        while (true) {
            try {
                synchronized (vh0Var.a) {
                    try {
                        xcdVar = vh0Var.i;
                    } catch (Throwable th) {
                        th = th;
                        exc = exc2;
                        while (true) {
                            try {
                                try {
                                    throw th;
                                } catch (DeadObjectException e) {
                                    e = e;
                                    w = vh0Var.w(hod.h, 52, "Got exception trying to get purchases try to reconnect", e);
                                    arrayList = (ArrayList) w.b;
                                    fy8 fy8Var3 = (fy8) this.b;
                                    gi0 gi0Var3 = (gi0) w.c;
                                    if (arrayList != null) {
                                    }
                                    return exc;
                                } catch (Exception e2) {
                                    e = e2;
                                    w = vh0Var.w(hod.f, 52, "Got exception trying to get purchases try to reconnect", e);
                                    arrayList = (ArrayList) w.b;
                                    fy8 fy8Var32 = (fy8) this.b;
                                    gi0 gi0Var32 = (gi0) w.c;
                                    if (arrayList != null) {
                                    }
                                    return exc;
                                }
                            } catch (Throwable th2) {
                                th = th2;
                            }
                        }
                    }
                }
                if (xcdVar == null) {
                    break;
                }
                if (vh0Var.n) {
                    d0 = ((mcd) xcdVar).d0(vh0Var.w ? 26 : vh0Var.v ? 24 : vh0Var.s ? 19 : i2, vh0Var.g.getPackageName(), str, str2, bundle);
                } else {
                    d0 = ((mcd) xcdVar).c0(vh0Var.g.getPackageName(), str, str2);
                }
                gi0 gi0Var4 = hod.f;
                if (d0 == null) {
                    old.h("BillingClient", "getPurchase() got null owned items list");
                    i = 54;
                } else {
                    int a2 = old.a("BillingClient", d0);
                    String f = old.f("BillingClient", d0);
                    h1 a3 = gi0.a();
                    a3.a = a2;
                    a3.c = f;
                    a = a3.a();
                    if (a2 != 0) {
                        old.h("BillingClient", "getPurchase() failed. Response code: " + a2);
                        i = 23;
                    } else if (d0.containsKey("INAPP_PURCHASE_ITEM_LIST") && d0.containsKey("INAPP_PURCHASE_DATA_LIST") && d0.containsKey("INAPP_DATA_SIGNATURE_LIST")) {
                        ArrayList<String> stringArrayList = d0.getStringArrayList("INAPP_PURCHASE_ITEM_LIST");
                        ArrayList<String> stringArrayList2 = d0.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
                        ArrayList<String> stringArrayList3 = d0.getStringArrayList("INAPP_DATA_SIGNATURE_LIST");
                        if (stringArrayList == null) {
                            old.h("BillingClient", "Bundle returned from getPurchase() contains null SKUs list.");
                            i = 56;
                        } else if (stringArrayList2 == null) {
                            old.h("BillingClient", "Bundle returned from getPurchase() contains null purchases list.");
                            i = 57;
                        } else if (stringArrayList3 == null) {
                            old.h("BillingClient", "Bundle returned from getPurchase() contains null signatures list.");
                            i = 58;
                        } else {
                            a = hod.g;
                            i = i3;
                        }
                    } else {
                        old.h("BillingClient", "Bundle returned from getPurchase() doesn't contain required fields.");
                        i = 55;
                    }
                    if (a == hod.g) {
                        w = vh0Var.w(a, i, "Purchase bundle invalid", exc2);
                        break;
                    }
                    ArrayList<String> stringArrayList4 = d0.getStringArrayList("INAPP_PURCHASE_ITEM_LIST");
                    ArrayList<String> stringArrayList5 = d0.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
                    ArrayList<String> stringArrayList6 = d0.getStringArrayList("INAPP_DATA_SIGNATURE_LIST");
                    int i4 = 0;
                    exc = exc2;
                    boolean z2 = false;
                    while (i4 < stringArrayList5.size()) {
                        String str3 = stringArrayList5.get(i4);
                        String str4 = stringArrayList6.get(i4);
                        ArrayList<String> arrayList3 = stringArrayList4;
                        old.g("BillingClient", "Sku is owned: ".concat(String.valueOf(stringArrayList4.get(i4))));
                        try {
                            Purchase purchase = new Purchase(str3, str4);
                            if (TextUtils.isEmpty(purchase.b())) {
                                old.h("BillingClient", "BUG: empty/null token!");
                                z2 = true;
                            }
                            arrayList2.add(purchase);
                            i4++;
                            stringArrayList4 = arrayList3;
                        } catch (JSONException e3) {
                            w = vh0Var.w(hod.f, 51, "Got an exception trying to decode the purchase!", e3);
                        }
                    }
                    if (z2) {
                        i2 = 9;
                        vh0Var.x(26, 9, gi0Var4);
                    } else {
                        i2 = 9;
                    }
                    str2 = d0.getString("INAPP_CONTINUATION_TOKEN");
                    old.g("BillingClient", "Continuation token: ".concat(String.valueOf(str2)));
                    if (TextUtils.isEmpty(str2)) {
                        w = new zhc(hod.g, arrayList2, (byte) 14);
                        break;
                    }
                    exc2 = exc;
                    i3 = 1;
                }
                a = gi0Var4;
                if (a == hod.g) {
                }
            } catch (DeadObjectException e4) {
                e = e4;
                exc = exc2;
            } catch (Exception e5) {
                e = e5;
                exc = exc2;
            }
        }
        exc = exc2;
        arrayList = (ArrayList) w.b;
        fy8 fy8Var322 = (fy8) this.b;
        gi0 gi0Var322 = (gi0) w.c;
        if (arrayList != null) {
            fy8Var322.a(gi0Var322, arrayList);
        } else {
            jjd jjdVar3 = vjd.b;
            fy8Var322.a(gi0Var322, emd.e);
        }
        return exc;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        Bundle c;
        xcd xcdVar;
        switch (this.a) {
            case 0:
                return Boolean.valueOf(((SharedPreferences) this.b).getBoolean((String) this.c, ((Boolean) this.d).booleanValue()));
            case 1:
                return a();
            case 2:
                return b();
            case 3:
                return c();
            case 4:
                return Integer.valueOf(((SharedPreferences) this.b).getInt((String) this.c, ((Integer) this.d).intValue()));
            case 5:
                return Long.valueOf(((SharedPreferences) this.b).getLong((String) this.c, ((Long) this.d).longValue()));
            case 6:
                return ((SharedPreferences) this.b).getString((String) this.c, (String) this.d);
            default:
                vh0 vh0Var = (vh0) this.b;
                String str = (String) this.c;
                String str2 = (String) this.d;
                try {
                    synchronized (vh0Var.a) {
                        xcdVar = vh0Var.i;
                    }
                    if (xcdVar == null) {
                        return old.c(jn7.r1, hod.h);
                    }
                    return ((mcd) xcdVar).a0(vh0Var.g.getPackageName(), str, str2);
                } catch (DeadObjectException e) {
                    gi0 gi0Var = hod.h;
                    String a = pnd.a(e);
                    c = old.c(5, gi0Var);
                    if (a != null) {
                        c.putString("ADDITIONAL_LOG_DETAILS", a);
                    }
                    return c;
                } catch (Exception e2) {
                    gi0 gi0Var2 = hod.f;
                    String a2 = pnd.a(e2);
                    c = old.c(5, gi0Var2);
                    if (a2 != null) {
                        c.putString("ADDITIONAL_LOG_DETAILS", a2);
                    }
                    return c;
                }
        }
    }

    public /* synthetic */ h9d(Object obj, Object obj2, Object obj3, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }
}

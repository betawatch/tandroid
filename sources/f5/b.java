package f5;

import a8.ba;
import a8.p0;
import a8.xa;
import android.app.Activity;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Build;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.android.billingclient.api.ProxyBillingActivity;
import com.google.android.gms.internal.clearcut.y0;
import com.google.android.gms.internal.play_billing.a1;
import com.google.android.gms.internal.play_billing.b1;
import com.google.android.gms.internal.play_billing.c4;
import com.google.android.gms.internal.play_billing.d4;
import com.google.android.gms.internal.play_billing.f3;
import com.google.android.gms.internal.play_billing.g3;
import com.google.android.gms.internal.play_billing.h3;
import com.google.android.gms.internal.play_billing.i3;
import com.google.android.gms.internal.play_billing.m3;
import com.google.android.gms.internal.play_billing.o3;
import com.google.android.gms.internal.play_billing.p3;
import com.google.android.gms.internal.play_billing.r0;
import com.google.android.gms.internal.play_billing.t0;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.telegram.messenger.j1;
import org.telegram.messenger.ks;
import org.telegram.messenger.q1;
import org.telegram.messenger.r1;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes.dex */
public class b extends ba {
    public final Long A;
    public final com.google.android.gms.internal.play_billing.h B;
    public final String c;
    public final String d;
    public volatile e f;
    public final Context g;
    public final wf.b h;
    public volatile com.google.android.gms.internal.play_billing.c i;
    public volatile t j;
    public boolean k;
    public boolean m;
    public boolean n;
    public boolean o;
    public boolean p;
    public boolean q;
    public boolean r;
    public boolean s;
    public boolean t;
    public boolean u;
    public boolean v;
    public boolean w;
    public final w7.s x;
    public final boolean y;
    public ExecutorService z;
    public final Object a = new Object();
    public volatile int b = 0;
    public final Handler e = new Handler(Looper.getMainLooper());
    public int l = 0;

    public b(w7.s sVar, Context context, o oVar, androidx.emoji2.text.f fVar) {
        long nextLong = new Random().nextLong();
        this.A = Long.valueOf(nextLong);
        this.B = com.google.android.gms.internal.play_billing.i.a;
        this.c = "8.0.0";
        String x10 = x();
        this.d = x10;
        this.g = context.getApplicationContext();
        o3 x11 = p3.x();
        x11.c();
        p3.v((p3) x11.b);
        if (x10 != null) {
            x11.c();
            p3.w((p3) x11.b, x10);
        }
        String packageName = this.g.getPackageName();
        x11.c();
        p3.t((p3) x11.b, packageName);
        x11.c();
        p3.q((p3) x11.b, nextLong);
        x11.c();
        p3.u((p3) x11.b);
        int i7 = Build.VERSION.SDK_INT;
        x11.c();
        p3.n((p3) x11.b, i7);
        x11.d();
        try {
            int i10 = this.g.getPackageManager().getPackageInfo(this.g.getPackageName(), 0).versionCode;
            x11.c();
            p3.o((p3) x11.b, i10);
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.u.i("BillingClient", "Error getting app version code.", th2);
        }
        this.h = new wf.b(this.g, (p3) x11.a());
        if (oVar == null) {
            com.google.android.gms.internal.play_billing.u.h("BillingClient", "Billing client should have a valid listener but the provided is null.");
        }
        this.f = new e(this.g, oVar, this.h);
        this.x = sVar;
        this.y = false;
        this.g.getPackageName();
    }

    public static Future f(Callable callable, long j3, Runnable runnable, Handler handler, ExecutorService executorService) {
        try {
            Future submit = executorService.submit(callable);
            handler.postDelayed(new m9.u(14, submit, runnable), (long) (j3 * 0.95d));
            return submit;
        } catch (Exception e10) {
            com.google.android.gms.internal.play_billing.u.i("BillingClient", "Async task throws exception!", e10);
            return null;
        }
    }

    public static void p(b bVar, int i7) {
        if (i7 != 0) {
            bVar.k(0);
            return;
        }
        synchronized (bVar.a) {
            try {
                if (bVar.b == 3) {
                    return;
                }
                bVar.k(2);
                e eVar = bVar.f != null ? bVar.f : null;
                if (eVar != null) {
                    boolean z10 = bVar.u;
                    a0 a0Var = (a0) eVar.e;
                    IntentFilter intentFilter = new IntentFilter("com.android.vending.billing.PURCHASES_UPDATED");
                    IntentFilter intentFilter2 = new IntentFilter("com.android.vending.billing.LOCAL_BROADCAST_PURCHASES_UPDATED");
                    intentFilter2.addAction("com.android.vending.billing.ALTERNATIVE_BILLING");
                    eVar.a = z10;
                    a0 a0Var2 = (a0) eVar.f;
                    Context context = (Context) eVar.b;
                    a0Var2.a(context, intentFilter2);
                    if (eVar.a) {
                        a0Var.b(context, intentFilter);
                    } else {
                        a0Var.a(context, intentFilter);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static /* bridge */ /* synthetic */ boolean q(b bVar) {
        boolean z10;
        synchronized (bVar.a) {
            z10 = true;
            if (bVar.b != 1) {
                z10 = false;
            }
        }
        return z10;
    }

    public static String x() {
        try {
            return (String) Class.forName("com.android.billingclient.ktx.BuildConfig").getField("VERSION_NAME").get(null);
        } catch (Exception unused) {
            return null;
        }
    }

    public final void A(int i7, f fVar, long j3) {
        try {
            int i10 = x.a;
            try {
                this.h.X(x.b(i7, 2, fVar, null, m3.b), this.l, j3);
            } catch (Throwable th2) {
                com.google.android.gms.internal.play_billing.u.i("BillingClient", "Unable to log.", th2);
            }
        } catch (Throwable th3) {
            com.google.android.gms.internal.play_billing.u.i("BillingClient", "Unable to log.", th3);
        }
    }

    public final void B(int i7, int i10, f fVar, String str) {
        try {
            int i11 = x.a;
            h(x.b(i7, i10, fVar, str, m3.b));
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.u.i("BillingClient", "Unable to log.", th2);
        }
    }

    public final void C(int i7, f fVar, long j3, boolean z10) {
        try {
            int i10 = x.a;
            try {
                this.h.Z(x.b(i7, 2, fVar, null, m3.b), this.l, j3, z10);
            } catch (Throwable th2) {
                com.google.android.gms.internal.play_billing.u.i("BillingClient", "Unable to log.", th2);
            }
        } catch (Throwable th3) {
            com.google.android.gms.internal.play_billing.u.i("BillingClient", "Unable to log.", th3);
        }
    }

    public final void D(int i7, f fVar, String str, long j3, boolean z10) {
        try {
            int i10 = x.a;
            try {
                this.h.Z(x.b(i7, 2, fVar, str, m3.b), this.l, j3, z10);
            } catch (Throwable th2) {
                com.google.android.gms.internal.play_billing.u.i("BillingClient", "Unable to log.", th2);
            }
        } catch (Throwable th3) {
            com.google.android.gms.internal.play_billing.u.i("BillingClient", "Unable to log.", th3);
        }
    }

    public final void E(f fVar) {
        if (Thread.interrupted()) {
            return;
        }
        this.e.post(new m9.u(13, this, fVar));
    }

    public void a(g gVar, h hVar) {
        if (f(new r(this, hVar, gVar, 0), 30000L, new m9.u(this, hVar, gVar), r(), e()) == null) {
            f u10 = u();
            z(25, 4, u10);
            hVar.a(u10);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:157:0x071c  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0727 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:276:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x02ea  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x02f9  */
    /* JADX WARN: Type inference failed for: r4v24, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v58, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5, types: [f5.i] */
    /* JADX WARN: Type inference failed for: r5v7, types: [f5.i] */
    /* JADX WARN: Type inference failed for: r6v29, types: [android.os.BaseBundle, android.os.Bundle] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public f b(Activity activity, final e eVar) {
        boolean z10;
        int i7;
        String str;
        String str2;
        long j3;
        boolean z11;
        String str3;
        f fVar;
        ?? r52;
        f fVar2;
        f a10;
        long j10;
        boolean z12;
        String str4;
        Future f10;
        boolean z13;
        long j11;
        boolean z14;
        long j12;
        boolean z15;
        long j13;
        Object obj;
        int c10;
        int i10;
        boolean z16;
        int i11;
        long j14;
        String str5;
        String str6;
        boolean z17;
        String str7;
        boolean z18;
        long nextLong = new Random().nextLong();
        if (this.f == null || ((o) this.f.c) == null) {
            f fVar3 = z.o;
            A(12, fVar3, nextLong);
            return fVar3;
        }
        try {
            t0 v = v(1);
            TimeUnit.MILLISECONDS.getClass();
            int i12 = ((f) ((r0) v).a).a;
            if (i12 == 0) {
                com.google.android.gms.internal.play_billing.u.g("BillingClient", "Reconnection succeeded with result: " + i12);
            } else {
                com.google.android.gms.internal.play_billing.u.h("BillingClient", "Reconnection failed with result: " + i12);
            }
        } catch (Exception e10) {
            if (e10 instanceof InterruptedException) {
                Thread.currentThread().interrupt();
            }
            com.google.android.gms.internal.play_billing.u.i("BillingClient", "Error during reconnection attempt: ", e10);
        }
        if (!o()) {
            f fVar4 = z.h;
            A(2, fVar4, nextLong);
            E(fVar4);
            return fVar4;
        }
        synchronized (this.a) {
            try {
                z10 = false;
                if (this.j != null) {
                    z10 = this.j.d > 0;
                    i7 = 0;
                } else {
                    i7 = 0;
                }
            } finally {
            }
        }
        ArrayList arrayList = new ArrayList();
        arrayList.addAll((ArrayList) eVar.f);
        com.google.android.gms.internal.play_billing.r rVar = (com.google.android.gms.internal.play_billing.r) eVar.e;
        Iterator it = arrayList.iterator();
        if ((it.hasNext() ? it.next() : null) != null) {
            throw new ClassCastException();
        }
        com.google.android.gms.internal.play_billing.p pVar = (com.google.android.gms.internal.play_billing.p) rVar.iterator();
        d dVar = (d) (pVar.hasNext() ? pVar.next() : null);
        m mVar = dVar.a;
        String str8 = mVar.c;
        String str9 = mVar.d;
        if (str9.equals("subs") && !this.k) {
            com.google.android.gms.internal.play_billing.u.h("BillingClient", "Current client doesn't support subscriptions.");
            f fVar5 = z.j;
            C(9, fVar5, nextLong, z10);
            E(fVar5);
            return fVar5;
        }
        if (((String) eVar.b) == null && ((String) eVar.c) == null) {
            y0 y0Var = (y0) eVar.d;
            y0Var.getClass();
            if (y0Var.b == 0 && !eVar.a) {
                com.google.android.gms.internal.play_billing.r rVar2 = (com.google.android.gms.internal.play_billing.r) eVar.e;
                if (rVar2 != null) {
                    int size = rVar2.size();
                    str = null;
                    for (int i13 = i7; i13 < size; i13++) {
                    }
                } else {
                    str = null;
                }
                if (arrayList.size() <= 1 && !this.q) {
                    com.google.android.gms.internal.play_billing.u.h("BillingClient", "Current client doesn't support multi-item purchases.");
                    f fVar6 = z.k;
                    C(19, fVar6, nextLong, z10);
                    E(fVar6);
                    return fVar6;
                }
                if (rVar.isEmpty() && !this.r) {
                    com.google.android.gms.internal.play_billing.u.h("BillingClient", "Current client doesn't support purchases with ProductDetails.");
                    f fVar7 = z.m;
                    C(20, fVar7, nextLong, z10);
                    E(fVar7);
                    return fVar7;
                }
                if (((com.google.android.gms.internal.play_billing.r) eVar.e).isEmpty()) {
                    d dVar2 = (d) ((com.google.android.gms.internal.play_billing.r) eVar.e).get(i7);
                    int i14 = 1;
                    while (true) {
                        str2 = str8;
                        if (i14 < ((com.google.android.gms.internal.play_billing.r) eVar.e).size()) {
                            d dVar3 = (d) ((com.google.android.gms.internal.play_billing.r) eVar.e).get(i14);
                            int i15 = i14;
                            if (!dVar3.a.d.equals(dVar2.a.d) && !dVar3.a.d.equals("play_pass_subs")) {
                                a10 = z.a(5, "All products should have same ProductType.");
                                break;
                            }
                            i14 = i15 + 1;
                            str8 = str2;
                        } else {
                            m mVar2 = dVar2.a;
                            String optString = mVar2.b.optString("packageName");
                            HashMap hashMap = new HashMap();
                            HashSet hashSet = new HashSet();
                            j3 = nextLong;
                            com.google.android.gms.internal.play_billing.r rVar3 = (com.google.android.gms.internal.play_billing.r) eVar.e;
                            int size2 = rVar3.size();
                            z11 = z10;
                            int i16 = 0;
                            while (true) {
                                if (i16 < size2) {
                                    com.google.android.gms.internal.play_billing.r rVar4 = rVar3;
                                    d dVar4 = (d) rVar3.get(i16);
                                    int i17 = size2;
                                    m mVar3 = dVar4.a;
                                    int i18 = i16;
                                    ArrayList arrayList2 = mVar3.h;
                                    String str10 = mVar3.c;
                                    if (arrayList2 != null) {
                                        str3 = str9;
                                        if (dVar4.b == null) {
                                            fVar = z.a(5, "offerToken is required for constructing ProductDetailsParams for subscriptions. Missing value for product id: " + str10);
                                            break;
                                        }
                                    } else {
                                        str3 = str9;
                                    }
                                    if (hashMap.containsKey(str10)) {
                                        fVar = z.a(5, "ProductId can not be duplicated. Invalid product id: " + mVar3.c + ".");
                                        break;
                                    }
                                    hashMap.put(mVar3.c, dVar4);
                                    if (!mVar2.d.equals("play_pass_subs") && !mVar3.d.equals("play_pass_subs") && !optString.equals(mVar3.b.optString("packageName"))) {
                                        fVar = z.a(5, "All products must have the same package name.");
                                        break;
                                    }
                                    i16 = i18 + 1;
                                    size2 = i17;
                                    rVar3 = rVar4;
                                    str9 = str3;
                                } else {
                                    str3 = str9;
                                    Iterator it2 = hashSet.iterator();
                                    while (true) {
                                        if (it2.hasNext()) {
                                            String str11 = (String) it2.next();
                                            if (hashMap.containsKey(str11)) {
                                                fVar = z.a(5, "OldProductId must not be one of the products to be purchased. Invalid old product id: " + str11 + ".");
                                                break;
                                            }
                                        } else {
                                            ArrayList arrayList3 = mVar2.i;
                                            String str12 = dVar2.b;
                                            if (str12 != null && arrayList3 != null) {
                                                int size3 = arrayList3.size();
                                                int i19 = 0;
                                                while (true) {
                                                    if (i19 >= size3) {
                                                        r52 = str;
                                                        break;
                                                    }
                                                    Object obj2 = arrayList3.get(i19);
                                                    i19++;
                                                    r52 = (i) obj2;
                                                    if (str12.equals(r52.d)) {
                                                        break;
                                                    }
                                                }
                                                if (r52 != 0 && r52.g != null) {
                                                    fVar = z.a(5, "Both autoPayDetails and autoPayBalanceThreshold is required for constructing ProductDetailsParams for autopay.");
                                                }
                                            }
                                            fVar = z.g;
                                        }
                                    }
                                }
                            }
                            fVar2 = fVar;
                        }
                    }
                    if (fVar2 != z.g) {
                        C(ks.t1, fVar2, j3, z11);
                        E(fVar2);
                        return fVar2;
                    }
                    long j15 = j3;
                    boolean z19 = z11;
                    if (this.m) {
                        boolean z20 = this.n;
                        this.x.getClass();
                        this.x.getClass();
                        boolean z21 = this.y;
                        String str13 = this.c;
                        String str14 = this.d;
                        long longValue = this.A.longValue();
                        this.g.getPackageName();
                        int i20 = com.google.android.gms.internal.play_billing.u.a;
                        z12 = z19;
                        final ?? bundle = new Bundle();
                        com.google.android.gms.internal.play_billing.u.b(bundle, str13, str14, longValue);
                        bundle.putLong("billingClientTransactionId", j15);
                        int i21 = ((y0) eVar.d).b;
                        if (i21 != 0) {
                            bundle.putInt("prorationMode", i21);
                        }
                        if (!TextUtils.isEmpty((String) eVar.b)) {
                            bundle.putString("accountId", (String) eVar.b);
                        }
                        if (!TextUtils.isEmpty((String) eVar.c)) {
                            bundle.putString("obfuscatedProfileId", (String) eVar.c);
                        }
                        if (!TextUtils.isEmpty(str)) {
                            bundle.putStringArrayList("skusToReplace", new ArrayList(Arrays.asList(str)));
                        }
                        if (!TextUtils.isEmpty(((y0) eVar.d).c)) {
                            bundle.putString("oldSkuPurchaseToken", ((y0) eVar.d).c);
                        }
                        if (TextUtils.isEmpty(str)) {
                            str6 = str;
                        } else {
                            str6 = str;
                            bundle.putString("oldSkuPurchaseId", str6);
                        }
                        ((y0) eVar.d).getClass();
                        if (!TextUtils.isEmpty(str6)) {
                            ((y0) eVar.d).getClass();
                            bundle.putString("originalExternalTransactionId", str6);
                        }
                        if (!TextUtils.isEmpty(str6)) {
                            bundle.putString("paymentsPurchaseParams", str6);
                        }
                        if (z20) {
                            z17 = true;
                            bundle.putBoolean("enablePendingPurchases", true);
                        } else {
                            z17 = true;
                        }
                        if (z21) {
                            bundle.putBoolean("enableAlternativeBilling", z17);
                        }
                        ArrayList arrayList4 = new ArrayList();
                        com.google.android.gms.internal.play_billing.p listIterator = ((com.google.android.gms.internal.play_billing.r) eVar.e).listIterator(0);
                        while (listIterator.hasNext()) {
                        }
                        if (!arrayList4.isEmpty()) {
                            a1 n10 = b1.n();
                            n10.c();
                            b1.o((b1) n10.b, arrayList4);
                            bundle.putByteArray("subscriptionProductReplacementParamsList", ((b1) n10.a()).a());
                        }
                        if (arrayList.isEmpty()) {
                            ArrayList arrayList5 = new ArrayList(rVar.size() - 1);
                            ArrayList arrayList6 = new ArrayList(rVar.size() - 1);
                            ArrayList arrayList7 = new ArrayList();
                            ArrayList arrayList8 = new ArrayList();
                            ArrayList arrayList9 = new ArrayList();
                            ArrayList arrayList10 = new ArrayList();
                            int i22 = 0;
                            while (i22 < rVar.size()) {
                                d dVar5 = (d) rVar.get(i22);
                                m mVar4 = dVar5.a;
                                long j16 = j15;
                                if (!mVar4.f.isEmpty()) {
                                    arrayList7.add(mVar4.f);
                                }
                                arrayList8.add(dVar5.b);
                                String str15 = mVar4.g;
                                ArrayList arrayList11 = mVar4.i;
                                if (arrayList11 != null && !arrayList11.isEmpty()) {
                                    ArrayList arrayList12 = mVar4.i;
                                    int size4 = arrayList12.size();
                                    int i23 = 0;
                                    while (i23 < size4) {
                                        Object obj3 = arrayList12.get(i23);
                                        i23++;
                                        ArrayList arrayList13 = arrayList12;
                                        i iVar = (i) obj3;
                                        String str16 = str15;
                                        if (!TextUtils.isEmpty(iVar.f)) {
                                            str7 = iVar.f;
                                            break;
                                        }
                                        str15 = str16;
                                        arrayList12 = arrayList13;
                                    }
                                }
                                str7 = str15;
                                if (!TextUtils.isEmpty(str7)) {
                                    arrayList9.add(str7);
                                }
                                if (i22 > 0) {
                                    arrayList5.add(((d) rVar.get(i22)).a.c);
                                    arrayList6.add(((d) rVar.get(i22)).a.d);
                                }
                                i22++;
                                j15 = j16;
                            }
                            j10 = j15;
                            bundle.putStringArrayList("SKU_OFFER_ID_TOKEN_LIST", arrayList8);
                            if (!arrayList10.isEmpty()) {
                                bundle.putIntegerArrayList("autoPayBalanceThresholdList", arrayList10);
                            }
                            if (!arrayList7.isEmpty()) {
                                bundle.putStringArrayList("skuDetailsTokens", arrayList7);
                            }
                            if (!arrayList9.isEmpty()) {
                                bundle.putStringArrayList("SKU_SERIALIZED_DOCID_LIST", arrayList9);
                            }
                            if (!arrayList5.isEmpty()) {
                                bundle.putStringArrayList("additionalSkus", arrayList5);
                                bundle.putStringArrayList("additionalSkuTypes", arrayList6);
                            }
                        } else {
                            ArrayList arrayList14 = new ArrayList();
                            new ArrayList();
                            new ArrayList();
                            new ArrayList();
                            new ArrayList();
                            Iterator it3 = arrayList.iterator();
                            if (it3.hasNext()) {
                                it3.next().getClass();
                                throw new ClassCastException();
                            }
                            if (!arrayList14.isEmpty()) {
                                bundle.putStringArrayList("skuDetailsTokens", arrayList14);
                            }
                            if (arrayList.size() > 1) {
                                ArrayList arrayList15 = new ArrayList(arrayList.size() - 1);
                                ArrayList arrayList16 = new ArrayList(arrayList.size() - 1);
                                if (1 < arrayList.size()) {
                                    arrayList.get(1).getClass();
                                    throw new ClassCastException();
                                }
                                bundle.putStringArrayList("additionalSkus", arrayList15);
                                bundle.putStringArrayList("additionalSkuTypes", arrayList16);
                            }
                            j10 = j15;
                        }
                        if (bundle.containsKey("SKU_OFFER_ID_TOKEN_LIST") && !this.o) {
                            f fVar8 = z.l;
                            C(21, fVar8, j10, z12);
                            E(fVar8);
                            return fVar8;
                        }
                        if (TextUtils.isEmpty(dVar.a.b.optString("packageName"))) {
                            z18 = false;
                        } else {
                            bundle.putString("skuPackageName", dVar.a.b.optString("packageName"));
                            z18 = true;
                        }
                        str4 = null;
                        if (!TextUtils.isEmpty(null)) {
                            bundle.putString("accountName", null);
                        }
                        Intent intent = activity.getIntent();
                        if (intent == null) {
                            com.google.android.gms.internal.play_billing.u.h("BillingClient", "Activity's intent is null.");
                        } else if (!TextUtils.isEmpty(intent.getStringExtra("PROXY_PACKAGE"))) {
                            String stringExtra = intent.getStringExtra("PROXY_PACKAGE");
                            bundle.putString("proxyPackage", stringExtra);
                            try {
                                bundle.putString("proxyPackageVersion", this.g.getPackageManager().getPackageInfo(stringExtra, 0).versionName);
                            } catch (PackageManager.NameNotFoundException unused) {
                                bundle.putString("proxyPackageVersion", "package not found");
                            }
                        }
                        final int i24 = (!this.r || rVar.isEmpty()) ? (this.p && z18) ? 15 : this.n ? 9 : 6 : 17;
                        final String str17 = str2;
                        final ?? r42 = str3;
                        f10 = f(new Callable(i24, str17, r42, eVar, bundle) { // from class: f5.b0
                            public final /* synthetic */ int b;
                            public final /* synthetic */ String c;
                            public final /* synthetic */ String d;
                            public final /* synthetic */ Bundle e;

                            {
                                this.e = bundle;
                            }

                            @Override // java.util.concurrent.Callable
                            public final Object call() {
                                Bundle c11;
                                com.google.android.gms.internal.play_billing.c cVar;
                                b bVar = b.this;
                                int i25 = this.b;
                                String str18 = this.c;
                                String str19 = this.d;
                                Bundle bundle2 = this.e;
                                try {
                                    synchronized (bVar.a) {
                                        cVar = bVar.i;
                                    }
                                    if (cVar == null) {
                                        return com.google.android.gms.internal.play_billing.u.c(z.h, ks.s1);
                                    }
                                    return ((com.google.android.gms.internal.play_billing.a) cVar).A1(i25, bVar.g.getPackageName(), str18, str19, bundle2);
                                } catch (DeadObjectException e11) {
                                    f fVar9 = z.h;
                                    String a11 = x.a(e11);
                                    c11 = com.google.android.gms.internal.play_billing.u.c(fVar9, 5);
                                    if (a11 != null) {
                                        c11.putString("ADDITIONAL_LOG_DETAILS", a11);
                                    }
                                    return c11;
                                } catch (Exception e12) {
                                    f fVar10 = z.f;
                                    String a12 = x.a(e12);
                                    c11 = com.google.android.gms.internal.play_billing.u.c(fVar10, 5);
                                    if (a12 != null) {
                                        c11.putString("ADDITIONAL_LOG_DETAILS", a12);
                                    }
                                    return c11;
                                }
                            }
                        }, 5000L, null, this.e, e());
                        j11 = r42;
                        z13 = bundle;
                    } else {
                        j10 = j15;
                        z12 = z19;
                        str4 = str;
                        ?? r43 = str3;
                        f10 = f(new r(this, str2, r43, 3), 5000L, null, this.e, e());
                        j11 = r43;
                        z13 = z19;
                    }
                    try {
                        if (f10 == null) {
                            try {
                                f fVar9 = z.b;
                                C(25, fVar9, j10, z12);
                                E(fVar9);
                                return fVar9;
                            } catch (CancellationException e11) {
                                e = e11;
                                j13 = j10;
                                z15 = z12;
                                com.google.android.gms.internal.play_billing.u.i("BillingClient", "Time out while launching billing flow. Try to reconnect", e);
                                f fVar10 = z.i;
                                D(4, fVar10, x.a(e), j13, z15);
                                E(fVar10);
                                return fVar10;
                            } catch (TimeoutException e12) {
                                e = e12;
                                j13 = j10;
                                z15 = z12;
                                com.google.android.gms.internal.play_billing.u.i("BillingClient", "Time out while launching billing flow. Try to reconnect", e);
                                f fVar102 = z.i;
                                D(4, fVar102, x.a(e), j13, z15);
                                E(fVar102);
                                return fVar102;
                            } catch (Exception e13) {
                                e = e13;
                                j12 = j10;
                                z14 = z12;
                                com.google.android.gms.internal.play_billing.u.i("BillingClient", "Exception while launching billing flow. Try to reconnect", e);
                                f fVar11 = z.h;
                                D(5, fVar11, x.a(e), j12, z14);
                                E(fVar11);
                                return fVar11;
                            }
                        }
                        j11 = j10;
                        z13 = z12;
                        Bundle bundle2 = (Bundle) f10.get(5000L, TimeUnit.MILLISECONDS);
                        int a11 = com.google.android.gms.internal.play_billing.u.a("BillingClient", bundle2);
                        String f11 = com.google.android.gms.internal.play_billing.u.f("BillingClient", bundle2);
                        if (a11 == 0) {
                            Intent intent2 = new Intent(activity, (Class<?>) ProxyBillingActivity.class);
                            intent2.putExtra("BUY_INTENT", (PendingIntent) bundle2.getParcelable("BUY_INTENT"));
                            intent2.putExtra("billingClientTransactionId", j11);
                            intent2.putExtra("wasServiceAutoReconnected", z13);
                            activity.startActivity(intent2);
                            return z.g;
                        }
                        com.google.android.gms.internal.play_billing.u.h("BillingClient", "Unable to buy item, Error response code: " + a11);
                        f a12 = z.a(a11, f11);
                        try {
                            if (bundle2 != null) {
                                try {
                                    obj = bundle2.get("LOG_REASON");
                                } catch (Throwable th2) {
                                    com.google.android.gms.internal.play_billing.u.h("BillingClient", "Failed to get log reason from bundle: ".concat(String.valueOf(th2.getMessage())));
                                }
                                if (obj != null) {
                                    if (obj instanceof Integer) {
                                        c10 = p0.c(((Integer) obj).intValue());
                                        i10 = 1;
                                        if (c10 == i10) {
                                            c10 = 23;
                                        }
                                        if (bundle2 != null) {
                                            try {
                                                String string = bundle2.getString("ADDITIONAL_LOG_DETAILS");
                                                z16 = z13 ? 1 : 0;
                                                i11 = c10;
                                                j14 = j11;
                                                str5 = string;
                                            } catch (Throwable th3) {
                                                com.google.android.gms.internal.play_billing.u.h("BillingClient", "Failed to get additional log details from bundle: ".concat(String.valueOf(th3.getMessage())));
                                            }
                                            D(i11, a12, str5, j14, z16);
                                            E(a12);
                                            return a12;
                                        }
                                        z16 = z13 ? 1 : 0;
                                        i11 = c10;
                                        j14 = j11;
                                        str5 = str4;
                                        D(i11, a12, str5, j14, z16);
                                        E(a12);
                                        return a12;
                                    }
                                    com.google.android.gms.internal.play_billing.u.h("BillingClient", "Unexpected type for bundle log reason: " + obj.getClass().getName());
                                }
                            }
                            D(i11, a12, str5, j14, z16);
                            E(a12);
                            return a12;
                        } catch (CancellationException e14) {
                            e = e14;
                            j13 = j14;
                            z15 = z16;
                            com.google.android.gms.internal.play_billing.u.i("BillingClient", "Time out while launching billing flow. Try to reconnect", e);
                            f fVar1022 = z.i;
                            D(4, fVar1022, x.a(e), j13, z15);
                            E(fVar1022);
                            return fVar1022;
                        } catch (TimeoutException e15) {
                            e = e15;
                            j13 = j14;
                            z15 = z16;
                            com.google.android.gms.internal.play_billing.u.i("BillingClient", "Time out while launching billing flow. Try to reconnect", e);
                            f fVar10222 = z.i;
                            D(4, fVar10222, x.a(e), j13, z15);
                            E(fVar10222);
                            return fVar10222;
                        } catch (Exception e16) {
                            e = e16;
                            j12 = j14;
                            z14 = z16;
                            com.google.android.gms.internal.play_billing.u.i("BillingClient", "Exception while launching billing flow. Try to reconnect", e);
                            f fVar112 = z.h;
                            D(5, fVar112, x.a(e), j12, z14);
                            E(fVar112);
                            return fVar112;
                        }
                        i10 = 1;
                        c10 = 1;
                        if (c10 == i10) {
                        }
                        if (bundle2 != null) {
                        }
                        z16 = z13 ? 1 : 0;
                        i11 = c10;
                        j14 = j11;
                        str5 = str4;
                    } catch (CancellationException e17) {
                        e = e17;
                        com.google.android.gms.internal.play_billing.u.i("BillingClient", "Time out while launching billing flow. Try to reconnect", e);
                        f fVar102222 = z.i;
                        D(4, fVar102222, x.a(e), j13, z15);
                        E(fVar102222);
                        return fVar102222;
                    } catch (TimeoutException e18) {
                        e = e18;
                        j13 = j11;
                        z15 = z13;
                        com.google.android.gms.internal.play_billing.u.i("BillingClient", "Time out while launching billing flow. Try to reconnect", e);
                        f fVar1022222 = z.i;
                        D(4, fVar1022222, x.a(e), j13, z15);
                        E(fVar1022222);
                        return fVar1022222;
                    } catch (Exception e19) {
                        e = e19;
                        com.google.android.gms.internal.play_billing.u.i("BillingClient", "Exception while launching billing flow. Try to reconnect", e);
                        f fVar1122 = z.h;
                        D(5, fVar1122, x.a(e), j12, z14);
                        E(fVar1122);
                        return fVar1122;
                    }
                } else {
                    a10 = z.g;
                    str2 = str8;
                }
                j3 = nextLong;
                z11 = z10;
                fVar2 = a10;
                str3 = str9;
                if (fVar2 != z.g) {
                }
            }
        }
        str = null;
        if (!this.m) {
            com.google.android.gms.internal.play_billing.u.h("BillingClient", "Current client doesn't support extra params for buy intent.");
            f fVar12 = z.e;
            C(18, fVar12, nextLong, z10);
            E(fVar12);
            return fVar12;
        }
        if (arrayList.size() <= 1) {
        }
        if (rVar.isEmpty()) {
        }
        if (((com.google.android.gms.internal.play_billing.r) eVar.e).isEmpty()) {
        }
        j3 = nextLong;
        z11 = z10;
        fVar2 = a10;
        str3 = str9;
        if (fVar2 != z.g) {
        }
    }

    public void c(d6.i iVar, j1 j1Var) {
        if (f(new r(this, j1Var, iVar, 1), 30000L, new m9.u(16, this, j1Var), r(), e()) == null) {
            f u10 = u();
            z(25, 7, u10);
            com.google.android.gms.internal.play_billing.p pVar = com.google.android.gms.internal.play_billing.r.b;
            ((q1) j1Var.b).a(u10, com.google.android.gms.internal.play_billing.v.e);
        }
    }

    public void d(r1 r1Var) {
        l(r1Var, 0);
    }

    public final synchronized ExecutorService e() {
        try {
            if (this.z == null) {
                this.z = Executors.newFixedThreadPool(com.google.android.gms.internal.play_billing.u.a, new s(this));
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.z;
    }

    public final void g(h hVar, String str, f fVar, int i7, String str2, Exception exc) {
        com.google.android.gms.internal.play_billing.u.i("BillingClient", str2, exc);
        B(i7, 4, fVar, x.a(exc));
        hVar.a(fVar);
    }

    public final void h(g3 g3Var) {
        try {
            wf.b bVar = this.h;
            int i7 = this.l;
            bVar.getClass();
            try {
                o3 o3Var = (o3) ((p3) bVar.b).g();
                o3Var.c();
                p3.p((p3) o3Var.b, i7);
                bVar.b = (p3) o3Var.a();
                bVar.W(g3Var);
            } catch (Throwable th2) {
                com.google.android.gms.internal.play_billing.u.i("BillingLogger", "Unable to log.", th2);
            }
        } catch (Throwable th3) {
            com.google.android.gms.internal.play_billing.u.i("BillingClient", "Unable to log.", th3);
        }
    }

    public final void i(i3 i3Var) {
        try {
            wf.b bVar = this.h;
            int i7 = this.l;
            bVar.getClass();
            try {
                o3 o3Var = (o3) ((p3) bVar.b).g();
                o3Var.c();
                p3.p((p3) o3Var.b, i7);
                p3 p3Var = (p3) o3Var.a();
                bVar.b = p3Var;
                try {
                    bVar.e0(i3Var, p3Var);
                } catch (Throwable th2) {
                    com.google.android.gms.internal.play_billing.u.i("BillingLogger", "Unable to log.", th2);
                }
            } catch (Throwable th3) {
                com.google.android.gms.internal.play_billing.u.i("BillingLogger", "Unable to log.", th3);
            }
        } catch (Throwable th4) {
            com.google.android.gms.internal.play_billing.u.i("BillingClient", "Unable to log.", th4);
        }
    }

    public final void j(int i7, int i10, f fVar) {
        try {
            int i11 = x.a;
            f3 f3Var = (f3) x.b(i7, 6, fVar, null, m3.b).g();
            c4 r10 = d4.r();
            r10.d(i10 > 0);
            r10.e(i10);
            f3Var.e(r10);
            h((g3) f3Var.a());
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.u.i("BillingClient", "Unable to log.", th2);
        }
    }

    public final void k(int i7) {
        synchronized (this.a) {
            try {
                if (this.b == 3) {
                    return;
                }
                int i10 = this.b;
                com.google.android.gms.internal.play_billing.u.g("BillingClient", "Setting clientState from " + (i10 != 0 ? i10 != 1 ? i10 != 2 ? "CLOSED" : "CONNECTED" : "CONNECTING" : "DISCONNECTED") + " to " + (i7 != 0 ? i7 != 1 ? i7 != 2 ? "CLOSED" : "CONNECTED" : "CONNECTING" : "DISCONNECTED"));
                this.b = i7;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void l(c cVar, int i7) {
        int i10;
        f fVar;
        f fVar2;
        synchronized (this.a) {
            try {
                if (o()) {
                    fVar = t(i7);
                } else {
                    if (this.b == 1) {
                        com.google.android.gms.internal.play_billing.u.h("BillingClient", "Client is already in the process of connecting to billing service.");
                        fVar2 = z.c;
                        j(37, i7, fVar2);
                    } else if (this.b == 3) {
                        com.google.android.gms.internal.play_billing.u.h("BillingClient", "Client was already closed and can't be reused. Please create another instance.");
                        fVar2 = z.h;
                        j(38, i7, fVar2);
                    } else {
                        k(1);
                        if (i7 == 0) {
                            i7 = 0;
                        }
                        m();
                        com.google.android.gms.internal.play_billing.u.g("BillingClient", "Starting in-app billing setup.");
                        this.j = new t(this, cVar, i7);
                        com.google.android.gms.internal.play_billing.m mVar = this.j.b;
                        mVar.c = 0L;
                        mVar.b = false;
                        mVar.a();
                        Intent intent = new Intent("com.android.vending.billing.InAppBillingService.BIND");
                        intent.setPackage("com.android.vending");
                        List<ResolveInfo> queryIntentServices = this.g.getPackageManager().queryIntentServices(intent, 0);
                        if (queryIntentServices == null || queryIntentServices.isEmpty()) {
                            i10 = 41;
                        } else {
                            ServiceInfo serviceInfo = queryIntentServices.get(0).serviceInfo;
                            i10 = 40;
                            if (serviceInfo != null) {
                                String str = serviceInfo.packageName;
                                String str2 = serviceInfo.name;
                                if (!Objects.equals(str, "com.android.vending") || str2 == null) {
                                    com.google.android.gms.internal.play_billing.u.h("BillingClient", "The device doesn't have valid Play Store.");
                                } else {
                                    ComponentName componentName = new ComponentName(str, str2);
                                    Intent intent2 = new Intent(intent);
                                    intent2.setComponent(componentName);
                                    intent2.putExtra("playBillingLibraryVersion", this.c);
                                    synchronized (this.a) {
                                        try {
                                            if (this.b == 2) {
                                                fVar = t(i7);
                                            } else if (this.b != 1) {
                                                com.google.android.gms.internal.play_billing.u.h("BillingClient", "Client state no longer CONNECTING, returning service disconnected.");
                                                fVar2 = z.h;
                                                j(ks.q1, i7, fVar2);
                                            } else {
                                                t tVar = this.j;
                                                if ((i7 <= 0 || Build.VERSION.SDK_INT < 29) ? this.g.bindService(intent2, tVar, 1) : this.g.bindService(intent2, 1, e(), tVar)) {
                                                    com.google.android.gms.internal.play_billing.u.g("BillingClient", "Service was bonded successfully.");
                                                    fVar = null;
                                                } else {
                                                    com.google.android.gms.internal.play_billing.u.h("BillingClient", "Connection to Billing service is blocked.");
                                                    i10 = 39;
                                                }
                                            }
                                        } finally {
                                        }
                                    }
                                }
                            } else {
                                com.google.android.gms.internal.play_billing.u.h("BillingClient", "The device doesn't have valid Play Store.");
                            }
                        }
                        k(0);
                        com.google.android.gms.internal.play_billing.u.g("BillingClient", "Billing service unavailable on device.");
                        f fVar3 = z.a;
                        j(i10, i7, fVar3);
                        fVar = fVar3;
                    }
                    fVar = fVar2;
                }
            } finally {
            }
        }
        if (fVar != null) {
            cVar.a(fVar);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void m() {
        synchronized (this.a) {
            if (this.j != null) {
                try {
                    this.g.unbindService(this.j);
                } catch (Throwable th2) {
                    try {
                        com.google.android.gms.internal.play_billing.u.i("BillingClient", "There was an exception while unbinding service!", th2);
                        this.i = null;
                        this.j = null;
                    } finally {
                        this.i = null;
                        this.j = null;
                    }
                }
            }
        }
    }

    public final boolean n() {
        com.google.android.gms.internal.play_billing.h hVar = this.B;
        if (hVar == null) {
            throw new NullPointerException("ticker");
        }
        long a10 = hVar.a();
        long j3 = 30000;
        int i7 = 1;
        long j10 = 30000;
        while (i7 <= 3) {
            try {
            } catch (Exception e10) {
                if (e10 instanceof InterruptedException) {
                    Thread.currentThread().interrupt();
                }
                com.google.android.gms.internal.play_billing.u.i("BillingClient", "Error during reconnection attempt: ", e10);
            }
            if (Math.max(0L, j10) <= 0) {
                com.google.android.gms.internal.play_billing.u.h("BillingClient", "No time remaining for reconnection attempt.");
                return o();
            }
            t0 v = v(i7);
            TimeUnit.MILLISECONDS.getClass();
            int i10 = ((f) ((r0) v).a).a;
            if (i10 == 0) {
                com.google.android.gms.internal.play_billing.u.g("BillingClient", "Reconnection succeeded with result: " + i10);
                return o();
            }
            com.google.android.gms.internal.play_billing.u.h("BillingClient", "Reconnection failed with result: " + i10);
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            long a11 = (hVar.a() - a10) + 0;
            TimeUnit timeUnit2 = TimeUnit.NANOSECONDS;
            j10 = j3 - timeUnit.convert(a11, timeUnit2);
            long j11 = j3;
            long pow = ((long) Math.pow(2.0d, i7 - 1)) * 1000;
            if (j10 < pow) {
                com.google.android.gms.internal.play_billing.u.h("BillingClient", "Reconnection failed due to timeout limit reached.");
                return o();
            }
            if (i7 < 3 && pow > 0) {
                try {
                    Thread.sleep(pow);
                    j10 = j11 - timeUnit.convert((hVar.a() - a10) + 0, timeUnit2);
                } catch (InterruptedException e11) {
                    Thread.currentThread().interrupt();
                    com.google.android.gms.internal.play_billing.u.i("BillingClient", "Error sleeping during reconnection attempt: ", e11);
                }
            }
            i7++;
            j3 = j11;
        }
        com.google.android.gms.internal.play_billing.u.h("BillingClient", "Max retries reached.");
        return o();
    }

    public final boolean o() {
        boolean z10;
        synchronized (this.a) {
            try {
                z10 = false;
                if (this.b == 2 && this.i != null && this.j != null) {
                    z10 = true;
                }
            } finally {
            }
        }
        return z10;
    }

    public final Handler r() {
        return Looper.myLooper() == null ? this.e : new Handler(Looper.myLooper());
    }

    public final xa s(f fVar, int i7, String str, Exception exc) {
        com.google.android.gms.internal.play_billing.u.i("BillingClient", str, exc);
        B(i7, 7, fVar, x.a(exc));
        return new xa(fVar.a, fVar.c, new ArrayList(), new ArrayList());
    }

    public final f t(int i7) {
        com.google.android.gms.internal.play_billing.u.g("BillingClient", "Service connection is valid. No need to re-initialize.");
        h3 s5 = i3.s();
        s5.c();
        i3.r((i3) s5.b, 6);
        c4 r10 = d4.r();
        r10.c();
        d4.q((d4) r10.b);
        r10.d(i7 > 0);
        r10.e(i7);
        s5.c();
        i3.q((i3) s5.b, (d4) r10.a());
        i((i3) s5.a());
        return z.g;
    }

    public final f u() {
        int[] iArr = {0, 3};
        synchronized (this.a) {
            for (int i7 = 0; i7 < 2; i7++) {
                if (this.b == iArr[i7]) {
                    return z.h;
                }
            }
            return z.f;
        }
    }

    public final t0 v(int i7) {
        com.google.android.gms.internal.play_billing.u.g("BillingClient", "Already connected or not opted into auto reconnection.");
        return new r0(z.g);
    }

    public final void w() {
        if (TextUtils.isEmpty(null)) {
            this.g.getPackageName();
        }
    }

    public final q4.q y(f fVar, int i7, String str, Exception exc) {
        B(i7, 9, fVar, x.a(exc));
        com.google.android.gms.internal.play_billing.u.i("BillingClient", str, exc);
        return new q4.q(19, fVar, (Object) null);
    }

    public final void z(int i7, int i10, f fVar) {
        try {
            int i11 = x.a;
            h(x.b(i7, i10, fVar, null, m3.b));
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.u.i("BillingClient", "Unable to log.", th2);
        }
    }

    public b(w7.s sVar, Context context, androidx.emoji2.text.f fVar) {
        long nextLong = new Random().nextLong();
        this.A = Long.valueOf(nextLong);
        this.B = com.google.android.gms.internal.play_billing.i.a;
        this.c = "8.0.0";
        String x10 = x();
        this.d = x10;
        this.g = context.getApplicationContext();
        o3 x11 = p3.x();
        x11.c();
        p3.v((p3) x11.b);
        if (x10 != null) {
            x11.c();
            p3.w((p3) x11.b, x10);
        }
        String packageName = this.g.getPackageName();
        x11.c();
        p3.t((p3) x11.b, packageName);
        x11.c();
        p3.q((p3) x11.b, nextLong);
        x11.c();
        p3.u((p3) x11.b);
        int i7 = Build.VERSION.SDK_INT;
        x11.c();
        p3.n((p3) x11.b, i7);
        x11.d();
        try {
            int i10 = this.g.getPackageManager().getPackageInfo(this.g.getPackageName(), 0).versionCode;
            x11.c();
            p3.o((p3) x11.b, i10);
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.u.i("BillingClient", "Error getting app version code.", th2);
        }
        this.h = new wf.b(this.g, (p3) x11.a());
        com.google.android.gms.internal.play_billing.u.h("BillingClient", "Billing client should have a valid listener but the provided is null.");
        this.f = new e(this.g, null, this.h);
        this.x = sVar;
        this.g.getPackageName();
    }
}

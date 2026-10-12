package c5;

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
import com.google.android.gms.internal.play_billing.a1;
import com.google.android.gms.internal.play_billing.b1;
import com.google.android.gms.internal.play_billing.d4;
import com.google.android.gms.internal.play_billing.e4;
import com.google.android.gms.internal.play_billing.f3;
import com.google.android.gms.internal.play_billing.g3;
import com.google.android.gms.internal.play_billing.h3;
import com.google.android.gms.internal.play_billing.i3;
import com.google.android.gms.internal.play_billing.k3;
import com.google.android.gms.internal.play_billing.n3;
import com.google.android.gms.internal.play_billing.p3;
import com.google.android.gms.internal.play_billing.q3;
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
import org.telegram.messenger.BillingController;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes.dex */
public class c extends b {
    public final Long A;
    public final com.google.android.gms.internal.play_billing.h B;
    public final String c;
    public final String d;
    public volatile h f;
    public final Context g;
    public final qf.b h;
    public volatile com.google.android.gms.internal.play_billing.c i;
    public volatile z j;
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
    public final rb.b x;
    public final boolean y;
    public ExecutorService z;
    public final Object a = new Object();
    public volatile int b = 0;
    public final Handler e = new Handler(Looper.getMainLooper());
    public int l = 0;

    public c(rb.b bVar, Context context, r rVar, androidx.emoji2.text.f fVar) {
        long nextLong = new Random().nextLong();
        this.A = Long.valueOf(nextLong);
        this.B = com.google.android.gms.internal.play_billing.i.a;
        this.c = "8.0.0";
        String w9 = w();
        this.d = w9;
        this.g = context.getApplicationContext();
        p3 x10 = q3.x();
        x10.c();
        q3.v((q3) x10.b);
        if (w9 != null) {
            x10.c();
            q3.w((q3) x10.b, w9);
        }
        String packageName = this.g.getPackageName();
        x10.c();
        q3.t((q3) x10.b, packageName);
        x10.c();
        q3.q((q3) x10.b, nextLong);
        x10.c();
        q3.u((q3) x10.b);
        int i10 = Build.VERSION.SDK_INT;
        x10.c();
        q3.n((q3) x10.b, i10);
        x10.d();
        try {
            int i11 = this.g.getPackageManager().getPackageInfo(this.g.getPackageName(), 0).versionCode;
            x10.c();
            q3.o((q3) x10.b, i11);
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.u.i("BillingClient", "Error getting app version code.", th2);
        }
        this.h = new qf.b(this.g, (q3) x10.a());
        if (rVar == null) {
            com.google.android.gms.internal.play_billing.u.h("BillingClient", "Billing client should have a valid listener but the provided is null.");
        }
        this.f = new h(this.g, rVar, this.h);
        this.x = bVar;
        this.y = false;
        this.g.getPackageName();
    }

    public static Future f(Callable callable, long j10, Runnable runnable, Handler handler, ExecutorService executorService) {
        try {
            Future submit = executorService.submit(callable);
            handler.postDelayed(new j9.u(4, submit, runnable), (long) (j10 * 0.95d));
            return submit;
        } catch (Exception e) {
            com.google.android.gms.internal.play_billing.u.i("BillingClient", "Async task throws exception!", e);
            return null;
        }
    }

    public static void p(c cVar, int i10) {
        if (i10 != 0) {
            cVar.k(0);
            return;
        }
        synchronized (cVar.a) {
            try {
                if (cVar.b == 3) {
                    return;
                }
                cVar.k(2);
                h hVar = cVar.f != null ? cVar.f : null;
                if (hVar != null) {
                    boolean z10 = cVar.u;
                    i0 i0Var = (i0) hVar.e;
                    IntentFilter intentFilter = new IntentFilter("com.android.vending.billing.PURCHASES_UPDATED");
                    IntentFilter intentFilter2 = new IntentFilter("com.android.vending.billing.LOCAL_BROADCAST_PURCHASES_UPDATED");
                    intentFilter2.addAction("com.android.vending.billing.ALTERNATIVE_BILLING");
                    hVar.a = z10;
                    i0 i0Var2 = (i0) hVar.f;
                    Context context = (Context) hVar.b;
                    i0Var2.a(context, intentFilter2);
                    if (hVar.a) {
                        i0Var.b(context, intentFilter);
                    } else {
                        i0Var.a(context, intentFilter);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static /* bridge */ /* synthetic */ boolean q(c cVar) {
        boolean z10;
        synchronized (cVar.a) {
            z10 = true;
            if (cVar.b != 1) {
                z10 = false;
            }
        }
        return z10;
    }

    public static String w() {
        try {
            return (String) Class.forName("com.android.billingclient.ktx.BuildConfig").getField("VERSION_NAME").get(null);
        } catch (Exception unused) {
            return null;
        }
    }

    public final void A(int i10, int i11, i iVar, String str) {
        try {
            int i12 = f0.a;
            h(f0.b(i10, i11, iVar, str, n3.b));
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.u.i("BillingClient", "Unable to log.", th2);
        }
    }

    public final void B(int i10, i iVar, long j10, boolean z10) {
        try {
            int i11 = f0.a;
            try {
                this.h.k0(f0.b(i10, 2, iVar, null, n3.b), this.l, j10, z10);
            } catch (Throwable th2) {
                com.google.android.gms.internal.play_billing.u.i("BillingClient", "Unable to log.", th2);
            }
        } catch (Throwable th3) {
            com.google.android.gms.internal.play_billing.u.i("BillingClient", "Unable to log.", th3);
        }
    }

    public final void C(int i10, i iVar, String str, long j10, boolean z10) {
        try {
            int i11 = f0.a;
            try {
                this.h.k0(f0.b(i10, 2, iVar, str, n3.b), this.l, j10, z10);
            } catch (Throwable th2) {
                com.google.android.gms.internal.play_billing.u.i("BillingClient", "Unable to log.", th2);
            }
        } catch (Throwable th3) {
            com.google.android.gms.internal.play_billing.u.i("BillingClient", "Unable to log.", th3);
        }
    }

    public final void D(i iVar) {
        if (Thread.interrupted()) {
            return;
        }
        this.e.post(new j9.u(3, this, iVar));
    }

    @Override // c5.b
    public void a(j jVar, k kVar) {
        int i10 = 0;
        if (f(new v(this, kVar, jVar, i10), 30000L, new w(this, kVar, jVar, i10), r(), e()) == null) {
            i u10 = u();
            y(25, 4, u10);
            kVar.a(u10, jVar.a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0723  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x072e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:272:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x02ea  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x02f8  */
    /* JADX WARN: Type inference failed for: r4v26, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v57, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r6v37, types: [android.os.BaseBundle, android.os.Bundle] */
    @Override // c5.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public i b(Activity activity, final h hVar) {
        String str;
        String str2;
        long j10;
        String str3;
        i iVar;
        l lVar;
        i iVar2;
        HashSet hashSet;
        long j11;
        boolean z10;
        String str4;
        Future f7;
        long j12;
        boolean z11;
        long j13;
        boolean z12;
        long j14;
        Object obj;
        int a2;
        int i10;
        boolean z13;
        int i11;
        long j15;
        String str5;
        String str6;
        boolean z14;
        String str7;
        boolean z15;
        long nextLong = new Random().nextLong();
        if (this.f == null || ((r) this.f.c) == null) {
            i iVar3 = h0.o;
            z(12, iVar3, nextLong);
            return iVar3;
        }
        try {
            com.google.android.gms.internal.play_billing.u.g("BillingClient", "Already connected or not opted into auto reconnection.");
            i iVar4 = h0.g;
            TimeUnit.MILLISECONDS.getClass();
            int i12 = iVar4.a;
            if (i12 == 0) {
                com.google.android.gms.internal.play_billing.u.g("BillingClient", "Reconnection succeeded with result: " + i12);
            } else {
                com.google.android.gms.internal.play_billing.u.h("BillingClient", "Reconnection failed with result: " + i12);
            }
        } catch (Exception e) {
            if (e instanceof InterruptedException) {
                Thread.currentThread().interrupt();
            }
            com.google.android.gms.internal.play_billing.u.i("BillingClient", "Error during reconnection attempt: ", e);
        }
        if (!o()) {
            i iVar5 = h0.h;
            z(2, iVar5, nextLong);
            D(iVar5);
            return iVar5;
        }
        synchronized (this.a) {
            try {
                if (this.j != null) {
                    this.j.getClass();
                }
            } finally {
            }
        }
        ArrayList arrayList = new ArrayList();
        arrayList.addAll((ArrayList) hVar.f);
        com.google.android.gms.internal.play_billing.r rVar = (com.google.android.gms.internal.play_billing.r) hVar.e;
        Iterator it = arrayList.iterator();
        if ((it.hasNext() ? it.next() : null) != null) {
            throw new ClassCastException();
        }
        com.google.android.gms.internal.play_billing.p pVar = (com.google.android.gms.internal.play_billing.p) rVar.iterator();
        e eVar = (e) (pVar.hasNext() ? pVar.next() : null);
        p pVar2 = eVar.a;
        String str8 = pVar2.c;
        String str9 = pVar2.d;
        if (str9.equals("subs") && !this.k) {
            com.google.android.gms.internal.play_billing.u.h("BillingClient", "Current client doesn't support subscriptions.");
            i iVar6 = h0.j;
            B(9, iVar6, nextLong, false);
            D(iVar6);
            return iVar6;
        }
        if (((String) hVar.b) == null && ((String) hVar.c) == null) {
            g gVar = (g) hVar.d;
            gVar.getClass();
            if (gVar.b == 0 && !hVar.a) {
                com.google.android.gms.internal.play_billing.r rVar2 = (com.google.android.gms.internal.play_billing.r) hVar.e;
                if (rVar2 != null) {
                    int size = rVar2.size();
                    for (int i13 = 0; i13 < size; i13++) {
                    }
                }
                if (arrayList.size() <= 1 && !this.q) {
                    com.google.android.gms.internal.play_billing.u.h("BillingClient", "Current client doesn't support multi-item purchases.");
                    i iVar7 = h0.k;
                    B(19, iVar7, nextLong, false);
                    D(iVar7);
                    return iVar7;
                }
                if (rVar.isEmpty() && !this.r) {
                    com.google.android.gms.internal.play_billing.u.h("BillingClient", "Current client doesn't support purchases with ProductDetails.");
                    i iVar8 = h0.m;
                    B(20, iVar8, nextLong, false);
                    D(iVar8);
                    return iVar8;
                }
                if (((com.google.android.gms.internal.play_billing.r) hVar.e).isEmpty()) {
                    e eVar2 = (e) ((com.google.android.gms.internal.play_billing.r) hVar.e).get(0);
                    int i14 = 1;
                    str = null;
                    while (true) {
                        if (i14 < ((com.google.android.gms.internal.play_billing.r) hVar.e).size()) {
                            e eVar3 = (e) ((com.google.android.gms.internal.play_billing.r) hVar.e).get(i14);
                            str2 = str8;
                            if (!eVar3.a.d.equals(eVar2.a.d) && !eVar3.a.d.equals("play_pass_subs")) {
                                j10 = nextLong;
                                iVar2 = h0.a(5, "All products should have same ProductType.");
                                str3 = str9;
                                break;
                            }
                            i14++;
                            str8 = str2;
                        } else {
                            str2 = str8;
                            p pVar3 = eVar2.a;
                            String optString = pVar3.b.optString("packageName");
                            HashMap hashMap = new HashMap();
                            HashSet hashSet2 = new HashSet();
                            j10 = nextLong;
                            com.google.android.gms.internal.play_billing.r rVar3 = (com.google.android.gms.internal.play_billing.r) hVar.e;
                            int size2 = rVar3.size();
                            str3 = str9;
                            int i15 = 0;
                            while (true) {
                                if (i15 < size2) {
                                    com.google.android.gms.internal.play_billing.r rVar4 = rVar3;
                                    e eVar4 = (e) rVar3.get(i15);
                                    int i16 = size2;
                                    p pVar4 = eVar4.a;
                                    int i17 = i15;
                                    ArrayList arrayList2 = pVar4.h;
                                    String str10 = pVar4.c;
                                    if (arrayList2 != null) {
                                        hashSet = hashSet2;
                                        if (eVar4.b == null) {
                                            iVar = h0.a(5, "offerToken is required for constructing ProductDetailsParams for subscriptions. Missing value for product id: " + str10);
                                            break;
                                        }
                                    } else {
                                        hashSet = hashSet2;
                                    }
                                    if (hashMap.containsKey(str10)) {
                                        iVar = h0.a(5, "ProductId can not be duplicated. Invalid product id: " + pVar4.c + ".");
                                        break;
                                    }
                                    hashMap.put(pVar4.c, eVar4);
                                    if (!pVar3.d.equals("play_pass_subs") && !pVar4.d.equals("play_pass_subs") && !optString.equals(pVar4.b.optString("packageName"))) {
                                        iVar = h0.a(5, "All products must have the same package name.");
                                        break;
                                    }
                                    i15 = i17 + 1;
                                    size2 = i16;
                                    rVar3 = rVar4;
                                    hashSet2 = hashSet;
                                } else {
                                    Iterator it2 = hashSet2.iterator();
                                    while (true) {
                                        if (it2.hasNext()) {
                                            String str11 = (String) it2.next();
                                            if (hashMap.containsKey(str11)) {
                                                iVar = h0.a(5, "OldProductId must not be one of the products to be purchased. Invalid old product id: " + str11 + ".");
                                                break;
                                            }
                                        } else {
                                            ArrayList arrayList3 = pVar3.i;
                                            String str12 = eVar2.b;
                                            if (str12 != null && arrayList3 != null) {
                                                int size3 = arrayList3.size();
                                                int i18 = 0;
                                                while (true) {
                                                    if (i18 >= size3) {
                                                        lVar = null;
                                                        break;
                                                    }
                                                    Object obj2 = arrayList3.get(i18);
                                                    i18++;
                                                    lVar = (l) obj2;
                                                    if (str12.equals(lVar.d)) {
                                                        break;
                                                    }
                                                }
                                                if (lVar != null && lVar.g != null) {
                                                    iVar = h0.a(5, "Both autoPayDetails and autoPayBalanceThreshold is required for constructing ProductDetailsParams for autopay.");
                                                }
                                            }
                                            iVar = h0.g;
                                        }
                                    }
                                }
                            }
                            iVar2 = iVar;
                        }
                    }
                } else {
                    str2 = str8;
                    j10 = nextLong;
                    iVar2 = h0.g;
                    str3 = str9;
                    str = null;
                }
                if (iVar2 == h0.g) {
                    B(108, iVar2, j10, false);
                    D(iVar2);
                    return iVar2;
                }
                boolean z16 = false;
                long j16 = j10;
                if (this.m) {
                    boolean z17 = this.n;
                    this.x.getClass();
                    this.x.getClass();
                    boolean z18 = this.y;
                    String str13 = this.c;
                    String str14 = this.d;
                    long longValue = this.A.longValue();
                    this.g.getPackageName();
                    int i19 = com.google.android.gms.internal.play_billing.u.a;
                    z10 = false;
                    final ?? bundle = new Bundle();
                    com.google.android.gms.internal.play_billing.u.b(bundle, str13, str14, longValue);
                    bundle.putLong("billingClientTransactionId", j16);
                    int i20 = ((g) hVar.d).b;
                    if (i20 != 0) {
                        bundle.putInt("prorationMode", i20);
                    }
                    if (!TextUtils.isEmpty((String) hVar.b)) {
                        bundle.putString("accountId", (String) hVar.b);
                    }
                    if (!TextUtils.isEmpty((String) hVar.c)) {
                        bundle.putString("obfuscatedProfileId", (String) hVar.c);
                    }
                    if (!TextUtils.isEmpty(str)) {
                        bundle.putStringArrayList("skusToReplace", new ArrayList(Arrays.asList(str)));
                    }
                    if (!TextUtils.isEmpty(((g) hVar.d).a)) {
                        bundle.putString("oldSkuPurchaseToken", ((g) hVar.d).a);
                    }
                    if (TextUtils.isEmpty(str)) {
                        str6 = str;
                    } else {
                        str6 = str;
                        bundle.putString("oldSkuPurchaseId", str6);
                    }
                    ((g) hVar.d).getClass();
                    if (!TextUtils.isEmpty(str6)) {
                        ((g) hVar.d).getClass();
                        bundle.putString("originalExternalTransactionId", str6);
                    }
                    if (!TextUtils.isEmpty(str6)) {
                        bundle.putString("paymentsPurchaseParams", str6);
                    }
                    if (z17) {
                        z14 = true;
                        bundle.putBoolean("enablePendingPurchases", true);
                    } else {
                        z14 = true;
                    }
                    if (z18) {
                        bundle.putBoolean("enableAlternativeBilling", z14);
                    }
                    ArrayList arrayList4 = new ArrayList();
                    com.google.android.gms.internal.play_billing.p listIterator = ((com.google.android.gms.internal.play_billing.r) hVar.e).listIterator(0);
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
                        int i21 = 0;
                        while (i21 < rVar.size()) {
                            e eVar5 = (e) rVar.get(i21);
                            p pVar5 = eVar5.a;
                            long j17 = j16;
                            if (!pVar5.f.isEmpty()) {
                                arrayList7.add(pVar5.f);
                            }
                            arrayList8.add(eVar5.b);
                            String str15 = pVar5.g;
                            ArrayList arrayList11 = pVar5.i;
                            if (arrayList11 != null && !arrayList11.isEmpty()) {
                                ArrayList arrayList12 = pVar5.i;
                                int size4 = arrayList12.size();
                                int i22 = 0;
                                while (i22 < size4) {
                                    Object obj3 = arrayList12.get(i22);
                                    i22++;
                                    ArrayList arrayList13 = arrayList12;
                                    l lVar2 = (l) obj3;
                                    String str16 = str15;
                                    if (!TextUtils.isEmpty(lVar2.f)) {
                                        str7 = lVar2.f;
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
                            if (i21 > 0) {
                                arrayList5.add(((e) rVar.get(i21)).a.c);
                                arrayList6.add(((e) rVar.get(i21)).a.d);
                            }
                            i21++;
                            j16 = j17;
                        }
                        j11 = j16;
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
                            throw a1.g.j(it3);
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
                        j11 = j16;
                    }
                    if (bundle.containsKey("SKU_OFFER_ID_TOKEN_LIST") && !this.o) {
                        i iVar9 = h0.l;
                        B(21, iVar9, j11, false);
                        D(iVar9);
                        return iVar9;
                    }
                    if (TextUtils.isEmpty(eVar.a.b.optString("packageName"))) {
                        z15 = false;
                    } else {
                        bundle.putString("skuPackageName", eVar.a.b.optString("packageName"));
                        z15 = true;
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
                    final int i23 = (!this.r || rVar.isEmpty()) ? (this.p && z15) ? 15 : this.n ? 9 : 6 : 17;
                    final String str17 = str2;
                    final ?? r42 = str3;
                    f7 = f(new Callable(i23, str17, r42, hVar, bundle) { // from class: c5.j0
                        public final /* synthetic */ int b;
                        public final /* synthetic */ String c;
                        public final /* synthetic */ String d;
                        public final /* synthetic */ Bundle e;

                        {
                            this.e = bundle;
                        }

                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            Bundle c10;
                            com.google.android.gms.internal.play_billing.c cVar;
                            c cVar2 = c.this;
                            int i24 = this.b;
                            String str18 = this.c;
                            String str19 = this.d;
                            Bundle bundle2 = this.e;
                            try {
                                synchronized (cVar2.a) {
                                    cVar = cVar2.i;
                                }
                                if (cVar == null) {
                                    return com.google.android.gms.internal.play_billing.u.c(107, h0.h);
                                }
                                return ((com.google.android.gms.internal.play_billing.a) cVar).Y0(i24, cVar2.g.getPackageName(), str18, str19, bundle2);
                            } catch (DeadObjectException e7) {
                                i iVar10 = h0.h;
                                String a10 = f0.a(e7);
                                c10 = com.google.android.gms.internal.play_billing.u.c(5, iVar10);
                                if (a10 != null) {
                                    c10.putString("ADDITIONAL_LOG_DETAILS", a10);
                                }
                                return c10;
                            } catch (Exception e10) {
                                i iVar11 = h0.f;
                                String a11 = f0.a(e10);
                                c10 = com.google.android.gms.internal.play_billing.u.c(5, iVar11);
                                if (a11 != null) {
                                    c10.putString("ADDITIONAL_LOG_DETAILS", a11);
                                }
                                return c10;
                            }
                        }
                    }, 5000L, null, this.e, e());
                    j12 = r42;
                    z16 = bundle;
                } else {
                    j11 = j16;
                    z10 = false;
                    str4 = str;
                    ?? r43 = str3;
                    f7 = f(new v(this, str2, r43, 3), 5000L, null, this.e, e());
                    j12 = r43;
                }
                try {
                    if (f7 == null) {
                        try {
                            i iVar10 = h0.b;
                            B(25, iVar10, j11, z10);
                            D(iVar10);
                            return iVar10;
                        } catch (CancellationException e7) {
                            e = e7;
                            z12 = z10;
                            j14 = j11;
                            com.google.android.gms.internal.play_billing.u.i("BillingClient", "Time out while launching billing flow. Try to reconnect", e);
                            i iVar11 = h0.i;
                            C(4, iVar11, f0.a(e), j14, z12);
                            D(iVar11);
                            return iVar11;
                        } catch (TimeoutException e10) {
                            e = e10;
                            z12 = z10;
                            j14 = j11;
                            com.google.android.gms.internal.play_billing.u.i("BillingClient", "Time out while launching billing flow. Try to reconnect", e);
                            i iVar112 = h0.i;
                            C(4, iVar112, f0.a(e), j14, z12);
                            D(iVar112);
                            return iVar112;
                        } catch (Exception e11) {
                            e = e11;
                            z11 = z10;
                            j13 = j11;
                            com.google.android.gms.internal.play_billing.u.i("BillingClient", "Exception while launching billing flow. Try to reconnect", e);
                            i iVar12 = h0.h;
                            C(5, iVar12, f0.a(e), j13, z11);
                            D(iVar12);
                            return iVar12;
                        }
                    }
                    boolean z19 = z10;
                    long j18 = j11;
                    Bundle bundle2 = (Bundle) f7.get(5000L, TimeUnit.MILLISECONDS);
                    int a10 = com.google.android.gms.internal.play_billing.u.a("BillingClient", bundle2);
                    String f10 = com.google.android.gms.internal.play_billing.u.f("BillingClient", bundle2);
                    if (a10 == 0) {
                        Intent intent2 = new Intent(activity, (Class<?>) ProxyBillingActivity.class);
                        intent2.putExtra("BUY_INTENT", (PendingIntent) bundle2.getParcelable("BUY_INTENT"));
                        intent2.putExtra("billingClientTransactionId", j18);
                        intent2.putExtra("wasServiceAutoReconnected", z19);
                        activity.startActivity(intent2);
                        return h0.g;
                    }
                    com.google.android.gms.internal.play_billing.u.h("BillingClient", "Unable to buy item, Error response code: " + a10);
                    i a11 = h0.a(a10, f10);
                    try {
                        if (bundle2 != null) {
                            try {
                                obj = bundle2.get("LOG_REASON");
                            } catch (Throwable th2) {
                                com.google.android.gms.internal.play_billing.u.h("BillingClient", "Failed to get log reason from bundle: ".concat(String.valueOf(th2.getMessage())));
                            }
                            if (obj != null) {
                                if (obj instanceof Integer) {
                                    a2 = k3.a(((Integer) obj).intValue());
                                    i10 = 1;
                                    if (a2 == i10) {
                                        a2 = 23;
                                    }
                                    if (bundle2 != null) {
                                        try {
                                            String string = bundle2.getString("ADDITIONAL_LOG_DETAILS");
                                            z13 = z19;
                                            i11 = a2;
                                            j15 = j18;
                                            str5 = string;
                                        } catch (Throwable th3) {
                                            com.google.android.gms.internal.play_billing.u.h("BillingClient", "Failed to get additional log details from bundle: ".concat(String.valueOf(th3.getMessage())));
                                        }
                                        C(i11, a11, str5, j15, z13);
                                        D(a11);
                                        return a11;
                                    }
                                    z13 = z19;
                                    i11 = a2;
                                    j15 = j18;
                                    str5 = str4;
                                    C(i11, a11, str5, j15, z13);
                                    D(a11);
                                    return a11;
                                }
                                com.google.android.gms.internal.play_billing.u.h("BillingClient", "Unexpected type for bundle log reason: " + obj.getClass().getName());
                            }
                        }
                        C(i11, a11, str5, j15, z13);
                        D(a11);
                        return a11;
                    } catch (CancellationException e12) {
                        e = e12;
                        j14 = j15;
                        z12 = z13;
                        com.google.android.gms.internal.play_billing.u.i("BillingClient", "Time out while launching billing flow. Try to reconnect", e);
                        i iVar1122 = h0.i;
                        C(4, iVar1122, f0.a(e), j14, z12);
                        D(iVar1122);
                        return iVar1122;
                    } catch (TimeoutException e13) {
                        e = e13;
                        j14 = j15;
                        z12 = z13;
                        com.google.android.gms.internal.play_billing.u.i("BillingClient", "Time out while launching billing flow. Try to reconnect", e);
                        i iVar11222 = h0.i;
                        C(4, iVar11222, f0.a(e), j14, z12);
                        D(iVar11222);
                        return iVar11222;
                    } catch (Exception e14) {
                        e = e14;
                        j13 = j15;
                        z11 = z13;
                        com.google.android.gms.internal.play_billing.u.i("BillingClient", "Exception while launching billing flow. Try to reconnect", e);
                        i iVar122 = h0.h;
                        C(5, iVar122, f0.a(e), j13, z11);
                        D(iVar122);
                        return iVar122;
                    }
                    i10 = 1;
                    a2 = 1;
                    if (a2 == i10) {
                    }
                    if (bundle2 != null) {
                    }
                    z13 = z19;
                    i11 = a2;
                    j15 = j18;
                    str5 = str4;
                } catch (CancellationException e15) {
                    e = e15;
                } catch (TimeoutException e16) {
                    e = e16;
                    j14 = j12;
                    z12 = z16;
                } catch (Exception e17) {
                    e = e17;
                }
            }
        }
        if (!this.m) {
            com.google.android.gms.internal.play_billing.u.h("BillingClient", "Current client doesn't support extra params for buy intent.");
            i iVar13 = h0.e;
            B(18, iVar13, nextLong, false);
            D(iVar13);
            return iVar13;
        }
        if (arrayList.size() <= 1) {
        }
        if (rVar.isEmpty()) {
        }
        if (((com.google.android.gms.internal.play_billing.r) hVar.e).isEmpty()) {
        }
        if (iVar2 == h0.g) {
        }
    }

    @Override // c5.b
    public void c(qb.c cVar, org.telegram.messenger.e0 e0Var) {
        if (f(new v(this, e0Var, cVar, 1), 30000L, new j9.u(5, this, e0Var), r(), e()) == null) {
            i u10 = u();
            y(25, 7, u10);
            com.google.android.gms.internal.play_billing.p pVar = com.google.android.gms.internal.play_billing.r.b;
            com.google.android.gms.internal.play_billing.v vVar = com.google.android.gms.internal.play_billing.v.e;
            e0Var.a(u10, new t(vVar, vVar));
        }
    }

    @Override // c5.b
    public void d(BillingController billingController) {
        l(billingController);
    }

    public final synchronized ExecutorService e() {
        try {
            if (this.z == null) {
                this.z = Executors.newFixedThreadPool(com.google.android.gms.internal.play_billing.u.a, new x(this));
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.z;
    }

    public final void g(k kVar, String str, i iVar, int i10, String str2, Exception exc) {
        com.google.android.gms.internal.play_billing.u.i("BillingClient", str2, exc);
        A(i10, 4, iVar, f0.a(exc));
        kVar.a(iVar, str);
    }

    public final void h(g3 g3Var) {
        try {
            qf.b bVar = this.h;
            int i10 = this.l;
            bVar.getClass();
            try {
                p3 p3Var = (p3) ((q3) bVar.b).g();
                p3Var.c();
                q3.p((q3) p3Var.b, i10);
                bVar.b = (q3) p3Var.a();
                bVar.h0(g3Var);
            } catch (Throwable th2) {
                com.google.android.gms.internal.play_billing.u.i("BillingLogger", "Unable to log.", th2);
            }
        } catch (Throwable th3) {
            com.google.android.gms.internal.play_billing.u.i("BillingClient", "Unable to log.", th3);
        }
    }

    public final void i(i3 i3Var) {
        try {
            qf.b bVar = this.h;
            int i10 = this.l;
            bVar.getClass();
            try {
                p3 p3Var = (p3) ((q3) bVar.b).g();
                p3Var.c();
                q3.p((q3) p3Var.b, i10);
                q3 q3Var = (q3) p3Var.a();
                bVar.b = q3Var;
                try {
                    bVar.q0(i3Var, q3Var);
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

    public final void j(int i10, i iVar) {
        try {
            int i11 = f0.a;
            f3 f3Var = (f3) f0.b(i10, 6, iVar, null, n3.b).g();
            d4 r10 = e4.r();
            r10.d(false);
            r10.e();
            f3Var.e(r10);
            h((g3) f3Var.a());
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.u.i("BillingClient", "Unable to log.", th2);
        }
    }

    public final void k(int i10) {
        synchronized (this.a) {
            try {
                if (this.b == 3) {
                    return;
                }
                int i11 = this.b;
                com.google.android.gms.internal.play_billing.u.g("BillingClient", "Setting clientState from " + (i11 != 0 ? i11 != 1 ? i11 != 2 ? "CLOSED" : "CONNECTED" : "CONNECTING" : "DISCONNECTED") + " to " + (i10 != 0 ? i10 != 1 ? i10 != 2 ? "CLOSED" : "CONNECTED" : "CONNECTING" : "DISCONNECTED"));
                this.b = i10;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void l(d dVar) {
        int i10;
        i iVar;
        synchronized (this.a) {
            try {
                if (o()) {
                    iVar = t();
                } else if (this.b == 1) {
                    com.google.android.gms.internal.play_billing.u.h("BillingClient", "Client is already in the process of connecting to billing service.");
                    iVar = h0.c;
                    j(37, iVar);
                } else if (this.b == 3) {
                    com.google.android.gms.internal.play_billing.u.h("BillingClient", "Client was already closed and can't be reused. Please create another instance.");
                    iVar = h0.h;
                    j(38, iVar);
                } else {
                    k(1);
                    m();
                    com.google.android.gms.internal.play_billing.u.g("BillingClient", "Starting in-app billing setup.");
                    this.j = new z(this, dVar);
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
                                            iVar = t();
                                        } else if (this.b != 1) {
                                            com.google.android.gms.internal.play_billing.u.h("BillingClient", "Client state no longer CONNECTING, returning service disconnected.");
                                            iVar = h0.h;
                                            j(105, iVar);
                                        } else {
                                            z zVar = this.j;
                                            if (this.g.bindService(intent2, zVar, 1)) {
                                                com.google.android.gms.internal.play_billing.u.g("BillingClient", "Service was bonded successfully.");
                                                iVar = null;
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
                    iVar = h0.a;
                    j(i10, iVar);
                }
            } finally {
            }
        }
        if (iVar != null) {
            dVar.onBillingSetupFinished(iVar);
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
        long a2 = hVar.a();
        long j10 = 30000;
        int i10 = 1;
        long j11 = 30000;
        while (i10 <= 3) {
            try {
            } catch (Exception e) {
                if (e instanceof InterruptedException) {
                    Thread.currentThread().interrupt();
                }
                com.google.android.gms.internal.play_billing.u.i("BillingClient", "Error during reconnection attempt: ", e);
            }
            if (Math.max(0L, j11) <= 0) {
                com.google.android.gms.internal.play_billing.u.h("BillingClient", "No time remaining for reconnection attempt.");
                return o();
            }
            com.google.android.gms.internal.play_billing.u.g("BillingClient", "Already connected or not opted into auto reconnection.");
            i iVar = h0.g;
            TimeUnit.MILLISECONDS.getClass();
            int i11 = iVar.a;
            if (i11 == 0) {
                com.google.android.gms.internal.play_billing.u.g("BillingClient", "Reconnection succeeded with result: " + i11);
                return o();
            }
            com.google.android.gms.internal.play_billing.u.h("BillingClient", "Reconnection failed with result: " + i11);
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            long a10 = (hVar.a() - a2) + 0;
            TimeUnit timeUnit2 = TimeUnit.NANOSECONDS;
            j11 = j10 - timeUnit.convert(a10, timeUnit2);
            long j12 = j10;
            long pow = ((long) Math.pow(2.0d, i10 - 1)) * 1000;
            if (j11 < pow) {
                com.google.android.gms.internal.play_billing.u.h("BillingClient", "Reconnection failed due to timeout limit reached.");
                return o();
            }
            if (i10 < 3 && pow > 0) {
                try {
                    Thread.sleep(pow);
                    j11 = j12 - timeUnit.convert((hVar.a() - a2) + 0, timeUnit2);
                } catch (InterruptedException e7) {
                    Thread.currentThread().interrupt();
                    com.google.android.gms.internal.play_billing.u.i("BillingClient", "Error sleeping during reconnection attempt: ", e7);
                }
            }
            i10++;
            j10 = j12;
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

    public final j6.l s(i iVar, int i10, String str, Exception exc) {
        com.google.android.gms.internal.play_billing.u.i("BillingClient", str, exc);
        A(i10, 7, iVar, f0.a(exc));
        return new j6.l(iVar.a, iVar.c, new ArrayList(), new ArrayList());
    }

    public final i t() {
        com.google.android.gms.internal.play_billing.u.g("BillingClient", "Service connection is valid. No need to re-initialize.");
        h3 s10 = i3.s();
        s10.c();
        i3.r((i3) s10.b, 6);
        d4 r10 = e4.r();
        r10.c();
        e4.q((e4) r10.b);
        r10.d(false);
        r10.e();
        s10.c();
        i3.q((i3) s10.b, (e4) r10.a());
        i((i3) s10.a());
        return h0.g;
    }

    public final i u() {
        int[] iArr = {0, 3};
        synchronized (this.a) {
            for (int i10 = 0; i10 < 2; i10++) {
                if (this.b == iArr[i10]) {
                    return h0.h;
                }
            }
            return h0.f;
        }
    }

    public final void v() {
        if (TextUtils.isEmpty(null)) {
            this.g.getPackageName();
        }
    }

    public final n4.s x(i iVar, int i10, String str, Exception exc) {
        A(i10, 9, iVar, f0.a(exc));
        com.google.android.gms.internal.play_billing.u.i("BillingClient", str, exc);
        return new n4.s(iVar, null, false, 9);
    }

    public final void y(int i10, int i11, i iVar) {
        try {
            int i12 = f0.a;
            h(f0.b(i10, i11, iVar, null, n3.b));
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.u.i("BillingClient", "Unable to log.", th2);
        }
    }

    public final void z(int i10, i iVar, long j10) {
        try {
            int i11 = f0.a;
            try {
                this.h.i0(f0.b(i10, 2, iVar, null, n3.b), this.l, j10);
            } catch (Throwable th2) {
                com.google.android.gms.internal.play_billing.u.i("BillingClient", "Unable to log.", th2);
            }
        } catch (Throwable th3) {
            com.google.android.gms.internal.play_billing.u.i("BillingClient", "Unable to log.", th3);
        }
    }

    public c(rb.b bVar, Context context, androidx.emoji2.text.f fVar) {
        long nextLong = new Random().nextLong();
        this.A = Long.valueOf(nextLong);
        this.B = com.google.android.gms.internal.play_billing.i.a;
        this.c = "8.0.0";
        String w9 = w();
        this.d = w9;
        this.g = context.getApplicationContext();
        p3 x10 = q3.x();
        x10.c();
        q3.v((q3) x10.b);
        if (w9 != null) {
            x10.c();
            q3.w((q3) x10.b, w9);
        }
        String packageName = this.g.getPackageName();
        x10.c();
        q3.t((q3) x10.b, packageName);
        x10.c();
        q3.q((q3) x10.b, nextLong);
        x10.c();
        q3.u((q3) x10.b);
        int i10 = Build.VERSION.SDK_INT;
        x10.c();
        q3.n((q3) x10.b, i10);
        x10.d();
        try {
            int i11 = this.g.getPackageManager().getPackageInfo(this.g.getPackageName(), 0).versionCode;
            x10.c();
            q3.o((q3) x10.b, i11);
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.u.i("BillingClient", "Error getting app version code.", th2);
        }
        this.h = new qf.b(this.g, (q3) x10.a());
        com.google.android.gms.internal.play_billing.u.h("BillingClient", "Billing client should have a valid listener but the provided is null.");
        this.f = new h(this.g, null, this.h);
        this.x = bVar;
        this.g.getPackageName();
    }
}

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
import com.google.android.gms.internal.play_billing.c4;
import com.google.android.gms.internal.play_billing.d4;
import com.google.android.gms.internal.play_billing.f3;
import com.google.android.gms.internal.play_billing.g3;
import com.google.android.gms.internal.play_billing.h3;
import com.google.android.gms.internal.play_billing.i3;
import com.google.android.gms.internal.play_billing.m3;
import com.google.android.gms.internal.play_billing.o3;
import com.google.android.gms.internal.play_billing.p3;
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

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes.dex */
public class c extends b {
    public final Long A;
    public final com.google.android.gms.internal.play_billing.h B;
    public final String c;
    public final String d;
    public volatile g f;
    public final Context g;
    public final pf.b h;
    public volatile com.google.android.gms.internal.play_billing.c i;
    public volatile y j;
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
    public final rb.a x;
    public final boolean y;
    public ExecutorService z;
    public final Object a = new Object();
    public volatile int b = 0;
    public final Handler e = new Handler(Looper.getMainLooper());
    public int l = 0;

    public c(rb.a aVar, Context context, q qVar, androidx.emoji2.text.f fVar) {
        long nextLong = new Random().nextLong();
        this.A = Long.valueOf(nextLong);
        this.B = com.google.android.gms.internal.play_billing.i.a;
        this.c = "8.0.0";
        String w10 = w();
        this.d = w10;
        this.g = context.getApplicationContext();
        o3 x10 = p3.x();
        x10.c();
        p3.v((p3) x10.b);
        if (w10 != null) {
            x10.c();
            p3.w((p3) x10.b, w10);
        }
        String packageName = this.g.getPackageName();
        x10.c();
        p3.t((p3) x10.b, packageName);
        x10.c();
        p3.q((p3) x10.b, nextLong);
        x10.c();
        p3.u((p3) x10.b);
        int i10 = Build.VERSION.SDK_INT;
        x10.c();
        p3.n((p3) x10.b, i10);
        x10.d();
        try {
            int i11 = this.g.getPackageManager().getPackageInfo(this.g.getPackageName(), 0).versionCode;
            x10.c();
            p3.o((p3) x10.b, i11);
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.u.i("BillingClient", "Error getting app version code.", th2);
        }
        this.h = new pf.b(this.g, (p3) x10.a());
        if (qVar == null) {
            com.google.android.gms.internal.play_billing.u.h("BillingClient", "Billing client should have a valid listener but the provided is null.");
        }
        this.f = new g(this.g, qVar, this.h);
        this.x = aVar;
        this.y = false;
        this.g.getPackageName();
    }

    public static Future f(Callable callable, long j3, Runnable runnable, Handler handler, ExecutorService executorService) {
        try {
            Future submit = executorService.submit(callable);
            handler.postDelayed(new i9.s(4, submit, runnable), (long) (j3 * 0.95d));
            return submit;
        } catch (Exception e7) {
            com.google.android.gms.internal.play_billing.u.i("BillingClient", "Async task throws exception!", e7);
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
                g gVar = cVar.f != null ? cVar.f : null;
                if (gVar != null) {
                    boolean z10 = cVar.u;
                    h0 h0Var = (h0) gVar.e;
                    IntentFilter intentFilter = new IntentFilter("com.android.vending.billing.PURCHASES_UPDATED");
                    IntentFilter intentFilter2 = new IntentFilter("com.android.vending.billing.LOCAL_BROADCAST_PURCHASES_UPDATED");
                    intentFilter2.addAction("com.android.vending.billing.ALTERNATIVE_BILLING");
                    gVar.a = z10;
                    h0 h0Var2 = (h0) gVar.f;
                    Context context = (Context) gVar.b;
                    h0Var2.a(context, intentFilter2);
                    if (gVar.a) {
                        h0Var.b(context, intentFilter);
                    } else {
                        h0Var.a(context, intentFilter);
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

    public final void A(int i10, int i11, h hVar, String str) {
        try {
            int i12 = e0.a;
            h(e0.b(i10, i11, hVar, str, m3.b));
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.u.i("BillingClient", "Unable to log.", th2);
        }
    }

    public final void B(int i10, h hVar, long j3, boolean z10) {
        try {
            int i11 = e0.a;
            try {
                this.h.o0(e0.b(i10, 2, hVar, null, m3.b), this.l, j3, z10);
            } catch (Throwable th2) {
                com.google.android.gms.internal.play_billing.u.i("BillingClient", "Unable to log.", th2);
            }
        } catch (Throwable th3) {
            com.google.android.gms.internal.play_billing.u.i("BillingClient", "Unable to log.", th3);
        }
    }

    public final void C(int i10, h hVar, String str, long j3, boolean z10) {
        try {
            int i11 = e0.a;
            try {
                this.h.o0(e0.b(i10, 2, hVar, str, m3.b), this.l, j3, z10);
            } catch (Throwable th2) {
                com.google.android.gms.internal.play_billing.u.i("BillingClient", "Unable to log.", th2);
            }
        } catch (Throwable th3) {
            com.google.android.gms.internal.play_billing.u.i("BillingClient", "Unable to log.", th3);
        }
    }

    public final void D(h hVar) {
        if (Thread.interrupted()) {
            return;
        }
        this.e.post(new i9.s(3, this, hVar));
    }

    @Override // c5.b
    public void a(i iVar, j jVar) {
        int i10 = 0;
        if (f(new u(this, jVar, iVar, i10), 30000L, new v(this, jVar, iVar, i10), r(), e()) == null) {
            h u10 = u();
            y(25, 4, u10);
            jVar.a(u10, iVar.a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0726  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0731 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:273:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x02e9  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x02f7  */
    /* JADX WARN: Type inference failed for: r4v26, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v59, types: [java.lang.String] */
    @Override // c5.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public h b(Activity activity, final g gVar) {
        String str;
        String str2;
        long j3;
        String str3;
        h hVar;
        k kVar;
        h hVar2;
        HashSet hashSet;
        long j10;
        String str4;
        Future f7;
        long j11;
        long j12;
        long j13;
        long j14;
        Object obj;
        int c10;
        int i10;
        long j15;
        int i11;
        boolean z10;
        String str5;
        String str6;
        boolean z11;
        String str7;
        boolean z12;
        long nextLong = new Random().nextLong();
        if (this.f == null || ((q) this.f.c) == null) {
            h hVar3 = g0.o;
            z(12, hVar3, nextLong);
            return hVar3;
        }
        try {
            com.google.android.gms.internal.play_billing.u.g("BillingClient", "Already connected or not opted into auto reconnection.");
            h hVar4 = g0.g;
            TimeUnit.MILLISECONDS.getClass();
            int i12 = hVar4.a;
            if (i12 == 0) {
                com.google.android.gms.internal.play_billing.u.g("BillingClient", "Reconnection succeeded with result: " + i12);
            } else {
                com.google.android.gms.internal.play_billing.u.h("BillingClient", "Reconnection failed with result: " + i12);
            }
        } catch (Exception e7) {
            if (e7 instanceof InterruptedException) {
                Thread.currentThread().interrupt();
            }
            com.google.android.gms.internal.play_billing.u.i("BillingClient", "Error during reconnection attempt: ", e7);
        }
        if (!o()) {
            h hVar5 = g0.h;
            z(2, hVar5, nextLong);
            D(hVar5);
            return hVar5;
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
        arrayList.addAll((ArrayList) gVar.f);
        com.google.android.gms.internal.play_billing.r rVar = (com.google.android.gms.internal.play_billing.r) gVar.e;
        Iterator it = arrayList.iterator();
        if ((it.hasNext() ? it.next() : null) != null) {
            throw new ClassCastException();
        }
        com.google.android.gms.internal.play_billing.p pVar = (com.google.android.gms.internal.play_billing.p) rVar.iterator();
        e eVar = (e) (pVar.hasNext() ? pVar.next() : null);
        o oVar = eVar.a;
        String str8 = oVar.c;
        String str9 = oVar.d;
        if (str9.equals("subs") && !this.k) {
            com.google.android.gms.internal.play_billing.u.h("BillingClient", "Current client doesn't support subscriptions.");
            h hVar6 = g0.j;
            B(9, hVar6, nextLong, false);
            D(hVar6);
            return hVar6;
        }
        if (((String) gVar.b) == null && ((String) gVar.c) == null) {
            f fVar = (f) gVar.d;
            fVar.getClass();
            if (fVar.b == 0 && !gVar.a) {
                com.google.android.gms.internal.play_billing.r rVar2 = (com.google.android.gms.internal.play_billing.r) gVar.e;
                if (rVar2 != null) {
                    int size = rVar2.size();
                    for (int i13 = 0; i13 < size; i13++) {
                    }
                }
                if (arrayList.size() <= 1 && !this.q) {
                    com.google.android.gms.internal.play_billing.u.h("BillingClient", "Current client doesn't support multi-item purchases.");
                    h hVar7 = g0.k;
                    B(19, hVar7, nextLong, false);
                    D(hVar7);
                    return hVar7;
                }
                if (rVar.isEmpty() && !this.r) {
                    com.google.android.gms.internal.play_billing.u.h("BillingClient", "Current client doesn't support purchases with ProductDetails.");
                    h hVar8 = g0.m;
                    B(20, hVar8, nextLong, false);
                    D(hVar8);
                    return hVar8;
                }
                if (((com.google.android.gms.internal.play_billing.r) gVar.e).isEmpty()) {
                    e eVar2 = (e) ((com.google.android.gms.internal.play_billing.r) gVar.e).get(0);
                    int i14 = 1;
                    str = null;
                    while (true) {
                        if (i14 < ((com.google.android.gms.internal.play_billing.r) gVar.e).size()) {
                            e eVar3 = (e) ((com.google.android.gms.internal.play_billing.r) gVar.e).get(i14);
                            str2 = str8;
                            if (!eVar3.a.d.equals(eVar2.a.d) && !eVar3.a.d.equals("play_pass_subs")) {
                                j3 = nextLong;
                                hVar2 = g0.a(5, "All products should have same ProductType.");
                                str3 = str9;
                                break;
                            }
                            i14++;
                            str8 = str2;
                        } else {
                            str2 = str8;
                            o oVar2 = eVar2.a;
                            String optString = oVar2.b.optString("packageName");
                            HashMap hashMap = new HashMap();
                            HashSet hashSet2 = new HashSet();
                            j3 = nextLong;
                            com.google.android.gms.internal.play_billing.r rVar3 = (com.google.android.gms.internal.play_billing.r) gVar.e;
                            int size2 = rVar3.size();
                            str3 = str9;
                            int i15 = 0;
                            while (true) {
                                if (i15 < size2) {
                                    com.google.android.gms.internal.play_billing.r rVar4 = rVar3;
                                    e eVar4 = (e) rVar3.get(i15);
                                    int i16 = size2;
                                    o oVar3 = eVar4.a;
                                    int i17 = i15;
                                    ArrayList arrayList2 = oVar3.h;
                                    String str10 = oVar3.c;
                                    if (arrayList2 != null) {
                                        hashSet = hashSet2;
                                        if (eVar4.b == null) {
                                            hVar = g0.a(5, "offerToken is required for constructing ProductDetailsParams for subscriptions. Missing value for product id: " + str10);
                                            break;
                                        }
                                    } else {
                                        hashSet = hashSet2;
                                    }
                                    if (hashMap.containsKey(str10)) {
                                        hVar = g0.a(5, "ProductId can not be duplicated. Invalid product id: " + oVar3.c + ".");
                                        break;
                                    }
                                    hashMap.put(oVar3.c, eVar4);
                                    if (!oVar2.d.equals("play_pass_subs") && !oVar3.d.equals("play_pass_subs") && !optString.equals(oVar3.b.optString("packageName"))) {
                                        hVar = g0.a(5, "All products must have the same package name.");
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
                                                hVar = g0.a(5, "OldProductId must not be one of the products to be purchased. Invalid old product id: " + str11 + ".");
                                                break;
                                            }
                                        } else {
                                            ArrayList arrayList3 = oVar2.i;
                                            String str12 = eVar2.b;
                                            if (str12 != null && arrayList3 != null) {
                                                int size3 = arrayList3.size();
                                                int i18 = 0;
                                                while (true) {
                                                    if (i18 >= size3) {
                                                        kVar = null;
                                                        break;
                                                    }
                                                    Object obj2 = arrayList3.get(i18);
                                                    i18++;
                                                    kVar = (k) obj2;
                                                    if (str12.equals(kVar.d)) {
                                                        break;
                                                    }
                                                }
                                                if (kVar != null && kVar.g != null) {
                                                    hVar = g0.a(5, "Both autoPayDetails and autoPayBalanceThreshold is required for constructing ProductDetailsParams for autopay.");
                                                }
                                            }
                                            hVar = g0.g;
                                        }
                                    }
                                }
                            }
                            hVar2 = hVar;
                        }
                    }
                } else {
                    str2 = str8;
                    j3 = nextLong;
                    hVar2 = g0.g;
                    str3 = str9;
                    str = null;
                }
                if (hVar2 == g0.g) {
                    B(108, hVar2, j3, false);
                    D(hVar2);
                    return hVar2;
                }
                long j16 = j3;
                if (this.m) {
                    boolean z13 = this.n;
                    this.x.getClass();
                    this.x.getClass();
                    boolean z14 = this.y;
                    String str13 = this.c;
                    String str14 = this.d;
                    long longValue = this.A.longValue();
                    this.g.getPackageName();
                    int i19 = com.google.android.gms.internal.play_billing.u.a;
                    final Bundle bundle = new Bundle();
                    com.google.android.gms.internal.play_billing.u.b(bundle, str13, str14, longValue);
                    bundle.putLong("billingClientTransactionId", j16);
                    int i20 = ((f) gVar.d).b;
                    if (i20 != 0) {
                        bundle.putInt("prorationMode", i20);
                    }
                    if (!TextUtils.isEmpty((String) gVar.b)) {
                        bundle.putString("accountId", (String) gVar.b);
                    }
                    if (!TextUtils.isEmpty((String) gVar.c)) {
                        bundle.putString("obfuscatedProfileId", (String) gVar.c);
                    }
                    if (!TextUtils.isEmpty(str)) {
                        bundle.putStringArrayList("skusToReplace", new ArrayList<>(Arrays.asList(str)));
                    }
                    if (!TextUtils.isEmpty(((f) gVar.d).a)) {
                        bundle.putString("oldSkuPurchaseToken", ((f) gVar.d).a);
                    }
                    if (TextUtils.isEmpty(str)) {
                        str6 = str;
                    } else {
                        str6 = str;
                        bundle.putString("oldSkuPurchaseId", str6);
                    }
                    ((f) gVar.d).getClass();
                    if (!TextUtils.isEmpty(str6)) {
                        ((f) gVar.d).getClass();
                        bundle.putString("originalExternalTransactionId", str6);
                    }
                    if (!TextUtils.isEmpty(str6)) {
                        bundle.putString("paymentsPurchaseParams", str6);
                    }
                    if (z13) {
                        z11 = true;
                        bundle.putBoolean("enablePendingPurchases", true);
                    } else {
                        z11 = true;
                    }
                    if (z14) {
                        bundle.putBoolean("enableAlternativeBilling", z11);
                    }
                    ArrayList arrayList4 = new ArrayList();
                    com.google.android.gms.internal.play_billing.p listIterator = ((com.google.android.gms.internal.play_billing.r) gVar.e).listIterator(0);
                    while (listIterator.hasNext()) {
                    }
                    if (!arrayList4.isEmpty()) {
                        a1 n10 = b1.n();
                        n10.c();
                        b1.o((b1) n10.b, arrayList4);
                        bundle.putByteArray("subscriptionProductReplacementParamsList", ((b1) n10.a()).a());
                    }
                    if (arrayList.isEmpty()) {
                        ArrayList<String> arrayList5 = new ArrayList<>(rVar.size() - 1);
                        ArrayList<String> arrayList6 = new ArrayList<>(rVar.size() - 1);
                        ArrayList<String> arrayList7 = new ArrayList<>();
                        ArrayList<String> arrayList8 = new ArrayList<>();
                        ArrayList<String> arrayList9 = new ArrayList<>();
                        ArrayList<Integer> arrayList10 = new ArrayList<>();
                        int i21 = 0;
                        while (i21 < rVar.size()) {
                            e eVar5 = (e) rVar.get(i21);
                            o oVar4 = eVar5.a;
                            long j17 = j16;
                            if (!oVar4.f.isEmpty()) {
                                arrayList7.add(oVar4.f);
                            }
                            arrayList8.add(eVar5.b);
                            String str15 = oVar4.g;
                            ArrayList arrayList11 = oVar4.i;
                            if (arrayList11 != null && !arrayList11.isEmpty()) {
                                ArrayList arrayList12 = oVar4.i;
                                int size4 = arrayList12.size();
                                int i22 = 0;
                                while (i22 < size4) {
                                    Object obj3 = arrayList12.get(i22);
                                    i22++;
                                    ArrayList arrayList13 = arrayList12;
                                    k kVar2 = (k) obj3;
                                    String str16 = str15;
                                    if (!TextUtils.isEmpty(kVar2.f)) {
                                        str7 = kVar2.f;
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
                        j10 = j16;
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
                        ArrayList<String> arrayList14 = new ArrayList<>();
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
                            ArrayList<String> arrayList15 = new ArrayList<>(arrayList.size() - 1);
                            ArrayList<String> arrayList16 = new ArrayList<>(arrayList.size() - 1);
                            if (1 < arrayList.size()) {
                                arrayList.get(1).getClass();
                                throw new ClassCastException();
                            }
                            bundle.putStringArrayList("additionalSkus", arrayList15);
                            bundle.putStringArrayList("additionalSkuTypes", arrayList16);
                        }
                        j10 = j16;
                    }
                    if (bundle.containsKey("SKU_OFFER_ID_TOKEN_LIST") && !this.o) {
                        h hVar9 = g0.l;
                        B(21, hVar9, j10, false);
                        D(hVar9);
                        return hVar9;
                    }
                    if (TextUtils.isEmpty(eVar.a.b.optString("packageName"))) {
                        z12 = false;
                    } else {
                        bundle.putString("skuPackageName", eVar.a.b.optString("packageName"));
                        z12 = true;
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
                    final int i23 = (!this.r || rVar.isEmpty()) ? (this.p && z12) ? 15 : this.n ? 9 : 6 : 17;
                    final String str17 = str2;
                    final ?? r42 = str3;
                    f7 = f(new Callable(i23, str17, r42, gVar, bundle) { // from class: c5.i0
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
                                    return com.google.android.gms.internal.play_billing.u.c(107, g0.h);
                                }
                                return ((com.google.android.gms.internal.play_billing.a) cVar).Z0(i24, cVar2.g.getPackageName(), str18, str19, bundle2);
                            } catch (DeadObjectException e10) {
                                h hVar10 = g0.h;
                                String a2 = e0.a(e10);
                                c11 = com.google.android.gms.internal.play_billing.u.c(5, hVar10);
                                if (a2 != null) {
                                    c11.putString("ADDITIONAL_LOG_DETAILS", a2);
                                }
                                return c11;
                            } catch (Exception e11) {
                                h hVar11 = g0.f;
                                String a10 = e0.a(e11);
                                c11 = com.google.android.gms.internal.play_billing.u.c(5, hVar11);
                                if (a10 != null) {
                                    c11.putString("ADDITIONAL_LOG_DETAILS", a10);
                                }
                                return c11;
                            }
                        }
                    }, 5000L, null, this.e, e());
                    j11 = r42;
                } else {
                    j10 = j16;
                    str4 = str;
                    ?? r43 = str3;
                    f7 = f(new u(this, str2, r43, 3), 5000L, null, this.e, e());
                    j11 = r43;
                }
                try {
                    if (f7 == null) {
                        try {
                            h hVar10 = g0.b;
                            B(25, hVar10, j10, false);
                            D(hVar10);
                            return hVar10;
                        } catch (CancellationException e10) {
                            e = e10;
                            j14 = j10;
                            j12 = j14;
                            com.google.android.gms.internal.play_billing.u.i("BillingClient", "Time out while launching billing flow. Try to reconnect", e);
                            h hVar11 = g0.i;
                            C(4, hVar11, e0.a(e), j12, false);
                            D(hVar11);
                            return hVar11;
                        } catch (TimeoutException e11) {
                            e = e11;
                            j14 = j10;
                            j12 = j14;
                            com.google.android.gms.internal.play_billing.u.i("BillingClient", "Time out while launching billing flow. Try to reconnect", e);
                            h hVar112 = g0.i;
                            C(4, hVar112, e0.a(e), j12, false);
                            D(hVar112);
                            return hVar112;
                        } catch (Exception e12) {
                            e = e12;
                            j13 = j10;
                            long j18 = j13;
                            com.google.android.gms.internal.play_billing.u.i("BillingClient", "Exception while launching billing flow. Try to reconnect", e);
                            h hVar12 = g0.h;
                            C(5, hVar12, e0.a(e), j18, false);
                            D(hVar12);
                            return hVar12;
                        }
                    }
                    long j19 = j10;
                    Bundle bundle2 = (Bundle) f7.get(5000L, TimeUnit.MILLISECONDS);
                    int a2 = com.google.android.gms.internal.play_billing.u.a("BillingClient", bundle2);
                    String f10 = com.google.android.gms.internal.play_billing.u.f("BillingClient", bundle2);
                    if (a2 == 0) {
                        Intent intent2 = new Intent(activity, (Class<?>) ProxyBillingActivity.class);
                        intent2.putExtra("BUY_INTENT", (PendingIntent) bundle2.getParcelable("BUY_INTENT"));
                        intent2.putExtra("billingClientTransactionId", j19);
                        intent2.putExtra("wasServiceAutoReconnected", false);
                        activity.startActivity(intent2);
                        return g0.g;
                    }
                    com.google.android.gms.internal.play_billing.u.h("BillingClient", "Unable to buy item, Error response code: " + a2);
                    h a10 = g0.a(a2, f10);
                    try {
                        if (bundle2 != null) {
                            try {
                                obj = bundle2.get("LOG_REASON");
                            } catch (Throwable th2) {
                                com.google.android.gms.internal.play_billing.u.h("BillingClient", "Failed to get log reason from bundle: ".concat(String.valueOf(th2.getMessage())));
                            }
                            if (obj != null) {
                                if (obj instanceof Integer) {
                                    c10 = a4.a.c(((Integer) obj).intValue());
                                    i10 = 1;
                                    if (c10 == i10) {
                                        c10 = 23;
                                    }
                                    if (bundle2 != null) {
                                        try {
                                            String string = bundle2.getString("ADDITIONAL_LOG_DETAILS");
                                            j15 = j19;
                                            i11 = c10;
                                            z10 = false;
                                            str5 = string;
                                        } catch (Throwable th3) {
                                            com.google.android.gms.internal.play_billing.u.h("BillingClient", "Failed to get additional log details from bundle: ".concat(String.valueOf(th3.getMessage())));
                                        }
                                        C(i11, a10, str5, j15, z10);
                                        D(a10);
                                        return a10;
                                    }
                                    j15 = j19;
                                    i11 = c10;
                                    str5 = str4;
                                    z10 = false;
                                    C(i11, a10, str5, j15, z10);
                                    D(a10);
                                    return a10;
                                }
                                com.google.android.gms.internal.play_billing.u.h("BillingClient", "Unexpected type for bundle log reason: " + obj.getClass().getName());
                            }
                        }
                        C(i11, a10, str5, j15, z10);
                        D(a10);
                        return a10;
                    } catch (CancellationException e13) {
                        e = e13;
                        j14 = j15;
                        j12 = j14;
                        com.google.android.gms.internal.play_billing.u.i("BillingClient", "Time out while launching billing flow. Try to reconnect", e);
                        h hVar1122 = g0.i;
                        C(4, hVar1122, e0.a(e), j12, false);
                        D(hVar1122);
                        return hVar1122;
                    } catch (TimeoutException e14) {
                        e = e14;
                        j14 = j15;
                        j12 = j14;
                        com.google.android.gms.internal.play_billing.u.i("BillingClient", "Time out while launching billing flow. Try to reconnect", e);
                        h hVar11222 = g0.i;
                        C(4, hVar11222, e0.a(e), j12, false);
                        D(hVar11222);
                        return hVar11222;
                    } catch (Exception e15) {
                        e = e15;
                        j13 = j15;
                        long j182 = j13;
                        com.google.android.gms.internal.play_billing.u.i("BillingClient", "Exception while launching billing flow. Try to reconnect", e);
                        h hVar122 = g0.h;
                        C(5, hVar122, e0.a(e), j182, false);
                        D(hVar122);
                        return hVar122;
                    }
                    i10 = 1;
                    c10 = 1;
                    if (c10 == i10) {
                    }
                    if (bundle2 != null) {
                    }
                    j15 = j19;
                    i11 = c10;
                    str5 = str4;
                    z10 = false;
                    j12 = j14;
                } catch (CancellationException e16) {
                    e = e16;
                } catch (TimeoutException e17) {
                    e = e17;
                    j12 = j11;
                } catch (Exception e18) {
                    e = e18;
                }
                com.google.android.gms.internal.play_billing.u.i("BillingClient", "Time out while launching billing flow. Try to reconnect", e);
                h hVar112222 = g0.i;
                C(4, hVar112222, e0.a(e), j12, false);
                D(hVar112222);
                return hVar112222;
            }
        }
        if (!this.m) {
            com.google.android.gms.internal.play_billing.u.h("BillingClient", "Current client doesn't support extra params for buy intent.");
            h hVar13 = g0.e;
            B(18, hVar13, nextLong, false);
            D(hVar13);
            return hVar13;
        }
        if (arrayList.size() <= 1) {
        }
        if (rVar.isEmpty()) {
        }
        if (((com.google.android.gms.internal.play_billing.r) gVar.e).isEmpty()) {
        }
        if (hVar2 == g0.g) {
        }
    }

    @Override // c5.b
    public void c(xa.c cVar, org.telegram.messenger.c0 c0Var) {
        if (f(new u(this, c0Var, cVar, 1), 30000L, new i9.s(5, this, c0Var), r(), e()) == null) {
            h u10 = u();
            y(25, 7, u10);
            com.google.android.gms.internal.play_billing.p pVar = com.google.android.gms.internal.play_billing.r.b;
            com.google.android.gms.internal.play_billing.v vVar = com.google.android.gms.internal.play_billing.v.e;
            c0Var.a(u10, new s(vVar, vVar));
        }
    }

    @Override // c5.b
    public void d(BillingController billingController) {
        l(billingController);
    }

    public final synchronized ExecutorService e() {
        try {
            if (this.z == null) {
                this.z = Executors.newFixedThreadPool(com.google.android.gms.internal.play_billing.u.a, new w(this));
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.z;
    }

    public final void g(j jVar, String str, h hVar, int i10, String str2, Exception exc) {
        com.google.android.gms.internal.play_billing.u.i("BillingClient", str2, exc);
        A(i10, 4, hVar, e0.a(exc));
        jVar.a(hVar, str);
    }

    public final void h(g3 g3Var) {
        try {
            pf.b bVar = this.h;
            int i10 = this.l;
            bVar.getClass();
            try {
                o3 o3Var = (o3) ((p3) bVar.b).g();
                o3Var.c();
                p3.p((p3) o3Var.b, i10);
                bVar.b = (p3) o3Var.a();
                bVar.l0(g3Var);
            } catch (Throwable th2) {
                com.google.android.gms.internal.play_billing.u.i("BillingLogger", "Unable to log.", th2);
            }
        } catch (Throwable th3) {
            com.google.android.gms.internal.play_billing.u.i("BillingClient", "Unable to log.", th3);
        }
    }

    public final void i(i3 i3Var) {
        try {
            pf.b bVar = this.h;
            int i10 = this.l;
            bVar.getClass();
            try {
                o3 o3Var = (o3) ((p3) bVar.b).g();
                o3Var.c();
                p3.p((p3) o3Var.b, i10);
                p3 p3Var = (p3) o3Var.a();
                bVar.b = p3Var;
                try {
                    bVar.t0(i3Var, p3Var);
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

    public final void j(int i10, h hVar) {
        try {
            int i11 = e0.a;
            f3 f3Var = (f3) e0.b(i10, 6, hVar, null, m3.b).g();
            c4 r10 = d4.r();
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
        h hVar;
        synchronized (this.a) {
            try {
                if (o()) {
                    hVar = t();
                } else if (this.b == 1) {
                    com.google.android.gms.internal.play_billing.u.h("BillingClient", "Client is already in the process of connecting to billing service.");
                    hVar = g0.c;
                    j(37, hVar);
                } else if (this.b == 3) {
                    com.google.android.gms.internal.play_billing.u.h("BillingClient", "Client was already closed and can't be reused. Please create another instance.");
                    hVar = g0.h;
                    j(38, hVar);
                } else {
                    k(1);
                    m();
                    com.google.android.gms.internal.play_billing.u.g("BillingClient", "Starting in-app billing setup.");
                    this.j = new y(this, dVar);
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
                                            hVar = t();
                                        } else if (this.b != 1) {
                                            com.google.android.gms.internal.play_billing.u.h("BillingClient", "Client state no longer CONNECTING, returning service disconnected.");
                                            hVar = g0.h;
                                            j(105, hVar);
                                        } else {
                                            y yVar = this.j;
                                            if (this.g.bindService(intent2, yVar, 1)) {
                                                com.google.android.gms.internal.play_billing.u.g("BillingClient", "Service was bonded successfully.");
                                                hVar = null;
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
                    hVar = g0.a;
                    j(i10, hVar);
                }
            } finally {
            }
        }
        if (hVar != null) {
            dVar.onBillingSetupFinished(hVar);
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
        long j3 = 30000;
        long j10 = 30000;
        int i10 = 1;
        while (i10 <= 3) {
            try {
            } catch (Exception e7) {
                if (e7 instanceof InterruptedException) {
                    Thread.currentThread().interrupt();
                }
                com.google.android.gms.internal.play_billing.u.i("BillingClient", "Error during reconnection attempt: ", e7);
            }
            if (Math.max(0L, j10) <= 0) {
                com.google.android.gms.internal.play_billing.u.h("BillingClient", "No time remaining for reconnection attempt.");
                return o();
            }
            com.google.android.gms.internal.play_billing.u.g("BillingClient", "Already connected or not opted into auto reconnection.");
            h hVar2 = g0.g;
            TimeUnit.MILLISECONDS.getClass();
            int i11 = hVar2.a;
            if (i11 == 0) {
                com.google.android.gms.internal.play_billing.u.g("BillingClient", "Reconnection succeeded with result: " + i11);
                return o();
            }
            com.google.android.gms.internal.play_billing.u.h("BillingClient", "Reconnection failed with result: " + i11);
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            long a10 = (hVar.a() - a2) + 0;
            TimeUnit timeUnit2 = TimeUnit.NANOSECONDS;
            j10 = j3 - timeUnit.convert(a10, timeUnit2);
            long j11 = j3;
            long pow = ((long) Math.pow(2.0d, i10 - 1)) * 1000;
            if (j10 < pow) {
                com.google.android.gms.internal.play_billing.u.h("BillingClient", "Reconnection failed due to timeout limit reached.");
                return o();
            }
            if (i10 < 3 && pow > 0) {
                try {
                    Thread.sleep(pow);
                    j10 = j11 - timeUnit.convert((hVar.a() - a2) + 0, timeUnit2);
                } catch (InterruptedException e10) {
                    Thread.currentThread().interrupt();
                    com.google.android.gms.internal.play_billing.u.i("BillingClient", "Error sleeping during reconnection attempt: ", e10);
                }
            }
            i10++;
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

    public final j6.l s(h hVar, int i10, String str, Exception exc) {
        com.google.android.gms.internal.play_billing.u.i("BillingClient", str, exc);
        A(i10, 7, hVar, e0.a(exc));
        return new j6.l(hVar.a, hVar.c, new ArrayList(), new ArrayList());
    }

    public final h t() {
        com.google.android.gms.internal.play_billing.u.g("BillingClient", "Service connection is valid. No need to re-initialize.");
        h3 s10 = i3.s();
        s10.c();
        i3.r((i3) s10.b, 6);
        c4 r10 = d4.r();
        r10.c();
        d4.q((d4) r10.b);
        r10.d(false);
        r10.e();
        s10.c();
        i3.q((i3) s10.b, (d4) r10.a());
        i((i3) s10.a());
        return g0.g;
    }

    public final h u() {
        int[] iArr = {0, 3};
        synchronized (this.a) {
            for (int i10 = 0; i10 < 2; i10++) {
                if (this.b == iArr[i10]) {
                    return g0.h;
                }
            }
            return g0.f;
        }
    }

    public final void v() {
        if (TextUtils.isEmpty(null)) {
            this.g.getPackageName();
        }
    }

    public final n4.y x(h hVar, int i10, String str, Exception exc) {
        A(i10, 9, hVar, e0.a(exc));
        com.google.android.gms.internal.play_billing.u.i("BillingClient", str, exc);
        return new n4.y(hVar, null, false, 7);
    }

    public final void y(int i10, int i11, h hVar) {
        try {
            int i12 = e0.a;
            h(e0.b(i10, i11, hVar, null, m3.b));
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.u.i("BillingClient", "Unable to log.", th2);
        }
    }

    public final void z(int i10, h hVar, long j3) {
        try {
            int i11 = e0.a;
            try {
                this.h.m0(e0.b(i10, 2, hVar, null, m3.b), this.l, j3);
            } catch (Throwable th2) {
                com.google.android.gms.internal.play_billing.u.i("BillingClient", "Unable to log.", th2);
            }
        } catch (Throwable th3) {
            com.google.android.gms.internal.play_billing.u.i("BillingClient", "Unable to log.", th3);
        }
    }

    public c(rb.a aVar, Context context, androidx.emoji2.text.f fVar) {
        long nextLong = new Random().nextLong();
        this.A = Long.valueOf(nextLong);
        this.B = com.google.android.gms.internal.play_billing.i.a;
        this.c = "8.0.0";
        String w10 = w();
        this.d = w10;
        this.g = context.getApplicationContext();
        o3 x10 = p3.x();
        x10.c();
        p3.v((p3) x10.b);
        if (w10 != null) {
            x10.c();
            p3.w((p3) x10.b, w10);
        }
        String packageName = this.g.getPackageName();
        x10.c();
        p3.t((p3) x10.b, packageName);
        x10.c();
        p3.q((p3) x10.b, nextLong);
        x10.c();
        p3.u((p3) x10.b);
        int i10 = Build.VERSION.SDK_INT;
        x10.c();
        p3.n((p3) x10.b, i10);
        x10.d();
        try {
            int i11 = this.g.getPackageManager().getPackageInfo(this.g.getPackageName(), 0).versionCode;
            x10.c();
            p3.o((p3) x10.b, i11);
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.u.i("BillingClient", "Error getting app version code.", th2);
        }
        this.h = new pf.b(this.g, (p3) x10.a());
        com.google.android.gms.internal.play_billing.u.h("BillingClient", "Billing client should have a valid listener but the provided is null.");
        this.f = new g(this.g, null, this.h);
        this.x = aVar;
        this.g.getPackageName();
    }
}

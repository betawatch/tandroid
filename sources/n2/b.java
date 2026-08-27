package n2;

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
import com.google.android.gms.common.api.internal.q1;
import com.google.android.gms.internal.play_billing.a1;
import com.google.android.gms.internal.play_billing.b1;
import com.google.android.gms.internal.play_billing.b4;
import com.google.android.gms.internal.play_billing.c4;
import com.google.android.gms.internal.play_billing.e3;
import com.google.android.gms.internal.play_billing.f3;
import com.google.android.gms.internal.play_billing.g3;
import com.google.android.gms.internal.play_billing.h3;
import com.google.android.gms.internal.play_billing.l3;
import com.google.android.gms.internal.play_billing.n3;
import com.google.android.gms.internal.play_billing.o3;
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

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public class b extends a {
    public final Long A;
    public final com.google.android.gms.internal.play_billing.h B;
    public final String c;
    public final String d;
    public volatile f f;
    public final Context g;
    public final g5.b h;
    public volatile com.google.android.gms.internal.play_billing.c i;
    public volatile s j;
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
    public final w9.d x;
    public final boolean y;
    public ExecutorService z;
    public final Object a = new Object();
    public volatile int b = 0;
    public final Handler e = new Handler(Looper.getMainLooper());
    public int l = 0;

    public b(w9.d dVar, Context context, n nVar, androidx.emoji2.text.f fVar) {
        long nextLong = new Random().nextLong();
        this.A = Long.valueOf(nextLong);
        this.B = com.google.android.gms.internal.play_billing.i.a;
        this.c = "8.0.0";
        String w10 = w();
        this.d = w10;
        this.g = context.getApplicationContext();
        n3 x8 = o3.x();
        x8.c();
        o3.v((o3) x8.b);
        if (w10 != null) {
            x8.c();
            o3.w((o3) x8.b, w10);
        }
        String packageName = this.g.getPackageName();
        x8.c();
        o3.t((o3) x8.b, packageName);
        x8.c();
        o3.q((o3) x8.b, nextLong);
        x8.c();
        o3.u((o3) x8.b);
        int i10 = Build.VERSION.SDK_INT;
        x8.c();
        o3.n((o3) x8.b, i10);
        x8.d();
        try {
            int i11 = this.g.getPackageManager().getPackageInfo(this.g.getPackageName(), 0).versionCode;
            x8.c();
            o3.o((o3) x8.b, i11);
        } catch (Throwable th) {
            com.google.android.gms.internal.play_billing.u.i("BillingClient", "Error getting app version code.", th);
        }
        this.h = new g5.b(this.g, (o3) x8.a());
        if (nVar == null) {
            com.google.android.gms.internal.play_billing.u.h("BillingClient", "Billing client should have a valid listener but the provided is null.");
        }
        this.f = new f(this.g, nVar, this.h);
        this.x = dVar;
        this.y = false;
        this.g.getPackageName();
    }

    public static Future f(Callable callable, long j10, Runnable runnable, Handler handler, ExecutorService executorService) {
        try {
            Future submit = executorService.submit(callable);
            handler.postDelayed(new a9.o(25, submit, runnable), (long) (j10 * 0.95d));
            return submit;
        } catch (Exception e9) {
            com.google.android.gms.internal.play_billing.u.i("BillingClient", "Async task throws exception!", e9);
            return null;
        }
    }

    public static void p(b bVar, int i10) {
        if (i10 != 0) {
            bVar.k(0);
            return;
        }
        synchronized (bVar.a) {
            try {
                if (bVar.b == 3) {
                    return;
                }
                bVar.k(2);
                f fVar = bVar.f != null ? bVar.f : null;
                if (fVar != null) {
                    boolean z10 = bVar.u;
                    c0 c0Var = (c0) fVar.e;
                    IntentFilter intentFilter = new IntentFilter("com.android.vending.billing.PURCHASES_UPDATED");
                    IntentFilter intentFilter2 = new IntentFilter("com.android.vending.billing.LOCAL_BROADCAST_PURCHASES_UPDATED");
                    intentFilter2.addAction("com.android.vending.billing.ALTERNATIVE_BILLING");
                    fVar.a = z10;
                    c0 c0Var2 = (c0) fVar.f;
                    Context context = (Context) fVar.b;
                    c0Var2.a(context, intentFilter2);
                    if (fVar.a) {
                        c0Var.b(context, intentFilter);
                    } else {
                        c0Var.a(context, intentFilter);
                    }
                }
            } catch (Throwable th) {
                throw th;
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

    public static String w() {
        try {
            return (String) Class.forName("com.android.billingclient.ktx.BuildConfig").getField("VERSION_NAME").get(null);
        } catch (Exception unused) {
            return null;
        }
    }

    public final void A(int i10, int i11, g gVar, String str) {
        try {
            int i12 = y.a;
            h(y.b(i10, i11, gVar, str, l3.b));
        } catch (Throwable th) {
            com.google.android.gms.internal.play_billing.u.i("BillingClient", "Unable to log.", th);
        }
    }

    public final void B(int i10, g gVar, long j10, boolean z10) {
        try {
            int i11 = y.a;
            try {
                this.h.z(y.b(i10, 2, gVar, null, l3.b), this.l, j10, z10);
            } catch (Throwable th) {
                com.google.android.gms.internal.play_billing.u.i("BillingClient", "Unable to log.", th);
            }
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.u.i("BillingClient", "Unable to log.", th2);
        }
    }

    public final void C(int i10, g gVar, String str, long j10, boolean z10) {
        try {
            int i11 = y.a;
            try {
                this.h.z(y.b(i10, 2, gVar, str, l3.b), this.l, j10, z10);
            } catch (Throwable th) {
                com.google.android.gms.internal.play_billing.u.i("BillingClient", "Unable to log.", th);
            }
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.u.i("BillingClient", "Unable to log.", th2);
        }
    }

    public final void D(g gVar) {
        if (Thread.interrupted()) {
            return;
        }
        this.e.post(new a9.o(this, gVar, false, 24));
    }

    @Override // n2.a
    public void a(ec.a aVar, h hVar) {
        if (f(new r(this, hVar, aVar, 0), 30000L, new q1(this, hVar, aVar, false, 8), r(), e()) == null) {
            g u10 = u();
            y(25, 4, u10);
            hVar.a(u10, aVar.b);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:152:0x072b  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0736 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:273:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x02ea  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x02f8  */
    /* JADX WARN: Type inference failed for: r4v26, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v59, types: [java.lang.String] */
    @Override // n2.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public g b(Activity activity, final f fVar) {
        String str;
        String str2;
        long j10;
        String str3;
        g gVar;
        i iVar;
        g gVar2;
        HashSet hashSet;
        long j11;
        String str4;
        Future f10;
        long j12;
        long j13;
        long j14;
        long j15;
        Object obj;
        int b10;
        int i10;
        long j16;
        int i11;
        boolean z10;
        String str5;
        String str6;
        boolean z11;
        String str7;
        boolean z12;
        long nextLong = new Random().nextLong();
        if (this.f == null || ((n) this.f.c) == null) {
            g gVar3 = a0.o;
            z(12, gVar3, nextLong);
            return gVar3;
        }
        try {
            com.google.android.gms.internal.play_billing.u.g("BillingClient", "Already connected or not opted into auto reconnection.");
            g gVar4 = a0.g;
            TimeUnit.MILLISECONDS.getClass();
            int i12 = gVar4.a;
            if (i12 == 0) {
                com.google.android.gms.internal.play_billing.u.g("BillingClient", "Reconnection succeeded with result: " + i12);
            } else {
                com.google.android.gms.internal.play_billing.u.h("BillingClient", "Reconnection failed with result: " + i12);
            }
        } catch (Exception e9) {
            if (e9 instanceof InterruptedException) {
                Thread.currentThread().interrupt();
            }
            com.google.android.gms.internal.play_billing.u.i("BillingClient", "Error during reconnection attempt: ", e9);
        }
        if (!o()) {
            g gVar5 = a0.h;
            z(2, gVar5, nextLong);
            D(gVar5);
            return gVar5;
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
        arrayList.addAll((ArrayList) fVar.f);
        com.google.android.gms.internal.play_billing.r rVar = (com.google.android.gms.internal.play_billing.r) fVar.e;
        Iterator it = arrayList.iterator();
        if ((it.hasNext() ? it.next() : null) != null) {
            throw new ClassCastException();
        }
        com.google.android.gms.internal.play_billing.p pVar = (com.google.android.gms.internal.play_billing.p) rVar.iterator();
        d dVar = (d) (pVar.hasNext() ? pVar.next() : null);
        l lVar = dVar.a;
        String str8 = lVar.c;
        String str9 = lVar.d;
        if (str9.equals("subs") && !this.k) {
            com.google.android.gms.internal.play_billing.u.h("BillingClient", "Current client doesn't support subscriptions.");
            g gVar6 = a0.j;
            B(9, gVar6, nextLong, false);
            D(gVar6);
            return gVar6;
        }
        if (((String) fVar.b) == null && ((String) fVar.c) == null) {
            e eVar = (e) fVar.d;
            eVar.getClass();
            if (eVar.b == 0 && !fVar.a) {
                com.google.android.gms.internal.play_billing.r rVar2 = (com.google.android.gms.internal.play_billing.r) fVar.e;
                if (rVar2 != null) {
                    int size = rVar2.size();
                    for (int i13 = 0; i13 < size; i13++) {
                    }
                }
                if (arrayList.size() <= 1 && !this.q) {
                    com.google.android.gms.internal.play_billing.u.h("BillingClient", "Current client doesn't support multi-item purchases.");
                    g gVar7 = a0.k;
                    B(19, gVar7, nextLong, false);
                    D(gVar7);
                    return gVar7;
                }
                if (rVar.isEmpty() && !this.r) {
                    com.google.android.gms.internal.play_billing.u.h("BillingClient", "Current client doesn't support purchases with ProductDetails.");
                    g gVar8 = a0.m;
                    B(20, gVar8, nextLong, false);
                    D(gVar8);
                    return gVar8;
                }
                if (((com.google.android.gms.internal.play_billing.r) fVar.e).isEmpty()) {
                    d dVar2 = (d) ((com.google.android.gms.internal.play_billing.r) fVar.e).get(0);
                    int i14 = 1;
                    str = null;
                    while (true) {
                        if (i14 < ((com.google.android.gms.internal.play_billing.r) fVar.e).size()) {
                            d dVar3 = (d) ((com.google.android.gms.internal.play_billing.r) fVar.e).get(i14);
                            str2 = str8;
                            if (!dVar3.a.d.equals(dVar2.a.d) && !dVar3.a.d.equals("play_pass_subs")) {
                                j10 = nextLong;
                                gVar2 = a0.a(5, "All products should have same ProductType.");
                                str3 = str9;
                                break;
                            }
                            i14++;
                            str8 = str2;
                        } else {
                            str2 = str8;
                            l lVar2 = dVar2.a;
                            String optString = lVar2.b.optString("packageName");
                            HashMap hashMap = new HashMap();
                            HashSet hashSet2 = new HashSet();
                            j10 = nextLong;
                            com.google.android.gms.internal.play_billing.r rVar3 = (com.google.android.gms.internal.play_billing.r) fVar.e;
                            int size2 = rVar3.size();
                            str3 = str9;
                            int i15 = 0;
                            while (true) {
                                if (i15 < size2) {
                                    com.google.android.gms.internal.play_billing.r rVar4 = rVar3;
                                    d dVar4 = (d) rVar3.get(i15);
                                    int i16 = size2;
                                    l lVar3 = dVar4.a;
                                    int i17 = i15;
                                    ArrayList arrayList2 = lVar3.h;
                                    String str10 = lVar3.c;
                                    if (arrayList2 != null) {
                                        hashSet = hashSet2;
                                        if (dVar4.b == null) {
                                            gVar = a0.a(5, "offerToken is required for constructing ProductDetailsParams for subscriptions. Missing value for product id: " + str10);
                                            break;
                                        }
                                    } else {
                                        hashSet = hashSet2;
                                    }
                                    if (hashMap.containsKey(str10)) {
                                        gVar = a0.a(5, "ProductId can not be duplicated. Invalid product id: " + lVar3.c + ".");
                                        break;
                                    }
                                    hashMap.put(lVar3.c, dVar4);
                                    if (!lVar2.d.equals("play_pass_subs") && !lVar3.d.equals("play_pass_subs") && !optString.equals(lVar3.b.optString("packageName"))) {
                                        gVar = a0.a(5, "All products must have the same package name.");
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
                                                gVar = a0.a(5, "OldProductId must not be one of the products to be purchased. Invalid old product id: " + str11 + ".");
                                                break;
                                            }
                                        } else {
                                            ArrayList arrayList3 = lVar2.i;
                                            String str12 = dVar2.b;
                                            if (str12 != null && arrayList3 != null) {
                                                int size3 = arrayList3.size();
                                                int i18 = 0;
                                                while (true) {
                                                    if (i18 >= size3) {
                                                        iVar = null;
                                                        break;
                                                    }
                                                    Object obj2 = arrayList3.get(i18);
                                                    i18++;
                                                    iVar = (i) obj2;
                                                    if (str12.equals(iVar.d)) {
                                                        break;
                                                    }
                                                }
                                                if (iVar != null && iVar.g != null) {
                                                    gVar = a0.a(5, "Both autoPayDetails and autoPayBalanceThreshold is required for constructing ProductDetailsParams for autopay.");
                                                }
                                            }
                                            gVar = a0.g;
                                        }
                                    }
                                }
                            }
                            gVar2 = gVar;
                        }
                    }
                } else {
                    str2 = str8;
                    j10 = nextLong;
                    gVar2 = a0.g;
                    str3 = str9;
                    str = null;
                }
                if (gVar2 == a0.g) {
                    B(108, gVar2, j10, false);
                    D(gVar2);
                    return gVar2;
                }
                long j17 = j10;
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
                    bundle.putLong("billingClientTransactionId", j17);
                    int i20 = ((e) fVar.d).b;
                    if (i20 != 0) {
                        bundle.putInt("prorationMode", i20);
                    }
                    if (!TextUtils.isEmpty((String) fVar.b)) {
                        bundle.putString("accountId", (String) fVar.b);
                    }
                    if (!TextUtils.isEmpty((String) fVar.c)) {
                        bundle.putString("obfuscatedProfileId", (String) fVar.c);
                    }
                    if (!TextUtils.isEmpty(str)) {
                        bundle.putStringArrayList("skusToReplace", new ArrayList<>(Arrays.asList(str)));
                    }
                    if (!TextUtils.isEmpty(((e) fVar.d).a)) {
                        bundle.putString("oldSkuPurchaseToken", ((e) fVar.d).a);
                    }
                    if (TextUtils.isEmpty(str)) {
                        str6 = str;
                    } else {
                        str6 = str;
                        bundle.putString("oldSkuPurchaseId", str6);
                    }
                    ((e) fVar.d).getClass();
                    if (!TextUtils.isEmpty(str6)) {
                        ((e) fVar.d).getClass();
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
                    com.google.android.gms.internal.play_billing.p listIterator = ((com.google.android.gms.internal.play_billing.r) fVar.e).listIterator(0);
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
                            d dVar5 = (d) rVar.get(i21);
                            l lVar4 = dVar5.a;
                            long j18 = j17;
                            if (!lVar4.f.isEmpty()) {
                                arrayList7.add(lVar4.f);
                            }
                            arrayList8.add(dVar5.b);
                            String str15 = lVar4.g;
                            ArrayList arrayList11 = lVar4.i;
                            if (arrayList11 != null && !arrayList11.isEmpty()) {
                                ArrayList arrayList12 = lVar4.i;
                                int size4 = arrayList12.size();
                                int i22 = 0;
                                while (i22 < size4) {
                                    Object obj3 = arrayList12.get(i22);
                                    i22++;
                                    ArrayList arrayList13 = arrayList12;
                                    i iVar2 = (i) obj3;
                                    String str16 = str15;
                                    if (!TextUtils.isEmpty(iVar2.f)) {
                                        str7 = iVar2.f;
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
                                arrayList5.add(((d) rVar.get(i21)).a.c);
                                arrayList6.add(((d) rVar.get(i21)).a.d);
                            }
                            i21++;
                            j17 = j18;
                        }
                        j11 = j17;
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
                        j11 = j17;
                    }
                    if (bundle.containsKey("SKU_OFFER_ID_TOKEN_LIST") && !this.o) {
                        g gVar9 = a0.l;
                        B(21, gVar9, j11, false);
                        D(gVar9);
                        return gVar9;
                    }
                    if (TextUtils.isEmpty(dVar.a.b.optString("packageName"))) {
                        z12 = false;
                    } else {
                        bundle.putString("skuPackageName", dVar.a.b.optString("packageName"));
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
                    f10 = f(new Callable(i23, str17, r42, fVar, bundle) { // from class: n2.d0
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
                            b bVar = b.this;
                            int i24 = this.b;
                            String str18 = this.c;
                            String str19 = this.d;
                            Bundle bundle2 = this.e;
                            try {
                                synchronized (bVar.a) {
                                    cVar = bVar.i;
                                }
                                if (cVar == null) {
                                    return com.google.android.gms.internal.play_billing.u.c(107, a0.h);
                                }
                                return ((com.google.android.gms.internal.play_billing.a) cVar).X0(i24, bVar.g.getPackageName(), str18, str19, bundle2);
                            } catch (DeadObjectException e10) {
                                g gVar10 = a0.h;
                                String a2 = y.a(e10);
                                c10 = com.google.android.gms.internal.play_billing.u.c(5, gVar10);
                                if (a2 != null) {
                                    c10.putString("ADDITIONAL_LOG_DETAILS", a2);
                                }
                                return c10;
                            } catch (Exception e11) {
                                g gVar11 = a0.f;
                                String a3 = y.a(e11);
                                c10 = com.google.android.gms.internal.play_billing.u.c(5, gVar11);
                                if (a3 != null) {
                                    c10.putString("ADDITIONAL_LOG_DETAILS", a3);
                                }
                                return c10;
                            }
                        }
                    }, 5000L, null, this.e, e());
                    j12 = r42;
                } else {
                    j11 = j17;
                    str4 = str;
                    ?? r43 = str3;
                    f10 = f(new r(this, str2, r43, 3), 5000L, null, this.e, e());
                    j12 = r43;
                }
                try {
                    if (f10 == null) {
                        try {
                            g gVar10 = a0.b;
                            B(25, gVar10, j11, false);
                            D(gVar10);
                            return gVar10;
                        } catch (CancellationException e10) {
                            e = e10;
                            j15 = j11;
                            j13 = j15;
                            com.google.android.gms.internal.play_billing.u.i("BillingClient", "Time out while launching billing flow. Try to reconnect", e);
                            g gVar11 = a0.i;
                            C(4, gVar11, y.a(e), j13, false);
                            D(gVar11);
                            return gVar11;
                        } catch (TimeoutException e11) {
                            e = e11;
                            j15 = j11;
                            j13 = j15;
                            com.google.android.gms.internal.play_billing.u.i("BillingClient", "Time out while launching billing flow. Try to reconnect", e);
                            g gVar112 = a0.i;
                            C(4, gVar112, y.a(e), j13, false);
                            D(gVar112);
                            return gVar112;
                        } catch (Exception e12) {
                            e = e12;
                            j14 = j11;
                            long j19 = j14;
                            com.google.android.gms.internal.play_billing.u.i("BillingClient", "Exception while launching billing flow. Try to reconnect", e);
                            g gVar12 = a0.h;
                            C(5, gVar12, y.a(e), j19, false);
                            D(gVar12);
                            return gVar12;
                        }
                    }
                    long j20 = j11;
                    Bundle bundle2 = (Bundle) f10.get(5000L, TimeUnit.MILLISECONDS);
                    int a2 = com.google.android.gms.internal.play_billing.u.a("BillingClient", bundle2);
                    String f11 = com.google.android.gms.internal.play_billing.u.f("BillingClient", bundle2);
                    if (a2 == 0) {
                        Intent intent2 = new Intent(activity, (Class<?>) ProxyBillingActivity.class);
                        intent2.putExtra("BUY_INTENT", (PendingIntent) bundle2.getParcelable("BUY_INTENT"));
                        intent2.putExtra("billingClientTransactionId", j20);
                        intent2.putExtra("wasServiceAutoReconnected", false);
                        activity.startActivity(intent2);
                        return a0.g;
                    }
                    com.google.android.gms.internal.play_billing.u.h("BillingClient", "Unable to buy item, Error response code: " + a2);
                    g a3 = a0.a(a2, f11);
                    try {
                        if (bundle2 != null) {
                            try {
                                obj = bundle2.get("LOG_REASON");
                            } catch (Throwable th) {
                                com.google.android.gms.internal.play_billing.u.h("BillingClient", "Failed to get log reason from bundle: ".concat(String.valueOf(th.getMessage())));
                            }
                            if (obj != null) {
                                if (obj instanceof Integer) {
                                    b10 = a9.p.b(((Integer) obj).intValue());
                                    i10 = 1;
                                    if (b10 == i10) {
                                        b10 = 23;
                                    }
                                    if (bundle2 != null) {
                                        try {
                                            String string = bundle2.getString("ADDITIONAL_LOG_DETAILS");
                                            j16 = j20;
                                            i11 = b10;
                                            z10 = false;
                                            str5 = string;
                                        } catch (Throwable th2) {
                                            com.google.android.gms.internal.play_billing.u.h("BillingClient", "Failed to get additional log details from bundle: ".concat(String.valueOf(th2.getMessage())));
                                        }
                                        C(i11, a3, str5, j16, z10);
                                        D(a3);
                                        return a3;
                                    }
                                    j16 = j20;
                                    i11 = b10;
                                    str5 = str4;
                                    z10 = false;
                                    C(i11, a3, str5, j16, z10);
                                    D(a3);
                                    return a3;
                                }
                                com.google.android.gms.internal.play_billing.u.h("BillingClient", "Unexpected type for bundle log reason: " + obj.getClass().getName());
                            }
                        }
                        C(i11, a3, str5, j16, z10);
                        D(a3);
                        return a3;
                    } catch (CancellationException e13) {
                        e = e13;
                        j15 = j16;
                        j13 = j15;
                        com.google.android.gms.internal.play_billing.u.i("BillingClient", "Time out while launching billing flow. Try to reconnect", e);
                        g gVar1122 = a0.i;
                        C(4, gVar1122, y.a(e), j13, false);
                        D(gVar1122);
                        return gVar1122;
                    } catch (TimeoutException e14) {
                        e = e14;
                        j15 = j16;
                        j13 = j15;
                        com.google.android.gms.internal.play_billing.u.i("BillingClient", "Time out while launching billing flow. Try to reconnect", e);
                        g gVar11222 = a0.i;
                        C(4, gVar11222, y.a(e), j13, false);
                        D(gVar11222);
                        return gVar11222;
                    } catch (Exception e15) {
                        e = e15;
                        j14 = j16;
                        long j192 = j14;
                        com.google.android.gms.internal.play_billing.u.i("BillingClient", "Exception while launching billing flow. Try to reconnect", e);
                        g gVar122 = a0.h;
                        C(5, gVar122, y.a(e), j192, false);
                        D(gVar122);
                        return gVar122;
                    }
                    i10 = 1;
                    b10 = 1;
                    if (b10 == i10) {
                    }
                    if (bundle2 != null) {
                    }
                    j16 = j20;
                    i11 = b10;
                    str5 = str4;
                    z10 = false;
                    j13 = j15;
                } catch (CancellationException e16) {
                    e = e16;
                } catch (TimeoutException e17) {
                    e = e17;
                    j13 = j12;
                } catch (Exception e18) {
                    e = e18;
                }
                com.google.android.gms.internal.play_billing.u.i("BillingClient", "Time out while launching billing flow. Try to reconnect", e);
                g gVar112222 = a0.i;
                C(4, gVar112222, y.a(e), j13, false);
                D(gVar112222);
                return gVar112222;
            }
        }
        if (!this.m) {
            com.google.android.gms.internal.play_billing.u.h("BillingClient", "Current client doesn't support extra params for buy intent.");
            g gVar13 = a0.e;
            B(18, gVar13, nextLong, false);
            D(gVar13);
            return gVar13;
        }
        if (arrayList.size() <= 1) {
        }
        if (rVar.isEmpty()) {
        }
        if (((com.google.android.gms.internal.play_billing.r) fVar.e).isEmpty()) {
        }
        if (gVar2 == a0.g) {
        }
    }

    @Override // n2.a
    public void c(n1.d dVar, org.telegram.messenger.d dVar2) {
        if (f(new r(this, dVar2, dVar, 1), 30000L, new a9.o(this, dVar2, false, 26), r(), e()) == null) {
            g u10 = u();
            y(25, 7, u10);
            com.google.android.gms.internal.play_billing.p pVar = com.google.android.gms.internal.play_billing.r.b;
            com.google.android.gms.internal.play_billing.v vVar = com.google.android.gms.internal.play_billing.v.e;
            dVar2.a(u10, new p(vVar, vVar));
        }
    }

    @Override // n2.a
    public void d(BillingController billingController) {
        l(billingController);
    }

    public final synchronized ExecutorService e() {
        try {
            if (this.z == null) {
                this.z = Executors.newFixedThreadPool(com.google.android.gms.internal.play_billing.u.a, new f9.v(this));
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.z;
    }

    public final void g(h hVar, String str, g gVar, int i10, String str2, Exception exc) {
        com.google.android.gms.internal.play_billing.u.i("BillingClient", str2, exc);
        A(i10, 4, gVar, y.a(exc));
        hVar.a(gVar, str);
    }

    public final void h(f3 f3Var) {
        try {
            g5.b bVar = this.h;
            int i10 = this.l;
            bVar.getClass();
            try {
                n3 n3Var = (n3) ((o3) bVar.b).g();
                n3Var.c();
                o3.p((o3) n3Var.b, i10);
                bVar.b = (o3) n3Var.a();
                bVar.w(f3Var);
            } catch (Throwable th) {
                com.google.android.gms.internal.play_billing.u.i("BillingLogger", "Unable to log.", th);
            }
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.u.i("BillingClient", "Unable to log.", th2);
        }
    }

    public final void i(h3 h3Var) {
        try {
            g5.b bVar = this.h;
            int i10 = this.l;
            bVar.getClass();
            try {
                n3 n3Var = (n3) ((o3) bVar.b).g();
                n3Var.c();
                o3.p((o3) n3Var.b, i10);
                o3 o3Var = (o3) n3Var.a();
                bVar.b = o3Var;
                try {
                    bVar.E(h3Var, o3Var);
                } catch (Throwable th) {
                    com.google.android.gms.internal.play_billing.u.i("BillingLogger", "Unable to log.", th);
                }
            } catch (Throwable th2) {
                com.google.android.gms.internal.play_billing.u.i("BillingLogger", "Unable to log.", th2);
            }
        } catch (Throwable th3) {
            com.google.android.gms.internal.play_billing.u.i("BillingClient", "Unable to log.", th3);
        }
    }

    public final void j(int i10, g gVar) {
        try {
            int i11 = y.a;
            e3 e3Var = (e3) y.b(i10, 6, gVar, null, l3.b).g();
            b4 r10 = c4.r();
            r10.d(false);
            r10.e();
            e3Var.e(r10);
            h((f3) e3Var.a());
        } catch (Throwable th) {
            com.google.android.gms.internal.play_billing.u.i("BillingClient", "Unable to log.", th);
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
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void l(c cVar) {
        int i10;
        g gVar;
        synchronized (this.a) {
            try {
                if (o()) {
                    gVar = t();
                } else if (this.b == 1) {
                    com.google.android.gms.internal.play_billing.u.h("BillingClient", "Client is already in the process of connecting to billing service.");
                    gVar = a0.c;
                    j(37, gVar);
                } else if (this.b == 3) {
                    com.google.android.gms.internal.play_billing.u.h("BillingClient", "Client was already closed and can't be reused. Please create another instance.");
                    gVar = a0.h;
                    j(38, gVar);
                } else {
                    k(1);
                    m();
                    com.google.android.gms.internal.play_billing.u.g("BillingClient", "Starting in-app billing setup.");
                    this.j = new s(this, cVar);
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
                                            gVar = t();
                                        } else if (this.b != 1) {
                                            com.google.android.gms.internal.play_billing.u.h("BillingClient", "Client state no longer CONNECTING, returning service disconnected.");
                                            gVar = a0.h;
                                            j(105, gVar);
                                        } else {
                                            s sVar = this.j;
                                            if (this.g.bindService(intent2, sVar, 1)) {
                                                com.google.android.gms.internal.play_billing.u.g("BillingClient", "Service was bonded successfully.");
                                                gVar = null;
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
                    gVar = a0.a;
                    j(i10, gVar);
                }
            } finally {
            }
        }
        if (gVar != null) {
            cVar.onBillingSetupFinished(gVar);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void m() {
        synchronized (this.a) {
            if (this.j != null) {
                try {
                    this.g.unbindService(this.j);
                } catch (Throwable th) {
                    try {
                        com.google.android.gms.internal.play_billing.u.i("BillingClient", "There was an exception while unbinding service!", th);
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
        long j11 = 30000;
        int i10 = 1;
        while (i10 <= 3) {
            try {
            } catch (Exception e9) {
                if (e9 instanceof InterruptedException) {
                    Thread.currentThread().interrupt();
                }
                com.google.android.gms.internal.play_billing.u.i("BillingClient", "Error during reconnection attempt: ", e9);
            }
            if (Math.max(0L, j11) <= 0) {
                com.google.android.gms.internal.play_billing.u.h("BillingClient", "No time remaining for reconnection attempt.");
                return o();
            }
            com.google.android.gms.internal.play_billing.u.g("BillingClient", "Already connected or not opted into auto reconnection.");
            g gVar = a0.g;
            TimeUnit.MILLISECONDS.getClass();
            int i11 = gVar.a;
            if (i11 == 0) {
                com.google.android.gms.internal.play_billing.u.g("BillingClient", "Reconnection succeeded with result: " + i11);
                return o();
            }
            com.google.android.gms.internal.play_billing.u.h("BillingClient", "Reconnection failed with result: " + i11);
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            long a3 = (hVar.a() - a2) + 0;
            TimeUnit timeUnit2 = TimeUnit.NANOSECONDS;
            j11 = j10 - timeUnit.convert(a3, timeUnit2);
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
                } catch (InterruptedException e10) {
                    Thread.currentThread().interrupt();
                    com.google.android.gms.internal.play_billing.u.i("BillingClient", "Error sleeping during reconnection attempt: ", e10);
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

    public final u5.k s(g gVar, int i10, String str, Exception exc) {
        com.google.android.gms.internal.play_billing.u.i("BillingClient", str, exc);
        A(i10, 7, gVar, y.a(exc));
        return new u5.k(gVar.a, gVar.c, new ArrayList(), new ArrayList());
    }

    public final g t() {
        com.google.android.gms.internal.play_billing.u.g("BillingClient", "Service connection is valid. No need to re-initialize.");
        g3 s10 = h3.s();
        s10.c();
        h3.r((h3) s10.b, 6);
        b4 r10 = c4.r();
        r10.c();
        c4.q((c4) r10.b);
        r10.d(false);
        r10.e();
        s10.c();
        h3.q((h3) s10.b, (c4) r10.a());
        i((h3) s10.a());
        return a0.g;
    }

    public final g u() {
        int[] iArr = {0, 3};
        synchronized (this.a) {
            for (int i10 = 0; i10 < 2; i10++) {
                if (this.b == iArr[i10]) {
                    return a0.h;
                }
            }
            return a0.f;
        }
    }

    public final void v() {
        if (TextUtils.isEmpty(null)) {
            this.g.getPackageName();
        }
    }

    public final g5.b x(g gVar, int i10, String str, Exception exc) {
        A(i10, 9, gVar, y.a(exc));
        com.google.android.gms.internal.play_billing.u.i("BillingClient", str, exc);
        return new g5.b(gVar, null, false, 24);
    }

    public final void y(int i10, int i11, g gVar) {
        try {
            int i12 = y.a;
            h(y.b(i10, i11, gVar, null, l3.b));
        } catch (Throwable th) {
            com.google.android.gms.internal.play_billing.u.i("BillingClient", "Unable to log.", th);
        }
    }

    public final void z(int i10, g gVar, long j10) {
        try {
            int i11 = y.a;
            try {
                this.h.x(y.b(i10, 2, gVar, null, l3.b), this.l, j10);
            } catch (Throwable th) {
                com.google.android.gms.internal.play_billing.u.i("BillingClient", "Unable to log.", th);
            }
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.u.i("BillingClient", "Unable to log.", th2);
        }
    }

    public b(w9.d dVar, Context context, androidx.emoji2.text.f fVar) {
        long nextLong = new Random().nextLong();
        this.A = Long.valueOf(nextLong);
        this.B = com.google.android.gms.internal.play_billing.i.a;
        this.c = "8.0.0";
        String w10 = w();
        this.d = w10;
        this.g = context.getApplicationContext();
        n3 x8 = o3.x();
        x8.c();
        o3.v((o3) x8.b);
        if (w10 != null) {
            x8.c();
            o3.w((o3) x8.b, w10);
        }
        String packageName = this.g.getPackageName();
        x8.c();
        o3.t((o3) x8.b, packageName);
        x8.c();
        o3.q((o3) x8.b, nextLong);
        x8.c();
        o3.u((o3) x8.b);
        int i10 = Build.VERSION.SDK_INT;
        x8.c();
        o3.n((o3) x8.b, i10);
        x8.d();
        try {
            int i11 = this.g.getPackageManager().getPackageInfo(this.g.getPackageName(), 0).versionCode;
            x8.c();
            o3.o((o3) x8.b, i11);
        } catch (Throwable th) {
            com.google.android.gms.internal.play_billing.u.i("BillingClient", "Error getting app version code.", th);
        }
        this.h = new g5.b(this.g, (o3) x8.a());
        com.google.android.gms.internal.play_billing.u.h("BillingClient", "Billing client should have a valid listener but the provided is null.");
        this.f = new f(this.g, null, this.h);
        this.x = dVar;
        this.g.getPackageName();
    }
}

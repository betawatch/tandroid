package ob;

import a8.ma;
import a8.n8;
import a8.sa;
import aa.n;
import aa.p;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.graphics.SurfaceTexture;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcel;
import android.os.ResultReceiver;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.TextureView;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.biometric.e0;
import androidx.fragment.app.s;
import androidx.lifecycle.a0;
import androidx.lifecycle.t;
import c4.d;
import c8.d0;
import c8.z;
import ca.r;
import ch.p0;
import ci.b0;
import ci.j0;
import ci.z0;
import com.android.billingclient.api.ProxyBillingActivityV2;
import com.google.android.gms.cast.MediaInfo;
import com.google.android.gms.common.api.e;
import com.google.android.gms.common.api.internal.c0;
import com.google.android.gms.common.api.internal.f0;
import com.google.android.gms.common.api.internal.h0;
import com.google.android.gms.common.api.internal.q;
import com.google.android.gms.internal.play_billing.u;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.TaskCompletionSource;
import d8.f;
import de.h;
import di.f6;
import f6.o;
import fi.w8;
import fi.z3;
import g9.k;
import gb.l0;
import gb.v0;
import h9.e1;
import h9.g1;
import hi.d6;
import java.io.File;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.locks.Lock;
import kd.j;
import org.json.JSONObject;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.fj;
import org.telegram.messenger.g0;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.f61;
import org.telegram.ui.Components.fc;
import org.telegram.ui.Components.h61;
import org.telegram.ui.Components.po0;
import org.telegram.ui.Components.wi0;
import org.telegram.ui.dr0;
import tg.w1;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes.dex */
public final class c implements a0, androidx.activity.result.b, ce.c, wi0, ci.a0, f0, d, q, po0, dr0, OnSuccessListener, ib.b, k, tg.c, f61 {
    public final /* synthetic */ int a;
    public Object b;

    public /* synthetic */ c(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    public void A(ia.c cVar, Thread thread, Throwable th2) {
        p pVar = (p) this.b;
        synchronized (pVar) {
            String str = "Handling uncaught exception \"" + th2 + "\" from thread " + thread.getName();
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", str, null);
            }
            d0.a();
            try {
                aa.f0.a(pVar.e.a.b(new n(pVar, System.currentTimeMillis(), th2, thread, cVar)));
            } catch (TimeoutException unused) {
                Log.e("FirebaseCrashlytics", "Cannot send reports. Timed out while fetching settings.", null);
            } catch (Exception e10) {
                Log.e("FirebaseCrashlytics", "Error handling uncaught exception", e10);
            }
        }
    }

    @Override // org.telegram.ui.dr0
    public void G(fj fjVar) {
        ((w8) ((z3) this.b).A1).f(false);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Type inference failed for: r7v4, types: [kd.j, rd.p] */
    @Override // ce.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object J(ce.d dVar, kd.c cVar) {
        ce.a aVar;
        int i7;
        Throwable th2;
        h hVar;
        if (cVar instanceof ce.a) {
            aVar = (ce.a) cVar;
            int i10 = aVar.d;
            if ((i10 & TLObject.FLAG_31) != 0) {
                aVar.d = i10 - TLObject.FLAG_31;
                Object obj = aVar.b;
                jd.a aVar2 = jd.a.a;
                i7 = aVar.d;
                gd.k kVar = gd.k.a;
                if (i7 != 0) {
                    z.b(obj);
                    h hVar2 = new h(dVar, aVar.getContext());
                    try {
                        aVar.a = hVar2;
                        aVar.d = 1;
                        Object invoke = ((j) this.b).invoke(hVar2, aVar);
                        if (invoke != aVar2) {
                            invoke = kVar;
                        }
                        if (invoke == aVar2) {
                            return aVar2;
                        }
                        hVar = hVar2;
                    } catch (Throwable th3) {
                        th2 = th3;
                        hVar = hVar2;
                        hVar.releaseIntercepted();
                        throw th2;
                    }
                } else {
                    if (i7 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    hVar = aVar.a;
                    try {
                        z.b(obj);
                    } catch (Throwable th4) {
                        th2 = th4;
                        hVar.releaseIntercepted();
                        throw th2;
                    }
                }
                hVar.releaseIntercepted();
                return kVar;
            }
        }
        aVar = new ce.a(this, cVar);
        Object obj2 = aVar.b;
        jd.a aVar22 = jd.a.a;
        i7 = aVar.d;
        gd.k kVar2 = gd.k.a;
        if (i7 != 0) {
        }
        hVar.releaseIntercepted();
        return kVar2;
    }

    @Override // org.telegram.ui.dr0
    public /* synthetic */ TextureView T() {
        return null;
    }

    @Override // com.google.android.gms.common.api.internal.f0
    public void a() {
        h0 h0Var = (h0) this.b;
        Lock lock = h0Var.a;
        lock.lock();
        try {
            h0Var.m = new c0(h0Var, h0Var.j, h0Var.k, h0Var.d, h0Var.l, lock, h0Var.c);
            h0Var.m.s();
            h0Var.b.signalAll();
        } finally {
            h0Var.a.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.internal.q
    public void accept(Object obj, Object obj2) {
        o8.c cVar = (o8.c) this.b;
        d8.d dVar = new d8.d(1, (TaskCompletionSource) obj2);
        d8.c cVar2 = (d8.c) ((f) obj).n();
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken("com.google.android.gms.recaptchabase.internal.IRecaptchaBaseService");
        int i7 = d8.a.a;
        obtain.writeStrongBinder(dVar);
        obtain.writeInt(1);
        cVar.writeToParcel(obtain, 0);
        cVar2.h1(obtain, 1);
    }

    @Override // g9.k, l5.e
    public Object apply(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        g1 g1Var = (g1) this.b;
        g1Var.getClass();
        entry.getClass();
        return new e1(entry, g1Var);
    }

    @Override // com.google.android.gms.common.api.internal.f0
    public com.google.android.gms.common.api.internal.d b(com.google.android.gms.common.api.internal.d dVar) {
        throw new IllegalStateException("GoogleApiClient is not connected yet.");
    }

    @Override // c4.d
    public int d(long j3) {
        return j3 < 0 ? 0 : -1;
    }

    @Override // ci.a0
    public void e(b0 b0Var) {
        j0 j0Var = (j0) this.b;
        FrameLayout frameLayout = j0Var.f;
        if (frameLayout != null) {
            frameLayout.removeView(b0Var);
        }
        if (j0Var.G == b0Var) {
            j0Var.G = null;
        }
        z0 z0Var = j0Var.d;
        if (z0Var != null) {
            z0Var.setScanHidden(false);
        }
    }

    @Override // ci.a0
    public void f(String str) {
        j0 j0Var = (j0) this.b;
        if (j0Var.getParentActivity() != null) {
            vf.c.t(j0Var.getParentActivity(), str);
        }
    }

    @Override // androidx.activity.result.b
    public void g(Object obj) {
        switch (this.a) {
            case 6:
                androidx.activity.result.a aVar = (androidx.activity.result.a) obj;
                androidx.fragment.app.j0 j0Var = (androidx.fragment.app.j0) this.b;
                androidx.fragment.app.f0 f0Var = (androidx.fragment.app.f0) j0Var.F.pollLast();
                if (f0Var != null) {
                    String str = f0Var.a;
                    int i7 = f0Var.b;
                    s o4 = j0Var.c.o(str);
                    if (o4 != null) {
                        o4.x(i7, aVar.a, aVar.b);
                        break;
                    } else {
                        Log.w("FragmentManager", "Activity result delivered for unknown Fragment " + str);
                        break;
                    }
                } else {
                    Log.w("FragmentManager", "No Activities were started for result for " + this);
                    break;
                }
            default:
                ProxyBillingActivityV2 proxyBillingActivityV2 = (ProxyBillingActivityV2) this.b;
                androidx.activity.result.a aVar2 = (androidx.activity.result.a) obj;
                proxyBillingActivityV2.getClass();
                Intent intent = aVar2.b;
                int i10 = u.e("ProxyBillingActivityV2", intent).a;
                ResultReceiver resultReceiver = proxyBillingActivityV2.N;
                if (resultReceiver != null) {
                    resultReceiver.send(i10, intent == null ? null : intent.getExtras());
                }
                int i11 = aVar2.a;
                if (i11 != -1 || i10 != 0) {
                    u.h("ProxyBillingActivityV2", "Alternative billing only dialog finished with resultCode " + i11 + " and billing's responseCode: " + i10);
                }
                proxyBillingActivityV2.finish();
                break;
        }
    }

    @Override // fd.a
    public Object get() {
        return new l0((v0) ((ib.c) this.b).get());
    }

    @Override // org.telegram.ui.Components.wi0
    public void h(View view, p0 p0Var, boolean z10, boolean z11) {
        ch.s sVar = (ch.s) this.b;
        sVar.a.Eb(null, sVar.e, sVar.b, view, 0.0f, 0.0f, p0Var, false, z10, z11, false);
        g0.g3(new r(this, 1));
    }

    @Override // c4.d
    public long i(int i7) {
        ma.f(i7 == 0);
        return 0L;
    }

    @Override // c4.d
    public List k(long j3) {
        return j3 >= 0 ? (List) this.b : Collections.EMPTY_LIST;
    }

    @Override // org.telegram.ui.Components.wi0
    public /* synthetic */ boolean l() {
        return true;
    }

    @Override // org.telegram.ui.Components.po0
    public void l0() {
        fc k10 = ((f6) this.b).k().k(false);
        k10.t = true;
        k10.j();
    }

    @Override // c4.d
    public int m() {
        return 1;
    }

    @Override // org.telegram.ui.Components.wi0
    public /* synthetic */ boolean n() {
        return false;
    }

    @Override // org.telegram.ui.Components.f61
    public /* synthetic */ void onRenderedFirstFrame(m2.a aVar) {
    }

    @Override // org.telegram.ui.Components.f61
    public void onStateChanged(boolean z10, int i7) {
        hi.f6 f6Var = (hi.f6) this.b;
        d6 d6Var = f6Var.N;
        h61 h61Var = f6Var.y;
        if (h61Var == null) {
            return;
        }
        if (h61Var.d0()) {
            g0.g3(d6Var);
        } else {
            g0.r(d6Var);
        }
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public void onSuccess(Object obj) {
        ((g6.a) this.b).getClass();
        n8.a("com.google.android.gms.cast.MAP_CAST_STATUS_CODES_TO_CAST_REASON_CODES", (Bundle) obj);
    }

    @Override // org.telegram.ui.Components.f61
    public /* synthetic */ boolean onSurfaceDestroyed(SurfaceTexture surfaceTexture) {
        return false;
    }

    @Override // org.telegram.ui.Components.f61
    public void onVideoSizeChanged(int i7, int i10, int i11, float f10) {
        w1 w1Var = ((hi.f6) this.b).x;
        if (w1Var != null) {
            float f11 = i7 / i10;
            if (Math.abs(w1Var.A0 - f11) >= 1.0E-4f) {
                w1Var.A0 = f11;
                w1Var.requestLayout();
            }
        }
    }

    @Override // com.google.android.gms.common.api.internal.f0
    public boolean p() {
        return true;
    }

    @Override // com.google.android.gms.common.api.internal.f0
    public void s() {
        h0 h0Var = (h0) this.b;
        Iterator it = h0Var.f.values().iterator();
        while (it.hasNext()) {
            ((com.google.android.gms.common.api.c) it.next()).a();
        }
        h0Var.o.G = Collections.EMPTY_SET;
    }

    @Override // org.telegram.ui.Components.wi0
    public /* synthetic */ boolean t() {
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x006c, code lost:
    
        if (r3 == 1) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0072, code lost:
    
        if (r3 == 3) goto L31;
     */
    @Override // androidx.lifecycle.a0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void u(Object obj) {
        switch (this.a) {
            case 4:
                Integer num = (Integer) obj;
                androidx.biometric.g0 g0Var = (androidx.biometric.g0) this.b;
                Handler handler = g0Var.B0;
                sa saVar = g0Var.C0;
                handler.removeCallbacks(saVar);
                int intValue = num.intValue();
                if (g0Var.G0 != null) {
                    int i7 = g0Var.D0.y;
                    Context n10 = g0Var.n();
                    Drawable drawable = null;
                    if (n10 == null) {
                        Log.w("FingerprintFragment", "Unable to get asset. Context is null.");
                    } else {
                        int i10 = R.drawable.fingerprint_dialog_fp_icon;
                        if (i7 != 0 || intValue != 1) {
                            if (i7 != 1 || intValue != 2) {
                                if (i7 == 2) {
                                }
                                if (i7 == 1) {
                                    break;
                                }
                            } else {
                                i10 = R.drawable.fingerprint_dialog_error;
                            }
                        }
                        drawable = n10.getDrawable(i10);
                    }
                    if (drawable != null) {
                        g0Var.G0.setImageDrawable(drawable);
                        if ((i7 != 0 || intValue != 1) && ((i7 == 1 && intValue == 2) || (i7 == 2 && intValue == 1))) {
                            e0.a(drawable);
                        }
                        g0Var.D0.y = intValue;
                    }
                }
                int intValue2 = num.intValue();
                TextView textView = g0Var.H0;
                if (textView != null) {
                    textView.setTextColor(intValue2 == 2 ? g0Var.E0 : g0Var.F0);
                }
                handler.postDelayed(saVar, 2000L);
                return;
            default:
                t tVar = (t) obj;
                androidx.fragment.app.p pVar = (androidx.fragment.app.p) this.b;
                if (tVar == null || !pVar.s0) {
                    return;
                }
                pVar.getClass();
                throw new IllegalStateException("Fragment " + pVar + " did not return a View from onCreateView() or this was called before onCreateView().");
        }
    }

    @Override // org.telegram.ui.dr0
    public void u0(fj fjVar) {
        ((w8) ((z3) this.b).A1).f(true);
    }

    public o v() {
        o oVar = (o) this.b;
        if (oVar.a == null) {
            throw new IllegalArgumentException("media cannot be null.");
        }
        if (!Double.isNaN(oVar.d) && oVar.d < 0.0d) {
            throw new IllegalArgumentException("startTime cannot be negative or NaN.");
        }
        if (Double.isNaN(oVar.e)) {
            throw new IllegalArgumentException("playbackDuration cannot be NaN.");
        }
        if (Double.isNaN(oVar.f) || oVar.f < 0.0d) {
            throw new IllegalArgumentException("preloadTime cannot be negative or Nan.");
        }
        return oVar;
    }

    public int w(int[] iArr, int i7) {
        int[] iArr2;
        int[] iArr3;
        int i10;
        int i11;
        ec.a aVar = (ec.a) this.b;
        if (iArr.length == 0) {
            throw new IllegalArgumentException();
        }
        int length = iArr.length;
        if (length <= 1 || iArr[0] != 0) {
            iArr2 = iArr;
        } else {
            int i12 = 1;
            while (i12 < length && iArr[i12] == 0) {
                i12++;
            }
            if (i12 == length) {
                iArr2 = new int[]{0};
            } else {
                int i13 = length - i12;
                int[] iArr4 = new int[i13];
                System.arraycopy(iArr, i12, iArr4, 0, i13);
                iArr2 = iArr4;
            }
        }
        int[] iArr5 = new int[i7];
        boolean z10 = true;
        for (int i14 = 0; i14 < i7; i14++) {
            int i15 = aVar.a[aVar.g + i14];
            if (i15 == 0) {
                i11 = iArr2[iArr2.length - 1];
            } else {
                if (i15 == 1) {
                    i10 = 0;
                    for (int i16 : iArr2) {
                        ec.a aVar2 = ec.a.h;
                        i10 ^= i16;
                    }
                } else {
                    i10 = iArr2[0];
                    int length2 = iArr2.length;
                    for (int i17 = 1; i17 < length2; i17++) {
                        i10 = aVar.c(i15, i10) ^ iArr2[i17];
                    }
                }
                i11 = i10;
            }
            iArr5[(i7 - 1) - i14] = i11;
            if (i11 != 0) {
                z10 = false;
            }
        }
        if (z10) {
            return 0;
        }
        ec.b bVar = new ec.b(aVar, iArr5);
        ec.b a10 = aVar.a(i7, 1);
        ec.b bVar2 = aVar.c;
        if (a10.d() >= bVar.d()) {
            a10 = bVar;
            bVar = a10;
        }
        ec.b bVar3 = aVar.d;
        ec.b bVar4 = a10;
        ec.b bVar5 = bVar;
        ec.b bVar6 = bVar4;
        ec.b bVar7 = bVar2;
        while (bVar6.d() * 2 >= i7) {
            if (bVar6.e()) {
                throw new ec.c("r_{i-1} was zero");
            }
            int b10 = aVar.b(bVar6.c(bVar6.d()));
            ec.b bVar8 = bVar2;
            while (bVar5.d() >= bVar6.d() && !bVar5.e()) {
                int d = bVar5.d() - bVar6.d();
                int c10 = aVar.c(bVar5.c(bVar5.d()), b10);
                bVar8 = bVar8.a(aVar.a(d, c10));
                bVar5 = bVar5.a(bVar6.h(d, c10));
            }
            ec.b a11 = bVar8.g(bVar3).a(bVar7);
            if (bVar5.d() >= bVar6.d()) {
                throw new IllegalStateException("Division algorithm failed to reduce polynomial? r: " + bVar5 + ", rLast: " + bVar6);
            }
            ec.b bVar9 = bVar5;
            bVar5 = bVar6;
            bVar6 = bVar9;
            bVar7 = bVar3;
            bVar3 = a11;
        }
        int c11 = bVar3.c(0);
        if (c11 == 0) {
            throw new ec.c("sigmaTilde(0) was zero");
        }
        int b11 = aVar.b(c11);
        ec.b[] bVarArr = {bVar3.f(b11), bVar6.f(b11)};
        ec.b bVar10 = bVarArr[0];
        ec.b bVar11 = bVarArr[1];
        int d2 = bVar10.d();
        if (d2 == 1) {
            iArr3 = new int[]{bVar10.c(1)};
        } else {
            int[] iArr6 = new int[d2];
            int i18 = 0;
            for (int i19 = 1; i19 < aVar.e && i18 < d2; i19++) {
                if (bVar10.b(i19) == 0) {
                    iArr6[i18] = aVar.b(i19);
                    i18++;
                }
            }
            if (i18 != d2) {
                throw new ec.c("Error locator degree does not match number of roots");
            }
            iArr3 = iArr6;
        }
        int length3 = iArr3.length;
        int[] iArr7 = new int[length3];
        for (int i20 = 0; i20 < length3; i20++) {
            int b12 = aVar.b(iArr3[i20]);
            int i21 = 1;
            for (int i22 = 0; i22 < length3; i22++) {
                if (i20 != i22) {
                    int c12 = aVar.c(iArr3[i22], b12);
                    i21 = aVar.c(i21, (c12 & 1) == 0 ? c12 | 1 : c12 & (-2));
                }
            }
            int c13 = aVar.c(bVar11.b(b12), aVar.b(i21));
            iArr7[i20] = c13;
            if (aVar.g != 0) {
                iArr7[i20] = aVar.c(c13, b12);
            }
        }
        for (int i23 = 0; i23 < iArr3.length; i23++) {
            int length4 = iArr.length - 1;
            int i24 = iArr3[i23];
            if (i24 == 0) {
                throw new IllegalArgumentException();
            }
            int i25 = length4 - aVar.b[i24];
            if (i25 < 0) {
                throw new ec.c("Bad error location");
            }
            iArr[i25] = iArr[i25] ^ iArr7[i23];
        }
        return iArr3.length;
    }

    public synchronized void x() {
        ((SharedPreferences) this.b).edit().clear().commit();
    }

    public SparseIntArray y(long j3) {
        return (SparseIntArray) ((a0.h) this.b).f(j3);
    }

    public StringBuilder z() {
        mf.a aVar = (mf.a) this.b;
        if (!(aVar instanceof gf.p)) {
            return null;
        }
        StringBuilder sb2 = ((gf.p) aVar).b.b;
        if (sb2.length() == 0) {
            return null;
        }
        return sb2;
    }

    public c(MediaInfo mediaInfo) {
        this.a = 20;
        o oVar = new o(mediaInfo, 0, true, Double.NaN, Double.POSITIVE_INFINITY, 0.0d, null, null);
        if (mediaInfo == null) {
            throw new IllegalArgumentException("media cannot be null.");
        }
        this.b = oVar;
    }

    @Override // org.telegram.ui.Components.f61
    public void onRenderedFirstFrame() {
    }

    public c(Set set) {
        this.a = 0;
        this.b = new HashMap();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            b bVar = (b) it.next();
            HashMap hashMap = (HashMap) this.b;
            bVar.getClass();
            hashMap.put(a.class, bVar.a);
        }
    }

    public c(JSONObject jSONObject) {
        this.a = 20;
        this.b = new o(jSONObject);
    }

    public c(int i7) {
        this.a = i7;
        switch (i7) {
            case 8:
                this.b = new a0.h();
                break;
            case 17:
                break;
            default:
                this.b = new LinkedHashMap(0, 0.75f, true);
                break;
        }
    }

    public c(Context context) {
        boolean isEmpty;
        this.a = 2;
        SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.android.gms.appid", 0);
        this.b = sharedPreferences;
        File file = new File(context.getNoBackupFilesDir(), "com.google.android.gms.appid-no-backup");
        if (file.exists()) {
            return;
        }
        try {
            if (file.createNewFile()) {
                synchronized (this) {
                    isEmpty = sharedPreferences.getAll().isEmpty();
                }
                if (isEmpty) {
                    return;
                }
                Log.i("FirebaseMessaging", "App restored, clearing state");
                x();
            }
        } catch (IOException e10) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Error creating file in no backup dir: " + e10.getMessage());
            }
        }
    }

    @Override // org.telegram.ui.Components.po0
    public /* synthetic */ void K() {
    }

    @Override // org.telegram.ui.Components.wi0
    public /* synthetic */ void r() {
    }

    @Override // com.google.android.gms.common.api.internal.f0
    public void c(Bundle bundle) {
    }

    @Override // com.google.android.gms.common.api.internal.f0
    public void o(int i7) {
    }

    @Override // org.telegram.ui.Components.f61
    public /* synthetic */ void onSeekFinished(m2.a aVar) {
    }

    @Override // org.telegram.ui.Components.f61
    public /* synthetic */ void onSeekStarted(m2.a aVar) {
    }

    @Override // org.telegram.ui.Components.f61
    public /* synthetic */ void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public c(rd.p pVar) {
        this.a = 9;
        this.b = (j) pVar;
    }

    @Override // org.telegram.ui.Components.f61
    public void onError(h61 h61Var, Exception exc) {
    }

    @Override // com.google.android.gms.common.api.internal.f0
    public void j(n6.a aVar, e eVar, boolean z10) {
    }

    @Override // org.telegram.ui.Components.wi0
    public /* synthetic */ void q(Canvas canvas, RectF rectF, float f10, float f11, float f12, int i7, boolean z10) {
    }
}

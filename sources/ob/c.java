package ob;

import a0.h;
import a8.la;
import a8.m8;
import a8.sa;
import aa.f0;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Canvas;
import android.graphics.RectF;
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
import androidx.fragment.app.p;
import androidx.fragment.app.s;
import androidx.lifecycle.a0;
import androidx.lifecycle.t;
import bi.m3;
import c4.d;
import c8.c0;
import ca.r;
import ch.p0;
import ci.b0;
import ci.j0;
import ci.z0;
import com.android.billingclient.api.ProxyBillingActivityV2;
import com.google.android.gms.cast.MediaInfo;
import com.google.android.gms.common.api.e;
import com.google.android.gms.common.api.internal.g0;
import com.google.android.gms.common.api.internal.i0;
import com.google.android.gms.common.api.internal.q;
import com.google.android.gms.internal.play_billing.u;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.TaskCompletionSource;
import d8.f;
import di.f6;
import e2.q0;
import f6.o;
import fi.w8;
import fi.z3;
import g9.k;
import gb.k0;
import gb.u0;
import h2.x;
import h9.e1;
import h9.h1;
import hi.l0;
import hi.u9;
import java.io.EOFException;
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
import og.n;
import org.json.JSONObject;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.fj;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.gc;
import org.telegram.ui.Components.qo0;
import org.telegram.ui.Components.wi0;
import org.telegram.ui.dr0;
import sg.t0;
import t3.g;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes.dex */
public final class c implements a0, androidx.activity.result.b, ce.c, wi0, ci.a0, g0, d, q, qo0, dr0, OnSuccessListener, ib.b, k, n, t0 {
    public final /* synthetic */ int a;
    public Object b;

    public /* synthetic */ c(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
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
    public void A(Object obj) {
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
                p pVar = (p) this.b;
                if (tVar == null || !pVar.s0) {
                    return;
                }
                pVar.getClass();
                throw new IllegalStateException("Fragment " + pVar + " did not return a View from onCreateView() or this was called before onCreateView().");
        }
    }

    public o C() {
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

    @Override // org.telegram.ui.Components.qo0
    public void D0() {
        gc k10 = ((f6) this.b).k().k(false);
        k10.t = true;
        k10.j();
    }

    @Override // org.telegram.ui.Components.wi0
    public /* synthetic */ boolean E() {
        return false;
    }

    public int F(int[] iArr, int i7) {
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

    @Override // org.telegram.ui.dr0
    public void G0(fj fjVar) {
        ((w8) ((z3) this.b).A1).f(true);
    }

    @Override // org.telegram.ui.dr0
    public void H(fj fjVar) {
        ((w8) ((z3) this.b).A1).f(false);
    }

    public synchronized void I() {
        ((SharedPreferences) this.b).edit().clear().commit();
    }

    public SparseIntArray J(long j3) {
        return (SparseIntArray) ((h) this.b).f(j3);
    }

    public StringBuilder K() {
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

    public void L(ia.c cVar, Thread thread, Throwable th2) {
        aa.p pVar = (aa.p) this.b;
        synchronized (pVar) {
            String str = "Handling uncaught exception \"" + th2 + "\" from thread " + thread.getName();
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", str, null);
            }
            c0.a();
            try {
                f0.a(pVar.e.a.b(new aa.n(pVar, System.currentTimeMillis(), th2, thread, cVar)));
            } catch (TimeoutException unused) {
                Log.e("FirebaseCrashlytics", "Cannot send reports. Timed out while fetching settings.", null);
            } catch (Exception e10) {
                Log.e("FirebaseCrashlytics", "Error handling uncaught exception", e10);
            }
        }
    }

    public q0 M(f3.p pVar, g gVar, int i7) {
        x xVar = (x) this.b;
        q0 q0Var = null;
        int i10 = 0;
        loop0: while (true) {
            int i11 = 0;
            do {
                int i12 = i11 % 10;
                int i13 = i12 + 10;
                if (i12 == 0 && i11 != 0) {
                    byte[] bArr = xVar.a;
                    System.arraycopy(bArr, 10, bArr, 0, 9);
                }
                int i14 = i11 == 0 ? 10 : 1;
                try {
                    pVar.b(i13 - i14, i14, xVar.a);
                    xVar.N(i12);
                    xVar.M(i13);
                    if (xVar.a() < 3) {
                        throw new IndexOutOfBoundsException("position=" + xVar.b + ", limit=" + xVar.c);
                    }
                    int D = xVar.D();
                    int i15 = xVar.b - 3;
                    xVar.b = i15;
                    if (D != 4801587) {
                        if (f3.b.h(xVar.i()) != -1) {
                            break loop0;
                        }
                        if (i11 == 0) {
                            xVar.c(20);
                        }
                        i11++;
                    } else {
                        xVar.O(6);
                        int z10 = xVar.z();
                        int i16 = z10 + 10;
                        if (q0Var == null) {
                            byte[] bArr2 = new byte[i16];
                            System.arraycopy(xVar.a, i15, bArr2, 0, 10);
                            pVar.b(10, z10, bArr2);
                            q0Var = new t3.h(gVar).c(i16, bArr2);
                        } else {
                            pVar.m(z10);
                        }
                        i10 += i16;
                    }
                } catch (EOFException unused) {
                }
            } while (i11 <= i7);
        }
        pVar.n();
        pVar.m(i10);
        return q0Var;
    }

    @Override // com.google.android.gms.common.api.internal.g0
    public void a() {
        i0 i0Var = (i0) this.b;
        Lock lock = i0Var.a;
        lock.lock();
        try {
            i0Var.m = new com.google.android.gms.common.api.internal.c0(i0Var, i0Var.j, i0Var.k, i0Var.d, i0Var.l, lock, i0Var.c);
            i0Var.m.u();
            i0Var.b.signalAll();
        } finally {
            i0Var.a.unlock();
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
        h1 h1Var = (h1) this.b;
        h1Var.getClass();
        entry.getClass();
        return new e1(entry, h1Var);
    }

    @Override // com.google.android.gms.common.api.internal.g0
    public com.google.android.gms.common.api.internal.d b(com.google.android.gms.common.api.internal.d dVar) {
        throw new IllegalStateException("GoogleApiClient is not connected yet.");
    }

    @Override // ci.a0
    public void c(b0 b0Var) {
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

    @Override // c4.d
    public int d(long j3) {
        return j3 < 0 ? 0 : -1;
    }

    @Override // sg.t0
    public void e0() {
        u9 u9Var = (u9) this.b;
        u9Var.n0.a.u();
        u9Var.N0.setViewHidden(false);
    }

    @Override // androidx.activity.result.b
    public void f(Object obj) {
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

    @Override // org.telegram.ui.dr0
    public /* synthetic */ TextureView f0() {
        return null;
    }

    @Override // org.telegram.ui.Components.wi0
    public void g(View view, p0 p0Var, boolean z10, boolean z11) {
        ch.s sVar = (ch.s) this.b;
        sVar.a.Eb(null, sVar.e, sVar.b, view, 0.0f, 0.0f, p0Var, false, z10, z11, false);
        org.telegram.messenger.g0.g3(new r(this, 2));
    }

    @Override // fd.a
    public Object get() {
        return new k0((u0) ((ib.c) this.b).get());
    }

    @Override // c4.d
    public long h(int i7) {
        la.f(i7 == 0);
        return 0L;
    }

    @Override // ci.a0
    public void i(String str) {
        j0 j0Var = (j0) this.b;
        if (j0Var.getParentActivity() != null) {
            vf.c.t(j0Var.getParentActivity(), str);
        }
    }

    @Override // sg.t0
    public void k() {
        m3 m3Var = ((u9) this.b).z0;
        if (m3Var != null) {
            m3Var.invalidate();
        }
    }

    @Override // c4.d
    public List m(long j3) {
        return j3 >= 0 ? (List) this.b : Collections.EMPTY_LIST;
    }

    @Override // sg.t0
    public void n() {
        u9 u9Var = (u9) this.b;
        if (u9Var.M0) {
            u9Var.M0 = false;
        } else {
            u9Var.U0.b(1);
            u9Var.w((sg.h) sg.h.a.get(0));
        }
    }

    @Override // sg.t0
    public void n0() {
        u9 u9Var = (u9) this.b;
        if (u9Var.t0 != null) {
            u9Var.A0(null, true);
        }
        u9Var.N0.setViewHidden(true);
    }

    @Override // org.telegram.ui.Components.wi0
    public /* synthetic */ boolean o() {
        return true;
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public void onSuccess(Object obj) {
        ((g6.a) this.b).getClass();
        m8.a("com.google.android.gms.cast.MAP_CAST_STATUS_CODES_TO_CAST_REASON_CODES", (Bundle) obj);
    }

    @Override // c4.d
    public int p() {
        return 1;
    }

    @Override // org.telegram.ui.Components.wi0
    public /* synthetic */ boolean q() {
        return false;
    }

    @Override // og.n
    public void r() {
        ((l0) this.b).d.invalidate();
    }

    @Override // com.google.android.gms.common.api.internal.g0
    public boolean t() {
        return true;
    }

    @Override // com.google.android.gms.common.api.internal.g0
    public void u() {
        i0 i0Var = (i0) this.b;
        Iterator it = i0Var.f.values().iterator();
        while (it.hasNext()) {
            ((com.google.android.gms.common.api.c) it.next()).a();
        }
        i0Var.o.G = Collections.EMPTY_SET;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Type inference failed for: r7v4, types: [kd.j, rd.p] */
    @Override // ce.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object v(ce.d dVar, kd.c cVar) {
        ce.a aVar;
        int i7;
        Throwable th2;
        de.h hVar;
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
                    b7.h.b(obj);
                    de.h hVar2 = new de.h(dVar, aVar.getContext());
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
                        b7.h.b(obj);
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

    @Override // sg.t0
    public boolean y() {
        u9 u9Var = (u9) this.b;
        boolean z10 = u9Var.t0 == null;
        if (!z10) {
            u9Var.A0(null, true);
        }
        return z10;
    }

    public c(MediaInfo mediaInfo) {
        this.a = 21;
        o oVar = new o(mediaInfo, 0, true, Double.NaN, Double.POSITIVE_INFINITY, 0.0d, null, null);
        if (mediaInfo == null) {
            throw new IllegalArgumentException("media cannot be null.");
        }
        this.b = oVar;
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
        this.a = 21;
        this.b = new o(jSONObject);
    }

    public c(int i7) {
        this.a = i7;
        switch (i7) {
            case 8:
                this.b = new h();
                break;
            case 17:
                break;
            case 19:
                this.b = new x(10);
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
                I();
            }
        } catch (IOException e10) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Error creating file in no backup dir: " + e10.getMessage());
            }
        }
    }

    @Override // og.n
    public void G() {
    }

    @Override // org.telegram.ui.Components.qo0
    public /* synthetic */ void Q() {
    }

    @Override // sg.t0
    public void j() {
    }

    @Override // org.telegram.ui.Components.wi0
    public /* synthetic */ void z() {
    }

    @Override // og.n
    public void D(boolean z10) {
    }

    @Override // com.google.android.gms.common.api.internal.g0
    public void e(Bundle bundle) {
    }

    @Override // com.google.android.gms.common.api.internal.g0
    public void s(int i7) {
    }

    @Override // og.n
    public void w(boolean z10) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public c(rd.p pVar) {
        this.a = 9;
        this.b = (j) pVar;
    }

    @Override // com.google.android.gms.common.api.internal.g0
    public void l(n6.a aVar, e eVar, boolean z10) {
    }

    @Override // org.telegram.ui.Components.wi0
    public /* synthetic */ void x(Canvas canvas, RectF rectF, float f10, float f11, float f12, int i7, boolean z10) {
    }
}

package d6;

import a8.ja;
import a8.m1;
import a8.m8;
import a8.n1;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.ResultReceiver;
import android.support.v4.media.session.a0;
import android.text.TextUtils;
import android.util.Log;
import android.view.TextureView;
import android.view.View;
import android.widget.FrameLayout;
import androidx.biometric.p;
import androidx.biometric.t;
import androidx.biometric.v;
import androidx.fragment.app.f0;
import androidx.fragment.app.k0;
import bi.o2;
import ch.p0;
import ch.r;
import ci.z;
import ci.z0;
import com.android.billingclient.api.ProxyBillingActivityV2;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.cast.MediaInfo;
import com.google.android.gms.common.api.internal.c0;
import com.google.android.gms.common.api.internal.g0;
import com.google.android.gms.common.api.internal.i0;
import com.google.android.gms.common.api.internal.q;
import com.google.android.gms.internal.clearcut.d2;
import com.google.android.gms.internal.play_billing.u;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import di.c6;
import e2.q0;
import f6.o;
import fi.b4;
import fi.z8;
import gb.u0;
import h2.x;
import h9.e1;
import h9.g1;
import hi.d0;
import hi.d7;
import hi.e0;
import hi.ga;
import hi.h5;
import hi.ia;
import hi.j0;
import hi.sa;
import hi.u9;
import hi.wa;
import hi.x5;
import java.io.EOFException;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import og.n;
import org.json.JSONException;
import org.json.JSONObject;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.gj;
import org.telegram.messenger.ns;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.fo0;
import org.telegram.ui.Components.li0;
import org.telegram.ui.Components.u51;
import org.telegram.ui.Components.xb;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.br0;
import sg.t0;
import tg.r1;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes.dex */
public final class i implements SuccessContinuation, androidx.activity.result.b, ce.c, li0, z, g0, com.google.android.gms.internal.clearcut.g, c4.d, q, fo0, br0, OnSuccessListener, ib.b, g9.k, n, t0, wa, i6.a {
    public static i c;
    public final /* synthetic */ int a;
    public Object b;

    public /* synthetic */ i(int i7) {
        this.a = i7;
    }

    public static synchronized i V(Context context) {
        i a02;
        synchronized (i.class) {
            a02 = a0(context.getApplicationContext());
        }
        return a02;
    }

    public static synchronized i a0(Context context) {
        synchronized (i.class) {
            i iVar = c;
            if (iVar != null) {
                return iVar;
            }
            i iVar2 = new i(context);
            c = iVar2;
            return iVar2;
        }
    }

    @Override // hi.wa
    public void A(boolean z10) {
        x5 x5Var = (x5) this.b;
        if (x5Var.j()) {
            x5Var.F.getClass();
        }
        x5Var.x(-4, z10);
    }

    @Override // org.telegram.ui.Components.li0
    public /* synthetic */ boolean B() {
        return false;
    }

    @Override // com.google.android.gms.common.api.internal.g0
    public boolean C() {
        return true;
    }

    @Override // hi.wa
    public void D(float f10, int i7) {
        ArrayList arrayList;
        x5 x5Var = (x5) this.b;
        d7 d7Var = x5Var.d;
        if (d7Var == null || (arrayList = d7Var.T) == null || i7 < 0 || i7 >= arrayList.size()) {
            return;
        }
        ((d7) x5Var.d.T.get(i7)).P = f10;
    }

    @Override // com.google.android.gms.common.api.internal.g0
    public void E() {
        i0 i0Var = (i0) this.b;
        Iterator it = i0Var.f.values().iterator();
        while (it.hasNext()) {
            ((com.google.android.gms.common.api.c) it.next()).a();
        }
        i0Var.o.G = Collections.EMPTY_SET;
    }

    @Override // og.n
    public void F() {
        ((j0) this.b).d.invalidate();
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Type inference failed for: r7v4, types: [kd.j, rd.p] */
    @Override // ce.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object G(ce.d dVar, kd.c cVar) {
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
                    af.b.c(obj);
                    de.h hVar2 = new de.h(dVar, aVar.getContext());
                    try {
                        aVar.a = hVar2;
                        aVar.d = 1;
                        Object invoke = ((kd.j) this.b).invoke(hVar2, aVar);
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
                        af.b.c(obj);
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

    @Override // org.telegram.ui.br0
    public void G0(gj gjVar) {
        ((z8) ((b4) this.b).A1).f(true);
    }

    @Override // hi.wa
    public void H(float f10) {
        x5 x5Var = (x5) this.b;
        d7 d7Var = x5Var.d;
        if (d7Var == null) {
            return;
        }
        d7Var.P = f10;
        x5Var.c();
    }

    @Override // org.telegram.ui.br0
    public void I(gj gjVar) {
        ((z8) ((b4) this.b).A1).f(false);
    }

    @Override // org.telegram.ui.Components.li0
    public /* synthetic */ boolean L() {
        return false;
    }

    public void N(m6.n nVar, v vVar) {
        k0 k0Var = (k0) this.b;
        if (k0Var == null) {
            Log.e("BiometricPromptCompat", "Unable to start authentication. Client fragment manager was null.");
            return;
        }
        if (k0Var.P()) {
            Log.e("BiometricPromptCompat", "Unable to start authentication. Called after onSaveInstanceState().");
            return;
        }
        k0 k0Var2 = (k0) this.b;
        androidx.biometric.q qVar = (androidx.biometric.q) k0Var2.D("androidx.biometric.BiometricFragment");
        if (qVar == null) {
            qVar = new androidx.biometric.q();
            androidx.fragment.app.a aVar = new androidx.fragment.app.a(k0Var2);
            aVar.f(0, qVar, "androidx.biometric.BiometricFragment");
            aVar.e(true, true);
            k0Var2.A(true);
            k0Var2.E();
        }
        androidx.fragment.app.v k10 = qVar.k();
        if (k10 == null) {
            Log.e("BiometricFragment", "Not launching prompt. Client activity was null.");
            return;
        }
        androidx.biometric.z zVar = qVar.m0;
        zVar.f = nVar;
        int i7 = nVar.a;
        if (i7 == 0) {
            i7 = vVar != null ? 15 : 255;
        }
        if (Build.VERSION.SDK_INT < 30 && i7 == 15 && vVar == null) {
            zVar.g = n1.a();
        } else {
            zVar.g = vVar;
        }
        if (qVar.Q()) {
            qVar.m0.k = qVar.q(R.string.confirm_device_credential_password);
        } else {
            qVar.m0.k = null;
        }
        if (qVar.Q() && new a0(new t(k10)).c(ns.e4) != 0) {
            qVar.m0.n = true;
            qVar.S();
        } else if (qVar.m0.p) {
            qVar.l0.postDelayed(new p(qVar), 600L);
        } else {
            qVar.X();
        }
    }

    @Override // hi.wa
    public void O(long j3) {
        x5 x5Var = (x5) this.b;
        d7 d7Var = x5Var.d;
        if (d7Var == null) {
            return;
        }
        d7Var.r0 = j3;
        d7Var.j = true;
        x5Var.y(true);
    }

    public o P() {
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

    public int R(int[] iArr, int i7) {
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

    @Override // hi.wa
    public void S(boolean z10) {
        r1 r1Var;
        sa saVar = ((ga) ((x5) this.b)).D0;
        u9 u9Var = saVar.w1;
        if (u9Var == null) {
            return;
        }
        r1 r1Var2 = null;
        if (!z10 && (u9Var.getSelectedEntity() instanceof r1)) {
            saVar.w1.A0(null, true);
            return;
        }
        if (!z10 || (saVar.w1.getSelectedEntity() instanceof r1)) {
            return;
        }
        h5 h5Var = saVar.w1.B0;
        int i7 = 0;
        int i10 = 0;
        while (true) {
            if (i10 >= h5Var.getChildCount()) {
                r1Var = null;
                break;
            }
            View childAt = h5Var.getChildAt(i10);
            if (childAt instanceof r1) {
                r1Var = (r1) childAt;
                break;
            }
            i10++;
        }
        if (r1Var != null) {
            u9 u9Var2 = saVar.w1;
            h5 h5Var2 = u9Var2.B0;
            while (true) {
                if (i7 >= h5Var2.getChildCount()) {
                    break;
                }
                View childAt2 = h5Var2.getChildAt(i7);
                if (childAt2 instanceof r1) {
                    r1Var2 = (r1) childAt2;
                    break;
                }
                i7++;
            }
            u9Var2.A0(r1Var2, true);
        }
    }

    public StringBuilder T() {
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

    public q0 U(f3.p pVar, t3.g gVar, int i7) {
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
                    pVar.c(i13 - i14, i14, xVar.a);
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
                            pVar.c(10, z10, bArr2);
                            q0Var = new t3.h(gVar).c(i16, bArr2);
                        } else {
                            pVar.k(z10);
                        }
                        i10 += i16;
                    }
                } catch (EOFException unused) {
                }
            } while (i11 <= i7);
        }
        pVar.l();
        pVar.k(i10);
        return q0Var;
    }

    @Override // hi.wa
    public void X(float f10, int i7) {
        ArrayList arrayList;
        x5 x5Var = (x5) this.b;
        d7 d7Var = x5Var.d;
        if (d7Var == null || (arrayList = d7Var.T) == null || i7 < 0 || i7 >= arrayList.size()) {
            return;
        }
        ((d7) x5Var.d.T.get(i7)).V = f10;
    }

    @Override // hi.wa
    public void Y(float f10) {
        x5 x5Var = (x5) this.b;
        d7 d7Var = x5Var.d;
        if (d7Var == null) {
            return;
        }
        d7Var.F = f10;
        d7Var.j = true;
        x5Var.w(true);
    }

    public synchronized void Z() {
        synchronized (this) {
            try {
                b bVar = (b) this.b;
                ReentrantLock reentrantLock = bVar.a;
                reentrantLock.lock();
                try {
                    bVar.b.edit().clear().apply();
                } finally {
                    reentrantLock.unlock();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.google.android.gms.common.api.internal.g0
    public void a() {
        i0 i0Var = (i0) this.b;
        Lock lock = i0Var.a;
        lock.lock();
        try {
            i0Var.m = new c0(i0Var, i0Var.j, i0Var.k, i0Var.d, i0Var.l, lock, i0Var.c);
            i0Var.m.E();
            i0Var.b.signalAll();
        } finally {
            i0Var.a.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.internal.q
    public void accept(Object obj, Object obj2) {
        o8.c cVar = (o8.c) this.b;
        d8.d dVar = new d8.d(1, (TaskCompletionSource) obj2);
        d8.c cVar2 = (d8.c) ((d8.f) obj).n();
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

    @Override // com.google.android.gms.common.api.internal.g0
    public com.google.android.gms.common.api.internal.d b(com.google.android.gms.common.api.internal.d dVar) {
        throw new IllegalStateException("GoogleApiClient is not connected yet.");
    }

    @Override // c4.d
    public int d(long j3) {
        return j3 < 0 ? 0 : -1;
    }

    @Override // hi.wa
    public void e(int i7) {
        e0 e0Var = ((x5) this.b).F;
        if (e0Var != null) {
            ArrayList arrayList = e0Var.h;
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                d0 d0Var = (d0) obj;
                if (d0Var.a == i7) {
                    d0Var.b.e(true, 1.0f);
                    e0Var.invalidate();
                    return;
                }
            }
        }
    }

    @Override // androidx.activity.result.b
    public void f(Object obj) {
        switch (this.a) {
            case 3:
                Map map = (Map) obj;
                androidx.fragment.app.j0 j0Var = (androidx.fragment.app.j0) this.b;
                ArrayList arrayList = new ArrayList(map.values());
                int[] iArr = new int[arrayList.size()];
                for (int i7 = 0; i7 < arrayList.size(); i7++) {
                    iArr[i7] = ((Boolean) arrayList.get(i7)).booleanValue() ? 0 : -1;
                }
                f0 f0Var = (f0) j0Var.F.pollFirst();
                if (f0Var == null) {
                    Log.w("FragmentManager", "No permissions were requested for " + this);
                    break;
                } else {
                    String str = f0Var.a;
                    if (j0Var.c.o(str) == null) {
                        Log.w("FragmentManager", "Permission request result delivered for unknown Fragment " + str);
                        break;
                    }
                }
                break;
            default:
                ProxyBillingActivityV2 proxyBillingActivityV2 = (ProxyBillingActivityV2) this.b;
                androidx.activity.result.a aVar = (androidx.activity.result.a) obj;
                proxyBillingActivityV2.getClass();
                Intent intent = aVar.b;
                int i10 = u.e("ProxyBillingActivityV2", intent).a;
                ResultReceiver resultReceiver = proxyBillingActivityV2.N;
                if (resultReceiver != null) {
                    resultReceiver.send(i10, intent == null ? null : intent.getExtras());
                }
                int i11 = aVar.a;
                if (i11 != -1 || i10 != 0) {
                    u.h("ProxyBillingActivityV2", "Alternative billing only dialog finished with resultCode " + i11 + " and billing's responseCode: " + i10);
                }
                proxyBillingActivityV2.finish();
                break;
        }
    }

    @Override // hi.wa
    public void f0(float f10) {
        x5 x5Var = (x5) this.b;
        d7 d7Var = x5Var.d;
        if (d7Var == null) {
            return;
        }
        d7Var.E = f10;
        d7Var.j = true;
        x5Var.w(true);
    }

    @Override // ci.z
    public void g(ci.a0 a0Var) {
        ci.i0 i0Var = (ci.i0) this.b;
        FrameLayout frameLayout = i0Var.f;
        if (frameLayout != null) {
            frameLayout.removeView(a0Var);
        }
        if (i0Var.G == a0Var) {
            i0Var.G = null;
        }
        z0 z0Var = i0Var.d;
        if (z0Var != null) {
            z0Var.setScanHidden(false);
        }
    }

    @Override // org.telegram.ui.br0
    public /* synthetic */ TextureView g0() {
        return null;
    }

    @Override // fd.a
    public Object get() {
        return new gb.k0((u0) ((ib.c) this.b).get());
    }

    @Override // org.telegram.ui.Components.li0
    public void h(View view, p0 p0Var, boolean z10, boolean z11) {
        r rVar = (r) this.b;
        rVar.a.Eb(null, rVar.e, rVar.b, view, 0.0f, 0.0f, p0Var, false, z10, z11, false);
        org.telegram.messenger.g0.h3(new a3.f(this, 28));
    }

    @Override // sg.t0
    public void h0() {
        u9 u9Var = (u9) this.b;
        u9Var.n0.a.C();
        u9Var.N0.setViewHidden(false);
    }

    @Override // c4.d
    public long i(int i7) {
        ja.f(i7 == 0);
        return 0L;
    }

    @Override // hi.wa
    public void i0(float f10, int i7) {
        ArrayList arrayList;
        x5 x5Var = (x5) this.b;
        d7 d7Var = x5Var.d;
        if (d7Var == null || (arrayList = d7Var.T) == null || i7 < 0 || i7 >= arrayList.size()) {
            return;
        }
        ((d7) x5Var.d.T.get(i7)).W = f10;
    }

    @Override // ci.z
    public void j(String str) {
        ci.i0 i0Var = (ci.i0) this.b;
        if (i0Var.getParentActivity() != null) {
            vf.c.t(i0Var.getParentActivity(), str);
        }
    }

    @Override // hi.wa
    public void j0(float f10) {
        d7 d7Var = ((x5) this.b).d;
        if (d7Var == null) {
            return;
        }
        d7Var.a0 = f10;
        d7Var.j = true;
    }

    @Override // hi.wa
    public void k(float f10) {
        x5 x5Var = (x5) this.b;
        d7 d7Var = x5Var.d;
        if (d7Var == null) {
            return;
        }
        d7Var.u0 = f10;
        d7Var.j = true;
        x5Var.c();
    }

    @Override // hi.wa
    public void k0() {
        ((x5) this.b).q(null);
    }

    @Override // hi.wa
    public void n(float f10) {
        x5 x5Var = (x5) this.b;
        d7 d7Var = x5Var.d;
        if (d7Var == null) {
            return;
        }
        d7Var.G = f10;
        d7Var.j = true;
        x5Var.c();
    }

    @Override // sg.t0
    public void o() {
        o2 o2Var = ((u9) this.b).z0;
        if (o2Var != null) {
            o2Var.invalidate();
        }
    }

    @Override // hi.wa
    public void o0(float f10) {
        x5 x5Var = (x5) this.b;
        d7 d7Var = x5Var.d;
        if (d7Var == null) {
            return;
        }
        d7Var.t0 = f10;
        d7Var.j = true;
        x5Var.y(true);
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public void onSuccess(Object obj) {
        ((g6.a) this.b).getClass();
        m8.a("com.google.android.gms.cast.MAP_CAST_STATUS_CODES_TO_CAST_REASON_CODES", (Bundle) obj);
    }

    @Override // hi.wa
    public void p(long j3, boolean z10) {
        x5 x5Var = (x5) this.b;
        if (!z10) {
            x5Var.m(j3);
            return;
        }
        u51 u51Var = x5Var.e;
        if (u51Var != null) {
            u51Var.q0(j3, true);
            return;
        }
        if (x5Var.j()) {
            x5Var.F.m(j3, true);
            return;
        }
        u51 u51Var2 = x5Var.E;
        if (u51Var2 != null) {
            u51Var2.q0(j3, false);
        }
    }

    @Override // c4.d
    public List q(long j3) {
        return j3 >= 0 ? (List) this.b : Collections.EMPTY_LIST;
    }

    @Override // sg.t0
    public void q0() {
        u9 u9Var = (u9) this.b;
        if (u9Var.t0 != null) {
            u9Var.A0(null, true);
        }
        u9Var.N0.setViewHidden(true);
    }

    @Override // org.telegram.ui.Components.li0
    public /* synthetic */ boolean r() {
        return true;
    }

    @Override // hi.wa
    public void s() {
        x5 x5Var = (x5) this.b;
        x5Var.s(null, null, true);
        sa saVar = ((ga) x5Var).D0;
        ga gaVar = saVar.Y0;
        if (gaVar != null) {
            gaVar.s(null, null, true);
        }
        u9 u9Var = saVar.w1;
        if (u9Var != null) {
            u9Var.n0();
        }
        ia iaVar = saVar.d1;
        if (iaVar != null) {
            iaVar.setHasRoundVideo(false);
        }
        d7 d7Var = saVar.L1;
        if (d7Var != null) {
            File file = d7Var.o0;
            if (file != null) {
                try {
                    file.delete();
                } catch (Exception unused) {
                }
                saVar.L1.o0 = null;
            }
            if (saVar.L1.p0 != null) {
                try {
                    new File(saVar.L1.p0).delete();
                } catch (Exception unused2) {
                }
                saVar.L1.p0 = null;
            }
        }
    }

    @Override // hi.wa
    public void s0(int i7, long j3) {
        ArrayList arrayList;
        x5 x5Var = (x5) this.b;
        d7 d7Var = x5Var.d;
        if (d7Var == null || (arrayList = d7Var.T) == null || i7 < 0 || i7 >= arrayList.size()) {
            return;
        }
        ((d7) x5Var.d.T.get(i7)).X = j3;
    }

    @Override // sg.t0
    public void t() {
        u9 u9Var = (u9) this.b;
        if (u9Var.M0) {
            u9Var.M0 = false;
        } else {
            u9Var.U0.b(1);
            u9Var.w((sg.h) sg.h.a.get(0));
        }
    }

    @Override // hi.wa
    public void t0(long j3) {
        x5 x5Var = (x5) this.b;
        d7 d7Var = x5Var.d;
        if (d7Var == null) {
            return;
        }
        d7Var.D = j3;
        d7Var.j = true;
        x5Var.w(true);
    }

    @Override // com.google.android.gms.tasks.SuccessContinuation
    public Task then(Object obj) {
        ia.b bVar = (ia.b) obj;
        q4.q qVar = (q4.q) this.b;
        if (bVar == null) {
            Log.w("FirebaseCrashlytics", "Received null app settings at app startup. Cannot send cached reports", null);
            return Tasks.forResult(null);
        }
        aa.p pVar = (aa.p) qVar.c;
        aa.p pVar2 = (aa.p) qVar.c;
        aa.p.b(pVar);
        pVar2.m.h(null, pVar2.e.a);
        pVar2.q.trySetResult(null);
        return Tasks.forResult(null);
    }

    @Override // c4.d
    public int u() {
        return 1;
    }

    @Override // hi.wa
    public void v(boolean z10, float f10) {
        x5 x5Var = (x5) this.b;
        d7 d7Var = x5Var.d;
        if (d7Var == null) {
            return;
        }
        d7Var.Z = f10;
        d7Var.j = true;
        u51 u51Var = x5Var.e;
        if (u51Var == null || u51Var.U() == -9223372036854775807L) {
            return;
        }
        x5Var.m((long) (f10 * x5Var.e.U()));
    }

    @Override // hi.wa
    public void w(float f10) {
        x5 x5Var = (x5) this.b;
        d7 d7Var = x5Var.d;
        if (d7Var == null) {
            return;
        }
        d7Var.s0 = f10;
        d7Var.j = true;
        x5Var.y(true);
    }

    @Override // i6.a
    public void x(Bitmap bitmap) {
        ((i6.h) this.b).e(3, bitmap);
    }

    @Override // org.telegram.ui.Components.fo0
    public void x0() {
        xb k10 = ((c6) this.b).k().k(false);
        k10.t = true;
        k10.j();
    }

    @Override // sg.t0
    public boolean z() {
        u9 u9Var = (u9) this.b;
        boolean z10 = u9Var.t0 == null;
        if (!z10) {
            u9Var.A0(null, true);
        }
        return z10;
    }

    @Override // com.google.android.gms.internal.clearcut.g
    public Object zzp() {
        Object obj;
        boolean z10;
        String str = (String) this.b;
        ContentResolver contentResolver = com.google.android.gms.internal.clearcut.d.g.getContentResolver();
        Uri uri = d2.a;
        synchronized (d2.class) {
            d2.c(contentResolver);
            obj = d2.k;
        }
        HashMap hashMap = d2.g;
        Boolean bool = Boolean.FALSE;
        Boolean bool2 = (Boolean) d2.a(hashMap, str, bool);
        if (bool2 != null) {
            z10 = bool2.booleanValue();
        } else {
            String b10 = d2.b(contentResolver, str);
            boolean z11 = false;
            if (b10 != null && !b10.equals("")) {
                if (d2.c.matcher(b10).matches()) {
                    bool = Boolean.TRUE;
                    z11 = true;
                } else if (!d2.d.matcher(b10).matches()) {
                    Log.w("Gservices", r.b.l("attempt to read gservices key ", str, " (value \"", b10, "\") as boolean"));
                }
                d2.e(obj, hashMap, str, bool);
                z10 = z11;
            }
            bool = bool2;
            d2.e(obj, hashMap, str, bool);
            z10 = z11;
        }
        return Boolean.valueOf(z10);
    }

    public /* synthetic */ i(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    public i(Context context) {
        String e10;
        this.a = 0;
        b a10 = b.a(context);
        this.b = a10;
        a10.b();
        String e11 = a10.e("defaultGoogleSignInAccount");
        if (TextUtils.isEmpty(e11) || (e10 = a10.e(b.f("googleSignInOptions", e11))) == null) {
            return;
        }
        try {
            GoogleSignInOptions.b(e10);
        } catch (JSONException unused) {
        }
    }

    public i(MediaInfo mediaInfo) {
        this.a = 18;
        o oVar = new o(mediaInfo, 0, true, Double.NaN, Double.POSITIVE_INFINITY, 0.0d, null, null);
        if (mediaInfo != null) {
            this.b = oVar;
            return;
        }
        throw new IllegalArgumentException("media cannot be null.");
    }

    public i(JSONObject jSONObject) {
        this.a = 18;
        this.b = new o(jSONObject);
    }

    public i() {
        this.a = 16;
        this.b = new x(10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public i(rd.p pVar) {
        this.a = 5;
        this.b = (kd.j) pVar;
    }

    public i(LaunchActivity launchActivity, Executor executor, m1 m1Var) {
        this.a = 2;
        if (launchActivity == null) {
            throw new IllegalArgumentException("FragmentActivity must not be null.");
        }
        if (executor != null) {
            k0 s5 = launchActivity.s();
            androidx.biometric.z zVar = (androidx.biometric.z) new a0(launchActivity).j(androidx.biometric.z.class);
            this.b = s5;
            zVar.d = executor;
            zVar.e = m1Var;
            return;
        }
        throw new IllegalArgumentException("Executor must not be null.");
    }

    @Override // og.n
    public void D0() {
    }

    @Override // org.telegram.ui.Components.li0
    public /* synthetic */ void K() {
    }

    @Override // org.telegram.ui.Components.fo0
    public /* synthetic */ void W() {
    }

    @Override // sg.t0
    public void m() {
    }

    @Override // og.n
    public void M(boolean z10) {
    }

    @Override // com.google.android.gms.common.api.internal.g0
    public void c(Bundle bundle) {
    }

    @Override // og.n
    public void m0(boolean z10) {
    }

    @Override // com.google.android.gms.common.api.internal.g0
    public void y(int i7) {
    }

    @Override // com.google.android.gms.common.api.internal.g0
    public void l(n6.a aVar, com.google.android.gms.common.api.e eVar, boolean z10) {
    }

    @Override // org.telegram.ui.Components.li0
    public /* synthetic */ void J(Canvas canvas, RectF rectF, float f10, float f11, float f12, int i7, boolean z10) {
    }
}

package android.support.v4.media;

import a0.h;
import a1.g;
import ai.x2;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
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
import android.util.SparseIntArray;
import android.view.TextureView;
import android.view.View;
import android.webkit.WebView;
import android.widget.FrameLayout;
import androidx.biometric.q;
import androidx.biometric.t;
import androidx.biometric.v;
import androidx.fragment.app.f0;
import androidx.fragment.app.k0;
import b8.kg;
import b8.l0;
import b8.m0;
import b8.pd;
import b8.zb;
import bi.a1;
import bi.j0;
import bi.z;
import c6.i;
import c8.f;
import ci.d1;
import ci.wb;
import com.android.billingclient.api.ProxyBillingActivityV2;
import com.google.android.gms.common.api.internal.b0;
import com.google.android.gms.common.api.internal.e0;
import com.google.android.gms.common.api.internal.g0;
import com.google.android.gms.common.api.internal.p;
import com.google.android.gms.internal.cast.b1;
import com.google.android.gms.internal.cast.b2;
import com.google.android.gms.internal.cast.n0;
import com.google.android.gms.internal.play_billing.r;
import com.google.android.gms.internal.play_billing.u;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import db.u0;
import e3.j;
import ei.i9;
import ei.j4;
import ei.p7;
import gi.d0;
import gi.f7;
import gi.h5;
import gi.ja;
import gi.la;
import gi.va;
import gi.x9;
import gi.y5;
import gi.za;
import j$.util.Objects;
import java.io.File;
import java.io.FileInputStream;
import java.lang.reflect.InvocationHandler;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.Lock;
import k2.p1;
import l6.n;
import n5.s;
import org.chromium.support_lib_boundary.JsReplyProxyBoundaryInterface;
import org.chromium.support_lib_boundary.WebMessageBoundaryInterface;
import org.chromium.support_lib_boundary.WebMessageListenerBoundaryInterface;
import org.chromium.support_lib_boundary.WebMessagePayloadBoundaryInterface;
import org.chromium.support_lib_boundary.WebMessagePortBoundaryInterface;
import org.json.JSONException;
import org.json.JSONObject;
import org.telegram.messenger.a8;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.hs;
import org.telegram.messenger.zi;
import org.telegram.ui.ActionBar.e3;
import org.telegram.ui.Components.dt0;
import org.telegram.ui.Components.ki0;
import org.telegram.ui.Components.m51;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.k00;
import org.telegram.ui.tq0;
import org.telegram.ui.web.w0;
import org.telegram.ui.web.y;
import p6.m;
import p7.k;
import p7.m1;
import p7.n1;
import pg.l;
import tg.t0;
import ug.r1;
import yb.e;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class c implements androidx.activity.result.b, z, b4.d, p, dt0, e0, WebMessageListenerBoundaryInterface, fb.b, ki0, tq0, OnSuccessListener, OnCompleteListener, l, t0, za {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ c(i iVar) {
        this.a = 18;
        this.b = (r) iVar.b;
    }

    @Override // com.google.android.gms.common.api.internal.e0
    public boolean B() {
        return true;
    }

    @Override // gi.za
    public void C(boolean z10) {
        y5 y5Var = (y5) this.b;
        if (y5Var.j()) {
            y5Var.F.getClass();
        }
        y5Var.x(-4, z10);
    }

    @Override // org.telegram.ui.Components.dt0
    public void F(boolean z10) {
        wb wbVar = (wb) this.b;
        qe.a aVar = wbVar.Z;
        if (aVar != null) {
            aVar.a(z10, true);
        }
        k00 k00Var = wbVar.s;
        if (k00Var != null) {
            k00Var.invalidate();
        }
    }

    @Override // org.telegram.ui.tq0
    public void G(zi ziVar) {
        ((i9) ((j4) this.b).A1).f(false);
    }

    @Override // gi.za
    public void H(float f10, int i3) {
        ArrayList arrayList;
        y5 y5Var = (y5) this.b;
        f7 f7Var = y5Var.d;
        if (f7Var == null || (arrayList = f7Var.T) == null || i3 < 0 || i3 >= arrayList.size()) {
            return;
        }
        ((f7) y5Var.d.T.get(i3)).P = f10;
    }

    @Override // gi.za
    public void I(float f10) {
        y5 y5Var = (y5) this.b;
        f7 f7Var = y5Var.d;
        if (f7Var == null) {
            return;
        }
        f7Var.P = f10;
        y5Var.c();
    }

    @Override // org.telegram.ui.tq0
    public void I0(zi ziVar) {
        ((i9) ((j4) this.b).A1).f(true);
    }

    @Override // gi.za
    public void K(long j10) {
        y5 y5Var = (y5) this.b;
        f7 f7Var = y5Var.d;
        if (f7Var == null) {
            return;
        }
        f7Var.r0 = j10;
        f7Var.j = true;
        y5Var.y(true);
    }

    @Override // com.google.android.gms.common.api.internal.e0
    public void L() {
        g0 g0Var = (g0) this.b;
        Iterator it = g0Var.f.values().iterator();
        while (it.hasNext()) {
            ((com.google.android.gms.common.api.c) it.next()).a();
        }
        g0Var.o.G = Collections.EMPTY_SET;
    }

    @Override // gi.za
    public void M(boolean z10) {
        r1 r1Var;
        va vaVar = ((ja) ((y5) this.b)).D0;
        x9 x9Var = vaVar.w1;
        if (x9Var == null) {
            return;
        }
        r1 r1Var2 = null;
        if (!z10 && (x9Var.getSelectedEntity() instanceof r1)) {
            vaVar.w1.A0(null, true);
            return;
        }
        if (!z10 || (vaVar.w1.getSelectedEntity() instanceof r1)) {
            return;
        }
        h5 h5Var = vaVar.w1.B0;
        int i3 = 0;
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
            x9 x9Var2 = vaVar.w1;
            h5 h5Var2 = x9Var2.B0;
            while (true) {
                if (i3 >= h5Var2.getChildCount()) {
                    break;
                }
                View childAt2 = h5Var2.getChildAt(i3);
                if (childAt2 instanceof r1) {
                    r1Var2 = (r1) childAt2;
                    break;
                }
                i3++;
            }
            x9Var2.A0(r1Var2, true);
        }
    }

    @Override // tg.t0
    public void N() {
        x9 x9Var = (x9) this.b;
        x9Var.n0.a.o();
        x9Var.N0.setViewHidden(false);
    }

    @Override // org.telegram.ui.Components.ki0
    public /* synthetic */ boolean O() {
        return false;
    }

    @Override // gi.za
    public void P(float f10, int i3) {
        ArrayList arrayList;
        y5 y5Var = (y5) this.b;
        f7 f7Var = y5Var.d;
        if (f7Var == null || (arrayList = f7Var.T) == null || i3 < 0 || i3 >= arrayList.size()) {
            return;
        }
        ((f7) y5Var.d.T.get(i3)).V = f10;
    }

    @Override // gi.za
    public void R(float f10) {
        y5 y5Var = (y5) this.b;
        f7 f7Var = y5Var.d;
        if (f7Var == null) {
            return;
        }
        f7Var.F = f10;
        f7Var.j = true;
        y5Var.w(true);
    }

    @Override // gi.za
    public void T(float f10) {
        y5 y5Var = (y5) this.b;
        f7 f7Var = y5Var.d;
        if (f7Var == null) {
            return;
        }
        f7Var.E = f10;
        f7Var.j = true;
        y5Var.w(true);
    }

    public void U(j jVar) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.b;
        long[] jArr = jVar.e;
        if (jArr.length <= 0 || linkedHashMap.containsKey(Long.valueOf(jArr[0]))) {
            return;
        }
        linkedHashMap.put(Long.valueOf(jVar.e[0]), jVar);
    }

    @Override // gi.za
    public void V(float f10, int i3) {
        ArrayList arrayList;
        y5 y5Var = (y5) this.b;
        f7 f7Var = y5Var.d;
        if (f7Var == null || (arrayList = f7Var.T) == null || i3 < 0 || i3 >= arrayList.size()) {
            return;
        }
        ((f7) y5Var.d.T.get(i3)).W = f10;
    }

    @Override // gi.za
    public void W(float f10) {
        f7 f7Var = ((y5) this.b).d;
        if (f7Var == null) {
            return;
        }
        f7Var.a0 = f10;
        f7Var.j = true;
    }

    @Override // gi.za
    public void X() {
        ((y5) this.b).q(null);
    }

    public void Y(n nVar, v vVar) {
        Object obj = this.b;
        k0 k0Var = (k0) obj;
        if (k0Var == null) {
            Log.e("BiometricPromptCompat", "Unable to start authentication. Client fragment manager was null.");
            return;
        }
        if (k0Var.P()) {
            Log.e("BiometricPromptCompat", "Unable to start authentication. Called after onSaveInstanceState().");
            return;
        }
        k0 k0Var2 = (k0) obj;
        q qVar = (q) k0Var2.D("androidx.biometric.BiometricFragment");
        if (qVar == null) {
            qVar = new q();
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
        int i3 = nVar.a;
        if (i3 == 0) {
            i3 = vVar != null ? 15 : 255;
        }
        if (Build.VERSION.SDK_INT < 30 && i3 == 15 && vVar == null) {
            zVar.g = m0.a();
        } else {
            zVar.g = vVar;
        }
        if (qVar.Q()) {
            qVar.m0.k = qVar.q(R.string.confirm_device_credential_password);
        } else {
            qVar.m0.k = null;
        }
        if (qVar.Q() && new a0(new t(k10, 0)).b(hs.e4) != 0) {
            qVar.m0.n = true;
            qVar.S();
        } else if (qVar.m0.p) {
            qVar.l0.postDelayed(new androidx.biometric.p(qVar), 600L);
        } else {
            qVar.X();
        }
    }

    @Override // tg.t0
    public void Z() {
        x9 x9Var = (x9) this.b;
        if (x9Var.t0 != null) {
            x9Var.A0(null, true);
        }
        x9Var.N0.setViewHidden(true);
    }

    @Override // com.google.android.gms.common.api.internal.e0
    public void a() {
        g0 g0Var = (g0) this.b;
        Lock lock = g0Var.a;
        lock.lock();
        try {
            g0Var.m = new b0(g0Var, g0Var.j, g0Var.k, g0Var.d, g0Var.l, lock, g0Var.c);
            g0Var.m.L();
            g0Var.b.signalAll();
        } finally {
            g0Var.a.unlock();
        }
    }

    @Override // gi.za
    public void a0(float f10) {
        y5 y5Var = (y5) this.b;
        f7 f7Var = y5Var.d;
        if (f7Var == null) {
            return;
        }
        f7Var.t0 = f10;
        f7Var.j = true;
        y5Var.y(true);
    }

    @Override // com.google.android.gms.common.api.internal.p
    public void accept(Object obj, Object obj2) {
        int i3 = this.a;
        Object obj3 = this.b;
        switch (i3) {
            case 7:
                c8.d dVar = new c8.d(1, (TaskCompletionSource) obj2);
                c8.c cVar = (c8.c) ((f) obj).m();
                Parcel obtain = Parcel.obtain();
                obtain.writeInterfaceToken("com.google.android.gms.recaptchabase.internal.IRecaptchaBaseService");
                int i10 = c8.a.a;
                obtain.writeStrongBinder(dVar);
                obtain.writeInt(1);
                ((n8.c) obj3).writeToParcel(obtain, 0);
                cVar.H0(obtain, 1);
                return;
            default:
                d7.b bVar = new d7.b(0, (TaskCompletionSource) obj2);
                n1 n1Var = (n1) ((m1) obj).m();
                Parcel obtain2 = Parcel.obtain();
                obtain2.writeInterfaceToken(n1Var.b);
                int i11 = k.a;
                obtain2.writeStrongBinder(bVar);
                obtain2.writeInt(1);
                ((e7.v) obj3).writeToParcel(obtain2, 0);
                Parcel obtain3 = Parcel.obtain();
                try {
                    n1Var.a.transact(1, obtain2, obtain3, 0);
                    obtain3.readException();
                    return;
                } finally {
                    obtain2.recycle();
                    obtain3.recycle();
                }
        }
    }

    @Override // com.google.android.gms.common.api.internal.e0
    public com.google.android.gms.common.api.internal.d b(com.google.android.gms.common.api.internal.d dVar) {
        throw new IllegalStateException("GoogleApiClient is not connected yet.");
    }

    @Override // gi.za
    public void b0(int i3, long j10) {
        ArrayList arrayList;
        y5 y5Var = (y5) this.b;
        f7 f7Var = y5Var.d;
        if (f7Var == null || (arrayList = f7Var.T) == null || i3 < 0 || i3 >= arrayList.size()) {
            return;
        }
        ((f7) y5Var.d.T.get(i3)).X = j10;
    }

    @Override // gi.za
    public void c(int i3) {
        gi.e0 e0Var = ((y5) this.b).F;
        if (e0Var != null) {
            ArrayList arrayList = e0Var.h;
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                d0 d0Var = (d0) obj;
                if (d0Var.a == i3) {
                    d0Var.b.e(true, 1.0f);
                    e0Var.invalidate();
                    return;
                }
            }
        }
    }

    public float c0(ec.c cVar, ec.c cVar2) {
        int i3 = (int) cVar.a;
        int i10 = (int) cVar.b;
        int i11 = (int) cVar2.a;
        int i12 = (int) cVar2.b;
        float p02 = p0(i3, i10, i11, i12);
        float p03 = p0((int) cVar2.a, i12, (int) cVar.a, i10);
        return Float.isNaN(p02) ? p03 / 7.0f : Float.isNaN(p03) ? p02 / 7.0f : (p02 + p03) / 14.0f;
    }

    @Override // b4.d
    public int d(long j10) {
        return j10 < 0 ? 0 : -1;
    }

    @Override // gi.za
    public void d0(long j10) {
        y5 y5Var = (y5) this.b;
        f7 f7Var = y5Var.d;
        if (f7Var == null) {
            return;
        }
        f7Var.D = j10;
        f7Var.j = true;
        y5Var.w(true);
    }

    @Override // bi.z
    public void e(bi.a0 a0Var) {
        j0 j0Var = (j0) this.b;
        FrameLayout frameLayout = j0Var.f;
        if (frameLayout != null) {
            frameLayout.removeView(a0Var);
        }
        if (j0Var.G == a0Var) {
            j0Var.G = null;
        }
        a1 a1Var = j0Var.d;
        if (a1Var != null) {
            a1Var.setScanHidden(false);
        }
    }

    public int e0(int[] iArr, int i3) {
        int[] iArr2;
        int[] iArr3;
        int i10;
        int i11;
        bc.a aVar = (bc.a) this.b;
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
        int[] iArr5 = new int[i3];
        boolean z10 = true;
        for (int i14 = 0; i14 < i3; i14++) {
            int i15 = aVar.a[aVar.g + i14];
            if (i15 == 0) {
                i11 = iArr2[iArr2.length - 1];
            } else {
                if (i15 == 1) {
                    i10 = 0;
                    for (int i16 : iArr2) {
                        bc.a aVar2 = bc.a.h;
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
            iArr5[(i3 - 1) - i14] = i11;
            if (i11 != 0) {
                z10 = false;
            }
        }
        if (z10) {
            return 0;
        }
        bc.b bVar = new bc.b(aVar, iArr5);
        bc.b a10 = aVar.a(i3, 1);
        bc.b bVar2 = aVar.c;
        if (a10.d() >= bVar.d()) {
            a10 = bVar;
            bVar = a10;
        }
        bc.b bVar3 = aVar.d;
        bc.b bVar4 = a10;
        bc.b bVar5 = bVar;
        bc.b bVar6 = bVar4;
        bc.b bVar7 = bVar2;
        while (bVar6.d() * 2 >= i3) {
            if (bVar6.e()) {
                throw new bc.c("r_{i-1} was zero");
            }
            int b10 = aVar.b(bVar6.c(bVar6.d()));
            bc.b bVar8 = bVar2;
            while (bVar5.d() >= bVar6.d() && !bVar5.e()) {
                int d = bVar5.d() - bVar6.d();
                int c2 = aVar.c(bVar5.c(bVar5.d()), b10);
                bVar8 = bVar8.a(aVar.a(d, c2));
                bVar5 = bVar5.a(bVar6.h(d, c2));
            }
            bc.b a11 = bVar8.g(bVar3).a(bVar7);
            if (bVar5.d() >= bVar6.d()) {
                throw new IllegalStateException("Division algorithm failed to reduce polynomial? r: " + bVar5 + ", rLast: " + bVar6);
            }
            bc.b bVar9 = bVar5;
            bVar5 = bVar6;
            bVar6 = bVar9;
            bVar7 = bVar3;
            bVar3 = a11;
        }
        int c10 = bVar3.c(0);
        if (c10 == 0) {
            throw new bc.c("sigmaTilde(0) was zero");
        }
        int b11 = aVar.b(c10);
        bc.b[] bVarArr = {bVar3.f(b11), bVar6.f(b11)};
        bc.b bVar10 = bVarArr[0];
        bc.b bVar11 = bVarArr[1];
        int d10 = bVar10.d();
        if (d10 == 1) {
            iArr3 = new int[]{bVar10.c(1)};
        } else {
            int[] iArr6 = new int[d10];
            int i18 = 0;
            for (int i19 = 1; i19 < aVar.e && i18 < d10; i19++) {
                if (bVar10.b(i19) == 0) {
                    iArr6[i18] = aVar.b(i19);
                    i18++;
                }
            }
            if (i18 != d10) {
                throw new bc.c("Error locator degree does not match number of roots");
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
                    int c11 = aVar.c(iArr3[i22], b12);
                    i21 = aVar.c(i21, (c11 & 1) == 0 ? c11 | 1 : c11 & (-2));
                }
            }
            int c12 = aVar.c(bVar11.b(b12), aVar.b(i21));
            iArr7[i20] = c12;
            if (aVar.g != 0) {
                iArr7[i20] = aVar.c(c12, b12);
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
                throw new bc.c("Bad error location");
            }
            iArr[i25] = iArr[i25] ^ iArr7[i23];
        }
        return iArr3.length;
    }

    public ec.a f0(float f10, float f11, int i3, int i10) {
        ec.a b10;
        ec.a b11;
        int i11 = (int) (f11 * f10);
        int max = Math.max(0, i3 - i11);
        zb.b bVar = (zb.b) this.b;
        int min = Math.min(bVar.a - 1, i3 + i11) - max;
        float f12 = 3.0f * f10;
        if (min < f12) {
            throw e.a();
        }
        int max2 = Math.max(0, i10 - i11);
        int min2 = Math.min(bVar.b - 1, i10 + i11) - max2;
        if (min2 < f12) {
            throw e.a();
        }
        zb.b bVar2 = (zb.b) this.b;
        ec.b bVar3 = new ec.b(bVar2, max, max2, min, min2, f10);
        int i12 = bVar3.e;
        int i13 = bVar3.c;
        int i14 = i12 + i13;
        int i15 = bVar3.f;
        int i16 = (i15 / 2) + bVar3.d;
        int[] iArr = new int[3];
        for (int i17 = 0; i17 < i15; i17++) {
            int i18 = ((i17 & 1) == 0 ? (i17 + 1) / 2 : -((i17 + 1) / 2)) + i16;
            iArr[0] = 0;
            iArr[1] = 0;
            iArr[2] = 0;
            int i19 = i13;
            while (i19 < i14 && !bVar2.b(i19, i18)) {
                i19++;
            }
            int i20 = 0;
            while (i19 < i14) {
                if (!bVar2.b(i19, i18)) {
                    if (i20 == 1) {
                        i20++;
                    }
                    iArr[i20] = iArr[i20] + 1;
                } else if (i20 == 1) {
                    iArr[1] = iArr[1] + 1;
                } else if (i20 != 2) {
                    i20++;
                    iArr[i20] = iArr[i20] + 1;
                } else {
                    if (bVar3.a(iArr) && (b11 = bVar3.b(i18, i19, iArr)) != null) {
                        return b11;
                    }
                    iArr[0] = iArr[2];
                    iArr[1] = 1;
                    iArr[2] = 0;
                    i20 = 1;
                }
                i19++;
            }
            if (bVar3.a(iArr) && (b10 = bVar3.b(i18, i14, iArr)) != null) {
                return b10;
            }
        }
        ArrayList arrayList = bVar3.b;
        if (arrayList.isEmpty()) {
            throw e.a();
        }
        return (ec.a) arrayList.get(0);
    }

    @Override // androidx.activity.result.b
    public void g(Object obj) {
        switch (this.a) {
            case 2:
                Map map = (Map) obj;
                androidx.fragment.app.j0 j0Var = (androidx.fragment.app.j0) this.b;
                ArrayList arrayList = new ArrayList(map.values());
                int[] iArr = new int[arrayList.size()];
                for (int i3 = 0; i3 < arrayList.size(); i3++) {
                    iArr[i3] = ((Boolean) arrayList.get(i3)).booleanValue() ? 0 : -1;
                }
                f0 f0Var = (f0) j0Var.F.pollFirst();
                if (f0Var == null) {
                    Log.w("FragmentManager", "No permissions were requested for " + this);
                    break;
                } else {
                    String str = f0Var.a;
                    if (j0Var.c.n(str) == null) {
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
                int i10 = aVar.a;
                Bundle extras = intent == null ? null : intent.getExtras();
                if (i10 != -1) {
                    if (extras == null) {
                        extras = new Bundle();
                    }
                    u.h("ProxyBillingActivityV2", "External offer flow finished with resultCode: " + i10);
                    extras.putInt("INTERNAL_LOG_ERROR_REASON", 134);
                    extras.putString("INTERNAL_LOG_ERROR_ADDITIONAL_DETAILS", "External offer flow finished with error resultCode: " + i10);
                }
                int i11 = u.e("ProxyBillingActivityV2", intent).a;
                ResultReceiver resultReceiver = proxyBillingActivityV2.P;
                if (resultReceiver != null) {
                    resultReceiver.send(i11, extras);
                } else {
                    u.h("ProxyBillingActivityV2", "External offer flow result receiver is null");
                }
                if (i11 != 0) {
                    u.h("ProxyBillingActivityV2", "External offer flow finished with billing responseCode: " + i11);
                }
                proxyBillingActivityV2.finish();
                break;
        }
    }

    public SparseIntArray g0(long j10) {
        return (SparseIntArray) ((h) this.b).f(j10);
    }

    @Override // cd.a
    public Object get() {
        switch (this.a) {
            case 14:
                return new db.k0((u0) ((fb.c) this.b).get());
            default:
                return new gb.a((Context) ((e.a) this.b).a);
        }
    }

    @Override // org.chromium.support_lib_boundary.FeatureFlagHolderBoundaryInterface
    public String[] getSupportedFeatures() {
        return new String[]{"WEB_MESSAGE_LISTENER", "WEB_MESSAGE_ARRAY_BUFFER"};
    }

    @Override // b4.d
    public long h(int i3) {
        zb.f(i3 == 0);
        return 0L;
    }

    public StringBuilder h0() {
        jf.a aVar = (jf.a) this.b;
        if (!(aVar instanceof df.p)) {
            return null;
        }
        StringBuilder sb2 = ((df.p) aVar).b.b;
        if (sb2.length() == 0) {
            return null;
        }
        return sb2;
    }

    @Override // org.telegram.ui.Components.dt0
    public float h1() {
        return p1.d(9.66f, pi.a.d(((wb) this.b).c0), 0);
    }

    @Override // gi.za
    public void i(float f10) {
        y5 y5Var = (y5) this.b;
        f7 f7Var = y5Var.d;
        if (f7Var == null) {
            return;
        }
        f7Var.u0 = f10;
        f7Var.j = true;
        y5Var.c();
    }

    @Override // org.telegram.ui.tq0
    public /* synthetic */ TextureView i0() {
        return null;
    }

    @Override // gi.za
    public void j(float f10) {
        y5 y5Var = (y5) this.b;
        f7 f7Var = y5Var.d;
        if (f7Var == null) {
            return;
        }
        f7Var.G = f10;
        f7Var.j = true;
        y5Var.c();
    }

    public j j0() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        for (j jVar : ((LinkedHashMap) this.b).values()) {
            arrayList.add(jVar.b);
            arrayList2.add(jVar.c);
            arrayList3.add(jVar.d);
            arrayList4.add(jVar.e);
        }
        int[][] iArr = (int[][]) arrayList.toArray(new int[arrayList.size()][]);
        long j10 = 0;
        for (int[] iArr2 : iArr) {
            j10 += iArr2.length;
        }
        int i3 = (int) j10;
        zb.d(j10, "the total number of elements (%s) in the arrays must fit in an int", j10 == ((long) i3));
        int[] iArr3 = new int[i3];
        int i10 = 0;
        for (int[] iArr4 : iArr) {
            System.arraycopy(iArr4, 0, iArr3, i10, iArr4.length);
            i10 += iArr4.length;
        }
        return new j(iArr3, pd.a((long[][]) arrayList2.toArray(new long[arrayList2.size()][])), pd.a((long[][]) arrayList3.toArray(new long[arrayList3.size()][])), pd.a((long[][]) arrayList4.toArray(new long[arrayList4.size()][])));
    }

    @Override // tg.t0
    public void k() {
        x2 x2Var = ((x9) this.b).z0;
        if (x2Var != null) {
            x2Var.invalidate();
        }
    }

    public void k0(String str, Bitmap bitmap) {
        a0.f fVar = MediaMetadataCompat.d;
        if (fVar.containsKey(str) && ((Integer) fVar.get(str)).intValue() != 2) {
            throw new IllegalArgumentException(g.q("The ", str, " key cannot be used to put a Bitmap"));
        }
        ((Bundle) this.b).putParcelable(str, bitmap);
    }

    public void l0(long j10) {
        a0.f fVar = MediaMetadataCompat.d;
        if (fVar.containsKey("android.media.metadata.DURATION") && ((Integer) fVar.get("android.media.metadata.DURATION")).intValue() != 0) {
            throw new IllegalArgumentException("The android.media.metadata.DURATION key cannot be used to put a long");
        }
        ((Bundle) this.b).putLong("android.media.metadata.DURATION", j10);
    }

    @Override // tg.t0
    public void m() {
        x9 x9Var = (x9) this.b;
        if (x9Var.M0) {
            x9Var.M0 = false;
        } else {
            x9Var.U0.b(1);
            x9Var.C((tg.h) tg.h.a.get(0));
        }
    }

    public void m0(String str, String str2) {
        a0.f fVar = MediaMetadataCompat.d;
        if (fVar.containsKey(str) && ((Integer) fVar.get(str)).intValue() != 1) {
            throw new IllegalArgumentException(g.q("The ", str, " key cannot be used to put a String"));
        }
        ((Bundle) this.b).putCharSequence(str, str2);
    }

    @Override // org.telegram.ui.Components.dt0
    public int m1() {
        return ((wb) this.b).d0;
    }

    @Override // gi.za
    public void n(long j10, boolean z10) {
        y5 y5Var = (y5) this.b;
        if (!z10) {
            y5Var.m(j10);
            return;
        }
        m51 m51Var = y5Var.e;
        if (m51Var != null) {
            m51Var.q0(j10, true);
            return;
        }
        if (y5Var.j()) {
            y5Var.F.m(j10, true);
            return;
        }
        m51 m51Var2 = y5Var.E;
        if (m51Var2 != null) {
            m51Var2.q0(j10, false);
        }
    }

    public JSONObject n0() {
        FileInputStream fileInputStream;
        JSONObject jSONObject;
        FileInputStream fileInputStream2 = null;
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", "Checking for cached settings...", null);
        }
        try {
            File file = (File) this.b;
            if (file.exists()) {
                fileInputStream = new FileInputStream(file);
                try {
                    try {
                        jSONObject = new JSONObject(z9.g.j(fileInputStream));
                        fileInputStream2 = fileInputStream;
                    } catch (Exception e10) {
                        e = e10;
                        Log.e("FirebaseCrashlytics", "Failed to fetch cached settings", e);
                        z9.g.b(fileInputStream, "Error while closing settings cache file.");
                        return null;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    fileInputStream2 = fileInputStream;
                    z9.g.b(fileInputStream2, "Error while closing settings cache file.");
                    throw th;
                }
            } else {
                if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                    Log.v("FirebaseCrashlytics", "Settings file does not exist.", null);
                }
                jSONObject = null;
            }
            z9.g.b(fileInputStream2, "Error while closing settings cache file.");
            return jSONObject;
        } catch (Exception e11) {
            e = e11;
            fileInputStream = null;
        } catch (Throwable th3) {
            th = th3;
            z9.g.b(fileInputStream2, "Error while closing settings cache file.");
            throw th;
        }
    }

    @Override // bi.z
    public void o(String str) {
        j0 j0Var = (j0) this.b;
        if (j0Var.getParentActivity() != null) {
            sf.c.t(j0Var.getParentActivity(), str);
        }
    }

    public float o0(int i3, int i10, int i11, int i12) {
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        c cVar;
        int i19;
        int i20 = 1;
        boolean z10 = Math.abs(i12 - i10) > Math.abs(i11 - i3);
        if (z10) {
            i14 = i3;
            i13 = i10;
            i16 = i11;
            i15 = i12;
        } else {
            i13 = i3;
            i14 = i10;
            i15 = i11;
            i16 = i12;
        }
        int abs = Math.abs(i15 - i13);
        int abs2 = Math.abs(i16 - i14);
        int i21 = 2;
        int i22 = (-abs) / 2;
        int i23 = i13 < i15 ? 1 : -1;
        int i24 = i14 < i16 ? 1 : -1;
        int i25 = i15 + i23;
        int i26 = i13;
        int i27 = i14;
        int i28 = 0;
        while (true) {
            if (i26 == i25) {
                i17 = i21;
                break;
            }
            int i29 = z10 ? i27 : i26;
            int i30 = z10 ? i26 : i27;
            boolean z11 = z10;
            if (i28 == i20) {
                i18 = i20;
                i19 = abs;
                cVar = this;
            } else {
                i18 = 0;
                cVar = this;
                i19 = abs;
            }
            if (i18 == ((zb.b) cVar.b).b(i29, i30)) {
                if (i28 == 2) {
                    return a7.h.b(i26, i27, i13, i14);
                }
                i28++;
            }
            i22 += abs2;
            if (i22 > 0) {
                if (i27 == i16) {
                    i17 = 2;
                    break;
                }
                i27 += i24;
                i22 -= i19;
            }
            i26 += i23;
            abs = i19;
            z10 = z11;
            i20 = 1;
            i21 = 2;
        }
        if (i28 == i17) {
            return a7.h.b(i25, i16, i13, i14);
        }
        return Float.NaN;
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        f6.c.h((f6.c) ((f6.j) this.b).c, "joinApplication", task);
    }

    /* JADX WARN: Removed duplicated region for block: B:133:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006b  */
    @Override // org.chromium.support_lib_boundary.WebMessageListenerBoundaryInterface
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onPostMessage(WebView webView, InvocationHandler invocationHandler, Uri uri, boolean z10, InvocationHandler invocationHandler2) {
        kg kgVar;
        kg kgVar2;
        d5.g gVar;
        WebMessageBoundaryInterface webMessageBoundaryInterface = (WebMessageBoundaryInterface) xe.b.a(WebMessageBoundaryInterface.class, invocationHandler);
        InvocationHandler[] ports = webMessageBoundaryInterface.getPorts();
        bb.c[] cVarArr = new bb.c[ports.length];
        for (int i3 = 0; i3 < ports.length; i3++) {
            InvocationHandler invocationHandler3 = ports[i3];
            bb.c cVar = new bb.c(14);
            cVar.b = (WebMessagePortBoundaryInterface) xe.b.a(WebMessagePortBoundaryInterface.class, invocationHandler3);
            cVarArr[i3] = cVar;
        }
        if (d5.l.a.b()) {
            WebMessagePayloadBoundaryInterface webMessagePayloadBoundaryInterface = (WebMessagePayloadBoundaryInterface) xe.b.a(WebMessagePayloadBoundaryInterface.class, webMessageBoundaryInterface.getMessagePayload());
            int type = webMessagePayloadBoundaryInterface.getType();
            if (type == 0) {
                kgVar = new kg(webMessagePayloadBoundaryInterface.getAsString());
            } else {
                if (type != 1) {
                    kgVar2 = null;
                    if (kgVar2 == null) {
                        JsReplyProxyBoundaryInterface jsReplyProxyBoundaryInterface = (JsReplyProxyBoundaryInterface) xe.b.a(JsReplyProxyBoundaryInterface.class, invocationHandler2);
                        d5.g gVar2 = (d5.g) jsReplyProxyBoundaryInterface.getOrCreatePeer(new d5.f(jsReplyProxyBoundaryInterface, 0));
                        e3 e3Var = (e3) this.b;
                        switch (e3Var.a) {
                            case 4:
                                org.telegram.ui.web.t0 t0Var = (org.telegram.ui.web.t0) e3Var.b;
                                w0 w0Var = t0Var.R;
                                if (webView != t0Var || w0Var == null) {
                                    return;
                                }
                                if (webView != w0Var.a || kgVar2.b != 0) {
                                    w0Var.g("onBotWebMessage ignored: invalid source or payload");
                                    return;
                                }
                                String k10 = w0.k(uri == null ? null : uri.toString());
                                if (w0Var.u0 && (TextUtils.isEmpty(w0Var.H0) || !TextUtils.equals(w0Var.H0, k10) || !TextUtils.equals(w0Var.H0, w0Var.getOriginHost()))) {
                                    w0Var.g("onBotWebMessage ignored: untrusted origin");
                                    return;
                                }
                                p7 f10 = w0Var.f();
                                try {
                                    kgVar2.g(0);
                                    String str = (String) kgVar2.c;
                                    if (str != null && str.length() <= 1048576) {
                                        JSONObject jSONObject = new JSONObject(str);
                                        String string = jSONObject.getString("eventType");
                                        if (!string.isEmpty() && string.length() <= 128) {
                                            org.telegram.messenger.g0.h3(new y(w0Var, webView, f10, string, jSONObject.optString("eventData", null), 2));
                                            return;
                                        }
                                        w0Var.g("onBotWebMessage ignored: invalid event type");
                                        return;
                                    }
                                    w0Var.g("onBotWebMessage ignored: invalid payload length");
                                    return;
                                } catch (JSONException e10) {
                                    a8.g(e10, true);
                                    return;
                                }
                            default:
                                ui.j jVar = (ui.j) e3Var.b;
                                if (webView == jVar.o && z10 && uri != null && jVar.f.equals(uri.toString()) && jVar.j(webView)) {
                                    int i10 = kgVar2.b;
                                    if (i10 != 0) {
                                        if (i10 == 1) {
                                            synchronized (jVar.a) {
                                                if (!jVar.u && (gVar = jVar.p) != null && gVar == gVar2) {
                                                    kgVar2.g(1);
                                                    byte[] bArr = (byte[]) kgVar2.d;
                                                    Objects.requireNonNull(bArr);
                                                    jVar.k.execute(new u9.a(7, jVar, bArr));
                                                }
                                            }
                                            return;
                                        }
                                        return;
                                    }
                                    kgVar2.g(0);
                                    String str2 = (String) kgVar2.c;
                                    if (jVar.q || str2 == null || !str2.startsWith("tproxy-base64:")) {
                                        jVar.i(str2, gVar2);
                                        return;
                                    }
                                    synchronized (jVar.a) {
                                        if (!jVar.u && jVar.r && jVar.p == gVar2) {
                                            if (str2.length() - 14 > 1398112) {
                                                jVar.h();
                                            } else {
                                                jVar.k.execute(new u9.a(6, jVar, str2));
                                            }
                                        }
                                    }
                                    return;
                                }
                                return;
                        }
                    }
                    return;
                }
                kgVar = new kg(webMessagePayloadBoundaryInterface.getAsArrayBuffer());
            }
        } else {
            kgVar = new kg(webMessageBoundaryInterface.getData());
        }
        kgVar2 = kgVar;
        if (kgVar2 == null) {
        }
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public void onSuccess(Object obj) {
        b2 b2Var;
        b1 b10;
        f6.a aVar = (f6.a) this.b;
        Bundle bundle = (Bundle) obj;
        if (n0.j) {
            Context context = aVar.a;
            i6.r rVar = aVar.f;
            n0 n0Var = new n0(context, rVar, aVar.c, aVar.j, aVar.g);
            int i3 = bundle.containsKey("com.google.android.gms.cast.FLAG_CLIENT_SESSION_ANALYTICS_MODE") ? bundle.getInt("com.google.android.gms.cast.FLAG_CLIENT_SESSION_ANALYTICS_MODE", 0) : (bundle.containsKey("com.google.android.gms.cast.FLAG_CLIENT_SESSION_ANALYTICS_ENABLED") && bundle.getBoolean("com.google.android.gms.cast.FLAG_CLIENT_SESSION_ANALYTICS_ENABLED", false)) ? 1 : 0;
            boolean z10 = bundle.getBoolean("com.google.android.gms.cast.FLAG_CLIENT_FEATURE_USAGE_ANALYTICS_ENABLED", false);
            if (i3 == 0) {
                if (!z10) {
                    return;
                }
                i3 = 0;
                z10 = true;
            }
            String packageName = context.getPackageName();
            Locale locale = Locale.ROOT;
            String q10 = t4.c.q(packageName, ".client_cast_analytics_data");
            n0Var.h = bundle.getLong("com.google.android.gms.cast.FLAG_FIRELOG_UPLOAD_MODE") == 0 ? 1 : 2;
            s.b(context);
            n0Var.g = s.a().c(l5.a.e).a("CAST_SENDER_SDK", new k5.c("proto"), com.google.android.gms.internal.cast.y.a);
            if (bundle.containsKey("com.google.android.gms.cast.FLAG_ANALYTICS_LOGGING_BUCKET_SIZE")) {
                n0Var.e = Long.valueOf(bundle.getLong("com.google.android.gms.cast.FLAG_ANALYTICS_LOGGING_BUCKET_SIZE"));
            }
            SharedPreferences sharedPreferences = context.getApplicationContext().getSharedPreferences(q10, 0);
            if (i3 != 0) {
                com.google.android.gms.common.api.internal.s b11 = com.google.android.gms.common.api.internal.t.b();
                b11.c = new e3.k0(rVar, new String[]{"com.google.android.gms.cast.DICTIONARY_CAST_STATUS_CODES_TO_APP_SESSION_ERROR", "com.google.android.gms.cast.DICTIONARY_CAST_STATUS_CODES_TO_APP_SESSION_CHANGE_REASON"});
                b11.d = new m6.c[]{e6.y.c};
                b11.b = false;
                b11.a = 8426;
                Task e10 = rVar.e(0, b11.a());
                n nVar = new n();
                nVar.b = n0Var;
                nVar.c = packageName;
                nVar.a = i3;
                nVar.d = sharedPreferences;
                e10.addOnSuccessListener(nVar);
            }
            if (z10) {
                m.g(sharedPreferences);
                i6.b bVar = b2.i;
                synchronized (b2.class) {
                    try {
                        if (b2.k == null) {
                            b2.k = new b2(sharedPreferences, n0Var, packageName);
                        }
                        b2Var = b2.k;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                String str = b2Var.c;
                SharedPreferences sharedPreferences2 = b2Var.b;
                HashSet hashSet = b2Var.f;
                String string = sharedPreferences2.getString("feature_usage_sdk_version", null);
                String string2 = sharedPreferences2.getString("feature_usage_package_name", null);
                hashSet.clear();
                HashSet hashSet2 = b2Var.g;
                hashSet2.clear();
                b2Var.h = 0L;
                String str2 = b2.j;
                if (str2.equals(string) && str.equals(string2)) {
                    b2Var.h = sharedPreferences2.getLong("feature_usage_last_report_time", 0L);
                    long currentTimeMillis = System.currentTimeMillis();
                    HashSet hashSet3 = new HashSet();
                    for (String str3 : sharedPreferences2.getAll().keySet()) {
                        if (str3.startsWith("feature_usage_timestamp_")) {
                            long j10 = sharedPreferences2.getLong(str3, 0L);
                            if (j10 != 0 && currentTimeMillis - j10 > 1209600000) {
                                hashSet3.add(str3);
                            } else if (str3.startsWith("feature_usage_timestamp_reported_feature_")) {
                                b1 b12 = b2.b(str3.substring(41));
                                if (b12 != null) {
                                    hashSet2.add(b12);
                                    hashSet.add(b12);
                                }
                            } else if (str3.startsWith("feature_usage_timestamp_detected_feature_") && (b10 = b2.b(str3.substring(41))) != null) {
                                hashSet.add(b10);
                            }
                        }
                    }
                    b2Var.c(hashSet3);
                    m.g(b2Var.e);
                    m.g(b2Var.d);
                    b2Var.e.post(b2Var.d);
                } else {
                    HashSet hashSet4 = new HashSet();
                    for (String str4 : sharedPreferences2.getAll().keySet()) {
                        if (str4.startsWith("feature_usage_timestamp_")) {
                            hashSet4.add(str4);
                        }
                    }
                    hashSet4.add("feature_usage_last_report_time");
                    b2Var.c(hashSet4);
                    sharedPreferences2.edit().putString("feature_usage_sdk_version", str2).putString("feature_usage_package_name", str).apply();
                }
                b2.a(b1.h);
            }
        }
    }

    @Override // b4.d
    public List p(long j10) {
        return j10 >= 0 ? (List) this.b : Collections.EMPTY_LIST;
    }

    public float p0(int i3, int i10, int i11, int i12) {
        float f10;
        float f11;
        zb.b bVar = (zb.b) this.b;
        float o02 = o0(i3, i10, i11, i12);
        int i13 = i3 - (i11 - i3);
        int i14 = 0;
        if (i13 < 0) {
            f10 = i3 / (i3 - i13);
            i13 = 0;
        } else {
            int i15 = bVar.a;
            if (i13 >= i15) {
                float f12 = ((i15 - 1) - i3) / (i13 - i3);
                int i16 = i15 - 1;
                f10 = f12;
                i13 = i16;
            } else {
                f10 = 1.0f;
            }
        }
        float f13 = i10;
        int i17 = (int) (f13 - ((i12 - i10) * f10));
        if (i17 < 0) {
            f11 = f13 / (i10 - i17);
        } else {
            int i18 = bVar.b;
            if (i17 >= i18) {
                f11 = ((i18 - 1) - i10) / (i17 - i10);
                i14 = i18 - 1;
            } else {
                i14 = i17;
                f11 = 1.0f;
            }
        }
        return (o0(i3, i10, (int) (((i13 - i3) * f11) + i3), i14) + o02) - 1.0f;
    }

    @Override // tg.t0
    public boolean q() {
        x9 x9Var = (x9) this.b;
        boolean z10 = x9Var.t0 == null;
        if (!z10) {
            x9Var.A0(null, true);
        }
        return z10;
    }

    @Override // org.telegram.ui.Components.ki0
    public /* synthetic */ boolean r() {
        return true;
    }

    @Override // gi.za
    public void s() {
        y5 y5Var = (y5) this.b;
        y5Var.s(null, null, true);
        va vaVar = ((ja) y5Var).D0;
        ja jaVar = vaVar.Y0;
        if (jaVar != null) {
            jaVar.s(null, null, true);
        }
        x9 x9Var = vaVar.w1;
        if (x9Var != null) {
            x9Var.n0();
        }
        la laVar = vaVar.d1;
        if (laVar != null) {
            laVar.setHasRoundVideo(false);
        }
        f7 f7Var = vaVar.L1;
        if (f7Var != null) {
            File file = f7Var.o0;
            if (file != null) {
                try {
                    file.delete();
                } catch (Exception unused) {
                }
                vaVar.L1.o0 = null;
            }
            if (vaVar.L1.p0 != null) {
                try {
                    new File(vaVar.L1.p0).delete();
                } catch (Exception unused2) {
                }
                vaVar.L1.p0 = null;
            }
        }
    }

    @Override // b4.d
    public int t() {
        return 1;
    }

    @Override // pg.l
    public void u() {
        ((gi.j0) this.b).d.invalidate();
    }

    @Override // org.telegram.ui.Components.ki0
    public /* synthetic */ boolean v() {
        return false;
    }

    @Override // gi.za
    public void w(boolean z10, float f10) {
        y5 y5Var = (y5) this.b;
        f7 f7Var = y5Var.d;
        if (f7Var == null) {
            return;
        }
        f7Var.Z = f10;
        f7Var.j = true;
        m51 m51Var = y5Var.e;
        if (m51Var == null || m51Var.U() == -9223372036854775807L) {
            return;
        }
        y5Var.m((long) (f10 * y5Var.e.U()));
    }

    @Override // gi.za
    public void y(float f10) {
        y5 y5Var = (y5) this.b;
        f7 f7Var = y5Var.d;
        if (f7Var == null) {
            return;
        }
        f7Var.s0 = f10;
        f7Var.j = true;
        y5Var.y(true);
    }

    @Override // org.telegram.ui.Components.ki0
    public void z(View view, dh.n0 n0Var, boolean z10, boolean z11) {
        dh.r rVar = (dh.r) this.b;
        rVar.a.Ab(null, rVar.e, rVar.b, view, 0.0f, 0.0f, n0Var, false, z10, z11, false);
        org.telegram.messenger.g0.h3(new d1(this, 15));
    }

    public /* synthetic */ c(d7.a aVar, e7.v vVar) {
        this.a = 13;
        this.b = vVar;
    }

    public /* synthetic */ c(Object obj, int i3) {
        this.a = i3;
        this.b = obj;
    }

    public c(fa.f fVar) {
        this.a = 29;
        this.b = new File((File) fVar.d, "com.crashlytics.settings.json");
    }

    public c(int i3) {
        this.a = i3;
        switch (i3) {
            case 8:
                this.b = new h();
                break;
            case 17:
                this.b = new LinkedHashMap();
                break;
            default:
                this.b = new Bundle();
                break;
        }
    }

    public c(MediaMetadataCompat mediaMetadataCompat) {
        this.a = 0;
        Bundle bundle = new Bundle(mediaMetadataCompat.a);
        this.b = bundle;
        a0.f(bundle);
    }

    public c(LaunchActivity launchActivity, Executor executor, l0 l0Var) {
        this.a = 1;
        if (launchActivity == null) {
            throw new IllegalArgumentException("FragmentActivity must not be null.");
        }
        if (executor != null) {
            k0 s6 = launchActivity.s();
            androidx.biometric.z zVar = (androidx.biometric.z) new a0(launchActivity).h(androidx.biometric.z.class);
            this.b = s6;
            zVar.d = executor;
            zVar.e = l0Var;
            return;
        }
        throw new IllegalArgumentException("Executor must not be null.");
    }

    @Override // org.telegram.ui.Components.ki0
    public /* synthetic */ void J() {
    }

    @Override // pg.l
    public void S() {
    }

    @Override // tg.t0
    public void f() {
    }

    @Override // pg.l
    public void A(boolean z10) {
    }

    @Override // pg.l
    public void Q(boolean z10) {
    }

    @Override // com.google.android.gms.common.api.internal.e0
    public void l(Bundle bundle) {
    }

    @Override // com.google.android.gms.common.api.internal.e0
    public void x(int i3) {
    }

    @Override // com.google.android.gms.common.api.internal.e0
    public void D(m6.a aVar, com.google.android.gms.common.api.e eVar, boolean z10) {
    }

    @Override // org.telegram.ui.Components.ki0
    public /* synthetic */ void E(Canvas canvas, RectF rectF, float f10, float f11, float f12, int i3, boolean z10) {
    }
}

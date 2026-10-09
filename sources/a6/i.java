package a6;

import a3.m0;
import ai.e5;
import ai.gc;
import ai.h6;
import ai.hc;
import ai.i6;
import ai.r4;
import ai.r5;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.RectF;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.os.ResultReceiver;
import android.text.TextUtils;
import android.util.Log;
import android.view.Surface;
import android.view.View;
import android.view.Window;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.biometric.e0;
import androidx.fragment.app.g0;
import androidx.lifecycle.a0;
import b5.p;
import ci.i0;
import ci.nb;
import com.android.billingclient.api.ProxyBillingActivityV2;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.internal.s;
import com.google.android.gms.common.api.internal.v0;
import com.google.android.gms.common.api.internal.x;
import com.google.android.gms.internal.cast.v;
import com.google.android.gms.internal.play_billing.u;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import ei.c5;
import fb.n;
import fi.s0;
import fi.t0;
import g.r;
import g6.q;
import gg.a2;
import gg.j1;
import i2.j0;
import ii.e2;
import ii.f6;
import ii.i1;
import ii.i2;
import ii.k0;
import ii.k3;
import ii.l4;
import ii.q3;
import ii.r3;
import ii.u3;
import ii.v3;
import ii.w3;
import ii.w4;
import ii.x3;
import ii.z;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import l.w;
import lg.o;
import org.chromium.support_lib_boundary.StaticsBoundaryInterface;
import org.chromium.support_lib_boundary.WebViewProviderBoundaryInterface;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;
import org.json.JSONException;
import org.json.JSONObject;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Cells.n9;
import org.telegram.ui.Cells.o9;
import org.telegram.ui.Components.jh;
import org.telegram.ui.Components.p80;
import org.telegram.ui.Components.wi;
import org.telegram.ui.Components.yi;
import org.telegram.ui.Stories.ProfileStoriesView;
import org.telegram.ui.l01;
import org.telegram.ui.rz0;
import org.telegram.ui.zn;
import pg.m;
import pg.s1;
import pg.u0;
import qg.v1;
import v7.i5;
import v7.z6;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes.dex */
public final class i implements m0, s, gc, a0, androidx.activity.result.b, p, o, v1, v0, OnSuccessListener, SuccessContinuation, n, s0, w, a2, wi, k0, v3 {
    public static i c;
    public final /* synthetic */ int a;
    public Object b;

    public /* synthetic */ i(int i10, boolean z10) {
        this.a = i10;
    }

    public static com.google.android.gms.common.api.internal.p N(Looper looper, Object obj, String str) {
        n6.l.i(obj, "Listener must not be null");
        n6.l.i(looper, "Looper must not be null");
        return new com.google.android.gms.common.api.internal.p(looper, obj, str);
    }

    public static synchronized i U(Context context) {
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

    @Override // ii.k0
    public void A(CharSequence charSequence) {
        switch (this.a) {
            case 27:
                r3 r3Var = ((z) this.b).O;
                if (r3Var != null) {
                    r3Var.getClass();
                    if (charSequence != null && charSequence.length() > 0) {
                        r3Var.a.u4(charSequence.toString());
                        break;
                    }
                }
                break;
            default:
                q3 q3Var = ((w4) this.b).N;
                if (q3Var != null) {
                    q3Var.getClass();
                    if (charSequence != null && charSequence.length() > 0) {
                        q3Var.a.u4(charSequence.toString());
                        break;
                    }
                }
                break;
        }
    }

    @Override // ii.v3
    public void B() {
        e2 e2Var = (e2) this.b;
        e2.Z(e2Var, false, true);
        int i10 = e2Var.I0;
        e2Var.x0(i10 != 2 ? i10 : 0, true);
    }

    @Override // ii.k0
    public n9 C() {
        switch (this.a) {
            case 27:
                return (z) this.b;
            default:
                return (w4) this.b;
        }
    }

    @Override // ii.v3
    public p80 E(View view) {
        return p80.H((e2) this.b, view);
    }

    @Override // ii.k0
    public ii.a F() {
        switch (this.a) {
            case 27:
                return ((z) this.b).a;
            default:
                return ((w4) this.b).a;
        }
    }

    @Override // ii.k0
    public boolean G() {
        switch (this.a) {
            case 27:
                z zVar = (z) this.b;
                r3 r3Var = zVar.O;
                if (r3Var != null) {
                    ii.a aVar = zVar.a;
                    if (r3Var.a.T4()) {
                    }
                }
                break;
            default:
                w4 w4Var = (w4) this.b;
                q3 q3Var = w4Var.N;
                if (q3Var != null) {
                    ii.a aVar2 = w4Var.a;
                    if (q3Var.a.T4()) {
                    }
                }
                break;
        }
        return false;
    }

    @Override // ii.v3
    public void H() {
        e2 e2Var = (e2) this.b;
        e2Var.z0();
        e2Var.C0();
    }

    @Override // ii.k0
    public void I(int i10, int i11) {
        switch (this.a) {
            case 27:
                z zVar = (z) this.b;
                r3 r3Var = zVar.O;
                if (r3Var != null) {
                    ii.a aVar = zVar.a;
                    i2 i2Var = r3Var.a.H3;
                    if (i2Var != null) {
                        i2Var.f(i10, i11);
                        break;
                    }
                }
                break;
            default:
                w4 w4Var = (w4) this.b;
                q3 q3Var = w4Var.N;
                if (q3Var != null) {
                    ii.a aVar2 = w4Var.a;
                    i2 i2Var2 = q3Var.a.H3;
                    if (i2Var2 != null) {
                        i2Var2.f(i10, i11);
                        break;
                    }
                }
                break;
        }
    }

    @Override // ii.v3
    public void J(u3 u3Var, View view) {
        e2 e2Var = (e2) this.b;
        p80 H = p80.H(e2Var, view);
        H.Q = true;
        e2Var.x0 = l4.c(H, e2Var, e2Var.getParentActivity(), e2Var.getResourceProvider(), u3Var, false);
    }

    @Override // a3.m0
    public void K() {
        j0 j0Var = ((a3.n) this.b).W;
        if (j0Var != null) {
            j0Var.a();
        }
    }

    public float L(ic.c cVar, ic.c cVar2) {
        int i10 = (int) cVar.a;
        int i11 = (int) cVar.b;
        int i12 = (int) cVar2.a;
        int i13 = (int) cVar2.b;
        float T = T(i10, i11, i12, i13);
        float T2 = T((int) cVar2.a, i13, (int) cVar.a, i11);
        return Float.isNaN(T) ? T2 / 7.0f : Float.isNaN(T2) ? T / 7.0f : (T + T2) / 14.0f;
    }

    @Override // ii.k0
    public void M() {
        switch (this.a) {
            case 27:
                z zVar = (z) this.b;
                r3 r3Var = zVar.O;
                if (r3Var != null) {
                    ii.a aVar = zVar.a;
                    x3 x3Var = r3Var.a;
                    i2 i2Var = x3Var.H3;
                    if (i2Var != null) {
                        i2Var.g();
                    }
                    x3Var.f3.onContentChanged();
                    break;
                }
                break;
            default:
                w4 w4Var = (w4) this.b;
                q3 q3Var = w4Var.N;
                if (q3Var != null) {
                    ii.a aVar2 = w4Var.a;
                    x3 x3Var2 = q3Var.a;
                    i2 i2Var2 = x3Var2.H3;
                    if (i2Var2 != null) {
                        i2Var2.g();
                    }
                    x3Var2.f3.onContentChanged();
                    break;
                }
                break;
        }
    }

    public ic.a O(float f7, float f10, int i10, int i11) {
        ic.a b10;
        ic.a b11;
        int i12 = (int) (f10 * f7);
        int max = Math.max(0, i10 - i12);
        dc.b bVar = (dc.b) this.b;
        int min = Math.min(bVar.a - 1, i10 + i12) - max;
        float f11 = 3.0f * f7;
        if (min < f11) {
            throw cc.e.a();
        }
        int max2 = Math.max(0, i11 - i12);
        int min2 = Math.min(bVar.b - 1, i11 + i12) - max2;
        if (min2 < f11) {
            throw cc.e.a();
        }
        dc.b bVar2 = (dc.b) this.b;
        ic.b bVar3 = new ic.b(bVar2, max, max2, min, min2, f7);
        int i13 = bVar3.e;
        int i14 = bVar3.c;
        int i15 = i13 + i14;
        int i16 = bVar3.f;
        int i17 = (i16 / 2) + bVar3.d;
        int[] iArr = new int[3];
        for (int i18 = 0; i18 < i16; i18++) {
            int i19 = ((i18 & 1) == 0 ? (i18 + 1) / 2 : -((i18 + 1) / 2)) + i17;
            iArr[0] = 0;
            iArr[1] = 0;
            iArr[2] = 0;
            int i20 = i14;
            while (i20 < i15 && !bVar2.b(i20, i19)) {
                i20++;
            }
            int i21 = 0;
            while (i20 < i15) {
                if (!bVar2.b(i20, i19)) {
                    if (i21 == 1) {
                        i21++;
                    }
                    iArr[i21] = iArr[i21] + 1;
                } else if (i21 == 1) {
                    iArr[1] = iArr[1] + 1;
                } else if (i21 != 2) {
                    i21++;
                    iArr[i21] = iArr[i21] + 1;
                } else {
                    if (bVar3.a(iArr) && (b11 = bVar3.b(i19, i20, iArr)) != null) {
                        return b11;
                    }
                    iArr[0] = iArr[2];
                    iArr[1] = 1;
                    iArr[2] = 0;
                    i21 = 1;
                }
                i20++;
            }
            if (bVar3.a(iArr) && (b10 = bVar3.b(i19, i15, iArr)) != null) {
                return b10;
            }
        }
        ArrayList arrayList = bVar3.b;
        if (arrayList.isEmpty()) {
            throw cc.e.a();
        }
        return (ic.a) arrayList.get(0);
    }

    @Override // ii.k0
    public void Q() {
        switch (this.a) {
            case 27:
                z zVar = (z) this.b;
                r3 r3Var = zVar.O;
                if (r3Var != null) {
                    ii.a aVar = zVar.a;
                    x3.P1(r3Var.a);
                    break;
                }
                break;
            default:
                w4 w4Var = (w4) this.b;
                q3 q3Var = w4Var.N;
                if (q3Var != null) {
                    ii.a aVar2 = w4Var.a;
                    x3.P1(q3Var.a);
                    break;
                }
                break;
        }
    }

    public float R(int i10, int i11, int i12, int i13) {
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        i iVar;
        int i20;
        int i21 = 1;
        boolean z10 = Math.abs(i13 - i11) > Math.abs(i12 - i10);
        if (z10) {
            i15 = i10;
            i14 = i11;
            i17 = i12;
            i16 = i13;
        } else {
            i14 = i10;
            i15 = i11;
            i16 = i12;
            i17 = i13;
        }
        int abs = Math.abs(i16 - i14);
        int abs2 = Math.abs(i17 - i15);
        int i22 = 2;
        int i23 = (-abs) / 2;
        int i24 = i14 < i16 ? 1 : -1;
        int i25 = i15 < i17 ? 1 : -1;
        int i26 = i16 + i24;
        int i27 = i14;
        int i28 = i15;
        int i29 = 0;
        while (true) {
            if (i27 == i26) {
                i18 = i22;
                break;
            }
            int i30 = z10 ? i28 : i27;
            int i31 = z10 ? i27 : i28;
            boolean z11 = z10;
            if (i29 == i21) {
                i19 = i21;
                i20 = abs;
                iVar = this;
            } else {
                i19 = 0;
                iVar = this;
                i20 = abs;
            }
            if (i19 == ((dc.b) iVar.b).b(i30, i31)) {
                if (i29 == 2) {
                    return z6.b(i27, i28, i14, i15);
                }
                i29++;
            }
            i23 += abs2;
            if (i23 > 0) {
                if (i28 == i17) {
                    i18 = 2;
                    break;
                }
                i28 += i25;
                i23 -= i20;
            }
            i27 += i24;
            abs = i20;
            z10 = z11;
            i21 = 1;
            i22 = 2;
        }
        if (i29 == i18) {
            return z6.b(i26, i17, i14, i15);
        }
        return Float.NaN;
    }

    public float T(int i10, int i11, int i12, int i13) {
        float f7;
        float f10;
        dc.b bVar = (dc.b) this.b;
        float R = R(i10, i11, i12, i13);
        int i14 = i10 - (i12 - i10);
        int i15 = 0;
        if (i14 < 0) {
            f7 = i10 / (i10 - i14);
            i14 = 0;
        } else {
            int i16 = bVar.a;
            if (i14 >= i16) {
                float f11 = ((i16 - 1) - i10) / (i14 - i10);
                int i17 = i16 - 1;
                f7 = f11;
                i14 = i17;
            } else {
                f7 = 1.0f;
            }
        }
        float f12 = i11;
        int i18 = (int) (f12 - ((i13 - i11) * f7));
        if (i18 < 0) {
            f10 = f12 / (i11 - i18);
        } else {
            int i19 = bVar.b;
            if (i18 >= i19) {
                f10 = ((i19 - 1) - i11) / (i18 - i11);
                i15 = i19 - 1;
            } else {
                i15 = i18;
                f10 = 1.0f;
            }
        }
        return (R(i10, i11, (int) (((i14 - i10) * f10) + i10), i15) + R) - 1.0f;
    }

    @Override // gg.a2
    public /* synthetic */ a0.i V() {
        return null;
    }

    @Override // androidx.lifecycle.a0
    public void X(Object obj) {
        CharSequence charSequence = (CharSequence) obj;
        e0 e0Var = (e0) this.b;
        Handler handler = e0Var.A0;
        r4 r4Var = e0Var.B0;
        handler.removeCallbacks(r4Var);
        TextView textView = e0Var.G0;
        if (textView != null) {
            textView.setText(charSequence);
        }
        handler.postDelayed(r4Var, 2000L);
    }

    public synchronized void Y() {
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

    @Override // org.telegram.ui.Components.wi
    public /* synthetic */ boolean Y1() {
        return false;
    }

    @Override // ai.gc
    public void Z(long j3, int i10, e5 e5Var) {
        rz0 rz0Var = (rz0) this.b;
        int i11 = ProfileStoriesView.s0;
        rz0Var.f(true, false);
        e5Var.run();
    }

    @Override // fi.s0
    public void a(long j3) {
        ((fi.s) this.b).presentFragment(zn.W9(j3));
    }

    @Override // com.google.android.gms.common.api.internal.s
    public void accept(Object obj, Object obj2) {
        switch (this.a) {
            case 2:
                l8.c cVar = (l8.c) this.b;
                a8.e eVar = new a8.e(1, (TaskCompletionSource) obj2);
                a8.c cVar2 = (a8.c) ((a8.g) obj).u();
                Parcel obtain = Parcel.obtain();
                obtain.writeInterfaceToken("com.google.android.gms.recaptchabase.internal.IRecaptchaBaseService");
                int i10 = a8.a.a;
                obtain.writeStrongBinder(eVar);
                obtain.writeInt(1);
                cVar.writeToParcel(obtain, 0);
                cVar2.F0(obtain, 1);
                break;
            default:
                q qVar = new q(2, (TaskCompletionSource) obj2);
                g6.i iVar = (g6.i) ((g6.s) obj).u();
                String[] strArr = (String[]) this.b;
                Parcel N0 = iVar.N0();
                v.d(N0, qVar);
                N0.writeStringArray(strArr);
                iVar.S0(N0, 7);
                break;
        }
    }

    @Override // ii.k0, ii.h1
    public void c(i1 i1Var) {
        switch (this.a) {
            case 27:
                r3 r3Var = ((z) this.b).O;
                if (r3Var != null) {
                    x3 x3Var = r3Var.a;
                    x3.N1(x3Var, i1Var);
                    x3Var.f3.r(i1Var, true);
                    break;
                }
                break;
            default:
                q3 q3Var = ((w4) this.b).N;
                if (q3Var != null) {
                    x3 x3Var2 = q3Var.a;
                    x3.N1(x3Var2, i1Var);
                    x3Var2.f3.r(i1Var, true);
                    break;
                }
                break;
        }
    }

    @Override // fi.s0
    public void close() {
        ((fi.s) this.b).finishFragment();
    }

    @Override // b5.p
    public WebViewProviderBoundaryInterface createWebView(WebView webView) {
        return (WebViewProviderBoundaryInterface) te.b.a(WebViewProviderBoundaryInterface.class, ((WebViewProviderFactoryBoundaryInterface) this.b).createWebView(webView));
    }

    @Override // l.w
    public void d(l.k kVar, boolean z10) {
        g.q qVar;
        r rVar = (r) this.b;
        l.k k10 = kVar.k();
        int i10 = 0;
        boolean z11 = k10 != kVar;
        if (z11) {
            kVar = k10;
        }
        g.q[] qVarArr = rVar.U;
        int length = qVarArr != null ? qVarArr.length : 0;
        while (true) {
            if (i10 < length) {
                qVar = qVarArr[i10];
                if (qVar != null && qVar.h == kVar) {
                    break;
                } else {
                    i10++;
                }
            } else {
                qVar = null;
                break;
            }
        }
        if (qVar != null) {
            if (!z11) {
                rVar.h(qVar, z10);
            } else {
                rVar.f(qVar.a, qVar, k10);
                rVar.h(qVar, true);
            }
        }
    }

    @Override // gg.a2
    public /* synthetic */ a0.i d0() {
        return null;
    }

    @Override // ii.v3
    public void e(w3 w3Var, View view) {
        e2 e2Var = (e2) this.b;
        p80 H = p80.H(e2Var, view);
        H.Q = true;
        e2Var.getParentActivity();
        e2Var.getResourceProvider();
        e2Var.x0 = l4.b(H, e2Var, w3Var, false);
    }

    @Override // ai.gc
    public boolean e1(long j3, int i10, int i11, int i12, hc hcVar) {
        ImageReceiver imageReceiver;
        i6 i6Var;
        i6 i6Var2;
        hcVar.b = null;
        hcVar.c = null;
        rz0 rz0Var = (rz0) this.b;
        l01 l01Var = rz0Var.h;
        ArrayList arrayList = rz0Var.w;
        if (rz0Var.N < 0.2f) {
            hcVar.b = l01Var.getImageReceiver();
            hcVar.c = null;
            hcVar.a = l01Var;
            hcVar.h = 0.0f;
            hcVar.i = AndroidUtilities.displaySize.y;
            hcVar.g = (View) rz0Var.getParent();
            hcVar.d = rz0Var.y;
            hcVar.n = true;
            return true;
        }
        int i13 = 0;
        while (true) {
            if (i13 >= arrayList.size()) {
                imageReceiver = null;
                i6Var = null;
                i6Var2 = null;
                break;
            }
            i6 i6Var3 = (i6) arrayList.get(i13);
            if (i6Var3.e < 1.0f || i6Var3.a != i11) {
                i13++;
            } else {
                int i14 = i13 - 1;
                int i15 = i13 - 2;
                i6 d = ProfileStoriesView.d(i14 >= 0 ? (i6) arrayList.get(i14) : null, i15 >= 0 ? (i6) arrayList.get(i15) : null, i6Var3);
                imageReceiver = i6Var3.b;
                i6Var2 = d;
                i6Var = i6Var3;
            }
        }
        if (imageReceiver == null) {
            return false;
        }
        hcVar.c = imageReceiver;
        hcVar.b = null;
        hcVar.a = rz0Var;
        hcVar.h = 0.0f;
        hcVar.i = AndroidUtilities.displaySize.y;
        hcVar.g = (View) rz0Var.getParent();
        if (i6Var == null || i6Var2 == null) {
            hcVar.f = null;
            return true;
        }
        hcVar.f = new h6(this, new RectF(i6Var.m), i6Var, new RectF(i6Var2.m), i6Var2);
        return true;
    }

    @Override // ii.v3
    public boolean f(float f7) {
        boolean z10;
        e2 e2Var = (e2) this.b;
        FrameLayout frameLayout = e2Var.v0;
        if (frameLayout != null) {
            frameLayout.getLocationOnScreen(new int[2]);
            if (f7 >= r3[1]) {
                z10 = true;
                e2.Z(e2Var, z10, true);
                return z10;
            }
        }
        z10 = false;
        e2.Z(e2Var, z10, true);
        return z10;
    }

    @Override // org.telegram.ui.Components.wi
    public void f0(jh jhVar) {
        int i10;
        i10 = ((n2) ((hg.n) this.b)).currentAccount;
        NotificationCenter.getInstance(i10).doOnIdle(jhVar);
    }

    @Override // ii.k0
    public void g() {
        switch (this.a) {
            case 27:
                z zVar = (z) this.b;
                r3 r3Var = zVar.O;
                if (r3Var != null) {
                    x3.Q1(r3Var.a, zVar.a);
                    break;
                }
                break;
            default:
                w4 w4Var = (w4) this.b;
                q3 q3Var = w4Var.N;
                if (q3Var != null) {
                    x3.Q1(q3Var.a, w4Var.a);
                    break;
                }
                break;
        }
    }

    @Override // qg.v1
    public float get() {
        nb nbVar = (nb) this.b;
        int i10 = nbVar.F1;
        m currentBrush = nbVar.O0.getCurrentBrush();
        return currentBrush == null ? u0.e(i10).i : u0.e(i10).f(String.valueOf(m.a.indexOf(currentBrush)), currentBrush.d());
    }

    @Override // b5.p
    public StaticsBoundaryInterface getStatics() {
        return (StaticsBoundaryInterface) te.b.a(StaticsBoundaryInterface.class, ((WebViewProviderFactoryBoundaryInterface) this.b).getStatics());
    }

    @Override // gg.a2
    public void h(int i10) {
        ((j1) this.b).l();
    }

    @Override // ii.v3
    public void i(f6 f6Var, String str) {
        e2 e2Var = (e2) this.b;
        if (e2Var.z0 == null) {
            e2Var.z0 = new m.q3(new c5(this, 15), e2Var.getResourceProvider());
        }
        e2Var.z0.f(f6Var, str);
    }

    @Override // org.telegram.ui.Components.wi
    public /* synthetic */ boolean i0() {
        return false;
    }

    @Override // androidx.activity.result.b
    public void j(Object obj) {
        switch (this.a) {
            case 5:
                Map map = (Map) obj;
                androidx.fragment.app.k0 k0Var = (androidx.fragment.app.k0) this.b;
                ArrayList arrayList = new ArrayList(map.values());
                int[] iArr = new int[arrayList.size()];
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    iArr[i10] = ((Boolean) arrayList.get(i10)).booleanValue() ? 0 : -1;
                }
                g0 g0Var = (g0) k0Var.F.pollFirst();
                if (g0Var == null) {
                    Log.w("FragmentManager", "No permissions were requested for " + this);
                    break;
                } else {
                    String str = g0Var.a;
                    if (k0Var.c.l(str) == null) {
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
                int i11 = aVar.a;
                Bundle extras = intent == null ? null : intent.getExtras();
                if (i11 != -1) {
                    if (extras == null) {
                        extras = new Bundle();
                    }
                    u.h("ProxyBillingActivityV2", "External offer flow finished with resultCode: " + i11);
                    extras.putInt("INTERNAL_LOG_ERROR_REASON", 134);
                    extras.putString("INTERNAL_LOG_ERROR_ADDITIONAL_DETAILS", "External offer flow finished with error resultCode: " + i11);
                }
                int i12 = u.e("ProxyBillingActivityV2", intent).a;
                ResultReceiver resultReceiver = proxyBillingActivityV2.O;
                if (resultReceiver != null) {
                    resultReceiver.send(i12, extras);
                } else {
                    u.h("ProxyBillingActivityV2", "External offer flow result receiver is null");
                }
                if (i12 != 0) {
                    u.h("ProxyBillingActivityV2", "External offer flow finished with billing responseCode: " + i12);
                }
                proxyBillingActivityV2.finish();
                break;
        }
    }

    @Override // ii.v3
    public void k(int i10) {
        ((e2) this.b).o0(74, i10);
    }

    @Override // ii.v3
    public void l() {
        e2 e2Var = (e2) this.b;
        k3 k3Var = e2Var.P.l3;
        e2Var.x0((k3Var != null && k3Var.x() && e2Var.P.D4()) ? 1 : 0, true);
        e2Var.y0();
        e2Var.w0();
    }

    @Override // ii.v3
    public void m() {
        e2 e2Var = (e2) this.b;
        e2Var.I0 = e2Var.K0;
        e2.Z(e2Var, false, false);
        e2Var.x0(2, true);
    }

    @Override // fi.s0
    public void n() {
        fi.s sVar = (fi.s) this.b;
        me.b bVar = sVar.a;
        t0 t0Var = sVar.v;
        bVar.a(t0Var.n && t0Var.l == 0, true);
        sVar.d.W2.N(true);
    }

    @Override // com.google.android.gms.common.api.internal.v0
    public void o(k6.a aVar) {
        x xVar = (x) this.b;
        xVar.o.lock();
        try {
            xVar.l = aVar;
            x.l(xVar);
        } finally {
            xVar.o.unlock();
        }
    }

    @Override // ii.v3
    public void onContentChanged() {
        e2 e2Var = (e2) this.b;
        if (e2Var.y0 != null) {
            boolean n32 = e2Var.P.n3();
            e2Var.L0 = n32;
            e2Var.y0.h(n32);
            e2Var.y0.invalidate();
        }
        e2Var.C0();
        Runnable runnable = e2Var.M0;
        AndroidUtilities.cancelRunOnUIThread(runnable);
        AndroidUtilities.runOnUIThread(runnable, 1000L);
    }

    @Override // a3.m0
    public void onFirstFrameRendered() {
        a3.n nVar = (a3.n) this.b;
        Surface surface = nVar.m1;
        if (surface != null) {
            nVar.Y0.R(surface);
            nVar.p1 = true;
        }
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public void onSuccess(Object obj) {
        ((d6.a) this.b).getClass();
        i5.a("com.google.android.gms.cast.MAP_CAST_STATUS_CODES_TO_CAST_REASON_CODES", (Bundle) obj);
    }

    @Override // ii.v3
    public void p(ii.a aVar) {
        e2 e2Var = (e2) this.b;
        if (aVar != null && (aVar.b instanceof TL_iv.pageBlockMap) && AndroidUtilities.isMapsInstalled(e2Var)) {
            yi yiVar = new yi(e2Var.getParentActivity(), e2Var, false, false, false, e2Var.getResourceProvider());
            yiVar.c2 = new qb.b(11);
            yiVar.P = true;
            yiVar.A1.setVisibility(8);
            yiVar.w2 = new r5(e2Var, aVar, yiVar, 11);
            yiVar.t1();
            yiVar.show();
        }
    }

    @Override // qg.v1
    public void q0(float f7) {
        nb nbVar = (nb) this.b;
        u0.e(nbVar.F1).k(String.valueOf(m.a.indexOf(nbVar.O0.getCurrentBrush())), f7);
        s1 s1Var = nbVar.A1;
        s1Var.c = f7;
        nbVar.D0(s1Var, null, false);
    }

    @Override // b5.p
    public String[] s() {
        return ((WebViewProviderFactoryBoundaryInterface) this.b).getSupportedFeatures();
    }

    @Override // gg.a2
    public /* synthetic */ boolean s0(int i10) {
        return true;
    }

    @Override // com.google.android.gms.tasks.SuccessContinuation
    public Task then(Object obj) {
        JSONObject jSONObject;
        FileWriter fileWriter;
        da.c cVar = (da.c) this.b;
        da.a aVar = (da.a) cVar.f;
        da.e eVar = (da.e) cVar.b;
        String str = aVar.b;
        FileWriter fileWriter2 = null;
        try {
            HashMap b10 = da.a.b(eVar);
            aa.a aVar2 = new aa.a(str, b10);
            aVar2.r("User-Agent", "Crashlytics Android SDK/18.6.0");
            aVar2.r("X-CRASHLYTICS-DEVELOPER-TOKEN", "470fa2b4ae81cd56ecbcda9735803434cec591fa");
            da.a.a(aVar2, eVar);
            String str2 = "Requesting settings from " + str;
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", str2, null);
            }
            String str3 = "Settings query params were: " + b10;
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", str3, null);
            }
            jSONObject = aVar.c(aVar2.i());
        } catch (IOException e7) {
            Log.e("FirebaseCrashlytics", "Settings request failed.", e7);
            jSONObject = null;
        }
        if (jSONObject != null) {
            da.b U = ((a4.l) cVar.c).U(jSONObject);
            pb.c cVar2 = (pb.c) cVar.e;
            long j3 = U.c;
            cVar2.getClass();
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", "Writing settings to cache file...", null);
            }
            try {
                jSONObject.put("expires_at", j3);
                fileWriter = new FileWriter((File) cVar2.b);
                try {
                    try {
                        fileWriter.write(jSONObject.toString());
                        fileWriter.flush();
                    } catch (Exception e10) {
                        e = e10;
                        Log.e("FirebaseCrashlytics", "Failed to cache settings", e);
                        w9.h.c(fileWriter, "Failed to close settings writer.");
                        da.c.f("Loaded settings: ", jSONObject);
                        String str4 = eVar.f;
                        SharedPreferences.Editor edit = ((Context) cVar.a).getSharedPreferences("com.google.firebase.crashlytics", 0).edit();
                        edit.putString("existing_instance_identifier", str4);
                        edit.apply();
                        ((AtomicReference) cVar.h).set(U);
                        ((TaskCompletionSource) ((AtomicReference) cVar.i).get()).trySetResult(U);
                        return Tasks.forResult(null);
                    }
                } catch (Throwable th2) {
                    th = th2;
                    fileWriter2 = fileWriter;
                    w9.h.c(fileWriter2, "Failed to close settings writer.");
                    throw th;
                }
            } catch (Exception e11) {
                e = e11;
                fileWriter = null;
            } catch (Throwable th3) {
                th = th3;
                w9.h.c(fileWriter2, "Failed to close settings writer.");
                throw th;
            }
            w9.h.c(fileWriter, "Failed to close settings writer.");
            da.c.f("Loaded settings: ", jSONObject);
            String str42 = eVar.f;
            SharedPreferences.Editor edit2 = ((Context) cVar.a).getSharedPreferences("com.google.firebase.crashlytics", 0).edit();
            edit2.putString("existing_instance_identifier", str42);
            edit2.apply();
            ((AtomicReference) cVar.h).set(U);
            ((TaskCompletionSource) ((AtomicReference) cVar.i).get()).trySetResult(U);
        }
        return Tasks.forResult(null);
    }

    @Override // com.google.android.gms.common.api.internal.v0
    public void u(int i10) {
        k6.a aVar;
        x xVar = (x) this.b;
        Lock lock = xVar.o;
        lock.lock();
        try {
            if (!xVar.n && (aVar = xVar.m) != null && aVar.c()) {
                xVar.n = true;
                xVar.e.onConnectionSuspended(i10);
                lock.unlock();
            }
            xVar.n = false;
            x.k(xVar, i10);
            lock.unlock();
        } catch (Throwable th2) {
            lock.unlock();
            throw th2;
        }
    }

    @Override // l.w
    public boolean v(l.k kVar) {
        Window.Callback callback;
        r rVar = (r) this.b;
        if (kVar != kVar.k() || !rVar.O || (callback = rVar.f.getCallback()) == null || rVar.Z) {
            return true;
        }
        callback.onMenuOpened(108, kVar);
        return true;
    }

    @Override // fb.n
    public Object v2() {
        Class cls = (Class) this.b;
        try {
            return fb.s.a.a(cls);
        } catch (Exception e7) {
            throw new RuntimeException("Unable to create instance of " + cls + ". Registering an InstanceCreator or a TypeAdapter for this type, or adding a no-args constructor may fix this problem.", e7);
        }
    }

    @Override // lg.o
    public void w() {
        ((i0) this.b).d.invalidate();
    }

    @Override // a3.m0
    public void x() {
        a3.n nVar = (a3.n) this.b;
        if (nVar.m1 != null) {
            nVar.N0(0, 1);
        }
    }

    @Override // gg.a2
    public void x0(ArrayList arrayList) {
        j1 j1Var = (j1) this.b;
        String str = j1Var.Z;
        if (str != null) {
            j1Var.U(str, j1Var.c0, j1Var.d0, j1Var.b0, j1Var.a0);
        }
    }

    @Override // ii.k0
    public o9 y() {
        switch (this.a) {
            case 27:
                r3 r3Var = ((z) this.b).O;
                if (r3Var != null) {
                    return r3Var.a.getTextSelectionHelper();
                }
                return null;
            default:
                q3 q3Var = ((w4) this.b).N;
                if (q3Var != null) {
                    return q3Var.a.getTextSelectionHelper();
                }
                return null;
        }
    }

    @Override // com.google.android.gms.common.api.internal.v0
    public void z(Bundle bundle) {
        x xVar = (x) this.b;
        xVar.o.lock();
        try {
            Bundle bundle2 = xVar.k;
            if (bundle2 == null) {
                xVar.k = bundle;
            } else if (bundle != null) {
                bundle2.putAll(bundle);
            }
            xVar.l = k6.a.e;
            x.l(xVar);
        } finally {
            xVar.o.unlock();
        }
    }

    public /* synthetic */ i(g6.r rVar, String[] strArr) {
        this.a = 22;
        this.b = strArr;
    }

    public /* synthetic */ i(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    public i(Context context) {
        String d;
        this.a = 0;
        b a2 = b.a(context);
        this.b = a2;
        a2.b();
        String d10 = a2.d("defaultGoogleSignInAccount");
        if (TextUtils.isEmpty(d10) || (d = a2.d(b.f("googleSignInOptions", d10))) == null) {
            return;
        }
        try {
            GoogleSignInOptions.b(d);
        } catch (JSONException unused) {
        }
    }

    public i(int i10) {
        this.a = i10;
        switch (i10) {
            case 8:
                this.b = new e2.v(10);
                break;
            case 13:
                this.b = Collections.newSetFromMap(new WeakHashMap());
                break;
            default:
                this.b = new LinkedHashMap(0, 0.75f, true);
                break;
        }
    }

    @Override // org.telegram.ui.Components.wi
    public /* synthetic */ void B0() {
    }

    @Override // a3.m0
    public void P() {
    }

    @Override // org.telegram.ui.Components.wi
    public /* synthetic */ void P0() {
    }

    @Override // lg.o
    public void W() {
    }

    @Override // ii.v3
    public void q() {
    }

    @Override // lg.o
    public void D(boolean z10) {
    }

    @Override // lg.o
    public void S(boolean z10) {
    }

    @Override // org.telegram.ui.Components.wi
    public /* synthetic */ void a1(Object obj) {
    }

    @Override // ai.gc
    public /* synthetic */ void b(boolean z10) {
    }

    @Override // org.telegram.ui.Components.wi
    public /* synthetic */ void p1(TLRPC.User user) {
    }

    @Override // ii.v3
    public void t(int i10) {
    }

    @Override // ii.v3
    public void r(i1 i1Var, boolean z10) {
    }

    @Override // org.telegram.ui.Components.wi
    public /* synthetic */ void c2(ArrayList arrayList, CharSequence charSequence, boolean z10, int i10, int i11, long j3, boolean z11, long j10) {
    }

    @Override // org.telegram.ui.Components.wi
    public void I1(int i10, boolean z10, boolean z11, int i11, int i12, long j3, boolean z12, boolean z13, long j10) {
    }
}

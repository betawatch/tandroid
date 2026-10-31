package a6;

import a3.n;
import a3.n0;
import ag.d3;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
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
import androidx.biometric.f0;
import androidx.fragment.app.j0;
import androidx.lifecycle.a0;
import b2.b2;
import b2.u0;
import b5.p;
import bi.a4;
import bi.b0;
import bi.b4;
import bi.c4;
import bi.d4;
import bi.f5;
import bi.k2;
import bi.m0;
import bi.n1;
import bi.o2;
import bi.q3;
import bi.q6;
import bi.t4;
import bi.w3;
import bi.x3;
import com.android.billingclient.api.ProxyBillingActivityV2;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.internal.g0;
import com.google.android.gms.common.api.internal.l0;
import com.google.android.gms.common.api.internal.s;
import com.google.android.gms.common.api.internal.w0;
import com.google.android.gms.internal.cast.u;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import e9.j1;
import g.r;
import java.io.EOFException;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import k2.q;
import k2.t;
import k2.v;
import k2.x0;
import k2.z;
import k2.z0;
import l.x;
import m.p3;
import org.chromium.support_lib_boundary.StaticsBoundaryInterface;
import org.chromium.support_lib_boundary.WebViewProviderBoundaryInterface;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;
import org.json.JSONException;
import org.json.JSONObject;
import org.telegram.messenger.i0;
import org.telegram.messenger.zs;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Cells.j9;
import org.telegram.ui.Cells.k9;
import org.telegram.ui.Components.bi;
import org.telegram.ui.Components.h6;
import org.telegram.ui.Components.mn0;
import org.telegram.ui.Components.z60;
import org.telegram.ui.er0;
import td.m;
import v7.k5;
import x2.o;
import zf.l1;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class i implements n0, s, l1, a0, androidx.activity.result.b, p, be.a, m0, b4, l0, w0, OnSuccessListener, OnCompleteListener, d9.k, SuccessContinuation, mn0, x, jg.c, z {
    public static i c;
    public final /* synthetic */ int a;
    public Object b;

    public /* synthetic */ i(com.google.android.gms.common.api.j jVar, Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    public static synchronized i n0(Context context) {
        i q02;
        synchronized (i.class) {
            q02 = q0(context.getApplicationContext());
        }
        return q02;
    }

    public static synchronized i q0(Context context) {
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

    @Override // l.x
    public boolean B(l.l lVar) {
        Window.Callback callback;
        r rVar = (r) this.b;
        if (lVar != lVar.k() || !rVar.O || (callback = rVar.f.getCallback()) == null || rVar.Z) {
            return true;
        }
        callback.onMenuOpened(zs.t1, lVar);
        return true;
    }

    @Override // bi.b4
    public void D(q6 q6Var, String str) {
        k2 k2Var = (k2) this.b;
        if (k2Var.z0 == null) {
            k2Var.z0 = new p3(new a1.c(this, 9), k2Var.getResourceProvider());
        }
        k2Var.z0.g(q6Var, str);
    }

    @Override // bi.m0
    public void F(CharSequence charSequence) {
        switch (this.a) {
            case 9:
                x3 x3Var = ((b0) this.b).O;
                if (x3Var != null) {
                    x3Var.getClass();
                    if (charSequence != null && charSequence.length() > 0) {
                        x3Var.a.w4(charSequence.toString());
                        break;
                    }
                }
                break;
            default:
                w3 w3Var = ((f5) this.b).N;
                if (w3Var != null) {
                    w3Var.getClass();
                    if (charSequence != null && charSequence.length() > 0) {
                        w3Var.a.w4(charSequence.toString());
                        break;
                    }
                }
                break;
        }
    }

    @Override // b5.p
    public String[] G() {
        return ((WebViewProviderFactoryBoundaryInterface) this.b).getSupportedFeatures();
    }

    @Override // k2.z
    public void H() {
        o oVar;
        z0 z0Var = (z0) this.b;
        synchronized (z0Var.a) {
            oVar = z0Var.H;
        }
        if (oVar != null) {
            oVar.m();
        }
    }

    @Override // bi.m0
    public j9 J() {
        switch (this.a) {
            case 9:
                return (b0) this.b;
            default:
                return (f5) this.b;
        }
    }

    @Override // bi.m0
    public bi.a L() {
        switch (this.a) {
            case 9:
                return ((b0) this.b).a;
            default:
                return ((f5) this.b).a;
        }
    }

    @Override // zf.l1
    public /* synthetic */ a0.h M() {
        return null;
    }

    @Override // bi.b4
    public void N(c4 c4Var, View view) {
        k2 k2Var = (k2) this.b;
        z60 H = z60.H(k2Var, view);
        H.Q = true;
        k2Var.getParentActivity();
        k2Var.getResourceProvider();
        k2Var.x0 = t4.b(H, k2Var, c4Var, false);
    }

    @Override // bi.m0
    public boolean O() {
        switch (this.a) {
            case 9:
                b0 b0Var = (b0) this.b;
                x3 x3Var = b0Var.O;
                if (x3Var != null) {
                    bi.a aVar = b0Var.a;
                    if (x3Var.a.V4()) {
                    }
                }
                break;
            default:
                f5 f5Var = (f5) this.b;
                w3 w3Var = f5Var.N;
                if (w3Var != null) {
                    bi.a aVar2 = f5Var.a;
                    if (w3Var.a.V4()) {
                    }
                }
                break;
        }
        return false;
    }

    @Override // k2.z
    public void P(Exception exc) {
        e2.a.d("MediaCodecAudioRenderer", "Audio sink error", exc);
        hf.b bVar = ((z0) this.b).a1;
        Handler handler = (Handler) bVar.b;
        if (handler != null) {
            handler.post(new q(bVar, exc, 1));
        }
    }

    @Override // com.google.android.gms.common.api.internal.l0
    public void Q() {
        com.google.android.gms.common.api.internal.n0 n0Var = (com.google.android.gms.common.api.internal.n0) this.b;
        Iterator it = n0Var.f.values().iterator();
        while (it.hasNext()) {
            ((com.google.android.gms.common.api.c) it.next()).j();
        }
        n0Var.o.F = Collections.EMPTY_SET;
    }

    @Override // bi.m0
    public void R(int i10, int i11) {
        switch (this.a) {
            case 9:
                b0 b0Var = (b0) this.b;
                x3 x3Var = b0Var.O;
                if (x3Var != null) {
                    bi.a aVar = b0Var.a;
                    o2 o2Var = x3Var.a.Q3;
                    if (o2Var != null) {
                        o2Var.f(i10, i11);
                        break;
                    }
                }
                break;
            default:
                f5 f5Var = (f5) this.b;
                w3 w3Var = f5Var.N;
                if (w3Var != null) {
                    bi.a aVar2 = f5Var.a;
                    o2 o2Var2 = w3Var.a.Q3;
                    if (o2Var2 != null) {
                        o2Var2.f(i10, i11);
                        break;
                    }
                }
                break;
        }
    }

    @Override // k2.z
    public void S() {
        ((z0) this.b).j1 = true;
    }

    @Override // bi.b4
    public void T() {
        k2 k2Var = (k2) this.b;
        k2.d0(k2Var, false, true);
        int i10 = k2Var.I0;
        k2Var.B0(i10 != 2 ? i10 : 0, true);
    }

    @Override // bi.b4
    public z60 U(View view) {
        return z60.H((k2) this.b, view);
    }

    @Override // a3.n0
    public void V() {
        n nVar = (n) this.b;
        if (nVar.r1 != null) {
            nVar.R0(0, 1);
        }
    }

    @Override // bi.m0
    public void W() {
        switch (this.a) {
            case 9:
                b0 b0Var = (b0) this.b;
                x3 x3Var = b0Var.O;
                if (x3Var != null) {
                    bi.a aVar = b0Var.a;
                    d4 d4Var = x3Var.a;
                    o2 o2Var = d4Var.Q3;
                    if (o2Var != null) {
                        o2Var.g();
                    }
                    d4Var.o3.onContentChanged();
                    break;
                }
                break;
            default:
                f5 f5Var = (f5) this.b;
                w3 w3Var = f5Var.N;
                if (w3Var != null) {
                    bi.a aVar2 = f5Var.a;
                    d4 d4Var2 = w3Var.a;
                    o2 o2Var2 = d4Var2.Q3;
                    if (o2Var2 != null) {
                        o2Var2.g();
                    }
                    d4Var2.o3.onContentChanged();
                    break;
                }
                break;
        }
    }

    @Override // a3.n0
    public void X() {
        i2.m0 m0Var = ((n) this.b).Y;
        if (m0Var != null) {
            m0Var.a();
        }
    }

    @Override // zf.l1
    public /* synthetic */ boolean Y(int i10) {
        return true;
    }

    @Override // bi.b4
    public void Z() {
        k2 k2Var = (k2) this.b;
        k2Var.D0();
        k2Var.G0();
    }

    @Override // k2.z
    public void a(int i10) {
        r2.j jVar;
        z0 z0Var = (z0) this.b;
        if (Build.VERSION.SDK_INT >= 35 && (jVar = z0Var.c1) != null) {
            jVar.d(i10);
        }
        hf.b bVar = z0Var.a1;
        Handler handler = (Handler) bVar.b;
        if (handler != null) {
            handler.post(new d3(bVar, i10, 9));
        }
    }

    @Override // k2.z
    public void a0(x0 x0Var) {
        hf.b bVar = ((z0) this.b).a1;
        Handler handler = (Handler) bVar.b;
        if (handler != null) {
            handler.post(new t(bVar, x0Var, 1));
        }
    }

    @Override // com.google.android.gms.common.api.internal.s
    public void accept(Object obj, Object obj2) {
        switch (this.a) {
            case 2:
                l8.c cVar = (l8.c) this.b;
                a8.e eVar = new a8.e(1, (TaskCompletionSource) obj2);
                a8.c cVar2 = (a8.c) ((a8.g) obj).v();
                Parcel obtain = Parcel.obtain();
                obtain.writeInterfaceToken("com.google.android.gms.recaptchabase.internal.IRecaptchaBaseService");
                int i10 = a8.a.a;
                obtain.writeStrongBinder(eVar);
                obtain.writeInt(1);
                cVar.writeToParcel(obtain, 0);
                cVar2.H0(obtain, 1);
                break;
            case 24:
                g6.q qVar = new g6.q(2, (TaskCompletionSource) obj2);
                g6.i iVar = (g6.i) ((g6.s) obj).v();
                String[] strArr = (String[]) this.b;
                Parcel P0 = iVar.P0();
                u.d(P0, qVar);
                P0.writeStringArray(strArr);
                iVar.U0(P0, 7);
                break;
            default:
                l lVar = new l((TaskCompletionSource) obj2);
                i7.i iVar2 = (i7.i) ((i7.c) obj).v();
                x5.e eVar2 = (x5.e) this.b;
                Parcel L0 = iVar2.L0();
                int i11 = i7.f.a;
                L0.writeStrongBinder(lVar);
                i7.f.c(L0, eVar2);
                iVar2.M0(L0, 1);
                break;
        }
    }

    @Override // d9.k
    public Object apply(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        e9.l1 l1Var = (e9.l1) this.b;
        l1Var.getClass();
        entry.getClass();
        return new j1(entry, l1Var);
    }

    @Override // bi.m0, bi.m1
    public void b(n1 n1Var) {
        switch (this.a) {
            case 9:
                x3 x3Var = ((b0) this.b).O;
                if (x3Var != null) {
                    d4 d4Var = x3Var.a;
                    d4.P1(d4Var, n1Var);
                    d4Var.o3.h(n1Var, true);
                    break;
                }
                break;
            default:
                w3 w3Var = ((f5) this.b).N;
                if (w3Var != null) {
                    d4 d4Var2 = w3Var.a;
                    d4.P1(d4Var2, n1Var);
                    d4Var2.o3.h(n1Var, true);
                    break;
                }
                break;
        }
    }

    @Override // com.google.android.gms.common.api.internal.l0
    public boolean b0() {
        return true;
    }

    @Override // bi.b4
    public boolean c(float f7) {
        boolean z10;
        k2 k2Var = (k2) this.b;
        FrameLayout frameLayout = k2Var.v0;
        if (frameLayout != null) {
            frameLayout.getLocationOnScreen(new int[2]);
            if (f7 >= r3[1]) {
                z10 = true;
                k2.d0(k2Var, z10, true);
                return z10;
            }
        }
        z10 = false;
        k2.d0(k2Var, z10, true);
        return z10;
    }

    @Override // b5.p
    public WebViewProviderBoundaryInterface createWebView(WebView webView) {
        return (WebViewProviderBoundaryInterface) me.b.b(WebViewProviderBoundaryInterface.class, ((WebViewProviderFactoryBoundaryInterface) this.b).createWebView(webView));
    }

    @Override // bi.b4
    public void d0(bi.a aVar) {
        k2 k2Var = (k2) this.b;
        if (aVar != null && (aVar.b instanceof TL_iv.pageBlockMap) && i0.J1(k2Var)) {
            bi biVar = new bi(k2Var.getParentActivity(), k2Var, false, false, false, k2Var.getResourceProvider());
            biVar.T3 = new oa.d(3);
            biVar.G1 = true;
            biVar.r3.setVisibility(8);
            biVar.q4 = new androidx.car.app.utils.a(k2Var, aVar, biVar, 3);
            biVar.d1();
            biVar.show();
        }
    }

    @Override // k2.z
    public void e(boolean z10) {
        hf.b bVar = ((z0) this.b).a1;
        Handler handler = (Handler) bVar.b;
        if (handler != null) {
            handler.post(new v(0, bVar, z10));
        }
    }

    @Override // k2.z
    public void e0(x0 x0Var) {
        hf.b bVar = ((z0) this.b).a1;
        Handler handler = (Handler) bVar.b;
        if (handler != null) {
            handler.post(new t(bVar, x0Var, 0));
        }
    }

    @Override // k2.z
    public void f(long j10) {
        z0 z0Var = (z0) this.b;
        z0Var.m1 = true;
        hf.b bVar = z0Var.a1;
        Handler handler = (Handler) bVar.b;
        if (handler != null) {
            handler.post(new bi.e(bVar, j10, 2));
        }
    }

    @Override // k2.z
    public void f0() {
        i2.m0 m0Var = ((z0) this.b).Y;
        if (m0Var != null) {
            m0Var.a();
        }
    }

    @Override // l.x
    public void g(l.l lVar, boolean z10) {
        g.q qVar;
        r rVar = (r) this.b;
        l.l k10 = lVar.k();
        int i10 = 0;
        boolean z11 = k10 != lVar;
        if (z11) {
            lVar = k10;
        }
        g.q[] qVarArr = rVar.U;
        int length = qVarArr != null ? qVarArr.length : 0;
        while (true) {
            if (i10 < length) {
                qVar = qVarArr[i10];
                if (qVar != null && qVar.h == lVar) {
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

    @Override // jg.c
    public jg.j g0() {
        return ((er0) this.b).B0;
    }

    @Override // org.telegram.ui.Components.mn0
    public CharSequence getContentDescription() {
        fg.k kVar = (fg.k) this.b;
        float f7 = kVar.b;
        return String.valueOf(Math.round((kVar.a.getProgress() * (kVar.c - f7)) + f7));
    }

    @Override // b5.p
    public StaticsBoundaryInterface getStatics() {
        return (StaticsBoundaryInterface) me.b.b(StaticsBoundaryInterface.class, ((WebViewProviderFactoryBoundaryInterface) this.b).getStatics());
    }

    @Override // bi.m0
    public void h0() {
        switch (this.a) {
            case 9:
                b0 b0Var = (b0) this.b;
                x3 x3Var = b0Var.O;
                if (x3Var != null) {
                    bi.a aVar = b0Var.a;
                    d4.R1(x3Var.a);
                    break;
                }
                break;
            default:
                f5 f5Var = (f5) this.b;
                w3 w3Var = f5Var.N;
                if (w3Var != null) {
                    bi.a aVar2 = f5Var.a;
                    d4.R1(w3Var.a);
                    break;
                }
                break;
        }
    }

    @Override // zf.l1
    public void i(int i10) {
        i0.g3(new a3.d(this, 6));
    }

    @Override // k2.z
    public void i0(long j10, int i10, long j11) {
        hf.b bVar = ((z0) this.b).a1;
        Handler handler = (Handler) bVar.b;
        if (handler != null) {
            handler.post(new k2.s(bVar, i10, j10, j11, 0));
        }
    }

    @Override // bi.m0
    public void j() {
        switch (this.a) {
            case 9:
                b0 b0Var = (b0) this.b;
                x3 x3Var = b0Var.O;
                if (x3Var != null) {
                    d4.S1(x3Var.a, b0Var.a);
                    break;
                }
                break;
            default:
                f5 f5Var = (f5) this.b;
                w3 w3Var = f5Var.N;
                if (w3Var != null) {
                    d4.S1(w3Var.a, f5Var.a);
                    break;
                }
                break;
        }
    }

    @Override // com.google.android.gms.common.api.internal.l0
    public com.google.android.gms.common.api.internal.e j0(com.google.android.gms.common.api.internal.e eVar) {
        throw new IllegalStateException("GoogleApiClient is not connected yet.");
    }

    @Override // org.telegram.ui.Components.mn0
    public void k(boolean z10, float f7) {
        fg.k kVar = (fg.k) this.b;
        float f10 = kVar.b;
        float z11 = c3.i0.z(kVar.c, f10, f7, f10);
        kVar.d = z11;
        if (z10) {
            h6 h6Var = kVar.e;
            h6Var.getClass();
            h6Var.c(null, z11);
        }
        kVar.invalidate();
    }

    @Override // androidx.lifecycle.a0
    public void k0(Object obj) {
        CharSequence charSequence = (CharSequence) obj;
        f0 f0Var = (f0) this.b;
        Handler handler = f0Var.A0;
        androidx.activity.i iVar = f0Var.B0;
        handler.removeCallbacks(iVar);
        TextView textView = f0Var.G0;
        if (textView != null) {
            textView.setText(charSequence);
        }
        handler.postDelayed(iVar, 2000L);
    }

    public void l0(StringBuilder sb2, Iterator it) {
        com.google.android.gms.internal.clearcut.e eVar = (com.google.android.gms.internal.clearcut.e) this.b;
        if (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            sb2.append(com.google.android.gms.internal.clearcut.e.c(entry.getKey()));
            sb2.append("=");
            sb2.append(com.google.android.gms.internal.clearcut.e.c(entry.getValue()));
            while (it.hasNext()) {
                sb2.append((CharSequence) eVar.a);
                Map.Entry entry2 = (Map.Entry) it.next();
                sb2.append(com.google.android.gms.internal.clearcut.e.c(entry2.getKey()));
                sb2.append("=");
                sb2.append(com.google.android.gms.internal.clearcut.e.c(entry2.getValue()));
            }
        }
    }

    @Override // androidx.activity.result.b
    public void m(Object obj) {
        switch (this.a) {
            case 5:
                Map map = (Map) obj;
                j0 j0Var = (j0) this.b;
                ArrayList arrayList = new ArrayList(map.values());
                int[] iArr = new int[arrayList.size()];
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    iArr[i10] = ((Boolean) arrayList.get(i10)).booleanValue() ? 0 : -1;
                }
                androidx.fragment.app.f0 f0Var = (androidx.fragment.app.f0) j0Var.F.pollFirst();
                if (f0Var == null) {
                    Log.w("FragmentManager", "No permissions were requested for " + this);
                    break;
                } else {
                    String str = f0Var.a;
                    if (j0Var.c.s(str) == null) {
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
                    com.google.android.gms.internal.play_billing.u.h("ProxyBillingActivityV2", "External offer flow finished with resultCode: " + i11);
                    extras.putInt("INTERNAL_LOG_ERROR_REASON", 134);
                    extras.putString("INTERNAL_LOG_ERROR_ADDITIONAL_DETAILS", "External offer flow finished with error resultCode: " + i11);
                }
                int i12 = com.google.android.gms.internal.play_billing.u.e("ProxyBillingActivityV2", intent).a;
                ResultReceiver resultReceiver = proxyBillingActivityV2.O;
                if (resultReceiver != null) {
                    resultReceiver.send(i12, extras);
                } else {
                    com.google.android.gms.internal.play_billing.u.h("ProxyBillingActivityV2", "External offer flow result receiver is null");
                }
                if (i12 != 0) {
                    com.google.android.gms.internal.play_billing.u.h("ProxyBillingActivityV2", "External offer flow finished with billing responseCode: " + i12);
                }
                proxyBillingActivityV2.finish();
                break;
        }
    }

    public u0 m0(c3.p pVar, q3.g gVar, int i10) {
        e2.x xVar = (e2.x) this.b;
        u0 u0Var = null;
        int i11 = 0;
        loop0: while (true) {
            int i12 = 0;
            do {
                int i13 = i12 % 10;
                int i14 = i13 + 10;
                if (i13 == 0 && i12 != 0) {
                    byte[] bArr = xVar.a;
                    System.arraycopy(bArr, 10, bArr, 0, 9);
                }
                int i15 = i12 == 0 ? 10 : 1;
                try {
                    pVar.b(i14 - i15, i15, xVar.a);
                    xVar.N(i13);
                    xVar.M(i14);
                    if (xVar.a() < 3) {
                        throw new IndexOutOfBoundsException("position=" + xVar.b + ", limit=" + xVar.c);
                    }
                    int D = xVar.D();
                    int i16 = xVar.b - 3;
                    xVar.b = i16;
                    if (D != 4801587) {
                        if (c3.b.h(xVar.i()) != -1) {
                            break loop0;
                        }
                        if (i12 == 0) {
                            xVar.c(20);
                        }
                        i12++;
                    } else {
                        xVar.O(6);
                        int z10 = xVar.z();
                        int i17 = z10 + 10;
                        if (u0Var == null) {
                            byte[] bArr2 = new byte[i17];
                            System.arraycopy(xVar.a, i16, bArr2, 0, 10);
                            pVar.b(10, z10, bArr2);
                            u0Var = new q3.i(gVar).c(i17, bArr2);
                        } else {
                            pVar.l(z10);
                        }
                        i11 += i17;
                    }
                } catch (EOFException unused) {
                }
            } while (i12 <= i10);
        }
        pVar.m();
        pVar.l(i11);
        return u0Var;
    }

    @Override // k2.z
    public void n() {
        ((z0) this.b).l1 = true;
    }

    @Override // k2.z
    public void o() {
        i2.m0 m0Var = ((z0) this.b).Y;
        if (m0Var != null) {
            m0Var.a.i0 = true;
        }
    }

    public synchronized void o0() {
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

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        m mVar = (m) this.b;
        Exception exception = task.getException();
        if (exception != null) {
            mVar.resumeWith(l9.b.a(exception));
        } else if (task.isCanceled()) {
            mVar.n(null);
        } else {
            mVar.resumeWith(task.getResult());
        }
    }

    @Override // bi.b4
    public void onContentChanged() {
        k2 k2Var = (k2) this.b;
        if (k2Var.y0 != null) {
            boolean p32 = k2Var.P.p3();
            k2Var.L0 = p32;
            k2Var.y0.h(p32);
            k2Var.y0.invalidate();
        }
        k2Var.G0();
        Runnable runnable = k2Var.M0;
        i0.r(runnable);
        i0.h3(runnable, 1000L);
    }

    @Override // a3.n0
    public void onFirstFrameRendered() {
        n nVar = (n) this.b;
        Surface surface = nVar.r1;
        if (surface != null) {
            nVar.b1.k0(surface);
            nVar.u1 = true;
        }
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public void onSuccess(Object obj) {
        ((d6.a) this.b).getClass();
        k5.a("com.google.android.gms.cast.MAP_CAST_STATUS_CODES_TO_CAST_REASON_CODES", (Bundle) obj);
    }

    @Override // bi.b4
    public void p(int i10) {
        ((k2) this.b).s0(74, i10);
    }

    @Override // org.telegram.ui.Components.mn0
    public /* synthetic */ int p0() {
        return 0;
    }

    @Override // com.google.android.gms.common.api.internal.l0
    public void q() {
        com.google.android.gms.common.api.internal.n0 n0Var = (com.google.android.gms.common.api.internal.n0) this.b;
        n0Var.a.lock();
        try {
            n0Var.m = new g0(n0Var, n0Var.j, n0Var.k, n0Var.d, n0Var.l, n0Var.a, n0Var.c);
            n0Var.m.Q();
            n0Var.b.signalAll();
        } finally {
            n0Var.a.unlock();
        }
    }

    @Override // bi.b4
    public void r() {
        k2 k2Var = (k2) this.b;
        q3 q3Var = k2Var.P.u3;
        k2Var.B0((q3Var != null && q3Var.x() && k2Var.P.F4()) ? 1 : 0, true);
        k2Var.C0();
        k2Var.A0();
    }

    @Override // jg.c
    public void s() {
        ((er0) this.b).q0(null, true);
    }

    @Override // com.google.android.gms.common.api.internal.w0
    public void t(k6.a aVar) {
        com.google.android.gms.common.api.internal.x xVar = (com.google.android.gms.common.api.internal.x) this.b;
        xVar.o.lock();
        try {
            xVar.m = aVar;
            com.google.android.gms.common.api.internal.x.l(xVar);
        } finally {
            xVar.o.unlock();
        }
    }

    @Override // com.google.android.gms.tasks.SuccessContinuation
    public Task then(Object obj) {
        JSONObject jSONObject;
        FileWriter fileWriter;
        ea.d dVar = (ea.d) this.b;
        ea.a aVar = (ea.a) dVar.f;
        ea.f fVar = (ea.f) dVar.b;
        String str = aVar.b;
        FileWriter fileWriter2 = null;
        try {
            HashMap b10 = ea.a.b(fVar);
            android.support.v4.media.session.a0 a0Var = new android.support.v4.media.session.a0(str, b10);
            a0Var.t("User-Agent", "Crashlytics Android SDK/18.6.0");
            a0Var.t("X-CRASHLYTICS-DEVELOPER-TOKEN", "470fa2b4ae81cd56ecbcda9735803434cec591fa");
            ea.a.a(a0Var, fVar);
            String str2 = "Requesting settings from " + str;
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", str2, null);
            }
            String str3 = "Settings query params were: " + b10;
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", str3, null);
            }
            jSONObject = aVar.c(a0Var.l());
        } catch (IOException e) {
            Log.e("FirebaseCrashlytics", "Settings request failed.", e);
            jSONObject = null;
        }
        if (jSONObject != null) {
            ea.c z10 = ((a4.l) dVar.c).z(jSONObject);
            k6.h hVar = (k6.h) dVar.e;
            long j10 = z10.c;
            hVar.getClass();
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", "Writing settings to cache file...", null);
            }
            try {
                jSONObject.put("expires_at", j10);
                fileWriter = new FileWriter((File) hVar.b);
                try {
                    try {
                        fileWriter.write(jSONObject.toString());
                        fileWriter.flush();
                    } catch (Exception e7) {
                        e = e7;
                        Log.e("FirebaseCrashlytics", "Failed to cache settings", e);
                        x9.h.c(fileWriter, "Failed to close settings writer.");
                        ea.d.f("Loaded settings: ", jSONObject);
                        String str4 = (String) fVar.f;
                        SharedPreferences.Editor edit = ((Context) dVar.a).getSharedPreferences("com.google.firebase.crashlytics", 0).edit();
                        edit.putString("existing_instance_identifier", str4);
                        edit.apply();
                        ((AtomicReference) dVar.h).set(z10);
                        ((TaskCompletionSource) ((AtomicReference) dVar.i).get()).trySetResult(z10);
                        return Tasks.forResult(null);
                    }
                } catch (Throwable th2) {
                    th = th2;
                    fileWriter2 = fileWriter;
                    x9.h.c(fileWriter2, "Failed to close settings writer.");
                    throw th;
                }
            } catch (Exception e10) {
                e = e10;
                fileWriter = null;
            } catch (Throwable th3) {
                th = th3;
                x9.h.c(fileWriter2, "Failed to close settings writer.");
                throw th;
            }
            x9.h.c(fileWriter, "Failed to close settings writer.");
            ea.d.f("Loaded settings: ", jSONObject);
            String str42 = (String) fVar.f;
            SharedPreferences.Editor edit2 = ((Context) dVar.a).getSharedPreferences("com.google.firebase.crashlytics", 0).edit();
            edit2.putString("existing_instance_identifier", str42);
            edit2.apply();
            ((AtomicReference) dVar.h).set(z10);
            ((TaskCompletionSource) ((AtomicReference) dVar.i).get()).trySetResult(z10);
        }
        return Tasks.forResult(null);
    }

    @Override // bi.b4
    public void u() {
        k2 k2Var = (k2) this.b;
        k2Var.I0 = k2Var.K0;
        k2.d0(k2Var, false, false);
        k2Var.B0(2, true);
    }

    @Override // bi.b4
    public void v(a4 a4Var, View view) {
        k2 k2Var = (k2) this.b;
        z60 H = z60.H(k2Var, view);
        H.Q = true;
        k2Var.x0 = t4.c(H, k2Var, k2Var.getParentActivity(), k2Var.getResourceProvider(), a4Var, false);
    }

    @Override // com.google.android.gms.common.api.internal.w0
    public void w(int i10) {
        com.google.android.gms.common.api.internal.x xVar = (com.google.android.gms.common.api.internal.x) this.b;
        Lock lock = xVar.o;
        lock.lock();
        try {
            if (xVar.n) {
                xVar.n = false;
                com.google.android.gms.common.api.internal.x.k(xVar, i10);
            } else {
                xVar.n = true;
                xVar.d.onConnectionSuspended(i10);
            }
            lock.unlock();
        } catch (Throwable th2) {
            lock.unlock();
            throw th2;
        }
    }

    @Override // zf.l1
    public /* synthetic */ a0.h x() {
        return null;
    }

    @Override // bi.m0
    public k9 y() {
        switch (this.a) {
            case 9:
                x3 x3Var = ((b0) this.b).O;
                if (x3Var != null) {
                    return x3Var.a.getTextSelectionHelper();
                }
                return null;
            default:
                w3 w3Var = ((f5) this.b).N;
                if (w3Var != null) {
                    return w3Var.a.getTextSelectionHelper();
                }
                return null;
        }
    }

    @Override // com.google.android.gms.common.api.internal.w0
    public void z(Bundle bundle) {
        com.google.android.gms.common.api.internal.x xVar = (com.google.android.gms.common.api.internal.x) this.b;
        xVar.o.lock();
        try {
            xVar.m = k6.a.e;
            com.google.android.gms.common.api.internal.x.l(xVar);
        } finally {
            xVar.o.unlock();
        }
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
            case 12:
                this.b = new e2.x(10);
                break;
            case 13:
                break;
            case 26:
                this.b = new HashMap();
                break;
            default:
                this.b = new LinkedHashMap(0, 0.75f, true);
                break;
        }
    }

    @Override // bi.b4
    public void A() {
    }

    @Override // org.telegram.ui.Components.mn0
    public void C() {
    }

    @Override // bi.b4
    public void E(int i10) {
    }

    @Override // com.google.android.gms.common.api.internal.l0
    public void K(int i10) {
    }

    @Override // zf.l1
    public /* synthetic */ void c0(ArrayList arrayList) {
    }

    @Override // a3.n0
    public void d(b2 b2Var) {
    }

    @Override // com.google.android.gms.common.api.internal.l0
    public void l(Bundle bundle) {
    }

    @Override // bi.b4
    public void h(n1 n1Var, boolean z10) {
    }

    @Override // com.google.android.gms.common.api.internal.l0
    public void I(k6.a aVar, com.google.android.gms.common.api.e eVar, boolean z10) {
    }
}

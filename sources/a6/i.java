package a6;

import a3.m0;
import ai.d5;
import ai.fc;
import ai.g6;
import ai.gc;
import ai.h6;
import ai.q4;
import ai.q5;
import android.content.Context;
import android.content.Intent;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.SurfaceTexture;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcel;
import android.os.ResultReceiver;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.Log;
import android.view.Surface;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.biometric.e0;
import androidx.lifecycle.a0;
import b5.p;
import ci.b7;
import ci.z6;
import com.android.billingclient.api.ProxyBillingActivityV2;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.internal.g0;
import com.google.android.gms.common.api.internal.k0;
import com.google.android.gms.common.api.internal.s;
import com.google.android.gms.common.api.internal.v0;
import com.google.android.gms.common.api.internal.x;
import com.google.android.gms.internal.play_billing.u;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import e2.v;
import fb.n;
import i2.j0;
import ii.e2;
import ii.e6;
import ii.i1;
import ii.i2;
import ii.k3;
import ii.k4;
import ii.q3;
import ii.r3;
import ii.u3;
import ii.v3;
import ii.v4;
import ii.w3;
import ii.x3;
import ii.z;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import m.p3;
import m.s3;
import org.chromium.support_lib_boundary.StaticsBoundaryInterface;
import org.chromium.support_lib_boundary.WebViewProviderBoundaryInterface;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;
import org.json.JSONException;
import org.json.JSONObject;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Cells.p9;
import org.telegram.ui.Cells.q9;
import org.telegram.ui.Components.p71;
import org.telegram.ui.Components.s71;
import org.telegram.ui.Components.wa0;
import org.telegram.ui.Components.wi;
import org.telegram.ui.Components.y70;
import org.telegram.ui.Stories.ProfileStoriesView;
import org.telegram.ui.d01;
import org.telegram.ui.iz0;
import r0.i0;
import r0.l1;
import v7.u7;

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
/* loaded from: classes.dex */
public final class i implements m0, s, fc, a0, androidx.activity.result.b, p, wa0, p71, k0, v0, OnCompleteListener, n, r0.n, db.n, ii.k0, v3 {
    public static i c;
    public final /* synthetic */ int a;
    public Object b;

    public /* synthetic */ i(int i10, boolean z10) {
        this.a = i10;
    }

    public static synchronized i T(Context context) {
        i V;
        synchronized (i.class) {
            V = V(context.getApplicationContext());
        }
        return V;
    }

    public static synchronized i V(Context context) {
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

    @Override // a3.m0
    public void B() {
        a3.n nVar = (a3.n) this.b;
        if (nVar.n1 != null) {
            nVar.N0(0, 1);
        }
    }

    @Override // ii.k0
    public q9 C() {
        switch (this.a) {
            case 25:
                r3 r3Var = ((z) this.b).O;
                if (r3Var != null) {
                    return r3Var.a.getTextSelectionHelper();
                }
                return null;
            default:
                q3 q3Var = ((v4) this.b).N;
                if (q3Var != null) {
                    return q3Var.a.getTextSelectionHelper();
                }
                return null;
        }
    }

    @Override // a3.m0
    public void D() {
        j0 j0Var = ((a3.n) this.b).W;
        if (j0Var != null) {
            j0Var.a();
        }
    }

    @Override // ii.k0
    public void E(CharSequence charSequence) {
        switch (this.a) {
            case 25:
                r3 r3Var = ((z) this.b).O;
                if (r3Var != null) {
                    r3Var.getClass();
                    if (charSequence != null && charSequence.length() > 0) {
                        r3Var.a.t4(charSequence.toString());
                        break;
                    }
                }
                break;
            default:
                q3 q3Var = ((v4) this.b).N;
                if (q3Var != null) {
                    q3Var.getClass();
                    if (charSequence != null && charSequence.length() > 0) {
                        q3Var.a.t4(charSequence.toString());
                        break;
                    }
                }
                break;
        }
    }

    @Override // ii.v3
    public y70 F(View view) {
        return y70.H((e2) this.b, view);
    }

    @Override // ii.v3
    public void G() {
        e2 e2Var = (e2) this.b;
        e2Var.z0();
        e2Var.C0();
    }

    @Override // com.google.android.gms.common.api.internal.k0
    public boolean H() {
        return true;
    }

    @Override // ii.k0
    public p9 I() {
        switch (this.a) {
            case 25:
                return (z) this.b;
            default:
                return (v4) this.b;
        }
    }

    @Override // ii.v3
    public void J(u3 u3Var, View view) {
        e2 e2Var = (e2) this.b;
        y70 H = y70.H(e2Var, view);
        H.Q = true;
        e2Var.x0 = k4.c(H, e2Var, e2Var.getParentActivity(), e2Var.getResourceProvider(), u3Var, false);
    }

    @Override // com.google.android.gms.common.api.internal.k0
    public com.google.android.gms.common.api.internal.e L(com.google.android.gms.common.api.internal.e eVar) {
        throw new IllegalStateException("GoogleApiClient is not connected yet.");
    }

    @Override // ii.k0
    public ii.a M() {
        switch (this.a) {
            case 25:
                return ((z) this.b).a;
            default:
                return ((v4) this.b).a;
        }
    }

    @Override // ii.k0
    public boolean N() {
        switch (this.a) {
            case 25:
                z zVar = (z) this.b;
                r3 r3Var = zVar.O;
                if (r3Var != null) {
                    ii.a aVar = zVar.a;
                    if (r3Var.a.S4()) {
                    }
                }
                break;
            default:
                v4 v4Var = (v4) this.b;
                q3 q3Var = v4Var.N;
                if (q3Var != null) {
                    ii.a aVar2 = v4Var.a;
                    if (q3Var.a.S4()) {
                    }
                }
                break;
        }
        return false;
    }

    @Override // org.telegram.ui.Components.wa0
    public void O(int i10, int i11, CharSequence charSequence, boolean z10) {
        ci.g gVar = ((ci.m) this.b).f;
        if (gVar == null) {
            return;
        }
        try {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(gVar.getText());
            spannableStringBuilder.replace(i10, i11 + i10, charSequence);
            if (z10) {
                Emoji.replaceEmoji(spannableStringBuilder, gVar.getEditText().getPaint().getFontMetricsInt(), false);
            }
            gVar.setText(spannableStringBuilder);
            gVar.setSelection(i10 + charSequence.length());
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override // ii.k0
    public void Q(int i10, int i11) {
        switch (this.a) {
            case 25:
                z zVar = (z) this.b;
                r3 r3Var = zVar.O;
                if (r3Var != null) {
                    ii.a aVar = zVar.a;
                    i2 i2Var = r3Var.a.J3;
                    if (i2Var != null) {
                        i2Var.f(i10, i11);
                        break;
                    }
                }
                break;
            default:
                v4 v4Var = (v4) this.b;
                q3 q3Var = v4Var.N;
                if (q3Var != null) {
                    ii.a aVar2 = v4Var.a;
                    i2 i2Var2 = q3Var.a.J3;
                    if (i2Var2 != null) {
                        i2Var2.f(i10, i11);
                        break;
                    }
                }
                break;
        }
    }

    @Override // r0.n
    public l1 Q0(View view, l1 l1Var) {
        boolean z10;
        boolean z11;
        int d = l1Var.d();
        g.s sVar = (g.s) this.b;
        Context context = sVar.e;
        int d10 = l1Var.d();
        ActionBarContextView actionBarContextView = sVar.y;
        if (actionBarContextView == null || !(actionBarContextView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            z10 = false;
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) sVar.y.getLayoutParams();
            if (sVar.y.isShown()) {
                if (sVar.l0 == null) {
                    sVar.l0 = new Rect();
                    sVar.m0 = new Rect();
                }
                Rect rect = sVar.l0;
                Rect rect2 = sVar.m0;
                rect.set(l1Var.b(), l1Var.d(), l1Var.c(), l1Var.a());
                ViewGroup viewGroup = sVar.J;
                Method method = s3.a;
                if (method != null) {
                    try {
                        method.invoke(viewGroup, rect, rect2);
                    } catch (Exception e) {
                        Log.d("ViewUtils", "Could not invoke computeFitSystemWindows", e);
                    }
                }
                int i10 = rect.top;
                int i11 = rect.left;
                int i12 = rect.right;
                l1 f7 = i0.f(sVar.J);
                int b10 = f7 == null ? 0 : f7.b();
                int c10 = f7 == null ? 0 : f7.c();
                if (marginLayoutParams.topMargin == i10 && marginLayoutParams.leftMargin == i11 && marginLayoutParams.rightMargin == i12) {
                    z11 = false;
                } else {
                    marginLayoutParams.topMargin = i10;
                    marginLayoutParams.leftMargin = i11;
                    marginLayoutParams.rightMargin = i12;
                    z11 = true;
                }
                if (i10 <= 0 || sVar.L != null) {
                    View view2 = sVar.L;
                    if (view2 != null) {
                        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) view2.getLayoutParams();
                        int i13 = marginLayoutParams2.height;
                        int i14 = marginLayoutParams.topMargin;
                        if (i13 != i14 || marginLayoutParams2.leftMargin != b10 || marginLayoutParams2.rightMargin != c10) {
                            marginLayoutParams2.height = i14;
                            marginLayoutParams2.leftMargin = b10;
                            marginLayoutParams2.rightMargin = c10;
                            sVar.L.setLayoutParams(marginLayoutParams2);
                        }
                    }
                } else {
                    View view3 = new View(context);
                    sVar.L = view3;
                    view3.setVisibility(8);
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, marginLayoutParams.topMargin, 51);
                    layoutParams.leftMargin = b10;
                    layoutParams.rightMargin = c10;
                    sVar.J.addView(sVar.L, -1, layoutParams);
                }
                View view4 = sVar.L;
                r9 = view4 != null;
                if (r9 && view4.getVisibility() != 0) {
                    View view5 = sVar.L;
                    view5.setBackgroundColor((view5.getWindowSystemUiVisibility() & 8192) != 0 ? f0.e.c(context, R.color.abc_decor_view_status_guard_light) : f0.e.c(context, R.color.abc_decor_view_status_guard));
                }
                if (!sVar.Q && r9) {
                    d10 = 0;
                }
                z10 = r9;
                r9 = z11;
            } else if (marginLayoutParams.topMargin != 0) {
                marginLayoutParams.topMargin = 0;
                z10 = false;
            } else {
                z10 = false;
                r9 = false;
            }
            if (r9) {
                sVar.y.setLayoutParams(marginLayoutParams);
            }
        }
        View view6 = sVar.L;
        if (view6 != null) {
            view6.setVisibility(z10 ? 0 : 8);
        }
        return i0.h(view, d != d10 ? l1Var.f(l1Var.b(), d10, l1Var.c(), l1Var.a()) : l1Var);
    }

    public da.a R(JSONObject jSONObject) {
        da.c bVar;
        int i10 = jSONObject.getInt("settings_version");
        if (i10 != 3) {
            Log.e("FirebaseCrashlytics", "Could not determine SettingsJsonTransform for settings version " + i10 + ". Using default settings values.", null);
            bVar = new ob.a(7);
        } else {
            bVar = new qb.b(7);
        }
        return bVar.s2((na.d) this.b, jSONObject);
    }

    public db.i S(Object obj) {
        db.g gVar = ((gb.a0) this.b).b;
        gVar.getClass();
        if (obj == null) {
            return db.k.a;
        }
        Class<?> cls = obj.getClass();
        gb.n nVar = new gb.n();
        gVar.f(obj, cls, nVar);
        return nVar.u();
    }

    public synchronized void U() {
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

    @Override // ii.k0
    public void W() {
        switch (this.a) {
            case 25:
                z zVar = (z) this.b;
                r3 r3Var = zVar.O;
                if (r3Var != null) {
                    ii.a aVar = zVar.a;
                    x3 x3Var = r3Var.a;
                    i2 i2Var = x3Var.J3;
                    if (i2Var != null) {
                        i2Var.g();
                    }
                    x3Var.h3.onContentChanged();
                    break;
                }
                break;
            default:
                v4 v4Var = (v4) this.b;
                q3 q3Var = v4Var.N;
                if (q3Var != null) {
                    ii.a aVar2 = v4Var.a;
                    x3 x3Var2 = q3Var.a;
                    i2 i2Var2 = x3Var2.J3;
                    if (i2Var2 != null) {
                        i2Var2.g();
                    }
                    x3Var2.h3.onContentChanged();
                    break;
                }
                break;
        }
    }

    @Override // ai.fc
    public void Z(long j3, int i10, d5 d5Var) {
        iz0 iz0Var = (iz0) this.b;
        int i11 = ProfileStoriesView.s0;
        iz0Var.f(true, false);
        d5Var.run();
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
                cVar2.G0(obtain, 1);
                break;
            case 22:
                g7.f fVar = (g7.f) this.b;
                h7.f fVar2 = new h7.f(0, (TaskCompletionSource) obj2);
                h7.d dVar = (h7.d) ((h7.e) obj).u();
                com.google.android.gms.common.api.g gVar = new com.google.android.gms.common.api.g(new com.google.android.gms.common.api.h(-1, -1, 0, true));
                Parcel obtain2 = Parcel.obtain();
                obtain2.writeInterfaceToken("com.google.android.gms.identitycredentials.internal.IIdentityCredentialService");
                int i11 = q7.a.a;
                obtain2.writeStrongBinder(fVar2);
                q7.a.b(obtain2, fVar);
                q7.a.b(obtain2, gVar);
                ((h7.b) dVar).G0(obtain2, 6);
                break;
            default:
                l lVar = new l((TaskCompletionSource) obj2);
                i7.i iVar = (i7.i) ((i7.c) obj).u();
                x5.e eVar2 = (x5.e) this.b;
                Parcel K0 = iVar.K0();
                int i12 = i7.f.a;
                K0.writeStrongBinder(lVar);
                i7.f.c(K0, eVar2);
                iVar.L0(K0, 1);
                break;
        }
    }

    @Override // ii.k0, ii.h1
    public void c(i1 i1Var) {
        switch (this.a) {
            case 25:
                r3 r3Var = ((z) this.b).O;
                if (r3Var != null) {
                    x3 x3Var = r3Var.a;
                    x3.M1(x3Var, i1Var);
                    x3Var.h3.t(i1Var, true);
                    break;
                }
                break;
            default:
                q3 q3Var = ((v4) this.b).N;
                if (q3Var != null) {
                    x3 x3Var2 = q3Var.a;
                    x3.M1(x3Var2, i1Var);
                    x3Var2.h3.t(i1Var, true);
                    break;
                }
                break;
        }
    }

    @Override // b5.p
    public WebViewProviderBoundaryInterface createWebView(WebView webView) {
        return (WebViewProviderBoundaryInterface) se.b.a(WebViewProviderBoundaryInterface.class, ((WebViewProviderFactoryBoundaryInterface) this.b).createWebView(webView));
    }

    @Override // ii.v3
    public void d(w3 w3Var, View view) {
        e2 e2Var = (e2) this.b;
        y70 H = y70.H(e2Var, view);
        H.Q = true;
        e2Var.getParentActivity();
        e2Var.getResourceProvider();
        e2Var.x0 = k4.b(H, e2Var, w3Var, false);
    }

    @Override // ii.v3
    public boolean e(float f7) {
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

    @Override // ai.fc
    public boolean f1(long j3, int i10, int i11, int i12, gc gcVar) {
        ImageReceiver imageReceiver;
        h6 h6Var;
        h6 h6Var2;
        gcVar.b = null;
        gcVar.c = null;
        iz0 iz0Var = (iz0) this.b;
        d01 d01Var = iz0Var.h;
        ArrayList arrayList = iz0Var.w;
        if (iz0Var.N < 0.2f) {
            gcVar.b = d01Var.getImageReceiver();
            gcVar.c = null;
            gcVar.a = d01Var;
            gcVar.h = 0.0f;
            gcVar.i = AndroidUtilities.displaySize.y;
            gcVar.g = (View) iz0Var.getParent();
            gcVar.d = iz0Var.y;
            gcVar.n = true;
            return true;
        }
        int i13 = 0;
        while (true) {
            if (i13 >= arrayList.size()) {
                imageReceiver = null;
                h6Var = null;
                h6Var2 = null;
                break;
            }
            h6 h6Var3 = (h6) arrayList.get(i13);
            if (h6Var3.e >= 1.0f && h6Var3.a == i11) {
                int i14 = i13 - 1;
                int i15 = i13 - 2;
                h6 d = ProfileStoriesView.d(i14 >= 0 ? (h6) arrayList.get(i14) : null, i15 >= 0 ? (h6) arrayList.get(i15) : null, h6Var3);
                imageReceiver = h6Var3.b;
                h6Var2 = d;
                h6Var = h6Var3;
            }
            i13++;
        }
        if (imageReceiver == null) {
            return false;
        }
        gcVar.c = imageReceiver;
        gcVar.b = null;
        gcVar.a = iz0Var;
        gcVar.h = 0.0f;
        gcVar.i = AndroidUtilities.displaySize.y;
        gcVar.g = (View) iz0Var.getParent();
        if (h6Var == null || h6Var2 == null) {
            gcVar.f = null;
            return true;
        }
        gcVar.f = new g6(this, new RectF(h6Var.m), h6Var, new RectF(h6Var2.m), h6Var2);
        return true;
    }

    @Override // ii.v3
    public void g(e6 e6Var, String str) {
        e2 e2Var = (e2) this.b;
        if (e2Var.z0 == null) {
            e2Var.z0 = new p3(new ei.d5(this, 15), e2Var.getResourceProvider());
        }
        e2Var.z0.d(e6Var, str);
    }

    @Override // b5.p
    public StaticsBoundaryInterface getStatics() {
        return (StaticsBoundaryInterface) se.b.a(StaticsBoundaryInterface.class, ((WebViewProviderFactoryBoundaryInterface) this.b).getStatics());
    }

    @Override // ii.k0
    public void h() {
        switch (this.a) {
            case 25:
                z zVar = (z) this.b;
                r3 r3Var = zVar.O;
                if (r3Var != null) {
                    x3.P1(r3Var.a, zVar.a);
                    break;
                }
                break;
            default:
                v4 v4Var = (v4) this.b;
                q3 q3Var = v4Var.N;
                if (q3Var != null) {
                    x3.P1(q3Var.a, v4Var.a);
                    break;
                }
                break;
        }
    }

    @Override // ii.v3
    public void i(int i10) {
        ((e2) this.b).o0(74, i10);
    }

    @Override // com.google.android.gms.common.api.internal.k0
    public void j() {
        com.google.android.gms.common.api.internal.m0 m0Var = (com.google.android.gms.common.api.internal.m0) this.b;
        m0Var.a.lock();
        try {
            m0Var.m = new g0(m0Var, m0Var.j, m0Var.k, m0Var.d, m0Var.l, m0Var.a, m0Var.c);
            m0Var.m.y();
            m0Var.b.signalAll();
        } finally {
            m0Var.a.unlock();
        }
    }

    @Override // androidx.activity.result.b
    public void k(Object obj) {
        switch (this.a) {
            case 5:
                Map map = (Map) obj;
                androidx.fragment.app.k0 k0Var = (androidx.fragment.app.k0) this.b;
                ArrayList arrayList = new ArrayList(map.values());
                int[] iArr = new int[arrayList.size()];
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    iArr[i10] = ((Boolean) arrayList.get(i10)).booleanValue() ? 0 : -1;
                }
                androidx.fragment.app.g0 g0Var = (androidx.fragment.app.g0) k0Var.F.pollFirst();
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

    @Override // ii.k0
    public void k0() {
        switch (this.a) {
            case 25:
                z zVar = (z) this.b;
                r3 r3Var = zVar.O;
                if (r3Var != null) {
                    ii.a aVar = zVar.a;
                    x3.O1(r3Var.a);
                    break;
                }
                break;
            default:
                v4 v4Var = (v4) this.b;
                q3 q3Var = v4Var.N;
                if (q3Var != null) {
                    ii.a aVar2 = v4Var.a;
                    x3.O1(q3Var.a);
                    break;
                }
                break;
        }
    }

    @Override // ii.v3
    public void l() {
        e2 e2Var = (e2) this.b;
        k3 k3Var = e2Var.P.n3;
        e2Var.x0((k3Var != null && k3Var.y() && e2Var.P.C4()) ? 1 : 0, true);
        e2Var.y0();
        e2Var.w0();
    }

    @Override // com.google.android.gms.common.api.internal.v0
    public void m(k6.a aVar) {
        x xVar = (x) this.b;
        xVar.o.lock();
        try {
            xVar.m = aVar;
            x.l(xVar);
        } finally {
            xVar.o.unlock();
        }
    }

    @Override // androidx.lifecycle.a0
    public void m0(Object obj) {
        CharSequence charSequence = (CharSequence) obj;
        e0 e0Var = (e0) this.b;
        Handler handler = e0Var.A0;
        q4 q4Var = e0Var.B0;
        handler.removeCallbacks(q4Var);
        TextView textView = e0Var.G0;
        if (textView != null) {
            textView.setText(charSequence);
        }
        handler.postDelayed(q4Var, 2000L);
    }

    @Override // b5.p
    public String[] n() {
        return ((WebViewProviderFactoryBoundaryInterface) this.b).getSupportedFeatures();
    }

    @Override // ii.v3
    public void o() {
        e2 e2Var = (e2) this.b;
        e2Var.I0 = e2Var.K0;
        e2.Z(e2Var, false, false);
        e2Var.x0(2, true);
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        switch (this.a) {
            case 15:
                d6.c.h((d6.c) ((d6.j) this.b).c, "launchApplication", task);
                break;
            default:
                zd.m mVar = (zd.m) this.b;
                Exception exception = task.getException();
                if (exception != null) {
                    mVar.resumeWith(u7.a(exception));
                    break;
                } else if (!task.isCanceled()) {
                    mVar.resumeWith(task.getResult());
                    break;
                } else {
                    mVar.n(null);
                    break;
                }
        }
    }

    @Override // ii.v3
    public void onContentChanged() {
        e2 e2Var = (e2) this.b;
        if (e2Var.y0 != null) {
            boolean m32 = e2Var.P.m3();
            e2Var.L0 = m32;
            e2Var.y0.h(m32);
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
        Surface surface = nVar.n1;
        if (surface != null) {
            nVar.Z0.S(surface);
            nVar.q1 = true;
        }
    }

    @Override // org.telegram.ui.Components.p71
    public /* synthetic */ void onRenderedFirstFrame(j2.a aVar) {
    }

    @Override // org.telegram.ui.Components.p71
    public void onStateChanged(boolean z10, int i10) {
        b7 b7Var = (b7) this.b;
        z6 z6Var = b7Var.L;
        AndroidUtilities.cancelRunOnUIThread(z6Var);
        s71 s71Var = b7Var.y;
        if (s71Var == null || !s71Var.y()) {
            return;
        }
        AndroidUtilities.runOnUIThread(z6Var);
    }

    @Override // org.telegram.ui.Components.p71
    public /* synthetic */ boolean onSurfaceDestroyed(SurfaceTexture surfaceTexture) {
        return false;
    }

    @Override // org.telegram.ui.Components.p71
    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        ((b7) this.b).i();
    }

    @Override // ii.v3
    public void p(ii.a aVar) {
        e2 e2Var = (e2) this.b;
        if (aVar != null && (aVar.b instanceof TL_iv.pageBlockMap) && AndroidUtilities.isMapsInstalled(e2Var)) {
            wi wiVar = new wi(e2Var.getParentActivity(), e2Var, false, false, false, e2Var.getResourceProvider());
            wiVar.Z1 = new qb.b(11);
            wiVar.P = true;
            wiVar.x1.setVisibility(8);
            wiVar.t2 = new q5(e2Var, aVar, wiVar, 11);
            wiVar.r1();
            wiVar.show();
        }
    }

    @Override // fb.n
    public Object p2() {
        Class cls = (Class) this.b;
        try {
            return fb.s.a.a(cls);
        } catch (Exception e) {
            throw new RuntimeException("Unable to create instance of " + cls + ". Registering an InstanceCreator or a TypeAdapter for this type, or adding a no-args constructor may fix this problem.", e);
        }
    }

    @Override // com.google.android.gms.common.api.internal.v0
    public void q(int i10) {
        x xVar = (x) this.b;
        Lock lock = xVar.o;
        lock.lock();
        try {
            if (xVar.n) {
                xVar.n = false;
                x.k(xVar, i10);
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

    @Override // com.google.android.gms.common.api.internal.v0
    public void r(Bundle bundle) {
        x xVar = (x) this.b;
        xVar.o.lock();
        try {
            xVar.m = k6.a.e;
            x.l(xVar);
        } finally {
            xVar.o.unlock();
        }
    }

    @Override // org.telegram.ui.Components.wa0
    public Paint.FontMetricsInt w() {
        return ((ci.m) this.b).f.getEditText().getPaint().getFontMetricsInt();
    }

    @Override // com.google.android.gms.common.api.internal.k0
    public void y() {
        com.google.android.gms.common.api.internal.m0 m0Var = (com.google.android.gms.common.api.internal.m0) this.b;
        Iterator it = m0Var.f.values().iterator();
        while (it.hasNext()) {
            ((com.google.android.gms.common.api.c) it.next()).disconnect();
        }
        m0Var.o.F = Collections.EMPTY_SET;
    }

    @Override // ii.v3
    public void z() {
        e2 e2Var = (e2) this.b;
        e2.Z(e2Var, false, true);
        int i10 = e2Var.I0;
        e2Var.x0(i10 != 2 ? i10 : 0, true);
    }

    public /* synthetic */ i(i7.b bVar, x5.e eVar) {
        this.a = 24;
        this.b = eVar;
    }

    @Override // org.telegram.ui.Components.p71
    public void onRenderedFirstFrame() {
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
                this.b = new v(10);
                break;
            default:
                this.b = new LinkedHashMap(0, 0.75f, true);
                break;
        }
    }

    @Override // a3.m0
    public void K() {
    }

    @Override // ii.v3
    public void s() {
    }

    @Override // org.telegram.ui.Components.wa0
    public /* synthetic */ void P(String str) {
    }

    @Override // com.google.android.gms.common.api.internal.k0
    public void a(Bundle bundle) {
    }

    @Override // ai.fc
    public /* synthetic */ void b(boolean z10) {
    }

    @Override // org.telegram.ui.Components.p71
    public /* synthetic */ void onSeekFinished(j2.a aVar) {
    }

    @Override // org.telegram.ui.Components.p71
    public /* synthetic */ void onSeekStarted(j2.a aVar) {
    }

    @Override // ii.v3
    public void u(int i10) {
    }

    @Override // com.google.android.gms.common.api.internal.k0
    public void x(int i10) {
    }

    @Override // org.telegram.ui.Components.p71
    public void onError(s71 s71Var, Exception exc) {
    }

    @Override // ii.v3
    public void t(i1 i1Var, boolean z10) {
    }

    @Override // org.telegram.ui.Components.wa0
    public /* synthetic */ void A(TLRPC.TL_document tL_document, String str, Object obj) {
    }

    @Override // org.telegram.ui.Components.wa0
    public /* synthetic */ void f(TLRPC.BotInlineResult botInlineResult, boolean z10, int i10) {
    }

    @Override // com.google.android.gms.common.api.internal.k0
    public void v(k6.a aVar, com.google.android.gms.common.api.e eVar, boolean z10) {
    }

    @Override // org.telegram.ui.Components.p71
    public void onVideoSizeChanged(int i10, int i11, int i12, float f7) {
    }
}

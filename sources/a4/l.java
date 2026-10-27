package a4;

import a8.ca;
import a8.jd;
import a8.rd;
import a8.yb;
import ag.r0;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcel;
import android.support.v4.media.MediaMetadataCompat;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.FrameLayout;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.fragment.app.e0;
import androidx.lifecycle.a0;
import bi.h7;
import bi.r3;
import c2.s;
import c5.p;
import com.google.android.gms.cast.MediaInfo;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.r;
import com.google.android.gms.common.api.internal.w0;
import com.google.android.gms.identitycredentials.GetCredentialRequest;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.TaskCompletionSource;
import d5.z;
import di.q4;
import f6.o;
import fi.ta;
import h6.n;
import i2.m0;
import ig.j1;
import ig.z1;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import k2.t;
import k2.u;
import k2.v0;
import k2.x0;
import k2.y;
import li.b2;
import li.q;
import m.u3;
import org.chromium.support_lib_boundary.StaticsBoundaryInterface;
import org.chromium.support_lib_boundary.WebViewProviderBoundaryInterface;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;
import org.json.JSONObject;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.cr0;
import org.telegram.ui.Components.e5;
import org.telegram.ui.Components.qc;
import org.telegram.ui.pi0;
import r0.b0;
import r0.i0;
import r0.k1;
import rg.m;
import rg.q1;
import rg.s0;
import sg.w1;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final class l implements z3.d, a0, androidx.activity.result.b, oe.d, cr0, p, OnSuccessListener, n, fe.b, w1, r0.n, hb.n, r, z1, y, e5 {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ l(b6.i iVar) {
        this.a = 11;
        this.b = (com.google.android.gms.internal.play_billing.r) iVar.b;
    }

    public void A(String str, Bitmap bitmap) {
        a0.f fVar = MediaMetadataCompat.d;
        if (fVar.containsKey(str) && ((Integer) fVar.get(str)).intValue() != 2) {
            throw new IllegalArgumentException(a1.g.p("The ", str, " key cannot be used to put a Bitmap"));
        }
        ((Bundle) this.b).putParcelable(str, bitmap);
    }

    public void B(long j10) {
        a0.f fVar = MediaMetadataCompat.d;
        if (fVar.containsKey("android.media.metadata.DURATION") && ((Integer) fVar.get("android.media.metadata.DURATION")).intValue() != 0) {
            throw new IllegalArgumentException("The android.media.metadata.DURATION key cannot be used to put a long");
        }
        ((Bundle) this.b).putLong("android.media.metadata.DURATION", j10);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // fe.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object C(fe.c cVar, nd.c cVar2) {
        fe.a aVar;
        int i10;
        Throwable th2;
        ge.g gVar;
        if (cVar2 instanceof fe.a) {
            aVar = (fe.a) cVar2;
            int i11 = aVar.d;
            if ((i11 & TLObject.FLAG_31) != 0) {
                aVar.d = i11 - TLObject.FLAG_31;
                Object obj = aVar.b;
                md.a aVar2 = md.a.a;
                i10 = aVar.d;
                jd.i iVar = jd.i.a;
                if (i10 != 0) {
                    jd.b(obj);
                    ge.g gVar2 = new ge.g(cVar, aVar.getContext());
                    try {
                        aVar.a = gVar2;
                        aVar.d = 1;
                        Object invoke = ((k1.n) this.b).invoke(gVar2, aVar);
                        if (invoke != aVar2) {
                            invoke = iVar;
                        }
                        if (invoke == aVar2) {
                            return aVar2;
                        }
                        gVar = gVar2;
                    } catch (Throwable th3) {
                        th2 = th3;
                        gVar = gVar2;
                        gVar.releaseIntercepted();
                        throw th2;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    gVar = aVar.a;
                    try {
                        jd.b(obj);
                    } catch (Throwable th4) {
                        th2 = th4;
                        gVar.releaseIntercepted();
                        throw th2;
                    }
                }
                gVar.releaseIntercepted();
                return iVar;
            }
        }
        aVar = new fe.a(this, cVar2);
        Object obj2 = aVar.b;
        md.a aVar22 = md.a.a;
        i10 = aVar.d;
        jd.i iVar2 = jd.i.a;
        if (i10 != 0) {
        }
        gVar.releaseIntercepted();
        return iVar2;
    }

    @Override // k2.y
    public void D(v0 v0Var) {
        rf.b bVar = ((x0) this.b).a1;
        Handler handler = (Handler) bVar.b;
        if (handler != null) {
            handler.post(new u(bVar, v0Var, 1));
        }
    }

    @Override // oe.d
    public void E(int i10, float f7, float f10, oe.e eVar) {
        ((bh.u) this.b).f0(f7);
    }

    public void F(String str, String str2) {
        a0.f fVar = MediaMetadataCompat.d;
        if (fVar.containsKey(str) && ((Integer) fVar.get(str)).intValue() != 1) {
            throw new IllegalArgumentException(a1.g.p("The ", str, " key cannot be used to put a String"));
        }
        ((Bundle) this.b).putCharSequence(str, str2);
    }

    @Override // org.telegram.ui.Components.e5
    public void G(int i10, int i11, boolean z10) {
        switch (this.a) {
            case 28:
                ((q) this.b).K(i10, z10, i11, false, 0L);
                q qVar = (q) this.b;
                pi0 pi0Var = qVar.O;
                if (pi0Var != null) {
                    pi0Var.h();
                    qVar.O = null;
                    break;
                }
                break;
            default:
                ((b2) this.b).t0(i10, i11, z10);
                break;
        }
    }

    public JSONObject H() {
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
                        jSONObject = new JSONObject(y9.h.j(fileInputStream));
                        fileInputStream2 = fileInputStream;
                    } catch (Exception e) {
                        e = e;
                        Log.e("FirebaseCrashlytics", "Failed to fetch cached settings", e);
                        y9.h.c(fileInputStream, "Error while closing settings cache file.");
                        return null;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    fileInputStream2 = fileInputStream;
                    y9.h.c(fileInputStream2, "Error while closing settings cache file.");
                    throw th;
                }
            } else {
                if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                    Log.v("FirebaseCrashlytics", "Settings file does not exist.", null);
                }
                jSONObject = null;
            }
            y9.h.c(fileInputStream2, "Error while closing settings cache file.");
            return jSONObject;
        } catch (Exception e10) {
            e = e10;
            fileInputStream = null;
        } catch (Throwable th3) {
            th = th3;
            y9.h.c(fileInputStream2, "Error while closing settings cache file.");
            throw th;
        }
    }

    @Override // k2.y
    public void J(v0 v0Var) {
        rf.b bVar = ((x0) this.b).a1;
        Handler handler = (Handler) bVar.b;
        if (handler != null) {
            handler.post(new u(bVar, v0Var, 0));
        }
    }

    @Override // k2.y
    public void N() {
        m0 m0Var = ((x0) this.b).Y;
        if (m0Var != null) {
            m0Var.a();
        }
    }

    @Override // r0.n
    public k1 P0(View view, k1 k1Var) {
        boolean z10;
        boolean z11;
        int d = k1Var.d();
        g.r rVar = (g.r) this.b;
        Context context = rVar.e;
        int d10 = k1Var.d();
        ActionBarContextView actionBarContextView = rVar.y;
        if (actionBarContextView == null || !(actionBarContextView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            z10 = false;
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) rVar.y.getLayoutParams();
            if (rVar.y.isShown()) {
                if (rVar.l0 == null) {
                    rVar.l0 = new Rect();
                    rVar.m0 = new Rect();
                }
                Rect rect = rVar.l0;
                Rect rect2 = rVar.m0;
                rect.set(k1Var.b(), k1Var.d(), k1Var.c(), k1Var.a());
                ViewGroup viewGroup = rVar.J;
                Method method = u3.a;
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
                ViewGroup viewGroup2 = rVar.J;
                WeakHashMap weakHashMap = i0.a;
                k1 a2 = b0.a(viewGroup2);
                int b10 = a2 == null ? 0 : a2.b();
                int c10 = a2 == null ? 0 : a2.c();
                if (marginLayoutParams.topMargin == i10 && marginLayoutParams.leftMargin == i11 && marginLayoutParams.rightMargin == i12) {
                    z11 = false;
                } else {
                    marginLayoutParams.topMargin = i10;
                    marginLayoutParams.leftMargin = i11;
                    marginLayoutParams.rightMargin = i12;
                    z11 = true;
                }
                if (i10 <= 0 || rVar.L != null) {
                    View view2 = rVar.L;
                    if (view2 != null) {
                        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) view2.getLayoutParams();
                        int i13 = marginLayoutParams2.height;
                        int i14 = marginLayoutParams.topMargin;
                        if (i13 != i14 || marginLayoutParams2.leftMargin != b10 || marginLayoutParams2.rightMargin != c10) {
                            marginLayoutParams2.height = i14;
                            marginLayoutParams2.leftMargin = b10;
                            marginLayoutParams2.rightMargin = c10;
                            rVar.L.setLayoutParams(marginLayoutParams2);
                        }
                    }
                } else {
                    View view3 = new View(context);
                    rVar.L = view3;
                    view3.setVisibility(8);
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, marginLayoutParams.topMargin, 51);
                    layoutParams.leftMargin = b10;
                    layoutParams.rightMargin = c10;
                    rVar.J.addView(rVar.L, -1, layoutParams);
                }
                View view4 = rVar.L;
                r9 = view4 != null;
                if (r9 && view4.getVisibility() != 0) {
                    View view5 = rVar.L;
                    view5.setBackgroundColor((view5.getWindowSystemUiVisibility() & 8192) != 0 ? context.getColor(R.color.abc_decor_view_status_guard_light) : context.getColor(R.color.abc_decor_view_status_guard));
                }
                if (!rVar.Q && r9) {
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
                rVar.y.setLayoutParams(marginLayoutParams);
            }
        }
        View view6 = rVar.L;
        if (view6 != null) {
            view6.setVisibility(z10 ? 0 : 8);
        }
        return i0.h(view, d != d10 ? k1Var.f(k1Var.b(), d10, k1Var.c(), k1Var.a()) : k1Var);
    }

    @Override // androidx.lifecycle.a0
    public void Q(Object obj) {
        CharSequence charSequence = (CharSequence) obj;
        androidx.biometric.p pVar = (androidx.biometric.p) this.b;
        if (charSequence != null) {
            if (pVar.R()) {
                pVar.W(charSequence);
            }
            pVar.l0.d(null);
        }
    }

    @Override // org.telegram.ui.Components.cr0
    public /* synthetic */ void R() {
        int i10 = this.a;
    }

    @Override // ig.z1
    public /* synthetic */ a0.h U() {
        return null;
    }

    @Override // hb.n
    public Object U1() {
        Constructor constructor = (Constructor) this.b;
        try {
            return constructor.newInstance(null);
        } catch (IllegalAccessException e) {
            rd rdVar = kb.c.a;
            throw new RuntimeException("Unexpected IllegalAccessException occurred (Gson 2.11.0). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers.", e);
        } catch (InstantiationException e10) {
            throw new RuntimeException("Failed to invoke constructor '" + kb.c.b(constructor) + "' with no args", e10);
        } catch (InvocationTargetException e11) {
            throw new RuntimeException("Failed to invoke constructor '" + kb.c.b(constructor) + "' with no args", e11.getCause());
        }
    }

    @Override // sg.w1
    public void V(float f7) {
        ta taVar = (ta) this.b;
        s0.e(taVar.u1).k(String.valueOf(m.a.indexOf(taVar.D0.getCurrentBrush())), f7);
        q1 q1Var = taVar.p1;
        q1Var.c = f7;
        taVar.B0(q1Var, null, false);
    }

    @Override // k2.y
    public void a(long j10) {
        x0 x0Var = (x0) this.b;
        x0Var.m1 = true;
        rf.b bVar = x0Var.a1;
        Handler handler = (Handler) bVar.b;
        if (handler != null) {
            handler.post(new r3(bVar, j10, 13));
        }
    }

    @Override // com.google.android.gms.common.api.internal.r
    public void accept(Object obj, Object obj2) {
        GetCredentialRequest getCredentialRequest = (GetCredentialRequest) this.b;
        i7.f fVar = new i7.f(1, (TaskCompletionSource) obj2);
        i7.d dVar = (i7.d) ((i7.e) obj).u();
        com.google.android.gms.common.api.g gVar = new com.google.android.gms.common.api.g(new com.google.android.gms.common.api.h(-1, -1, 0, true));
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken("com.google.android.gms.identitycredentials.internal.IIdentityCredentialService");
        int i10 = r7.a.a;
        obtain.writeStrongBinder(fVar);
        r7.a.b(obtain, getCredentialRequest);
        r7.a.b(obtain, gVar);
        ((i7.b) dVar).F0(obtain, 1);
    }

    @Override // c5.p
    public String[] b() {
        return ((WebViewProviderFactoryBoundaryInterface) this.b).getSupportedFeatures();
    }

    @Override // z3.d
    public int c(long j10) {
        return j10 < 0 ? 0 : -1;
    }

    @Override // c5.p
    public WebViewProviderBoundaryInterface createWebView(WebView webView) {
        return (WebViewProviderBoundaryInterface) ve.b.a(WebViewProviderBoundaryInterface.class, ((WebViewProviderFactoryBoundaryInterface) this.b).createWebView(webView));
    }

    @Override // androidx.activity.result.b
    public void d(Object obj) {
        androidx.activity.result.a aVar = (androidx.activity.result.a) obj;
        androidx.fragment.app.i0 i0Var = (androidx.fragment.app.i0) this.b;
        e0 e0Var = (e0) i0Var.F.pollLast();
        if (e0Var == null) {
            Log.w("FragmentManager", "No Activities were started for result for " + this);
            return;
        }
        String str = e0Var.a;
        int i10 = e0Var.b;
        androidx.fragment.app.r g7 = i0Var.c.g(str);
        if (g7 != null) {
            g7.x(i10, aVar.a, aVar.b);
            return;
        }
        Log.w("FragmentManager", "Activity result delivered for unknown Fragment " + str);
    }

    @Override // z3.d
    public long e(int i10) {
        yb.g(i10 == 0);
        return 0L;
    }

    @Override // ig.z1
    public void f(int i10) {
        ((j1) this.b).l();
    }

    @Override // z3.d
    public List g(long j10) {
        return j10 >= 0 ? (List) this.b : Collections.EMPTY_LIST;
    }

    @Override // sg.w1
    public float get() {
        ta taVar = (ta) this.b;
        int i10 = taVar.u1;
        m currentBrush = taVar.D0.getCurrentBrush();
        return currentBrush == null ? s0.e(i10).i : s0.e(i10).f(String.valueOf(m.a.indexOf(currentBrush)), currentBrush.d());
    }

    @Override // c5.p
    public StaticsBoundaryInterface getStatics() {
        return (StaticsBoundaryInterface) ve.b.a(StaticsBoundaryInterface.class, ((WebViewProviderFactoryBoundaryInterface) this.b).getStatics());
    }

    @Override // h6.n
    public void h(String str, long j10, long j11, long j12) {
        o oVar = (o) this.b;
        try {
            oVar.a(new f6.n(new Status(2103, null, null, null), 1));
        } catch (IllegalStateException e) {
            h6.b bVar = f6.h.k;
            Log.e(bVar.a, bVar.d("Result already set when calling onRequestReplaced", new Object[0]), e);
        }
        Iterator it = oVar.q.i.iterator();
        while (it.hasNext()) {
            ((f6.g) it.next()).h(str, j10, 2103, j11, j12);
        }
    }

    @Override // k2.y
    public void i() {
        ((x0) this.b).l1 = true;
    }

    @Override // k2.y
    public void j() {
        m0 m0Var = ((x0) this.b).Y;
        if (m0Var != null) {
            m0Var.a.i0 = true;
        }
    }

    @Override // z3.d
    public int k() {
        return 1;
    }

    @Override // ig.z1
    public /* synthetic */ boolean k0(int i10) {
        return true;
    }

    public void l(StringBuilder sb2, Iterator it) {
        d5.j jVar = (d5.j) this.b;
        if (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            sb2.append(d5.j.f(entry.getKey()));
            sb2.append("=");
            sb2.append(d5.j.f(entry.getValue()));
            while (it.hasNext()) {
                sb2.append((CharSequence) jVar.a);
                Map.Entry entry2 = (Map.Entry) it.next();
                sb2.append(d5.j.f(entry2.getKey()));
                sb2.append("=");
                sb2.append(d5.j.f(entry2.getValue()));
            }
        }
    }

    @Override // k2.y
    public void m(int i10, long j10, long j11) {
        rf.b bVar = ((x0) this.b).a1;
        Handler handler = (Handler) bVar.b;
        if (handler != null) {
            handler.post(new t(bVar, i10, j10, j11, 0));
        }
    }

    @Override // k2.y
    public void n() {
        x2.o oVar;
        x0 x0Var = (x0) this.b;
        synchronized (x0Var.a) {
            oVar = x0Var.H;
        }
        if (oVar != null) {
            oVar.m();
        }
    }

    public d6.o o() {
        d6.o oVar = (d6.o) this.b;
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

    @Override // k2.y
    public void onAudioSessionIdChanged(int i10) {
        r2.j jVar;
        x0 x0Var = (x0) this.b;
        if (Build.VERSION.SDK_INT >= 35 && (jVar = x0Var.c1) != null) {
            jVar.d(i10);
        }
        rf.b bVar = x0Var.a1;
        Handler handler = (Handler) bVar.b;
        if (handler != null) {
            handler.post(new r0(bVar, i10, 15));
        }
    }

    @Override // k2.y
    public void onSkipSilenceEnabledChanged(boolean z10) {
        rf.b bVar = ((x0) this.b).a1;
        Handler handler = (Handler) bVar.b;
        if (handler != null) {
            handler.post(new bh.n(12, bVar, z10));
        }
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public void onSuccess(Object obj) {
        ((e6.a) this.b).getClass();
        ca.a("com.google.android.gms.cast.MAP_CAST_STATUS_CODES_TO_CAST_REASON_CODES", (Bundle) obj);
    }

    /* JADX WARN: Code restructure failed: missing block: B:222:0x034c, code lost:
    
        throw ec.c.a();
     */
    /* JADX WARN: Removed duplicated region for block: B:176:0x03a7 A[LOOP:21: B:146:0x022c->B:176:0x03a7, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0376 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public s p(c2.b bVar) {
        int e;
        jc.e eVar;
        jc.c cVar;
        int i10;
        int i11;
        fc.c cVar2;
        int e10;
        jc.f t10 = bVar.t();
        jc.c cVar3 = bVar.s().a;
        jc.d s10 = bVar.s();
        jc.f t11 = bVar.t();
        int i12 = m1.j.d(8)[s10.b];
        fc.b bVar2 = (fc.b) bVar.b;
        int i13 = bVar2.b;
        int i14 = 0;
        for (int i15 = 0; i15 < i13; i15++) {
            for (int i16 = 0; i16 < i13; i16++) {
                if (ic.a.a(i12, i15, i16)) {
                    bVar2.a(i16, i15);
                }
            }
        }
        int i17 = t11.a * 4;
        int i18 = i17 + 17;
        int i19 = t11.d;
        fc.b bVar3 = new fc.b(i18, i18);
        bVar3.d(0, 0, 9, 9);
        int i20 = i17 + 9;
        bVar3.d(i20, 0, 8, 9);
        bVar3.d(0, i20, 9, 8);
        int[] iArr = t11.b;
        int length = iArr.length;
        int i21 = 0;
        while (i21 < length) {
            int i22 = iArr[i21] - 2;
            for (int i23 = i14; i23 < length; i23++) {
                if ((i21 != 0 || (i23 != 0 && i23 != length - 1)) && (i21 != length - 1 || i23 != 0)) {
                    bVar3.d(iArr[i23] - 2, i22, 5, 5);
                }
            }
            i21++;
            i14 = 0;
        }
        int i24 = 2;
        int i25 = 6;
        int i26 = 1;
        bVar3.d(6, 9, 1, i17);
        bVar3.d(9, 6, i17, 1);
        if (t11.a > 6) {
            int i27 = i17 + 6;
            bVar3.d(i27, 0, 3, 6);
            bVar3.d(0, i27, 6, 3);
        }
        byte[] bArr = new byte[i19];
        int i28 = i13 - 1;
        int i29 = i28;
        boolean z10 = true;
        int i30 = 0;
        int i31 = 0;
        int i32 = 0;
        while (i29 > 0) {
            if (i29 == i25) {
                i29--;
            }
            int i33 = 0;
            while (i33 < i13) {
                int i34 = z10 ? i28 - i33 : i33;
                int i35 = i26;
                int i36 = 0;
                for (int i37 = i24; i36 < i37; i37 = 2) {
                    int i38 = i29 - i36;
                    if (!bVar3.b(i38, i34)) {
                        i31++;
                        i32 <<= 1;
                        if (bVar2.b(i38, i34)) {
                            i32 |= 1;
                        }
                        if (i31 == 8) {
                            bArr[i30] = (byte) i32;
                            i30++;
                            i31 = 0;
                            i32 = 0;
                        }
                    }
                    i36++;
                }
                i33++;
                i26 = i35;
                i24 = 2;
            }
            z10 = !z10;
            i29 -= 2;
            i25 = 6;
            i24 = 2;
        }
        int i39 = i26;
        if (i30 != i19) {
            throw ec.c.a();
        }
        if (i19 != t10.d) {
            throw new IllegalArgumentException();
        }
        z zVar = t10.c[cVar3.ordinal()];
        b2.v0[] v0VarArr = (b2.v0[]) zVar.c;
        int i40 = zVar.b;
        int i41 = 0;
        for (b2.v0 v0Var : v0VarArr) {
            i41 += v0Var.a;
        }
        jc.a[] aVarArr = new jc.a[i41];
        int i42 = 0;
        for (b2.v0 v0Var2 : v0VarArr) {
            int i43 = 0;
            while (i43 < v0Var2.a) {
                int i44 = v0Var2.b;
                aVarArr[i42] = new jc.a(i44, new byte[i40 + i44]);
                i43++;
                i42++;
            }
        }
        int length2 = aVarArr[0].a.length;
        int i45 = i41 - 1;
        while (i45 >= 0 && aVarArr[i45].a.length != length2) {
            i45--;
        }
        int i46 = i45 + 1;
        int i47 = length2 - i40;
        int i48 = 0;
        int i49 = 0;
        while (i48 < i47) {
            int i50 = i49;
            int i51 = 0;
            while (i51 < i42) {
                aVarArr[i51].a[i48] = bArr[i50];
                i51++;
                i50++;
            }
            i48++;
            i49 = i50;
        }
        int i52 = i46;
        while (i52 < i42) {
            aVarArr[i52].a[i47] = bArr[i49];
            i52++;
            i49++;
        }
        boolean z11 = false;
        int length3 = aVarArr[0].a.length;
        while (i47 < length3) {
            int i53 = i49;
            int i54 = 0;
            while (i54 < i42) {
                aVarArr[i54].a[i54 < i46 ? i47 : i47 + 1] = bArr[i53];
                i54++;
                i53++;
            }
            i47++;
            i49 = i53;
        }
        int i55 = 0;
        for (int i56 = 0; i56 < i41; i56++) {
            i55 += aVarArr[i56].b;
        }
        byte[] bArr2 = new byte[i55];
        int i57 = 0;
        int i58 = 0;
        int i59 = 0;
        while (i58 < i41) {
            jc.a aVar = aVarArr[i58];
            byte[] bArr3 = aVar.a;
            int i60 = aVar.b;
            int length4 = bArr3.length;
            int[] iArr2 = new int[length4];
            for (int i61 = 0; i61 < length4; i61++) {
                iArr2[i61] = bArr3[i61] & 255;
            }
            try {
                int h = ((rb.c) this.b).h(bArr3.length - i60, iArr2);
                for (int i62 = 0; i62 < i60; i62++) {
                    bArr3[i62] = (byte) iArr2[i62];
                }
                i57 += h;
                int i63 = i59;
                int i64 = 0;
                while (i64 < i60) {
                    bArr2[i63] = bArr3[i64];
                    i64++;
                    i63++;
                }
                i58++;
                i59 = i63;
            } catch (hc.c unused) {
                ec.a aVar2 = ec.a.c;
                if (ec.h.a) {
                    throw new ec.a();
                }
                throw ec.a.c;
            }
        }
        char[] cArr = jc.b.a;
        b4.d dVar = new b4.d(bArr2);
        StringBuilder sb2 = new StringBuilder(50);
        ArrayList arrayList = new ArrayList(i39);
        int i65 = -1;
        int i66 = -1;
        boolean z12 = false;
        boolean z13 = false;
        fc.c cVar4 = null;
        while (true) {
            try {
                int d = dVar.d();
                jc.e eVar2 = jc.e.c;
                if (d < 4 || (e = dVar.e(4)) == 0) {
                    eVar = eVar2;
                } else if (e == 1) {
                    eVar = jc.e.d;
                } else if (e == 2) {
                    eVar = jc.e.e;
                } else if (e == 3) {
                    eVar = jc.e.f;
                } else if (e == 4) {
                    eVar = jc.e.h;
                } else if (e == 5) {
                    eVar = jc.e.s;
                } else if (e == 7) {
                    eVar = jc.e.n;
                } else if (e == 8) {
                    eVar = jc.e.r;
                } else if (e == 9) {
                    eVar = jc.e.v;
                } else {
                    if (e != 13) {
                        throw new IllegalArgumentException();
                    }
                    eVar = jc.e.w;
                }
                int ordinal = eVar.ordinal();
                if (ordinal != 0) {
                    cVar = cVar3;
                    if (ordinal != 3) {
                        if (ordinal == 5) {
                            i10 = i57;
                            i11 = 1;
                            int e11 = dVar.e(8);
                            if ((e11 & 128) == 0) {
                                e10 = e11 & 127;
                            } else if ((e11 & 192) == 128) {
                                e10 = ((e11 & 63) << 8) | dVar.e(8);
                            } else {
                                if ((e11 & 224) != 192) {
                                    throw ec.c.a();
                                }
                                e10 = ((e11 & 31) << 16) | dVar.e(16);
                            }
                            HashMap hashMap = fc.c.c;
                            if (e10 < 0 || e10 >= 900) {
                                break;
                            }
                            fc.c cVar5 = (fc.c) fc.c.c.get(Integer.valueOf(e10));
                            if (cVar5 == null) {
                                throw ec.c.a();
                            }
                            cVar2 = cVar5;
                        } else if (ordinal == 7) {
                            i10 = i57;
                            i11 = 1;
                            cVar2 = cVar4;
                            z12 = true;
                            z11 = true;
                        } else if (ordinal == 8) {
                            i10 = i57;
                            i11 = 1;
                            cVar2 = cVar4;
                            z12 = true;
                            z13 = true;
                            int i67 = i65;
                            if (eVar != eVar2) {
                                if (cVar2 != null) {
                                    i11 = z11 ? 4 : z13 ? 6 : 2;
                                } else if (z11) {
                                    i11 = 3;
                                } else if (z13) {
                                    i11 = 5;
                                }
                                s sVar = new s(bArr2, sb2.toString(), arrayList.isEmpty() ? null : arrayList, cVar.toString(), i67, i66, i11);
                                sVar.g = Integer.valueOf(i10);
                                return sVar;
                            }
                            i65 = i67;
                            cVar3 = cVar;
                            cVar4 = cVar2;
                            i57 = i10;
                        } else if (ordinal != 9) {
                            int e12 = dVar.e(eVar.a(t10));
                            int ordinal2 = eVar.ordinal();
                            i10 = i57;
                            if (ordinal2 == 1) {
                                jc.b.e(dVar, sb2, e12);
                            } else if (ordinal2 == 2) {
                                jc.b.a(dVar, sb2, e12, z12);
                            } else if (ordinal2 == 4) {
                                jc.b.b(dVar, sb2, e12, cVar4, arrayList);
                            } else {
                                if (ordinal2 != 6) {
                                    throw ec.c.a();
                                }
                                jc.b.d(dVar, sb2, e12);
                            }
                        } else {
                            i10 = i57;
                            int e13 = dVar.e(4);
                            int e14 = dVar.e(eVar.a(t10));
                            i11 = 1;
                            if (e13 == 1) {
                                jc.b.c(dVar, sb2, e14);
                            }
                        }
                        int i672 = i65;
                        if (eVar != eVar2) {
                        }
                    } else {
                        i10 = i57;
                        i11 = 1;
                        if (dVar.d() < 16) {
                            throw ec.c.a();
                        }
                        i65 = dVar.e(8);
                        i66 = dVar.e(8);
                    }
                    cVar2 = cVar4;
                    int i6722 = i65;
                    if (eVar != eVar2) {
                    }
                } else {
                    cVar = cVar3;
                    i10 = i57;
                }
                i11 = 1;
                cVar2 = cVar4;
                int i67222 = i65;
                if (eVar != eVar2) {
                }
            } catch (IllegalArgumentException unused2) {
                throw ec.c.a();
            }
        }
    }

    @Override // ig.z1
    public void p0(ArrayList arrayList) {
        j1 j1Var = (j1) this.b;
        String str = j1Var.Z;
        if (str != null) {
            j1Var.U(str, j1Var.c0, j1Var.d0, j1Var.b0, j1Var.a0);
        }
    }

    public synchronized void q() {
        ((SharedPreferences) this.b).edit().clear().commit();
    }

    @Override // k2.y
    public void r(Exception exc) {
        e2.a.d("MediaCodecAudioRenderer", "Audio sink error", exc);
        rf.b bVar = ((x0) this.b).a1;
        Handler handler = (Handler) bVar.b;
        if (handler != null) {
            handler.post(new k2.r(bVar, exc, 1));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x004d A[LOOP:0: B:16:0x0047->B:18:0x004d, LOOP_END] */
    @Override // h6.n
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void t(String str, long j10, int i10, Object obj, long j11, long j12) {
        int i11;
        Iterator it;
        o oVar = (o) this.b;
        try {
            i11 = i10;
            try {
                Status status = new Status(i11, null, null, null);
                Object obj2 = true == (obj instanceof h6.l) ? obj : null;
                if (obj2 != null) {
                }
                if (obj2 != null) {
                }
                oVar.a(new f6.n(status, 2));
            } catch (IllegalStateException e) {
                e = e;
                h6.b bVar = f6.h.k;
                Log.e(bVar.a, bVar.d("Result already set when calling onRequestCompleted", new Object[0]), e);
                it = oVar.q.i.iterator();
                while (it.hasNext()) {
                }
            }
        } catch (IllegalStateException e10) {
            e = e10;
            i11 = i10;
        }
        it = oVar.q.i.iterator();
        while (it.hasNext()) {
            ((f6.g) it.next()).h(str, j10, i11, j11, j12);
            i11 = i10;
        }
    }

    @Override // k2.y
    public void v() {
        ((x0) this.b).j1 = true;
    }

    @Override // org.telegram.ui.Components.cr0
    public void v0() {
        switch (this.a) {
            case 7:
                qc k10 = ((h7) this.b).getBulletinFactory().k(false);
                k10.u = true;
                k10.j();
                break;
            default:
                q4.h0((q4) this.b);
                break;
        }
    }

    public boolean w() {
        w0 w0Var = ((com.google.android.gms.common.api.internal.i0) this.b).d;
        return w0Var != null && w0Var.b();
    }

    public void x(bb.e0 e0Var) {
        ((m5.r) ((j5.f) ((ra.b) this.b).get())).a("FIREBASE_APPQUALITY_SESSION", new j5.c("json"), new a1.c(this, 3)).a(new j5.a(null, e0Var, j5.d.a, null), new m4.x0(11));
    }

    @Override // ig.z1
    public /* synthetic */ a0.h y() {
        return null;
    }

    @Override // oe.d
    public void z(float f7, int i10) {
        bh.u uVar = (bh.u) this.b;
        uVar.c.setLayerType(0, null);
        if (f7 == 0.0f && !uVar.N) {
            uVar.c.setVisibility(4);
            if (Build.MODEL.toLowerCase().startsWith("zte") && Build.VERSION.SDK_INT <= 28) {
                uVar.E.setFocusableInTouchMode(false);
            }
        }
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 512);
    }

    public /* synthetic */ l(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    public l(MediaInfo mediaInfo) {
        this.a = 12;
        d6.o oVar = new d6.o(mediaInfo, 0, true, Double.NaN, Double.POSITIVE_INFINITY, 0.0d, null, null);
        if (mediaInfo != null) {
            this.b = oVar;
            return;
        }
        throw new IllegalArgumentException("media cannot be null.");
    }

    public l(JSONObject jSONObject) {
        this.a = 12;
        this.b = new d6.o(jSONObject);
    }

    public l(da.c cVar) {
        this.a = 17;
        this.b = new File(cVar.b, "com.crashlytics.settings.json");
    }

    public l(Context context) {
        boolean isEmpty;
        this.a = 10;
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
                q();
            }
        } catch (IOException e) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Error creating file in no backup dir: " + e.getMessage());
            }
        }
    }

    private final /* synthetic */ void s() {
    }

    private final /* synthetic */ void u() {
    }

    public l(int i10) {
        this.a = i10;
        switch (i10) {
            case 25:
                this.b = new rb.c(hc.a.h, 26);
                break;
            default:
                this.b = new Bundle();
                break;
        }
    }

    public l(MediaMetadataCompat mediaMetadataCompat) {
        this.a = 1;
        Bundle bundle = new Bundle(mediaMetadataCompat.a);
        this.b = bundle;
        android.support.v4.media.session.b0.a(bundle);
    }
}

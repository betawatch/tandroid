package ji;

import android.content.ComponentName;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import androidx.profileinstaller.ProfileInstallReceiver;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.io.IOException;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONException;
import org.json.JSONObject;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MrzRecognizer;
import org.telegram.messenger.R;
import org.telegram.ui.Cells.e9;
import org.telegram.ui.Cells.p9;
import org.telegram.ui.Cells.q9;
import org.telegram.ui.Components.cc0;
import org.telegram.ui.Components.d71;
import org.telegram.ui.Components.dq0;
import org.telegram.ui.Components.eo0;
import org.telegram.ui.Components.fg0;
import org.telegram.ui.Components.g71;
import org.telegram.ui.Components.gk0;
import org.telegram.ui.Components.hq0;
import org.telegram.ui.Components.n9;
import org.telegram.ui.Components.s6;
import org.telegram.ui.Components.te0;
import org.telegram.ui.Components.ue0;
import org.telegram.ui.Components.vk0;
import org.telegram.ui.Components.zg0;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.ThemeActivity;
import org.telegram.ui.bc1;
import org.telegram.ui.l9;
import org.telegram.ui.ss0;
import org.telegram.ui.t9;
import org.telegram.ui.zt0;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes4.dex */
public class u4 implements j0, m.x0, n5.b, eo0, le.f, mg.p, d71, hg.a2, t9, r4.c, com.google.android.gms.common.api.internal.o, rg.x1, s4.h1, com.google.android.gms.common.api.internal.s {
    public final /* synthetic */ int a;
    public Object b;

    public /* synthetic */ u4(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // ji.j0
    public void A(CharSequence charSequence) {
        o3 o3Var = ((w4) this.b).N;
        if (o3Var != null) {
            o3Var.getClass();
            if (charSequence == null || charSequence.length() <= 0) {
                return;
            }
            o3Var.a.s4(charSequence.toString());
        }
    }

    @Override // org.telegram.ui.Components.eo0
    public void B() {
        int i10 = this.a;
    }

    public void C(aa.a aVar) {
        h8.j jVar = (h8.j) this.b;
        jVar.a = aVar;
        Iterator it = jVar.c.iterator();
        while (it.hasNext()) {
            ((x6.e) it.next()).b();
        }
        jVar.c.clear();
        jVar.b = null;
    }

    @Override // ji.j0
    public p9 D() {
        return (w4) this.b;
    }

    @Override // mg.p
    public void E(boolean z10) {
        ((ue0) this.b).c.setAspectLock(z10);
    }

    @Override // ji.j0
    public a F() {
        return ((w4) this.b).a;
    }

    @Override // hg.a2
    public /* synthetic */ a0.i G() {
        return null;
    }

    @Override // rg.x1
    public void H(float f7) {
        zt0 zt0Var = (zt0) this.b;
        qg.s0.e(zt0Var.P1).k(String.valueOf(qg.m.a.indexOf(zt0Var.W0.getCurrentBrush())), f7);
        qg.q1 q1Var = zt0Var.K1;
        q1Var.c = f7;
        zt0Var.s0(q1Var, null);
    }

    @Override // org.telegram.ui.t9
    public void K(String str) {
        org.telegram.ui.web.d1 d1Var = (org.telegram.ui.web.d1) this.b;
        try {
            d1Var.P = System.currentTimeMillis();
            d1Var.z("qr_text_received", new JSONObject().put("data", str));
        } catch (JSONException e7) {
            FileLog.e(e7);
        }
    }

    @Override // org.telegram.ui.t9
    public String K0() {
        return ((org.telegram.ui.web.d1) this.b).i0;
    }

    @Override // ji.j0
    public boolean L() {
        w4 w4Var = (w4) this.b;
        o3 o3Var = w4Var.N;
        if (o3Var == null) {
            return false;
        }
        a aVar = w4Var.a;
        return o3Var.a.R4();
    }

    @Override // ji.j0
    public void M(int i10, int i11) {
        w4 w4Var = (w4) this.b;
        o3 o3Var = w4Var.N;
        if (o3Var != null) {
            a aVar = w4Var.a;
            g2 g2Var = o3Var.a.J3;
            if (g2Var != null) {
                g2Var.f(i10, i11);
            }
        }
    }

    public boolean N(int i10, int i11, Bundle bundle) {
        return false;
    }

    public void O(s4.c1 c1Var, b2.q0 q0Var, b2.q0 q0Var2) {
        boolean z10;
        s4.c1 T;
        int i10;
        RecyclerView recyclerView = (RecyclerView) this.b;
        recyclerView.b.k(c1Var);
        recyclerView.h(c1Var);
        c1Var.q(false);
        s4.f1 f1Var = (s4.f1) recyclerView.c0;
        f1Var.getClass();
        int i11 = q0Var.a;
        int i12 = q0Var.b;
        View view = c1Var.a;
        int left = q0Var2 == null ? view.getLeft() : q0Var2.a;
        int top = q0Var2 == null ? view.getTop() : q0Var2.b;
        if (c1Var.j() || (i11 == left && i12 == top)) {
            int i13 = c1Var.h;
            int i14 = -1;
            if (i13 != -1) {
                for (int i15 = 0; i15 < recyclerView.getChildCount(); i15++) {
                    View childAt = recyclerView.getChildAt(i15);
                    if (childAt != null && (T = recyclerView.T(childAt)) != null && !T.j() && (i10 = T.h) >= 0 && i10 < i13 && i10 > i14) {
                        i14 = i10;
                    }
                }
            }
            c1Var.i = (c1Var.h - i14) + (i14 * MediaDataController.MAX_STYLE_RUNS_COUNT);
            f1Var.s(c1Var, q0Var);
            z10 = true;
        } else {
            view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
            z10 = f1Var.r(c1Var, q0Var, i11, i12, left, top);
        }
        if (z10) {
            recyclerView.l0();
        }
    }

    @Override // ji.j0
    public void P() {
        w4 w4Var = (w4) this.b;
        o3 o3Var = w4Var.N;
        if (o3Var != null) {
            a aVar = w4Var.a;
            v3 v3Var = o3Var.a;
            g2 g2Var = v3Var.J3;
            if (g2Var != null) {
                g2Var.g();
            }
            v3Var.h3.onContentChanged();
        }
    }

    @Override // hg.a2
    public boolean Q(int i10) {
        return i10 == ((dq0) this.b).r;
    }

    public void R(s4.c1 c1Var) {
        RecyclerView recyclerView = (RecyclerView) this.b;
        s4.o0 o0Var = recyclerView.x;
        View view = c1Var.a;
        pf.e eVar = recyclerView.b;
        m2.t tVar = o0Var.a;
        l.d dVar = (l.d) tVar.c;
        int indexOfChild = ((RecyclerView) dVar.b).indexOfChild(view);
        if (indexOfChild >= 0) {
            if (((e6.n) tVar.d).F(indexOfChild)) {
                tVar.R(view);
            }
            dVar.C(indexOfChild);
        }
        eVar.g(view);
    }

    @Override // mg.p
    public void W(boolean z10) {
        ue0 ue0Var = (ue0) this.b;
        ue0Var.getClass();
        te0 te0Var = ue0Var.a;
        if (te0Var != null) {
            ((ss0) te0Var).a(z10);
        }
    }

    @Override // org.telegram.ui.Components.eo0
    public void X(float f7, boolean z10) {
        switch (this.a) {
            case 7:
                ng.h hVar = (ng.h) this.b;
                float f10 = hVar.b;
                float z11 = com.google.android.gms.internal.vision.e2.z(hVar.c, f10, f7, f10);
                hVar.d = z11;
                if (z10) {
                    s6 s6Var = hVar.e;
                    s6Var.getClass();
                    s6Var.b(null, z11);
                }
                hVar.invalidate();
                break;
            default:
                bc1 bc1Var = (bc1) ((org.telegram.ui.Cells.k0) this.b);
                int i10 = (int) (org.telegram.ui.ActionBar.j6.q * 100.0f);
                int i11 = (int) (f7 * 100.0f);
                org.telegram.ui.ActionBar.j6.q = f7;
                if (i10 != i11) {
                    ThemeActivity themeActivity = bc1Var.e.e;
                    vk0 vk0Var = (vk0) themeActivity.b.K(themeActivity.f0);
                    if (vk0Var != null) {
                        ((e9) vk0Var.a).setText(LocaleController.formatString("AutoNightBrightnessInfo", R.string.AutoNightBrightnessInfo, Integer.valueOf((int) (org.telegram.ui.ActionBar.j6.q * 100.0f))));
                    }
                    org.telegram.ui.ActionBar.j6.E(true);
                    break;
                }
                break;
        }
    }

    @Override // ji.j0
    public void a(h1 h1Var) {
        o3 o3Var = ((w4) this.b).N;
        if (o3Var != null) {
            v3 v3Var = o3Var.a;
            v3.L1(v3Var, h1Var);
            v3Var.h3.v(h1Var, true);
        }
    }

    @Override // com.google.android.gms.common.api.internal.s
    public void accept(Object obj, Object obj2) {
        s6.f fVar = new s6.f(0, (TaskCompletionSource) obj2);
        s6.e eVar = (s6.e) ((s6.h) obj).u();
        s6.a aVar = (s6.a) this.b;
        Parcel I0 = eVar.I0();
        k7.a.d(I0, fVar);
        k7.a.c(I0, aVar);
        eVar.J0(I0, 1);
    }

    @Override // s4.h1
    public int b(View view) {
        return s4.o0.x(view) - ((ViewGroup.MarginLayoutParams) ((s4.p0) view.getLayoutParams())).leftMargin;
    }

    @Override // mg.p
    public void b0() {
        te0 te0Var = ((ue0) this.b).a;
        if (te0Var != null) {
            PhotoViewer photoViewer = ((ss0) te0Var).a;
            if (photoViewer.c2 == 1) {
                photoViewer.H2 = true;
                photoViewer.q3();
            }
        }
    }

    @Override // ji.j0
    public void c0() {
        w4 w4Var = (w4) this.b;
        o3 o3Var = w4Var.N;
        if (o3Var != null) {
            a aVar = w4Var.a;
            v3.N1(o3Var.a);
        }
    }

    @Override // s4.h1
    public int e() {
        return ((s4.o0) this.b).D();
    }

    @Override // hg.a2
    public void f(int i10) {
        dq0 dq0Var = (dq0) this.b;
        hq0 hq0Var = dq0Var.K;
        dq0Var.s = i10;
        if (dq0Var.v != i10) {
            dq0Var.d.clear();
        }
        int i11 = dq0Var.J;
        if (dq0Var.h() != 0 || dq0Var.e.e() || dq0Var.I) {
            hq0Var.x0.b(i11);
        } else {
            hq0Var.Q.e(false, true);
        }
        dq0Var.l();
        int i12 = hq0.a1;
        hq0Var.K0(true);
    }

    @Override // org.telegram.ui.t9
    public /* synthetic */ boolean f1(String str, l9 l9Var) {
        return false;
    }

    @Override // ji.j0
    public void g() {
        w4 w4Var = (w4) this.b;
        o3 o3Var = w4Var.N;
        if (o3Var != null) {
            v3.O1(o3Var.a, w4Var.a);
        }
    }

    @Override // fd.a
    public Object get() {
        return new m2.t((Context) ((l.d) this.b).b, new t7.u(23), new rb.a(23), 2);
    }

    @Override // org.telegram.ui.Components.eo0
    public CharSequence getContentDescription() {
        switch (this.a) {
            case 7:
                ng.h hVar = (ng.h) this.b;
                float f7 = hVar.b;
                return String.valueOf(Math.round((hVar.a.getProgress() * (hVar.c - f7)) + f7));
            default:
                return " ";
        }
    }

    @Override // le.f
    public /* synthetic */ boolean i() {
        return false;
    }

    @Override // le.f
    public /* synthetic */ boolean j(float f7) {
        return false;
    }

    @Override // org.telegram.ui.Components.eo0
    public /* synthetic */ int l0() {
        switch (this.a) {
        }
        return 0;
    }

    @Override // s4.h1
    public int m() {
        s4.o0 o0Var = (s4.o0) this.b;
        return o0Var.m - o0Var.E();
    }

    public void n() {
        qg.a1 a1Var = ((qg.c1) this.b).d;
        if (a1Var != null) {
            qg.z0 z0Var = a1Var.s;
            if (z0Var != null) {
                a1Var.cancelRunnable(z0Var);
                a1Var.s = null;
            }
            qg.z0 z0Var2 = new qg.z0(a1Var, 1);
            a1Var.s = z0Var2;
            a1Var.postRunnable(z0Var2, 1L);
        }
    }

    public s0.c o(int i10) {
        return null;
    }

    @Override // org.telegram.ui.t9
    public void onDismiss() {
        org.telegram.ui.web.d1 d1Var = (org.telegram.ui.web.d1) this.b;
        d1Var.z("scan_qr_popup_closed", null);
        d1Var.h0 = false;
    }

    @Override // org.telegram.ui.Components.d71
    public /* synthetic */ void onRenderedFirstFrame(j2.a aVar) {
    }

    @Override // org.telegram.ui.Components.d71
    public void onStateChanged(boolean z10, int i10) {
        gk0 gk0Var = (gk0) this.b;
        if (z10 && gk0Var.n.n() >= 0) {
            gk0Var.w = true;
        }
        fg0 fg0Var = gk0Var.f;
        cc0 cc0Var = gk0Var.x;
        fg0Var.a(z10, true);
        AndroidUtilities.cancelRunOnUIThread(cc0Var);
        if (z10) {
            AndroidUtilities.runOnUIThread(cc0Var, 16L);
        }
    }

    @Override // org.telegram.ui.Components.d71
    public /* synthetic */ boolean onSurfaceDestroyed(SurfaceTexture surfaceTexture) {
        return false;
    }

    @Override // com.google.android.gms.common.api.internal.o
    public void p(Object obj) {
        com.google.android.gms.common.api.internal.n nVar;
        androidx.activity.o oVar = ((r7.i) this.b).b;
        synchronized (oVar) {
            oVar.b = false;
            nVar = ((com.google.android.gms.common.api.internal.p) oVar.c).c;
        }
        if (nVar != null) {
            ((r7.c) oVar.d).c(nVar, 2441);
        }
    }

    @Override // le.f
    public void q() {
        ((n9) this.b).a.invalidate();
    }

    @Override // s4.h1
    public View r(int i10) {
        return ((s4.o0) this.b).q(i10);
    }

    @Override // mg.p
    public void s() {
        te0 te0Var = ((ue0) this.b).a;
        if (te0Var != null) {
            ((ss0) te0Var).a.e0.invalidate();
        }
    }

    @Override // s4.h1
    public int t(View view) {
        return s4.o0.y(view) + ((ViewGroup.MarginLayoutParams) ((s4.p0) view.getLayoutParams())).rightMargin;
    }

    public String toString() {
        switch (this.a) {
            case 16:
                return "ProviderMetadata{ componentName=" + ((ComponentName) this.b).flattenToShortString() + " }";
            default:
                return super.toString();
        }
    }

    @Override // ji.j0
    public q9 u() {
        o3 o3Var = ((w4) this.b).N;
        if (o3Var != null) {
            return o3Var.a.getTextSelectionHelper();
        }
        return null;
    }

    @Override // r4.c
    public void v() {
        Log.d("ProfileInstaller", "DIAGNOSTIC_PROFILE_IS_COMPRESSED");
    }

    @Override // hg.a2
    public /* synthetic */ a0.i w() {
        return null;
    }

    @Override // r4.c
    public void x(int i10, Object obj) {
        String str;
        switch (i10) {
            case 1:
                str = "RESULT_INSTALL_SUCCESS";
                break;
            case 2:
                str = "RESULT_ALREADY_INSTALLED";
                break;
            case 3:
                str = "RESULT_UNSUPPORTED_ART_VERSION";
                break;
            case 4:
                str = "RESULT_NOT_WRITABLE";
                break;
            case 5:
                str = "RESULT_DESIRED_FORMAT_UNSUPPORTED";
                break;
            case 6:
                str = "RESULT_BASELINE_PROFILE_NOT_FOUND";
                break;
            case 7:
                str = "RESULT_IO_EXCEPTION";
                break;
            case 8:
                str = "RESULT_PARSE_EXCEPTION";
                break;
            case 9:
            default:
                str = "";
                break;
            case 10:
                str = "RESULT_INSTALL_SKIP_FILE_SUCCESS";
                break;
            case 11:
                str = "RESULT_DELETE_SKIP_FILE_SUCCESS";
                break;
        }
        if (i10 == 6 || i10 == 7 || i10 == 8) {
            Log.e("ProfileInstaller", str, (Throwable) obj);
        } else {
            Log.d("ProfileInstaller", str);
        }
        ((ProfileInstallReceiver) this.b).setResultCode(i10);
    }

    public String y(Object obj) {
        StringWriter stringWriter = new StringWriter();
        try {
            ka.d dVar = (ka.d) this.b;
            ka.e eVar = new ka.e(stringWriter, dVar.a, dVar.b, dVar.c, dVar.d);
            eVar.h(obj);
            eVar.j();
            eVar.b.flush();
        } catch (IOException unused) {
        }
        return stringWriter.toString();
    }

    public s0.c z(int i10) {
        return null;
    }

    public /* synthetic */ u4(s6.g gVar, s6.a aVar) {
        this.a = 25;
        this.b = aVar;
    }

    @Override // org.telegram.ui.Components.d71
    public void onRenderedFirstFrame() {
    }

    public u4(EditText editText) {
        this.a = 17;
        this.b = new o0.a(editText);
    }

    public u4(int i10) {
        this.a = i10;
        switch (i10) {
            case 27:
                break;
            case 28:
            default:
                if (Build.VERSION.SDK_INT >= 26) {
                    this.b = new s0.d(this);
                    break;
                } else {
                    this.b = new zg0(this);
                    break;
                }
            case 29:
                this.b = new CopyOnWriteArrayList();
                break;
        }
    }

    @Override // rg.x1
    public float get() {
        zt0 zt0Var = (zt0) this.b;
        int i10 = zt0Var.P1;
        qg.m currentBrush = zt0Var.W0.getCurrentBrush();
        if (currentBrush == null) {
            return qg.s0.e(i10).i;
        }
        return qg.s0.e(i10).f(String.valueOf(qg.m.a.indexOf(currentBrush)), currentBrush.d());
    }

    private final void I() {
    }

    private final void J() {
    }

    @Override // le.f
    public /* synthetic */ void c() {
    }

    @Override // le.f
    public /* synthetic */ void k() {
    }

    @Override // org.telegram.ui.t9
    public /* synthetic */ void W0(MrzRecognizer.Result result) {
    }

    @Override // hg.a2
    public /* synthetic */ void Y(ArrayList arrayList) {
    }

    @Override // m.x0
    public void d(int i10) {
    }

    @Override // le.f
    public /* synthetic */ void h(boolean z10) {
    }

    @Override // m.x0
    public void l(int i10) {
    }

    @Override // org.telegram.ui.Components.d71
    public /* synthetic */ void onSeekFinished(j2.a aVar) {
    }

    @Override // org.telegram.ui.Components.d71
    public /* synthetic */ void onSeekStarted(j2.a aVar) {
    }

    @Override // org.telegram.ui.Components.d71
    public /* synthetic */ void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    @Override // org.telegram.ui.Components.d71
    public void onError(g71 g71Var, Exception exc) {
    }

    @Override // org.telegram.ui.Components.d71
    public void onVideoSizeChanged(int i10, int i11, int i12, float f7) {
    }
}

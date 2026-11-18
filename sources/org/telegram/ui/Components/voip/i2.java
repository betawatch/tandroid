package org.telegram.ui.Components.voip;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.os.SystemClock;
import android.view.View;
import android.view.WindowManager;
import java.util.ArrayList;
import org.telegram.messenger.a8;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.ui.Components.cn0;
import org.telegram.ui.Components.gk;
import org.telegram.ui.Components.me;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ac1;
import org.telegram.ui.hc1;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class i2 implements wi.l {
    public static i2 h;
    public wi.n a;
    public m b;
    public long c;
    public boolean d;
    public final gk e = new gk(this, 25);
    public boolean f;

    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r5v3 */
    public static void g() {
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        boolean z10 = (hc1.m1 == null && h2.d() == null) ? false : true;
        if (sharedInstance == null || !z10) {
            i2 i2Var = h;
            if (i2Var != null) {
                h = null;
                wi.n nVar = i2Var.a;
                if (nVar != null) {
                    i2Var.a = null;
                    nVar.f();
                    return;
                }
                return;
            }
            return;
        }
        if (h == null) {
            h = new i2();
        }
        i2 i2Var2 = h;
        wi.n nVar2 = i2Var2.a;
        if (nVar2 == null || !nVar2.d()) {
            i2Var2.a = l2.i.d().k(i2Var2);
        }
        wi.n nVar3 = i2Var2.a;
        if (nVar3.c == 2) {
            nVar3.c();
            return;
        }
        h2 d = hc1.m1 == null ? h2.d() : null;
        wi.n nVar4 = i2Var2.a;
        ?? r52 = d != null ? 1 : 0;
        boolean z11 = d != null && d.e;
        int i7 = nVar4.c;
        if (i7 != 3) {
            nVar4.f = r52;
            nVar4.g = z11;
            if (i7 == 2) {
                nVar4.d = r52;
            } else {
                nVar4.c = r52;
            }
            nVar4.b.f();
        }
        i2Var2.a.c();
    }

    @Override // wi.l
    public final void B(View view) {
        m mVar;
        hc1 hc1Var = hc1.m1;
        if (hc1Var == null || (mVar = this.b) != view || this.f) {
            return;
        }
        this.f = true;
        mVar.getClass();
        mVar.r = SystemClock.elapsedRealtime();
        mVar.b();
        hc1Var.k1 = this.b.a;
        hc1Var.l1 = true;
        hc1Var.y();
        try {
            ((WindowManager) hc1Var.b.getSystemService("window")).removeView(hc1Var.u0);
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }

    @Override // wi.l
    public final void D(SurfaceTexture surfaceTexture) {
        surfaceTexture.release();
    }

    @Override // wi.l
    public final /* synthetic */ View E() {
        return null;
    }

    @Override // wi.l
    public final boolean G() {
        hc1 hc1Var = hc1.m1;
        return hc1Var != null && hc1Var.d0.isAttachedToWindow();
    }

    @Override // wi.l
    public final int J() {
        int i7;
        if (!m.a(VoIPService.getSharedInstance())) {
            return 1;
        }
        m2 a10 = a();
        if (a10 == null || (i7 = a10.rotatedFrameWidth) <= 0) {
            return 9;
        }
        return i7;
    }

    @Override // wi.l
    public final boolean N() {
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        return (sharedInstance == null || sharedInstance.isHangingUp() || sharedInstance.getCallState() == 11 || sharedInstance.getCallState() == 10) ? false : true;
    }

    @Override // wi.l
    public final /* synthetic */ boolean O() {
        return false;
    }

    @Override // wi.l
    public final /* synthetic */ e2.c1 Q() {
        return null;
    }

    @Override // wi.l
    public final /* synthetic */ boolean S() {
        return false;
    }

    @Override // wi.l
    public final void U() {
        this.a = null;
        if (h == this) {
            h = null;
        }
        hc1 hc1Var = hc1.m1;
        if (hc1Var != null) {
            hc1Var.G0 = true;
            hc1Var.d0.d.release();
            hc1Var.e0.d.release();
            hc1Var.c0.release();
            hc1Var.c();
            hc1Var.u0.d();
            hc1.m1 = null;
            g();
        }
        h2.b();
    }

    @Override // wi.l
    public final /* synthetic */ boolean V(boolean z10, float f10, cn0 cn0Var) {
        return false;
    }

    @Override // wi.l
    public final void X(View view) {
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        g.a = (sharedInstance == null || sharedInstance.getVideoState(false) == 0) ? false : true;
        m mVar = (m) view;
        this.b = mVar;
        mVar.b();
        this.c = g.c();
        this.d = m.a(VoIPService.getSharedInstance());
        gk gkVar = this.e;
        org.telegram.messenger.g0.r(gkVar);
        org.telegram.messenger.g0.h3(gkVar, 500L);
        this.f = false;
        if (hc1.m1 != null || h2.d() == null) {
            return;
        }
        h2 d = h2.d();
        n2 n2Var = this.b.a;
        d.getClass();
        VoIPService sharedInstance2 = VoIPService.getSharedInstance();
        if (sharedInstance2 != null) {
            sharedInstance2.setSinks(d.r.d, n2Var.d);
        }
        try {
            d.c.removeView(d.a);
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }

    public final m2 a() {
        n2 n2Var;
        m mVar = this.b;
        if (mVar != null) {
            m2 m2Var = mVar.a.d;
            if (m2Var.rotatedFrameWidth > 0) {
                return m2Var;
            }
        }
        hc1 hc1Var = hc1.m1;
        if (hc1Var != null && (n2Var = hc1Var.d0) != null) {
            return n2Var.d;
        }
        h2 d = h2.d();
        if (d != null) {
            return d.s.d;
        }
        return null;
    }

    @Override // wi.l
    public final int a0() {
        int i7;
        if (!m.a(VoIPService.getSharedInstance())) {
            return 1;
        }
        m2 a10 = a();
        if (a10 == null || (i7 = a10.rotatedFrameHeight) <= 0) {
            return 16;
        }
        return i7;
    }

    @Override // wi.l
    public final float b0() {
        return 0.0f;
    }

    @Override // wi.l
    public final void d(View view) {
        g.a = false;
        org.telegram.messenger.g0.r(this.e);
        this.b = null;
        hc1 hc1Var = hc1.m1;
        if (hc1Var != null) {
            try {
                if (hc1Var.u0.getParent() == null) {
                    WindowManager windowManager = (WindowManager) hc1Var.b.getSystemService("window");
                    ac1 ac1Var = hc1Var.u0;
                    ac1Var.getClass();
                    windowManager.addView(ac1Var, r2.a());
                }
            } catch (Exception e10) {
                a8.g(e10, true);
            }
            hc1Var.l1 = false;
            hc1Var.k1 = null;
            hc1Var.y();
            hc1Var.u0.invalidate();
            return;
        }
        if (h2.d() != null) {
            h2 d = h2.d();
            ai.k0 k0Var = d.a;
            try {
                if (k0Var.getParent() == null) {
                    d.c.addView(k0Var, d.d);
                }
            } catch (Exception e11) {
                a8.g(e11, true);
            }
            VoIPService sharedInstance = VoIPService.getSharedInstance();
            if (sharedInstance != null) {
                sharedInstance.setSinks(d.r.d, d.s.d);
            }
        }
    }

    @Override // wi.l
    public final int e() {
        return 10;
    }

    @Override // wi.l
    public final long getDuration() {
        return 0L;
    }

    @Override // wi.l
    public final boolean h() {
        return true;
    }

    @Override // wi.l
    public final void h0(int i7, ArrayList arrayList) {
        g.a(i7, arrayList, false);
    }

    @Override // wi.l
    public final long l() {
        return 0L;
    }

    @Override // wi.l
    public final /* synthetic */ boolean o0() {
        return true;
    }

    @Override // wi.l
    public final /* synthetic */ boolean p() {
        return true;
    }

    @Override // wi.l
    public final void p0(int i7) {
        g.b(i7, false);
        org.telegram.messenger.g0.h3(new me(21), 300L);
    }

    @Override // wi.l
    public final /* synthetic */ boolean s() {
        return false;
    }

    @Override // wi.l
    public final void u(Rect rect) {
        rect.setEmpty();
    }

    @Override // wi.l
    public final View v(LaunchActivity launchActivity) {
        return new m(launchActivity);
    }

    @Override // wi.l
    public final void w(View view) {
        org.telegram.messenger.g0.r(this.e);
        if (this.b == view) {
            this.b = null;
        }
        m mVar = (m) view;
        mVar.f.b();
        mVar.a.d.release();
    }

    @Override // wi.l
    public final /* synthetic */ void L(float f10) {
    }

    @Override // wi.l
    public final void c(long j3) {
    }

    @Override // wi.l
    public final void i(wi.o oVar) {
    }

    @Override // wi.l
    public final /* synthetic */ void H() {
    }

    @Override // wi.l
    public final void Z() {
    }

    @Override // wi.l
    public final void b() {
    }

    @Override // wi.l
    public final void f() {
    }

    @Override // wi.l
    public final /* synthetic */ void j0(Canvas canvas, int i7, int i10) {
    }
}

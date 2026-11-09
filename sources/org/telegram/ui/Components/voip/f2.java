package org.telegram.ui.Components.voip;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.os.SystemClock;
import android.view.View;
import android.view.WindowManager;
import bi.x5;
import java.util.ArrayList;
import org.telegram.messenger.a8;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.ui.Components.et;
import org.telegram.ui.Components.rm0;
import org.telegram.ui.Components.vs;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.bc1;
import org.telegram.ui.ic1;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class f2 implements ti.m {
    public static f2 h;
    public ti.o a;
    public m b;
    public long c;
    public boolean d;
    public final et e = new et(this, 22);
    public boolean f;

    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r5v3 */
    public static void d() {
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        boolean z9 = (ic1.l1 == null && e2.d() == null) ? false : true;
        if (sharedInstance == null || !z9) {
            f2 f2Var = h;
            if (f2Var != null) {
                h = null;
                ti.o oVar = f2Var.a;
                if (oVar != null) {
                    f2Var.a = null;
                    oVar.f();
                    return;
                }
                return;
            }
            return;
        }
        if (h == null) {
            h = new f2();
        }
        f2 f2Var2 = h;
        ti.o oVar2 = f2Var2.a;
        if (oVar2 == null || !oVar2.d()) {
            f2Var2.a = l2.i.d().k(f2Var2);
        }
        ti.o oVar3 = f2Var2.a;
        if (oVar3.c == 2) {
            oVar3.c();
            return;
        }
        e2 d = ic1.l1 == null ? e2.d() : null;
        ti.o oVar4 = f2Var2.a;
        ?? r52 = d != null ? 1 : 0;
        boolean z10 = d != null && d.e;
        int i7 = oVar4.c;
        if (i7 != 3) {
            oVar4.f = r52;
            oVar4.g = z10;
            if (i7 == 2) {
                oVar4.d = r52;
            } else {
                oVar4.c = r52;
            }
            oVar4.b.f();
        }
        f2Var2.a.c();
    }

    @Override // ti.m
    public final void B(View view) {
        m mVar;
        ic1 ic1Var = ic1.l1;
        if (ic1Var == null || (mVar = this.b) != view || this.f) {
            return;
        }
        this.f = true;
        mVar.getClass();
        mVar.r = SystemClock.elapsedRealtime();
        mVar.b();
        ic1Var.j1 = this.b.a;
        ic1Var.k1 = true;
        ic1Var.y();
        try {
            ((WindowManager) ic1Var.b.getSystemService("window")).removeView(ic1Var.t0);
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }

    @Override // ti.m
    public final void C(SurfaceTexture surfaceTexture) {
        surfaceTexture.release();
    }

    @Override // ti.m
    public final /* synthetic */ View D() {
        return null;
    }

    @Override // ti.m
    public final boolean E() {
        ic1 ic1Var = ic1.l1;
        return ic1Var != null && ic1Var.c0.isAttachedToWindow();
    }

    @Override // ti.m
    public final int I() {
        int i7;
        if (!m.a(VoIPService.getSharedInstance())) {
            return 1;
        }
        j2 a10 = a();
        if (a10 == null || (i7 = a10.rotatedFrameWidth) <= 0) {
            return 9;
        }
        return i7;
    }

    @Override // ti.m
    public final boolean K() {
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        return (sharedInstance == null || sharedInstance.isHangingUp() || sharedInstance.getCallState() == 11 || sharedInstance.getCallState() == 10) ? false : true;
    }

    @Override // ti.m
    public final /* synthetic */ boolean L() {
        return false;
    }

    @Override // ti.m
    public final /* synthetic */ e2.c1 M() {
        return null;
    }

    @Override // ti.m
    public final /* synthetic */ boolean P() {
        return false;
    }

    @Override // ti.m
    public final void Q() {
        this.a = null;
        if (h == this) {
            h = null;
        }
        ic1 ic1Var = ic1.l1;
        if (ic1Var != null) {
            ic1Var.F0 = true;
            ic1Var.c0.d.release();
            ic1Var.d0.d.release();
            ic1Var.b0.release();
            ic1Var.c();
            ic1Var.t0.d();
            ic1.l1 = null;
            d();
        }
        e2.b();
    }

    @Override // ti.m
    public final /* synthetic */ boolean R(boolean z9, float f10, rm0 rm0Var) {
        return false;
    }

    @Override // ti.m
    public final void S(View view) {
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        g.a = (sharedInstance == null || sharedInstance.getVideoState(false) == 0) ? false : true;
        m mVar = (m) view;
        this.b = mVar;
        mVar.b();
        this.c = g.c();
        this.d = m.a(VoIPService.getSharedInstance());
        et etVar = this.e;
        org.telegram.messenger.g0.r(etVar);
        org.telegram.messenger.g0.i3(etVar, 500L);
        this.f = false;
        if (ic1.l1 != null || e2.d() == null) {
            return;
        }
        e2 d = e2.d();
        k2 k2Var = this.b.a;
        d.getClass();
        VoIPService sharedInstance2 = VoIPService.getSharedInstance();
        if (sharedInstance2 != null) {
            sharedInstance2.setSinks(d.r.d, k2Var.d);
        }
        try {
            d.c.removeView(d.a);
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }

    @Override // ti.m
    public final int U() {
        int i7;
        if (!m.a(VoIPService.getSharedInstance())) {
            return 1;
        }
        j2 a10 = a();
        if (a10 == null || (i7 = a10.rotatedFrameHeight) <= 0) {
            return 16;
        }
        return i7;
    }

    @Override // ti.m
    public final float V() {
        return 0.0f;
    }

    @Override // ti.m
    public final void Z(int i7, ArrayList arrayList) {
        g.a(i7, arrayList, false);
    }

    public final j2 a() {
        k2 k2Var;
        m mVar = this.b;
        if (mVar != null) {
            j2 j2Var = mVar.a.d;
            if (j2Var.rotatedFrameWidth > 0) {
                return j2Var;
            }
        }
        ic1 ic1Var = ic1.l1;
        if (ic1Var != null && (k2Var = ic1Var.c0) != null) {
            return k2Var.d;
        }
        e2 d = e2.d();
        if (d != null) {
            return d.s.d;
        }
        return null;
    }

    @Override // ti.m
    public final void e(View view) {
        g.a = false;
        org.telegram.messenger.g0.r(this.e);
        this.b = null;
        ic1 ic1Var = ic1.l1;
        if (ic1Var != null) {
            try {
                if (ic1Var.t0.getParent() == null) {
                    WindowManager windowManager = (WindowManager) ic1Var.b.getSystemService("window");
                    bc1 bc1Var = ic1Var.t0;
                    bc1Var.getClass();
                    windowManager.addView(bc1Var, o2.a());
                }
            } catch (Exception e10) {
                a8.g(e10, true);
            }
            ic1Var.k1 = false;
            ic1Var.j1 = null;
            ic1Var.y();
            ic1Var.t0.invalidate();
            return;
        }
        if (e2.d() != null) {
            e2 d = e2.d();
            x5 x5Var = d.a;
            try {
                if (x5Var.getParent() == null) {
                    d.c.addView(x5Var, d.d);
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

    @Override // ti.m
    public final /* synthetic */ boolean e0() {
        return true;
    }

    @Override // ti.m
    public final void f0(int i7) {
        g.b(i7, false);
        org.telegram.messenger.g0.i3(new vs(15), 300L);
    }

    @Override // ti.m
    public final long getDuration() {
        return 0L;
    }

    @Override // ti.m
    public final boolean h() {
        return true;
    }

    @Override // ti.m
    public final int j() {
        return 10;
    }

    @Override // ti.m
    public final long l() {
        return 0L;
    }

    @Override // ti.m
    public final /* synthetic */ boolean r() {
        return true;
    }

    @Override // ti.m
    public final /* synthetic */ boolean u() {
        return false;
    }

    @Override // ti.m
    public final void v(Rect rect) {
        rect.setEmpty();
    }

    @Override // ti.m
    public final View x(LaunchActivity launchActivity) {
        return new m(launchActivity);
    }

    @Override // ti.m
    public final void y(View view) {
        org.telegram.messenger.g0.r(this.e);
        if (this.b == view) {
            this.b = null;
        }
        m mVar = (m) view;
        mVar.f.b();
        mVar.a.d.release();
    }

    @Override // ti.m
    public final /* synthetic */ void J(float f10) {
    }

    @Override // ti.m
    public final void c(long j3) {
    }

    @Override // ti.m
    public final void g(ti.p pVar) {
    }

    @Override // ti.m
    public final /* synthetic */ void F() {
    }

    @Override // ti.m
    public final void T() {
    }

    @Override // ti.m
    public final void b() {
    }

    @Override // ti.m
    public final void f() {
    }

    @Override // ti.m
    public final /* synthetic */ void c0(Canvas canvas, int i7, int i10) {
    }
}

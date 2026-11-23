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
import org.telegram.ui.Components.en0;
import org.telegram.ui.Components.ne;
import org.telegram.ui.Components.rc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.fc1;
import org.telegram.ui.yb1;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class j2 implements wi.l {
    public static j2 h;
    public wi.n a;
    public m b;
    public long c;
    public boolean d;
    public final rc e = new rc(this, 28);
    public boolean f;

    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r5v3 */
    public static void d() {
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        boolean z10 = (fc1.m1 == null && i2.d() == null) ? false : true;
        if (sharedInstance == null || !z10) {
            j2 j2Var = h;
            if (j2Var != null) {
                h = null;
                wi.n nVar = j2Var.a;
                if (nVar != null) {
                    j2Var.a = null;
                    nVar.f();
                    return;
                }
                return;
            }
            return;
        }
        if (h == null) {
            h = new j2();
        }
        j2 j2Var2 = h;
        wi.n nVar2 = j2Var2.a;
        if (nVar2 == null || !nVar2.d()) {
            j2Var2.a = l2.j.d().j(j2Var2);
        }
        wi.n nVar3 = j2Var2.a;
        if (nVar3.c == 2) {
            nVar3.c();
            return;
        }
        i2 d = fc1.m1 == null ? i2.d() : null;
        wi.n nVar4 = j2Var2.a;
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
        j2Var2.a.c();
    }

    @Override // wi.l
    public final /* synthetic */ boolean A1(boolean z10, float f10, en0 en0Var) {
        return false;
    }

    @Override // wi.l
    public final void B0(View view) {
        m mVar;
        fc1 fc1Var = fc1.m1;
        if (fc1Var == null || (mVar = this.b) != view || this.f) {
            return;
        }
        this.f = true;
        mVar.getClass();
        mVar.r = SystemClock.elapsedRealtime();
        mVar.b();
        fc1Var.k1 = this.b.a;
        fc1Var.l1 = true;
        fc1Var.y();
        try {
            ((WindowManager) fc1Var.b.getSystemService("window")).removeView(fc1Var.u0);
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }

    @Override // wi.l
    public final /* synthetic */ boolean C2() {
        return true;
    }

    @Override // wi.l
    public final void D1(View view) {
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        g.a = (sharedInstance == null || sharedInstance.getVideoState(false) == 0) ? false : true;
        m mVar = (m) view;
        this.b = mVar;
        mVar.b();
        this.c = g.c();
        this.d = m.a(VoIPService.getSharedInstance());
        rc rcVar = this.e;
        org.telegram.messenger.g0.r(rcVar);
        org.telegram.messenger.g0.h3(rcVar, 500L);
        this.f = false;
        if (fc1.m1 != null || i2.d() == null) {
            return;
        }
        i2 d = i2.d();
        o2 o2Var = this.b.a;
        d.getClass();
        VoIPService sharedInstance2 = VoIPService.getSharedInstance();
        if (sharedInstance2 != null) {
            sharedInstance2.setSinks(d.r.d, o2Var.d);
        }
        try {
            d.c.removeView(d.a);
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }

    @Override // wi.l
    public final void D2(int i7) {
        g.b(i7, false);
        org.telegram.messenger.g0.h3(new ne(21), 300L);
    }

    @Override // wi.l
    public final void E0(SurfaceTexture surfaceTexture) {
        surfaceTexture.release();
    }

    @Override // wi.l
    public final /* synthetic */ View K0() {
        return null;
    }

    @Override // wi.l
    public final boolean O0() {
        fc1 fc1Var = fc1.m1;
        return fc1Var != null && fc1Var.d0.isAttachedToWindow();
    }

    @Override // wi.l
    public final int V1() {
        int i7;
        if (!m.a(VoIPService.getSharedInstance())) {
            return 1;
        }
        n2 a10 = a();
        if (a10 == null || (i7 = a10.rotatedFrameHeight) <= 0) {
            return 16;
        }
        return i7;
    }

    public final n2 a() {
        o2 o2Var;
        m mVar = this.b;
        if (mVar != null) {
            n2 n2Var = mVar.a.d;
            if (n2Var.rotatedFrameWidth > 0) {
                return n2Var;
            }
        }
        fc1 fc1Var = fc1.m1;
        if (fc1Var != null && (o2Var = fc1Var.d0) != null) {
            return o2Var.d;
        }
        i2 d = i2.d();
        if (d != null) {
            return d.s.d;
        }
        return null;
    }

    @Override // wi.l
    public final int b1() {
        int i7;
        if (!m.a(VoIPService.getSharedInstance())) {
            return 1;
        }
        n2 a10 = a();
        if (a10 == null || (i7 = a10.rotatedFrameWidth) <= 0) {
            return 9;
        }
        return i7;
    }

    @Override // wi.l
    public final float d2() {
        return 0.0f;
    }

    @Override // wi.l
    public final /* synthetic */ boolean f0() {
        return true;
    }

    @Override // wi.l
    public final long getDuration() {
        return 0L;
    }

    @Override // wi.l
    public final boolean h1() {
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        return (sharedInstance == null || sharedInstance.isHangingUp() || sharedInstance.getCallState() == 11 || sharedInstance.getCallState() == 10) ? false : true;
    }

    @Override // wi.l
    public final /* synthetic */ boolean i1() {
        return false;
    }

    @Override // wi.l
    public final boolean j() {
        return true;
    }

    @Override // wi.l
    public final void l(View view) {
        g.a = false;
        org.telegram.messenger.g0.r(this.e);
        this.b = null;
        fc1 fc1Var = fc1.m1;
        if (fc1Var != null) {
            try {
                if (fc1Var.u0.getParent() == null) {
                    WindowManager windowManager = (WindowManager) fc1Var.b.getSystemService("window");
                    yb1 yb1Var = fc1Var.u0;
                    yb1Var.getClass();
                    windowManager.addView(yb1Var, s2.a());
                }
            } catch (Exception e10) {
                a8.g(e10, true);
            }
            fc1Var.l1 = false;
            fc1Var.k1 = null;
            fc1Var.y();
            fc1Var.u0.invalidate();
            return;
        }
        if (i2.d() != null) {
            i2 d = i2.d();
            ai.h0 h0Var = d.a;
            try {
                if (h0Var.getParent() == null) {
                    d.c.addView(h0Var, d.d);
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
    public final /* synthetic */ boolean l0() {
        return false;
    }

    @Override // wi.l
    public final long n() {
        return 0L;
    }

    @Override // wi.l
    public final /* synthetic */ e2.c1 n1() {
        return null;
    }

    @Override // wi.l
    public final void n2(int i7, ArrayList arrayList) {
        g.a(i7, arrayList, false);
    }

    @Override // wi.l
    public final /* synthetic */ boolean o1() {
        return false;
    }

    @Override // wi.l
    public final void v1() {
        this.a = null;
        if (h == this) {
            h = null;
        }
        fc1 fc1Var = fc1.m1;
        if (fc1Var != null) {
            fc1Var.G0 = true;
            fc1Var.d0.d.release();
            fc1Var.e0.d.release();
            fc1Var.c0.release();
            fc1Var.c();
            fc1Var.u0.d();
            fc1.m1 = null;
            d();
        }
        i2.b();
    }

    @Override // wi.l
    public final void w0(Rect rect) {
        rect.setEmpty();
    }

    @Override // wi.l
    public final int y() {
        return 10;
    }

    @Override // wi.l
    public final View y0(LaunchActivity launchActivity) {
        return new m(launchActivity);
    }

    @Override // wi.l
    public final void z0(View view) {
        org.telegram.messenger.g0.r(this.e);
        if (this.b == view) {
            this.b = null;
        }
        m mVar = (m) view;
        mVar.f.b();
        mVar.a.d.release();
    }

    @Override // wi.l
    public final void I(wi.o oVar) {
    }

    @Override // wi.l
    public final void c(long j3) {
    }

    @Override // wi.l
    public final /* synthetic */ void d1(float f10) {
    }

    @Override // wi.l
    public final void P1() {
    }

    @Override // wi.l
    public final /* synthetic */ void T0() {
    }

    @Override // wi.l
    public final void b() {
    }

    @Override // wi.l
    public final void f() {
    }

    @Override // wi.l
    public final /* synthetic */ void t2(Canvas canvas, int i7, int i10) {
    }
}

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
import org.telegram.ui.Components.ih;
import org.telegram.ui.Components.um0;
import org.telegram.ui.Components.zj;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ec1;
import org.telegram.ui.xb1;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class j2 implements wi.l {
    public static j2 h;
    public wi.n a;
    public m b;
    public long c;
    public boolean d;
    public final zj e = new zj(this, 25);
    public boolean f;

    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r5v3 */
    public static void g() {
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        boolean z10 = (ec1.m1 == null && i2.d() == null) ? false : true;
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
            j2Var2.a = l2.i.d().k(j2Var2);
        }
        wi.n nVar3 = j2Var2.a;
        if (nVar3.c == 2) {
            nVar3.c();
            return;
        }
        i2 d = ec1.m1 == null ? i2.d() : null;
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
    public final void A(View view) {
        m mVar;
        ec1 ec1Var = ec1.m1;
        if (ec1Var == null || (mVar = this.b) != view || this.f) {
            return;
        }
        this.f = true;
        mVar.getClass();
        mVar.r = SystemClock.elapsedRealtime();
        mVar.b();
        ec1Var.k1 = this.b.a;
        ec1Var.l1 = true;
        ec1Var.y();
        try {
            ((WindowManager) ec1Var.b.getSystemService("window")).removeView(ec1Var.u0);
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }

    @Override // wi.l
    public final void C(SurfaceTexture surfaceTexture) {
        surfaceTexture.release();
    }

    @Override // wi.l
    public final /* synthetic */ View D() {
        return null;
    }

    @Override // wi.l
    public final boolean F() {
        ec1 ec1Var = ec1.m1;
        return ec1Var != null && ec1Var.d0.isAttachedToWindow();
    }

    @Override // wi.l
    public final int L() {
        int i7;
        if (!m.a(VoIPService.getSharedInstance())) {
            return 1;
        }
        n2 e10 = e();
        if (e10 == null || (i7 = e10.rotatedFrameWidth) <= 0) {
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
    public final /* synthetic */ boolean P() {
        return false;
    }

    @Override // wi.l
    public final /* synthetic */ e2.c1 R() {
        return null;
    }

    @Override // wi.l
    public final /* synthetic */ boolean T() {
        return false;
    }

    @Override // wi.l
    public final void V() {
        this.a = null;
        if (h == this) {
            h = null;
        }
        ec1 ec1Var = ec1.m1;
        if (ec1Var != null) {
            ec1Var.G0 = true;
            ec1Var.d0.d.release();
            ec1Var.e0.d.release();
            ec1Var.c0.release();
            ec1Var.c();
            ec1Var.u0.d();
            ec1.m1 = null;
            g();
        }
        i2.b();
    }

    @Override // wi.l
    public final /* synthetic */ boolean X(boolean z10, float f10, um0 um0Var) {
        return false;
    }

    @Override // wi.l
    public final void Y(View view) {
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        g.a = (sharedInstance == null || sharedInstance.getVideoState(false) == 0) ? false : true;
        m mVar = (m) view;
        this.b = mVar;
        mVar.b();
        this.c = g.c();
        this.d = m.a(VoIPService.getSharedInstance());
        zj zjVar = this.e;
        org.telegram.messenger.g0.r(zjVar);
        org.telegram.messenger.g0.i3(zjVar, 500L);
        this.f = false;
        if (ec1.m1 != null || i2.d() == null) {
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
    public final void a(View view) {
        g.a = false;
        org.telegram.messenger.g0.r(this.e);
        this.b = null;
        ec1 ec1Var = ec1.m1;
        if (ec1Var != null) {
            try {
                if (ec1Var.u0.getParent() == null) {
                    WindowManager windowManager = (WindowManager) ec1Var.b.getSystemService("window");
                    xb1 xb1Var = ec1Var.u0;
                    xb1Var.getClass();
                    windowManager.addView(xb1Var, s2.a());
                }
            } catch (Exception e10) {
                a8.g(e10, true);
            }
            ec1Var.l1 = false;
            ec1Var.k1 = null;
            ec1Var.y();
            ec1Var.u0.invalidate();
            return;
        }
        if (i2.d() != null) {
            i2 d = i2.d();
            ai.j0 j0Var = d.a;
            try {
                if (j0Var.getParent() == null) {
                    d.c.addView(j0Var, d.d);
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
    public final int b0() {
        int i7;
        if (!m.a(VoIPService.getSharedInstance())) {
            return 1;
        }
        n2 e10 = e();
        if (e10 == null || (i7 = e10.rotatedFrameHeight) <= 0) {
            return 16;
        }
        return i7;
    }

    @Override // wi.l
    public final float c0() {
        return 0.0f;
    }

    @Override // wi.l
    public final int d() {
        return 10;
    }

    public final n2 e() {
        o2 o2Var;
        m mVar = this.b;
        if (mVar != null) {
            n2 n2Var = mVar.a.d;
            if (n2Var.rotatedFrameWidth > 0) {
                return n2Var;
            }
        }
        ec1 ec1Var = ec1.m1;
        if (ec1Var != null && (o2Var = ec1Var.d0) != null) {
            return o2Var.d;
        }
        i2 d = i2.d();
        if (d != null) {
            return d.s.d;
        }
        return null;
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
    public final void j0(int i7, ArrayList arrayList) {
        g.a(i7, arrayList, false);
    }

    @Override // wi.l
    public final long l() {
        return 0L;
    }

    @Override // wi.l
    public final /* synthetic */ boolean p() {
        return true;
    }

    @Override // wi.l
    public final /* synthetic */ boolean q() {
        return false;
    }

    @Override // wi.l
    public final /* synthetic */ boolean t0() {
        return true;
    }

    @Override // wi.l
    public final void u(Rect rect) {
        rect.setEmpty();
    }

    @Override // wi.l
    public final void u0(int i7) {
        g.b(i7, false);
        org.telegram.messenger.g0.i3(new ih(19), 300L);
    }

    @Override // wi.l
    public final View w(LaunchActivity launchActivity) {
        return new m(launchActivity);
    }

    @Override // wi.l
    public final void x(View view) {
        org.telegram.messenger.g0.r(this.e);
        if (this.b == view) {
            this.b = null;
        }
        m mVar = (m) view;
        mVar.f.b();
        mVar.a.d.release();
    }

    @Override // wi.l
    public final /* synthetic */ void M(float f10) {
    }

    @Override // wi.l
    public final void c(long j3) {
    }

    @Override // wi.l
    public final void j(wi.o oVar) {
    }

    @Override // wi.l
    public final /* synthetic */ void G() {
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
    public final /* synthetic */ void o0(Canvas canvas, int i7, int i10) {
    }
}

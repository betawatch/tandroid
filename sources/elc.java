// default package

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.os.SystemClock;
import android.view.View;
import android.view.WindowManager;
import java.util.ArrayList;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class elc implements je8 {
    public static elc h;
    public me8 a;
    public q91 b;
    public long c;
    public boolean d;
    public final bva e = new bva(this, (byte) 13);
    public boolean f;

    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2, types: [boolean, byte] */
    /* JADX WARN: Type inference failed for: r5v3 */
    public static void c() {
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        boolean z = (mkc.m1 == null && dlc.d() == null) ? false : true;
        if (sharedInstance == null || !z) {
            elc elcVar = h;
            if (elcVar != null) {
                h = null;
                me8 me8Var = elcVar.a;
                if (me8Var != null) {
                    elcVar.a = null;
                    me8Var.h();
                    return;
                }
                return;
            }
            return;
        }
        elc elcVar2 = h;
        if (elcVar2 == null) {
            elcVar2 = new elc();
            h = elcVar2;
        }
        me8 me8Var2 = elcVar2.a;
        if (me8Var2 == null || !me8Var2.f()) {
            elcVar2.a = fc3.b().k(elcVar2);
        }
        me8 me8Var3 = elcVar2.a;
        if (me8Var3.c == 2) {
            me8Var3.e();
            return;
        }
        dlc d = mkc.m1 == null ? dlc.d() : null;
        me8 me8Var4 = elcVar2.a;
        ?? r5 = d != null ? 1 : 0;
        boolean z2 = d != null && d.e;
        byte b = me8Var4.c;
        if (b != 3) {
            me8Var4.g = r5;
            me8Var4.h = z2;
            if (b == 2) {
                me8Var4.d = r5;
            } else {
                me8Var4.c = r5;
            }
            me8Var4.b.d();
        }
        elcVar2.a.e();
    }

    @Override // je8
    public final boolean A0() {
        return true;
    }

    @Override // je8
    public final boolean E() {
        return true;
    }

    @Override // je8
    public final boolean E0() {
        return true;
    }

    @Override // je8
    public final boolean G(boolean z, float f, cz9 cz9Var) {
        return false;
    }

    @Override // je8
    public final void G0(int i) {
        k91.b(i, false);
        hl.d3(new osa((byte) 11), 300L);
    }

    @Override // je8
    public final boolean H() {
        return false;
    }

    @Override // je8
    public final void J(Rect rect) {
        rect.setEmpty();
    }

    @Override // je8
    public final View K(LaunchActivity launchActivity) {
        return new q91(launchActivity);
    }

    @Override // je8
    public final void L(View view) {
        hl.r(this.e);
        if (this.b == view) {
            this.b = null;
        }
        q91 q91Var = (q91) view;
        q91Var.f.b();
        q91Var.a.d.e();
    }

    @Override // je8
    public final void N(View view) {
        q91 q91Var;
        mkc mkcVar = mkc.m1;
        if (mkcVar == null || (q91Var = this.b) != view || this.f) {
            return;
        }
        this.f = true;
        q91Var.getClass();
        q91Var.r = SystemClock.elapsedRealtime();
        q91Var.b();
        mkcVar.k1 = this.b.a;
        mkcVar.l1 = true;
        mkcVar.y();
        try {
            ((WindowManager) mkcVar.b.getSystemService("window")).removeView(mkcVar.u0);
        } catch (Exception e) {
            cc4.g(e, true);
        }
    }

    @Override // je8
    public final View P() {
        return null;
    }

    @Override // je8
    public final boolean Q() {
        mkc mkcVar = mkc.m1;
        return mkcVar != null && mkcVar.d0.isAttachedToWindow();
    }

    @Override // je8
    public final int S() {
        return 0;
    }

    @Override // je8
    public final int U() {
        int i;
        if (!q91.a(VoIPService.getSharedInstance())) {
            return 1;
        }
        gmc a = a();
        if (a == null || (i = a.e) <= 0) {
            return 9;
        }
        return i;
    }

    @Override // je8
    public final boolean X() {
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        return (sharedInstance == null || sharedInstance.isHangingUp() || sharedInstance.getCallState() == 11 || sharedInstance.getCallState() == 10) ? false : true;
    }

    @Override // je8
    public final boolean Y() {
        return false;
    }

    public final gmc a() {
        hmc hmcVar;
        q91 q91Var = this.b;
        if (q91Var != null) {
            gmc gmcVar = q91Var.a.d;
            if (gmcVar.e > 0) {
                return gmcVar;
            }
        }
        mkc mkcVar = mkc.m1;
        if (mkcVar != null && (hmcVar = mkcVar.d0) != null) {
            return hmcVar.d;
        }
        dlc d = dlc.d();
        if (d != null) {
            return d.s.d;
        }
        return null;
    }

    @Override // je8
    public final dg8 a0() {
        return null;
    }

    @Override // je8
    public final boolean d0() {
        return false;
    }

    @Override // je8
    public final void g0() {
        this.a = null;
        if (h == this) {
            h = null;
        }
        mkc mkcVar = mkc.m1;
        if (mkcVar != null) {
            mkcVar.G0 = true;
            mkcVar.d0.d.e();
            mkcVar.e0.d.e();
            mkcVar.c0.e();
            mkcVar.b();
            mkcVar.u0.d();
            mkc.m1 = null;
            c();
        }
        dlc.b();
    }

    @Override // je8
    public final long getDuration() {
        return 0L;
    }

    @Override // je8
    public final boolean i() {
        return true;
    }

    @Override // je8
    public final long k() {
        return 0L;
    }

    @Override // je8
    public final void l(View view) {
        k91.a = false;
        hl.r(this.e);
        this.b = null;
        mkc mkcVar = mkc.m1;
        if (mkcVar != null) {
            try {
                if (mkcVar.u0.getParent() == null) {
                    WindowManager windowManager = (WindowManager) mkcVar.b.getSystemService("window");
                    fkc fkcVar = mkcVar.u0;
                    fkcVar.getClass();
                    windowManager.addView(fkcVar, qmc.a());
                }
            } catch (Exception e) {
                cc4.g(e, true);
            }
            mkcVar.l1 = false;
            mkcVar.k1 = null;
            mkcVar.y();
            mkcVar.u0.invalidate();
            return;
        }
        if (dlc.d() != null) {
            dlc d = dlc.d();
            iy9 iy9Var = d.a;
            try {
                if (iy9Var.getParent() == null) {
                    d.c.addView(iy9Var, d.d);
                }
            } catch (Exception e2) {
                cc4.g(e2, true);
            }
            VoIPService sharedInstance = VoIPService.getSharedInstance();
            if (sharedInstance != null) {
                sharedInstance.setSinks(d.r.d, d.s.d);
            }
        }
    }

    @Override // je8
    public final void o0(View view) {
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        k91.a = (sharedInstance == null || sharedInstance.getVideoState(false) == 0) ? false : true;
        q91 q91Var = (q91) view;
        this.b = q91Var;
        q91Var.b();
        this.c = k91.c();
        this.d = q91.a(VoIPService.getSharedInstance());
        bva bvaVar = this.e;
        hl.r(bvaVar);
        hl.d3(bvaVar, 500L);
        this.f = false;
        if (mkc.m1 != null || dlc.d() == null) {
            return;
        }
        dlc d = dlc.d();
        hmc hmcVar = this.b.a;
        d.getClass();
        VoIPService sharedInstance2 = VoIPService.getSharedInstance();
        if (sharedInstance2 != null) {
            sharedInstance2.setSinks(d.r.d, hmcVar.d);
        }
        try {
            d.c.removeView(d.a);
        } catch (Exception e) {
            cc4.g(e, true);
        }
    }

    @Override // je8
    public final int q() {
        return 10;
    }

    @Override // je8
    public final int q0() {
        int i;
        if (!q91.a(VoIPService.getSharedInstance())) {
            return 1;
        }
        gmc a = a();
        if (a == null || (i = a.f) <= 0) {
            return 16;
        }
        return i;
    }

    @Override // je8
    public final float r0() {
        return 0.0f;
    }

    @Override // je8
    public final void s(SurfaceTexture surfaceTexture, Bitmap bitmap) {
        surfaceTexture.release();
    }

    @Override // je8
    public final void u0(int i, ArrayList arrayList) {
        k91.a(i, arrayList, false);
    }

    @Override // je8
    public final boolean v() {
        return false;
    }

    @Override // je8
    public final void T() {
    }

    @Override // je8
    public final void b() {
    }

    @Override // je8
    public final void j() {
    }

    @Override // je8
    public final void p0() {
    }

    @Override // je8
    public final void R(ne8 ne8Var) {
    }

    @Override // je8
    public final void V(float f) {
    }

    @Override // je8
    public final void g(long j) {
    }

    @Override // je8
    public final void v0(Canvas canvas, int i, int i2) {
    }
}

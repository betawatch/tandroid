package hi;

import android.widget.FrameLayout;
import org.telegram.ui.Components.h61;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes4.dex */
public final class f5 implements z, tg.g {
    public final /* synthetic */ pa a;

    public /* synthetic */ f5(pa paVar) {
        this.a = paVar;
    }

    @Override // hi.z
    public void M1(tg.d dVar) {
        this.a.c0(dVar);
    }

    @Override // hi.z
    public FrameLayout N() {
        return this.a.w1;
    }

    @Override // hi.z
    public long N1() {
        x7 x7Var = this.a.V1;
        if (x7Var == null) {
            return 0L;
        }
        return (long) (x7Var.Z * x7Var.h0);
    }

    @Override // hi.z
    public org.telegram.ui.ActionBar.i6 Q() {
        return this.a.q1;
    }

    @Override // hi.z
    public FrameLayout Q0() {
        return this.a;
    }

    @Override // hi.z
    public tg.d S() {
        pa paVar = this.a;
        paVar.Z1 = true;
        return paVar.g0();
    }

    @Override // hi.z
    public void V0(tg.n nVar) {
        this.a.B0(nVar);
    }

    @Override // hi.z
    public long Z0() {
        x7 x7Var = this.a.V1;
        if (x7Var == null) {
            return 0L;
        }
        return (long) (x7Var.a0 * x7Var.h0);
    }

    @Override // tg.g
    public void h() {
        pa paVar = this.a;
        paVar.D0(null, true);
        if (paVar.w0) {
            nb nbVar = paVar.o2;
            nbVar.d1.f.d();
            nbVar.k0(-1, false, true);
            paVar.w0 = false;
        }
        paVar.O0(false);
    }

    @Override // hi.z
    public tg.d i0() {
        q5 q5Var = this.a.B0;
        for (int i7 = 0; i7 < q5Var.getChildCount(); i7++) {
            if (q5Var.getChildAt(i7) instanceof tg.d) {
                return (tg.d) q5Var.getChildAt(i7);
            }
        }
        return null;
    }

    @Override // tg.g
    public tg.n o() {
        return this.a.t0;
    }

    @Override // hi.z
    public void s2(long j3) {
        l2.g0 g0Var;
        f6 f6Var = this.a.Q1;
        if (f6Var != null) {
            h61 h61Var = f6Var.e;
            if (h61Var == null || ((g0Var = h61Var.d) != null && g0Var.f0())) {
                f6Var.m(j3);
            }
        }
    }

    @Override // hi.z
    public long u0() {
        f6 f6Var = this.a.Q1;
        if (f6Var != null) {
            return f6Var.getCurrentPosition();
        }
        return 0L;
    }

    @Override // hi.z
    public void w(boolean z10) {
        f6 f6Var = this.a.Q1;
        if (f6Var != null) {
            f6Var.x(-8713, z10);
        }
    }
}

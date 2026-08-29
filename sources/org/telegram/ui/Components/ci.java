package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class ci extends org.telegram.ui.ActionBar.q1 {
    public final /* synthetic */ di x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ci(di diVar, di diVar2) {
        super(diVar2);
        this.x = diVar;
    }

    @Override // org.telegram.ui.ActionBar.q1
    public final boolean b() {
        fz fzVar;
        ni niVar = this.x.x0;
        if (!niVar.isDismissed() && niVar.o1) {
            fi fiVar = niVar.u0;
            if (fiVar != niVar.i0 && fiVar != niVar.j0 && !niVar.m1().m()) {
                return true;
            }
            fi fiVar2 = niVar.u0;
            on onVar = niVar.i0;
            if (fiVar2 == onVar && ((fzVar = onVar.A) == null || fzVar.getVisibility() != 0)) {
                return true;
            }
            fi fiVar3 = niVar.u0;
            on onVar2 = niVar.j0;
            if (fiVar3 == onVar2) {
                fz fzVar2 = onVar2.A;
                return fzVar2 == null || fzVar2.getVisibility() != 0;
            }
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.q1
    public final void e(float f9, float f10, boolean z10) {
        di diVar = this.x;
        ni niVar = diVar.x0;
        niVar.h2 = f9;
        float f11 = niVar.Z1;
        if (f11 > 0.0f) {
            niVar.h2 = com.google.android.recaptcha.internal.a.z(1.0f, f10, f11 - niVar.a2, f9);
        }
        niVar.T0.setTranslationY(niVar.h2);
        niVar.W0.setTranslationY(niVar.h2);
        org.telegram.ui.ActionBar.w0 w0Var = niVar.a1;
        if (w0Var != null) {
            w0Var.setTranslationY(niVar.h2);
        }
        org.telegram.ui.ActionBar.w0 w0Var2 = niVar.Y0;
        if (w0Var2 != null) {
            w0Var2.setTranslationY(niVar.W0.getTranslationY());
        }
        nh.t3 t3Var = niVar.Z0;
        if (t3Var != null) {
            t3Var.setTranslationY(niVar.W0.getTranslationY());
        }
        niVar.b1.setTranslationY(niVar.h2);
        niVar.a2(0);
        niVar.setCurrentPanTranslationY(niVar.h2);
        diVar.invalidate();
        niVar.z0.invalidate();
        niVar.U1();
        fi fiVar = niVar.u0;
        if (fiVar != null) {
            fiVar.k(niVar.h2);
        }
    }

    @Override // org.telegram.ui.ActionBar.q1
    public final void f() {
        boolean z10;
        ni niVar = this.x.x0;
        niVar.X1(niVar.u0, 0);
        niVar.Y1 = niVar.X1[0];
        niVar.u0.v();
        if (!(niVar.u0 instanceof ph.n3) || niVar.z1) {
            return;
        }
        z10 = ((org.telegram.ui.ActionBar.f3) niVar).keyboardVisible;
        int dp = z10 ? AndroidUtilities.dp(84.0f) : 0;
        for (int i10 = 0; i10 < niVar.t0.size(); i10++) {
            ((ph.n3) niVar.t0.valueAt(i10)).setMeasureOffsetY(dp);
        }
    }

    @Override // org.telegram.ui.ActionBar.q1
    public final void g(int i10, boolean z10) {
        int i11;
        di diVar = this.x;
        ni niVar = diVar.x0;
        int i12 = niVar.Y1;
        if (i12 <= 0 || i12 == (i11 = niVar.X1[0]) || !z10) {
            niVar.Z1 = -1.0f;
        } else {
            niVar.Z1 = i12;
            niVar.a2 = i11;
        }
        diVar.invalidate();
        ph phVar = niVar.t1;
        if ((niVar.u0 instanceof ph.n3) && !niVar.z1) {
            if (z10) {
                phVar.setVisibility(8);
            } else {
                phVar.setVisibility(0);
            }
        }
        niVar.u0.w(i10, z10);
    }
}

package org.telegram.ui.ActionBar;

import android.view.ViewGroup;
import org.telegram.messenger.id;
import org.telegram.messenger.ij;
import org.telegram.ui.Components.du0;
import org.telegram.ui.Components.jm0;
import org.telegram.ui.Components.lm0;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.Components.nz;
import org.telegram.ui.Components.pm0;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final class u0 extends nz {
    public final /* synthetic */ int e;
    public final /* synthetic */ ViewGroup f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u0(ViewGroup viewGroup, int i7) {
        super(false);
        this.e = i7;
        this.f = viewGroup;
    }

    @Override // org.telegram.ui.Components.km0
    public CharSequence d() {
        int i7 = this.e;
        ViewGroup viewGroup = this.f;
        switch (i7) {
            case 0:
                return du0.a(((v0) viewGroup).getSpeed()) + "x  " + id.M0(2131754759, null);
            case 1:
            default:
                return super.d();
            case 2:
                lm0 lm0Var = ((mm0) viewGroup).y;
                if (lm0Var != null) {
                    return lm0Var.getContentDescription();
                }
                return null;
        }
    }

    @Override // org.telegram.ui.Components.nz
    public float h() {
        switch (this.e) {
            case 0:
                return 0.2f;
            case 1:
            default:
                return super.h();
            case 2:
                int q02 = ((mm0) this.f).y.q0();
                if (q02 > 0) {
                    return 1.0f / q02;
                }
                return 0.05f;
        }
    }

    @Override // org.telegram.ui.Components.nz
    public float i() {
        switch (this.e) {
            case 0:
                return 3.0f;
            default:
                return super.i();
        }
    }

    @Override // org.telegram.ui.Components.nz
    public float j() {
        switch (this.e) {
            case 0:
                return 0.2f;
            default:
                return super.j();
        }
    }

    @Override // org.telegram.ui.Components.nz
    public final float k() {
        float f10;
        int i7;
        int i10;
        switch (this.e) {
            case 0:
                return ((v0) this.f).getSpeed();
            case 1:
                org.telegram.ui.Cells.q1 q1Var = (org.telegram.ui.Cells.q1) this.f;
                org.telegram.ui.Cells.i1 i1Var = q1Var.C4;
                if (q1Var.P5.J3()) {
                    f10 = i1Var.b;
                    i7 = i1Var.f;
                    i10 = jm0.E;
                } else {
                    if (!ij.S4(q1Var.P5.k)) {
                        if (q1Var.P5.i4()) {
                            return q1Var.P5.b0;
                        }
                        return 0.0f;
                    }
                    if (q1Var.B4) {
                        pm0 pm0Var = q1Var.D4;
                        return pm0Var.a / pm0Var.g;
                    }
                    f10 = i1Var.b;
                    i7 = i1Var.f;
                    i10 = jm0.E;
                }
                return f10 / (i7 - i10);
            default:
                return ((mm0) this.f).getProgress();
        }
    }

    @Override // org.telegram.ui.Components.nz
    public final void l(float f10) {
        switch (this.e) {
            case 0:
                ((v0) this.f).e(true, f10);
                break;
            case 1:
                org.telegram.ui.Cells.q1 q1Var = (org.telegram.ui.Cells.q1) this.f;
                pm0 pm0Var = q1Var.D4;
                org.telegram.ui.Cells.i1 i1Var = q1Var.C4;
                if (q1Var.P5.J3()) {
                    i1Var.h(f10);
                } else if (ij.S4(q1Var.P5.k)) {
                    if (q1Var.B4) {
                        pm0Var.g(false, f10);
                    } else {
                        i1Var.h(f10);
                    }
                } else if (q1Var.P5.i4()) {
                    if (q1Var.B4) {
                        if (pm0Var != null) {
                            pm0Var.g(false, f10);
                        }
                    } else if (i1Var != null) {
                        i1Var.h(f10);
                    }
                    q1Var.P5.b0 = f10;
                }
                q1Var.a(f10);
                q1Var.invalidate();
                break;
            default:
                mm0 mm0Var = (mm0) this.f;
                mm0Var.x = true;
                mm0Var.setProgress(f10);
                mm0Var.f(true, f10);
                mm0Var.x = false;
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u0(mm0 mm0Var, boolean z9) {
        super(z9);
        this.e = 2;
        this.f = mm0Var;
    }
}

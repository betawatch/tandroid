package org.telegram.ui.ActionBar;

import android.view.ViewGroup;
import org.telegram.messenger.bd;
import org.telegram.messenger.zi;
import org.telegram.ui.Components.cu0;
import org.telegram.ui.Components.jz;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.Components.om0;
import org.telegram.ui.Components.pm0;
import org.telegram.ui.Components.sm0;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class t0 extends jz {
    public final /* synthetic */ int e;
    public final /* synthetic */ ViewGroup f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t0(ViewGroup viewGroup, int i3) {
        super(false);
        this.e = i3;
        this.f = viewGroup;
    }

    @Override // org.telegram.ui.Components.nm0
    public CharSequence d() {
        int i3 = this.e;
        ViewGroup viewGroup = this.f;
        switch (i3) {
            case 0:
                return cu0.a(((u0) viewGroup).getSpeed()) + "x  " + bd.M0(2131754759, null);
            case 1:
            default:
                return super.d();
            case 2:
                om0 om0Var = ((pm0) viewGroup).y;
                if (om0Var != null) {
                    return om0Var.getContentDescription();
                }
                return null;
        }
    }

    @Override // org.telegram.ui.Components.jz
    public float h() {
        switch (this.e) {
            case 0:
                return 0.2f;
            case 1:
            default:
                return super.h();
            case 2:
                int q02 = ((pm0) this.f).y.q0();
                if (q02 > 0) {
                    return 1.0f / q02;
                }
                return 0.05f;
        }
    }

    @Override // org.telegram.ui.Components.jz
    public float i() {
        switch (this.e) {
            case 0:
                return 3.0f;
            default:
                return super.i();
        }
    }

    @Override // org.telegram.ui.Components.jz
    public float j() {
        switch (this.e) {
            case 0:
                return 0.2f;
            default:
                return super.j();
        }
    }

    @Override // org.telegram.ui.Components.jz
    public final float k() {
        float f10;
        int i3;
        int i10;
        switch (this.e) {
            case 0:
                return ((u0) this.f).getSpeed();
            case 1:
                org.telegram.ui.Cells.q1 q1Var = (org.telegram.ui.Cells.q1) this.f;
                org.telegram.ui.Cells.i1 i1Var = q1Var.C4;
                if (q1Var.P5.J3()) {
                    f10 = i1Var.b;
                    i3 = i1Var.f;
                    i10 = mm0.E;
                } else {
                    if (!zi.S4(q1Var.P5.k)) {
                        if (q1Var.P5.i4()) {
                            return q1Var.P5.b0;
                        }
                        return 0.0f;
                    }
                    if (q1Var.B4) {
                        sm0 sm0Var = q1Var.D4;
                        return sm0Var.a / sm0Var.g;
                    }
                    f10 = i1Var.b;
                    i3 = i1Var.f;
                    i10 = mm0.E;
                }
                return f10 / (i3 - i10);
            default:
                return ((pm0) this.f).getProgress();
        }
    }

    @Override // org.telegram.ui.Components.jz
    public final void l(float f10) {
        switch (this.e) {
            case 0:
                ((u0) this.f).e(true, f10);
                break;
            case 1:
                org.telegram.ui.Cells.q1 q1Var = (org.telegram.ui.Cells.q1) this.f;
                sm0 sm0Var = q1Var.D4;
                org.telegram.ui.Cells.i1 i1Var = q1Var.C4;
                if (q1Var.P5.J3()) {
                    i1Var.h(f10);
                } else if (zi.S4(q1Var.P5.k)) {
                    if (q1Var.B4) {
                        sm0Var.g(false, f10);
                    } else {
                        i1Var.h(f10);
                    }
                } else if (q1Var.P5.i4()) {
                    if (q1Var.B4) {
                        if (sm0Var != null) {
                            sm0Var.g(false, f10);
                        }
                    } else if (i1Var != null) {
                        i1Var.h(f10);
                    }
                    q1Var.P5.b0 = f10;
                }
                q1Var.c(f10);
                q1Var.invalidate();
                break;
            default:
                pm0 pm0Var = (pm0) this.f;
                pm0Var.x = true;
                pm0Var.setProgress(f10);
                pm0Var.f(true, f10);
                pm0Var.x = false;
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t0(pm0 pm0Var, boolean z10) {
        super(z10);
        this.e = 2;
        this.f = pm0Var;
    }
}

package org.telegram.ui.ActionBar;

import android.view.ViewGroup;
import org.telegram.messenger.fj;
import org.telegram.messenger.gd;
import org.telegram.ui.Components.bn0;
import org.telegram.ui.Components.mu0;
import org.telegram.ui.Components.vm0;
import org.telegram.ui.Components.xm0;
import org.telegram.ui.Components.xz;
import org.telegram.ui.Components.ym0;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class u0 extends xz {
    public final /* synthetic */ int e;
    public final /* synthetic */ ViewGroup f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u0(ViewGroup viewGroup, int i7) {
        super(false);
        this.e = i7;
        this.f = viewGroup;
    }

    @Override // org.telegram.ui.Components.wm0
    public CharSequence d() {
        int i7 = this.e;
        ViewGroup viewGroup = this.f;
        switch (i7) {
            case 0:
                return mu0.a(((v0) viewGroup).getSpeed()) + "x  " + gd.M0(2131754759, null);
            case 1:
            default:
                return super.d();
            case 2:
                xm0 xm0Var = ((ym0) viewGroup).y;
                if (xm0Var != null) {
                    return xm0Var.getContentDescription();
                }
                return null;
        }
    }

    @Override // org.telegram.ui.Components.xz
    public float h() {
        switch (this.e) {
            case 0:
                return 0.2f;
            case 1:
            default:
                return super.h();
            case 2:
                int r02 = ((ym0) this.f).y.r0();
                if (r02 > 0) {
                    return 1.0f / r02;
                }
                return 0.05f;
        }
    }

    @Override // org.telegram.ui.Components.xz
    public float i() {
        switch (this.e) {
            case 0:
                return 3.0f;
            default:
                return super.i();
        }
    }

    @Override // org.telegram.ui.Components.xz
    public float j() {
        switch (this.e) {
            case 0:
                return 0.2f;
            default:
                return super.j();
        }
    }

    @Override // org.telegram.ui.Components.xz
    public final float k() {
        float f10;
        int i7;
        int i10;
        switch (this.e) {
            case 0:
                return ((v0) this.f).getSpeed();
            case 1:
                org.telegram.ui.Cells.q1 q1Var = (org.telegram.ui.Cells.q1) this.f;
                org.telegram.ui.Cells.i1 i1Var = q1Var.D4;
                if (q1Var.Q5.I3()) {
                    f10 = i1Var.b;
                    i7 = i1Var.f;
                    i10 = vm0.E;
                } else {
                    if (!fj.R4(q1Var.Q5.k)) {
                        if (q1Var.Q5.h4()) {
                            return q1Var.Q5.b0;
                        }
                        return 0.0f;
                    }
                    if (q1Var.C4) {
                        bn0 bn0Var = q1Var.E4;
                        return bn0Var.a / bn0Var.g;
                    }
                    f10 = i1Var.b;
                    i7 = i1Var.f;
                    i10 = vm0.E;
                }
                return f10 / (i7 - i10);
            default:
                return ((ym0) this.f).getProgress();
        }
    }

    @Override // org.telegram.ui.Components.xz
    public final void l(float f10) {
        switch (this.e) {
            case 0:
                ((v0) this.f).e(true, f10);
                break;
            case 1:
                org.telegram.ui.Cells.q1 q1Var = (org.telegram.ui.Cells.q1) this.f;
                bn0 bn0Var = q1Var.E4;
                org.telegram.ui.Cells.i1 i1Var = q1Var.D4;
                if (q1Var.Q5.I3()) {
                    i1Var.h(f10);
                } else if (fj.R4(q1Var.Q5.k)) {
                    if (q1Var.C4) {
                        bn0Var.g(false, f10);
                    } else {
                        i1Var.h(f10);
                    }
                } else if (q1Var.Q5.h4()) {
                    if (q1Var.C4) {
                        if (bn0Var != null) {
                            bn0Var.g(false, f10);
                        }
                    } else if (i1Var != null) {
                        i1Var.h(f10);
                    }
                    q1Var.Q5.b0 = f10;
                }
                q1Var.a(f10);
                q1Var.invalidate();
                break;
            default:
                ym0 ym0Var = (ym0) this.f;
                ym0Var.x = true;
                ym0Var.setProgress(f10);
                ym0Var.f(true, f10);
                ym0Var.x = false;
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u0(ym0 ym0Var, boolean z10) {
        super(z10);
        this.e = 2;
        this.f = ym0Var;
    }
}

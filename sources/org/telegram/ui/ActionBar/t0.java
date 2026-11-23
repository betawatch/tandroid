package org.telegram.ui.ActionBar;

import android.view.ViewGroup;
import org.telegram.messenger.fj;
import org.telegram.messenger.gd;
import org.telegram.ui.Components.an0;
import org.telegram.ui.Components.dn0;
import org.telegram.ui.Components.ou0;
import org.telegram.ui.Components.wz;
import org.telegram.ui.Components.xm0;
import org.telegram.ui.Components.zm0;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class t0 extends wz {
    public final /* synthetic */ int e;
    public final /* synthetic */ ViewGroup f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t0(ViewGroup viewGroup, int i7) {
        super(false);
        this.e = i7;
        this.f = viewGroup;
    }

    @Override // org.telegram.ui.Components.ym0
    public CharSequence d() {
        int i7 = this.e;
        ViewGroup viewGroup = this.f;
        switch (i7) {
            case 0:
                return ou0.a(((u0) viewGroup).getSpeed()) + "x  " + gd.N0(2131754758, null);
            case 1:
            default:
                return super.d();
            case 2:
                zm0 zm0Var = ((an0) viewGroup).y;
                if (zm0Var != null) {
                    return zm0Var.getContentDescription();
                }
                return null;
        }
    }

    @Override // org.telegram.ui.Components.wz
    public float h() {
        switch (this.e) {
            case 0:
                return 0.2f;
            case 1:
            default:
                return super.h();
            case 2:
                int a02 = ((an0) this.f).y.a0();
                if (a02 > 0) {
                    return 1.0f / a02;
                }
                return 0.05f;
        }
    }

    @Override // org.telegram.ui.Components.wz
    public float i() {
        switch (this.e) {
            case 0:
                return 3.0f;
            default:
                return super.i();
        }
    }

    @Override // org.telegram.ui.Components.wz
    public float j() {
        switch (this.e) {
            case 0:
                return 0.2f;
            default:
                return super.j();
        }
    }

    @Override // org.telegram.ui.Components.wz
    public final float k() {
        float f10;
        int i7;
        int i10;
        switch (this.e) {
            case 0:
                return ((u0) this.f).getSpeed();
            case 1:
                org.telegram.ui.Cells.r1 r1Var = (org.telegram.ui.Cells.r1) this.f;
                org.telegram.ui.Cells.j1 j1Var = r1Var.D4;
                if (r1Var.Q5.I3()) {
                    f10 = j1Var.b;
                    i7 = j1Var.f;
                    i10 = xm0.E;
                } else {
                    if (!fj.R4(r1Var.Q5.k)) {
                        if (r1Var.Q5.h4()) {
                            return r1Var.Q5.b0;
                        }
                        return 0.0f;
                    }
                    if (r1Var.C4) {
                        dn0 dn0Var = r1Var.E4;
                        return dn0Var.a / dn0Var.g;
                    }
                    f10 = j1Var.b;
                    i7 = j1Var.f;
                    i10 = xm0.E;
                }
                return f10 / (i7 - i10);
            default:
                return ((an0) this.f).getProgress();
        }
    }

    @Override // org.telegram.ui.Components.wz
    public final void l(float f10) {
        switch (this.e) {
            case 0:
                ((u0) this.f).e(true, f10);
                break;
            case 1:
                org.telegram.ui.Cells.r1 r1Var = (org.telegram.ui.Cells.r1) this.f;
                dn0 dn0Var = r1Var.E4;
                org.telegram.ui.Cells.j1 j1Var = r1Var.D4;
                if (r1Var.Q5.I3()) {
                    j1Var.h(f10);
                } else if (fj.R4(r1Var.Q5.k)) {
                    if (r1Var.C4) {
                        dn0Var.g(false, f10);
                    } else {
                        j1Var.h(f10);
                    }
                } else if (r1Var.Q5.h4()) {
                    if (r1Var.C4) {
                        if (dn0Var != null) {
                            dn0Var.g(false, f10);
                        }
                    } else if (j1Var != null) {
                        j1Var.h(f10);
                    }
                    r1Var.Q5.b0 = f10;
                }
                r1Var.e(f10);
                r1Var.invalidate();
                break;
            default:
                an0 an0Var = (an0) this.f;
                an0Var.x = true;
                an0Var.setProgress(f10);
                an0Var.f(true, f10);
                an0Var.x = false;
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t0(an0 an0Var, boolean z10) {
        super(z10);
        this.e = 2;
        this.f = an0Var;
    }
}

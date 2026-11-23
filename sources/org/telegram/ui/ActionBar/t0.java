package org.telegram.ui.ActionBar;

import android.view.ViewGroup;
import org.telegram.messenger.gj;
import org.telegram.messenger.hd;
import org.telegram.ui.Components.an0;
import org.telegram.ui.Components.bn0;
import org.telegram.ui.Components.en0;
import org.telegram.ui.Components.pu0;
import org.telegram.ui.Components.ym0;
import org.telegram.ui.Components.zz;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final class t0 extends zz {
    public final /* synthetic */ int e;
    public final /* synthetic */ ViewGroup f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t0(ViewGroup viewGroup, int i7) {
        super(false);
        this.e = i7;
        this.f = viewGroup;
    }

    @Override // org.telegram.ui.Components.zm0
    public CharSequence d() {
        int i7 = this.e;
        ViewGroup viewGroup = this.f;
        switch (i7) {
            case 0:
                return pu0.a(((u0) viewGroup).getSpeed()) + "x  " + hd.N0(2131754758, null);
            case 1:
            default:
                return super.d();
            case 2:
                an0 an0Var = ((bn0) viewGroup).y;
                if (an0Var != null) {
                    return an0Var.getContentDescription();
                }
                return null;
        }
    }

    @Override // org.telegram.ui.Components.zz
    public float h() {
        switch (this.e) {
            case 0:
                return 0.2f;
            case 1:
            default:
                return super.h();
            case 2:
                int r02 = ((bn0) this.f).y.r0();
                if (r02 > 0) {
                    return 1.0f / r02;
                }
                return 0.05f;
        }
    }

    @Override // org.telegram.ui.Components.zz
    public float i() {
        switch (this.e) {
            case 0:
                return 3.0f;
            default:
                return super.i();
        }
    }

    @Override // org.telegram.ui.Components.zz
    public float j() {
        switch (this.e) {
            case 0:
                return 0.2f;
            default:
                return super.j();
        }
    }

    @Override // org.telegram.ui.Components.zz
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
                    i10 = ym0.E;
                } else {
                    if (!gj.R4(r1Var.Q5.k)) {
                        if (r1Var.Q5.h4()) {
                            return r1Var.Q5.b0;
                        }
                        return 0.0f;
                    }
                    if (r1Var.C4) {
                        en0 en0Var = r1Var.E4;
                        return en0Var.a / en0Var.g;
                    }
                    f10 = j1Var.b;
                    i7 = j1Var.f;
                    i10 = ym0.E;
                }
                return f10 / (i7 - i10);
            default:
                return ((bn0) this.f).getProgress();
        }
    }

    @Override // org.telegram.ui.Components.zz
    public final void l(float f10) {
        switch (this.e) {
            case 0:
                ((u0) this.f).e(true, f10);
                break;
            case 1:
                org.telegram.ui.Cells.r1 r1Var = (org.telegram.ui.Cells.r1) this.f;
                en0 en0Var = r1Var.E4;
                org.telegram.ui.Cells.j1 j1Var = r1Var.D4;
                if (r1Var.Q5.I3()) {
                    j1Var.h(f10);
                } else if (gj.R4(r1Var.Q5.k)) {
                    if (r1Var.C4) {
                        en0Var.g(false, f10);
                    } else {
                        j1Var.h(f10);
                    }
                } else if (r1Var.Q5.h4()) {
                    if (r1Var.C4) {
                        if (en0Var != null) {
                            en0Var.g(false, f10);
                        }
                    } else if (j1Var != null) {
                        j1Var.h(f10);
                    }
                    r1Var.Q5.b0 = f10;
                }
                r1Var.a(f10);
                r1Var.invalidate();
                break;
            default:
                bn0 bn0Var = (bn0) this.f;
                bn0Var.x = true;
                bn0Var.setProgress(f10);
                bn0Var.f(true, f10);
                bn0Var.x = false;
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t0(bn0 bn0Var, boolean z10) {
        super(z10);
        this.e = 2;
        this.f = bn0Var;
    }
}

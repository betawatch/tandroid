package org.telegram.ui.ActionBar;

import android.view.ViewGroup;
import org.telegram.messenger.cd;
import org.telegram.messenger.jj;
import org.telegram.ui.Components.a00;
import org.telegram.ui.Components.kn0;
import org.telegram.ui.Components.mn0;
import org.telegram.ui.Components.nn0;
import org.telegram.ui.Components.qn0;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class w0 extends a00 {
    public final /* synthetic */ int e;
    public final /* synthetic */ ViewGroup f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w0(ViewGroup viewGroup, int i10) {
        super(false);
        this.e = i10;
        this.f = viewGroup;
    }

    @Override // org.telegram.ui.Components.ln0
    public CharSequence d() {
        int i10 = this.e;
        ViewGroup viewGroup = this.f;
        switch (i10) {
            case 0:
                return jh.g.a(((x0) viewGroup).getSpeed()) + "x  " + cd.L0(2131754759, null);
            case 1:
            default:
                return super.d();
            case 2:
                mn0 mn0Var = ((nn0) viewGroup).y;
                if (mn0Var != null) {
                    return mn0Var.getContentDescription();
                }
                return null;
        }
    }

    @Override // org.telegram.ui.Components.a00
    public float h() {
        switch (this.e) {
            case 0:
                return 0.2f;
            case 1:
            default:
                return super.h();
            case 2:
                int p02 = ((nn0) this.f).y.p0();
                if (p02 > 0) {
                    return 1.0f / p02;
                }
                return 0.05f;
        }
    }

    @Override // org.telegram.ui.Components.a00
    public float i() {
        switch (this.e) {
            case 0:
                return 3.0f;
            default:
                return super.i();
        }
    }

    @Override // org.telegram.ui.Components.a00
    public float j() {
        switch (this.e) {
            case 0:
                return 0.2f;
            default:
                return super.j();
        }
    }

    @Override // org.telegram.ui.Components.a00
    public final float k() {
        float f7;
        int i10;
        int i11;
        switch (this.e) {
            case 0:
                return ((x0) this.f).getSpeed();
            case 1:
                org.telegram.ui.Cells.q1 q1Var = (org.telegram.ui.Cells.q1) this.f;
                org.telegram.ui.Cells.i1 i1Var = q1Var.B4;
                if (q1Var.O5.I3()) {
                    f7 = i1Var.b;
                    i10 = i1Var.f;
                    i11 = kn0.E;
                } else {
                    if (!jj.R4(q1Var.O5.k)) {
                        if (q1Var.O5.h4()) {
                            return q1Var.O5.b0;
                        }
                        return 0.0f;
                    }
                    if (q1Var.A4) {
                        qn0 qn0Var = q1Var.C4;
                        return qn0Var.a / qn0Var.g;
                    }
                    f7 = i1Var.b;
                    i10 = i1Var.f;
                    i11 = kn0.E;
                }
                return f7 / (i10 - i11);
            default:
                return ((nn0) this.f).getProgress();
        }
    }

    @Override // org.telegram.ui.Components.a00
    public final void l(float f7) {
        switch (this.e) {
            case 0:
                ((x0) this.f).e(true, f7);
                break;
            case 1:
                org.telegram.ui.Cells.q1 q1Var = (org.telegram.ui.Cells.q1) this.f;
                qn0 qn0Var = q1Var.C4;
                org.telegram.ui.Cells.i1 i1Var = q1Var.B4;
                if (q1Var.O5.I3()) {
                    i1Var.h(f7);
                } else if (jj.R4(q1Var.O5.k)) {
                    if (q1Var.A4) {
                        qn0Var.g(false, f7);
                    } else {
                        i1Var.h(f7);
                    }
                } else if (q1Var.O5.h4()) {
                    if (q1Var.A4) {
                        if (qn0Var != null) {
                            qn0Var.g(false, f7);
                        }
                    } else if (i1Var != null) {
                        i1Var.h(f7);
                    }
                    q1Var.O5.b0 = f7;
                }
                q1Var.c(f7);
                q1Var.invalidate();
                break;
            default:
                nn0 nn0Var = (nn0) this.f;
                nn0Var.x = true;
                nn0Var.setProgress(f7);
                nn0Var.f(true, f7);
                nn0Var.x = false;
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w0(nn0 nn0Var, boolean z10) {
        super(z10);
        this.e = 2;
        this.f = nn0Var;
    }
}

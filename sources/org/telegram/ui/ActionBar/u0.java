package org.telegram.ui.ActionBar;

import android.view.ViewGroup;
import org.telegram.messenger.gj;
import org.telegram.messenger.hd;
import org.telegram.ui.Components.eu0;
import org.telegram.ui.Components.nm0;
import org.telegram.ui.Components.pm0;
import org.telegram.ui.Components.qm0;
import org.telegram.ui.Components.qz;
import org.telegram.ui.Components.tm0;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class u0 extends qz {
    public final /* synthetic */ int e;
    public final /* synthetic */ ViewGroup f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u0(ViewGroup viewGroup, int i7) {
        super(false);
        this.e = i7;
        this.f = viewGroup;
    }

    @Override // org.telegram.ui.Components.om0
    public CharSequence d() {
        int i7 = this.e;
        ViewGroup viewGroup = this.f;
        switch (i7) {
            case 0:
                return eu0.a(((v0) viewGroup).getSpeed()) + "x  " + hd.M0(2131754759, null);
            case 1:
            default:
                return super.d();
            case 2:
                pm0 pm0Var = ((qm0) viewGroup).y;
                if (pm0Var != null) {
                    return pm0Var.getContentDescription();
                }
                return null;
        }
    }

    @Override // org.telegram.ui.Components.qz
    public float h() {
        switch (this.e) {
            case 0:
                return 0.2f;
            case 1:
            default:
                return super.h();
            case 2:
                int p02 = ((qm0) this.f).y.p0();
                if (p02 > 0) {
                    return 1.0f / p02;
                }
                return 0.05f;
        }
    }

    @Override // org.telegram.ui.Components.qz
    public float i() {
        switch (this.e) {
            case 0:
                return 3.0f;
            default:
                return super.i();
        }
    }

    @Override // org.telegram.ui.Components.qz
    public float j() {
        switch (this.e) {
            case 0:
                return 0.2f;
            default:
                return super.j();
        }
    }

    @Override // org.telegram.ui.Components.qz
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
                    i10 = nm0.E;
                } else {
                    if (!gj.R4(q1Var.Q5.k)) {
                        if (q1Var.Q5.h4()) {
                            return q1Var.Q5.b0;
                        }
                        return 0.0f;
                    }
                    if (q1Var.C4) {
                        tm0 tm0Var = q1Var.E4;
                        return tm0Var.a / tm0Var.g;
                    }
                    f10 = i1Var.b;
                    i7 = i1Var.f;
                    i10 = nm0.E;
                }
                return f10 / (i7 - i10);
            default:
                return ((qm0) this.f).getProgress();
        }
    }

    @Override // org.telegram.ui.Components.qz
    public final void l(float f10) {
        switch (this.e) {
            case 0:
                ((v0) this.f).e(true, f10);
                break;
            case 1:
                org.telegram.ui.Cells.q1 q1Var = (org.telegram.ui.Cells.q1) this.f;
                tm0 tm0Var = q1Var.E4;
                org.telegram.ui.Cells.i1 i1Var = q1Var.D4;
                if (q1Var.Q5.I3()) {
                    i1Var.h(f10);
                } else if (gj.R4(q1Var.Q5.k)) {
                    if (q1Var.C4) {
                        tm0Var.g(false, f10);
                    } else {
                        i1Var.h(f10);
                    }
                } else if (q1Var.Q5.h4()) {
                    if (q1Var.C4) {
                        if (tm0Var != null) {
                            tm0Var.g(false, f10);
                        }
                    } else if (i1Var != null) {
                        i1Var.h(f10);
                    }
                    q1Var.Q5.b0 = f10;
                }
                q1Var.e(f10);
                q1Var.invalidate();
                break;
            default:
                qm0 qm0Var = (qm0) this.f;
                qm0Var.x = true;
                qm0Var.setProgress(f10);
                qm0Var.f(true, f10);
                qm0Var.x = false;
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u0(qm0 qm0Var, boolean z10) {
        super(z10);
        this.e = 2;
        this.f = qm0Var;
    }
}

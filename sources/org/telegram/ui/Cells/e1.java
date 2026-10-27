package org.telegram.ui.Cells;

import android.view.ViewGroup;
import org.telegram.ui.Components.d10;
import org.telegram.ui.Components.jp0;
import org.telegram.ui.Components.lp0;
import org.telegram.ui.Components.mp0;
import org.telegram.ui.Components.qp0;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class e1 extends d10 {
    public final /* synthetic */ int e = 0;
    public final /* synthetic */ ViewGroup f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e1(mp0 mp0Var, boolean z10) {
        super(z10);
        this.f = mp0Var;
    }

    @Override // org.telegram.ui.Components.kp0
    public CharSequence d() {
        switch (this.e) {
            case 1:
                lp0 lp0Var = ((mp0) this.f).x;
                if (lp0Var != null) {
                    return lp0Var.getContentDescription();
                }
                return null;
            default:
                return super.d();
        }
    }

    @Override // org.telegram.ui.Components.d10
    public float h() {
        switch (this.e) {
            case 1:
                int k02 = ((mp0) this.f).x.k0();
                if (k02 > 0) {
                    return 1.0f / k02;
                }
                return 0.05f;
            default:
                return super.h();
        }
    }

    @Override // org.telegram.ui.Components.d10
    public final float k() {
        float f7;
        int i10;
        int i11;
        switch (this.e) {
            case 0:
                s1 s1Var = (s1) this.f;
                d1 d1Var = s1Var.G5;
                if (s1Var.y7.isMusic()) {
                    f7 = d1Var.b;
                    i10 = d1Var.f;
                    i11 = jp0.E;
                } else {
                    if (!s1Var.y7.isVoice()) {
                        if (s1Var.y7.isRoundVideo()) {
                            return s1Var.y7.audioProgress;
                        }
                        return 0.0f;
                    }
                    if (s1Var.F5) {
                        qp0 qp0Var = s1Var.H5;
                        return qp0Var.a / qp0Var.g;
                    }
                    f7 = d1Var.b;
                    i10 = d1Var.f;
                    i11 = jp0.E;
                }
                return f7 / (i10 - i11);
            default:
                return ((mp0) this.f).getProgress();
        }
    }

    @Override // org.telegram.ui.Components.d10
    public final void l(float f7) {
        switch (this.e) {
            case 0:
                s1 s1Var = (s1) this.f;
                qp0 qp0Var = s1Var.H5;
                d1 d1Var = s1Var.G5;
                if (s1Var.y7.isMusic()) {
                    d1Var.i(f7);
                } else if (s1Var.y7.isVoice()) {
                    if (s1Var.F5) {
                        qp0Var.g(f7, false);
                    } else {
                        d1Var.i(f7);
                    }
                } else if (s1Var.y7.isRoundVideo()) {
                    if (s1Var.F5) {
                        if (qp0Var != null) {
                            qp0Var.g(f7, false);
                        }
                    } else if (d1Var != null) {
                        d1Var.i(f7);
                    }
                    s1Var.y7.audioProgress = f7;
                }
                s1Var.c(f7);
                s1Var.invalidate();
                break;
            default:
                mp0 mp0Var = (mp0) this.f;
                mp0Var.w = true;
                mp0Var.setProgress(f7);
                mp0Var.f(f7, true);
                mp0Var.w = false;
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e1(s1 s1Var) {
        super(false);
        this.f = s1Var;
    }
}

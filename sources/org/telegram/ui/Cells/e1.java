package org.telegram.ui.Cells;

import android.view.ViewGroup;
import org.telegram.ui.Components.ao0;
import org.telegram.ui.Components.co0;
import org.telegram.ui.Components.q00;
import org.telegram.ui.Components.wn0;
import org.telegram.ui.Components.zn0;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class e1 extends q00 {
    public final /* synthetic */ int e = 0;
    public final /* synthetic */ ViewGroup f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e1(ao0 ao0Var, boolean z10) {
        super(z10);
        this.f = ao0Var;
    }

    @Override // org.telegram.ui.Components.xn0
    public CharSequence d() {
        switch (this.e) {
            case 1:
                zn0 zn0Var = ((ao0) this.f).w;
                if (zn0Var != null) {
                    return zn0Var.getContentDescription();
                }
                return null;
            default:
                return super.d();
        }
    }

    @Override // org.telegram.ui.Components.q00
    public float h() {
        switch (this.e) {
            case 1:
                int k02 = ((ao0) this.f).w.k0();
                if (k02 > 0) {
                    return 1.0f / k02;
                }
                return 0.05f;
            default:
                return super.h();
        }
    }

    @Override // org.telegram.ui.Components.q00
    public final float k() {
        float f9;
        int i10;
        int i11;
        switch (this.e) {
            case 0:
                s1 s1Var = (s1) this.f;
                d1 d1Var = s1Var.C5;
                if (s1Var.u7.isMusic()) {
                    f9 = d1Var.b;
                    i10 = d1Var.f;
                    i11 = wn0.E;
                } else {
                    if (!s1Var.u7.isVoice()) {
                        if (s1Var.u7.isRoundVideo()) {
                            return s1Var.u7.audioProgress;
                        }
                        return 0.0f;
                    }
                    if (s1Var.B5) {
                        co0 co0Var = s1Var.D5;
                        return co0Var.a / co0Var.g;
                    }
                    f9 = d1Var.b;
                    i10 = d1Var.f;
                    i11 = wn0.E;
                }
                return f9 / (i10 - i11);
            default:
                return ((ao0) this.f).getProgress();
        }
    }

    @Override // org.telegram.ui.Components.q00
    public final void l(float f9) {
        switch (this.e) {
            case 0:
                s1 s1Var = (s1) this.f;
                co0 co0Var = s1Var.D5;
                d1 d1Var = s1Var.C5;
                if (s1Var.u7.isMusic()) {
                    d1Var.i(f9);
                } else if (s1Var.u7.isVoice()) {
                    if (s1Var.B5) {
                        co0Var.g(f9, false);
                    } else {
                        d1Var.i(f9);
                    }
                } else if (s1Var.u7.isRoundVideo()) {
                    if (s1Var.B5) {
                        if (co0Var != null) {
                            co0Var.g(f9, false);
                        }
                    } else if (d1Var != null) {
                        d1Var.i(f9);
                    }
                    s1Var.u7.audioProgress = f9;
                }
                s1Var.c(f9);
                s1Var.invalidate();
                break;
            default:
                ao0 ao0Var = (ao0) this.f;
                ao0Var.v = true;
                ao0Var.setProgress(f9);
                ao0Var.f(f9, true);
                ao0Var.v = false;
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e1(s1 s1Var) {
        super(false);
        this.f = s1Var;
    }
}

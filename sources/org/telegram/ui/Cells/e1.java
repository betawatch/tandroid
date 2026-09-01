package org.telegram.ui.Cells;

import android.view.ViewGroup;
import org.telegram.ui.Components.ho0;
import org.telegram.ui.Components.ko0;
import org.telegram.ui.Components.lo0;
import org.telegram.ui.Components.no0;
import org.telegram.ui.Components.v00;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class e1 extends v00 {
    public final /* synthetic */ int e = 0;
    public final /* synthetic */ ViewGroup f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e1(lo0 lo0Var, boolean z4) {
        super(z4);
        this.f = lo0Var;
    }

    @Override // org.telegram.ui.Components.io0
    public CharSequence d() {
        switch (this.e) {
            case 1:
                ko0 ko0Var = ((lo0) this.f).w;
                if (ko0Var != null) {
                    return ko0Var.getContentDescription();
                }
                return null;
            default:
                return super.d();
        }
    }

    @Override // org.telegram.ui.Components.v00
    public float h() {
        switch (this.e) {
            case 1:
                int m0 = ((lo0) this.f).w.m0();
                if (m0 > 0) {
                    return 1.0f / m0;
                }
                return 0.05f;
            default:
                return super.h();
        }
    }

    @Override // org.telegram.ui.Components.v00
    public final float k() {
        float f10;
        int i10;
        int i11;
        switch (this.e) {
            case 0:
                t1 t1Var = (t1) this.f;
                d1 d1Var = t1Var.D5;
                if (t1Var.v7.isMusic()) {
                    f10 = d1Var.b;
                    i10 = d1Var.f;
                    i11 = ho0.E;
                } else {
                    if (!t1Var.v7.isVoice()) {
                        if (t1Var.v7.isRoundVideo()) {
                            return t1Var.v7.audioProgress;
                        }
                        return 0.0f;
                    }
                    if (t1Var.C5) {
                        no0 no0Var = t1Var.E5;
                        return no0Var.a / no0Var.g;
                    }
                    f10 = d1Var.b;
                    i10 = d1Var.f;
                    i11 = ho0.E;
                }
                return f10 / (i10 - i11);
            default:
                return ((lo0) this.f).getProgress();
        }
    }

    @Override // org.telegram.ui.Components.v00
    public final void l(float f10) {
        switch (this.e) {
            case 0:
                t1 t1Var = (t1) this.f;
                no0 no0Var = t1Var.E5;
                d1 d1Var = t1Var.D5;
                if (t1Var.v7.isMusic()) {
                    d1Var.i(f10);
                } else if (t1Var.v7.isVoice()) {
                    if (t1Var.C5) {
                        no0Var.g(f10, false);
                    } else {
                        d1Var.i(f10);
                    }
                } else if (t1Var.v7.isRoundVideo()) {
                    if (t1Var.C5) {
                        if (no0Var != null) {
                            no0Var.g(f10, false);
                        }
                    } else if (d1Var != null) {
                        d1Var.i(f10);
                    }
                    t1Var.v7.audioProgress = f10;
                }
                t1Var.b(f10);
                t1Var.invalidate();
                break;
            default:
                lo0 lo0Var = (lo0) this.f;
                lo0Var.v = true;
                lo0Var.setProgress(f10);
                lo0Var.f(f10, true);
                lo0Var.v = false;
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e1(t1 t1Var) {
        super(false);
        this.f = t1Var;
    }
}

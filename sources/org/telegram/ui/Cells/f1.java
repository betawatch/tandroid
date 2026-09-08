package org.telegram.ui.Cells;

import android.view.ViewGroup;
import org.telegram.ui.Components.bo0;
import org.telegram.ui.Components.eo0;
import org.telegram.ui.Components.fo0;
import org.telegram.ui.Components.io0;
import org.telegram.ui.Components.u00;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class f1 extends u00 {
    public final /* synthetic */ int e = 0;
    public final /* synthetic */ ViewGroup f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f1(fo0 fo0Var, boolean z10) {
        super(z10);
        this.f = fo0Var;
    }

    @Override // org.telegram.ui.Components.co0
    public CharSequence d() {
        switch (this.e) {
            case 1:
                eo0 eo0Var = ((fo0) this.f).w;
                if (eo0Var != null) {
                    return eo0Var.getContentDescription();
                }
                return null;
            default:
                return super.d();
        }
    }

    @Override // org.telegram.ui.Components.u00
    public float h() {
        switch (this.e) {
            case 1:
                int l02 = ((fo0) this.f).w.l0();
                if (l02 > 0) {
                    return 1.0f / l02;
                }
                return 0.05f;
            default:
                return super.h();
        }
    }

    @Override // org.telegram.ui.Components.u00
    public final float k() {
        float f7;
        int i10;
        int i11;
        switch (this.e) {
            case 0:
                t1 t1Var = (t1) this.f;
                e1 e1Var = t1Var.G5;
                if (t1Var.y7.isMusic()) {
                    f7 = e1Var.b;
                    i10 = e1Var.f;
                    i11 = bo0.E;
                } else {
                    if (!t1Var.y7.isVoice()) {
                        if (t1Var.y7.isRoundVideo()) {
                            return t1Var.y7.audioProgress;
                        }
                        return 0.0f;
                    }
                    if (t1Var.F5) {
                        io0 io0Var = t1Var.H5;
                        return io0Var.a / io0Var.g;
                    }
                    f7 = e1Var.b;
                    i10 = e1Var.f;
                    i11 = bo0.E;
                }
                return f7 / (i10 - i11);
            default:
                return ((fo0) this.f).getProgress();
        }
    }

    @Override // org.telegram.ui.Components.u00
    public final void l(float f7) {
        switch (this.e) {
            case 0:
                t1 t1Var = (t1) this.f;
                io0 io0Var = t1Var.H5;
                e1 e1Var = t1Var.G5;
                if (t1Var.y7.isMusic()) {
                    e1Var.i(f7);
                } else if (t1Var.y7.isVoice()) {
                    if (t1Var.F5) {
                        io0Var.g(f7, false);
                    } else {
                        e1Var.i(f7);
                    }
                } else if (t1Var.y7.isRoundVideo()) {
                    if (t1Var.F5) {
                        if (io0Var != null) {
                            io0Var.g(f7, false);
                        }
                    } else if (e1Var != null) {
                        e1Var.i(f7);
                    }
                    t1Var.y7.audioProgress = f7;
                }
                t1Var.b(f7);
                t1Var.invalidate();
                break;
            default:
                fo0 fo0Var = (fo0) this.f;
                fo0Var.v = true;
                fo0Var.setProgress(f7);
                fo0Var.f(f7, true);
                fo0Var.v = false;
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f1(t1 t1Var) {
        super(false);
        this.f = t1Var;
    }
}

package org.telegram.ui.Cells;

import android.view.ViewGroup;
import org.telegram.ui.Components.qo0;
import org.telegram.ui.Components.to0;
import org.telegram.ui.Components.u00;
import org.telegram.ui.Components.uo0;
import org.telegram.ui.Components.xo0;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final class g1 extends u00 {
    public final /* synthetic */ int e = 0;
    public final /* synthetic */ ViewGroup f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g1(uo0 uo0Var, boolean z10) {
        super(z10);
        this.f = uo0Var;
    }

    @Override // org.telegram.ui.Components.ro0
    public CharSequence d() {
        switch (this.e) {
            case 1:
                to0 to0Var = ((uo0) this.f).w;
                if (to0Var != null) {
                    return to0Var.getContentDescription();
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
                int l02 = ((uo0) this.f).w.l0();
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
                u1 u1Var = (u1) this.f;
                f1 f1Var = u1Var.G5;
                if (u1Var.y7.isMusic()) {
                    f7 = f1Var.b;
                    i10 = f1Var.f;
                    i11 = qo0.E;
                } else {
                    if (!u1Var.y7.isVoice()) {
                        if (u1Var.y7.isRoundVideo()) {
                            return u1Var.y7.audioProgress;
                        }
                        return 0.0f;
                    }
                    if (u1Var.F5) {
                        xo0 xo0Var = u1Var.H5;
                        return xo0Var.a / xo0Var.g;
                    }
                    f7 = f1Var.b;
                    i10 = f1Var.f;
                    i11 = qo0.E;
                }
                return f7 / (i10 - i11);
            default:
                return ((uo0) this.f).getProgress();
        }
    }

    @Override // org.telegram.ui.Components.u00
    public final void l(float f7) {
        switch (this.e) {
            case 0:
                u1 u1Var = (u1) this.f;
                xo0 xo0Var = u1Var.H5;
                f1 f1Var = u1Var.G5;
                if (u1Var.y7.isMusic()) {
                    f1Var.i(f7);
                } else if (u1Var.y7.isVoice()) {
                    if (u1Var.F5) {
                        xo0Var.g(f7, false);
                    } else {
                        f1Var.i(f7);
                    }
                } else if (u1Var.y7.isRoundVideo()) {
                    if (u1Var.F5) {
                        if (xo0Var != null) {
                            xo0Var.g(f7, false);
                        }
                    } else if (f1Var != null) {
                        f1Var.i(f7);
                    }
                    u1Var.y7.audioProgress = f7;
                }
                u1Var.b(f7);
                u1Var.invalidate();
                break;
            default:
                uo0 uo0Var = (uo0) this.f;
                uo0Var.v = true;
                uo0Var.setProgress(f7);
                uo0Var.f(f7, true);
                uo0Var.v = false;
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g1(u1 u1Var) {
        super(false);
        this.f = u1Var;
    }
}

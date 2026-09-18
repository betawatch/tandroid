package org.telegram.ui.Cells;

import android.view.ViewGroup;
import org.telegram.ui.Components.oo0;
import org.telegram.ui.Components.so0;
import org.telegram.ui.Components.to0;
import org.telegram.ui.Components.u00;
import org.telegram.ui.Components.wo0;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
/* loaded from: classes3.dex */
public final class g1 extends u00 {
    public final /* synthetic */ int e = 0;
    public final /* synthetic */ ViewGroup f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g1(to0 to0Var, boolean z10) {
        super(z10);
        this.f = to0Var;
    }

    @Override // org.telegram.ui.Components.qo0
    public CharSequence d() {
        switch (this.e) {
            case 1:
                so0 so0Var = ((to0) this.f).w;
                if (so0Var != null) {
                    return so0Var.getContentDescription();
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
                int m0 = ((to0) this.f).w.m0();
                if (m0 > 0) {
                    return 1.0f / m0;
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
                    i11 = oo0.E;
                } else {
                    if (!u1Var.y7.isVoice()) {
                        if (u1Var.y7.isRoundVideo()) {
                            return u1Var.y7.audioProgress;
                        }
                        return 0.0f;
                    }
                    if (u1Var.F5) {
                        wo0 wo0Var = u1Var.H5;
                        return wo0Var.a / wo0Var.g;
                    }
                    f7 = f1Var.b;
                    i10 = f1Var.f;
                    i11 = oo0.E;
                }
                return f7 / (i10 - i11);
            default:
                return ((to0) this.f).getProgress();
        }
    }

    @Override // org.telegram.ui.Components.u00
    public final void l(float f7) {
        switch (this.e) {
            case 0:
                u1 u1Var = (u1) this.f;
                wo0 wo0Var = u1Var.H5;
                f1 f1Var = u1Var.G5;
                if (u1Var.y7.isMusic()) {
                    f1Var.i(f7);
                } else if (u1Var.y7.isVoice()) {
                    if (u1Var.F5) {
                        wo0Var.g(f7, false);
                    } else {
                        f1Var.i(f7);
                    }
                } else if (u1Var.y7.isRoundVideo()) {
                    if (u1Var.F5) {
                        if (wo0Var != null) {
                            wo0Var.g(f7, false);
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
                to0 to0Var = (to0) this.f;
                to0Var.v = true;
                to0Var.setProgress(f7);
                to0Var.f(f7, true);
                to0Var.v = false;
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g1(u1 u1Var) {
        super(false);
        this.f = u1Var;
    }
}

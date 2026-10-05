package org.telegram.ui.Cells;

import android.view.ViewGroup;
import org.telegram.ui.Components.cp0;
import org.telegram.ui.Components.uo0;
import org.telegram.ui.Components.x00;
import org.telegram.ui.Components.yo0;
import org.telegram.ui.Components.zo0;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final class g1 extends x00 {
    public final /* synthetic */ int e = 0;
    public final /* synthetic */ ViewGroup f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g1(zo0 zo0Var, boolean z10) {
        super(z10);
        this.f = zo0Var;
    }

    @Override // org.telegram.ui.Components.wo0
    public CharSequence d() {
        switch (this.e) {
            case 1:
                yo0 yo0Var = ((zo0) this.f).w;
                if (yo0Var != null) {
                    return yo0Var.getContentDescription();
                }
                return null;
            default:
                return super.d();
        }
    }

    @Override // org.telegram.ui.Components.x00
    public float h() {
        switch (this.e) {
            case 1:
                int p02 = ((zo0) this.f).w.p0();
                if (p02 > 0) {
                    return 1.0f / p02;
                }
                return 0.05f;
            default:
                return super.h();
        }
    }

    @Override // org.telegram.ui.Components.x00
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
                    i11 = uo0.E;
                } else {
                    if (!u1Var.y7.isVoice()) {
                        if (u1Var.y7.isRoundVideo()) {
                            return u1Var.y7.audioProgress;
                        }
                        return 0.0f;
                    }
                    if (u1Var.F5) {
                        cp0 cp0Var = u1Var.H5;
                        return cp0Var.a / cp0Var.g;
                    }
                    f7 = f1Var.b;
                    i10 = f1Var.f;
                    i11 = uo0.E;
                }
                return f7 / (i10 - i11);
            default:
                return ((zo0) this.f).getProgress();
        }
    }

    @Override // org.telegram.ui.Components.x00
    public final void l(float f7) {
        switch (this.e) {
            case 0:
                u1 u1Var = (u1) this.f;
                cp0 cp0Var = u1Var.H5;
                f1 f1Var = u1Var.G5;
                if (u1Var.y7.isMusic()) {
                    f1Var.i(f7);
                } else if (u1Var.y7.isVoice()) {
                    if (u1Var.F5) {
                        cp0Var.g(f7, false);
                    } else {
                        f1Var.i(f7);
                    }
                } else if (u1Var.y7.isRoundVideo()) {
                    if (u1Var.F5) {
                        if (cp0Var != null) {
                            cp0Var.g(f7, false);
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
                zo0 zo0Var = (zo0) this.f;
                zo0Var.v = true;
                zo0Var.setProgress(f7);
                zo0Var.f(f7, true);
                zo0Var.v = false;
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g1(u1 u1Var) {
        super(false);
        this.f = u1Var;
    }
}

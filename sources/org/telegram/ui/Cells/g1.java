package org.telegram.ui.Cells;

import android.view.ViewGroup;
import org.telegram.ui.Components.gp0;
import org.telegram.ui.Components.jp0;
import org.telegram.ui.Components.k10;
import org.telegram.ui.Components.kp0;
import org.telegram.ui.Components.np0;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class g1 extends k10 {
    public final /* synthetic */ int e = 0;
    public final /* synthetic */ ViewGroup f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g1(kp0 kp0Var, boolean z10) {
        super(z10);
        this.f = kp0Var;
    }

    @Override // org.telegram.ui.Components.hp0
    public CharSequence d() {
        switch (this.e) {
            case 1:
                jp0 jp0Var = ((kp0) this.f).w;
                if (jp0Var != null) {
                    return jp0Var.getContentDescription();
                }
                return null;
            default:
                return super.d();
        }
    }

    @Override // org.telegram.ui.Components.k10
    public float h() {
        switch (this.e) {
            case 1:
                int i02 = ((kp0) this.f).w.i0();
                if (i02 > 0) {
                    return 1.0f / i02;
                }
                return 0.05f;
            default:
                return super.h();
        }
    }

    @Override // org.telegram.ui.Components.k10
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
                    i11 = gp0.E;
                } else {
                    if (!u1Var.y7.isVoice()) {
                        if (u1Var.y7.isRoundVideo()) {
                            return u1Var.y7.audioProgress;
                        }
                        return 0.0f;
                    }
                    if (u1Var.F5) {
                        np0 np0Var = u1Var.H5;
                        return np0Var.a / np0Var.g;
                    }
                    f7 = f1Var.b;
                    i10 = f1Var.f;
                    i11 = gp0.E;
                }
                return f7 / (i10 - i11);
            default:
                return ((kp0) this.f).getProgress();
        }
    }

    @Override // org.telegram.ui.Components.k10
    public final void l(float f7) {
        switch (this.e) {
            case 0:
                u1 u1Var = (u1) this.f;
                np0 np0Var = u1Var.H5;
                f1 f1Var = u1Var.G5;
                if (u1Var.y7.isMusic()) {
                    f1Var.i(f7);
                } else if (u1Var.y7.isVoice()) {
                    if (u1Var.F5) {
                        np0Var.g(f7, false);
                    } else {
                        f1Var.i(f7);
                    }
                } else if (u1Var.y7.isRoundVideo()) {
                    if (u1Var.F5) {
                        if (np0Var != null) {
                            np0Var.g(f7, false);
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
                kp0 kp0Var = (kp0) this.f;
                kp0Var.v = true;
                kp0Var.setProgress(f7);
                kp0Var.f(f7, true);
                kp0Var.v = false;
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g1(u1 u1Var) {
        super(false);
        this.f = u1Var;
    }
}

package org.telegram.ui.Cells;

import android.view.ViewGroup;
import org.telegram.ui.Components.oo0;
import org.telegram.ui.Components.ro0;
import org.telegram.ui.Components.so0;
import org.telegram.ui.Components.v00;
import org.telegram.ui.Components.vo0;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final class g1 extends v00 {
    public final /* synthetic */ int e = 0;
    public final /* synthetic */ ViewGroup f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g1(so0 so0Var, boolean z10) {
        super(z10);
        this.f = so0Var;
    }

    @Override // org.telegram.ui.Components.po0
    public CharSequence d() {
        switch (this.e) {
            case 1:
                ro0 ro0Var = ((so0) this.f).w;
                if (ro0Var != null) {
                    return ro0Var.getContentDescription();
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
                int m0 = ((so0) this.f).w.m0();
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
                        vo0 vo0Var = u1Var.H5;
                        return vo0Var.a / vo0Var.g;
                    }
                    f7 = f1Var.b;
                    i10 = f1Var.f;
                    i11 = oo0.E;
                }
                return f7 / (i10 - i11);
            default:
                return ((so0) this.f).getProgress();
        }
    }

    @Override // org.telegram.ui.Components.v00
    public final void l(float f7) {
        switch (this.e) {
            case 0:
                u1 u1Var = (u1) this.f;
                vo0 vo0Var = u1Var.H5;
                f1 f1Var = u1Var.G5;
                if (u1Var.y7.isMusic()) {
                    f1Var.i(f7);
                } else if (u1Var.y7.isVoice()) {
                    if (u1Var.F5) {
                        vo0Var.g(f7, false);
                    } else {
                        f1Var.i(f7);
                    }
                } else if (u1Var.y7.isRoundVideo()) {
                    if (u1Var.F5) {
                        if (vo0Var != null) {
                            vo0Var.g(f7, false);
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
                so0 so0Var = (so0) this.f;
                so0Var.v = true;
                so0Var.setProgress(f7);
                so0Var.f(f7, true);
                so0Var.v = false;
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g1(u1 u1Var) {
        super(false);
        this.f = u1Var;
    }
}

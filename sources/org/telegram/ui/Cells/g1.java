package org.telegram.ui.Cells;

import android.view.ViewGroup;
import org.telegram.ui.Components.bp0;
import org.telegram.ui.Components.to0;
import org.telegram.ui.Components.x00;
import org.telegram.ui.Components.xo0;
import org.telegram.ui.Components.yo0;

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
/* loaded from: classes3.dex */
public final class g1 extends x00 {
    public final /* synthetic */ int e = 0;
    public final /* synthetic */ ViewGroup f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g1(yo0 yo0Var, boolean z10) {
        super(z10);
        this.f = yo0Var;
    }

    @Override // org.telegram.ui.Components.vo0
    public CharSequence d() {
        switch (this.e) {
            case 1:
                xo0 xo0Var = ((yo0) this.f).w;
                if (xo0Var != null) {
                    return xo0Var.getContentDescription();
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
                int p02 = ((yo0) this.f).w.p0();
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
                    i11 = to0.E;
                } else {
                    if (!u1Var.y7.isVoice()) {
                        if (u1Var.y7.isRoundVideo()) {
                            return u1Var.y7.audioProgress;
                        }
                        return 0.0f;
                    }
                    if (u1Var.F5) {
                        bp0 bp0Var = u1Var.H5;
                        return bp0Var.a / bp0Var.g;
                    }
                    f7 = f1Var.b;
                    i10 = f1Var.f;
                    i11 = to0.E;
                }
                return f7 / (i10 - i11);
            default:
                return ((yo0) this.f).getProgress();
        }
    }

    @Override // org.telegram.ui.Components.x00
    public final void l(float f7) {
        switch (this.e) {
            case 0:
                u1 u1Var = (u1) this.f;
                bp0 bp0Var = u1Var.H5;
                f1 f1Var = u1Var.G5;
                if (u1Var.y7.isMusic()) {
                    f1Var.i(f7);
                } else if (u1Var.y7.isVoice()) {
                    if (u1Var.F5) {
                        bp0Var.g(f7, false);
                    } else {
                        f1Var.i(f7);
                    }
                } else if (u1Var.y7.isRoundVideo()) {
                    if (u1Var.F5) {
                        if (bp0Var != null) {
                            bp0Var.g(f7, false);
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
                yo0 yo0Var = (yo0) this.f;
                yo0Var.v = true;
                yo0Var.setProgress(f7);
                yo0Var.f(f7, true);
                yo0Var.v = false;
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g1(u1 u1Var) {
        super(false);
        this.f = u1Var;
    }
}

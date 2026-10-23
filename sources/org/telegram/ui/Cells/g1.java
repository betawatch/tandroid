package org.telegram.ui.Cells;

import android.view.ViewGroup;
import org.telegram.ui.Components.c10;
import org.telegram.ui.Components.cp0;
import org.telegram.ui.Components.dp0;
import org.telegram.ui.Components.gp0;
import org.telegram.ui.Components.zo0;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
/* loaded from: classes3.dex */
public final class g1 extends c10 {
    public final /* synthetic */ int e = 0;
    public final /* synthetic */ ViewGroup f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g1(dp0 dp0Var, boolean z10) {
        super(z10);
        this.f = dp0Var;
    }

    @Override // org.telegram.ui.Components.ap0
    public CharSequence d() {
        switch (this.e) {
            case 1:
                cp0 cp0Var = ((dp0) this.f).w;
                if (cp0Var != null) {
                    return cp0Var.getContentDescription();
                }
                return null;
            default:
                return super.d();
        }
    }

    @Override // org.telegram.ui.Components.c10
    public float h() {
        switch (this.e) {
            case 1:
                int Y = ((dp0) this.f).w.Y();
                if (Y > 0) {
                    return 1.0f / Y;
                }
                return 0.05f;
            default:
                return super.h();
        }
    }

    @Override // org.telegram.ui.Components.c10
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
                    i11 = zo0.E;
                } else {
                    if (!u1Var.y7.isVoice()) {
                        if (u1Var.y7.isRoundVideo()) {
                            return u1Var.y7.audioProgress;
                        }
                        return 0.0f;
                    }
                    if (u1Var.F5) {
                        gp0 gp0Var = u1Var.H5;
                        return gp0Var.a / gp0Var.g;
                    }
                    f7 = f1Var.b;
                    i10 = f1Var.f;
                    i11 = zo0.E;
                }
                return f7 / (i10 - i11);
            default:
                return ((dp0) this.f).getProgress();
        }
    }

    @Override // org.telegram.ui.Components.c10
    public final void l(float f7) {
        switch (this.e) {
            case 0:
                u1 u1Var = (u1) this.f;
                gp0 gp0Var = u1Var.H5;
                f1 f1Var = u1Var.G5;
                if (u1Var.y7.isMusic()) {
                    f1Var.i(f7);
                } else if (u1Var.y7.isVoice()) {
                    if (u1Var.F5) {
                        gp0Var.g(f7, false);
                    } else {
                        f1Var.i(f7);
                    }
                } else if (u1Var.y7.isRoundVideo()) {
                    if (u1Var.F5) {
                        if (gp0Var != null) {
                            gp0Var.g(f7, false);
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
                dp0 dp0Var = (dp0) this.f;
                dp0Var.v = true;
                dp0Var.setProgress(f7);
                dp0Var.f(f7, true);
                dp0Var.v = false;
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g1(u1 u1Var) {
        super(false);
        this.f = u1Var;
    }
}

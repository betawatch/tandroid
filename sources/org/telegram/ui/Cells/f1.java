package org.telegram.ui.Cells;

import android.view.ViewGroup;
import org.telegram.ui.Components.c10;
import org.telegram.ui.Components.dp0;
import org.telegram.ui.Components.gp0;
import org.telegram.ui.Components.hp0;
import org.telegram.ui.Components.kp0;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final class f1 extends c10 {
    public final /* synthetic */ int e = 0;
    public final /* synthetic */ ViewGroup f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f1(hp0 hp0Var, boolean z10) {
        super(z10);
        this.f = hp0Var;
    }

    @Override // org.telegram.ui.Components.ep0
    public CharSequence d() {
        switch (this.e) {
            case 1:
                gp0 gp0Var = ((hp0) this.f).x;
                if (gp0Var != null) {
                    return gp0Var.getContentDescription();
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
                int Y = ((hp0) this.f).x.Y();
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
                t1 t1Var = (t1) this.f;
                e1 e1Var = t1Var.G5;
                if (t1Var.y7.isMusic()) {
                    f7 = e1Var.b;
                    i10 = e1Var.f;
                    i11 = dp0.E;
                } else {
                    if (!t1Var.y7.isVoice()) {
                        if (t1Var.y7.isRoundVideo()) {
                            return t1Var.y7.audioProgress;
                        }
                        return 0.0f;
                    }
                    if (t1Var.F5) {
                        kp0 kp0Var = t1Var.H5;
                        return kp0Var.a / kp0Var.g;
                    }
                    f7 = e1Var.b;
                    i10 = e1Var.f;
                    i11 = dp0.E;
                }
                return f7 / (i10 - i11);
            default:
                return ((hp0) this.f).getProgress();
        }
    }

    @Override // org.telegram.ui.Components.c10
    public final void l(float f7) {
        switch (this.e) {
            case 0:
                t1 t1Var = (t1) this.f;
                kp0 kp0Var = t1Var.H5;
                e1 e1Var = t1Var.G5;
                if (t1Var.y7.isMusic()) {
                    e1Var.i(f7);
                } else if (t1Var.y7.isVoice()) {
                    if (t1Var.F5) {
                        kp0Var.g(f7, false);
                    } else {
                        e1Var.i(f7);
                    }
                } else if (t1Var.y7.isRoundVideo()) {
                    if (t1Var.F5) {
                        if (kp0Var != null) {
                            kp0Var.g(f7, false);
                        }
                    } else if (e1Var != null) {
                        e1Var.i(f7);
                    }
                    t1Var.y7.audioProgress = f7;
                }
                t1Var.a(f7);
                t1Var.invalidate();
                break;
            default:
                hp0 hp0Var = (hp0) this.f;
                hp0Var.w = true;
                hp0Var.setProgress(f7);
                hp0Var.f(f7, true);
                hp0Var.w = false;
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f1(t1 t1Var) {
        super(false);
        this.f = t1Var;
    }
}

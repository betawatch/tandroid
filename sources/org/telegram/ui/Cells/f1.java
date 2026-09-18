package org.telegram.ui.Cells;

import android.view.ViewGroup;
import org.telegram.ui.Components.co0;
import org.telegram.ui.Components.fo0;
import org.telegram.ui.Components.go0;
import org.telegram.ui.Components.jo0;
import org.telegram.ui.Components.u00;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class f1 extends u00 {
    public final /* synthetic */ int e = 0;
    public final /* synthetic */ ViewGroup f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f1(go0 go0Var, boolean z10) {
        super(z10);
        this.f = go0Var;
    }

    @Override // org.telegram.ui.Components.do0
    public CharSequence d() {
        switch (this.e) {
            case 1:
                fo0 fo0Var = ((go0) this.f).w;
                if (fo0Var != null) {
                    return fo0Var.getContentDescription();
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
                int m0 = ((go0) this.f).w.m0();
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
                t1 t1Var = (t1) this.f;
                e1 e1Var = t1Var.G5;
                if (t1Var.y7.isMusic()) {
                    f7 = e1Var.b;
                    i10 = e1Var.f;
                    i11 = co0.E;
                } else {
                    if (!t1Var.y7.isVoice()) {
                        if (t1Var.y7.isRoundVideo()) {
                            return t1Var.y7.audioProgress;
                        }
                        return 0.0f;
                    }
                    if (t1Var.F5) {
                        jo0 jo0Var = t1Var.H5;
                        return jo0Var.a / jo0Var.g;
                    }
                    f7 = e1Var.b;
                    i10 = e1Var.f;
                    i11 = co0.E;
                }
                return f7 / (i10 - i11);
            default:
                return ((go0) this.f).getProgress();
        }
    }

    @Override // org.telegram.ui.Components.u00
    public final void l(float f7) {
        switch (this.e) {
            case 0:
                t1 t1Var = (t1) this.f;
                jo0 jo0Var = t1Var.H5;
                e1 e1Var = t1Var.G5;
                if (t1Var.y7.isMusic()) {
                    e1Var.i(f7);
                } else if (t1Var.y7.isVoice()) {
                    if (t1Var.F5) {
                        jo0Var.g(f7, false);
                    } else {
                        e1Var.i(f7);
                    }
                } else if (t1Var.y7.isRoundVideo()) {
                    if (t1Var.F5) {
                        if (jo0Var != null) {
                            jo0Var.g(f7, false);
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
                go0 go0Var = (go0) this.f;
                go0Var.v = true;
                go0Var.setProgress(f7);
                go0Var.f(f7, true);
                go0Var.v = false;
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f1(t1 t1Var) {
        super(false);
        this.f = t1Var;
    }
}

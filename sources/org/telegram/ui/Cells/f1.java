package org.telegram.ui.Cells;

import android.view.ViewGroup;
import org.telegram.ui.Components.f00;
import org.telegram.ui.Components.ln0;
import org.telegram.ui.Components.on0;
import org.telegram.ui.Components.pn0;
import org.telegram.ui.Components.rn0;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class f1 extends f00 {
    public final /* synthetic */ int e = 0;
    public final /* synthetic */ ViewGroup f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f1(pn0 pn0Var, boolean z10) {
        super(z10);
        this.f = pn0Var;
    }

    @Override // org.telegram.ui.Components.mn0
    public CharSequence d() {
        switch (this.e) {
            case 1:
                on0 on0Var = ((pn0) this.f).w;
                if (on0Var != null) {
                    return on0Var.getContentDescription();
                }
                return null;
            default:
                return super.d();
        }
    }

    @Override // org.telegram.ui.Components.f00
    public float h() {
        switch (this.e) {
            case 1:
                int c02 = ((pn0) this.f).w.c0();
                if (c02 > 0) {
                    return 1.0f / c02;
                }
                return 0.05f;
            default:
                return super.h();
        }
    }

    @Override // org.telegram.ui.Components.f00
    public final float k() {
        float f10;
        int i9;
        int i10;
        switch (this.e) {
            case 0:
                t1 t1Var = (t1) this.f;
                e1 e1Var = t1Var.C5;
                if (t1Var.u7.isMusic()) {
                    f10 = e1Var.b;
                    i9 = e1Var.f;
                    i10 = ln0.E;
                } else {
                    if (!t1Var.u7.isVoice()) {
                        if (t1Var.u7.isRoundVideo()) {
                            return t1Var.u7.audioProgress;
                        }
                        return 0.0f;
                    }
                    if (t1Var.B5) {
                        rn0 rn0Var = t1Var.D5;
                        return rn0Var.a / rn0Var.g;
                    }
                    f10 = e1Var.b;
                    i9 = e1Var.f;
                    i10 = ln0.E;
                }
                return f10 / (i9 - i10);
            default:
                return ((pn0) this.f).getProgress();
        }
    }

    @Override // org.telegram.ui.Components.f00
    public final void l(float f10) {
        switch (this.e) {
            case 0:
                t1 t1Var = (t1) this.f;
                rn0 rn0Var = t1Var.D5;
                e1 e1Var = t1Var.C5;
                if (t1Var.u7.isMusic()) {
                    e1Var.i(f10);
                } else if (t1Var.u7.isVoice()) {
                    if (t1Var.B5) {
                        rn0Var.g(f10, false);
                    } else {
                        e1Var.i(f10);
                    }
                } else if (t1Var.u7.isRoundVideo()) {
                    if (t1Var.B5) {
                        if (rn0Var != null) {
                            rn0Var.g(f10, false);
                        }
                    } else if (e1Var != null) {
                        e1Var.i(f10);
                    }
                    t1Var.u7.audioProgress = f10;
                }
                t1Var.b(f10);
                t1Var.invalidate();
                break;
            default:
                pn0 pn0Var = (pn0) this.f;
                pn0Var.v = true;
                pn0Var.setProgress(f10);
                pn0Var.f(f10, true);
                pn0Var.v = false;
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f1(t1 t1Var) {
        super(false);
        this.f = t1Var;
    }
}

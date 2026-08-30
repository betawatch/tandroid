package org.telegram.ui.Cells;

import android.view.ViewGroup;
import org.telegram.ui.Components.go0;
import org.telegram.ui.Components.jo0;
import org.telegram.ui.Components.ko0;
import org.telegram.ui.Components.mo0;
import org.telegram.ui.Components.u00;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class e1 extends u00 {
    public final /* synthetic */ int e = 0;
    public final /* synthetic */ ViewGroup f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e1(ko0 ko0Var, boolean z4) {
        super(z4);
        this.f = ko0Var;
    }

    @Override // org.telegram.ui.Components.ho0
    public CharSequence d() {
        switch (this.e) {
            case 1:
                jo0 jo0Var = ((ko0) this.f).w;
                if (jo0Var != null) {
                    return jo0Var.getContentDescription();
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
                int j02 = ((ko0) this.f).w.j0();
                if (j02 > 0) {
                    return 1.0f / j02;
                }
                return 0.05f;
            default:
                return super.h();
        }
    }

    @Override // org.telegram.ui.Components.u00
    public final float k() {
        float f10;
        int i10;
        int i11;
        switch (this.e) {
            case 0:
                t1 t1Var = (t1) this.f;
                d1 d1Var = t1Var.D5;
                if (t1Var.v7.isMusic()) {
                    f10 = d1Var.b;
                    i10 = d1Var.f;
                    i11 = go0.E;
                } else {
                    if (!t1Var.v7.isVoice()) {
                        if (t1Var.v7.isRoundVideo()) {
                            return t1Var.v7.audioProgress;
                        }
                        return 0.0f;
                    }
                    if (t1Var.C5) {
                        mo0 mo0Var = t1Var.E5;
                        return mo0Var.a / mo0Var.g;
                    }
                    f10 = d1Var.b;
                    i10 = d1Var.f;
                    i11 = go0.E;
                }
                return f10 / (i10 - i11);
            default:
                return ((ko0) this.f).getProgress();
        }
    }

    @Override // org.telegram.ui.Components.u00
    public final void l(float f10) {
        switch (this.e) {
            case 0:
                t1 t1Var = (t1) this.f;
                mo0 mo0Var = t1Var.E5;
                d1 d1Var = t1Var.D5;
                if (t1Var.v7.isMusic()) {
                    d1Var.i(f10);
                } else if (t1Var.v7.isVoice()) {
                    if (t1Var.C5) {
                        mo0Var.g(f10, false);
                    } else {
                        d1Var.i(f10);
                    }
                } else if (t1Var.v7.isRoundVideo()) {
                    if (t1Var.C5) {
                        if (mo0Var != null) {
                            mo0Var.g(f10, false);
                        }
                    } else if (d1Var != null) {
                        d1Var.i(f10);
                    }
                    t1Var.v7.audioProgress = f10;
                }
                t1Var.b(f10);
                t1Var.invalidate();
                break;
            default:
                ko0 ko0Var = (ko0) this.f;
                ko0Var.v = true;
                ko0Var.setProgress(f10);
                ko0Var.f(f10, true);
                ko0Var.v = false;
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e1(t1 t1Var) {
        super(false);
        this.f = t1Var;
    }
}

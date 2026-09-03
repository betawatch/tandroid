package org.telegram.ui.Cells;

import android.view.ViewGroup;
import org.telegram.ui.Components.fo0;
import org.telegram.ui.Components.io0;
import org.telegram.ui.Components.jo0;
import org.telegram.ui.Components.lo0;
import org.telegram.ui.Components.v00;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class e1 extends v00 {
    public final /* synthetic */ int e = 0;
    public final /* synthetic */ ViewGroup f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e1(jo0 jo0Var, boolean z4) {
        super(z4);
        this.f = jo0Var;
    }

    @Override // org.telegram.ui.Components.go0
    public CharSequence d() {
        switch (this.e) {
            case 1:
                io0 io0Var = ((jo0) this.f).w;
                if (io0Var != null) {
                    return io0Var.getContentDescription();
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
                int j02 = ((jo0) this.f).w.j0();
                if (j02 > 0) {
                    return 1.0f / j02;
                }
                return 0.05f;
            default:
                return super.h();
        }
    }

    @Override // org.telegram.ui.Components.v00
    public final float k() {
        float f10;
        int i10;
        int i11;
        switch (this.e) {
            case 0:
                s1 s1Var = (s1) this.f;
                d1 d1Var = s1Var.D5;
                if (s1Var.v7.isMusic()) {
                    f10 = d1Var.b;
                    i10 = d1Var.f;
                    i11 = fo0.E;
                } else {
                    if (!s1Var.v7.isVoice()) {
                        if (s1Var.v7.isRoundVideo()) {
                            return s1Var.v7.audioProgress;
                        }
                        return 0.0f;
                    }
                    if (s1Var.C5) {
                        lo0 lo0Var = s1Var.E5;
                        return lo0Var.a / lo0Var.g;
                    }
                    f10 = d1Var.b;
                    i10 = d1Var.f;
                    i11 = fo0.E;
                }
                return f10 / (i10 - i11);
            default:
                return ((jo0) this.f).getProgress();
        }
    }

    @Override // org.telegram.ui.Components.v00
    public final void l(float f10) {
        switch (this.e) {
            case 0:
                s1 s1Var = (s1) this.f;
                lo0 lo0Var = s1Var.E5;
                d1 d1Var = s1Var.D5;
                if (s1Var.v7.isMusic()) {
                    d1Var.i(f10);
                } else if (s1Var.v7.isVoice()) {
                    if (s1Var.C5) {
                        lo0Var.g(f10, false);
                    } else {
                        d1Var.i(f10);
                    }
                } else if (s1Var.v7.isRoundVideo()) {
                    if (s1Var.C5) {
                        if (lo0Var != null) {
                            lo0Var.g(f10, false);
                        }
                    } else if (d1Var != null) {
                        d1Var.i(f10);
                    }
                    s1Var.v7.audioProgress = f10;
                }
                s1Var.b(f10);
                s1Var.invalidate();
                break;
            default:
                jo0 jo0Var = (jo0) this.f;
                jo0Var.v = true;
                jo0Var.setProgress(f10);
                jo0Var.f(f10, true);
                jo0Var.v = false;
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e1(s1 s1Var) {
        super(false);
        this.f = s1Var;
    }
}

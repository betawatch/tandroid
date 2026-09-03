package org.telegram.ui;

import android.content.Context;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class o11 extends org.telegram.ui.Components.l81 {
    public final /* synthetic */ int Q = 1;
    public Object R;
    public final /* synthetic */ FrameLayout S;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o11(org.telegram.ui.Components.sr0 sr0Var, Context context, org.telegram.ui.Components.rr0 rr0Var) {
        super(context, null);
        this.S = sr0Var;
        this.R = rr0Var;
    }

    @Override // org.telegram.ui.Components.l81
    public boolean i(MotionEvent motionEvent) {
        switch (this.Q) {
            case 1:
                return !((org.telegram.ui.Components.nr0) this.S).D.z1;
            default:
                return super.i(motionEvent);
        }
    }

    @Override // org.telegram.ui.Components.l81
    public final void w(boolean z4) {
        switch (this.Q) {
            case 0:
                org.telegram.ui.Components.rr0 rr0Var = (org.telegram.ui.Components.rr0) this.R;
                rr0Var.d.J0(((org.telegram.ui.Components.sr0) this.S).n.getAnimatingIndicatorProgress());
                break;
            default:
                org.telegram.ui.Components.nr0 nr0Var = (org.telegram.ui.Components.nr0) this.S;
                String currentLang = nr0Var.getCurrentLang();
                if (!TextUtils.equals((String) this.R, currentLang)) {
                    this.R = currentLang;
                    nr0Var.D.L0();
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.ui.Components.l81
    public void x(int i10) {
        switch (this.Q) {
            case 1:
                org.telegram.ui.Components.nr0 nr0Var = (org.telegram.ui.Components.nr0) this.S;
                String currentLang = nr0Var.getCurrentLang();
                if (!TextUtils.equals((String) this.R, currentLang)) {
                    this.R = currentLang;
                    nr0Var.D.L0();
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.ui.Components.l81
    public void y(int i10, boolean z4) {
        switch (this.Q) {
            case 0:
                org.telegram.ui.Components.rr0 rr0Var = (org.telegram.ui.Components.rr0) this.R;
                int i11 = ((org.telegram.ui.Components.sr0) this.S).n.V.get(i10, -1);
                org.telegram.ui.Components.yu0 yu0Var = rr0Var.d;
                if (i11 > 0) {
                    org.telegram.ui.Components.yu0.t(yu0Var, yu0Var.i1(i11).a, z4);
                    break;
                } else {
                    org.telegram.ui.Components.yu0.t(yu0Var, 8, z4);
                    break;
                }
            default:
                super.y(i10, z4);
                break;
        }
    }

    @Override // org.telegram.ui.Components.l81
    public final void z(int i10) {
        switch (this.Q) {
            case 0:
                org.telegram.ui.Components.rr0 rr0Var = (org.telegram.ui.Components.rr0) this.R;
                ((org.telegram.ui.Components.sr0) this.S).n.V.get(i10, -1);
                rr0Var.d.J0(1.0f);
                break;
            default:
                org.telegram.ui.Components.nr0 nr0Var = (org.telegram.ui.Components.nr0) this.S;
                String currentLang = nr0Var.getCurrentLang();
                if (!TextUtils.equals((String) this.R, currentLang)) {
                    this.R = currentLang;
                    nr0Var.D.L0();
                    break;
                }
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o11(org.telegram.ui.Components.nr0 nr0Var, Context context) {
        super(context, null);
        this.S = nr0Var;
    }
}

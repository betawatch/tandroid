package org.telegram.ui;

import android.content.Context;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class k11 extends org.telegram.ui.Components.m81 {
    public final /* synthetic */ int Q = 1;
    public Object R;
    public final /* synthetic */ FrameLayout S;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k11(org.telegram.ui.Components.tr0 tr0Var, Context context, org.telegram.ui.Components.sr0 sr0Var) {
        super(context, null);
        this.S = tr0Var;
        this.R = sr0Var;
    }

    @Override // org.telegram.ui.Components.m81
    public boolean i(MotionEvent motionEvent) {
        switch (this.Q) {
            case 1:
                return !((org.telegram.ui.Components.or0) this.S).D.z1;
            default:
                return super.i(motionEvent);
        }
    }

    @Override // org.telegram.ui.Components.m81
    public final void w(boolean z4) {
        switch (this.Q) {
            case 0:
                org.telegram.ui.Components.sr0 sr0Var = (org.telegram.ui.Components.sr0) this.R;
                sr0Var.d.J0(((org.telegram.ui.Components.tr0) this.S).n.getAnimatingIndicatorProgress());
                break;
            default:
                org.telegram.ui.Components.or0 or0Var = (org.telegram.ui.Components.or0) this.S;
                String currentLang = or0Var.getCurrentLang();
                if (!TextUtils.equals((String) this.R, currentLang)) {
                    this.R = currentLang;
                    or0Var.D.L0();
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.ui.Components.m81
    public void x(int i10) {
        switch (this.Q) {
            case 1:
                org.telegram.ui.Components.or0 or0Var = (org.telegram.ui.Components.or0) this.S;
                String currentLang = or0Var.getCurrentLang();
                if (!TextUtils.equals((String) this.R, currentLang)) {
                    this.R = currentLang;
                    or0Var.D.L0();
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.ui.Components.m81
    public void y(int i10, boolean z4) {
        switch (this.Q) {
            case 0:
                org.telegram.ui.Components.sr0 sr0Var = (org.telegram.ui.Components.sr0) this.R;
                int i11 = ((org.telegram.ui.Components.tr0) this.S).n.V.get(i10, -1);
                org.telegram.ui.Components.zu0 zu0Var = sr0Var.d;
                if (i11 > 0) {
                    org.telegram.ui.Components.zu0.t(zu0Var, zu0Var.i1(i11).a, z4);
                    break;
                } else {
                    org.telegram.ui.Components.zu0.t(zu0Var, 8, z4);
                    break;
                }
            default:
                super.y(i10, z4);
                break;
        }
    }

    @Override // org.telegram.ui.Components.m81
    public final void z(int i10) {
        switch (this.Q) {
            case 0:
                org.telegram.ui.Components.sr0 sr0Var = (org.telegram.ui.Components.sr0) this.R;
                ((org.telegram.ui.Components.tr0) this.S).n.V.get(i10, -1);
                sr0Var.d.J0(1.0f);
                break;
            default:
                org.telegram.ui.Components.or0 or0Var = (org.telegram.ui.Components.or0) this.S;
                String currentLang = or0Var.getCurrentLang();
                if (!TextUtils.equals((String) this.R, currentLang)) {
                    this.R = currentLang;
                    or0Var.D.L0();
                    break;
                }
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k11(org.telegram.ui.Components.or0 or0Var, Context context) {
        super(context, null);
        this.S = or0Var;
    }
}

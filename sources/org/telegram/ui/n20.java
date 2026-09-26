package org.telegram.ui;

import android.view.KeyEvent;
import android.view.View;
import org.telegram.messenger.voip.NativeInstance;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final /* synthetic */ class n20 implements org.telegram.ui.ActionBar.q0, org.telegram.ui.Components.ml0, r0.n, NativeInstance.AudioLevelsCallback, org.telegram.ui.ActionBar.k1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ d60 b;

    public /* synthetic */ n20(d60 d60Var, int i10) {
        this.a = i10;
        this.b = d60Var;
    }

    @Override // r0.n
    public r0.l1 Q0(View view, r0.l1 l1Var) {
        return d60.z(this.b, l1Var);
    }

    @Override // org.telegram.ui.Components.ml0
    public boolean d(int i10, View view) {
        switch (this.a) {
            case 1:
                d60 d60Var = this.b;
                if (d60Var.F1(view)) {
                    try {
                        d60Var.Q.performHapticFeedback(0);
                    } catch (Exception unused) {
                    }
                }
                return false;
            default:
                d60 d60Var2 = this.b;
                if (!d60Var2.r1()) {
                    if (view instanceof org.telegram.ui.Components.voip.l) {
                        return d60Var2.F1(view);
                    }
                    if (view instanceof org.telegram.ui.Cells.e4) {
                        d60Var2.I1();
                        org.telegram.ui.Components.lj0 lj0Var = ((org.telegram.ui.Cells.e4) view).f;
                        if (lj0Var.isEnabled()) {
                            lj0Var.callOnClick();
                            return true;
                        }
                    }
                }
                return false;
        }
    }

    @Override // org.telegram.ui.ActionBar.q0
    public void m(int i10) {
        this.b.O.getActionBarMenuOnItemClick().b(i10);
    }

    @Override // org.telegram.ui.ActionBar.k1
    public void p(KeyEvent keyEvent) {
        d60 d60Var;
        d50 d50Var;
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (d50Var = (d60Var = this.b).f3) != null && d50Var.isShowing()) {
            d60Var.f3.dismiss();
        }
    }

    @Override // org.telegram.messenger.voip.NativeInstance.AudioLevelsCallback
    public void run(int[] iArr, float[] fArr, boolean[] zArr) {
        d60.B(this.b, iArr, fArr);
    }
}

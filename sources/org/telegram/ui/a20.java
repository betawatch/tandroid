package org.telegram.ui;

import android.view.KeyEvent;
import android.view.View;
import org.telegram.messenger.voip.NativeInstance;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class a20 implements org.telegram.ui.ActionBar.s0, org.telegram.ui.Components.bl0, r0.o, NativeInstance.AudioLevelsCallback, org.telegram.ui.ActionBar.m1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ r50 b;

    public /* synthetic */ a20(r50 r50Var, int i10) {
        this.a = i10;
        this.b = r50Var;
    }

    @Override // r0.o
    public r0.m1 I0(View view, r0.m1 m1Var) {
        return r50.A(this.b, m1Var);
    }

    @Override // org.telegram.ui.Components.bl0
    public boolean c(int i10, View view) {
        switch (this.a) {
            case 1:
                r50 r50Var = this.b;
                if (r50Var.F1(view)) {
                    try {
                        r50Var.M.performHapticFeedback(0);
                    } catch (Exception unused) {
                    }
                }
                return false;
            default:
                r50 r50Var2 = this.b;
                if (!r50Var2.r1()) {
                    if (view instanceof org.telegram.ui.Components.voip.l) {
                        return r50Var2.F1(view);
                    }
                    if (view instanceof org.telegram.ui.Cells.c4) {
                        r50Var2.I1();
                        org.telegram.ui.Components.aj0 aj0Var = ((org.telegram.ui.Cells.c4) view).f;
                        if (aj0Var.isEnabled()) {
                            aj0Var.callOnClick();
                            return true;
                        }
                    }
                }
                return false;
        }
    }

    @Override // org.telegram.ui.ActionBar.s0
    public void i(int i10) {
        this.b.K.getActionBarMenuOnItemClick().b(i10);
    }

    @Override // org.telegram.ui.ActionBar.m1
    public void o(KeyEvent keyEvent) {
        r50 r50Var;
        r40 r40Var;
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (r40Var = (r50Var = this.b).b3) != null && r40Var.isShowing()) {
            r50Var.b3.dismiss();
        }
    }

    @Override // org.telegram.messenger.voip.NativeInstance.AudioLevelsCallback
    public void run(int[] iArr, float[] fArr, boolean[] zArr) {
        r50.C(this.b, iArr, fArr);
    }
}

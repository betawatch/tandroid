package org.telegram.ui;

import android.view.KeyEvent;
import android.view.View;
import org.telegram.messenger.voip.NativeInstance;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final /* synthetic */ class e20 implements org.telegram.ui.ActionBar.r0, org.telegram.ui.Components.bm0, r0.n, NativeInstance.AudioLevelsCallback, org.telegram.ui.ActionBar.m1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ v50 b;

    public /* synthetic */ e20(v50 v50Var, int i10) {
        this.a = i10;
        this.b = v50Var;
    }

    @Override // r0.n
    public r0.k1 P0(View view, r0.k1 k1Var) {
        return v50.A(this.b, k1Var);
    }

    @Override // org.telegram.ui.Components.bm0
    public boolean c(int i10, View view) {
        switch (this.a) {
            case 1:
                v50 v50Var = this.b;
                if (v50Var.G1(view)) {
                    try {
                        v50Var.Q.performHapticFeedback(0);
                    } catch (Exception unused) {
                    }
                }
                return false;
            default:
                v50 v50Var2 = this.b;
                if (!v50Var2.r1()) {
                    if (view instanceof org.telegram.ui.Components.voip.l) {
                        return v50Var2.G1(view);
                    }
                    if (view instanceof org.telegram.ui.Cells.i4) {
                        v50Var2.J1();
                        org.telegram.ui.Components.ak0 ak0Var = ((org.telegram.ui.Cells.i4) view).f;
                        if (ak0Var.isEnabled()) {
                            ak0Var.callOnClick();
                            return true;
                        }
                    }
                }
                return false;
        }
    }

    @Override // org.telegram.ui.ActionBar.r0
    public void g(int i10) {
        this.b.O.getActionBarMenuOnItemClick().b(i10);
    }

    @Override // org.telegram.ui.ActionBar.m1
    public void n(KeyEvent keyEvent) {
        v50 v50Var;
        v40 v40Var;
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (v40Var = (v50Var = this.b).f3) != null && v40Var.isShowing()) {
            v50Var.f3.dismiss();
        }
    }

    @Override // org.telegram.messenger.voip.NativeInstance.AudioLevelsCallback
    public void run(int[] iArr, float[] fArr, boolean[] zArr) {
        v50.C(this.b, iArr, fArr);
    }
}

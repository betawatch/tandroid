package org.telegram.ui;

import android.view.KeyEvent;
import android.view.View;
import org.telegram.messenger.voip.NativeInstance;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final /* synthetic */ class g20 implements org.telegram.ui.ActionBar.r0, org.telegram.ui.Components.cm0, r0.n, NativeInstance.AudioLevelsCallback, org.telegram.ui.ActionBar.m1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ x50 b;

    public /* synthetic */ g20(x50 x50Var, int i10) {
        this.a = i10;
        this.b = x50Var;
    }

    @Override // r0.n
    public r0.k1 P0(View view, r0.k1 k1Var) {
        return x50.A(this.b, k1Var);
    }

    @Override // org.telegram.ui.Components.cm0
    public boolean c(int i10, View view) {
        switch (this.a) {
            case 1:
                x50 x50Var = this.b;
                if (x50Var.G1(view)) {
                    try {
                        x50Var.Q.performHapticFeedback(0);
                    } catch (Exception unused) {
                    }
                }
                return false;
            default:
                x50 x50Var2 = this.b;
                if (!x50Var2.r1()) {
                    if (view instanceof org.telegram.ui.Components.voip.l) {
                        return x50Var2.G1(view);
                    }
                    if (view instanceof org.telegram.ui.Cells.i4) {
                        x50Var2.J1();
                        org.telegram.ui.Components.bk0 bk0Var = ((org.telegram.ui.Cells.i4) view).f;
                        if (bk0Var.isEnabled()) {
                            bk0Var.callOnClick();
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
        x50 x50Var;
        x40 x40Var;
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (x40Var = (x50Var = this.b).f3) != null && x40Var.isShowing()) {
            x50Var.f3.dismiss();
        }
    }

    @Override // org.telegram.messenger.voip.NativeInstance.AudioLevelsCallback
    public void run(int[] iArr, float[] fArr, boolean[] zArr) {
        x50.C(this.b, iArr, fArr);
    }
}

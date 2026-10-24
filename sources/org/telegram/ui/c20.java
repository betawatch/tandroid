package org.telegram.ui;

import android.view.KeyEvent;
import android.view.View;
import org.telegram.messenger.voip.NativeInstance;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final /* synthetic */ class c20 implements org.telegram.ui.ActionBar.q0, org.telegram.ui.Components.cm0, r0.n, NativeInstance.AudioLevelsCallback, org.telegram.ui.ActionBar.k1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ u50 b;

    public /* synthetic */ c20(u50 u50Var, int i10) {
        this.a = i10;
        this.b = u50Var;
    }

    @Override // r0.n
    public r0.k1 B0(View view, r0.k1 k1Var) {
        return u50.A(this.b, k1Var);
    }

    @Override // org.telegram.ui.Components.cm0
    public boolean d(int i10, View view) {
        switch (this.a) {
            case 1:
                u50 u50Var = this.b;
                if (u50Var.G1(view)) {
                    try {
                        u50Var.Q.performHapticFeedback(0);
                    } catch (Exception unused) {
                    }
                }
                return false;
            default:
                u50 u50Var2 = this.b;
                if (!u50Var2.r1()) {
                    if (view instanceof org.telegram.ui.Components.voip.l) {
                        return u50Var2.G1(view);
                    }
                    if (view instanceof org.telegram.ui.Cells.d4) {
                        u50Var2.J1();
                        org.telegram.ui.Components.bk0 bk0Var = ((org.telegram.ui.Cells.d4) view).f;
                        if (bk0Var.isEnabled()) {
                            bk0Var.callOnClick();
                            return true;
                        }
                    }
                }
                return false;
        }
    }

    @Override // org.telegram.ui.ActionBar.q0
    public void h(int i10) {
        this.b.O.getActionBarMenuOnItemClick().b(i10);
    }

    @Override // org.telegram.ui.ActionBar.k1
    public void j(KeyEvent keyEvent) {
        u50 u50Var;
        t40 t40Var;
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (t40Var = (u50Var = this.b).f3) != null && t40Var.isShowing()) {
            u50Var.f3.dismiss();
        }
    }

    @Override // org.telegram.messenger.voip.NativeInstance.AudioLevelsCallback
    public void run(int[] iArr, float[] fArr, boolean[] zArr) {
        u50.C(this.b, iArr, fArr);
    }
}

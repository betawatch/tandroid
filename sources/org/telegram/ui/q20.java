package org.telegram.ui;

import android.view.KeyEvent;
import android.view.View;
import org.telegram.messenger.voip.NativeInstance;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final /* synthetic */ class q20 implements org.telegram.ui.ActionBar.r0, org.telegram.ui.Components.gm0, r0.n, NativeInstance.AudioLevelsCallback, org.telegram.ui.ActionBar.l1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ g60 b;

    public /* synthetic */ q20(g60 g60Var, int i10) {
        this.a = i10;
        this.b = g60Var;
    }

    @Override // r0.n
    public r0.k1 M0(View view, r0.k1 k1Var) {
        return g60.C(this.b, k1Var);
    }

    @Override // org.telegram.ui.Components.gm0
    public boolean d(int i10, View view) {
        switch (this.a) {
            case 1:
                g60 g60Var = this.b;
                if (g60Var.G1(view)) {
                    try {
                        g60Var.Q.performHapticFeedback(0);
                    } catch (Exception unused) {
                    }
                }
                return false;
            default:
                g60 g60Var2 = this.b;
                if (!g60Var2.s1()) {
                    if (view instanceof org.telegram.ui.Components.voip.l) {
                        return g60Var2.G1(view);
                    }
                    if (view instanceof org.telegram.ui.Cells.e4) {
                        g60Var2.J1();
                        org.telegram.ui.Components.fk0 fk0Var = ((org.telegram.ui.Cells.e4) view).f;
                        if (fk0Var.isEnabled()) {
                            fk0Var.callOnClick();
                            return true;
                        }
                    }
                }
                return false;
        }
    }

    @Override // org.telegram.ui.ActionBar.r0
    public void m(int i10) {
        this.b.O.getActionBarMenuOnItemClick().b(i10);
    }

    @Override // org.telegram.ui.ActionBar.l1
    public void o(KeyEvent keyEvent) {
        g60 g60Var;
        g50 g50Var;
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (g50Var = (g60Var = this.b).f3) != null && g50Var.isShowing()) {
            g60Var.f3.dismiss();
        }
    }

    @Override // org.telegram.messenger.voip.NativeInstance.AudioLevelsCallback
    public void run(int[] iArr, float[] fArr, boolean[] zArr) {
        g60.E(this.b, iArr, fArr);
    }
}

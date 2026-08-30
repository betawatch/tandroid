package org.telegram.ui;

import android.view.KeyEvent;
import android.view.View;
import org.telegram.messenger.voip.NativeInstance;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final /* synthetic */ class m20 implements org.telegram.ui.ActionBar.s0, org.telegram.ui.Components.kl0, r0.o, NativeInstance.AudioLevelsCallback, org.telegram.ui.ActionBar.n1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ c60 b;

    public /* synthetic */ m20(c60 c60Var, int i10) {
        this.a = i10;
        this.b = c60Var;
    }

    @Override // r0.o
    public r0.m1 N0(View view, r0.m1 m1Var) {
        return c60.A(this.b, m1Var);
    }

    @Override // org.telegram.ui.Components.kl0
    public boolean f(int i10, View view) {
        switch (this.a) {
            case 1:
                c60 c60Var = this.b;
                if (c60Var.F1(view)) {
                    try {
                        c60Var.N.performHapticFeedback(0);
                    } catch (Exception unused) {
                    }
                }
                return false;
            default:
                c60 c60Var2 = this.b;
                if (!c60Var2.r1()) {
                    if (view instanceof org.telegram.ui.Components.voip.l) {
                        return c60Var2.F1(view);
                    }
                    if (view instanceof org.telegram.ui.Cells.e4) {
                        c60Var2.I1();
                        org.telegram.ui.Components.jj0 jj0Var = ((org.telegram.ui.Cells.e4) view).f;
                        if (jj0Var.isEnabled()) {
                            jj0Var.callOnClick();
                            return true;
                        }
                    }
                }
                return false;
        }
    }

    @Override // org.telegram.ui.ActionBar.s0
    public void l(int i10) {
        this.b.L.getActionBarMenuOnItemClick().b(i10);
    }

    @Override // org.telegram.ui.ActionBar.n1
    public void n(KeyEvent keyEvent) {
        c60 c60Var;
        d50 d50Var;
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (d50Var = (c60Var = this.b).c3) != null && d50Var.isShowing()) {
            c60Var.c3.dismiss();
        }
    }

    @Override // org.telegram.messenger.voip.NativeInstance.AudioLevelsCallback
    public void run(int[] iArr, float[] fArr, boolean[] zArr) {
        c60.C(this.b, iArr, fArr);
    }
}

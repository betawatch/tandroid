package org.telegram.ui;

import android.view.KeyEvent;
import android.view.View;
import org.telegram.messenger.voip.NativeInstance;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final /* synthetic */ class n20 implements org.telegram.ui.ActionBar.s0, org.telegram.ui.Components.kl0, r0.o, NativeInstance.AudioLevelsCallback, org.telegram.ui.ActionBar.n1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ d60 b;

    public /* synthetic */ n20(d60 d60Var, int i10) {
        this.a = i10;
        this.b = d60Var;
    }

    @Override // r0.o
    public r0.m1 M0(View view, r0.m1 m1Var) {
        return d60.A(this.b, m1Var);
    }

    @Override // org.telegram.ui.Components.kl0
    public boolean f(int i10, View view) {
        switch (this.a) {
            case 1:
                d60 d60Var = this.b;
                if (d60Var.F1(view)) {
                    try {
                        d60Var.N.performHapticFeedback(0);
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
                        org.telegram.ui.Components.kj0 kj0Var = ((org.telegram.ui.Cells.e4) view).f;
                        if (kj0Var.isEnabled()) {
                            kj0Var.callOnClick();
                            return true;
                        }
                    }
                }
                return false;
        }
    }

    @Override // org.telegram.ui.ActionBar.s0
    public void h(int i10) {
        this.b.L.getActionBarMenuOnItemClick().b(i10);
    }

    @Override // org.telegram.ui.ActionBar.n1
    public void n(KeyEvent keyEvent) {
        d60 d60Var;
        e50 e50Var;
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (e50Var = (d60Var = this.b).c3) != null && e50Var.isShowing()) {
            d60Var.c3.dismiss();
        }
    }

    @Override // org.telegram.messenger.voip.NativeInstance.AudioLevelsCallback
    public void run(int[] iArr, float[] fArr, boolean[] zArr) {
        d60.C(this.b, iArr, fArr);
    }
}

package org.telegram.ui;

import android.view.KeyEvent;
import android.view.View;
import org.telegram.messenger.voip.NativeInstance;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final /* synthetic */ class o20 implements org.telegram.ui.ActionBar.s0, org.telegram.ui.Components.jl0, r0.o, NativeInstance.AudioLevelsCallback, org.telegram.ui.ActionBar.n1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ e60 b;

    public /* synthetic */ o20(e60 e60Var, int i10) {
        this.a = i10;
        this.b = e60Var;
    }

    @Override // r0.o
    public r0.m1 M0(View view, r0.m1 m1Var) {
        return e60.A(this.b, m1Var);
    }

    @Override // org.telegram.ui.Components.jl0
    public boolean d(int i10, View view) {
        switch (this.a) {
            case 1:
                e60 e60Var = this.b;
                if (e60Var.F1(view)) {
                    try {
                        e60Var.N.performHapticFeedback(0);
                    } catch (Exception unused) {
                    }
                }
                return false;
            default:
                e60 e60Var2 = this.b;
                if (!e60Var2.r1()) {
                    if (view instanceof org.telegram.ui.Components.voip.l) {
                        return e60Var2.F1(view);
                    }
                    if (view instanceof org.telegram.ui.Cells.d4) {
                        e60Var2.I1();
                        org.telegram.ui.Components.jj0 jj0Var = ((org.telegram.ui.Cells.d4) view).f;
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
    public void m(int i10) {
        this.b.L.getActionBarMenuOnItemClick().b(i10);
    }

    @Override // org.telegram.ui.ActionBar.n1
    public void n(KeyEvent keyEvent) {
        e60 e60Var;
        f50 f50Var;
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (f50Var = (e60Var = this.b).c3) != null && f50Var.isShowing()) {
            e60Var.c3.dismiss();
        }
    }

    @Override // org.telegram.messenger.voip.NativeInstance.AudioLevelsCallback
    public void run(int[] iArr, float[] fArr, boolean[] zArr) {
        e60.C(this.b, iArr, fArr);
    }
}

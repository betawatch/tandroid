package org.telegram.ui;

import android.view.KeyEvent;
import android.view.View;
import org.telegram.messenger.voip.NativeInstance;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final /* synthetic */ class p20 implements org.telegram.ui.ActionBar.r0, org.telegram.ui.Components.cl0, r0.n, NativeInstance.AudioLevelsCallback, org.telegram.ui.ActionBar.l1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ f60 b;

    public /* synthetic */ p20(f60 f60Var, int i10) {
        this.a = i10;
        this.b = f60Var;
    }

    @Override // r0.n
    public r0.l1 Q0(View view, r0.l1 l1Var) {
        return f60.z(this.b, l1Var);
    }

    @Override // org.telegram.ui.Components.cl0
    public boolean d(int i10, View view) {
        switch (this.a) {
            case 1:
                f60 f60Var = this.b;
                if (f60Var.F1(view)) {
                    try {
                        f60Var.Q.performHapticFeedback(0);
                    } catch (Exception unused) {
                    }
                }
                return false;
            default:
                f60 f60Var2 = this.b;
                if (!f60Var2.r1()) {
                    if (view instanceof org.telegram.ui.Components.voip.l) {
                        return f60Var2.F1(view);
                    }
                    if (view instanceof org.telegram.ui.Cells.e4) {
                        f60Var2.I1();
                        org.telegram.ui.Components.bj0 bj0Var = ((org.telegram.ui.Cells.e4) view).f;
                        if (bj0Var.isEnabled()) {
                            bj0Var.callOnClick();
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
        f60 f60Var;
        f50 f50Var;
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (f50Var = (f60Var = this.b).f3) != null && f50Var.isShowing()) {
            f60Var.f3.dismiss();
        }
    }

    @Override // org.telegram.messenger.voip.NativeInstance.AudioLevelsCallback
    public void run(int[] iArr, float[] fArr, boolean[] zArr) {
        f60.B(this.b, iArr, fArr);
    }
}

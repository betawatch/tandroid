package org.telegram.ui;

import android.view.KeyEvent;
import android.view.View;
import org.telegram.messenger.voip.NativeInstance;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public final /* synthetic */ class b20 implements org.telegram.ui.ActionBar.q0, org.telegram.ui.Components.yl0, r0.n, NativeInstance.AudioLevelsCallback, org.telegram.ui.ActionBar.k1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ s50 b;

    public /* synthetic */ b20(s50 s50Var, int i10) {
        this.a = i10;
        this.b = s50Var;
    }

    @Override // r0.n
    public r0.k1 B0(View view, r0.k1 k1Var) {
        return s50.B(this.b, k1Var);
    }

    @Override // org.telegram.ui.Components.yl0
    public boolean a(int i10, View view) {
        switch (this.a) {
            case 1:
                s50 s50Var = this.b;
                if (s50Var.G1(view)) {
                    try {
                        s50Var.Q.performHapticFeedback(0);
                    } catch (Exception unused) {
                    }
                }
                return false;
            default:
                s50 s50Var2 = this.b;
                if (!s50Var2.s1()) {
                    if (view instanceof org.telegram.ui.Components.voip.l) {
                        return s50Var2.G1(view);
                    }
                    if (view instanceof org.telegram.ui.Cells.d4) {
                        s50Var2.J1();
                        org.telegram.ui.Components.xj0 xj0Var = ((org.telegram.ui.Cells.d4) view).f;
                        if (xj0Var.isEnabled()) {
                            xj0Var.callOnClick();
                            return true;
                        }
                    }
                }
                return false;
        }
    }

    @Override // org.telegram.ui.ActionBar.q0
    public void j(int i10) {
        this.b.O.getActionBarMenuOnItemClick().b(i10);
    }

    @Override // org.telegram.ui.ActionBar.k1
    public void n(KeyEvent keyEvent) {
        s50 s50Var;
        s40 s40Var;
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (s40Var = (s50Var = this.b).f3) != null && s40Var.isShowing()) {
            s50Var.f3.dismiss();
        }
    }

    @Override // org.telegram.messenger.voip.NativeInstance.AudioLevelsCallback
    public void run(int[] iArr, float[] fArr, boolean[] zArr) {
        s50.D(this.b, iArr, fArr);
    }
}

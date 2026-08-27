package org.telegram.ui;

import android.view.KeyEvent;
import android.view.View;
import org.telegram.messenger.voip.NativeInstance;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final /* synthetic */ class b20 implements org.telegram.ui.ActionBar.r0, org.telegram.ui.Components.rk0, r0.o, NativeInstance.AudioLevelsCallback, org.telegram.ui.ActionBar.l1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ s50 b;

    public /* synthetic */ b20(s50 s50Var, int i10) {
        this.a = i10;
        this.b = s50Var;
    }

    @Override // r0.o
    public r0.m1 I0(View view, r0.m1 m1Var) {
        return s50.B(this.b, m1Var);
    }

    @Override // org.telegram.ui.Components.rk0
    public boolean a(int i10, View view) {
        switch (this.a) {
            case 1:
                s50 s50Var = this.b;
                if (s50Var.F1(view)) {
                    try {
                        s50Var.M.performHapticFeedback(0);
                    } catch (Exception unused) {
                    }
                }
                return false;
            default:
                s50 s50Var2 = this.b;
                if (!s50Var2.r1()) {
                    if (view instanceof org.telegram.ui.Components.voip.l) {
                        return s50Var2.F1(view);
                    }
                    if (view instanceof org.telegram.ui.Cells.b4) {
                        s50Var2.I1();
                        org.telegram.ui.Components.ri0 ri0Var = ((org.telegram.ui.Cells.b4) view).f;
                        if (ri0Var.isEnabled()) {
                            ri0Var.callOnClick();
                            return true;
                        }
                    }
                }
                return false;
        }
    }

    @Override // org.telegram.ui.ActionBar.r0
    public void h(int i10) {
        this.b.K.getActionBarMenuOnItemClick().b(i10);
    }

    @Override // org.telegram.ui.ActionBar.l1
    public void k(KeyEvent keyEvent) {
        s50 s50Var;
        s40 s40Var;
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (s40Var = (s50Var = this.b).b3) != null && s40Var.isShowing()) {
            s50Var.b3.dismiss();
        }
    }

    @Override // org.telegram.messenger.voip.NativeInstance.AudioLevelsCallback
    public void run(int[] iArr, float[] fArr, boolean[] zArr) {
        s50.D(this.b, iArr, fArr);
    }
}

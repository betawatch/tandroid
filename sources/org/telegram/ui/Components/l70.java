package org.telegram.ui.Components;

import android.view.KeyEvent;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final /* synthetic */ class l70 implements org.telegram.ui.ActionBar.n1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ w70 b;

    public /* synthetic */ l70(w70 w70Var, int i10) {
        this.a = i10;
        this.b = w70Var;
    }

    @Override // org.telegram.ui.ActionBar.n1
    public final void o(KeyEvent keyEvent) {
        w70 w70Var;
        r70 r70Var;
        w70 w70Var2;
        r70 r70Var2;
        switch (this.a) {
            case 0:
                if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (r70Var = (w70Var = this.b).m) != null && r70Var.isShowing()) {
                    w70Var.u();
                    break;
                }
                break;
            default:
                if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (r70Var2 = (w70Var2 = this.b).m) != null && r70Var2.isShowing()) {
                    w70Var2.u();
                    break;
                }
                break;
        }
    }
}

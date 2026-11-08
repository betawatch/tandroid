package org.telegram.ui.Components;

import android.view.KeyEvent;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class y50 implements org.telegram.ui.ActionBar.e1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ k60 b;

    public /* synthetic */ y50(k60 k60Var, int i7) {
        this.a = i7;
        this.b = k60Var;
    }

    @Override // org.telegram.ui.ActionBar.e1
    public final void j(KeyEvent keyEvent) {
        k60 k60Var;
        f60 f60Var;
        k60 k60Var2;
        f60 f60Var2;
        switch (this.a) {
            case 0:
                if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (f60Var = (k60Var = this.b).m) != null && f60Var.isShowing()) {
                    k60Var.u();
                    break;
                }
                break;
            default:
                if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (f60Var2 = (k60Var2 = this.b).m) != null && f60Var2.isShowing()) {
                    k60Var2.u();
                    break;
                }
                break;
        }
    }
}

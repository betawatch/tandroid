package org.telegram.ui.Components;

import android.view.KeyEvent;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final /* synthetic */ class q70 implements org.telegram.ui.ActionBar.l1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ b80 b;

    public /* synthetic */ q70(b80 b80Var, int i10) {
        this.a = i10;
        this.b = b80Var;
    }

    @Override // org.telegram.ui.ActionBar.l1
    public final void o(KeyEvent keyEvent) {
        b80 b80Var;
        w70 w70Var;
        b80 b80Var2;
        w70 w70Var2;
        switch (this.a) {
            case 0:
                if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (w70Var = (b80Var = this.b).m) != null && w70Var.isShowing()) {
                    b80Var.u();
                    break;
                }
                break;
            default:
                if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (w70Var2 = (b80Var2 = this.b).m) != null && w70Var2.isShowing()) {
                    b80Var2.u();
                    break;
                }
                break;
        }
    }
}

package org.telegram.ui.Components;

import android.view.KeyEvent;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes3.dex */
public final /* synthetic */ class y70 implements org.telegram.ui.ActionBar.k1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ j80 b;

    public /* synthetic */ y70(j80 j80Var, int i10) {
        this.a = i10;
        this.b = j80Var;
    }

    @Override // org.telegram.ui.ActionBar.k1
    public final void j(KeyEvent keyEvent) {
        j80 j80Var;
        e80 e80Var;
        j80 j80Var2;
        e80 e80Var2;
        switch (this.a) {
            case 0:
                if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (e80Var = (j80Var = this.b).m) != null && e80Var.isShowing()) {
                    j80Var.u();
                    break;
                }
                break;
            default:
                if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (e80Var2 = (j80Var2 = this.b).m) != null && e80Var2.isShowing()) {
                    j80Var2.u();
                    break;
                }
                break;
        }
    }
}

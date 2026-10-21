package org.telegram.ui.Components;

import android.view.KeyEvent;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes3.dex */
public final /* synthetic */ class w70 implements org.telegram.ui.ActionBar.k1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ i80 b;

    public /* synthetic */ w70(i80 i80Var, int i10) {
        this.a = i10;
        this.b = i80Var;
    }

    @Override // org.telegram.ui.ActionBar.k1
    public final void n(KeyEvent keyEvent) {
        i80 i80Var;
        d80 d80Var;
        i80 i80Var2;
        d80 d80Var2;
        switch (this.a) {
            case 0:
                if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (d80Var = (i80Var = this.b).m) != null && d80Var.isShowing()) {
                    i80Var.u();
                    break;
                }
                break;
            default:
                if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (d80Var2 = (i80Var2 = this.b).m) != null && d80Var2.isShowing()) {
                    i80Var2.u();
                    break;
                }
                break;
        }
    }
}

package org.telegram.ui.Components;

import android.view.KeyEvent;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
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

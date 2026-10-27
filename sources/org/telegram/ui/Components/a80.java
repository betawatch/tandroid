package org.telegram.ui.Components;

import android.view.KeyEvent;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final /* synthetic */ class a80 implements org.telegram.ui.ActionBar.m1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ l80 b;

    public /* synthetic */ a80(l80 l80Var, int i10) {
        this.a = i10;
        this.b = l80Var;
    }

    @Override // org.telegram.ui.ActionBar.m1
    public final void n(KeyEvent keyEvent) {
        l80 l80Var;
        g80 g80Var;
        l80 l80Var2;
        g80 g80Var2;
        switch (this.a) {
            case 0:
                if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (g80Var = (l80Var = this.b).m) != null && g80Var.isShowing()) {
                    l80Var.u();
                    break;
                }
                break;
            default:
                if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (g80Var2 = (l80Var2 = this.b).m) != null && g80Var2.isShowing()) {
                    l80Var2.u();
                    break;
                }
                break;
        }
    }
}

package org.telegram.ui.Components;

import android.view.KeyEvent;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final /* synthetic */ class z70 implements org.telegram.ui.ActionBar.m1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ k80 b;

    public /* synthetic */ z70(k80 k80Var, int i10) {
        this.a = i10;
        this.b = k80Var;
    }

    @Override // org.telegram.ui.ActionBar.m1
    public final void n(KeyEvent keyEvent) {
        k80 k80Var;
        f80 f80Var;
        k80 k80Var2;
        f80 f80Var2;
        switch (this.a) {
            case 0:
                if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (f80Var = (k80Var = this.b).m) != null && f80Var.isShowing()) {
                    k80Var.u();
                    break;
                }
                break;
            default:
                if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (f80Var2 = (k80Var2 = this.b).m) != null && f80Var2.isShowing()) {
                    k80Var2.u();
                    break;
                }
                break;
        }
    }
}

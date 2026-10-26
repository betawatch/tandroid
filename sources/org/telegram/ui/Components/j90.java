package org.telegram.ui.Components;

import android.view.KeyEvent;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final /* synthetic */ class j90 implements org.telegram.ui.ActionBar.b2, org.telegram.ui.ActionBar.m1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ r90 b;

    public /* synthetic */ j90(r90 r90Var, int i10) {
        this.a = i10;
        this.b = r90Var;
    }

    @Override // org.telegram.ui.ActionBar.b2
    public void h(org.telegram.ui.ActionBar.e2 e2Var, int i10) {
        switch (this.a) {
            case 0:
                q90 q90Var = this.b.r;
                if (q90Var != null) {
                    q90Var.k();
                    break;
                }
                break;
            default:
                q90 q90Var2 = this.b.r;
                if (q90Var2 != null) {
                    q90Var2.d();
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.m1
    public void n(KeyEvent keyEvent) {
        r90 r90Var = this.b;
        r90Var.getClass();
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && r90Var.s.isShowing()) {
            r90Var.s.d(true);
        }
    }
}

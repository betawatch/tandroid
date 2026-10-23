package org.telegram.ui.Components;

import android.view.KeyEvent;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes3.dex */
public final /* synthetic */ class i90 implements org.telegram.ui.ActionBar.z1, org.telegram.ui.ActionBar.k1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ r90 b;

    public /* synthetic */ i90(r90 r90Var, int i10) {
        this.a = i10;
        this.b = r90Var;
    }

    @Override // org.telegram.ui.ActionBar.z1
    public void g(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
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
                    q90Var2.c();
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.k1
    public void j(KeyEvent keyEvent) {
        r90 r90Var = this.b;
        r90Var.getClass();
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && r90Var.s.isShowing()) {
            r90Var.s.d(true);
        }
    }
}

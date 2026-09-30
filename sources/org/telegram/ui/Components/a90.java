package org.telegram.ui.Components;

import android.view.KeyEvent;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
/* loaded from: classes3.dex */
public final /* synthetic */ class a90 implements org.telegram.ui.ActionBar.z1, org.telegram.ui.ActionBar.k1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ i90 b;

    public /* synthetic */ a90(i90 i90Var, int i10) {
        this.a = i10;
        this.b = i90Var;
    }

    @Override // org.telegram.ui.ActionBar.z1
    public void f(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        switch (this.a) {
            case 0:
                h90 h90Var = this.b.r;
                if (h90Var != null) {
                    h90Var.k();
                    break;
                }
                break;
            default:
                h90 h90Var2 = this.b.r;
                if (h90Var2 != null) {
                    h90Var2.e();
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.k1
    public void p(KeyEvent keyEvent) {
        i90 i90Var = this.b;
        i90Var.getClass();
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && i90Var.s.isShowing()) {
            i90Var.s.d(true);
        }
    }
}

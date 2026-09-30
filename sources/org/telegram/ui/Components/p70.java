package org.telegram.ui.Components;

import android.view.KeyEvent;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
/* loaded from: classes3.dex */
public final /* synthetic */ class p70 implements org.telegram.ui.ActionBar.k1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ a80 b;

    public /* synthetic */ p70(a80 a80Var, int i10) {
        this.a = i10;
        this.b = a80Var;
    }

    @Override // org.telegram.ui.ActionBar.k1
    public final void p(KeyEvent keyEvent) {
        a80 a80Var;
        v70 v70Var;
        a80 a80Var2;
        v70 v70Var2;
        switch (this.a) {
            case 0:
                if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (v70Var = (a80Var = this.b).m) != null && v70Var.isShowing()) {
                    a80Var.u();
                    break;
                }
                break;
            default:
                if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (v70Var2 = (a80Var2 = this.b).m) != null && v70Var2.isShowing()) {
                    a80Var2.u();
                    break;
                }
                break;
        }
    }
}

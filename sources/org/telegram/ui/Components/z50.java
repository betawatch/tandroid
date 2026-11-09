package org.telegram.ui.Components;

import android.view.KeyEvent;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final /* synthetic */ class z50 implements org.telegram.ui.ActionBar.e1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ l60 b;

    public /* synthetic */ z50(l60 l60Var, int i7) {
        this.a = i7;
        this.b = l60Var;
    }

    @Override // org.telegram.ui.ActionBar.e1
    public final void j(KeyEvent keyEvent) {
        l60 l60Var;
        g60 g60Var;
        l60 l60Var2;
        g60 g60Var2;
        switch (this.a) {
            case 0:
                if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (g60Var = (l60Var = this.b).m) != null && g60Var.isShowing()) {
                    l60Var.u();
                    break;
                }
                break;
            default:
                if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (g60Var2 = (l60Var2 = this.b).m) != null && g60Var2.isShowing()) {
                    l60Var2.u();
                    break;
                }
                break;
        }
    }
}

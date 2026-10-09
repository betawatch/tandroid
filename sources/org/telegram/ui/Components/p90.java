package org.telegram.ui.Components;

import android.view.KeyEvent;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final /* synthetic */ class p90 implements org.telegram.ui.ActionBar.a2, org.telegram.ui.ActionBar.l1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ x90 b;

    public /* synthetic */ p90(x90 x90Var, int i10) {
        this.a = i10;
        this.b = x90Var;
    }

    @Override // org.telegram.ui.ActionBar.a2
    public void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.a) {
            case 0:
                w90 w90Var = this.b.r;
                if (w90Var != null) {
                    w90Var.j();
                    break;
                }
                break;
            default:
                w90 w90Var2 = this.b.r;
                if (w90Var2 != null) {
                    w90Var2.c();
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.l1
    public void o(KeyEvent keyEvent) {
        x90 x90Var = this.b;
        x90Var.getClass();
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && x90Var.s.isShowing()) {
            x90Var.s.d(true);
        }
    }
}

package org.telegram.ui.Components;

import android.view.KeyEvent;

/* compiled from: r8-map-id-995671d6bce0aaeb91824b65f2f1988c5410eae59f1d5d7c368a0027313cc0ad */
/* loaded from: classes3.dex */
public final /* synthetic */ class b90 implements org.telegram.ui.ActionBar.a2, org.telegram.ui.ActionBar.l1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ j90 b;

    public /* synthetic */ b90(j90 j90Var, int i10) {
        this.a = i10;
        this.b = j90Var;
    }

    @Override // org.telegram.ui.ActionBar.a2
    public void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.a) {
            case 0:
                i90 i90Var = this.b.r;
                if (i90Var != null) {
                    i90Var.i();
                    break;
                }
                break;
            default:
                i90 i90Var2 = this.b.r;
                if (i90Var2 != null) {
                    i90Var2.c();
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.l1
    public void o(KeyEvent keyEvent) {
        j90 j90Var = this.b;
        j90Var.getClass();
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && j90Var.s.isShowing()) {
            j90Var.s.d(true);
        }
    }
}

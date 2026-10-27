package org.telegram.ui.Components;

import android.view.KeyEvent;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final /* synthetic */ class k90 implements org.telegram.ui.ActionBar.b2, org.telegram.ui.ActionBar.m1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ s90 b;

    public /* synthetic */ k90(s90 s90Var, int i10) {
        this.a = i10;
        this.b = s90Var;
    }

    @Override // org.telegram.ui.ActionBar.b2
    public void h(org.telegram.ui.ActionBar.e2 e2Var, int i10) {
        switch (this.a) {
            case 0:
                r90 r90Var = this.b.r;
                if (r90Var != null) {
                    r90Var.k();
                    break;
                }
                break;
            default:
                r90 r90Var2 = this.b.r;
                if (r90Var2 != null) {
                    r90Var2.d();
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.m1
    public void n(KeyEvent keyEvent) {
        s90 s90Var = this.b;
        s90Var.getClass();
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && s90Var.s.isShowing()) {
            s90Var.s.d(true);
        }
    }
}

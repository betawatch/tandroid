package org.telegram.ui.Components;

import android.view.KeyEvent;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final /* synthetic */ class p80 implements org.telegram.ui.ActionBar.c2, org.telegram.ui.ActionBar.n1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ x80 b;

    public /* synthetic */ p80(x80 x80Var, int i10) {
        this.a = i10;
        this.b = x80Var;
    }

    @Override // org.telegram.ui.ActionBar.c2
    public void l(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        switch (this.a) {
            case 0:
                w80 w80Var = this.b.r;
                if (w80Var != null) {
                    w80Var.h();
                    break;
                }
                break;
            default:
                w80 w80Var2 = this.b.r;
                if (w80Var2 != null) {
                    w80Var2.c();
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.n1
    public void n(KeyEvent keyEvent) {
        x80 x80Var = this.b;
        x80Var.getClass();
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && x80Var.s.isShowing()) {
            x80Var.s.d(true);
        }
    }
}

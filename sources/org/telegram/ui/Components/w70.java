package org.telegram.ui.Components;

import android.view.KeyEvent;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final /* synthetic */ class w70 implements org.telegram.ui.ActionBar.r1, org.telegram.ui.ActionBar.f1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ e80 b;

    public /* synthetic */ w70(e80 e80Var, int i7) {
        this.a = i7;
        this.b = e80Var;
    }

    @Override // org.telegram.ui.ActionBar.r1
    public void h(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        switch (this.a) {
            case 0:
                d80 d80Var = this.b.r;
                if (d80Var != null) {
                    d80Var.i();
                    break;
                }
                break;
            default:
                d80 d80Var2 = this.b.r;
                if (d80Var2 != null) {
                    d80Var2.e();
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.f1
    public void j(KeyEvent keyEvent) {
        e80 e80Var = this.b;
        e80Var.getClass();
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && e80Var.s.isShowing()) {
            e80Var.s.d(true);
        }
    }
}

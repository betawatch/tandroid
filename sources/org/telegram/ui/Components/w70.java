package org.telegram.ui.Components;

import android.view.KeyEvent;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class w70 implements org.telegram.ui.ActionBar.b2, org.telegram.ui.ActionBar.m1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ e80 b;

    public /* synthetic */ w70(e80 e80Var, int i9) {
        this.a = i9;
        this.b = e80Var;
    }

    @Override // org.telegram.ui.ActionBar.b2
    public void f(org.telegram.ui.ActionBar.c2 c2Var, int i9) {
        switch (this.a) {
            case 0:
                d80 d80Var = this.b.r;
                if (d80Var != null) {
                    d80Var.k();
                    break;
                }
                break;
            default:
                d80 d80Var2 = this.b.r;
                if (d80Var2 != null) {
                    d80Var2.c();
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.m1
    public void k(KeyEvent keyEvent) {
        e80 e80Var = this.b;
        e80Var.getClass();
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && e80Var.s.isShowing()) {
            e80Var.s.d(true);
        }
    }
}

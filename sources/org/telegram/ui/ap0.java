package org.telegram.ui;

import android.view.KeyEvent;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ap0 implements org.telegram.ui.Components.x4, org.telegram.ui.ActionBar.m1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ip0 b;

    public /* synthetic */ ap0(ip0 ip0Var, int i9) {
        this.a = i9;
        this.b = ip0Var;
    }

    @Override // org.telegram.ui.Components.x4
    public void B(int i9, int i10, boolean z10) {
        switch (this.a) {
            case 0:
                ip0 ip0Var = this.b;
                ip0Var.U(ip0Var.b, ip0Var.c, z10, i9);
                ip0Var.finishFragment();
                break;
            default:
                ip0 ip0Var2 = this.b;
                ip0Var2.U(ip0Var2.b, ip0Var2.c, z10, i9);
                ip0Var2.finishFragment();
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.m1
    public void k(KeyEvent keyEvent) {
        org.telegram.ui.ActionBar.o1 o1Var;
        ip0 ip0Var = this.b;
        ip0Var.getClass();
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (o1Var = ip0Var.E) != null && o1Var.isShowing()) {
            ip0Var.E.d(true);
        }
    }
}

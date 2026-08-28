package org.telegram.ui.Components;

import android.view.KeyEvent;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class l60 implements org.telegram.ui.ActionBar.m1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ x60 b;

    public /* synthetic */ l60(x60 x60Var, int i9) {
        this.a = i9;
        this.b = x60Var;
    }

    @Override // org.telegram.ui.ActionBar.m1
    public final void k(KeyEvent keyEvent) {
        x60 x60Var;
        s60 s60Var;
        x60 x60Var2;
        s60 s60Var2;
        switch (this.a) {
            case 0:
                if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (s60Var = (x60Var = this.b).m) != null && s60Var.isShowing()) {
                    x60Var.u();
                    break;
                }
                break;
            default:
                if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (s60Var2 = (x60Var2 = this.b).m) != null && s60Var2.isShowing()) {
                    x60Var2.u();
                    break;
                }
                break;
        }
    }
}

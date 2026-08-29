package org.telegram.ui.Components;

import android.view.KeyEvent;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class y60 implements org.telegram.ui.ActionBar.m1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ j70 b;

    public /* synthetic */ y60(j70 j70Var, int i10) {
        this.a = i10;
        this.b = j70Var;
    }

    @Override // org.telegram.ui.ActionBar.m1
    public final void o(KeyEvent keyEvent) {
        j70 j70Var;
        e70 e70Var;
        j70 j70Var2;
        e70 e70Var2;
        switch (this.a) {
            case 0:
                if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (e70Var = (j70Var = this.b).m) != null && e70Var.isShowing()) {
                    j70Var.u();
                    break;
                }
                break;
            default:
                if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (e70Var2 = (j70Var2 = this.b).m) != null && e70Var2.isShowing()) {
                    j70Var2.u();
                    break;
                }
                break;
        }
    }
}

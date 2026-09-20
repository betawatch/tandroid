package org.telegram.ui.Components;

import android.view.KeyEvent;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public final /* synthetic */ class k70 implements org.telegram.ui.ActionBar.l1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ v70 b;

    public /* synthetic */ k70(v70 v70Var, int i10) {
        this.a = i10;
        this.b = v70Var;
    }

    @Override // org.telegram.ui.ActionBar.l1
    public final void o(KeyEvent keyEvent) {
        v70 v70Var;
        q70 q70Var;
        v70 v70Var2;
        q70 q70Var2;
        switch (this.a) {
            case 0:
                if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (q70Var = (v70Var = this.b).m) != null && q70Var.isShowing()) {
                    v70Var.u();
                    break;
                }
                break;
            default:
                if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (q70Var2 = (v70Var2 = this.b).m) != null && q70Var2.isShowing()) {
                    v70Var2.u();
                    break;
                }
                break;
        }
    }
}

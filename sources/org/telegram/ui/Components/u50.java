package org.telegram.ui.Components;

import android.view.KeyEvent;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class u50 implements org.telegram.ui.ActionBar.d1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ f60 b;

    public /* synthetic */ u50(f60 f60Var, int i3) {
        this.a = i3;
        this.b = f60Var;
    }

    @Override // org.telegram.ui.ActionBar.d1
    public final void k(KeyEvent keyEvent) {
        f60 f60Var;
        b60 b60Var;
        f60 f60Var2;
        b60 b60Var2;
        switch (this.a) {
            case 0:
                if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (b60Var = (f60Var = this.b).m) != null && b60Var.isShowing()) {
                    f60Var.u();
                    break;
                }
                break;
            default:
                if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (b60Var2 = (f60Var2 = this.b).m) != null && b60Var2.isShowing()) {
                    f60Var2.u();
                    break;
                }
                break;
        }
    }
}

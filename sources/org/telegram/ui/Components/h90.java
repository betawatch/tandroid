package org.telegram.ui.Components;

import android.view.KeyEvent;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
/* loaded from: classes3.dex */
public final /* synthetic */ class h90 implements org.telegram.ui.ActionBar.a2, org.telegram.ui.ActionBar.k1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ q90 b;

    public /* synthetic */ h90(q90 q90Var, int i10) {
        this.a = i10;
        this.b = q90Var;
    }

    @Override // org.telegram.ui.ActionBar.a2
    public void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.a) {
            case 0:
                p90 p90Var = this.b.r;
                if (p90Var != null) {
                    p90Var.k();
                    break;
                }
                break;
            default:
                p90 p90Var2 = this.b.r;
                if (p90Var2 != null) {
                    p90Var2.d();
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.k1
    public void n(KeyEvent keyEvent) {
        q90 q90Var = this.b;
        q90Var.getClass();
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && q90Var.s.isShowing()) {
            q90Var.s.d(true);
        }
    }
}

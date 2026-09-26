package org.telegram.ui.ActionBar;

import android.view.View;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final class e4 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ g4 b;

    public /* synthetic */ e4(g4 g4Var, int i10) {
        this.a = i10;
        this.b = g4Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                g4 g4Var = this.b;
                View view = g4Var.m;
                if (view.getWindowVisibility() == 0 && view.isShown()) {
                    f4 f4Var = g4Var.s;
                    f4Var.getClass();
                    System.currentTimeMillis();
                    f4Var.c = false;
                    g4Var.s.a();
                    break;
                }
                break;
            default:
                g4 g4Var2 = this.b;
                View view2 = g4Var2.m;
                if (view2.getWindowVisibility() == 0 && view2.isShown()) {
                    f4 f4Var2 = g4Var2.s;
                    f4Var2.b = false;
                    f4Var2.a();
                    break;
                }
                break;
        }
    }
}

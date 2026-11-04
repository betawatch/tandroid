package org.telegram.ui.ActionBar;

import android.view.View;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class s3 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ u3 b;

    public /* synthetic */ s3(u3 u3Var, int i3) {
        this.a = i3;
        this.b = u3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                u3 u3Var = this.b;
                View view = u3Var.m;
                if (view.getWindowVisibility() == 0 && view.isShown()) {
                    t3 t3Var = u3Var.s;
                    t3Var.getClass();
                    System.currentTimeMillis();
                    t3Var.c = false;
                    u3Var.s.a();
                    break;
                }
                break;
            default:
                u3 u3Var2 = this.b;
                View view2 = u3Var2.m;
                if (view2.getWindowVisibility() == 0 && view2.isShown()) {
                    t3 t3Var2 = u3Var2.s;
                    t3Var2.b = false;
                    t3Var2.a();
                    break;
                }
                break;
        }
    }
}

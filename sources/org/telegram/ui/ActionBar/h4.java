package org.telegram.ui.ActionBar;

import android.view.View;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class h4 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ j4 b;

    public /* synthetic */ h4(j4 j4Var, int i10) {
        this.a = i10;
        this.b = j4Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                j4 j4Var = this.b;
                View view = j4Var.m;
                if (view.getWindowVisibility() == 0 && view.isShown()) {
                    i4 i4Var = j4Var.s;
                    i4Var.getClass();
                    System.currentTimeMillis();
                    i4Var.c = false;
                    j4Var.s.a();
                    break;
                }
                break;
            default:
                j4 j4Var2 = this.b;
                View view2 = j4Var2.m;
                if (view2.getWindowVisibility() == 0 && view2.isShown()) {
                    i4 i4Var2 = j4Var2.s;
                    i4Var2.b = false;
                    i4Var2.a();
                    break;
                }
                break;
        }
    }
}

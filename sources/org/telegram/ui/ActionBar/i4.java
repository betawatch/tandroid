package org.telegram.ui.ActionBar;

import android.view.View;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class i4 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ k4 b;

    public /* synthetic */ i4(k4 k4Var, int i10) {
        this.a = i10;
        this.b = k4Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                k4 k4Var = this.b;
                View view = k4Var.m;
                if (view.getWindowVisibility() == 0 && view.isShown()) {
                    j4 j4Var = k4Var.s;
                    j4Var.getClass();
                    System.currentTimeMillis();
                    j4Var.c = false;
                    k4Var.s.a();
                    break;
                }
                break;
            default:
                k4 k4Var2 = this.b;
                View view2 = k4Var2.m;
                if (view2.getWindowVisibility() == 0 && view2.isShown()) {
                    j4 j4Var2 = k4Var2.s;
                    j4Var2.b = false;
                    j4Var2.a();
                    break;
                }
                break;
        }
    }
}

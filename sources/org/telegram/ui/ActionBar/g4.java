package org.telegram.ui.ActionBar;

import android.view.View;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class g4 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ i4 b;

    public /* synthetic */ g4(i4 i4Var, int i10) {
        this.a = i10;
        this.b = i4Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                i4 i4Var = this.b;
                View view = i4Var.m;
                if (view.getWindowVisibility() == 0 && view.isShown()) {
                    h4 h4Var = i4Var.s;
                    h4Var.getClass();
                    System.currentTimeMillis();
                    h4Var.c = false;
                    i4Var.s.a();
                    break;
                }
                break;
            default:
                i4 i4Var2 = this.b;
                View view2 = i4Var2.m;
                if (view2.getWindowVisibility() == 0 && view2.isShown()) {
                    h4 h4Var2 = i4Var2.s;
                    h4Var2.b = false;
                    h4Var2.a();
                    break;
                }
                break;
        }
    }
}

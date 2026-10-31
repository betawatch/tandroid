package org.telegram.ui.ActionBar;

import android.view.View;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class b4 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ d4 b;

    public /* synthetic */ b4(d4 d4Var, int i10) {
        this.a = i10;
        this.b = d4Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                d4 d4Var = this.b;
                View view = d4Var.m;
                if (view.getWindowVisibility() == 0 && view.isShown()) {
                    c4 c4Var = d4Var.s;
                    c4Var.getClass();
                    System.currentTimeMillis();
                    c4Var.c = false;
                    d4Var.s.a();
                    break;
                }
                break;
            default:
                d4 d4Var2 = this.b;
                View view2 = d4Var2.m;
                if (view2.getWindowVisibility() == 0 && view2.isShown()) {
                    c4 c4Var2 = d4Var2.s;
                    c4Var2.b = false;
                    c4Var2.a();
                    break;
                }
                break;
        }
    }
}

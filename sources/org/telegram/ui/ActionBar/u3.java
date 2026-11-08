package org.telegram.ui.ActionBar;

import android.view.View;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final class u3 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ w3 b;

    public /* synthetic */ u3(w3 w3Var, int i7) {
        this.a = i7;
        this.b = w3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                w3 w3Var = this.b;
                View view = w3Var.m;
                if (view.getWindowVisibility() == 0 && view.isShown()) {
                    v3 v3Var = w3Var.s;
                    v3Var.getClass();
                    System.currentTimeMillis();
                    v3Var.c = false;
                    w3Var.s.a();
                    break;
                }
                break;
            default:
                w3 w3Var2 = this.b;
                View view2 = w3Var2.m;
                if (view2.getWindowVisibility() == 0 && view2.isShown()) {
                    v3 v3Var2 = w3Var2.s;
                    v3Var2.b = false;
                    v3Var2.a();
                    break;
                }
                break;
        }
    }
}

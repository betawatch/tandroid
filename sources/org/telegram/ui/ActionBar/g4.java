package org.telegram.ui.ActionBar;

import android.view.View;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
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

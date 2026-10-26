package org.telegram.ui.ActionBar;

import android.view.View;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class k4 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ m4 b;

    public /* synthetic */ k4(m4 m4Var, int i10) {
        this.a = i10;
        this.b = m4Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                m4 m4Var = this.b;
                View view = m4Var.m;
                if (view.getWindowVisibility() == 0 && view.isShown()) {
                    l4 l4Var = m4Var.s;
                    l4Var.getClass();
                    System.currentTimeMillis();
                    l4Var.c = false;
                    m4Var.s.a();
                    break;
                }
                break;
            default:
                m4 m4Var2 = this.b;
                View view2 = m4Var2.m;
                if (view2.getWindowVisibility() == 0 && view2.isShown()) {
                    l4 l4Var2 = m4Var2.s;
                    l4Var2.b = false;
                    l4Var2.a();
                    break;
                }
                break;
        }
    }
}

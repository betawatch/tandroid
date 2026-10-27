package org.telegram.ui.ActionBar;

import android.view.View;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
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

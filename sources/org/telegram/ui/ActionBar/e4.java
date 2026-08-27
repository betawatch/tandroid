package org.telegram.ui.ActionBar;

import android.view.View;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
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

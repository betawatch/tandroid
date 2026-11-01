package org.telegram.ui.ActionBar;

import android.view.View;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
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

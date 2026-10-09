package org.telegram.ui.ActionBar;

import android.view.View;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class f4 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ h4 b;

    public /* synthetic */ f4(h4 h4Var, int i10) {
        this.a = i10;
        this.b = h4Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                h4 h4Var = this.b;
                View view = h4Var.m;
                if (view.getWindowVisibility() == 0 && view.isShown()) {
                    g4 g4Var = h4Var.s;
                    g4Var.getClass();
                    System.currentTimeMillis();
                    g4Var.c = false;
                    h4Var.s.a();
                    break;
                }
                break;
            default:
                h4 h4Var2 = this.b;
                View view2 = h4Var2.m;
                if (view2.getWindowVisibility() == 0 && view2.isShown()) {
                    g4 g4Var2 = h4Var2.s;
                    g4Var2.b = false;
                    g4Var2.a();
                    break;
                }
                break;
        }
    }
}

package org.telegram.ui.ActionBar;

import android.view.View;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class v3 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ x3 b;

    public /* synthetic */ v3(x3 x3Var, int i7) {
        this.a = i7;
        this.b = x3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                x3 x3Var = this.b;
                View view = x3Var.m;
                if (view.getWindowVisibility() == 0 && view.isShown()) {
                    w3 w3Var = x3Var.s;
                    w3Var.getClass();
                    System.currentTimeMillis();
                    w3Var.c = false;
                    x3Var.s.a();
                    break;
                }
                break;
            default:
                x3 x3Var2 = this.b;
                View view2 = x3Var2.m;
                if (view2.getWindowVisibility() == 0 && view2.isShown()) {
                    w3 w3Var2 = x3Var2.s;
                    w3Var2.b = false;
                    w3Var2.a();
                    break;
                }
                break;
        }
    }
}

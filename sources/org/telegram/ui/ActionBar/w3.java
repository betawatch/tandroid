package org.telegram.ui.ActionBar;

import android.view.View;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class w3 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ y3 b;

    public /* synthetic */ w3(y3 y3Var, int i7) {
        this.a = i7;
        this.b = y3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                y3 y3Var = this.b;
                View view = y3Var.m;
                if (view.getWindowVisibility() == 0 && view.isShown()) {
                    x3 x3Var = y3Var.s;
                    x3Var.getClass();
                    System.currentTimeMillis();
                    x3Var.c = false;
                    y3Var.s.a();
                    break;
                }
                break;
            default:
                y3 y3Var2 = this.b;
                View view2 = y3Var2.m;
                if (view2.getWindowVisibility() == 0 && view2.isShown()) {
                    x3 x3Var2 = y3Var2.s;
                    x3Var2.b = false;
                    x3Var2.a();
                    break;
                }
                break;
        }
    }
}

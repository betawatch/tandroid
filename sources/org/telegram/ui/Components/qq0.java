package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final /* synthetic */ class qq0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ xu0 b;

    public /* synthetic */ qq0(xu0 xu0Var, int i10) {
        this.a = i10;
        this.b = xu0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                xu0 xu0Var = this.b;
                js jsVar = xu0Var.P0;
                xu0Var.b2 = (int) jsVar.c(AndroidUtilities.dp(14.0f));
                nr0 nr0Var = xu0Var.V;
                if (nr0Var != null) {
                    nr0Var.setPaddingTop(AndroidUtilities.dp(48.0f) + ((int) jsVar.c(AndroidUtilities.dp(7.0f))));
                }
                qt0[] qt0VarArr = xu0Var.k0;
                if (qt0VarArr != null) {
                    for (qt0 qt0Var : qt0VarArr) {
                        if (qt0Var != null) {
                            int paddingTop = qt0Var.h.getPaddingTop();
                            wr0 wr0Var = qt0Var.h;
                            int paddingLeft = wr0Var.getPaddingLeft();
                            int Z = xu0Var.Z(qt0Var.F);
                            int paddingRight = qt0Var.h.getPaddingRight();
                            wr0 wr0Var2 = qt0Var.h;
                            int Y = xu0Var.Y(xu0Var.v0());
                            wr0Var2.e3 = Y;
                            wr0Var.setPadding(paddingLeft, Z, paddingRight, Y);
                            AndroidUtilities.doOnLayout(qt0Var.h, new m8(qt0Var, paddingTop - qt0Var.h.getPaddingTop(), 9));
                        }
                    }
                    break;
                }
                break;
            case 1:
                xu0 xu0Var2 = this.b;
                xu0Var2.b1(false);
                xu0Var2.G.h(true);
                xu0Var2.a1 = 0;
                break;
            default:
                this.b.k0();
                break;
        }
    }
}

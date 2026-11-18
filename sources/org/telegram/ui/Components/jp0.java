package org.telegram.ui.Components;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class jp0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ gt0 b;
    public final /* synthetic */ int c;

    public /* synthetic */ jp0(gt0 gt0Var, int i7, int i10) {
        this.a = i10;
        this.b = gt0Var;
        this.c = i7;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.s1(this.c);
                break;
            case 1:
                gt0 gt0Var = this.b;
                org.telegram.ui.ActionBar.h2 h2Var = gt0Var.y1;
                gt0Var.a1(this.c, gt0Var.m1, h2Var);
                break;
            case 2:
                this.b.r1(this.c, false);
                break;
            case 3:
                this.b.s1(this.c);
                break;
            default:
                gt0 gt0Var2 = this.b;
                org.telegram.ui.ActionBar.h2 h2Var2 = gt0Var2.y1;
                gt0Var2.b1(this.c, gt0Var2.m1, h2Var2);
                break;
        }
    }
}

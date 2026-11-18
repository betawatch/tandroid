package org.telegram.ui.Components;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
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

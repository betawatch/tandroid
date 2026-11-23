package org.telegram.ui.Components;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class lp0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ it0 b;
    public final /* synthetic */ int c;

    public /* synthetic */ lp0(it0 it0Var, int i7, int i10) {
        this.a = i10;
        this.b = it0Var;
        this.c = i7;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.s1(this.c);
                break;
            case 1:
                it0 it0Var = this.b;
                org.telegram.ui.ActionBar.g2 g2Var = it0Var.y1;
                it0Var.a1(this.c, it0Var.m1, g2Var);
                break;
            case 2:
                this.b.r1(this.c, false);
                break;
            case 3:
                this.b.s1(this.c);
                break;
            default:
                it0 it0Var2 = this.b;
                org.telegram.ui.ActionBar.g2 g2Var2 = it0Var2.y1;
                it0Var2.b1(this.c, it0Var2.m1, g2Var2);
                break;
        }
    }
}

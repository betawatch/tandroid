package org.telegram.ui.Components;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final /* synthetic */ class mp0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ jt0 b;
    public final /* synthetic */ int c;

    public /* synthetic */ mp0(jt0 jt0Var, int i7, int i10) {
        this.a = i10;
        this.b = jt0Var;
        this.c = i7;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.s1(this.c);
                break;
            case 1:
                jt0 jt0Var = this.b;
                org.telegram.ui.ActionBar.g2 g2Var = jt0Var.y1;
                jt0Var.a1(this.c, jt0Var.m1, g2Var);
                break;
            case 2:
                this.b.r1(this.c, false);
                break;
            case 3:
                this.b.s1(this.c);
                break;
            default:
                jt0 jt0Var2 = this.b;
                org.telegram.ui.ActionBar.g2 g2Var2 = jt0Var2.y1;
                jt0Var2.b1(this.c, jt0Var2.m1, g2Var2);
                break;
        }
    }
}

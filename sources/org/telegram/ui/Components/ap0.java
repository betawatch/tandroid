package org.telegram.ui.Components;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class ap0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ys0 b;
    public final /* synthetic */ int c;

    public /* synthetic */ ap0(ys0 ys0Var, int i7, int i10) {
        this.a = i10;
        this.b = ys0Var;
        this.c = i7;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.s1(this.c);
                break;
            case 1:
                ys0 ys0Var = this.b;
                ys0Var.a1(ys0Var.y1, ys0Var.m1, this.c);
                break;
            case 2:
                this.b.r1(this.c, false);
                break;
            case 3:
                this.b.s1(this.c);
                break;
            default:
                ys0 ys0Var2 = this.b;
                ys0Var2.b1(ys0Var2.y1, ys0Var2.m1, this.c);
                break;
        }
    }
}

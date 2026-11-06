package org.telegram.ui.Components;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final /* synthetic */ class wo0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ xs0 b;
    public final /* synthetic */ int c;

    public /* synthetic */ wo0(xs0 xs0Var, int i7, int i10) {
        this.a = i10;
        this.b = xs0Var;
        this.c = i7;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.q1(this.c);
                break;
            case 1:
                xs0 xs0Var = this.b;
                xs0Var.Y0(xs0Var.x1, xs0Var.l1, this.c);
                break;
            case 2:
                this.b.p1(this.c, false);
                break;
            case 3:
                this.b.q1(this.c);
                break;
            default:
                xs0 xs0Var2 = this.b;
                xs0Var2.Z0(xs0Var2.x1, xs0Var2.l1, this.c);
                break;
        }
    }
}

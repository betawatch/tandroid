package org.telegram.ui.Components;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class yo0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ws0 b;
    public final /* synthetic */ int c;

    public /* synthetic */ yo0(ws0 ws0Var, int i3, int i10) {
        this.a = i10;
        this.b = ws0Var;
        this.c = i3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.q1(this.c);
                break;
            case 1:
                ws0 ws0Var = this.b;
                ws0Var.Y0(ws0Var.y1, ws0Var.m1, this.c);
                break;
            case 2:
                this.b.p1(this.c, false);
                break;
            case 3:
                this.b.q1(this.c);
                break;
            default:
                ws0 ws0Var2 = this.b;
                ws0Var2.Z0(ws0Var2.y1, ws0Var2.m1, this.c);
                break;
        }
    }
}

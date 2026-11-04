package org.telegram.ui;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ax0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ cx0 b;
    public final /* synthetic */ int c;

    public /* synthetic */ ax0(cx0 cx0Var, int i3, int i10) {
        this.a = i10;
        this.b = cx0Var;
        this.c = i3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                cx0 cx0Var = this.b;
                org.telegram.ui.Components.m61 m61Var = cx0Var.b;
                bx0 bx0Var = cx0Var.d;
                int i3 = this.c;
                m61Var.d(i3, bx0Var.i(i3));
                break;
            default:
                cx0 cx0Var2 = this.b;
                org.telegram.ui.Components.m61 m61Var2 = cx0Var2.b;
                bx0 bx0Var2 = cx0Var2.d;
                int i10 = this.c;
                m61Var2.d(i10, bx0Var2.i(i10));
                break;
        }
    }
}

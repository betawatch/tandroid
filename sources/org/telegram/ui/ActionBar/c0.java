package org.telegram.ui.ActionBar;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class c0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ q0 b;
    public final /* synthetic */ int c;

    public /* synthetic */ c0(q0 q0Var, int i3, int i10) {
        this.a = i10;
        this.b = q0Var;
        this.c = i3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                q0 q0Var = this.b;
                if (q0Var.b.getSwipeBack() != null) {
                    q0Var.b.getSwipeBack().e(this.c);
                    break;
                }
                break;
            default:
                q0 q0Var2 = this.b;
                if (q0Var2.b.getSwipeBack() != null) {
                    q0Var2.b.getSwipeBack().e(this.c);
                    break;
                }
                break;
        }
    }
}

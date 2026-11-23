package org.telegram.ui.ActionBar;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class d0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ q0 b;
    public final /* synthetic */ int c;

    public /* synthetic */ d0(q0 q0Var, int i7, int i10) {
        this.a = i10;
        this.b = q0Var;
        this.c = i7;
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

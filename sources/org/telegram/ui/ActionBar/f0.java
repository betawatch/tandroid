package org.telegram.ui.ActionBar;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final /* synthetic */ class f0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ u0 b;
    public final /* synthetic */ int c;

    public /* synthetic */ f0(u0 u0Var, int i10, int i11) {
        this.a = i11;
        this.b = u0Var;
        this.c = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                u0 u0Var = this.b;
                if (u0Var.b.getSwipeBack() != null) {
                    u0Var.b.getSwipeBack().e(this.c);
                    break;
                }
                break;
            default:
                u0 u0Var2 = this.b;
                if (u0Var2.b.getSwipeBack() != null) {
                    u0Var2.b.getSwipeBack().e(this.c);
                    break;
                }
                break;
        }
    }
}

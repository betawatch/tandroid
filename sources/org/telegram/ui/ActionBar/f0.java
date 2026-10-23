package org.telegram.ui.ActionBar;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
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

package org.telegram.ui.ActionBar;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final /* synthetic */ class d0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ r0 b;
    public final /* synthetic */ int c;

    public /* synthetic */ d0(r0 r0Var, int i7, int i10) {
        this.a = i10;
        this.b = r0Var;
        this.c = i7;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                r0 r0Var = this.b;
                if (r0Var.b.getSwipeBack() != null) {
                    r0Var.b.getSwipeBack().e(this.c);
                    break;
                }
                break;
            default:
                r0 r0Var2 = this.b;
                if (r0Var2.b.getSwipeBack() != null) {
                    r0Var2.b.getSwipeBack().e(this.c);
                    break;
                }
                break;
        }
    }
}

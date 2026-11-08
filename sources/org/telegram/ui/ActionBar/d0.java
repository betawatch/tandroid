package org.telegram.ui.ActionBar;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
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

package org.telegram.ui.ActionBar;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final /* synthetic */ class g0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ w0 b;
    public final /* synthetic */ int c;

    public /* synthetic */ g0(w0 w0Var, int i10, int i11) {
        this.a = i11;
        this.b = w0Var;
        this.c = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                w0 w0Var = this.b;
                if (w0Var.b.getSwipeBack() != null) {
                    w0Var.b.getSwipeBack().e(this.c);
                    break;
                }
                break;
            default:
                w0 w0Var2 = this.b;
                if (w0Var2.b.getSwipeBack() != null) {
                    w0Var2.b.getSwipeBack().e(this.c);
                    break;
                }
                break;
        }
    }
}

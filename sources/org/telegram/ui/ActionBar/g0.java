package org.telegram.ui.ActionBar;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
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

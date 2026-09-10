package org.telegram.ui.ActionBar;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final /* synthetic */ class h0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ w0 b;
    public final /* synthetic */ int c;

    public /* synthetic */ h0(w0 w0Var, int i10, int i11) {
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

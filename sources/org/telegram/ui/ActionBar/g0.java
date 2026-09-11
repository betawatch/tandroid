package org.telegram.ui.ActionBar;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes3.dex */
public final /* synthetic */ class g0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ v0 b;
    public final /* synthetic */ int c;

    public /* synthetic */ g0(v0 v0Var, int i10, int i11) {
        this.a = i11;
        this.b = v0Var;
        this.c = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                v0 v0Var = this.b;
                if (v0Var.b.getSwipeBack() != null) {
                    v0Var.b.getSwipeBack().e(this.c);
                    break;
                }
                break;
            default:
                v0 v0Var2 = this.b;
                if (v0Var2.b.getSwipeBack() != null) {
                    v0Var2.b.getSwipeBack().e(this.c);
                    break;
                }
                break;
        }
    }
}

package org.telegram.ui.Wallet;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes4.dex */
public final /* synthetic */ class a6 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ c6 b;

    public /* synthetic */ a6(c6 c6Var, int i7) {
        this.a = i7;
        this.b = c6Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.performClick();
                break;
            default:
                c6 c6Var = this.b;
                c6Var.h.invalidate();
                c6Var.n.invalidate();
                c6Var.e.invalidate();
                break;
        }
    }
}

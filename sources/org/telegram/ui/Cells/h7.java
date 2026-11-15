package org.telegram.ui.Cells;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class h7 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ j7 b;

    public /* synthetic */ h7(j7 j7Var, int i7) {
        this.a = i7;
        this.b = j7Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                j7 j7Var = this.b;
                j7Var.post(new h7(j7Var, 1));
                break;
            default:
                j7 j7Var2 = this.b;
                j7Var2.c0.N0 = true;
                j7Var2.I.clear();
                j7Var2.J.clear();
                j7Var2.K.clear();
                j7Var2.invalidate();
                break;
        }
    }
}

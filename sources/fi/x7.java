package fi;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final /* synthetic */ class x7 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ y7 b;

    public /* synthetic */ x7(y7 y7Var, int i7) {
        this.a = i7;
        this.b = y7Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                z7 z7Var = this.b.v;
                z7Var.s = 0;
                z7Var.requestLayout();
                a8 a8Var = z7Var.K;
                a8Var.L(a8Var.getWidth(), a8Var.getHeight());
                a8Var.requestLayout();
                break;
            case 1:
                z7 z7Var2 = this.b.v;
                z7Var2.s = 0;
                z7Var2.requestLayout();
                a8 a8Var2 = z7Var2.K;
                a8Var2.L(a8Var2.getWidth(), a8Var2.getHeight());
                a8Var2.requestLayout();
                break;
            case 2:
                y7 y7Var = this.b;
                y7Var.v.post(new x7(y7Var, 3));
                break;
            default:
                this.b.v.y = true;
                break;
        }
    }
}

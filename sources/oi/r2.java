package oi;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes4.dex */
public final /* synthetic */ class r2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ e1 b;
    public final /* synthetic */ int c;

    public /* synthetic */ r2(e1 e1Var, int i7, int i10) {
        this.a = i10;
        this.b = e1Var;
        this.c = i7;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                e1 e1Var = this.b;
                e1Var.O();
                e1Var.setSelection(Math.max(0, Math.min(this.c, e1Var.length())));
                break;
            case 1:
                e1 e1Var2 = this.b;
                e1Var2.O();
                e1Var2.setSelection(Math.max(0, Math.min(this.c, e1Var2.length())));
                break;
            case 2:
                e1 e1Var3 = this.b;
                e1Var3.O();
                e1Var3.setSelection(Math.max(0, Math.min(this.c, e1Var3.length())));
                break;
            case 3:
                e1 e1Var4 = this.b;
                e1Var4.O();
                e1Var4.setSelection(Math.min(this.c, e1Var4.length()));
                break;
            default:
                e1 e1Var5 = this.b;
                e1Var5.O();
                e1Var5.setSelection(Math.max(0, Math.min(this.c, e1Var5.length())));
                break;
        }
    }
}

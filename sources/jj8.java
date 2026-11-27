// default package

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final /* synthetic */ class jj8 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ mj8 b;

    public /* synthetic */ jj8(mj8 mj8Var, byte b) {
        this.a = b;
        this.b = mj8Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        mj8 mj8Var = this.b;
        switch (b) {
            case 0:
                mj8Var.a(true);
                break;
            default:
                mj8Var.d();
                break;
        }
    }
}

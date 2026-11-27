// default package

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes3.dex */
public final /* synthetic */ class mh9 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ pi9 b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;

    public /* synthetic */ mh9(pi9 pi9Var, int i, int i2, byte b) {
        this.a = b;
        this.b = pi9Var;
        this.c = i;
        this.d = i2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.V1(this.c, this.d);
                break;
            default:
                this.b.h4(this.c, this.d);
                break;
        }
    }
}

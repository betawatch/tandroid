// default package

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
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

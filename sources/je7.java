// default package

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final /* synthetic */ class je7 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;

    public /* synthetic */ je7(Object obj, int i, int i2, int i3, int i4, byte b) {
        this.a = b;
        this.f = obj;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = i4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        int i = this.e;
        int i2 = this.d;
        int i3 = this.c;
        int i4 = this.b;
        Object obj = this.f;
        switch (b) {
            case 0:
                ((kf7) obj).C1(i4, i3, i2, i);
                break;
            default:
                bnb bnbVar = (bnb) obj;
                bnbVar.J = null;
                bnbVar.h = i4;
                bnbVar.n = i3;
                bnbVar.e = i2;
                bnbVar.f = i;
                bnbVar.g();
                bnbVar.requestLayout();
                break;
        }
    }
}

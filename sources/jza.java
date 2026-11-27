// default package

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final /* synthetic */ class jza implements Runnable {
    public final /* synthetic */ long a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ boolean d;

    public /* synthetic */ jza(int i, int i2, long j, boolean z) {
        this.a = j;
        this.b = i;
        this.c = i2;
        this.d = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        long j = this.a;
        int i = this.b;
        int i2 = this.c;
        if (j != 0) {
            kt0.g(i).p(i2, j);
        } else {
            jxa.v(i, this.d).W(i2);
        }
    }
}

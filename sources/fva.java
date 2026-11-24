// default package

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class fva implements Runnable {
    public final /* synthetic */ long a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ boolean d;

    public /* synthetic */ fva(int i, int i2, long j, boolean z) {
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
            ct0.g(i).p(i2, j);
        } else {
            gta.v(i, this.d).V(i2);
        }
    }
}

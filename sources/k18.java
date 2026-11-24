// default package

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes3.dex */
public final /* synthetic */ class k18 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Runnable b;
    public final /* synthetic */ long c;

    public /* synthetic */ k18(Runnable runnable, long j, byte b) {
        this.a = b;
        this.b = runnable;
        this.c = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                Runnable runnable = this.b;
                gl.r(runnable);
                gl.d3(runnable, Math.max(0L, 32 - (System.currentTimeMillis() - this.c)));
                break;
            case 1:
                Runnable runnable2 = this.b;
                gl.r(runnable2);
                gl.d3(runnable2, Math.max(0L, 32 - (System.currentTimeMillis() - this.c)));
                break;
            default:
                Runnable runnable3 = this.b;
                gl.r(runnable3);
                gl.d3(runnable3, Math.max(0L, 32 - (System.currentTimeMillis() - this.c)));
                break;
        }
    }
}

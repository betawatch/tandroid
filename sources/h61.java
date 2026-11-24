// default package

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class h61 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ boolean[] b;
    public final /* synthetic */ st c;
    public final /* synthetic */ long[] d;
    public final /* synthetic */ i61 e;

    public /* synthetic */ h61(boolean[] zArr, st stVar, long[] jArr, i61 i61Var, byte b) {
        this.a = b;
        this.b = zArr;
        this.c = stVar;
        this.d = jArr;
        this.e = i61Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                gl.c3(new h61(this.b, this.c, this.d, this.e, (byte) 1));
                break;
            default:
                this.b[0] = true;
                this.c.e(1.0f);
                long[] jArr = this.d;
                long j = jArr[0];
                i61 i61Var = this.e;
                if (j <= 0) {
                    i61Var.dismiss();
                    break;
                } else {
                    gl.d3(new nv0(i61Var, (byte) 11), Math.max(0L, 1000 - (System.currentTimeMillis() - jArr[0])));
                    break;
                }
        }
    }
}

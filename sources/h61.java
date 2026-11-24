// default package

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
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
                gl.d3(new h61(this.b, this.c, this.d, this.e, (byte) 1));
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
                    gl.e3(new nv0(i61Var, (byte) 11), Math.max(0L, 1000 - (System.currentTimeMillis() - jArr[0])));
                    break;
                }
        }
    }
}

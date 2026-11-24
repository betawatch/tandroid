// default package

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes3.dex */
public final class mj4 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ sj4 b;

    public /* synthetic */ mj4(sj4 sj4Var, byte b) {
        this.a = b;
        this.b = sj4Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        sj4 sj4Var = this.b;
        switch (b) {
            case 0:
                sj4Var.q();
                if (sj4Var.b.j()) {
                    gl.e3(this, 500L);
                    break;
                }
                break;
            default:
                if (!sj4Var.b.a0()) {
                    sj4Var.u = false;
                    sj4Var.o(false);
                    sj4Var.w = false;
                    break;
                } else {
                    gl.e3(this, 1500L);
                    break;
                }
        }
    }
}

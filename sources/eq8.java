// default package

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final /* synthetic */ class eq8 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ pq8 b;

    public /* synthetic */ eq8(pq8 pq8Var, byte b) {
        this.a = b;
        this.b = pq8Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        pq8 pq8Var = this.b;
        switch (b) {
            case 0:
                pq8Var.b();
                break;
            case 1:
                pq8Var.c();
                break;
            case 2:
                pq8Var.f(false);
                break;
            default:
                pq8Var.d();
                break;
        }
    }
}

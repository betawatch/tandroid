package ki;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes4.dex */
public final /* synthetic */ class z implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ q0 b;
    public final /* synthetic */ Exception c;

    public /* synthetic */ z(q0 q0Var, Exception exc, int i10) {
        this.a = i10;
        this.b = q0Var;
        this.c = exc;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.g(this.c);
                break;
            case 1:
                this.b.g(this.c);
                break;
            case 2:
                this.b.g(this.c);
                break;
            default:
                this.b.g(this.c);
                break;
        }
    }
}

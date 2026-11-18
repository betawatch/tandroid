package ki;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes4.dex */
public final /* synthetic */ class b4 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ c4 b;

    public /* synthetic */ b4(c4 c4Var, int i7) {
        this.a = i7;
        this.b = c4Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                c4 c4Var = this.b;
                if (c4Var.x) {
                    c4Var.d();
                    break;
                }
                break;
            default:
                this.b.invalidateSelf();
                break;
        }
    }
}

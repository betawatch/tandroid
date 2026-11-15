package bi;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class u0 implements r1.d {
    public final /* synthetic */ int a;
    public final /* synthetic */ x0 b;

    public /* synthetic */ u0(x0 x0Var, int i7) {
        this.a = i7;
        this.b = x0Var;
    }

    @Override // r1.d
    public final void a(r1.g gVar, float f10, float f11) {
        switch (this.a) {
            case 0:
                this.b.b(f10 / 1000.0f);
                break;
            default:
                this.b.b(Math.max(0.0f, f10 / 1000.0f));
                break;
        }
    }
}

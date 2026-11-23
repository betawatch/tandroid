package bi;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final /* synthetic */ class w0 implements r1.d {
    public final /* synthetic */ int a;
    public final /* synthetic */ b1 b;

    public /* synthetic */ w0(b1 b1Var, int i7) {
        this.a = i7;
        this.b = b1Var;
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

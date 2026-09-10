package og;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final /* synthetic */ class s0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ v0 b;
    public final /* synthetic */ a5.a c;

    public /* synthetic */ s0(v0 v0Var, a5.a aVar, int i10) {
        this.a = i10;
        this.b = v0Var;
        this.c = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.p(this.c, true);
                break;
            default:
                v0 v0Var = this.b;
                v0Var.f.f(new s0(v0Var, this.c, 0));
                break;
        }
    }
}

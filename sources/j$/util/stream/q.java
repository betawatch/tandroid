package j$.util.stream;

/* loaded from: classes2.dex */
public final /* synthetic */ class q implements j$.util.function.m {
    public final /* synthetic */ int a;
    public final /* synthetic */ e2 b;

    public /* synthetic */ q(int i, e2 e2Var) {
        this.a = i;
        this.b = e2Var;
    }

    @Override // j$.util.function.m
    public final void accept(double d) {
        switch (this.a) {
            case 0:
                this.b.accept(d);
                break;
            default:
                ((t) this.b).a.accept(d);
                break;
        }
    }

    @Override // j$.util.function.m
    public final /* synthetic */ j$.util.function.m k(j$.util.function.m mVar) {
        switch (this.a) {
        }
        return j$.com.android.tools.r8.a.b(this, mVar);
    }
}

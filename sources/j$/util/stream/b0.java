package j$.util.stream;

/* loaded from: classes2.dex */
public final /* synthetic */ class b0 implements j$.util.function.Y {
    public final /* synthetic */ int a;
    public final /* synthetic */ d2 b;

    public /* synthetic */ b0(int i, d2 d2Var) {
        this.a = i;
        this.b = d2Var;
    }

    @Override // j$.util.function.Y
    public final /* synthetic */ j$.util.function.Y f(j$.util.function.Y y) {
        switch (this.a) {
        }
        return j$.com.android.tools.r8.a.c(this, y);
    }

    @Override // j$.util.function.Y
    public final void accept(long j) {
        switch (this.a) {
            case 0:
                this.b.accept(j);
                break;
            default:
                ((e0) this.b).a.accept(j);
                break;
        }
    }
}

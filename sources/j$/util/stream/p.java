package j$.util.stream;

/* loaded from: classes2.dex */
public final /* synthetic */ class p implements j$.util.function.l {
    public final /* synthetic */ int a;
    public final /* synthetic */ d2 b;

    public /* synthetic */ p(int i, d2 d2Var) {
        this.a = i;
        this.b = d2Var;
    }

    @Override // j$.util.function.l
    public final /* synthetic */ j$.util.function.l k(j$.util.function.l lVar) {
        switch (this.a) {
        }
        return j$.com.android.tools.r8.a.a(this, lVar);
    }

    @Override // j$.util.function.l
    public final void accept(double d) {
        switch (this.a) {
            case 0:
                this.b.accept(d);
                break;
            default:
                ((s) this.b).a.accept(d);
                break;
        }
    }
}

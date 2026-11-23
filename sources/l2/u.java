package l2;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes.dex */
public final /* synthetic */ class u implements h2.o {
    public final /* synthetic */ int a;
    public final /* synthetic */ f0 b;

    public /* synthetic */ u(f0 f0Var, int i7) {
        this.a = i7;
        this.b = f0Var;
    }

    @Override // h2.o
    public void invoke(Object obj) {
        e2.a1 a1Var = (e2.a1) obj;
        switch (this.a) {
            case 2:
                a1Var.O(this.b.P);
                break;
            default:
                a1Var.n(this.b.R);
                break;
        }
    }
}

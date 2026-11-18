package l2;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
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

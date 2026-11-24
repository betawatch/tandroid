// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class m65 extends yp {
    public final /* synthetic */ g95 c;

    public m65(g95 g95Var) {
        this.c = g95Var;
    }

    @Override // yp
    public final int i(int i) {
        int size = this.c.g4.e.size();
        if (size <= 1 || size == 2) {
            return 6;
        }
        return (size != 3 || i == 0 || i == 1) ? 3 : 6;
    }
}

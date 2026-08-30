package g5;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public final class u implements l {
    public v0 b;
    public String c;
    public boolean f;
    public final f7.b a = new f7.b(5, (byte) 0);
    public final int d = 8000;
    public final int e = 8000;

    @Override // g5.l
    public final m createDataSource() {
        x xVar = new x(this.c, this.d, this.e, this.f, this.a);
        v0 v0Var = this.b;
        if (v0Var != null) {
            xVar.addTransferListener(v0Var);
        }
        return xVar;
    }
}

package g2;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes.dex */
public final class o implements g {
    public c0 b;
    public String c;
    public boolean f;
    public final n4.y a = new n4.y(15);
    public final int d = 8000;
    public final int e = 8000;

    @Override // g2.g
    public final h createDataSource() {
        r rVar = new r(this.c, this.d, this.e, this.f, this.a);
        c0 c0Var = this.b;
        if (c0Var != null) {
            rVar.addTransferListener(c0Var);
        }
        return rVar;
    }
}

package j2;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes.dex */
public final class p implements g {
    public d0 b;
    public String c;
    public boolean f;
    public final wf.b a = new wf.b(24);
    public final int d = 8000;
    public final int e = 8000;

    @Override // j2.g
    public final h createDataSource() {
        s sVar = new s(this.c, this.d, this.e, this.f, this.a);
        d0 d0Var = this.b;
        if (d0Var != null) {
            sVar.addTransferListener(d0Var);
        }
        return sVar;
    }
}

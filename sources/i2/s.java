package i2;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes.dex */
public final /* synthetic */ class s implements e2.o, e2.j {
    public final /* synthetic */ b2.s0 a;

    public /* synthetic */ s(b2.s0 s0Var) {
        this.a = s0Var;
    }

    @Override // e2.j
    public void accept(Object obj) {
        ((m4.n1) obj).B(this.a);
    }

    @Override // e2.o
    public void invoke(Object obj) {
        ((b2.e1) obj).onMediaMetadataChanged(this.a);
    }
}

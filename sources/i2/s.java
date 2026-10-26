package i2;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
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

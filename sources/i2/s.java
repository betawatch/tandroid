package i2;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
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

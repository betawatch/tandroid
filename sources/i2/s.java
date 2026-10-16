package i2;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes.dex */
public final /* synthetic */ class s implements e2.o, e2.j {
    public final /* synthetic */ b2.s0 a;

    public /* synthetic */ s(b2.s0 s0Var) {
        this.a = s0Var;
    }

    @Override // e2.j
    public void accept(Object obj) {
        ((m4.m1) obj).B(this.a);
    }

    @Override // e2.o
    public void invoke(Object obj) {
        ((b2.e1) obj).onMediaMetadataChanged(this.a);
    }
}

package i2;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes.dex */
public final /* synthetic */ class s implements e2.o, e2.j {
    public final /* synthetic */ b2.r0 a;

    public /* synthetic */ s(b2.r0 r0Var) {
        this.a = r0Var;
    }

    @Override // e2.j
    public void accept(Object obj) {
        ((m4.m1) obj).B(this.a);
    }

    @Override // e2.o
    public void invoke(Object obj) {
        ((b2.d1) obj).onMediaMetadataChanged(this.a);
    }
}

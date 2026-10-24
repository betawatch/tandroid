package i2;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
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

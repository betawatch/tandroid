package i2;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes.dex */
public final /* synthetic */ class t implements e2.o, e2.j {
    public final /* synthetic */ b2.r0 a;

    public /* synthetic */ t(b2.r0 r0Var) {
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

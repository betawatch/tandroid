package j$.util.stream;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes4.dex */
public final class w4 extends x4 {
    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        this.b++;
    }

    @Override // j$.util.stream.s4, java.util.function.Supplier
    public final Object get() {
        return Long.valueOf(this.b);
    }

    @Override // j$.util.stream.r4
    public final void w(r4 r4Var) {
        this.b += ((x4) r4Var).b;
    }
}

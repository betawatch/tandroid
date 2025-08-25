package j$.util.stream;

/* loaded from: classes2.dex */
final class X1 extends Y1 {
    @Override // j$.util.stream.T1, java.util.function.Supplier
    public final Object get() {
        return Long.valueOf(this.b);
    }

    @Override // j$.util.stream.S1
    public final void g(S1 s1) {
        this.b += ((Y1) s1).b;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        this.b++;
    }
}

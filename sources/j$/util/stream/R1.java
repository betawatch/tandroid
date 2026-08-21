package j$.util.stream;

/* loaded from: classes2.dex */
public final class R1 extends S1 {
    @Override // j$.util.stream.N1, java.util.function.Supplier
    public final Object get() {
        return Long.valueOf(this.b);
    }

    @Override // j$.util.stream.M1
    public final void n(M1 m1) {
        this.b += ((S1) m1).b;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        this.b++;
    }
}

package j$.util.stream;

/* loaded from: classes2.dex */
public final class Q1 extends R1 {
    @Override // j$.util.stream.M1, java.util.function.Supplier
    public final Object get() {
        return Long.valueOf(this.b);
    }

    @Override // j$.util.stream.L1
    public final void n(L1 l1) {
        this.b += ((R1) l1).b;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        this.b++;
    }
}

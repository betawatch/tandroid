package j$.util.stream;

/* loaded from: classes2.dex */
public final class t4 extends u4 {
    @Override // j$.util.stream.p4, java.util.function.Supplier
    public final Object get() {
        return Long.valueOf(this.b);
    }

    @Override // j$.util.stream.o4
    public final void u(o4 o4Var) {
        this.b += ((u4) o4Var).b;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        this.b++;
    }
}

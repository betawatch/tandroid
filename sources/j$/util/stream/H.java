package j$.util.stream;

/* loaded from: classes2.dex */
final class H extends J implements c2 {
    @Override // j$.util.function.Y
    public final /* synthetic */ j$.util.function.Y f(j$.util.function.Y y) {
        return j$.com.android.tools.r8.a.c(this, y);
    }

    @Override // j$.util.stream.J, j$.util.stream.d2
    public final void accept(long j) {
        r(Long.valueOf(j));
    }

    @Override // j$.util.function.Supplier
    public final Object get() {
        if (this.a) {
            return j$.util.l.d(((Long) this.b).longValue());
        }
        return null;
    }
}

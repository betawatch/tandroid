package j$.util.stream;

/* loaded from: classes2.dex */
final class I extends K implements d2 {
    I() {
    }

    @Override // j$.util.stream.K, j$.util.stream.e2
    public final void accept(long j) {
        r(Long.valueOf(j));
    }

    @Override // j$.util.function.T
    public final /* synthetic */ j$.util.function.T f(j$.util.function.T t) {
        return j$.com.android.tools.r8.a.d(this, t);
    }

    @Override // j$.util.function.Supplier
    public final Object get() {
        if (this.a) {
            return j$.util.l.d(((Long) this.b).longValue());
        }
        return null;
    }
}

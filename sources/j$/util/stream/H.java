package j$.util.stream;

/* loaded from: classes2.dex */
final class H extends K implements c2 {
    H() {
    }

    @Override // j$.util.stream.K, j$.util.stream.e2
    public final void accept(int i) {
        r(Integer.valueOf(i));
    }

    @Override // j$.util.function.Supplier
    public final Object get() {
        if (this.a) {
            return j$.util.k.d(((Integer) this.b).intValue());
        }
        return null;
    }

    @Override // j$.util.function.E
    public final /* synthetic */ j$.util.function.E l(j$.util.function.E e) {
        return j$.com.android.tools.r8.a.c(this, e);
    }
}

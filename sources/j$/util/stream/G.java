package j$.util.stream;

/* loaded from: classes2.dex */
final class G extends K implements b2 {
    G() {
    }

    @Override // j$.util.stream.K, j$.util.stream.e2, j$.util.function.m
    public final void accept(double d) {
        r(Double.valueOf(d));
    }

    @Override // j$.util.function.Supplier
    public final Object get() {
        if (this.a) {
            return j$.util.j.d(((Double) this.b).doubleValue());
        }
        return null;
    }

    @Override // j$.util.function.m
    public final /* synthetic */ j$.util.function.m k(j$.util.function.m mVar) {
        return j$.com.android.tools.r8.a.b(this, mVar);
    }
}

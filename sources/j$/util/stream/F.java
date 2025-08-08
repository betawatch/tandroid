package j$.util.stream;

/* loaded from: classes2.dex */
final class F extends J implements a2 {
    @Override // j$.util.function.l
    public final /* synthetic */ j$.util.function.l k(j$.util.function.l lVar) {
        return j$.com.android.tools.r8.a.a(this, lVar);
    }

    @Override // j$.util.stream.J, j$.util.stream.d2, j$.util.function.l
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
}

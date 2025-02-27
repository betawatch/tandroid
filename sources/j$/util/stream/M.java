package j$.util.stream;

/* loaded from: classes2.dex */
final class M extends Q implements b2 {
    final j$.util.function.m b;

    M(j$.util.function.m mVar, boolean z) {
        super(z);
        this.b = mVar;
    }

    @Override // j$.util.stream.Q, j$.util.stream.e2, j$.util.function.m
    public final void accept(double d) {
        this.b.accept(d);
    }

    @Override // j$.util.function.Consumer
    /* renamed from: accept */
    public final /* bridge */ /* synthetic */ void r(Object obj) {
        r((Double) obj);
    }

    @Override // j$.util.function.m
    public final /* synthetic */ j$.util.function.m k(j$.util.function.m mVar) {
        return j$.com.android.tools.r8.a.b(this, mVar);
    }

    @Override // j$.util.stream.b2
    public final /* synthetic */ void r(Double d) {
        t0.e(this, d);
    }
}

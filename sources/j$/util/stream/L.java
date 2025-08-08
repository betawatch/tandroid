package j$.util.stream;

/* loaded from: classes2.dex */
final class L extends P implements a2 {
    final j$.util.function.l b;

    @Override // j$.util.function.Consumer
    /* renamed from: accept */
    public final /* bridge */ /* synthetic */ void r(Object obj) {
        r((Double) obj);
    }

    @Override // j$.util.function.l
    public final /* synthetic */ j$.util.function.l k(j$.util.function.l lVar) {
        return j$.com.android.tools.r8.a.a(this, lVar);
    }

    @Override // j$.util.stream.a2
    public final /* synthetic */ void r(Double d) {
        t0.e(this, d);
    }

    L(j$.util.function.l lVar, boolean z) {
        super(z);
        this.b = lVar;
    }

    @Override // j$.util.stream.P, j$.util.stream.d2, j$.util.function.l
    public final void accept(double d) {
        this.b.accept(d);
    }
}

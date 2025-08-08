package j$.util.stream;

/* loaded from: classes2.dex */
final class N extends P implements c2 {
    final j$.util.function.Y b;

    @Override // j$.util.function.Consumer
    /* renamed from: accept */
    public final /* bridge */ /* synthetic */ void r(Object obj) {
        j((Long) obj);
    }

    @Override // j$.util.function.Y
    public final /* synthetic */ j$.util.function.Y f(j$.util.function.Y y) {
        return j$.com.android.tools.r8.a.c(this, y);
    }

    @Override // j$.util.stream.c2
    public final /* synthetic */ void j(Long l) {
        t0.i(this, l);
    }

    N(j$.util.function.Y y, boolean z) {
        super(z);
        this.b = y;
    }

    @Override // j$.util.stream.P, j$.util.stream.d2
    public final void accept(long j) {
        this.b.accept(j);
    }
}

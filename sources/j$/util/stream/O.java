package j$.util.stream;

/* loaded from: classes2.dex */
final class O extends Q implements d2 {
    final j$.util.function.T b;

    O(j$.util.function.T t, boolean z) {
        super(z);
        this.b = t;
    }

    @Override // j$.util.stream.Q, j$.util.stream.e2
    public final void accept(long j) {
        this.b.accept(j);
    }

    @Override // j$.util.function.Consumer
    /* renamed from: accept */
    public final /* bridge */ /* synthetic */ void r(Object obj) {
        j((Long) obj);
    }

    @Override // j$.util.function.T
    public final /* synthetic */ j$.util.function.T f(j$.util.function.T t) {
        return j$.com.android.tools.r8.a.d(this, t);
    }

    @Override // j$.util.stream.d2
    public final /* synthetic */ void j(Long l) {
        t0.i(this, l);
    }
}

package j$.util.stream;

/* loaded from: classes2.dex */
final class M extends P implements b2 {
    final j$.util.function.G b;

    @Override // j$.util.function.Consumer
    /* renamed from: accept */
    public final /* bridge */ /* synthetic */ void r(Object obj) {
        o((Integer) obj);
    }

    @Override // j$.util.function.G
    public final /* synthetic */ j$.util.function.G l(j$.util.function.G g) {
        return j$.com.android.tools.r8.a.b(this, g);
    }

    @Override // j$.util.stream.b2
    public final /* synthetic */ void o(Integer num) {
        t0.g(this, num);
    }

    M(j$.util.function.G g, boolean z) {
        super(z);
        this.b = g;
    }

    @Override // j$.util.stream.P, j$.util.stream.d2
    public final void accept(int i) {
        this.b.accept(i);
    }
}

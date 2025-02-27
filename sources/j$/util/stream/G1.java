package j$.util.stream;

/* loaded from: classes2.dex */
final class G1 extends t0 {
    final /* synthetic */ j$.util.function.A h;
    final /* synthetic */ int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    G1(S2 s2, j$.util.function.A a, int i) {
        super(s2);
        this.h = a;
        this.i = i;
    }

    @Override // j$.util.stream.t0
    public final N1 d0() {
        return new H1(this.i, this.h);
    }
}

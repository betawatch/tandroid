package j$.util.stream;

/* loaded from: classes2.dex */
final class H1 extends u0 {
    final /* synthetic */ j$.util.function.A h;
    final /* synthetic */ int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    H1(S2 s2, j$.util.function.A a, int i) {
        super(s2);
        this.h = a;
        this.i = i;
    }

    @Override // j$.util.stream.u0
    public final O1 d0() {
        return new I1(this.i, this.h);
    }
}

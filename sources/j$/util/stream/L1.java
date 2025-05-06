package j$.util.stream;

/* loaded from: classes2.dex */
final class L1 extends u0 {
    final /* synthetic */ j$.util.function.O h;
    final /* synthetic */ long i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    L1(S2 s2, j$.util.function.O o, long j) {
        super(s2);
        this.h = o;
        this.i = j;
    }

    @Override // j$.util.stream.u0
    public final O1 d0() {
        return new M1(this.i, this.h);
    }
}

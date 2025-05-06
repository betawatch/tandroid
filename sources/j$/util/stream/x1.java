package j$.util.stream;

/* loaded from: classes2.dex */
final class x1 extends u0 {
    final /* synthetic */ j$.util.function.i h;
    final /* synthetic */ double i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    x1(S2 s2, j$.util.function.i iVar, double d) {
        super(s2);
        this.h = iVar;
        this.i = d;
    }

    @Override // j$.util.stream.u0
    public final O1 d0() {
        return new y1(this.i, this.h);
    }
}

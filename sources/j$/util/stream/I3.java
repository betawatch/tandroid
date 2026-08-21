package j$.util.stream;

import java.util.function.LongPredicate;

/* loaded from: classes2.dex */
public final class I3 extends b2 implements P3 {
    public final /* synthetic */ J3 b;

    @Override // j$.util.stream.P3
    public final long m() {
        return 0L;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public I3(J3 j3, g2 g2Var, boolean z) {
        super(g2Var);
        this.b = j3;
    }

    @Override // j$.util.stream.f2, j$.util.stream.g2
    public final void accept(long j) {
        this.b.getClass();
        LongPredicate longPredicate = null;
        longPredicate.test(j);
        throw null;
    }
}

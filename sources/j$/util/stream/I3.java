package j$.util.stream;

import java.util.function.LongPredicate;

/* loaded from: classes2.dex */
public final class I3 extends a2 implements P3 {
    public final /* synthetic */ J3 b;

    @Override // j$.util.stream.P3
    public final long m() {
        return 0L;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public I3(J3 j3, f2 f2Var, boolean z) {
        super(f2Var);
        this.b = j3;
    }

    @Override // j$.util.stream.e2, j$.util.stream.f2
    public final void accept(long j) {
        this.b.getClass();
        LongPredicate longPredicate = null;
        longPredicate.test(j);
        throw null;
    }
}

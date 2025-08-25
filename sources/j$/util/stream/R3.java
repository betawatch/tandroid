package j$.util.stream;

import java.util.function.LongPredicate;

/* loaded from: classes2.dex */
final class R3 extends h2 {
    boolean b;
    final /* synthetic */ S3 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    R3(S3 s3, m2 m2Var) {
        super(m2Var);
        this.c = s3;
        this.b = true;
    }

    @Override // j$.util.stream.h2, j$.util.stream.m2
    public final void l(long j) {
        this.a.l(-1L);
    }

    @Override // j$.util.stream.l2, j$.util.stream.m2
    public final void accept(long j) {
        if (this.b) {
            this.c.getClass();
            LongPredicate longPredicate = null;
            longPredicate.test(j);
            throw null;
        }
    }

    @Override // j$.util.stream.h2, j$.util.stream.m2
    public final boolean n() {
        return !this.b || this.a.n();
    }
}

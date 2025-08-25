package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.LongConsumer;

/* loaded from: classes2.dex */
final class s1 extends u1 implements l2 {
    private final long[] h;

    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final /* bridge */ /* synthetic */ void p(Object obj) {
        j((Long) obj);
    }

    public final /* synthetic */ LongConsumer andThen(LongConsumer longConsumer) {
        return j$.com.android.tools.r8.a.c(this, longConsumer);
    }

    @Override // j$.util.stream.l2
    public final /* synthetic */ void j(Long l) {
        w0.i(this, l);
    }

    s1(Spliterator spliterator, b bVar, long[] jArr) {
        super(spliterator, bVar, jArr.length);
        this.h = jArr;
    }

    s1(s1 s1Var, Spliterator spliterator, long j, long j2) {
        super(s1Var, spliterator, j, j2, s1Var.h.length);
        this.h = s1Var.h;
    }

    @Override // j$.util.stream.u1
    final u1 b(Spliterator spliterator, long j, long j2) {
        return new s1(this, spliterator, j, j2);
    }

    @Override // j$.util.stream.u1, j$.util.stream.m2
    public final void accept(long j) {
        int i = this.f;
        if (i >= this.g) {
            throw new IndexOutOfBoundsException(Integer.toString(this.f));
        }
        long[] jArr = this.h;
        this.f = i + 1;
        jArr[i] = j;
    }
}

package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.LongConsumer;

/* loaded from: classes2.dex */
public final class k1 extends m1 implements e2 {
    public final long[] h;

    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final /* bridge */ /* synthetic */ void s(Object obj) {
        s((Long) obj);
    }

    public final /* synthetic */ LongConsumer andThen(LongConsumer longConsumer) {
        return j$.com.android.tools.r8.a.d(this, longConsumer);
    }

    @Override // j$.util.stream.e2
    public final /* synthetic */ void s(Long l) {
        q1.i(this, l);
    }

    public k1(Spliterator spliterator, a aVar, long[] jArr) {
        super(spliterator, aVar, jArr.length);
        this.h = jArr;
    }

    public k1(k1 k1Var, Spliterator spliterator, long j, long j2) {
        super(k1Var, spliterator, j, j2, k1Var.h.length);
        this.h = k1Var.h;
    }

    @Override // j$.util.stream.m1
    public final m1 b(Spliterator spliterator, long j, long j2) {
        return new k1(this, spliterator, j, j2);
    }

    @Override // j$.util.stream.m1, j$.util.stream.f2
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

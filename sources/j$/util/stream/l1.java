package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.LongConsumer;

/* loaded from: classes2.dex */
public final class l1 extends n1 implements f2 {
    public final long[] h;

    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final /* bridge */ /* synthetic */ void s(Object obj) {
        s((Long) obj);
    }

    public final /* synthetic */ LongConsumer andThen(LongConsumer longConsumer) {
        return j$.com.android.tools.r8.a.d(this, longConsumer);
    }

    @Override // j$.util.stream.f2
    public final /* synthetic */ void s(Long l) {
        r1.i(this, l);
    }

    public l1(Spliterator spliterator, a aVar, long[] jArr) {
        super(spliterator, aVar, jArr.length);
        this.h = jArr;
    }

    public l1(l1 l1Var, Spliterator spliterator, long j, long j2) {
        super(l1Var, spliterator, j, j2, l1Var.h.length);
        this.h = l1Var.h;
    }

    @Override // j$.util.stream.n1
    public final n1 b(Spliterator spliterator, long j, long j2) {
        return new l1(this, spliterator, j, j2);
    }

    @Override // j$.util.stream.n1, j$.util.stream.g2
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

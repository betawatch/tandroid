package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.LongConsumer;

/* loaded from: classes2.dex */
public final class n3 extends p3 implements i5 {
    public final long[] h;

    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final /* bridge */ /* synthetic */ void x(Object obj) {
        x((Long) obj);
    }

    public final /* synthetic */ LongConsumer andThen(LongConsumer longConsumer) {
        return j$.com.android.tools.r8.a.d(this, longConsumer);
    }

    @Override // j$.util.stream.i5
    public final /* synthetic */ void x(Long l10) {
        t3.H(this, l10);
    }

    public n3(Spliterator spliterator, t3 t3Var, long[] jArr) {
        super(spliterator, t3Var, jArr.length);
        this.h = jArr;
    }

    public n3(n3 n3Var, Spliterator spliterator, long j10, long j11) {
        super(n3Var, spliterator, j10, j11, n3Var.h.length);
        this.h = n3Var.h;
    }

    @Override // j$.util.stream.p3
    public final p3 a(Spliterator spliterator, long j10, long j11) {
        return new n3(this, spliterator, j10, j11);
    }

    @Override // j$.util.stream.p3, j$.util.stream.j5
    public final void accept(long j10) {
        int i10 = this.f;
        if (i10 >= this.g) {
            throw new IndexOutOfBoundsException(Integer.toString(this.f));
        }
        long[] jArr = this.h;
        this.f = i10 + 1;
        jArr[i10] = j10;
    }
}

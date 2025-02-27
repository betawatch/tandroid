package j$.util.stream;

import j$.util.Spliterator;

/* loaded from: classes2.dex */
final class o1 extends q1 implements d2 {
    private final long[] h;

    o1(Spliterator spliterator, b bVar, long[] jArr) {
        super(jArr.length, spliterator, bVar);
        this.h = jArr;
    }

    o1(o1 o1Var, Spliterator spliterator, long j, long j2) {
        super(o1Var, spliterator, j, j2, o1Var.h.length);
        this.h = o1Var.h;
    }

    @Override // j$.util.stream.q1
    final q1 a(Spliterator spliterator, long j, long j2) {
        return new o1(this, spliterator, j, j2);
    }

    @Override // j$.util.stream.q1, j$.util.stream.e2
    public final void accept(long j) {
        int i = this.f;
        if (i >= this.g) {
            throw new IndexOutOfBoundsException(Integer.toString(this.f));
        }
        long[] jArr = this.h;
        this.f = i + 1;
        jArr[i] = j;
    }

    @Override // j$.util.function.Consumer
    /* renamed from: accept */
    public final /* bridge */ /* synthetic */ void r(Object obj) {
        j((Long) obj);
    }

    @Override // j$.util.function.T
    public final /* synthetic */ j$.util.function.T f(j$.util.function.T t) {
        return j$.com.android.tools.r8.a.d(this, t);
    }

    @Override // j$.util.stream.d2
    public final /* synthetic */ void j(Long l) {
        t0.i(this, l);
    }
}

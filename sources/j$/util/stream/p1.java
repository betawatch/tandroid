package j$.util.stream;

import j$.util.Spliterator;

/* loaded from: classes2.dex */
final class p1 extends r1 implements d2 {
    private final long[] h;

    p1(Spliterator spliterator, b bVar, long[] jArr) {
        super(jArr.length, spliterator, bVar);
        this.h = jArr;
    }

    p1(p1 p1Var, Spliterator spliterator, long j, long j2) {
        super(p1Var, spliterator, j, j2, p1Var.h.length);
        this.h = p1Var.h;
    }

    @Override // j$.util.stream.r1
    final r1 a(Spliterator spliterator, long j, long j2) {
        return new p1(this, spliterator, j, j2);
    }

    @Override // j$.util.stream.r1, j$.util.stream.e2
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
        u0.i(this, l);
    }
}

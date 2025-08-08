package j$.util.stream;

import j$.util.Spliterator;

/* loaded from: classes2.dex */
final class p1 extends q1 {
    private final Object[] h;

    p1(Spliterator spliterator, b bVar, Object[] objArr) {
        super(spliterator, bVar, objArr.length);
        this.h = objArr;
    }

    p1(p1 p1Var, Spliterator spliterator, long j, long j2) {
        super(p1Var, spliterator, j, j2, p1Var.h.length);
        this.h = p1Var.h;
    }

    @Override // j$.util.stream.q1
    final q1 a(Spliterator spliterator, long j, long j2) {
        return new p1(this, spliterator, j, j2);
    }

    @Override // j$.util.function.Consumer
    /* renamed from: accept */
    public final void r(Object obj) {
        int i = this.f;
        if (i >= this.g) {
            throw new IndexOutOfBoundsException(Integer.toString(this.f));
        }
        Object[] objArr = this.h;
        this.f = i + 1;
        objArr[i] = obj;
    }
}

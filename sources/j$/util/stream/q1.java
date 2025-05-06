package j$.util.stream;

import j$.util.Spliterator;

/* loaded from: classes2.dex */
final class q1 extends r1 {
    private final Object[] h;

    q1(Spliterator spliterator, b bVar, Object[] objArr) {
        super(objArr.length, spliterator, bVar);
        this.h = objArr;
    }

    q1(q1 q1Var, Spliterator spliterator, long j, long j2) {
        super(q1Var, spliterator, j, j2, q1Var.h.length);
        this.h = q1Var.h;
    }

    @Override // j$.util.stream.r1
    final r1 a(Spliterator spliterator, long j, long j2) {
        return new q1(this, spliterator, j, j2);
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

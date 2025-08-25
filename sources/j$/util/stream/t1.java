package j$.util.stream;

import j$.util.Spliterator;

/* loaded from: classes2.dex */
final class t1 extends u1 {
    private final Object[] h;

    t1(Spliterator spliterator, b bVar, Object[] objArr) {
        super(spliterator, bVar, objArr.length);
        this.h = objArr;
    }

    t1(t1 t1Var, Spliterator spliterator, long j, long j2) {
        super(t1Var, spliterator, j, j2, t1Var.h.length);
        this.h = t1Var.h;
    }

    @Override // j$.util.stream.u1
    final u1 b(Spliterator spliterator, long j, long j2) {
        return new t1(this, spliterator, j, j2);
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        int i = this.f;
        if (i >= this.g) {
            throw new IndexOutOfBoundsException(Integer.toString(this.f));
        }
        Object[] objArr = this.h;
        this.f = i + 1;
        objArr[i] = obj;
    }
}

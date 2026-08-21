package j$.util.stream;

import j$.util.Spliterator;

/* loaded from: classes2.dex */
public final class m1 extends n1 {
    public final Object[] h;

    public m1(Spliterator spliterator, a aVar, Object[] objArr) {
        super(spliterator, aVar, objArr.length);
        this.h = objArr;
    }

    public m1(m1 m1Var, Spliterator spliterator, long j, long j2) {
        super(m1Var, spliterator, j, j2, m1Var.h.length);
        this.h = m1Var.h;
    }

    @Override // j$.util.stream.n1
    public final n1 b(Spliterator spliterator, long j, long j2) {
        return new m1(this, spliterator, j, j2);
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

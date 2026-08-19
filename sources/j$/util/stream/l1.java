package j$.util.stream;

import j$.util.Spliterator;

/* loaded from: classes2.dex */
public final class l1 extends m1 {
    public final Object[] h;

    public l1(Spliterator spliterator, a aVar, Object[] objArr) {
        super(spliterator, aVar, objArr.length);
        this.h = objArr;
    }

    public l1(l1 l1Var, Spliterator spliterator, long j, long j2) {
        super(l1Var, spliterator, j, j2, l1Var.h.length);
        this.h = l1Var.h;
    }

    @Override // j$.util.stream.m1
    public final m1 b(Spliterator spliterator, long j, long j2) {
        return new l1(this, spliterator, j, j2);
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

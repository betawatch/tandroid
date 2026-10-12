package j$.util.stream;

import j$.util.Spliterator;

/* loaded from: classes2.dex */
public final class o3 extends p3 {
    public final Object[] h;

    public o3(Spliterator spliterator, t3 t3Var, Object[] objArr) {
        super(spliterator, t3Var, objArr.length);
        this.h = objArr;
    }

    public o3(o3 o3Var, Spliterator spliterator, long j10, long j11) {
        super(o3Var, spliterator, j10, j11, o3Var.h.length);
        this.h = o3Var.h;
    }

    @Override // j$.util.stream.p3
    public final p3 a(Spliterator spliterator, long j10, long j11) {
        return new o3(this, spliterator, j10, j11);
    }

    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final void x(Object obj) {
        int i10 = this.f;
        if (i10 >= this.g) {
            throw new IndexOutOfBoundsException(Integer.toString(this.f));
        }
        Object[] objArr = this.h;
        this.f = i10 + 1;
        objArr[i10] = obj;
    }
}

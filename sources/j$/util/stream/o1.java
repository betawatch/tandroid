package j$.util.stream;

import j$.util.Spliterator;

/* loaded from: classes2.dex */
final class o1 extends r1 implements c2 {
    private final int[] h;

    o1(Spliterator spliterator, b bVar, int[] iArr) {
        super(iArr.length, spliterator, bVar);
        this.h = iArr;
    }

    o1(o1 o1Var, Spliterator spliterator, long j, long j2) {
        super(o1Var, spliterator, j, j2, o1Var.h.length);
        this.h = o1Var.h;
    }

    @Override // j$.util.stream.r1
    final r1 a(Spliterator spliterator, long j, long j2) {
        return new o1(this, spliterator, j, j2);
    }

    @Override // j$.util.stream.r1, j$.util.stream.e2
    public final void accept(int i) {
        int i2 = this.f;
        if (i2 >= this.g) {
            throw new IndexOutOfBoundsException(Integer.toString(this.f));
        }
        int[] iArr = this.h;
        this.f = i2 + 1;
        iArr[i2] = i;
    }

    @Override // j$.util.function.Consumer
    /* renamed from: accept */
    public final /* bridge */ /* synthetic */ void r(Object obj) {
        o((Integer) obj);
    }

    @Override // j$.util.function.E
    public final /* synthetic */ j$.util.function.E l(j$.util.function.E e) {
        return j$.com.android.tools.r8.a.c(this, e);
    }

    @Override // j$.util.stream.c2
    public final /* synthetic */ void o(Integer num) {
        u0.g(this, num);
    }
}

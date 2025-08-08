package j$.util.stream;

import j$.util.Spliterator;

/* loaded from: classes2.dex */
final class n1 extends q1 implements b2 {
    private final int[] h;

    @Override // j$.util.function.Consumer
    /* renamed from: accept */
    public final /* bridge */ /* synthetic */ void r(Object obj) {
        o((Integer) obj);
    }

    @Override // j$.util.function.G
    public final /* synthetic */ j$.util.function.G l(j$.util.function.G g) {
        return j$.com.android.tools.r8.a.b(this, g);
    }

    @Override // j$.util.stream.b2
    public final /* synthetic */ void o(Integer num) {
        t0.g(this, num);
    }

    n1(Spliterator spliterator, b bVar, int[] iArr) {
        super(spliterator, bVar, iArr.length);
        this.h = iArr;
    }

    n1(n1 n1Var, Spliterator spliterator, long j, long j2) {
        super(n1Var, spliterator, j, j2, n1Var.h.length);
        this.h = n1Var.h;
    }

    @Override // j$.util.stream.q1
    final q1 a(Spliterator spliterator, long j, long j2) {
        return new n1(this, spliterator, j, j2);
    }

    @Override // j$.util.stream.q1, j$.util.stream.d2
    public final void accept(int i) {
        int i2 = this.f;
        if (i2 >= this.g) {
            throw new IndexOutOfBoundsException(Integer.toString(this.f));
        }
        int[] iArr = this.h;
        this.f = i2 + 1;
        iArr[i2] = i;
    }
}

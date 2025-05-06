package j$.util.stream;

import j$.util.Spliterator;

/* loaded from: classes2.dex */
final class n1 extends r1 implements b2 {
    private final double[] h;

    n1(Spliterator spliterator, b bVar, double[] dArr) {
        super(dArr.length, spliterator, bVar);
        this.h = dArr;
    }

    n1(n1 n1Var, Spliterator spliterator, long j, long j2) {
        super(n1Var, spliterator, j, j2, n1Var.h.length);
        this.h = n1Var.h;
    }

    @Override // j$.util.stream.r1
    final r1 a(Spliterator spliterator, long j, long j2) {
        return new n1(this, spliterator, j, j2);
    }

    @Override // j$.util.stream.r1, j$.util.stream.e2, j$.util.function.m
    public final void accept(double d) {
        int i = this.f;
        if (i >= this.g) {
            throw new IndexOutOfBoundsException(Integer.toString(this.f));
        }
        double[] dArr = this.h;
        this.f = i + 1;
        dArr[i] = d;
    }

    @Override // j$.util.function.Consumer
    /* renamed from: accept */
    public final /* bridge */ /* synthetic */ void r(Object obj) {
        r((Double) obj);
    }

    @Override // j$.util.function.m
    public final /* synthetic */ j$.util.function.m k(j$.util.function.m mVar) {
        return j$.com.android.tools.r8.a.b(this, mVar);
    }

    @Override // j$.util.stream.b2
    public final /* synthetic */ void r(Double d) {
        u0.e(this, d);
    }
}

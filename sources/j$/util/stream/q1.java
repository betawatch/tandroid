package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.DoubleConsumer;

/* loaded from: classes2.dex */
final class q1 extends u1 implements j2 {
    private final double[] h;

    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final /* bridge */ /* synthetic */ void p(Object obj) {
        p((Double) obj);
    }

    public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer) {
        return j$.com.android.tools.r8.a.a(this, doubleConsumer);
    }

    @Override // j$.util.stream.j2
    public final /* synthetic */ void p(Double d) {
        w0.e(this, d);
    }

    q1(Spliterator spliterator, b bVar, double[] dArr) {
        super(spliterator, bVar, dArr.length);
        this.h = dArr;
    }

    q1(q1 q1Var, Spliterator spliterator, long j, long j2) {
        super(q1Var, spliterator, j, j2, q1Var.h.length);
        this.h = q1Var.h;
    }

    @Override // j$.util.stream.u1
    final u1 b(Spliterator spliterator, long j, long j2) {
        return new q1(this, spliterator, j, j2);
    }

    @Override // j$.util.stream.u1, j$.util.stream.m2, j$.util.stream.j2, java.util.function.DoubleConsumer
    public final void accept(double d) {
        int i = this.f;
        if (i >= this.g) {
            throw new IndexOutOfBoundsException(Integer.toString(this.f));
        }
        double[] dArr = this.h;
        this.f = i + 1;
        dArr[i] = d;
    }
}

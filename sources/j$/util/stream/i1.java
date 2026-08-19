package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.DoubleConsumer;

/* loaded from: classes2.dex */
public final class i1 extends m1 implements c2 {
    public final double[] h;

    @Override // j$.util.stream.c2
    public final /* synthetic */ void E(Double d) {
        q1.e(this, d);
    }

    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final /* bridge */ /* synthetic */ void s(Object obj) {
        E((Double) obj);
    }

    public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer) {
        return j$.com.android.tools.r8.a.b(this, doubleConsumer);
    }

    public i1(Spliterator spliterator, a aVar, double[] dArr) {
        super(spliterator, aVar, dArr.length);
        this.h = dArr;
    }

    public i1(i1 i1Var, Spliterator spliterator, long j, long j2) {
        super(i1Var, spliterator, j, j2, i1Var.h.length);
        this.h = i1Var.h;
    }

    @Override // j$.util.stream.m1
    public final m1 b(Spliterator spliterator, long j, long j2) {
        return new i1(this, spliterator, j, j2);
    }

    @Override // j$.util.stream.m1, j$.util.stream.f2
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

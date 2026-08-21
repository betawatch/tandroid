package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.DoubleConsumer;

/* loaded from: classes2.dex */
public final class j1 extends n1 implements d2 {
    public final double[] h;

    @Override // j$.util.stream.d2
    public final /* synthetic */ void E(Double d) {
        r1.e(this, d);
    }

    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final /* bridge */ /* synthetic */ void s(Object obj) {
        E((Double) obj);
    }

    public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer) {
        return j$.com.android.tools.r8.a.b(this, doubleConsumer);
    }

    public j1(Spliterator spliterator, a aVar, double[] dArr) {
        super(spliterator, aVar, dArr.length);
        this.h = dArr;
    }

    public j1(j1 j1Var, Spliterator spliterator, long j, long j2) {
        super(j1Var, spliterator, j, j2, j1Var.h.length);
        this.h = j1Var.h;
    }

    @Override // j$.util.stream.n1
    public final n1 b(Spliterator spliterator, long j, long j2) {
        return new j1(this, spliterator, j, j2);
    }

    @Override // j$.util.stream.n1, j$.util.stream.g2
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

package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.DoubleConsumer;

/* loaded from: classes2.dex */
public final class l3 extends p3 implements g5 {
    public final double[] h;

    @Override // j$.util.stream.g5
    public final /* synthetic */ void B(Double d) {
        t3.D(this, d);
    }

    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final /* bridge */ /* synthetic */ void x(Object obj) {
        B((Double) obj);
    }

    public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer) {
        return j$.com.android.tools.r8.a.b(this, doubleConsumer);
    }

    public l3(Spliterator spliterator, t3 t3Var, double[] dArr) {
        super(spliterator, t3Var, dArr.length);
        this.h = dArr;
    }

    public l3(l3 l3Var, Spliterator spliterator, long j3, long j10) {
        super(l3Var, spliterator, j3, j10, l3Var.h.length);
        this.h = l3Var.h;
    }

    @Override // j$.util.stream.p3
    public final p3 a(Spliterator spliterator, long j3, long j10) {
        return new l3(this, spliterator, j3, j10);
    }

    @Override // j$.util.stream.p3, j$.util.stream.j5
    public final void accept(double d) {
        int i10 = this.f;
        if (i10 >= this.g) {
            throw new IndexOutOfBoundsException(Integer.toString(this.f));
        }
        double[] dArr = this.h;
        this.f = i10 + 1;
        dArr[i10] = d;
    }
}

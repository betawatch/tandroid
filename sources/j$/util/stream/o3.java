package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.DoubleConsumer;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes4.dex */
public final class o3 extends s3 implements k5 {
    public final double[] h;

    public o3(o3 o3Var, Spliterator spliterator, long j, long j2) {
        super(o3Var, spliterator, j, j2, o3Var.h.length);
        this.h = o3Var.h;
    }

    @Override // j$.util.stream.k5
    public final /* synthetic */ void C(Double d) {
        w3.e(this, d);
    }

    @Override // j$.util.stream.s3
    public final s3 a(Spliterator spliterator, long j, long j2) {
        return new o3(this, spliterator, j, j2);
    }

    @Override // j$.util.stream.s3, j$.util.stream.n5, j$.util.stream.k5, java.util.function.DoubleConsumer
    public final void accept(double d) {
        int i = this.f;
        if (i >= this.g) {
            throw new IndexOutOfBoundsException(Integer.toString(i));
        }
        double[] dArr = this.h;
        this.f = i + 1;
        dArr[i] = d;
    }

    public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer) {
        return j$.time.a.b(this, doubleConsumer);
    }

    public o3(Spliterator spliterator, a aVar, double[] dArr) {
        super(spliterator, aVar, dArr.length);
        this.h = dArr;
    }

    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final /* bridge */ /* synthetic */ void x(Object obj) {
        C((Double) obj);
    }
}

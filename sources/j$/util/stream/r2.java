package j$.util.stream;

import j$.util.function.Consumer$-CC;
import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;

/* loaded from: classes2.dex */
public final class r2 extends q2 implements t1 {
    @Override // j$.util.stream.g5
    public final /* synthetic */ void B(Double d) {
        t3.D(this, d);
    }

    @Override // j$.util.stream.j5, j$.util.stream.h5, java.util.function.IntConsumer
    public final /* synthetic */ void accept(int i9) {
        t3.J();
        throw null;
    }

    @Override // j$.util.stream.j5
    public final /* synthetic */ void accept(long j10) {
        t3.K();
        throw null;
    }

    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final /* bridge */ /* synthetic */ void x(Object obj) {
        B((Double) obj);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$-CC.$default$andThen(this, consumer);
    }

    public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer) {
        return j$.com.android.tools.r8.a.b(this, doubleConsumer);
    }

    @Override // j$.util.stream.j5
    public final /* synthetic */ boolean q() {
        return false;
    }

    @Override // j$.util.stream.w1
    public final /* bridge */ /* synthetic */ e2 build() {
        build();
        return this;
    }

    @Override // j$.util.stream.t1, j$.util.stream.w1
    public final y1 build() {
        int i9 = this.b;
        double[] dArr = this.a;
        if (i9 >= dArr.length) {
            return this;
        }
        throw new IllegalStateException(String.format("Current size %d is less than fixed size %d", Integer.valueOf(this.b), Integer.valueOf(dArr.length)));
    }

    @Override // j$.util.stream.j5
    public final void o(long j10) {
        double[] dArr = this.a;
        if (j10 != dArr.length) {
            throw new IllegalStateException(String.format("Begin size %d is not equal to fixed size %d", Long.valueOf(j10), Integer.valueOf(dArr.length)));
        }
        this.b = 0;
    }

    @Override // j$.util.stream.j5
    public final void accept(double d) {
        int i9 = this.b;
        double[] dArr = this.a;
        if (i9 < dArr.length) {
            this.b = i9 + 1;
            dArr[i9] = d;
            return;
        }
        throw new IllegalStateException(String.format("Accept exceeded fixed size of %d", Integer.valueOf(dArr.length)));
    }

    @Override // j$.util.stream.j5
    public final void end() {
        int i9 = this.b;
        double[] dArr = this.a;
        if (i9 < dArr.length) {
            throw new IllegalStateException(String.format("End size %d is less than fixed size %d", Integer.valueOf(this.b), Integer.valueOf(dArr.length)));
        }
    }

    @Override // j$.util.stream.q2
    public final String toString() {
        double[] dArr = this.a;
        return String.format("DoubleFixedNodeBuilder[%d][%s]", Integer.valueOf(dArr.length - this.b), Arrays.toString(dArr));
    }
}

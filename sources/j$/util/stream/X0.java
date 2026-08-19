package j$.util.stream;

import j$.util.function.Consumer$-CC;
import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* loaded from: classes2.dex */
public final class X0 extends W0 implements r0 {
    @Override // j$.util.stream.d2
    public final /* synthetic */ void A(Integer num) {
        q1.g(this, num);
    }

    @Override // j$.util.stream.f2
    public final /* synthetic */ boolean C() {
        return false;
    }

    @Override // j$.util.stream.f2
    public final /* synthetic */ void accept(double d) {
        q1.a();
        throw null;
    }

    @Override // j$.util.stream.f2
    public final /* synthetic */ void accept(long j) {
        q1.l();
        throw null;
    }

    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final /* bridge */ /* synthetic */ void s(Object obj) {
        A((Integer) obj);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$-CC.$default$andThen(this, consumer);
    }

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return j$.com.android.tools.r8.a.c(this, intConsumer);
    }

    @Override // j$.util.stream.t0
    public final /* bridge */ /* synthetic */ B0 a() {
        a();
        return this;
    }

    @Override // j$.util.stream.r0, j$.util.stream.t0
    public final x0 a() {
        int i = this.b;
        int[] iArr = this.a;
        if (i >= iArr.length) {
            return this;
        }
        throw new IllegalStateException(String.format("Current size %d is less than fixed size %d", Integer.valueOf(this.b), Integer.valueOf(iArr.length)));
    }

    @Override // j$.util.stream.f2
    public final void y(long j) {
        int[] iArr = this.a;
        if (j != iArr.length) {
            throw new IllegalStateException(String.format("Begin size %d is not equal to fixed size %d", Long.valueOf(j), Integer.valueOf(iArr.length)));
        }
        this.b = 0;
    }

    @Override // j$.util.stream.f2
    public final void accept(int i) {
        int i2 = this.b;
        int[] iArr = this.a;
        if (i2 < iArr.length) {
            this.b = 1 + i2;
            iArr[i2] = i;
            return;
        }
        throw new IllegalStateException(String.format("Accept exceeded fixed size of %d", Integer.valueOf(iArr.length)));
    }

    @Override // j$.util.stream.f2
    public final void x() {
        int i = this.b;
        int[] iArr = this.a;
        if (i < iArr.length) {
            throw new IllegalStateException(String.format("End size %d is less than fixed size %d", Integer.valueOf(this.b), Integer.valueOf(iArr.length)));
        }
    }

    @Override // j$.util.stream.W0
    public final String toString() {
        int[] iArr = this.a;
        return String.format("IntFixedNodeBuilder[%d][%s]", Integer.valueOf(iArr.length - this.b), Arrays.toString(iArr));
    }
}

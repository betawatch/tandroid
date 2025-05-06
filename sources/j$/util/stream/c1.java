package j$.util.stream;

import j$.util.function.Consumer;
import java.util.Arrays;

/* loaded from: classes2.dex */
final class c1 extends b1 implements w0 {
    c1(long j) {
        super(j);
    }

    @Override // j$.util.stream.e2, j$.util.function.m
    public final /* synthetic */ void accept(double d) {
        u0.b();
        throw null;
    }

    @Override // j$.util.stream.e2
    public final void accept(int i) {
        int i2 = this.b;
        int[] iArr = this.a;
        if (i2 >= iArr.length) {
            throw new IllegalStateException(String.format("Accept exceeded fixed size of %d", Integer.valueOf(iArr.length)));
        }
        this.b = 1 + i2;
        iArr[i2] = i;
    }

    @Override // j$.util.stream.e2
    public final /* synthetic */ void accept(long j) {
        u0.l();
        throw null;
    }

    @Override // j$.util.function.Consumer
    /* renamed from: accept */
    public final /* bridge */ /* synthetic */ void r(Object obj) {
        o((Integer) obj);
    }

    @Override // j$.util.function.Consumer
    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.-CC.$default$andThen(this, consumer);
    }

    @Override // j$.util.stream.w0, j$.util.stream.y0
    public final C0 b() {
        int i = this.b;
        int[] iArr = this.a;
        if (i >= iArr.length) {
            return this;
        }
        throw new IllegalStateException(String.format("Current size %d is less than fixed size %d", Integer.valueOf(this.b), Integer.valueOf(iArr.length)));
    }

    @Override // j$.util.stream.y0
    public final /* bridge */ /* synthetic */ G0 b() {
        b();
        return this;
    }

    @Override // j$.util.function.E
    public final /* synthetic */ j$.util.function.E l(j$.util.function.E e) {
        return j$.com.android.tools.r8.a.c(this, e);
    }

    @Override // j$.util.stream.e2
    public final void m() {
        int i = this.b;
        int[] iArr = this.a;
        if (i < iArr.length) {
            throw new IllegalStateException(String.format("End size %d is less than fixed size %d", Integer.valueOf(this.b), Integer.valueOf(iArr.length)));
        }
    }

    @Override // j$.util.stream.e2
    public final void n(long j) {
        int[] iArr = this.a;
        if (j != iArr.length) {
            throw new IllegalStateException(String.format("Begin size %d is not equal to fixed size %d", Long.valueOf(j), Integer.valueOf(iArr.length)));
        }
        this.b = 0;
    }

    @Override // j$.util.stream.c2
    public final /* synthetic */ void o(Integer num) {
        u0.g(this, num);
    }

    @Override // j$.util.stream.e2
    public final /* synthetic */ boolean q() {
        return false;
    }

    @Override // j$.util.stream.b1
    public final String toString() {
        int[] iArr = this.a;
        return String.format("IntFixedNodeBuilder[%d][%s]", Integer.valueOf(iArr.length - this.b), Arrays.toString(iArr));
    }
}

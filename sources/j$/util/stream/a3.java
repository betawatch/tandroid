package j$.util.stream;

import j$.util.function.Consumer$-CC;
import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* loaded from: classes2.dex */
public final class a3 extends z2 implements u1 {
    @Override // j$.util.stream.j5
    public final /* synthetic */ void accept(double d) {
        t3.C();
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
        p((Integer) obj);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$-CC.$default$andThen(this, consumer);
    }

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return j$.com.android.tools.r8.a.c(this, intConsumer);
    }

    @Override // j$.util.stream.h5
    public final /* synthetic */ void p(Integer num) {
        t3.F(this, num);
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

    @Override // j$.util.stream.u1, j$.util.stream.w1
    public final a2 build() {
        int i9 = this.b;
        int[] iArr = this.a;
        if (i9 >= iArr.length) {
            return this;
        }
        throw new IllegalStateException(String.format("Current size %d is less than fixed size %d", Integer.valueOf(this.b), Integer.valueOf(iArr.length)));
    }

    @Override // j$.util.stream.j5
    public final void o(long j10) {
        int[] iArr = this.a;
        if (j10 != iArr.length) {
            throw new IllegalStateException(String.format("Begin size %d is not equal to fixed size %d", Long.valueOf(j10), Integer.valueOf(iArr.length)));
        }
        this.b = 0;
    }

    @Override // j$.util.stream.j5, j$.util.stream.h5, java.util.function.IntConsumer
    public final void accept(int i9) {
        int i10 = this.b;
        int[] iArr = this.a;
        if (i10 < iArr.length) {
            this.b = i10 + 1;
            iArr[i10] = i9;
            return;
        }
        throw new IllegalStateException(String.format("Accept exceeded fixed size of %d", Integer.valueOf(iArr.length)));
    }

    @Override // j$.util.stream.j5
    public final void end() {
        int i9 = this.b;
        int[] iArr = this.a;
        if (i9 < iArr.length) {
            throw new IllegalStateException(String.format("End size %d is less than fixed size %d", Integer.valueOf(this.b), Integer.valueOf(iArr.length)));
        }
    }

    @Override // j$.util.stream.z2
    public final String toString() {
        int[] iArr = this.a;
        return String.format("IntFixedNodeBuilder[%d][%s]", Integer.valueOf(iArr.length - this.b), Arrays.toString(iArr));
    }
}

package j$.util.stream;

import j$.util.function.Consumer$-CC;
import j$.util.function.IntConsumer$-CC;
import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes4.dex */
public final class d3 extends c3 implements x1 {
    @Override // j$.util.stream.n5
    public final void accept(int i) {
        int i2 = this.b;
        int[] iArr = this.a;
        if (i2 >= iArr.length) {
            j$.time.g.h("Accept exceeded fixed size of %d", new Object[]{Integer.valueOf(iArr.length)});
        } else {
            this.b = i2 + 1;
            iArr[i2] = i;
        }
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$-CC.$default$andThen(this, consumer);
    }

    @Override // j$.util.stream.x1, j$.util.stream.z1
    public final d2 build() {
        int i = this.b;
        int[] iArr = this.a;
        if (i >= iArr.length) {
            return this;
        }
        j$.time.g.h("Current size %d is less than fixed size %d", new Object[]{Integer.valueOf(i), Integer.valueOf(iArr.length)});
        return null;
    }

    @Override // j$.util.stream.n5
    public final void end() {
        int i = this.b;
        int[] iArr = this.a;
        if (i >= iArr.length) {
            return;
        }
        j$.time.g.h("End size %d is less than fixed size %d", new Object[]{Integer.valueOf(i), Integer.valueOf(iArr.length)});
    }

    @Override // j$.util.stream.n5
    public final void n(long j) {
        int[] iArr = this.a;
        if (j == iArr.length) {
            this.b = 0;
        } else {
            j$.time.g.h("Begin size %d is not equal to fixed size %d", new Object[]{Long.valueOf(j), Integer.valueOf(iArr.length)});
        }
    }

    @Override // j$.util.stream.l5
    public final /* synthetic */ void o(Integer num) {
        w3.g(this, num);
    }

    @Override // j$.util.stream.n5
    public final boolean q() {
        return false;
    }

    @Override // j$.util.stream.c3
    public final String toString() {
        int[] iArr = this.a;
        return String.format("IntFixedNodeBuilder[%d][%s]", Integer.valueOf(iArr.length - this.b), Arrays.toString(iArr));
    }

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return IntConsumer$-CC.$default$andThen(this, intConsumer);
    }

    @Override // j$.util.stream.n5
    public final /* synthetic */ void accept(long j) {
        w3.l();
        throw null;
    }

    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final /* bridge */ /* synthetic */ void x(Object obj) {
        o((Integer) obj);
    }

    @Override // j$.util.stream.n5, j$.util.stream.k5, java.util.function.DoubleConsumer
    public final /* synthetic */ void accept(double d) {
        w3.d();
        throw null;
    }

    @Override // j$.util.stream.z1
    public final /* bridge */ /* synthetic */ h2 build() {
        build();
        return this;
    }
}

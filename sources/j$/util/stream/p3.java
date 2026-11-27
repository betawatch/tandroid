package j$.util.stream;

import j$.util.Spliterator;
import j$.util.function.IntConsumer$-CC;
import java.util.function.IntConsumer;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes4.dex */
public final class p3 extends s3 implements l5 {
    public final int[] h;

    public p3(p3 p3Var, Spliterator spliterator, long j, long j2) {
        super(p3Var, spliterator, j, j2, p3Var.h.length);
        this.h = p3Var.h;
    }

    @Override // j$.util.stream.s3
    public final s3 a(Spliterator spliterator, long j, long j2) {
        return new p3(this, spliterator, j, j2);
    }

    @Override // j$.util.stream.s3, j$.util.stream.n5
    public final void accept(int i) {
        int i2 = this.f;
        if (i2 >= this.g) {
            throw new IndexOutOfBoundsException(Integer.toString(i2));
        }
        int[] iArr = this.h;
        this.f = i2 + 1;
        iArr[i2] = i;
    }

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return IntConsumer$-CC.$default$andThen(this, intConsumer);
    }

    @Override // j$.util.stream.l5
    public final /* synthetic */ void o(Integer num) {
        w3.g(this, num);
    }

    public p3(Spliterator spliterator, a aVar, int[] iArr) {
        super(spliterator, aVar, iArr.length);
        this.h = iArr;
    }

    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final /* bridge */ /* synthetic */ void x(Object obj) {
        o((Integer) obj);
    }
}

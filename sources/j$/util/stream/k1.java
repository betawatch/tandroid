package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.IntConsumer;

/* loaded from: classes2.dex */
public final class k1 extends n1 implements e2 {
    public final int[] h;

    @Override // j$.util.stream.e2
    public final /* synthetic */ void A(Integer num) {
        r1.g(this, num);
    }

    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final /* bridge */ /* synthetic */ void s(Object obj) {
        A((Integer) obj);
    }

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return j$.com.android.tools.r8.a.c(this, intConsumer);
    }

    public k1(Spliterator spliterator, a aVar, int[] iArr) {
        super(spliterator, aVar, iArr.length);
        this.h = iArr;
    }

    public k1(k1 k1Var, Spliterator spliterator, long j, long j2) {
        super(k1Var, spliterator, j, j2, k1Var.h.length);
        this.h = k1Var.h;
    }

    @Override // j$.util.stream.n1
    public final n1 b(Spliterator spliterator, long j, long j2) {
        return new k1(this, spliterator, j, j2);
    }

    @Override // j$.util.stream.n1, j$.util.stream.g2
    public final void accept(int i) {
        int i2 = this.f;
        if (i2 >= this.g) {
            throw new IndexOutOfBoundsException(Integer.toString(this.f));
        }
        int[] iArr = this.h;
        this.f = i2 + 1;
        iArr[i2] = i;
    }
}

package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.IntConsumer;

/* loaded from: classes2.dex */
final class r1 extends u1 implements k2 {
    private final int[] h;

    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final /* bridge */ /* synthetic */ void p(Object obj) {
        m((Integer) obj);
    }

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return j$.com.android.tools.r8.a.b(this, intConsumer);
    }

    @Override // j$.util.stream.k2
    public final /* synthetic */ void m(Integer num) {
        w0.g(this, num);
    }

    r1(Spliterator spliterator, b bVar, int[] iArr) {
        super(spliterator, bVar, iArr.length);
        this.h = iArr;
    }

    r1(r1 r1Var, Spliterator spliterator, long j, long j2) {
        super(r1Var, spliterator, j, j2, r1Var.h.length);
        this.h = r1Var.h;
    }

    @Override // j$.util.stream.u1
    final u1 b(Spliterator spliterator, long j, long j2) {
        return new r1(this, spliterator, j, j2);
    }

    @Override // j$.util.stream.u1, j$.util.stream.m2
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

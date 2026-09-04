package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.IntConsumer;

/* loaded from: classes2.dex */
public final class m3 extends p3 implements h5 {
    public final int[] h;

    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final /* bridge */ /* synthetic */ void x(Object obj) {
        p((Integer) obj);
    }

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return j$.com.android.tools.r8.a.c(this, intConsumer);
    }

    @Override // j$.util.stream.h5
    public final /* synthetic */ void p(Integer num) {
        t3.F(this, num);
    }

    public m3(Spliterator spliterator, t3 t3Var, int[] iArr) {
        super(spliterator, t3Var, iArr.length);
        this.h = iArr;
    }

    public m3(m3 m3Var, Spliterator spliterator, long j3, long j10) {
        super(m3Var, spliterator, j3, j10, m3Var.h.length);
        this.h = m3Var.h;
    }

    @Override // j$.util.stream.p3
    public final p3 a(Spliterator spliterator, long j3, long j10) {
        return new m3(this, spliterator, j3, j10);
    }

    @Override // j$.util.stream.p3, j$.util.stream.j5, j$.util.stream.h5, java.util.function.IntConsumer
    public final void accept(int i10) {
        int i11 = this.f;
        if (i11 >= this.g) {
            throw new IndexOutOfBoundsException(Integer.toString(this.f));
        }
        int[] iArr = this.h;
        this.f = i11 + 1;
        iArr[i11] = i10;
    }
}

package j$.util.stream;

import j$.util.Objects;
import j$.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* loaded from: classes2.dex */
public final class f3 extends U2 implements j$.util.W {
    @Override // j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        j$.com.android.tools.r8.a.j(this, consumer);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return j$.com.android.tools.r8.a.A(this, consumer);
    }

    @Override // j$.util.stream.U2
    public final U2 e(Spliterator spliterator) {
        return new f3(this.b, spliterator, this.a);
    }

    @Override // j$.util.stream.U2
    public final void d() {
        K2 k2 = new K2();
        this.h = k2;
        Objects.requireNonNull(k2);
        this.e = this.b.R(new e3(k2, 1));
        this.f = new j$.time.t(13, this);
    }

    @Override // j$.util.stream.U2, j$.util.Spliterator
    public final Spliterator trySplit() {
        return (j$.util.W) super.trySplit();
    }

    @Override // j$.util.stream.U2, j$.util.Spliterator
    public final j$.util.W trySplit() {
        return (j$.util.W) super.trySplit();
    }

    @Override // j$.util.stream.U2, j$.util.Spliterator
    public final j$.util.c0 trySplit() {
        return (j$.util.W) super.trySplit();
    }

    @Override // j$.util.c0
    public final boolean tryAdvance(IntConsumer intConsumer) {
        int i;
        Objects.requireNonNull(intConsumer);
        boolean a = a();
        if (a) {
            K2 k2 = (K2) this.h;
            long j = this.g;
            int o = k2.o(j);
            if (k2.c == 0 && o == 0) {
                i = ((int[]) k2.e)[(int) j];
            } else {
                i = ((int[][]) k2.f)[o][(int) (j - k2.d[o])];
            }
            intConsumer.accept(i);
        }
        return a;
    }

    @Override // j$.util.c0
    public final void forEachRemaining(IntConsumer intConsumer) {
        if (this.h == null && !this.i) {
            Objects.requireNonNull(intConsumer);
            c();
            Objects.requireNonNull(intConsumer);
            e3 e3Var = new e3(intConsumer, 0);
            this.b.Q(this.d, e3Var);
            this.i = true;
            return;
        }
        while (tryAdvance(intConsumer)) {
        }
    }
}

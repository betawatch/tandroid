package j$.util.stream;

import j$.util.Objects;
import j$.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* loaded from: classes2.dex */
public final class i7 extends x6 implements j$.util.x0 {
    @Override // j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        j$.com.android.tools.r8.a.j(this, consumer);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return j$.com.android.tools.r8.a.A(this, consumer);
    }

    @Override // j$.util.stream.x6
    public final x6 e(Spliterator spliterator) {
        return new i7(this.b, spliterator, this.a);
    }

    @Override // j$.util.stream.x6
    public final void d() {
        o6 o6Var = new o6();
        this.h = o6Var;
        Objects.requireNonNull(o6Var);
        this.e = this.b.G0(new h7(o6Var, 1));
        this.f = new j$.time.t(13, this);
    }

    @Override // j$.util.stream.x6, j$.util.Spliterator
    public final Spliterator trySplit() {
        return (j$.util.x0) super.trySplit();
    }

    @Override // j$.util.stream.x6, j$.util.Spliterator
    public final j$.util.d1 trySplit() {
        return (j$.util.x0) super.trySplit();
    }

    @Override // j$.util.stream.x6, j$.util.Spliterator
    public final j$.util.x0 trySplit() {
        return (j$.util.x0) super.trySplit();
    }

    @Override // j$.util.d1
    public final boolean tryAdvance(IntConsumer intConsumer) {
        int i10;
        Objects.requireNonNull(intConsumer);
        boolean a2 = a();
        if (a2) {
            o6 o6Var = (o6) this.h;
            long j3 = this.g;
            int k10 = o6Var.k(j3);
            if (o6Var.c == 0 && k10 == 0) {
                i10 = ((int[]) o6Var.e)[(int) j3];
            } else {
                i10 = ((int[][]) o6Var.f)[k10][(int) (j3 - o6Var.d[k10])];
            }
            intConsumer.accept(i10);
        }
        return a2;
    }

    @Override // j$.util.d1
    public final void forEachRemaining(IntConsumer intConsumer) {
        if (this.h == null && !this.i) {
            Objects.requireNonNull(intConsumer);
            c();
            Objects.requireNonNull(intConsumer);
            h7 h7Var = new h7(intConsumer, 0);
            this.b.F0(this.d, h7Var);
            this.i = true;
            return;
        }
        while (tryAdvance(intConsumer)) {
        }
    }
}

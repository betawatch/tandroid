package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.DoublePredicate;

/* loaded from: classes2.dex */
public final class r8 extends v8 implements DoubleConsumer, j$.util.u0 {
    public double e;
    public final /* synthetic */ int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r8(Spliterator spliterator, int i10) {
        super(spliterator);
        this.f = i10;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r8(Spliterator spliterator, v8 v8Var, int i10) {
        super(spliterator, v8Var);
        this.f = i10;
    }

    public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer) {
        return j$.com.android.tools.r8.a.b(this, doubleConsumer);
    }

    @Override // j$.util.stream.v8, j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        j$.com.android.tools.r8.a.i(this, consumer);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return j$.com.android.tools.r8.a.z(this, consumer);
    }

    @Override // j$.util.d1
    public final void forEachRemaining(DoubleConsumer doubleConsumer) {
        while (tryAdvance(doubleConsumer)) {
        }
    }

    @Override // java.util.function.DoubleConsumer
    public final void accept(double d) {
        this.d = (this.d + 1) & 63;
        this.e = d;
    }

    @Override // j$.util.stream.v8
    public final Spliterator b(Spliterator spliterator) {
        switch (this.f) {
            case 0:
                return new r8((j$.util.u0) spliterator, this, 0);
            default:
                return new r8((j$.util.u0) spliterator, this, 1);
        }
    }

    @Override // j$.util.stream.v8, j$.util.Spliterator
    public /* bridge */ /* synthetic */ Spliterator trySplit() {
        switch (this.f) {
            case 1:
                return trySplit();
            default:
                return super.trySplit();
        }
    }

    @Override // j$.util.stream.v8, j$.util.Spliterator
    public /* bridge */ /* synthetic */ j$.util.d1 trySplit() {
        switch (this.f) {
            case 1:
                return trySplit();
            default:
                return super.trySplit();
        }
    }

    @Override // j$.util.u0
    public final boolean tryAdvance(DoubleConsumer doubleConsumer) {
        switch (this.f) {
            case 0:
                boolean z10 = this.c;
                Spliterator spliterator = this.a;
                if (z10) {
                    this.c = false;
                    boolean tryAdvance = ((j$.util.u0) spliterator).tryAdvance((DoubleConsumer) this);
                    if (tryAdvance && a()) {
                        DoublePredicate doublePredicate = null;
                        doublePredicate.test(this.e);
                        throw null;
                    }
                    if (!tryAdvance) {
                        return tryAdvance;
                    }
                    doubleConsumer.accept(this.e);
                    return tryAdvance;
                }
                return ((j$.util.u0) spliterator).tryAdvance(doubleConsumer);
            default:
                if (this.c && a() && ((j$.util.u0) this.a).tryAdvance((DoubleConsumer) this)) {
                    DoublePredicate doublePredicate2 = null;
                    doublePredicate2.test(this.e);
                    throw null;
                }
                this.c = false;
                return false;
        }
    }

    @Override // j$.util.stream.v8, j$.util.Spliterator
    public j$.util.u0 trySplit() {
        switch (this.f) {
            case 1:
                if (this.b.get()) {
                    return null;
                }
                return (j$.util.u0) super.trySplit();
            default:
                return super.trySplit();
        }
    }

    @Override // j$.util.d1
    public /* bridge */ /* synthetic */ boolean tryAdvance(Object obj) {
        switch (this.f) {
            case 1:
                tryAdvance((DoubleConsumer) obj);
                return false;
            default:
                return tryAdvance((DoubleConsumer) obj);
        }
    }
}

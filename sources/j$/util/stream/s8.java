package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.IntConsumer;
import java.util.function.IntPredicate;

/* loaded from: classes2.dex */
public final class s8 extends v8 implements IntConsumer, j$.util.x0 {
    public int e;
    public final /* synthetic */ int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s8(Spliterator spliterator, int i9) {
        super(spliterator);
        this.f = i9;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s8(Spliterator spliterator, v8 v8Var, int i9) {
        super(spliterator, v8Var);
        this.f = i9;
    }

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return j$.com.android.tools.r8.a.c(this, intConsumer);
    }

    @Override // j$.util.stream.v8, j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        j$.com.android.tools.r8.a.j(this, consumer);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return j$.com.android.tools.r8.a.A(this, consumer);
    }

    @Override // j$.util.d1
    public final void forEachRemaining(IntConsumer intConsumer) {
        while (tryAdvance(intConsumer)) {
        }
    }

    @Override // java.util.function.IntConsumer
    public final void accept(int i9) {
        this.d = (this.d + 1) & 63;
        this.e = i9;
    }

    @Override // j$.util.stream.v8
    public final Spliterator b(Spliterator spliterator) {
        switch (this.f) {
            case 0:
                return new s8((j$.util.x0) spliterator, this, 0);
            default:
                return new s8((j$.util.x0) spliterator, this, 1);
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

    @Override // j$.util.x0
    public final boolean tryAdvance(IntConsumer intConsumer) {
        switch (this.f) {
            case 0:
                boolean z10 = this.c;
                Spliterator spliterator = this.a;
                if (z10) {
                    this.c = false;
                    boolean tryAdvance = ((j$.util.x0) spliterator).tryAdvance((IntConsumer) this);
                    if (tryAdvance && a()) {
                        IntPredicate intPredicate = null;
                        intPredicate.test(this.e);
                        throw null;
                    }
                    if (!tryAdvance) {
                        return tryAdvance;
                    }
                    intConsumer.accept(this.e);
                    return tryAdvance;
                }
                return ((j$.util.x0) spliterator).tryAdvance(intConsumer);
            default:
                if (this.c && a() && ((j$.util.x0) this.a).tryAdvance((IntConsumer) this)) {
                    IntPredicate intPredicate2 = null;
                    intPredicate2.test(this.e);
                    throw null;
                }
                this.c = false;
                return false;
        }
    }

    @Override // j$.util.stream.v8, j$.util.Spliterator
    public j$.util.x0 trySplit() {
        switch (this.f) {
            case 1:
                if (this.b.get()) {
                    return null;
                }
                return (j$.util.x0) super.trySplit();
            default:
                return super.trySplit();
        }
    }

    @Override // j$.util.d1
    public /* bridge */ /* synthetic */ boolean tryAdvance(Object obj) {
        switch (this.f) {
            case 1:
                tryAdvance((IntConsumer) obj);
                return false;
            default:
                return tryAdvance((IntConsumer) obj);
        }
    }
}

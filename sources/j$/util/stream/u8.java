package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.DoublePredicate;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes4.dex */
public final class u8 extends y8 implements DoubleConsumer, j$.util.u0 {
    public double e;
    public final /* synthetic */ byte f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u8(Spliterator spliterator, byte b) {
        super(spliterator);
        this.f = b;
    }

    @Override // java.util.function.DoubleConsumer
    public final void accept(double d) {
        this.d = (this.d + 1) & 63;
        this.e = d;
    }

    public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer) {
        return j$.time.a.b(this, doubleConsumer);
    }

    @Override // j$.util.stream.y8
    public final Spliterator b(Spliterator spliterator) {
        switch (this.f) {
            case 0:
                return new u8((j$.util.u0) spliterator, this, (byte) 0);
            default:
                return new u8((j$.util.u0) spliterator, this, (byte) 1);
        }
    }

    @Override // j$.util.d1
    public final void forEachRemaining(DoubleConsumer doubleConsumer) {
        while (tryAdvance(doubleConsumer)) {
        }
    }

    @Override // j$.util.u0
    public final boolean tryAdvance(DoubleConsumer doubleConsumer) {
        byte b = this.f;
        Spliterator spliterator = this.a;
        DoublePredicate doublePredicate = null;
        switch (b) {
            case 0:
                if (!this.c) {
                    return ((j$.util.u0) spliterator).tryAdvance(doubleConsumer);
                }
                this.c = false;
                boolean tryAdvance = ((j$.util.u0) spliterator).tryAdvance((DoubleConsumer) this);
                if (!tryAdvance) {
                    return tryAdvance;
                }
                boolean a = a();
                double d = this.e;
                if (a) {
                    doublePredicate.test(d);
                    throw null;
                }
                doubleConsumer.accept(d);
                return tryAdvance;
            default:
                if (this.c && a() && ((j$.util.u0) spliterator).tryAdvance((DoubleConsumer) this)) {
                    doublePredicate.test(this.e);
                    throw null;
                }
                this.c = false;
                return false;
        }
    }

    @Override // j$.util.stream.y8, j$.util.Spliterator
    public final j$.util.u0 trySplit() {
        switch (this.f) {
            case 0:
                return (j$.util.u0) trySplit();
            default:
                if (this.b.get()) {
                    return null;
                }
                return (j$.util.u0) super.trySplit();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u8(Spliterator spliterator, y8 y8Var, byte b) {
        super(spliterator, y8Var);
        this.f = b;
    }

    @Override // j$.util.stream.y8, j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        j$.time.a.h(this, consumer);
    }

    @Override // j$.util.stream.y8, j$.util.Spliterator
    public final /* bridge */ /* synthetic */ Spliterator trySplit() {
        switch (this.f) {
            case 1:
                return trySplit();
            default:
                return super.trySplit();
        }
    }

    @Override // j$.util.stream.y8, j$.util.Spliterator
    public final /* bridge */ /* synthetic */ j$.util.d1 trySplit() {
        switch (this.f) {
            case 0:
                return (j$.util.d1) trySplit();
            default:
                return trySplit();
        }
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return j$.time.a.y(this, consumer);
    }

    @Override // j$.util.d1
    public final /* bridge */ /* synthetic */ boolean tryAdvance(Object obj) {
        switch (this.f) {
            case 1:
                tryAdvance((DoubleConsumer) obj);
                return false;
            default:
                return tryAdvance((DoubleConsumer) obj);
        }
    }
}

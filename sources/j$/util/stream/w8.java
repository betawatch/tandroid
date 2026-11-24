package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.LongConsumer;
import java.util.function.LongPredicate;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes4.dex */
public final class w8 extends y8 implements LongConsumer, j$.util.a1 {
    public long e;
    public final /* synthetic */ byte f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w8(Spliterator spliterator, byte b) {
        super(spliterator);
        this.f = b;
    }

    @Override // java.util.function.LongConsumer
    public final void accept(long j) {
        this.d = (this.d + 1) & 63;
        this.e = j;
    }

    public final /* synthetic */ LongConsumer andThen(LongConsumer longConsumer) {
        return j$.time.a.c(this, longConsumer);
    }

    @Override // j$.util.stream.y8
    public final Spliterator b(Spliterator spliterator) {
        switch (this.f) {
            case 0:
                return new w8((j$.util.a1) spliterator, this, (byte) 0);
            default:
                return new w8((j$.util.a1) spliterator, this, (byte) 1);
        }
    }

    @Override // j$.util.d1
    public final void forEachRemaining(LongConsumer longConsumer) {
        while (tryAdvance(longConsumer)) {
        }
    }

    @Override // j$.util.a1
    public final boolean tryAdvance(LongConsumer longConsumer) {
        byte b = this.f;
        Spliterator spliterator = this.a;
        LongPredicate longPredicate = null;
        switch (b) {
            case 0:
                if (!this.c) {
                    return ((j$.util.a1) spliterator).tryAdvance(longConsumer);
                }
                this.c = false;
                boolean tryAdvance = ((j$.util.a1) spliterator).tryAdvance((LongConsumer) this);
                if (!tryAdvance) {
                    return tryAdvance;
                }
                boolean a = a();
                long j = this.e;
                if (a) {
                    longPredicate.test(j);
                    throw null;
                }
                longConsumer.accept(j);
                return tryAdvance;
            default:
                if (this.c && a() && ((j$.util.a1) spliterator).tryAdvance((LongConsumer) this)) {
                    longPredicate.test(this.e);
                    throw null;
                }
                this.c = false;
                return false;
        }
    }

    @Override // j$.util.stream.y8, j$.util.Spliterator
    public final j$.util.a1 trySplit() {
        switch (this.f) {
            case 0:
                return (j$.util.a1) trySplit();
            default:
                if (this.b.get()) {
                    return null;
                }
                return (j$.util.a1) super.trySplit();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w8(Spliterator spliterator, y8 y8Var, byte b) {
        super(spliterator, y8Var);
        this.f = b;
    }

    @Override // j$.util.stream.y8, j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        j$.time.a.j(this, consumer);
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
        return j$.time.a.A(this, consumer);
    }

    @Override // j$.util.d1
    public final /* bridge */ /* synthetic */ boolean tryAdvance(Object obj) {
        switch (this.f) {
            case 1:
                tryAdvance((LongConsumer) obj);
                return false;
            default:
                return tryAdvance((LongConsumer) obj);
        }
    }
}

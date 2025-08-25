package j$.util.stream;

import j$.util.Spliterator;
import j$.util.function.Consumer$-CC;
import java.util.function.Consumer;
import java.util.function.Predicate;

/* loaded from: classes2.dex */
final class g4 extends h4 implements Consumer {
    final Predicate e;
    Object f;
    public final /* synthetic */ int g;

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$-CC.$default$andThen(this, consumer);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g4(Spliterator spliterator, Predicate predicate, int i) {
        super(spliterator);
        this.g = i;
        this.e = predicate;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g4(Spliterator spliterator, g4 g4Var, int i) {
        super(spliterator, g4Var);
        this.g = i;
        this.e = g4Var.e;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        this.d = (this.d + 1) & 63;
        this.f = obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0059, code lost:
    
        if (r0 == false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x005b, code lost:
    
        r6.b.set(true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0060, code lost:
    
        r7.accept(r6.f);
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:?, code lost:
    
        return r2;
     */
    @Override // j$.util.Spliterator
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean tryAdvance(Consumer consumer) {
        boolean tryAdvance;
        boolean z;
        switch (this.g) {
            case 0:
                boolean z2 = this.c;
                Spliterator spliterator = this.a;
                if (z2) {
                    boolean z3 = false;
                    this.c = false;
                    while (true) {
                        tryAdvance = spliterator.tryAdvance(this);
                        if (tryAdvance && b() && this.e.test(this.f)) {
                            z3 = true;
                        }
                    }
                    return tryAdvance;
                }
                return spliterator.tryAdvance(consumer);
            default:
                if (this.c && b() && this.a.tryAdvance(this)) {
                    z = this.e.test(this.f);
                    if (z) {
                        consumer.accept(this.f);
                        return true;
                    }
                } else {
                    z = true;
                }
                this.c = false;
                if (!z) {
                    this.b.set(true);
                }
                return false;
        }
    }

    @Override // j$.util.stream.h4, j$.util.Spliterator
    public Spliterator trySplit() {
        switch (this.g) {
            case 1:
                if (!this.b.get()) {
                    break;
                }
                break;
        }
        return super.trySplit();
    }

    @Override // j$.util.stream.h4
    final Spliterator c(Spliterator spliterator) {
        switch (this.g) {
            case 0:
                return new g4(spliterator, this, 0);
            default:
                return new g4(spliterator, this, 1);
        }
    }
}

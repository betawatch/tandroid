package j$.util.stream;

import j$.util.Spliterator;
import j$.util.function.Consumer$-CC;
import java.util.function.Consumer;
import java.util.function.Predicate;

/* loaded from: classes2.dex */
public final class u8 extends v8 implements Consumer {
    public final Predicate e;
    public Object f;
    public final /* synthetic */ int g;

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$-CC.$default$andThen(this, consumer);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u8(Spliterator spliterator, Predicate predicate, int i10) {
        super(spliterator);
        this.g = i10;
        this.e = predicate;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u8(Spliterator spliterator, u8 u8Var, int i10) {
        super(spliterator, u8Var);
        this.g = i10;
        this.e = u8Var.e;
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
        boolean z10;
        switch (this.g) {
            case 0:
                boolean z11 = this.c;
                Spliterator spliterator = this.a;
                if (z11) {
                    boolean z12 = false;
                    this.c = false;
                    while (true) {
                        tryAdvance = spliterator.tryAdvance(this);
                        if (tryAdvance && a() && this.e.test(this.f)) {
                            z12 = true;
                        }
                    }
                    return tryAdvance;
                }
                return spliterator.tryAdvance(consumer);
            default:
                if (this.c && a() && this.a.tryAdvance(this)) {
                    z10 = this.e.test(this.f);
                    if (z10) {
                        consumer.accept(this.f);
                        return true;
                    }
                } else {
                    z10 = true;
                }
                this.c = false;
                if (!z10) {
                    this.b.set(true);
                }
                return false;
        }
    }

    @Override // j$.util.stream.v8, j$.util.Spliterator
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

    @Override // j$.util.stream.v8
    public final Spliterator b(Spliterator spliterator) {
        switch (this.g) {
            case 0:
                return new u8(spliterator, this, 0);
            default:
                return new u8(spliterator, this, 1);
        }
    }
}

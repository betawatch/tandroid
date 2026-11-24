package j$.util.stream;

import j$.util.Spliterator;
import j$.util.function.Consumer$-CC;
import java.util.function.Consumer;
import java.util.function.Predicate;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes4.dex */
public final class x8 extends y8 implements Consumer {
    public final Predicate e;
    public Object f;
    public final /* synthetic */ byte g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x8(Spliterator spliterator, x8 x8Var, byte b) {
        super(spliterator, x8Var);
        this.g = b;
        this.e = x8Var.e;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        this.d = (this.d + 1) & 63;
        this.f = obj;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$-CC.$default$andThen(this, consumer);
    }

    @Override // j$.util.stream.y8
    public final Spliterator b(Spliterator spliterator) {
        switch (this.g) {
            case 0:
                return new x8(spliterator, this, (byte) 0);
            default:
                return new x8(spliterator, this, (byte) 1);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0053, code lost:
    
        if (r4 == false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0055, code lost:
    
        r6.b.set(true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x005a, code lost:
    
        r7.accept(r6.f);
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:?, code lost:
    
        return r0;
     */
    @Override // j$.util.Spliterator
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean tryAdvance(Consumer consumer) {
        boolean tryAdvance;
        boolean z;
        byte b = this.g;
        Predicate predicate = this.e;
        Spliterator spliterator = this.a;
        boolean z2 = false;
        switch (b) {
            case 0:
                if (!this.c) {
                    return spliterator.tryAdvance(consumer);
                }
                this.c = false;
                while (true) {
                    tryAdvance = spliterator.tryAdvance(this);
                    if (tryAdvance && a() && predicate.test(this.f)) {
                        z2 = true;
                    }
                }
                return tryAdvance;
            default:
                if (this.c && a() && spliterator.tryAdvance(this)) {
                    z = predicate.test(this.f);
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

    @Override // j$.util.stream.y8, j$.util.Spliterator
    public final Spliterator trySplit() {
        switch (this.g) {
            case 1:
                if (!this.b.get()) {
                    break;
                }
                break;
        }
        return super.trySplit();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x8(Spliterator spliterator, Predicate predicate, byte b) {
        super(spliterator);
        this.g = b;
        this.e = predicate;
    }
}

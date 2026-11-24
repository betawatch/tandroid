package j$.util;

import j$.util.function.IntConsumer$-CC;
import java.util.NoSuchElementException;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes4.dex */
public final class g1 implements l0, IntConsumer, y {
    public boolean a = false;
    public int b;
    public final /* synthetic */ x0 c;

    public g1(x0 x0Var) {
        this.c = x0Var;
    }

    @Override // java.util.function.IntConsumer
    public final void accept(int i) {
        this.a = true;
        this.b = i;
    }

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return IntConsumer$-CC.$default$andThen(this, intConsumer);
    }

    @Override // j$.util.l0, java.util.Iterator, j$.util.y
    public final void forEachRemaining(Consumer consumer) {
        if (consumer instanceof IntConsumer) {
            forEachRemaining((IntConsumer) consumer);
            return;
        }
        Objects.requireNonNull(consumer);
        if (u1.a) {
            u1.a(g1.class, "{0} calling PrimitiveIterator.OfInt.forEachRemainingInt(action::accept)");
            throw null;
        }
        Objects.requireNonNull(consumer);
        forEachRemaining((IntConsumer) new i0(consumer, (byte) 0));
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (!this.a) {
            this.c.tryAdvance((IntConsumer) this);
        }
        return this.a;
    }

    @Override // java.util.Iterator
    public final Integer next() {
        if (!u1.a) {
            return Integer.valueOf(nextInt());
        }
        u1.a(g1.class, "{0} calling PrimitiveIterator.OfInt.nextInt()");
        throw null;
    }

    @Override // j$.util.l0
    public final int nextInt() {
        if (!this.a && !hasNext()) {
            throw new NoSuchElementException();
        }
        this.a = false;
        return this.b;
    }

    @Override // j$.util.q0
    public final void forEachRemaining(IntConsumer intConsumer) {
        Objects.requireNonNull(intConsumer);
        while (hasNext()) {
            intConsumer.accept(nextInt());
        }
    }
}

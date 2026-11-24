package j$.util;

import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.function.Consumer;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes4.dex */
public final class a implements Spliterator {
    public final java.util.List a;
    public int b;
    public int c;

    public a(java.util.List list) {
        this.a = list;
        this.b = 0;
        this.c = -1;
    }

    public final int a() {
        java.util.List list = this.a;
        int i = this.c;
        if (i >= 0) {
            return i;
        }
        int size = list.size();
        this.c = size;
        return size;
    }

    @Override // j$.util.Spliterator
    public final int characteristics() {
        return 16464;
    }

    @Override // j$.util.Spliterator
    public final long estimateSize() {
        return a() - this.b;
    }

    @Override // j$.util.Spliterator
    public final void forEachRemaining(Consumer consumer) {
        Objects.requireNonNull(consumer);
        java.util.List list = this.a;
        int a = a();
        this.b = a;
        for (int i = this.b; i < a; i++) {
            try {
                consumer.x(list.get(i));
            } catch (IndexOutOfBoundsException unused) {
                throw new ConcurrentModificationException();
            }
        }
    }

    @Override // j$.util.Spliterator
    public final Comparator getComparator() {
        throw new IllegalStateException();
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ long getExactSizeIfKnown() {
        return j$.time.a.m(this);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean hasCharacteristics(int i) {
        return j$.time.a.o(this, i);
    }

    @Override // j$.util.Spliterator
    public final boolean tryAdvance(Consumer consumer) {
        consumer.getClass();
        int a = a();
        int i = this.b;
        if (i >= a) {
            return false;
        }
        this.b = i + 1;
        try {
            consumer.x(this.a.get(i));
            return true;
        } catch (IndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // j$.util.Spliterator
    public final Spliterator trySplit() {
        int a = a();
        int i = this.b;
        int i2 = (a + i) >>> 1;
        if (i >= i2) {
            return null;
        }
        this.b = i2;
        return new a(this, i, i2);
    }

    public a(a aVar, int i, int i2) {
        this.a = aVar.a;
        this.b = i;
        this.c = i2;
    }
}

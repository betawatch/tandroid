package j$.util;

import java.util.Comparator;
import java.util.Iterator;
import java.util.function.Consumer;

/* loaded from: classes2.dex */
public class q1 implements Spliterator {
    public final java.util.Collection a;
    public Iterator b = null;
    public final int c;
    public long d;
    public int e;

    @Override // j$.util.Spliterator
    public final /* synthetic */ long getExactSizeIfKnown() {
        return j$.com.android.tools.r8.a.n(this);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean hasCharacteristics(int i9) {
        return j$.com.android.tools.r8.a.p(this, i9);
    }

    public q1(java.util.Collection collection, int i9) {
        this.a = collection;
        this.c = (i9 & 4096) == 0 ? i9 | 16448 : i9;
    }

    @Override // j$.util.Spliterator
    public final Spliterator trySplit() {
        long j10;
        Iterator it = this.b;
        if (it == null) {
            it = this.a.iterator();
            this.b = it;
            j10 = this.a.size();
            this.d = j10;
        } else {
            j10 = this.d;
        }
        if (j10 <= 1 || !it.hasNext()) {
            return null;
        }
        int i9 = this.e + 1024;
        if (i9 > j10) {
            i9 = (int) j10;
        }
        if (i9 > 33554432) {
            i9 = 33554432;
        }
        Object[] objArr = new Object[i9];
        int i10 = 0;
        do {
            objArr[i10] = it.next();
            i10++;
            if (i10 >= i9) {
                break;
            }
        } while (it.hasNext());
        this.e = i10;
        long j11 = this.d;
        if (j11 != Long.MAX_VALUE) {
            this.d = j11 - i10;
        }
        return new j1(objArr, 0, i10, this.c);
    }

    @Override // j$.util.Spliterator
    public final void forEachRemaining(Consumer consumer) {
        consumer.getClass();
        Iterator it = this.b;
        if (it == null) {
            it = this.a.iterator();
            this.b = it;
            this.d = this.a.size();
        }
        j$.com.android.tools.r8.a.M(it, consumer);
    }

    @Override // j$.util.Spliterator
    public final boolean tryAdvance(Consumer consumer) {
        consumer.getClass();
        if (this.b == null) {
            this.b = this.a.iterator();
            this.d = this.a.size();
        }
        if (!this.b.hasNext()) {
            return false;
        }
        consumer.accept(this.b.next());
        return true;
    }

    @Override // j$.util.Spliterator
    public final long estimateSize() {
        if (this.b == null) {
            this.b = this.a.iterator();
            long size = this.a.size();
            this.d = size;
            return size;
        }
        return this.d;
    }

    @Override // j$.util.Spliterator
    public final int characteristics() {
        return this.c;
    }

    @Override // j$.util.Spliterator
    public Comparator getComparator() {
        if (j$.com.android.tools.r8.a.p(this, 4)) {
            return null;
        }
        throw new IllegalStateException();
    }
}

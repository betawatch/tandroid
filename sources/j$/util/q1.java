package j$.util;

import java.util.Comparator;
import java.util.Iterator;
import java.util.function.Consumer;
import org.telegram.tgnet.TLObject;

/* loaded from: classes2.dex */
public class q1 implements Spliterator {
    public final java.util.Collection a;
    public Iterator b = null;
    public final int c;
    public long d;
    public int e;

    @Override // j$.util.Spliterator
    public final /* synthetic */ long getExactSizeIfKnown() {
        return j$.com.android.tools.r8.a.m(this);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean hasCharacteristics(int i7) {
        return j$.com.android.tools.r8.a.o(this, i7);
    }

    public q1(java.util.Collection collection, int i7) {
        this.a = collection;
        this.c = (i7 & TLObject.FLAG_12) == 0 ? i7 | 16448 : i7;
    }

    @Override // j$.util.Spliterator
    public final Spliterator trySplit() {
        long j3;
        Iterator it = this.b;
        if (it == null) {
            it = this.a.iterator();
            this.b = it;
            j3 = this.a.size();
            this.d = j3;
        } else {
            j3 = this.d;
        }
        if (j3 <= 1 || !it.hasNext()) {
            return null;
        }
        int i7 = this.e + 1024;
        if (i7 > j3) {
            i7 = (int) j3;
        }
        if (i7 > 33554432) {
            i7 = 33554432;
        }
        Object[] objArr = new Object[i7];
        int i10 = 0;
        do {
            objArr[i10] = it.next();
            i10++;
            if (i10 >= i7) {
                break;
            }
        } while (it.hasNext());
        this.e = i10;
        long j10 = this.d;
        if (j10 != Long.MAX_VALUE) {
            this.d = j10 - i10;
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
        j$.com.android.tools.r8.a.L(it, consumer);
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
        if (j$.com.android.tools.r8.a.o(this, 4)) {
            return null;
        }
        throw new IllegalStateException();
    }
}

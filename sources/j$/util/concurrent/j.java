package j$.util.concurrent;

import j$.util.Spliterator;
import java.util.Comparator;
import java.util.function.Consumer;

/* loaded from: classes2.dex */
public final class j extends p implements Spliterator {
    public final /* synthetic */ int i;
    public long j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(l[] lVarArr, int i7, int i10, int i11, long j3, int i12) {
        super(lVarArr, i7, i10, i11);
        this.i = i12;
        this.j = j3;
    }

    @Override // j$.util.Spliterator
    public final int characteristics() {
        switch (this.i) {
            case 0:
                return 4353;
            default:
                return 4352;
        }
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ long getExactSizeIfKnown() {
        switch (this.i) {
        }
        return j$.com.android.tools.r8.a.m(this);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean hasCharacteristics(int i7) {
        switch (this.i) {
        }
        return j$.com.android.tools.r8.a.o(this, i7);
    }

    @Override // j$.util.Spliterator
    public final Comparator getComparator() {
        switch (this.i) {
            case 0:
                throw new IllegalStateException();
            default:
                throw new IllegalStateException();
        }
    }

    @Override // j$.util.Spliterator
    public final Spliterator trySplit() {
        switch (this.i) {
            case 0:
                int i7 = this.f;
                int i10 = this.g;
                int i11 = (i7 + i10) >>> 1;
                if (i11 <= i7) {
                    return null;
                }
                l[] lVarArr = this.a;
                this.g = i11;
                long j3 = this.j >>> 1;
                this.j = j3;
                return new j(lVarArr, this.h, i11, i10, j3, 0);
            default:
                int i12 = this.f;
                int i13 = this.g;
                int i14 = (i12 + i13) >>> 1;
                if (i14 <= i12) {
                    return null;
                }
                l[] lVarArr2 = this.a;
                this.g = i14;
                long j10 = this.j >>> 1;
                this.j = j10;
                return new j(lVarArr2, this.h, i14, i13, j10, 1);
        }
    }

    @Override // j$.util.Spliterator
    public final void forEachRemaining(Consumer consumer) {
        switch (this.i) {
            case 0:
                consumer.getClass();
                while (true) {
                    l a10 = a();
                    if (a10 == null) {
                        break;
                    } else {
                        consumer.x(a10.b);
                    }
                }
            default:
                consumer.getClass();
                while (true) {
                    l a11 = a();
                    if (a11 == null) {
                        break;
                    } else {
                        consumer.x(a11.c);
                    }
                }
        }
    }

    @Override // j$.util.Spliterator
    public final boolean tryAdvance(Consumer consumer) {
        switch (this.i) {
            case 0:
                consumer.getClass();
                l a10 = a();
                if (a10 != null) {
                    consumer.x(a10.b);
                    break;
                }
                break;
            default:
                consumer.getClass();
                l a11 = a();
                if (a11 != null) {
                    consumer.x(a11.c);
                    break;
                }
                break;
        }
        return true;
    }

    @Override // j$.util.Spliterator
    public final long estimateSize() {
        switch (this.i) {
        }
        return this.j;
    }
}

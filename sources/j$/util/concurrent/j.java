package j$.util.concurrent;

import j$.util.Spliterator;
import java.util.Comparator;
import java.util.function.Consumer;

/* loaded from: classes2.dex */
public final class j extends p implements Spliterator {
    public final /* synthetic */ int i;
    public long j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(l[] lVarArr, int i9, int i10, int i11, long j10, int i12) {
        super(lVarArr, i9, i10, i11);
        this.i = i12;
        this.j = j10;
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
        return j$.com.android.tools.r8.a.n(this);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean hasCharacteristics(int i9) {
        switch (this.i) {
        }
        return j$.com.android.tools.r8.a.p(this, i9);
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
                int i9 = this.f;
                int i10 = this.g;
                int i11 = (i9 + i10) >>> 1;
                if (i11 <= i9) {
                    return null;
                }
                l[] lVarArr = this.a;
                this.g = i11;
                long j10 = this.j >>> 1;
                this.j = j10;
                return new j(lVarArr, this.h, i11, i10, j10, 0);
            default:
                int i12 = this.f;
                int i13 = this.g;
                int i14 = (i12 + i13) >>> 1;
                if (i14 <= i12) {
                    return null;
                }
                l[] lVarArr2 = this.a;
                this.g = i14;
                long j11 = this.j >>> 1;
                this.j = j11;
                return new j(lVarArr2, this.h, i14, i13, j11, 1);
        }
    }

    @Override // j$.util.Spliterator
    public final void forEachRemaining(Consumer consumer) {
        switch (this.i) {
            case 0:
                consumer.getClass();
                while (true) {
                    l a2 = a();
                    if (a2 == null) {
                        break;
                    } else {
                        consumer.x(a2.b);
                    }
                }
            default:
                consumer.getClass();
                while (true) {
                    l a3 = a();
                    if (a3 == null) {
                        break;
                    } else {
                        consumer.x(a3.c);
                    }
                }
        }
    }

    @Override // j$.util.Spliterator
    public final boolean tryAdvance(Consumer consumer) {
        switch (this.i) {
            case 0:
                consumer.getClass();
                l a2 = a();
                if (a2 != null) {
                    consumer.x(a2.b);
                    break;
                }
                break;
            default:
                consumer.getClass();
                l a3 = a();
                if (a3 != null) {
                    consumer.x(a3.c);
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

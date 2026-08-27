package j$.util.concurrent;

import j$.util.Spliterator;
import java.util.Comparator;
import java.util.function.Consumer;

/* loaded from: classes2.dex */
public final class j extends p implements Spliterator {
    public final /* synthetic */ int i;
    public long j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(l[] lVarArr, int i10, int i11, int i12, long j10, int i13) {
        super(lVarArr, i10, i11, i12);
        this.i = i13;
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
    public final /* synthetic */ boolean hasCharacteristics(int i10) {
        switch (this.i) {
        }
        return j$.com.android.tools.r8.a.p(this, i10);
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
                int i10 = this.f;
                int i11 = this.g;
                int i12 = (i10 + i11) >>> 1;
                if (i12 <= i10) {
                    return null;
                }
                l[] lVarArr = this.a;
                this.g = i12;
                long j10 = this.j >>> 1;
                this.j = j10;
                return new j(lVarArr, this.h, i12, i11, j10, 0);
            default:
                int i13 = this.f;
                int i14 = this.g;
                int i15 = (i13 + i14) >>> 1;
                if (i15 <= i13) {
                    return null;
                }
                l[] lVarArr2 = this.a;
                this.g = i15;
                long j11 = this.j >>> 1;
                this.j = j11;
                return new j(lVarArr2, this.h, i15, i14, j11, 1);
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

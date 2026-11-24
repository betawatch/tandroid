package j$.util.concurrent;

import j$.util.Spliterator;
import java.util.Comparator;
import java.util.function.Consumer;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes4.dex */
public final class i extends o implements Spliterator {
    public final /* synthetic */ byte i;
    public long j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(k[] kVarArr, int i, int i2, int i3, long j, byte b) {
        super(kVarArr, i, i2, i3);
        this.i = b;
        this.j = j;
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
    public final long estimateSize() {
        switch (this.i) {
        }
        return this.j;
    }

    @Override // j$.util.Spliterator
    public final void forEachRemaining(Consumer consumer) {
        switch (this.i) {
            case 0:
                consumer.getClass();
                while (true) {
                    k a = a();
                    if (a == null) {
                        break;
                    } else {
                        consumer.x(a.b);
                    }
                }
            default:
                consumer.getClass();
                while (true) {
                    k a2 = a();
                    if (a2 == null) {
                        break;
                    } else {
                        consumer.x(a2.c);
                    }
                }
        }
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
    public final /* synthetic */ long getExactSizeIfKnown() {
        switch (this.i) {
        }
        return j$.time.a.m(this);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean hasCharacteristics(int i) {
        switch (this.i) {
        }
        return j$.time.a.o(this, i);
    }

    @Override // j$.util.Spliterator
    public final boolean tryAdvance(Consumer consumer) {
        switch (this.i) {
            case 0:
                consumer.getClass();
                k a = a();
                if (a != null) {
                    consumer.x(a.b);
                    break;
                } else {
                    break;
                }
            default:
                consumer.getClass();
                k a2 = a();
                if (a2 != null) {
                    consumer.x(a2.c);
                    break;
                } else {
                    break;
                }
        }
        return true;
    }

    @Override // j$.util.Spliterator
    public final Spliterator trySplit() {
        switch (this.i) {
            case 0:
                int i = this.f;
                int i2 = this.g;
                int i3 = (i + i2) >>> 1;
                if (i3 <= i) {
                    return null;
                }
                k[] kVarArr = this.a;
                this.g = i3;
                long j = this.j >>> 1;
                this.j = j;
                return new i(kVarArr, this.h, i3, i2, j, (byte) 0);
            default:
                int i4 = this.f;
                int i5 = this.g;
                int i6 = (i4 + i5) >>> 1;
                if (i6 <= i4) {
                    return null;
                }
                k[] kVarArr2 = this.a;
                this.g = i6;
                long j2 = this.j >>> 1;
                this.j = j2;
                return new i(kVarArr2, this.h, i6, i5, j2, (byte) 1);
        }
    }
}

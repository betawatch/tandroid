package j$.util.stream;

import j$.util.Spliterators;
import java.util.Arrays;
import java.util.Iterator;
import java.util.function.Consumer;
import java.util.function.LongConsumer;
import org.telegram.messenger.NotificationCenter;

/* loaded from: classes2.dex */
class T2 extends V2 implements LongConsumer {
    public final /* synthetic */ LongConsumer andThen(LongConsumer longConsumer) {
        return j$.com.android.tools.r8.a.c(this, longConsumer);
    }

    @Override // j$.util.stream.V2
    protected final void s(Object obj, int i, int i2, Object obj2) {
        long[] jArr = (long[]) obj;
        LongConsumer longConsumer = (LongConsumer) obj2;
        while (i < i2) {
            longConsumer.accept(jArr[i]);
            i++;
        }
    }

    @Override // j$.util.stream.V2
    protected final int t(Object obj) {
        return ((long[]) obj).length;
    }

    @Override // java.lang.Iterable, j$.lang.a
    public final void forEach(Consumer consumer) {
        if (consumer instanceof LongConsumer) {
            e((LongConsumer) consumer);
        } else {
            if (J3.a) {
                J3.a(getClass(), "{0} calling SpinedBuffer.OfLong.forEach(Consumer)");
                throw null;
            }
            j$.util.S.c((S2) spliterator(), consumer);
        }
    }

    @Override // j$.util.stream.V2
    protected final Object[] w() {
        return new long[8][];
    }

    @Override // j$.util.stream.V2
    public final Object c(int i) {
        return new long[i];
    }

    @Override // java.util.function.LongConsumer
    public void accept(long j) {
        x();
        long[] jArr = (long[]) this.e;
        int i = this.b;
        this.b = i + 1;
        jArr[i] = j;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return Spliterators.h(spliterator());
    }

    @Override // j$.util.stream.V2, java.lang.Iterable
    /* renamed from: y, reason: merged with bridge method [inline-methods] */
    public j$.util.b0 spliterator() {
        return new S2(this, 0, this.c, 0, this.b);
    }

    public final String toString() {
        long[] jArr = (long[]) d();
        if (jArr.length < 200) {
            return String.format("%s[length=%d, chunks=%d]%s", getClass().getSimpleName(), Integer.valueOf(jArr.length), Integer.valueOf(this.c), Arrays.toString(jArr));
        }
        return String.format("%s[length=%d, chunks=%d]%s...", getClass().getSimpleName(), Integer.valueOf(jArr.length), Integer.valueOf(this.c), Arrays.toString(Arrays.copyOf(jArr, NotificationCenter.userIsPremiumBlockedUpadted)));
    }
}

package j$.util.stream;

import j$.util.Objects;
import java.util.Arrays;
import java.util.Iterator;
import java.util.function.Consumer;
import java.util.function.LongConsumer;
import org.telegram.messenger.NotificationCenter;

/* loaded from: classes2.dex */
public class N2 extends P2 implements LongConsumer {
    public final /* synthetic */ LongConsumer andThen(LongConsumer longConsumer) {
        return j$.com.android.tools.r8.a.d(this, longConsumer);
    }

    @Override // j$.util.stream.P2
    public final void k(Object obj, int i, int i2, Object obj2) {
        long[] jArr = (long[]) obj;
        LongConsumer longConsumer = (LongConsumer) obj2;
        while (i < i2) {
            longConsumer.accept(jArr[i]);
            i++;
        }
    }

    @Override // j$.util.stream.P2
    public final int l(Object obj) {
        return ((long[]) obj).length;
    }

    @Override // java.lang.Iterable
    public final void forEach(Consumer consumer) {
        if (consumer instanceof LongConsumer) {
            e((LongConsumer) consumer);
        } else {
            if (A3.a) {
                A3.a(getClass(), "{0} calling SpinedBuffer.OfLong.forEach(Consumer)");
                throw null;
            }
            j$.com.android.tools.r8.a.k((M2) spliterator(), consumer);
        }
    }

    @Override // j$.util.stream.P2
    public final Object[] q() {
        return new long[8][];
    }

    @Override // j$.util.stream.P2
    public final Object c(int i) {
        return new long[i];
    }

    @Override // java.util.function.LongConsumer
    public void accept(long j) {
        r();
        long[] jArr = (long[]) this.e;
        int i = this.b;
        this.b = i + 1;
        jArr[i] = j;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        j$.util.Z spliterator = spliterator();
        Objects.requireNonNull(spliterator);
        return new j$.util.g0(spliterator);
    }

    @Override // j$.util.stream.P2, java.lang.Iterable
    /* renamed from: t, reason: merged with bridge method [inline-methods] */
    public j$.util.Z spliterator() {
        return new M2(this, 0, this.c, 0, this.b);
    }

    public final String toString() {
        long[] jArr = (long[]) d();
        if (jArr.length < 200) {
            return String.format("%s[length=%d, chunks=%d]%s", getClass().getSimpleName(), Integer.valueOf(jArr.length), Integer.valueOf(this.c), Arrays.toString(jArr));
        }
        return String.format("%s[length=%d, chunks=%d]%s...", getClass().getSimpleName(), Integer.valueOf(jArr.length), Integer.valueOf(this.c), Arrays.toString(Arrays.copyOf(jArr, NotificationCenter.dialogPhotosUpdate)));
    }
}

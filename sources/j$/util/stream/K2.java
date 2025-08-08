package j$.util.stream;

import j$.util.Spliterators;
import j$.util.function.Consumer;
import java.util.Arrays;
import java.util.Iterator;
import org.telegram.messenger.NotificationCenter;

/* loaded from: classes2.dex */
class K2 extends M2 implements j$.util.function.Y {
    @Override // j$.util.function.Y
    public final /* synthetic */ j$.util.function.Y f(j$.util.function.Y y) {
        return j$.com.android.tools.r8.a.c(this, y);
    }

    @Override // j$.util.stream.M2
    protected final void u(Object obj, int i, int i2, Object obj2) {
        long[] jArr = (long[]) obj;
        j$.util.function.Y y = (j$.util.function.Y) obj2;
        while (i < i2) {
            y.accept(jArr[i]);
            i++;
        }
    }

    @Override // j$.util.stream.M2
    protected final int v(Object obj) {
        return ((long[]) obj).length;
    }

    @Override // j$.lang.a
    public final void forEach(Consumer consumer) {
        if (consumer instanceof j$.util.function.Y) {
            g((j$.util.function.Y) consumer);
        } else {
            if (y3.a) {
                y3.a(getClass(), "{0} calling SpinedBuffer.OfLong.forEach(Consumer)");
                throw null;
            }
            j$.util.A.h((J2) spliterator(), consumer);
        }
    }

    @Override // j$.util.stream.M2
    protected final Object[] y() {
        return new long[8][];
    }

    @Override // j$.util.stream.M2
    public final Object c(int i) {
        return new long[i];
    }

    @Override // j$.util.function.Y
    public void accept(long j) {
        z();
        long[] jArr = (long[]) this.e;
        int i = this.b;
        this.b = i + 1;
        jArr[i] = j;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return Spliterators.h(spliterator());
    }

    @Override // j$.util.stream.M2, java.lang.Iterable
    /* renamed from: A, reason: merged with bridge method [inline-methods] */
    public j$.util.J spliterator() {
        return new J2(this, 0, this.c, 0, this.b);
    }

    public final String toString() {
        long[] jArr = (long[]) e();
        if (jArr.length < 200) {
            return String.format("%s[length=%d, chunks=%d]%s", getClass().getSimpleName(), Integer.valueOf(jArr.length), Integer.valueOf(this.c), Arrays.toString(jArr));
        }
        return String.format("%s[length=%d, chunks=%d]%s...", getClass().getSimpleName(), Integer.valueOf(jArr.length), Integer.valueOf(this.c), Arrays.toString(Arrays.copyOf(jArr, NotificationCenter.savedMessagesForwarded)));
    }
}

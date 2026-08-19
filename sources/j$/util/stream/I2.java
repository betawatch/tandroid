package j$.util.stream;

import j$.util.Objects;
import java.util.Arrays;
import java.util.Iterator;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import org.telegram.messenger.NotificationCenter;

/* loaded from: classes2.dex */
public class I2 extends O2 implements DoubleConsumer {
    public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer) {
        return j$.com.android.tools.r8.a.b(this, doubleConsumer);
    }

    @Override // j$.util.stream.O2
    public final void k(Object obj, int i, int i2, Object obj2) {
        double[] dArr = (double[]) obj;
        DoubleConsumer doubleConsumer = (DoubleConsumer) obj2;
        while (i < i2) {
            doubleConsumer.accept(dArr[i]);
            i++;
        }
    }

    @Override // j$.util.stream.O2
    public final int l(Object obj) {
        return ((double[]) obj).length;
    }

    @Override // java.lang.Iterable, j$.lang.a
    public final void forEach(Consumer consumer) {
        if (consumer instanceof DoubleConsumer) {
            e((DoubleConsumer) consumer);
        } else {
            if (A3.a) {
                A3.a(getClass(), "{0} calling SpinedBuffer.OfDouble.forEach(Consumer)");
                throw null;
            }
            j$.com.android.tools.r8.a.i((H2) spliterator(), consumer);
        }
    }

    @Override // j$.util.stream.O2
    public final Object[] q() {
        return new double[8][];
    }

    @Override // j$.util.stream.O2
    public final Object c(int i) {
        return new double[i];
    }

    @Override // java.util.function.DoubleConsumer
    public void accept(double d) {
        r();
        double[] dArr = (double[]) this.e;
        int i = this.b;
        this.b = i + 1;
        dArr[i] = d;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        j$.util.T spliterator = spliterator();
        Objects.requireNonNull(spliterator);
        return new j$.util.h0(spliterator);
    }

    @Override // j$.util.stream.O2, java.lang.Iterable
    /* renamed from: t, reason: merged with bridge method [inline-methods] */
    public j$.util.T spliterator() {
        return new H2(this, 0, this.c, 0, this.b);
    }

    public final String toString() {
        double[] dArr = (double[]) d();
        if (dArr.length < 200) {
            return String.format("%s[length=%d, chunks=%d]%s", getClass().getSimpleName(), Integer.valueOf(dArr.length), Integer.valueOf(this.c), Arrays.toString(dArr));
        }
        return String.format("%s[length=%d, chunks=%d]%s...", getClass().getSimpleName(), Integer.valueOf(dArr.length), Integer.valueOf(this.c), Arrays.toString(Arrays.copyOf(dArr, NotificationCenter.dialogPhotosUpdate)));
    }
}

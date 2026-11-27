package j$.util.stream;

import j$.util.Objects;
import java.util.Arrays;
import java.util.Iterator;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes4.dex */
public class r6 extends x6 implements DoubleConsumer {
    @Override // java.util.function.DoubleConsumer
    public final void accept(double d) {
        p();
        double[] dArr = (double[]) this.e;
        int i = this.b;
        this.b = i + 1;
        dArr[i] = d;
    }

    public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer) {
        return j$.time.a.b(this, doubleConsumer);
    }

    @Override // java.lang.Iterable
    public final void forEach(Consumer consumer) {
        if (consumer instanceof DoubleConsumer) {
            d((DoubleConsumer) consumer);
        } else {
            if (j8.a) {
                j8.a(getClass(), "{0} calling SpinedBuffer.OfDouble.forEach(Consumer)");
                throw null;
            }
            j$.time.a.h((q6) spliterator(), consumer);
        }
    }

    @Override // j$.util.stream.x6
    public final void i(Object obj, int i, int i2, Object obj2) {
        double[] dArr = (double[]) obj;
        DoubleConsumer doubleConsumer = (DoubleConsumer) obj2;
        while (i < i2) {
            doubleConsumer.accept(dArr[i]);
            i++;
        }
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        j$.util.u0 spliterator = spliterator();
        Objects.requireNonNull(spliterator);
        return new j$.util.i1(spliterator);
    }

    @Override // j$.util.stream.x6
    public final int j(Object obj) {
        return ((double[]) obj).length;
    }

    @Override // j$.util.stream.x6
    public final Object[] m() {
        return new double[8][];
    }

    @Override // j$.util.stream.x6
    public final Object newArray(int i) {
        return new double[i];
    }

    @Override // j$.util.stream.x6, java.lang.Iterable, j$.util.stream.h2
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public j$.util.u0 spliterator() {
        return new q6(this, 0, this.c, 0, this.b);
    }

    public final String toString() {
        double[] dArr = (double[]) b();
        if (dArr.length < 200) {
            return String.format("%s[length=%d, chunks=%d]%s", getClass().getSimpleName(), Integer.valueOf(dArr.length), Integer.valueOf(this.c), Arrays.toString(dArr));
        }
        return String.format("%s[length=%d, chunks=%d]%s...", getClass().getSimpleName(), Integer.valueOf(dArr.length), Integer.valueOf(this.c), Arrays.toString(Arrays.copyOf(dArr, jn7.d3)));
    }
}

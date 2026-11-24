package j$.util.stream;

import j$.util.Objects;
import j$.util.function.IntConsumer$-CC;
import java.util.Arrays;
import java.util.Iterator;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes4.dex */
public class t6 extends x6 implements IntConsumer {
    @Override // java.util.function.IntConsumer
    public final void accept(int i) {
        p();
        int[] iArr = (int[]) this.e;
        int i2 = this.b;
        this.b = i2 + 1;
        iArr[i2] = i;
    }

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return IntConsumer$-CC.$default$andThen(this, intConsumer);
    }

    @Override // java.lang.Iterable
    public final void forEach(Consumer consumer) {
        if (consumer instanceof IntConsumer) {
            d((IntConsumer) consumer);
        } else {
            if (j8.a) {
                j8.a(getClass(), "{0} calling SpinedBuffer.OfInt.forEach(Consumer)");
                throw null;
            }
            j$.time.a.i((s6) spliterator(), consumer);
        }
    }

    @Override // j$.util.stream.x6
    public final void i(Object obj, int i, int i2, Object obj2) {
        int[] iArr = (int[]) obj;
        IntConsumer intConsumer = (IntConsumer) obj2;
        while (i < i2) {
            intConsumer.accept(iArr[i]);
            i++;
        }
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        j$.util.x0 spliterator = spliterator();
        Objects.requireNonNull(spliterator);
        return new j$.util.g1(spliterator);
    }

    @Override // j$.util.stream.x6
    public final int j(Object obj) {
        return ((int[]) obj).length;
    }

    @Override // j$.util.stream.x6
    public final Object[] m() {
        return new int[8][];
    }

    @Override // j$.util.stream.x6
    public final Object newArray(int i) {
        return new int[i];
    }

    @Override // j$.util.stream.x6, java.lang.Iterable, j$.util.stream.h2
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public j$.util.x0 spliterator() {
        return new s6(this, 0, this.c, 0, this.b);
    }

    public final String toString() {
        int[] iArr = (int[]) b();
        if (iArr.length < 200) {
            return String.format("%s[length=%d, chunks=%d]%s", getClass().getSimpleName(), Integer.valueOf(iArr.length), Integer.valueOf(this.c), Arrays.toString(iArr));
        }
        return String.format("%s[length=%d, chunks=%d]%s...", getClass().getSimpleName(), Integer.valueOf(iArr.length), Integer.valueOf(this.c), Arrays.toString(Arrays.copyOf(iArr, kk7.d3)));
    }
}

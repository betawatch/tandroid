package j$.util.stream;

import j$.util.Objects;
import java.util.Arrays;
import java.util.Iterator;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* loaded from: classes2.dex */
public class o6 extends s6 implements IntConsumer {
    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return j$.com.android.tools.r8.a.c(this, intConsumer);
    }

    @Override // j$.util.stream.s6
    public final void i(Object obj, int i9, int i10, Object obj2) {
        int[] iArr = (int[]) obj;
        IntConsumer intConsumer = (IntConsumer) obj2;
        while (i9 < i10) {
            intConsumer.accept(iArr[i9]);
            i9++;
        }
    }

    @Override // j$.util.stream.s6
    public final int j(Object obj) {
        return ((int[]) obj).length;
    }

    @Override // java.lang.Iterable
    public final void forEach(Consumer consumer) {
        if (consumer instanceof IntConsumer) {
            d((IntConsumer) consumer);
        } else {
            if (d8.a) {
                d8.a(getClass(), "{0} calling SpinedBuffer.OfInt.forEach(Consumer)");
                throw null;
            }
            j$.com.android.tools.r8.a.j((n6) spliterator(), consumer);
        }
    }

    @Override // j$.util.stream.s6
    public final Object[] m() {
        return new int[8][];
    }

    @Override // j$.util.stream.s6
    public final Object newArray(int i9) {
        return new int[i9];
    }

    @Override // java.util.function.IntConsumer
    public void accept(int i9) {
        n();
        int[] iArr = (int[]) this.e;
        int i10 = this.b;
        this.b = i10 + 1;
        iArr[i10] = i9;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        j$.util.x0 spliterator = spliterator();
        Objects.requireNonNull(spliterator);
        return new j$.util.g1(spliterator);
    }

    @Override // j$.util.stream.s6, java.lang.Iterable, j$.util.stream.e2
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public j$.util.x0 spliterator() {
        return new n6(this, 0, this.c, 0, this.b);
    }

    public final String toString() {
        int[] iArr = (int[]) b();
        if (iArr.length < 200) {
            return String.format("%s[length=%d, chunks=%d]%s", getClass().getSimpleName(), Integer.valueOf(iArr.length), Integer.valueOf(this.c), Arrays.toString(iArr));
        }
        return String.format("%s[length=%d, chunks=%d]%s...", getClass().getSimpleName(), Integer.valueOf(iArr.length), Integer.valueOf(this.c), Arrays.toString(Arrays.copyOf(iArr, 200)));
    }
}

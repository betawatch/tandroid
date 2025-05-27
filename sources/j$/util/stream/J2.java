package j$.util.stream;

import j$.util.Spliterators;
import j$.util.function.Consumer;
import java.util.Arrays;
import java.util.Iterator;
import org.telegram.messenger.NotificationCenter;

/* loaded from: classes2.dex */
class J2 extends N2 implements j$.util.function.E {
    J2() {
    }

    J2(int i) {
        super(i);
    }

    @Override // j$.util.stream.N2, java.lang.Iterable
    /* renamed from: A, reason: merged with bridge method [inline-methods] */
    public j$.util.G spliterator() {
        return new I2(this, 0, this.c, 0, this.b);
    }

    @Override // j$.util.function.E
    public void accept(int i) {
        z();
        int[] iArr = (int[]) this.e;
        int i2 = this.b;
        this.b = i2 + 1;
        iArr[i2] = i;
    }

    @Override // j$.util.stream.N2
    public final Object c(int i) {
        return new int[i];
    }

    public final void forEach(Consumer consumer) {
        if (consumer instanceof j$.util.function.E) {
            g((j$.util.function.E) consumer);
        } else {
            if (z3.a) {
                z3.a(getClass(), "{0} calling SpinedBuffer.OfInt.forEach(Consumer)");
                throw null;
            }
            j$.util.A.f((I2) spliterator(), consumer);
        }
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return Spliterators.g(spliterator());
    }

    @Override // j$.util.function.E
    public final /* synthetic */ j$.util.function.E l(j$.util.function.E e) {
        return j$.com.android.tools.r8.a.c(this, e);
    }

    public final String toString() {
        int[] iArr = (int[]) e();
        if (iArr.length < 200) {
            return String.format("%s[length=%d, chunks=%d]%s", getClass().getSimpleName(), Integer.valueOf(iArr.length), Integer.valueOf(this.c), Arrays.toString(iArr));
        }
        return String.format("%s[length=%d, chunks=%d]%s...", getClass().getSimpleName(), Integer.valueOf(iArr.length), Integer.valueOf(this.c), Arrays.toString(Arrays.copyOf(iArr, NotificationCenter.smsJobStatusUpdate)));
    }

    @Override // j$.util.stream.N2
    protected final void u(Object obj, int i, int i2, Object obj2) {
        int[] iArr = (int[]) obj;
        j$.util.function.E e = (j$.util.function.E) obj2;
        while (i < i2) {
            e.accept(iArr[i]);
            i++;
        }
    }

    @Override // j$.util.stream.N2
    protected final int v(Object obj) {
        return ((int[]) obj).length;
    }

    @Override // j$.util.stream.N2
    protected final Object[] y() {
        return new int[8][];
    }
}

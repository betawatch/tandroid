package j$.util.stream;

import j$.util.Spliterators;
import j$.util.function.Consumer;
import java.util.Arrays;
import java.util.Iterator;
import org.telegram.messenger.NotificationCenter;

/* loaded from: classes2.dex */
class H2 extends N2 implements j$.util.function.m {
    H2() {
    }

    H2(int i) {
        super(i);
    }

    @Override // j$.util.stream.N2, java.lang.Iterable
    /* renamed from: A, reason: merged with bridge method [inline-methods] */
    public j$.util.D spliterator() {
        return new G2(this, 0, this.c, 0, this.b);
    }

    @Override // j$.util.function.m
    public void accept(double d) {
        z();
        double[] dArr = (double[]) this.e;
        int i = this.b;
        this.b = i + 1;
        dArr[i] = d;
    }

    @Override // j$.util.stream.N2
    public final Object c(int i) {
        return new double[i];
    }

    public final void forEach(Consumer consumer) {
        if (consumer instanceof j$.util.function.m) {
            g((j$.util.function.m) consumer);
        } else {
            if (z3.a) {
                z3.a(getClass(), "{0} calling SpinedBuffer.OfDouble.forEach(Consumer)");
                throw null;
            }
            j$.util.A.b((G2) spliterator(), consumer);
        }
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return Spliterators.f(spliterator());
    }

    @Override // j$.util.function.m
    public final /* synthetic */ j$.util.function.m k(j$.util.function.m mVar) {
        return j$.com.android.tools.r8.a.b(this, mVar);
    }

    public final String toString() {
        double[] dArr = (double[]) e();
        if (dArr.length < 200) {
            return String.format("%s[length=%d, chunks=%d]%s", getClass().getSimpleName(), Integer.valueOf(dArr.length), Integer.valueOf(this.c), Arrays.toString(dArr));
        }
        return String.format("%s[length=%d, chunks=%d]%s...", getClass().getSimpleName(), Integer.valueOf(dArr.length), Integer.valueOf(this.c), Arrays.toString(Arrays.copyOf(dArr, NotificationCenter.storyQualityUpdate)));
    }

    @Override // j$.util.stream.N2
    protected final void u(Object obj, int i, int i2, Object obj2) {
        double[] dArr = (double[]) obj;
        j$.util.function.m mVar = (j$.util.function.m) obj2;
        while (i < i2) {
            mVar.accept(dArr[i]);
            i++;
        }
    }

    @Override // j$.util.stream.N2
    protected final int v(Object obj) {
        return ((double[]) obj).length;
    }

    @Override // j$.util.stream.N2
    protected final Object[] y() {
        return new double[8][];
    }
}

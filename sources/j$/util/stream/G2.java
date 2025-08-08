package j$.util.stream;

import j$.util.Spliterators;
import j$.util.function.Consumer;
import java.util.Arrays;
import java.util.Iterator;
import org.telegram.messenger.NotificationCenter;

/* loaded from: classes2.dex */
class G2 extends M2 implements j$.util.function.l {
    @Override // j$.util.function.l
    public final /* synthetic */ j$.util.function.l k(j$.util.function.l lVar) {
        return j$.com.android.tools.r8.a.a(this, lVar);
    }

    @Override // j$.util.stream.M2
    protected final void u(Object obj, int i, int i2, Object obj2) {
        double[] dArr = (double[]) obj;
        j$.util.function.l lVar = (j$.util.function.l) obj2;
        while (i < i2) {
            lVar.accept(dArr[i]);
            i++;
        }
    }

    @Override // j$.util.stream.M2
    protected final int v(Object obj) {
        return ((double[]) obj).length;
    }

    @Override // j$.lang.a
    public final void forEach(Consumer consumer) {
        if (consumer instanceof j$.util.function.l) {
            g((j$.util.function.l) consumer);
        } else {
            if (y3.a) {
                y3.a(getClass(), "{0} calling SpinedBuffer.OfDouble.forEach(Consumer)");
                throw null;
            }
            j$.util.A.b((F2) spliterator(), consumer);
        }
    }

    @Override // j$.util.stream.M2
    protected final Object[] y() {
        return new double[8][];
    }

    @Override // j$.util.stream.M2
    public final Object c(int i) {
        return new double[i];
    }

    @Override // j$.util.function.l
    public void accept(double d) {
        z();
        double[] dArr = (double[]) this.e;
        int i = this.b;
        this.b = i + 1;
        dArr[i] = d;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return Spliterators.f(spliterator());
    }

    @Override // j$.util.stream.M2, java.lang.Iterable
    /* renamed from: A, reason: merged with bridge method [inline-methods] */
    public j$.util.D spliterator() {
        return new F2(this, 0, this.c, 0, this.b);
    }

    public final String toString() {
        double[] dArr = (double[]) e();
        if (dArr.length < 200) {
            return String.format("%s[length=%d, chunks=%d]%s", getClass().getSimpleName(), Integer.valueOf(dArr.length), Integer.valueOf(this.c), Arrays.toString(dArr));
        }
        return String.format("%s[length=%d, chunks=%d]%s...", getClass().getSimpleName(), Integer.valueOf(dArr.length), Integer.valueOf(this.c), Arrays.toString(Arrays.copyOf(dArr, NotificationCenter.savedMessagesForwarded)));
    }
}

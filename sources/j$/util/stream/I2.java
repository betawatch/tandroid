package j$.util.stream;

import j$.util.Spliterators;
import j$.util.function.Consumer;
import java.util.Arrays;
import java.util.Iterator;
import org.telegram.messenger.NotificationCenter;

/* loaded from: classes2.dex */
class I2 extends M2 implements j$.util.function.G {
    @Override // j$.util.function.G
    public final /* synthetic */ j$.util.function.G l(j$.util.function.G g) {
        return j$.com.android.tools.r8.a.b(this, g);
    }

    @Override // j$.util.stream.M2
    protected final void u(Object obj, int i, int i2, Object obj2) {
        int[] iArr = (int[]) obj;
        j$.util.function.G g = (j$.util.function.G) obj2;
        while (i < i2) {
            g.accept(iArr[i]);
            i++;
        }
    }

    @Override // j$.util.stream.M2
    protected final int v(Object obj) {
        return ((int[]) obj).length;
    }

    @Override // j$.lang.a
    public final void forEach(Consumer consumer) {
        if (consumer instanceof j$.util.function.G) {
            g((j$.util.function.G) consumer);
        } else {
            if (y3.a) {
                y3.a(getClass(), "{0} calling SpinedBuffer.OfInt.forEach(Consumer)");
                throw null;
            }
            j$.util.A.f((H2) spliterator(), consumer);
        }
    }

    @Override // j$.util.stream.M2
    protected final Object[] y() {
        return new int[8][];
    }

    @Override // j$.util.stream.M2
    public final Object c(int i) {
        return new int[i];
    }

    @Override // j$.util.function.G
    public void accept(int i) {
        z();
        int[] iArr = (int[]) this.e;
        int i2 = this.b;
        this.b = i2 + 1;
        iArr[i2] = i;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return Spliterators.g(spliterator());
    }

    @Override // j$.util.stream.M2, java.lang.Iterable
    /* renamed from: A, reason: merged with bridge method [inline-methods] */
    public j$.util.G spliterator() {
        return new H2(this, 0, this.c, 0, this.b);
    }

    public final String toString() {
        int[] iArr = (int[]) e();
        if (iArr.length < 200) {
            return String.format("%s[length=%d, chunks=%d]%s", getClass().getSimpleName(), Integer.valueOf(iArr.length), Integer.valueOf(this.c), Arrays.toString(iArr));
        }
        return String.format("%s[length=%d, chunks=%d]%s...", getClass().getSimpleName(), Integer.valueOf(iArr.length), Integer.valueOf(this.c), Arrays.toString(Arrays.copyOf(iArr, NotificationCenter.savedMessagesForwarded)));
    }
}

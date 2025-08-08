package j$.com.android.tools.r8;

import j$.util.function.BiConsumer;
import j$.util.function.D;
import j$.util.function.G;
import j$.util.function.V;
import j$.util.function.Y;
import j$.util.function.i;
import j$.util.function.l;
import java.util.Map;
import java.util.concurrent.ConcurrentMap;
import sun.misc.Unsafe;

/* loaded from: classes2.dex */
public abstract /* synthetic */ class a {
    public static /* synthetic */ long e(long j) {
        int numberOfLeadingZeros = Long.numberOfLeadingZeros(-1001L) + Long.numberOfLeadingZeros(1000L) + Long.numberOfLeadingZeros(~j) + Long.numberOfLeadingZeros(j);
        if (numberOfLeadingZeros > 65) {
            return j * 1000;
        }
        if (numberOfLeadingZeros >= 64) {
            long j2 = j * 1000;
            if (j == 0 || j2 / j == 1000) {
                return j2;
            }
        }
        throw new ArithmeticException();
    }

    public static /* synthetic */ long f(long j, long j2) {
        long j3 = j + j2;
        if (((j2 ^ j) < 0) || ((j ^ j3) >= 0)) {
            return j3;
        }
        throw new ArithmeticException();
    }

    public static /* synthetic */ boolean g(Unsafe unsafe, Object obj, long j, Object obj2) {
        while (!unsafe.compareAndSwapObject(obj, j, (Object) null, obj2)) {
            if (unsafe.getObject(obj, j) != null) {
                return false;
            }
        }
        return true;
    }

    public static /* synthetic */ long h(long j, long j2) {
        long j3 = j % j2;
        if (j3 == 0) {
            return 0L;
        }
        return (((j ^ j2) >> 63) | 1) > 0 ? j3 : j3 + j2;
    }

    public static /* synthetic */ long i(long j, long j2) {
        long j3 = j / j2;
        return (j - (j2 * j3) != 0 && (((j ^ j2) >> 63) | 1) < 0) ? j3 - 1 : j3;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [j$.util.function.i] */
    public static i a(final l lVar, final l lVar2) {
        lVar2.getClass();
        return new l() { // from class: j$.util.function.i
            @Override // j$.util.function.l
            public final /* synthetic */ l k(l lVar3) {
                return j$.com.android.tools.r8.a.a(this, lVar3);
            }

            @Override // j$.util.function.l
            public final void accept(double d) {
                l.this.accept(d);
                lVar2.accept(d);
            }
        };
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [j$.util.function.D] */
    public static D b(final G g, final G g2) {
        g2.getClass();
        return new G() { // from class: j$.util.function.D
            @Override // j$.util.function.G
            public final /* synthetic */ G l(G g3) {
                return j$.com.android.tools.r8.a.b(this, g3);
            }

            @Override // j$.util.function.G
            public final void accept(int i) {
                G.this.accept(i);
                g2.accept(i);
            }
        };
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [j$.util.function.V] */
    public static V c(final Y y, final Y y2) {
        y2.getClass();
        return new Y() { // from class: j$.util.function.V
            @Override // j$.util.function.Y
            public final /* synthetic */ Y f(Y y3) {
                return j$.com.android.tools.r8.a.c(this, y3);
            }

            @Override // j$.util.function.Y
            public final void accept(long j) {
                Y.this.accept(j);
                y2.accept(j);
            }
        };
    }

    public static void d(ConcurrentMap concurrentMap, BiConsumer biConsumer) {
        biConsumer.getClass();
        for (Map.Entry entry : concurrentMap.entrySet()) {
            try {
                biConsumer.accept(entry.getKey(), entry.getValue());
            } catch (IllegalStateException unused) {
            }
        }
    }
}

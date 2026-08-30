package j$.util.concurrent;

import j$.util.stream.IntStream;
import j$.util.stream.b0;
import j$.util.stream.f1;
import j$.util.stream.k1;
import j$.util.stream.v6;
import j$.util.stream.w0;
import j$.util.t1;
import java.io.ObjectOutputStream;
import java.io.ObjectStreamField;
import java.security.AccessController;
import java.security.SecureRandom;
import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import org.telegram.tgnet.ConnectionsManager;

/* loaded from: classes2.dex */
public class ThreadLocalRandom extends Random {
    private static final long serialVersionUID = -5851777807851030925L;
    public long a;
    public int b;
    public final boolean c;
    private static final ObjectStreamField[] serialPersistentFields = {new ObjectStreamField("rnd", Long.TYPE), new ObjectStreamField("initialized", Boolean.TYPE)};
    public static final ThreadLocal d = new ThreadLocal();
    public static final AtomicInteger e = new AtomicInteger();
    public static final v f = new v();
    public static final AtomicLong g = new AtomicLong(f(System.currentTimeMillis()) ^ f(System.nanoTime()));

    public /* synthetic */ ThreadLocalRandom(int i10) {
        this();
    }

    public static int e(long j10) {
        long j11 = (j10 ^ (j10 >>> 33)) * (-49064778989728563L);
        return (int) (((j11 ^ (j11 >>> 33)) * (-4265267296055464877L)) >>> 32);
    }

    public static long f(long j10) {
        long j11 = (j10 ^ (j10 >>> 33)) * (-49064778989728563L);
        long j12 = (j11 ^ (j11 >>> 33)) * (-4265267296055464877L);
        return j12 ^ (j12 >>> 33);
    }

    private ThreadLocalRandom() {
        this.c = true;
    }

    public static final void d() {
        int addAndGet = e.addAndGet(-1640531527);
        if (addAndGet == 0) {
            addAndGet = 1;
        }
        long f10 = f(g.getAndAdd(-4942790177534073029L));
        ThreadLocalRandom threadLocalRandom = (ThreadLocalRandom) f.get();
        threadLocalRandom.a = f10;
        threadLocalRandom.b = addAndGet;
    }

    public static ThreadLocalRandom current() {
        ThreadLocalRandom threadLocalRandom = (ThreadLocalRandom) f.get();
        if (threadLocalRandom.b == 0) {
            d();
        }
        return threadLocalRandom;
    }

    @Override // java.util.Random
    public final void setSeed(long j10) {
        if (this.c) {
            throw new UnsupportedOperationException();
        }
    }

    public final long g() {
        long j10 = this.a - 7046029254386353131L;
        this.a = j10;
        return j10;
    }

    @Override // java.util.Random
    public final int next(int i10) {
        return nextInt() >>> (32 - i10);
    }

    public final long c(long j10, long j11) {
        long f10 = f(g());
        if (j10 >= j11) {
            return f10;
        }
        long j12 = j11 - j10;
        long j13 = j12 - 1;
        if ((j12 & j13) == 0) {
            return (f10 & j13) + j10;
        }
        if (j12 > 0) {
            while (true) {
                long j14 = f10 >>> 1;
                long j15 = j14 + j13;
                long j16 = j14 % j12;
                if (j15 - j16 >= 0) {
                    return j16 + j10;
                }
                f10 = f(g());
            }
        } else {
            while (true) {
                if (f10 >= j10 && f10 < j11) {
                    return f10;
                }
                f10 = f(g());
            }
        }
    }

    public final int b(int i10, int i11) {
        int e6 = e(g());
        if (i10 >= i11) {
            return e6;
        }
        int i12 = i11 - i10;
        int i13 = i12 - 1;
        if ((i12 & i13) == 0) {
            return (e6 & i13) + i10;
        }
        if (i12 > 0) {
            int i14 = e6 >>> 1;
            while (true) {
                int i15 = i14 + i13;
                int i16 = i14 % i12;
                if (i15 - i16 >= 0) {
                    return i16 + i10;
                }
                i14 = e(g()) >>> 1;
            }
        } else {
            while (true) {
                if (e6 >= i10 && e6 < i11) {
                    return e6;
                }
                e6 = e(g());
            }
        }
    }

    public final double a(double d10, double d11) {
        double nextLong = (nextLong() >>> 11) * 1.1102230246251565E-16d;
        if (d10 >= d11) {
            return nextLong;
        }
        double d12 = ((d11 - d10) * nextLong) + d10;
        return d12 >= d11 ? Double.longBitsToDouble(Double.doubleToLongBits(d11) - 1) : d12;
    }

    @Override // java.util.Random
    public final int nextInt() {
        return e(g());
    }

    @Override // java.util.Random
    public final int nextInt(int i10) {
        if (i10 <= 0) {
            throw new IllegalArgumentException("bound must be positive");
        }
        int e6 = e(g());
        int i11 = i10 - 1;
        if ((i10 & i11) == 0) {
            return e6 & i11;
        }
        while (true) {
            int i12 = e6 >>> 1;
            int i13 = i12 + i11;
            int i14 = i12 % i10;
            if (i13 - i14 >= 0) {
                return i14;
            }
            e6 = e(g());
        }
    }

    public final int nextInt(int i10, int i11) {
        if (i10 >= i11) {
            throw new IllegalArgumentException("bound must be greater than origin");
        }
        return b(i10, i11);
    }

    @Override // java.util.Random
    public final long nextLong() {
        return f(g());
    }

    public final long nextLong(long j10) {
        if (j10 <= 0) {
            throw new IllegalArgumentException("bound must be positive");
        }
        long f10 = f(g());
        long j11 = j10 - 1;
        if ((j10 & j11) == 0) {
            return f10 & j11;
        }
        while (true) {
            long j12 = f10 >>> 1;
            long j13 = j12 + j11;
            long j14 = j12 % j10;
            if (j13 - j14 >= 0) {
                return j14;
            }
            f10 = f(g());
        }
    }

    public final long nextLong(long j10, long j11) {
        if (j10 >= j11) {
            throw new IllegalArgumentException("bound must be greater than origin");
        }
        return c(j10, j11);
    }

    @Override // java.util.Random
    public final double nextDouble() {
        return (f(g()) >>> 11) * 1.1102230246251565E-16d;
    }

    public final double nextDouble(double d10) {
        if (d10 <= 0.0d) {
            throw new IllegalArgumentException("bound must be positive");
        }
        double f10 = (f(g()) >>> 11) * 1.1102230246251565E-16d * d10;
        return f10 < d10 ? f10 : Double.longBitsToDouble(Double.doubleToLongBits(d10) - 1);
    }

    public final double nextDouble(double d10, double d11) {
        if (d10 >= d11) {
            throw new IllegalArgumentException("bound must be greater than origin");
        }
        return a(d10, d11);
    }

    @Override // java.util.Random
    public final boolean nextBoolean() {
        return e(g()) < 0;
    }

    @Override // java.util.Random
    public final float nextFloat() {
        return (e(g()) >>> 8) * 5.9604645E-8f;
    }

    @Override // java.util.Random
    public final double nextGaussian() {
        ThreadLocal threadLocal = d;
        Double d10 = (Double) threadLocal.get();
        if (d10 != null) {
            threadLocal.set(null);
            return d10.doubleValue();
        }
        while (true) {
            double nextDouble = (nextDouble() * 2.0d) - 1.0d;
            double nextDouble2 = (nextDouble() * 2.0d) - 1.0d;
            double d11 = (nextDouble2 * nextDouble2) + (nextDouble * nextDouble);
            if (d11 < 1.0d && d11 != 0.0d) {
                double sqrt = StrictMath.sqrt((StrictMath.log(d11) * (-2.0d)) / d11);
                d.set(Double.valueOf(nextDouble2 * sqrt));
                return nextDouble * sqrt;
            }
        }
    }

    @Override // java.util.Random
    public final IntStream ints(long j10) {
        if (j10 < 0) {
            throw new IllegalArgumentException("size must be non-negative");
        }
        x xVar = new x(0L, j10, ConnectionsManager.DEFAULT_DATACENTER_ID, 0);
        return IntStream.Wrapper.convert(new w0(xVar, v6.l(xVar), false));
    }

    @Override // java.util.Random
    public final java.util.stream.IntStream ints() {
        x xVar = new x(0L, Long.MAX_VALUE, ConnectionsManager.DEFAULT_DATACENTER_ID, 0);
        return IntStream.Wrapper.convert(new w0(xVar, v6.l(xVar), false));
    }

    @Override // java.util.Random
    public final java.util.stream.IntStream ints(long j10, int i10, int i11) {
        if (j10 < 0) {
            throw new IllegalArgumentException("size must be non-negative");
        }
        if (i10 >= i11) {
            throw new IllegalArgumentException("bound must be greater than origin");
        }
        x xVar = new x(0L, j10, i10, i11);
        return IntStream.Wrapper.convert(new w0(xVar, v6.l(xVar), false));
    }

    @Override // java.util.Random
    public final java.util.stream.IntStream ints(int i10, int i11) {
        if (i10 >= i11) {
            throw new IllegalArgumentException("bound must be greater than origin");
        }
        x xVar = new x(0L, Long.MAX_VALUE, i10, i11);
        return IntStream.Wrapper.convert(new w0(xVar, v6.l(xVar), false));
    }

    @Override // java.util.Random
    public final LongStream longs(long j10) {
        if (j10 < 0) {
            throw new IllegalArgumentException("size must be non-negative");
        }
        y yVar = new y(0L, j10, Long.MAX_VALUE, 0L);
        return k1.f(new f1(yVar, v6.l(yVar), false));
    }

    @Override // java.util.Random
    public final LongStream longs() {
        y yVar = new y(0L, Long.MAX_VALUE, Long.MAX_VALUE, 0L);
        return k1.f(new f1(yVar, v6.l(yVar), false));
    }

    @Override // java.util.Random
    public final LongStream longs(long j10, long j11, long j12) {
        if (j10 < 0) {
            throw new IllegalArgumentException("size must be non-negative");
        }
        if (j11 >= j12) {
            throw new IllegalArgumentException("bound must be greater than origin");
        }
        y yVar = new y(0L, j10, j11, j12);
        return k1.f(new f1(yVar, v6.l(yVar), false));
    }

    @Override // java.util.Random
    public final LongStream longs(long j10, long j11) {
        if (j10 >= j11) {
            throw new IllegalArgumentException("bound must be greater than origin");
        }
        y yVar = new y(0L, Long.MAX_VALUE, j10, j11);
        return k1.f(new f1(yVar, v6.l(yVar), false));
    }

    @Override // java.util.Random
    public final DoubleStream doubles(long j10) {
        if (j10 < 0) {
            throw new IllegalArgumentException("size must be non-negative");
        }
        w wVar = new w(0L, j10, Double.MAX_VALUE, 0.0d);
        return b0.f(new j$.util.stream.w(wVar, v6.l(wVar), false));
    }

    @Override // java.util.Random
    public final DoubleStream doubles() {
        w wVar = new w(0L, Long.MAX_VALUE, Double.MAX_VALUE, 0.0d);
        return b0.f(new j$.util.stream.w(wVar, v6.l(wVar), false));
    }

    @Override // java.util.Random
    public final DoubleStream doubles(long j10, double d10, double d11) {
        if (j10 < 0) {
            throw new IllegalArgumentException("size must be non-negative");
        }
        if (d10 >= d11) {
            throw new IllegalArgumentException("bound must be greater than origin");
        }
        w wVar = new w(0L, j10, d10, d11);
        return b0.f(new j$.util.stream.w(wVar, v6.l(wVar), false));
    }

    @Override // java.util.Random
    public final DoubleStream doubles(double d10, double d11) {
        if (d10 >= d11) {
            throw new IllegalArgumentException("bound must be greater than origin");
        }
        w wVar = new w(0L, Long.MAX_VALUE, d10, d11);
        return b0.f(new j$.util.stream.w(wVar, v6.l(wVar), false));
    }

    static {
        if (((Boolean) AccessController.doPrivileged(new t1(1))).booleanValue()) {
            byte[] seed = SecureRandom.getSeed(8);
            long j10 = seed[0] & 255;
            for (int i10 = 1; i10 < 8; i10++) {
                j10 = (j10 << 8) | (seed[i10] & 255);
            }
            g.set(j10);
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        ObjectOutputStream.PutField putFields = objectOutputStream.putFields();
        putFields.put("rnd", this.a);
        putFields.put("initialized", true);
        objectOutputStream.writeFields();
    }

    private Object readResolve() {
        return current();
    }
}

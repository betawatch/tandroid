package j$.util.stream;

import j$.util.Optional;
import j$.util.function.BiConsumer;
import j$.util.function.IntFunction;
import j$.util.function.LongFunction;
import j$.util.function.Predicate;
import j$.util.function.Supplier;
import j$.util.function.ToDoubleFunction;
import j$.util.function.ToIntFunction;
import j$.util.function.ToLongFunction;

/* loaded from: classes2.dex */
public final /* synthetic */ class q implements ToDoubleFunction, IntFunction, j$.util.function.h, Supplier, Predicate, ToIntFunction, j$.util.function.O, j$.util.function.C, j$.util.function.q0, BiConsumer, j$.util.function.t0, j$.util.function.U, ToLongFunction, LongFunction, j$.util.function.k0 {
    public final /* synthetic */ int a;

    public /* synthetic */ q(int i) {
        this.a = i;
    }

    @Override // j$.util.function.t0
    public void accept(Object obj, long j) {
        ((j$.util.i) obj).accept(j);
    }

    @Override // j$.util.function.Predicate
    public /* synthetic */ Predicate and(Predicate predicate) {
        switch (this.a) {
        }
        return Predicate.-CC.$default$and(this, predicate);
    }

    @Override // j$.util.function.BiConsumer
    public /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
        switch (this.a) {
            case 15:
                break;
            case 20:
                break;
        }
        return BiConsumer.-CC.$default$andThen(this, biConsumer);
    }

    @Override // j$.util.function.LongFunction
    public Object apply(long j) {
        return Long.valueOf(j);
    }

    @Override // j$.util.function.h
    public double applyAsDouble(double d, double d2) {
        return Math.max(d, d2);
    }

    @Override // j$.util.function.C
    public int applyAsInt(int i, int i2) {
        switch (this.a) {
            case 13:
                return Math.min(i, i2);
            case 16:
                return i + i2;
            default:
                return Math.max(i, i2);
        }
    }

    @Override // j$.util.function.O
    public long applyAsLong(int i) {
        return 1L;
    }

    @Override // j$.util.function.k0
    public long applyAsLong(long j) {
        return 1L;
    }

    @Override // j$.util.function.U
    public long applyAsLong(long j, long j2) {
        switch (this.a) {
            case 22:
                return j + j2;
            default:
                return Math.min(j, j2);
        }
    }

    @Override // j$.util.function.Predicate
    public /* synthetic */ Predicate negate() {
        switch (this.a) {
        }
        return Predicate.-CC.$default$negate(this);
    }

    @Override // j$.util.function.Predicate
    public /* synthetic */ Predicate or(Predicate predicate) {
        switch (this.a) {
        }
        return Predicate.-CC.$default$or(this, predicate);
    }

    @Override // j$.util.function.Predicate
    public boolean test(Object obj) {
        switch (this.a) {
            case 4:
                return ((Optional) obj).isPresent();
            case 5:
                return ((j$.util.j) obj).c();
            case 6:
                return ((j$.util.l) obj).c();
            default:
                return ((j$.util.k) obj).c();
        }
    }

    @Override // j$.util.function.k0
    public j$.util.function.k0 a(j$.util.function.k0 k0Var) {
        k0Var.getClass();
        return new j$.util.function.h0(this, k0Var, 0);
    }

    @Override // j$.util.function.k0
    public j$.util.function.k0 b(j$.util.function.k0 k0Var) {
        k0Var.getClass();
        return new j$.util.function.h0(this, k0Var, 1);
    }

    @Override // j$.util.function.ToDoubleFunction
    public double applyAsDouble(Object obj) {
        return ((Double) obj).doubleValue();
    }

    @Override // j$.util.function.ToLongFunction
    public long applyAsLong(Object obj) {
        return ((Long) obj).longValue();
    }

    @Override // j$.util.function.ToIntFunction
    public int applyAsInt(Object obj) {
        return ((Integer) obj).intValue();
    }

    @Override // j$.util.function.Supplier
    public Object get() {
        switch (this.a) {
            case 3:
                return new double[3];
            case 18:
                return new long[2];
            default:
                return new long[2];
        }
    }

    @Override // j$.util.function.q0
    public void accept(Object obj, int i) {
        switch (this.a) {
            case 14:
                ((j$.util.g) obj).accept(i);
                break;
            default:
                long[] jArr = (long[]) obj;
                jArr[0] = jArr[0] + 1;
                jArr[1] = jArr[1] + i;
                break;
        }
    }

    @Override // j$.util.function.BiConsumer
    public void accept(Object obj, Object obj2) {
        switch (this.a) {
            case 15:
                ((j$.util.g) obj).a((j$.util.g) obj2);
                break;
            case 20:
                long[] jArr = (long[]) obj;
                long[] jArr2 = (long[]) obj2;
                jArr[0] = jArr[0] + jArr2[0];
                jArr[1] = jArr[1] + jArr2[1];
                break;
            default:
                ((j$.util.i) obj).a((j$.util.i) obj2);
                break;
        }
    }

    @Override // j$.util.function.IntFunction
    public Object apply(int i) {
        switch (this.a) {
            case 1:
                return new Double[i];
            case 8:
                return new Object[i];
            case 9:
                return new Integer[i];
            case 12:
                return Integer.valueOf(i);
            default:
                return new Long[i];
        }
    }
}

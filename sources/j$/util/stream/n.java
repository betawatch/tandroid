package j$.util.stream;

import j$.util.Optional;
import j$.util.function.BiConsumer$-CC;
import j$.util.function.Predicate$-CC;
import java.util.function.BiConsumer;
import java.util.function.DoubleBinaryOperator;
import java.util.function.DoubleFunction;
import java.util.function.IntBinaryOperator;
import java.util.function.IntFunction;
import java.util.function.ObjDoubleConsumer;
import java.util.function.ObjIntConsumer;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;

/* loaded from: classes2.dex */
public final /* synthetic */ class n implements ObjDoubleConsumer, BiConsumer, DoubleFunction, ToDoubleFunction, IntFunction, DoubleBinaryOperator, Supplier, Predicate, ToIntFunction, IntBinaryOperator, ObjIntConsumer {
    public final /* synthetic */ int a;

    public /* synthetic */ n(int i) {
        this.a = i;
    }

    public /* synthetic */ Predicate and(Predicate predicate) {
        switch (this.a) {
        }
        return Predicate$-CC.$default$and(this, predicate);
    }

    public /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
        switch (this.a) {
            case 1:
                break;
            case 3:
                break;
            case 24:
                break;
        }
        return BiConsumer$-CC.$default$andThen(this, biConsumer);
    }

    @Override // java.util.function.DoubleFunction
    public Object apply(double d) {
        return Double.valueOf(d);
    }

    @Override // java.util.function.DoubleBinaryOperator
    public double applyAsDouble(double d, double d2) {
        return Math.max(d, d2);
    }

    @Override // java.util.function.IntBinaryOperator
    public int applyAsInt(int i, int i2) {
        switch (this.a) {
            case 22:
                return Math.min(i, i2);
            case 25:
                return i + i2;
            default:
                return Math.max(i, i2);
        }
    }

    public /* synthetic */ Predicate negate() {
        switch (this.a) {
        }
        return Predicate$-CC.$default$negate(this);
    }

    public /* synthetic */ Predicate or(Predicate predicate) {
        switch (this.a) {
        }
        return Predicate$-CC.$default$or(this, predicate);
    }

    @Override // java.util.function.Predicate
    public boolean test(Object obj) {
        switch (this.a) {
            case 10:
                return ((j$.util.z) obj).a;
            case 11:
            case 13:
            default:
                return ((Optional) obj).isPresent();
            case 12:
                return ((j$.util.A) obj).a;
            case 14:
                return ((j$.util.B) obj).a;
        }
    }

    @Override // java.util.function.ToDoubleFunction
    public double applyAsDouble(Object obj) {
        return ((Double) obj).doubleValue();
    }

    @Override // java.util.function.ObjDoubleConsumer
    public void accept(Object obj, double d) {
        switch (this.a) {
            case 0:
                double[] dArr = (double[]) obj;
                dArr[2] = dArr[2] + 1.0d;
                Collectors.a(dArr, d);
                dArr[3] = dArr[3] + d;
                break;
            case 1:
            default:
                double[] dArr2 = (double[]) obj;
                Collectors.a(dArr2, d);
                dArr2[2] = dArr2[2] + d;
                break;
            case 2:
                ((j$.util.u) obj).accept(d);
                break;
        }
    }

    @Override // java.util.function.ToIntFunction
    public int applyAsInt(Object obj) {
        return ((Integer) obj).intValue();
    }

    @Override // java.util.function.Supplier
    public Object get() {
        switch (this.a) {
            case 8:
                return new double[3];
            case 11:
                return new D();
            case 13:
                return new E();
            case 15:
                return new F();
            case 17:
                return new G();
            default:
                return new long[2];
        }
    }

    @Override // java.util.function.ObjIntConsumer
    public void accept(Object obj, int i) {
        switch (this.a) {
            case 23:
                ((j$.util.v) obj).accept(i);
                break;
            default:
                long[] jArr = (long[]) obj;
                jArr[0] = jArr[0] + 1;
                jArr[1] = jArr[1] + i;
                break;
        }
    }

    @Override // java.util.function.BiConsumer
    public void accept(Object obj, Object obj2) {
        switch (this.a) {
            case 1:
                double[] dArr = (double[]) obj;
                double[] dArr2 = (double[]) obj2;
                Collectors.a(dArr, dArr2[0]);
                Collectors.a(dArr, dArr2[1]);
                dArr[2] = dArr[2] + dArr2[2];
                dArr[3] = dArr[3] + dArr2[3];
                break;
            case 3:
                ((j$.util.u) obj).b((j$.util.u) obj2);
                break;
            case 24:
                ((j$.util.v) obj).b((j$.util.v) obj2);
                break;
            default:
                long[] jArr = (long[]) obj;
                long[] jArr2 = (long[]) obj2;
                jArr[0] = jArr[0] + jArr2[0];
                jArr[1] = jArr[1] + jArr2[1];
                break;
        }
    }

    @Override // java.util.function.IntFunction
    public Object apply(int i) {
        switch (this.a) {
            case 6:
                return new Double[i];
            case 18:
                return new Object[i];
            case 19:
                return new Integer[i];
            default:
                return Integer.valueOf(i);
        }
    }
}

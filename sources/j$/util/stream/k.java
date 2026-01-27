package j$.util.stream;

import j$.util.Optional;
import j$.util.function.BiConsumer$-CC;
import j$.util.function.Function$-CC;
import j$.util.function.Predicate$-CC;
import java.util.LinkedHashSet;
import java.util.function.BiConsumer;
import java.util.function.DoubleBinaryOperator;
import java.util.function.DoubleFunction;
import java.util.function.Function;
import java.util.function.IntBinaryOperator;
import java.util.function.IntFunction;
import java.util.function.ObjDoubleConsumer;
import java.util.function.ObjIntConsumer;
import java.util.function.ObjLongConsumer;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;

/* loaded from: classes2.dex */
public final /* synthetic */ class k implements Function, Supplier, BiConsumer, DoubleBinaryOperator, ObjDoubleConsumer, DoubleFunction, ToDoubleFunction, IntFunction, Predicate, ToIntFunction, IntBinaryOperator, ObjIntConsumer, ObjLongConsumer {
    public final /* synthetic */ int a;

    public /* synthetic */ k(int i) {
        this.a = i;
    }

    @Override // java.util.function.ObjDoubleConsumer
    public void accept(Object obj, double d) {
        ((j$.util.w) obj).accept(d);
    }

    @Override // java.util.function.ObjLongConsumer
    public void accept(Object obj, long j) {
        ((j$.util.z) obj).accept(j);
    }

    public /* synthetic */ Predicate and(Predicate predicate) {
        switch (this.a) {
        }
        return Predicate$-CC.$default$and(this, predicate);
    }

    public /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
        switch (this.a) {
            case 2:
                break;
            case 3:
                break;
            case 7:
                break;
            case 23:
                break;
        }
        return BiConsumer$-CC.$default$andThen(this, biConsumer);
    }

    public /* synthetic */ Function andThen(Function function) {
        return Function$-CC.$default$andThen(this, function);
    }

    @Override // java.util.function.DoubleFunction
    public Object apply(double d) {
        return Double.valueOf(d);
    }

    @Override // java.util.function.Function
    public Object apply(Object obj) {
        return ((j$.util.u0) obj).toString();
    }

    @Override // java.util.function.DoubleBinaryOperator
    public double applyAsDouble(double d, double d2) {
        switch (this.a) {
            case 4:
                return Math.min(d, d2);
            default:
                return Math.max(d, d2);
        }
    }

    @Override // java.util.function.IntBinaryOperator
    public int applyAsInt(int i, int i2) {
        switch (this.a) {
            case 21:
                return Math.min(i, i2);
            case 24:
                return i + i2;
            default:
                return Math.max(i, i2);
        }
    }

    public /* synthetic */ Function compose(Function function) {
        return Function$-CC.$default$compose(this, function);
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
            case 13:
                return ((j$.util.B) obj).c();
            case 14:
                return ((j$.util.C) obj).c();
            case 15:
                return ((j$.util.D) obj).c();
            default:
                return ((Optional) obj).isPresent();
        }
    }

    @Override // java.util.function.ToDoubleFunction
    public double applyAsDouble(Object obj) {
        return ((Double) obj).doubleValue();
    }

    @Override // java.util.function.ToIntFunction
    public int applyAsInt(Object obj) {
        return ((Integer) obj).intValue();
    }

    @Override // java.util.function.Supplier
    public Object get() {
        switch (this.a) {
            case 1:
                return new LinkedHashSet();
            case 5:
                return new double[4];
            case 12:
                return new double[3];
            default:
                return new long[2];
        }
    }

    @Override // java.util.function.ObjIntConsumer
    public void accept(Object obj, int i) {
        switch (this.a) {
            case 22:
                ((j$.util.x) obj).accept(i);
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
            case 2:
                ((LinkedHashSet) obj).add(obj2);
                break;
            case 3:
                ((LinkedHashSet) obj).addAll((LinkedHashSet) obj2);
                break;
            case 7:
                ((j$.util.w) obj).b((j$.util.w) obj2);
                break;
            case 23:
                ((j$.util.x) obj).b((j$.util.x) obj2);
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
            case 10:
                return new Double[i];
            case 17:
                return new Object[i];
            case 18:
                return new Integer[i];
            default:
                return Integer.valueOf(i);
        }
    }
}

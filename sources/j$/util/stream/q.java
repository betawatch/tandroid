package j$.util.stream;

import j$.util.Optional;
import j$.util.function.BiConsumer$-CC;
import j$.util.function.Predicate$-CC;
import java.util.function.BiConsumer;
import java.util.function.DoubleBinaryOperator;
import java.util.function.IntBinaryOperator;
import java.util.function.IntFunction;
import java.util.function.ObjDoubleConsumer;
import java.util.function.ObjIntConsumer;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.ToIntFunction;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes4.dex */
public final /* synthetic */ class q implements IntFunction, DoubleBinaryOperator, Supplier, ObjDoubleConsumer, BiConsumer, Predicate, IntBinaryOperator, ObjIntConsumer, ToIntFunction {
    public final /* synthetic */ byte a;

    public /* synthetic */ q(byte b) {
        this.a = b;
    }

    @Override // java.util.function.BiConsumer
    public final void accept(Object obj, Object obj2) {
        switch (this.a) {
            case 4:
                double[] dArr = (double[]) obj;
                double[] dArr2 = (double[]) obj2;
                Collectors.a(dArr, dArr2[0]);
                Collectors.a(dArr, dArr2[1]);
                dArr[2] = dArr[2] + dArr2[2];
                break;
            case 8:
                double[] dArr3 = (double[]) obj;
                double[] dArr4 = (double[]) obj2;
                Collectors.a(dArr3, dArr4[0]);
                Collectors.a(dArr3, dArr4[1]);
                dArr3[2] = dArr3[2] + dArr4[2];
                dArr3[3] = dArr3[3] + dArr4[3];
                break;
            case 22:
                ((j$.util.x) obj).a((j$.util.x) obj2);
                break;
            default:
                long[] jArr = (long[]) obj;
                long[] jArr2 = (long[]) obj2;
                jArr[0] = jArr[0] + jArr2[0];
                jArr[1] = jArr[1] + jArr2[1];
                break;
        }
    }

    public final /* synthetic */ Predicate and(Predicate predicate) {
        switch (this.a) {
        }
        return Predicate$-CC.$default$and(this, predicate);
    }

    public final /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
        switch (this.a) {
            case 4:
                break;
            case 8:
                break;
            case 22:
                break;
        }
        return BiConsumer$-CC.$default$andThen(this, biConsumer);
    }

    @Override // java.util.function.IntFunction
    public final Object apply(int i) {
        switch (this.a) {
            case 0:
                return new Double[i];
            case 18:
                return new Object[i];
            case 19:
                return new Integer[i];
            default:
                return Integer.valueOf(i);
        }
    }

    @Override // java.util.function.DoubleBinaryOperator
    public final double applyAsDouble(double d, double d2) {
        switch (this.a) {
            case 1:
                return Math.max(d, d2);
            default:
                return Math.min(d, d2);
        }
    }

    @Override // java.util.function.IntBinaryOperator
    public final int applyAsInt(int i, int i2) {
        switch (this.a) {
            case 20:
                return Math.min(i, i2);
            case 23:
                return i + i2;
            default:
                return Math.max(i, i2);
        }
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        switch (this.a) {
            case 2:
                return new double[3];
            case 6:
                return new double[4];
            case 11:
                return new h0();
            case 13:
                return new i0();
            case 15:
                return new j0();
            case 17:
                return new k0();
            default:
                return new long[2];
        }
    }

    public final /* synthetic */ Predicate negate() {
        switch (this.a) {
        }
        return Predicate$-CC.$default$negate(this);
    }

    public final /* synthetic */ Predicate or(Predicate predicate) {
        switch (this.a) {
        }
        return Predicate$-CC.$default$or(this, predicate);
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        switch (this.a) {
            case 10:
                return ((j$.util.b0) obj).a;
            case 11:
            case 13:
            default:
                return ((Optional) obj).isPresent();
            case 12:
                return ((j$.util.c0) obj).a;
            case 14:
                return ((j$.util.d0) obj).a;
        }
    }

    @Override // java.util.function.ToIntFunction
    public final int applyAsInt(Object obj) {
        return ((Integer) obj).intValue();
    }

    @Override // java.util.function.ObjIntConsumer
    public final void accept(Object obj, int i) {
        switch (this.a) {
            case 21:
                ((j$.util.x) obj).accept(i);
                break;
            default:
                long[] jArr = (long[]) obj;
                jArr[0] = jArr[0] + 1;
                jArr[1] = jArr[1] + i;
                break;
        }
    }

    @Override // java.util.function.ObjDoubleConsumer
    public final void accept(Object obj, double d) {
        switch (this.a) {
            case 3:
                double[] dArr = (double[]) obj;
                Collectors.a(dArr, d);
                dArr[2] = dArr[2] + d;
                break;
            case 7:
                double[] dArr2 = (double[]) obj;
                dArr2[2] = dArr2[2] + 1.0d;
                Collectors.a(dArr2, d);
                dArr2[3] = dArr2[3] + d;
                break;
            default:
                ((j$.util.w) obj).accept(d);
                break;
        }
    }
}

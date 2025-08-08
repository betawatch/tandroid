package j$.util.stream;

import j$.util.function.BiConsumer;
import j$.util.function.Function;
import j$.util.function.IntFunction;
import j$.util.function.LongFunction;
import j$.util.function.Supplier;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* loaded from: classes2.dex */
public final /* synthetic */ class k implements Function, j$.util.function.n0, BiConsumer, Supplier, LongFunction, IntFunction, j$.util.function.h, j$.util.function.o, j$.util.function.v {
    public final /* synthetic */ int a;

    public /* synthetic */ k(int i) {
        this.a = i;
    }

    @Override // j$.util.function.BiConsumer
    public /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
        switch (this.a) {
            case 2:
                break;
            case 4:
                break;
            case 14:
                break;
            case 18:
                break;
            case 20:
                break;
            case 22:
                break;
            case 23:
                break;
        }
        return BiConsumer.-CC.$default$andThen(this, biConsumer);
    }

    @Override // j$.util.function.Function
    public /* synthetic */ Function andThen(Function function) {
        return Function.-CC.$default$andThen(this, function);
    }

    @Override // j$.util.function.o
    public Object apply(double d) {
        return Double.valueOf(d);
    }

    @Override // j$.util.function.LongFunction
    public Object apply(long j) {
        switch (this.a) {
            case 9:
                return t0.J(j);
            case 10:
                return t0.R(j);
            default:
                return t0.T(j);
        }
    }

    @Override // j$.util.function.Function
    public Object apply(Object obj) {
        Set set = Collectors.a;
        return obj;
    }

    @Override // j$.util.function.h
    public double applyAsDouble(double d, double d2) {
        return Math.min(d, d2);
    }

    @Override // j$.util.function.v
    public long applyAsLong(double d) {
        return 1L;
    }

    @Override // j$.util.function.Function
    public /* synthetic */ Function compose(Function function) {
        return Function.-CC.$default$compose(this, function);
    }

    @Override // j$.util.function.Supplier
    public Object get() {
        switch (this.a) {
            case 5:
                return new I();
            case 6:
                return new F();
            case 7:
                return new H();
            case 8:
                return new G();
            case 9:
            case 10:
            case 11:
            case 12:
            case 14:
            case 18:
            case 20:
            default:
                return new double[4];
            case 13:
                return new j$.util.f();
            case 15:
                return new j$.util.g();
            case 16:
                return new j$.util.i();
            case 17:
                return new ArrayList();
            case 19:
                return new HashSet();
            case 21:
                return new LinkedHashSet();
        }
    }

    @Override // j$.util.function.n0
    public void accept(Object obj, double d) {
        switch (this.a) {
            case 1:
                double[] dArr = (double[]) obj;
                Collectors.a(dArr, d);
                dArr[2] = dArr[2] + d;
                break;
            case 2:
            default:
                ((j$.util.f) obj).accept(d);
                break;
            case 3:
                double[] dArr2 = (double[]) obj;
                dArr2[2] = dArr2[2] + 1.0d;
                Collectors.a(dArr2, d);
                dArr2[3] = dArr2[3] + d;
                break;
        }
    }

    @Override // j$.util.function.BiConsumer
    public void accept(Object obj, Object obj2) {
        switch (this.a) {
            case 2:
                double[] dArr = (double[]) obj;
                double[] dArr2 = (double[]) obj2;
                Collectors.a(dArr, dArr2[0]);
                Collectors.a(dArr, dArr2[1]);
                dArr[2] = dArr[2] + dArr2[2];
                break;
            case 4:
                double[] dArr3 = (double[]) obj;
                double[] dArr4 = (double[]) obj2;
                Collectors.a(dArr3, dArr4[0]);
                Collectors.a(dArr3, dArr4[1]);
                dArr3[2] = dArr3[2] + dArr4[2];
                dArr3[3] = dArr3[3] + dArr4[3];
                break;
            case 14:
                ((Collection) obj).add(obj2);
                break;
            case 18:
                ((List) obj).add(obj2);
                break;
            case 20:
                ((Set) obj).add(obj2);
                break;
            case 22:
                ((LinkedHashSet) obj).add(obj2);
                break;
            case 23:
                ((LinkedHashSet) obj).addAll((LinkedHashSet) obj2);
                break;
            default:
                ((j$.util.f) obj).a((j$.util.f) obj2);
                break;
        }
    }

    @Override // j$.util.function.IntFunction
    public Object apply(int i) {
        return new Object[i];
    }
}

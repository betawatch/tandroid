package j$.util.stream;

import j$.util.function.BiConsumer$-CC;
import j$.util.function.BiFunction$-CC;
import j$.util.function.Function$-CC;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.LongFunction;
import java.util.function.ObjDoubleConsumer;
import java.util.function.Supplier;

/* loaded from: classes2.dex */
public final /* synthetic */ class j implements BinaryOperator, Function, BiConsumer, ObjDoubleConsumer, Supplier, LongFunction, IntFunction {
    public final /* synthetic */ int a;

    public /* synthetic */ j(int i) {
        this.a = i;
    }

    public /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
        switch (this.a) {
            case 4:
                break;
            case 6:
                break;
            case 21:
                break;
            case 23:
                break;
            case 26:
                break;
        }
        return BiConsumer$-CC.$default$andThen(this, biConsumer);
    }

    public /* synthetic */ BiFunction andThen(Function function) {
        switch (this.a) {
            case 0:
                break;
            case 1:
                break;
            case 3:
                break;
            case 13:
                break;
            case 15:
                break;
            case 17:
                break;
        }
        return BiFunction$-CC.$default$andThen(this, function);
    }

    public /* synthetic */ Function andThen(Function function) {
        return Function$-CC.$default$andThen(this, function);
    }

    @Override // java.util.function.LongFunction
    public Object apply(long j) {
        switch (this.a) {
            case 12:
                return w0.J(j);
            case 13:
            default:
                return w0.U(j);
            case 14:
                return w0.S(j);
        }
    }

    @Override // java.util.function.Function
    public Object apply(Object obj) {
        Set set = Collectors.a;
        return obj;
    }

    public /* synthetic */ Function compose(Function function) {
        return Function$-CC.$default$compose(this, function);
    }

    @Override // java.util.function.Supplier
    public Object get() {
        switch (this.a) {
            case 8:
                return new F();
            case 9:
                return new G();
            case 10:
                return new H();
            case 11:
                return new I();
            case 20:
                return new j$.util.w();
            case 22:
                return new ArrayList();
            case 24:
                return new j$.util.x();
            case 25:
                return new HashSet();
            case 27:
                return new j$.util.z();
            default:
                return new LinkedHashSet();
        }
    }

    @Override // java.util.function.ObjDoubleConsumer
    public void accept(Object obj, double d) {
        double[] dArr = (double[]) obj;
        switch (this.a) {
            case 5:
                dArr[2] = dArr[2] + 1.0d;
                Collectors.a(dArr, d);
                dArr[3] = dArr[3] + d;
                break;
            default:
                Collectors.a(dArr, d);
                dArr[2] = dArr[2] + d;
                break;
        }
    }

    @Override // java.util.function.BiConsumer
    public void accept(Object obj, Object obj2) {
        switch (this.a) {
            case 4:
                double[] dArr = (double[]) obj;
                double[] dArr2 = (double[]) obj2;
                Collectors.a(dArr, dArr2[0]);
                Collectors.a(dArr, dArr2[1]);
                dArr[2] = dArr[2] + dArr2[2];
                break;
            case 6:
                double[] dArr3 = (double[]) obj;
                double[] dArr4 = (double[]) obj2;
                Collectors.a(dArr3, dArr4[0]);
                Collectors.a(dArr3, dArr4[1]);
                dArr3[2] = dArr3[2] + dArr4[2];
                dArr3[3] = dArr3[3] + dArr4[3];
                break;
            case 21:
                ((Collection) obj).add(obj2);
                break;
            case 23:
                ((List) obj).add(obj2);
                break;
            case 26:
                ((Set) obj).add(obj2);
                break;
            default:
                ((LinkedHashSet) obj).add(obj2);
                break;
        }
    }

    @Override // java.util.function.IntFunction
    public Object apply(int i) {
        return new Object[i];
    }

    @Override // java.util.function.BiFunction
    public Object apply(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                Collection collection = (Collection) obj;
                Set set = Collectors.a;
                collection.addAll((Collection) obj2);
                return collection;
            case 1:
                List list = (List) obj;
                Set set2 = Collectors.a;
                list.addAll((List) obj2);
                return list;
            case 3:
                Set set3 = (Set) obj;
                Set set4 = (Set) obj2;
                Set set5 = Collectors.a;
                if (set3.size() < set4.size()) {
                    set4.addAll(set3);
                    return set4;
                }
                set3.addAll(set4);
                return set3;
            case 13:
                return new Q0((C0) obj, (C0) obj2);
            case 15:
                return new R0((E0) obj, (E0) obj2);
            case 17:
                return new S0((G0) obj, (G0) obj2);
            default:
                return new U0((I0) obj, (I0) obj2);
        }
    }
}

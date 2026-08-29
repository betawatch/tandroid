package j$.time.format;

import j$.time.LocalDate;
import j$.time.ZoneId;
import j$.time.ZoneOffset;
import j$.util.Objects;
import j$.util.function.BiConsumer$-CC;
import j$.util.function.BiFunction$-CC;
import j$.util.function.Function$-CC;
import j$.util.s1;
import j$.util.stream.Collectors;
import j$.util.z;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.DoubleBinaryOperator;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.Supplier;

/* loaded from: classes2.dex */
public final /* synthetic */ class a implements IntFunction, Supplier, BiConsumer, BinaryOperator, Function, DoubleBinaryOperator {
    public final /* synthetic */ int a;

    public /* synthetic */ a(int i10) {
        this.a = i10;
    }

    public /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
        switch (this.a) {
            case 10:
                break;
            case 13:
                break;
            case 16:
                break;
            case 20:
                break;
            case 25:
                break;
            case 26:
                break;
        }
        return BiConsumer$-CC.$default$andThen(this, biConsumer);
    }

    public /* synthetic */ BiFunction andThen(Function function) {
        switch (this.a) {
            case 11:
                break;
            case 18:
                break;
            case 21:
                break;
        }
        return BiFunction$-CC.$default$andThen(this, function);
    }

    public /* synthetic */ Function andThen(Function function) {
        switch (this.a) {
        }
        return Function$-CC.$default$andThen(this, function);
    }

    @Override // java.util.function.Function
    public Object apply(Object obj) {
        switch (this.a) {
            case 19:
                Set set = Collectors.a;
                return obj;
            default:
                return ((s1) obj).toString();
        }
    }

    @Override // java.util.function.DoubleBinaryOperator
    public double applyAsDouble(double d, double d10) {
        return Math.min(d, d10);
    }

    public /* synthetic */ Function compose(Function function) {
        switch (this.a) {
        }
        return Function$-CC.$default$compose(this, function);
    }

    @Override // java.util.function.BiFunction
    public Object apply(Object obj, Object obj2) {
        switch (this.a) {
            case 11:
                Collection collection = (Collection) obj;
                Set set = Collectors.a;
                collection.addAll((Collection) obj2);
                return collection;
            case 18:
                List list = (List) obj;
                Set set2 = Collectors.a;
                list.addAll((List) obj2);
                return list;
            case 21:
                s1 s1Var = (s1) obj;
                s1 s1Var2 = (s1) obj2;
                s1Var.getClass();
                Objects.requireNonNull(s1Var2);
                if (s1Var2.d != null) {
                    s1Var2.b();
                    s1Var.a(s1Var2.d[0]);
                }
                return s1Var;
            default:
                Set set3 = (Set) obj;
                Set set4 = (Set) obj2;
                Set set5 = Collectors.a;
                if (set3.size() < set4.size()) {
                    set4.addAll(set3);
                    return set4;
                }
                set3.addAll(set4);
                return set3;
        }
    }

    @Override // java.util.function.BiConsumer
    public void accept(Object obj, Object obj2) {
        switch (this.a) {
            case 10:
                ((Collection) obj).add(obj2);
                break;
            case 13:
                ((List) obj).add(obj2);
                break;
            case 16:
                ((Set) obj).add(obj2);
                break;
            case 20:
                ((s1) obj).a((CharSequence) obj2);
                break;
            case 25:
                ((LinkedHashSet) obj).add(obj2);
                break;
            case 26:
                ((LinkedHashSet) obj).addAll((LinkedHashSet) obj2);
                break;
            default:
                double[] dArr = (double[]) obj;
                double[] dArr2 = (double[]) obj2;
                Collectors.a(dArr, dArr2[0]);
                Collectors.a(dArr, dArr2[1]);
                dArr[2] = dArr[2] + dArr2[2];
                break;
        }
    }

    public Object a(j$.time.temporal.l lVar) {
        switch (this.a) {
            case 0:
                ZoneId zoneId = (ZoneId) lVar.m(j$.time.temporal.p.a);
                if (zoneId == null || (zoneId instanceof ZoneOffset)) {
                    return null;
                }
                return zoneId;
            case 1:
                return (ZoneId) lVar.m(j$.time.temporal.p.a);
            case 2:
                return (j$.time.chrono.k) lVar.m(j$.time.temporal.p.b);
            case 3:
                return (j$.time.temporal.q) lVar.m(j$.time.temporal.p.c);
            case 4:
                j$.time.temporal.a aVar = j$.time.temporal.a.OFFSET_SECONDS;
                if (lVar.e(aVar)) {
                    return ZoneOffset.O(lVar.j(aVar));
                }
                return null;
            case 5:
                ZoneId zoneId2 = (ZoneId) lVar.m(j$.time.temporal.p.a);
                return zoneId2 != null ? zoneId2 : (ZoneId) lVar.m(j$.time.temporal.p.d);
            case 6:
                j$.time.temporal.a aVar2 = j$.time.temporal.a.EPOCH_DAY;
                if (lVar.e(aVar2)) {
                    return LocalDate.R(lVar.y(aVar2));
                }
                return null;
            default:
                j$.time.temporal.a aVar3 = j$.time.temporal.a.NANO_OF_DAY;
                if (lVar.e(aVar3)) {
                    return j$.time.h.K(lVar.y(aVar3));
                }
                return null;
        }
    }

    public String toString() {
        switch (this.a) {
            case 1:
                return "ZoneId";
            case 2:
                return "Chronology";
            case 3:
                return "Precision";
            case 4:
                return "ZoneOffset";
            case 5:
                return "Zone";
            case 6:
                return "LocalDate";
            case 7:
                return "LocalTime";
            default:
                return super.toString();
        }
    }

    @Override // java.util.function.Supplier
    public Object get() {
        switch (this.a) {
            case 9:
                return new j$.util.w();
            case 12:
                return new ArrayList();
            case 14:
                return new j$.util.x();
            case 15:
                return new HashSet();
            case 17:
                return new z();
            case 24:
                return new LinkedHashSet();
            default:
                return new double[4];
        }
    }

    @Override // java.util.function.IntFunction
    public Object apply(int i10) {
        return new Object[i10];
    }
}

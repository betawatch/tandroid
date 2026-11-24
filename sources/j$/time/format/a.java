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
import java.util.function.DoubleFunction;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.Supplier;
import java.util.function.ToDoubleFunction;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes4.dex */
public final /* synthetic */ class a implements IntFunction, Supplier, BiConsumer, BinaryOperator, Function, DoubleFunction, ToDoubleFunction {
    public final /* synthetic */ byte a;

    public /* synthetic */ a(byte b) {
        this.a = b;
    }

    public final Object a(j$.time.temporal.l lVar) {
        byte b = this.a;
        a aVar = j$.time.temporal.p.a;
        switch (b) {
            case 0:
                ZoneId zoneId = (ZoneId) lVar.r(aVar);
                if (zoneId == null || (zoneId instanceof ZoneOffset)) {
                    return null;
                }
                return zoneId;
            case 1:
                return (ZoneId) lVar.r(aVar);
            case 2:
                return (j$.time.chrono.a) lVar.r(j$.time.temporal.p.b);
            case 3:
                return (j$.time.temporal.q) lVar.r(j$.time.temporal.p.c);
            case 4:
                j$.time.temporal.a aVar2 = j$.time.temporal.a.OFFSET_SECONDS;
                if (lVar.e(aVar2)) {
                    return ZoneOffset.H(lVar.j(aVar2));
                }
                return null;
            case 5:
                ZoneId zoneId2 = (ZoneId) lVar.r(aVar);
                return zoneId2 == null ? (ZoneId) lVar.r(j$.time.temporal.p.d) : zoneId2;
            case 6:
                j$.time.temporal.a aVar3 = j$.time.temporal.a.EPOCH_DAY;
                if (lVar.e(aVar3)) {
                    return LocalDate.K(lVar.y(aVar3));
                }
                return null;
            default:
                j$.time.temporal.a aVar4 = j$.time.temporal.a.NANO_OF_DAY;
                if (lVar.e(aVar4)) {
                    return j$.time.j.x(lVar.y(aVar4));
                }
                return null;
        }
    }

    @Override // java.util.function.BiConsumer
    public final void accept(Object obj, Object obj2) {
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
                ((j$.util.w) obj).a((j$.util.w) obj2);
                break;
        }
    }

    public final /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
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

    @Override // java.util.function.BiFunction
    public final Object apply(Object obj, Object obj2) {
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

    @Override // java.util.function.ToDoubleFunction
    public final double applyAsDouble(Object obj) {
        return ((Double) obj).doubleValue();
    }

    public final /* synthetic */ Function compose(Function function) {
        switch (this.a) {
        }
        return Function$-CC.$default$compose(this, function);
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        switch (this.a) {
            case 9:
                return new j$.util.w();
            case 10:
            case 11:
            case 13:
            case 16:
            default:
                return new LinkedHashSet();
            case 12:
                return new ArrayList();
            case 14:
                return new j$.util.x();
            case 15:
                return new HashSet();
            case 17:
                return new z();
        }
    }

    public final String toString() {
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

    public final /* synthetic */ BiFunction andThen(Function function) {
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

    public final /* synthetic */ Function andThen(Function function) {
        switch (this.a) {
        }
        return Function$-CC.$default$andThen(this, function);
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        switch (this.a) {
            case 19:
                Set set = Collectors.a;
                return obj;
            default:
                return ((s1) obj).toString();
        }
    }

    @Override // java.util.function.DoubleFunction
    public final Object apply(double d) {
        return Double.valueOf(d);
    }

    @Override // java.util.function.IntFunction
    public final Object apply(int i) {
        return new Object[i];
    }
}

package j$.time;

import j$.util.Spliterator;
import j$.util.function.Consumer$-CC;
import j$.util.function.Function$-CC;
import j$.util.function.Predicate$-CC;
import j$.util.s1;
import j$.util.stream.Collectors;
import j$.util.stream.IntStream;
import j$.util.stream.LongStream;
import j$.util.stream.Stream;
import j$.util.stream.a0;
import j$.util.stream.b0;
import j$.util.stream.c0;
import j$.util.stream.g7;
import j$.util.stream.i7;
import j$.util.stream.j1;
import j$.util.stream.j5;
import j$.util.stream.k1;
import j$.util.stream.k7;
import j$.util.stream.u6;
import j$.util.stream.z7;
import java.util.EnumMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.BooleanSupplier;
import java.util.function.Consumer;
import java.util.function.DoubleFunction;
import java.util.function.Function;
import java.util.function.LongFunction;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.DoubleStream;

/* loaded from: classes2.dex */
public final class t implements j$.time.temporal.l, Consumer, Predicate, Supplier, DoubleFunction, Function, LongFunction, BooleanSupplier {
    public final /* synthetic */ int a;
    public Object b;

    public /* synthetic */ t(int i10) {
        this.a = i10;
    }

    public /* synthetic */ t(int i10, Object obj) {
        this.a = i10;
        this.b = obj;
    }

    public /* synthetic */ Predicate and(Predicate predicate) {
        return Predicate$-CC.$default$and(this, predicate);
    }

    public /* synthetic */ Consumer andThen(Consumer consumer) {
        switch (this.a) {
            case 1:
                break;
            case 9:
                break;
        }
        return Consumer$-CC.$default$andThen(this, consumer);
    }

    public /* synthetic */ Function andThen(Function function) {
        return Function$-CC.$default$andThen(this, function);
    }

    public /* synthetic */ Function compose(Function function) {
        return Function$-CC.$default$compose(this, function);
    }

    @Override // j$.time.temporal.l
    public boolean e(j$.time.temporal.o oVar) {
        return false;
    }

    @Override // j$.time.temporal.l
    public /* synthetic */ int j(j$.time.temporal.o oVar) {
        return j$.time.temporal.p.a(this, oVar);
    }

    @Override // j$.time.temporal.l
    public /* synthetic */ j$.time.temporal.s l(j$.time.temporal.o oVar) {
        return j$.time.temporal.p.d(this, oVar);
    }

    public /* synthetic */ Predicate negate() {
        return Predicate$-CC.$default$negate(this);
    }

    public /* synthetic */ Predicate or(Predicate predicate) {
        return Predicate$-CC.$default$or(this, predicate);
    }

    @Override // java.util.function.Predicate
    public boolean test(Object obj) {
        return !((Predicate) this.b).test(obj);
    }

    @Override // java.util.function.Function
    public Object apply(Object obj) {
        Object apply = ((Function) this.b).apply(obj);
        if (apply == null) {
            return null;
        }
        if (apply instanceof Stream) {
            return Stream.Wrapper.convert((Stream) apply);
        }
        if (apply instanceof java.util.stream.Stream) {
            return Stream.VivifiedWrapper.convert((java.util.stream.Stream) apply);
        }
        if (apply instanceof IntStream) {
            return IntStream.Wrapper.convert((IntStream) apply);
        }
        if (apply instanceof java.util.stream.IntStream) {
            return IntStream.VivifiedWrapper.convert((java.util.stream.IntStream) apply);
        }
        if (apply instanceof c0) {
            return b0.f((c0) apply);
        }
        if (apply instanceof DoubleStream) {
            return a0.f((DoubleStream) apply);
        }
        if (apply instanceof LongStream) {
            return k1.f((LongStream) apply);
        }
        if (apply instanceof java.util.stream.LongStream) {
            return j1.f((java.util.stream.LongStream) apply);
        }
        j$.util.g.a(apply.getClass(), "java.util.stream.*Stream");
        throw null;
    }

    @Override // java.util.function.DoubleFunction
    public Object apply(double d) {
        Object apply = ((DoubleFunction) this.b).apply(d);
        if (apply == null) {
            return null;
        }
        if (apply instanceof c0) {
            return b0.f((c0) apply);
        }
        if (apply instanceof DoubleStream) {
            return a0.f((DoubleStream) apply);
        }
        j$.util.g.a(apply.getClass(), "java.util.stream.DoubleStream");
        throw null;
    }

    @Override // java.util.function.LongFunction
    public Object apply(long j10) {
        Object apply = ((LongFunction) this.b).apply(j10);
        if (apply == null) {
            return null;
        }
        if (apply instanceof LongStream) {
            return k1.f((LongStream) apply);
        }
        if (apply instanceof java.util.stream.LongStream) {
            return j1.f((java.util.stream.LongStream) apply);
        }
        j$.util.g.a(apply.getClass(), "java.util.stream.LongStream");
        throw null;
    }

    @Override // java.util.function.BooleanSupplier
    public boolean getAsBoolean() {
        switch (this.a) {
            case 12:
                g7 g7Var = (g7) this.b;
                return g7Var.d.tryAdvance(g7Var.e);
            case 13:
                i7 i7Var = (i7) this.b;
                return i7Var.d.tryAdvance(i7Var.e);
            case 14:
                k7 k7Var = (k7) this.b;
                return k7Var.d.tryAdvance(k7Var.e);
            default:
                z7 z7Var = (z7) this.b;
                return z7Var.d.tryAdvance(z7Var.e);
        }
    }

    public void D(u6 u6Var) {
        ((EnumMap) ((Map) this.b)).put((EnumMap) u6Var, (u6) 1);
    }

    @Override // java.util.function.Supplier
    public Object get() {
        switch (this.a) {
            case 3:
                return ((j$.util.stream.a) this.b).R0(0);
            case 4:
                return (Spliterator) this.b;
            default:
                CharSequence charSequence = (CharSequence) this.b;
                Set set = Collectors.a;
                return new s1(charSequence);
        }
    }

    @Override // j$.time.temporal.l
    public long y(j$.time.temporal.o oVar) {
        throw new j$.time.temporal.r(c.a("Unsupported field: ", oVar));
    }

    @Override // j$.time.temporal.l
    public Object m(j$.time.format.a aVar) {
        if (aVar == j$.time.temporal.p.a) {
            return (ZoneId) this.b;
        }
        return j$.time.temporal.p.c(this, aVar);
    }

    @Override // java.util.function.Consumer
    public void accept(Object obj) {
        switch (this.a) {
            case 1:
                ((Consumer) this.b).accept(new j$.util.q((Map.Entry) obj));
                break;
            case 9:
                ((j5) this.b).accept((j5) obj);
                break;
            default:
                ((List) this.b).add(obj);
                break;
        }
    }
}

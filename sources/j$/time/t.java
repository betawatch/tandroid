package j$.time;

import j$.util.Spliterator;
import j$.util.function.Consumer$-CC;
import j$.util.function.Function$-CC;
import j$.util.function.Predicate$-CC;
import j$.util.r0;
import j$.util.stream.A;
import j$.util.stream.B;
import j$.util.stream.Collectors;
import j$.util.stream.IntStream;
import j$.util.stream.LongStream;
import j$.util.stream.R2;
import j$.util.stream.Stream;
import j$.util.stream.d3;
import j$.util.stream.f3;
import j$.util.stream.g2;
import j$.util.stream.h0;
import j$.util.stream.h3;
import j$.util.stream.i0;
import j$.util.stream.w3;
import j$.util.stream.z;
import java.util.ArrayList;
import java.util.EnumMap;
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

    public /* synthetic */ t(int i) {
        this.a = i;
    }

    public /* synthetic */ t(int i, Object obj) {
        this.a = i;
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
    public boolean h(j$.time.temporal.o oVar) {
        return false;
    }

    public /* synthetic */ Predicate negate() {
        return Predicate$-CC.$default$negate(this);
    }

    @Override // j$.time.temporal.l
    public /* synthetic */ int o(j$.time.temporal.o oVar) {
        return j$.time.temporal.p.a(this, oVar);
    }

    public /* synthetic */ Predicate or(Predicate predicate) {
        return Predicate$-CC.$default$or(this, predicate);
    }

    @Override // j$.time.temporal.l
    public /* synthetic */ j$.time.temporal.s q(j$.time.temporal.o oVar) {
        return j$.time.temporal.p.d(this, oVar);
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
        if (apply instanceof B) {
            return A.j((B) apply);
        }
        if (apply instanceof DoubleStream) {
            return z.j((DoubleStream) apply);
        }
        if (apply instanceof LongStream) {
            return i0.j((LongStream) apply);
        }
        if (apply instanceof java.util.stream.LongStream) {
            return h0.j((java.util.stream.LongStream) apply);
        }
        j$.util.e.a("java.util.stream.*Stream", apply.getClass());
        throw null;
    }

    @Override // java.util.function.DoubleFunction
    public Object apply(double d) {
        Object apply = ((DoubleFunction) this.b).apply(d);
        if (apply == null) {
            return null;
        }
        if (apply instanceof B) {
            return A.j((B) apply);
        }
        if (apply instanceof DoubleStream) {
            return z.j((DoubleStream) apply);
        }
        j$.util.e.a("java.util.stream.DoubleStream", apply.getClass());
        throw null;
    }

    @Override // java.util.function.LongFunction
    public Object apply(long j) {
        Object apply = ((LongFunction) this.b).apply(j);
        if (apply == null) {
            return null;
        }
        if (apply instanceof LongStream) {
            return i0.j((LongStream) apply);
        }
        if (apply instanceof java.util.stream.LongStream) {
            return h0.j((java.util.stream.LongStream) apply);
        }
        j$.util.e.a("java.util.stream.LongStream", apply.getClass());
        throw null;
    }

    @Override // java.util.function.BooleanSupplier
    public boolean getAsBoolean() {
        switch (this.a) {
            case 12:
                d3 d3Var = (d3) this.b;
                return d3Var.d.tryAdvance(d3Var.e);
            case 13:
                f3 f3Var = (f3) this.b;
                return f3Var.d.tryAdvance(f3Var.e);
            case 14:
                h3 h3Var = (h3) this.b;
                return h3Var.d.tryAdvance(h3Var.e);
            default:
                w3 w3Var = (w3) this.b;
                return w3Var.d.tryAdvance(w3Var.e);
        }
    }

    public void H(R2 r2) {
        ((EnumMap) this.b).put((EnumMap) r2, (R2) 1);
    }

    @Override // java.util.function.Supplier
    public Object get() {
        switch (this.a) {
            case 3:
                return ((j$.util.stream.a) this.b).N(0);
            case 4:
                return (Spliterator) this.b;
            default:
                Set set = Collectors.a;
                return new r0((CharSequence) this.b);
        }
    }

    @Override // j$.time.temporal.l
    public long u(j$.time.temporal.o oVar) {
        throw new j$.time.temporal.r(c.a("Unsupported field: ", oVar));
    }

    @Override // j$.time.temporal.l
    public Object r(j$.time.format.a aVar) {
        if (aVar == j$.time.temporal.p.a) {
            return (ZoneId) this.b;
        }
        return j$.time.temporal.p.c(this, aVar);
    }

    @Override // java.util.function.Consumer
    public void accept(Object obj) {
        switch (this.a) {
            case 1:
                ((Consumer) this.b).accept(new j$.util.o((Map.Entry) obj));
                break;
            case 9:
                ((g2) this.b).accept((g2) obj);
                break;
            default:
                ((ArrayList) this.b).add(obj);
                break;
        }
    }
}

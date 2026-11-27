package j$.time;

import j$.util.Spliterator;
import j$.util.function.Consumer$-CC;
import j$.util.function.Function$-CC;
import j$.util.function.Predicate$-CC;
import j$.util.stream.IntStream;
import j$.util.stream.LongStream;
import j$.util.stream.Stream;
import j$.util.stream.d0;
import j$.util.stream.e0;
import j$.util.stream.f0;
import j$.util.stream.f8;
import j$.util.stream.m1;
import j$.util.stream.m7;
import j$.util.stream.n1;
import j$.util.stream.n5;
import j$.util.stream.o7;
import j$.util.stream.q7;
import java.util.Map;
import java.util.function.BooleanSupplier;
import java.util.function.Consumer;
import java.util.function.DoubleFunction;
import java.util.function.Function;
import java.util.function.LongFunction;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.DoubleStream;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes4.dex */
public final class v implements j$.time.temporal.l, Consumer, Predicate, Supplier, DoubleFunction, Function, LongFunction, BooleanSupplier {
    public final /* synthetic */ byte a;
    public Object b;

    public /* synthetic */ v(byte b, Object obj) {
        this.a = b;
        this.b = obj;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        switch (this.a) {
            case 1:
                ((Consumer) this.b).accept(new j$.util.q((Map.Entry) obj));
                break;
            default:
                ((n5) this.b).accept((n5) obj);
                break;
        }
    }

    public final /* synthetic */ Predicate and(Predicate predicate) {
        return Predicate$-CC.$default$and(this, predicate);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        switch (this.a) {
        }
        return Consumer$-CC.$default$andThen(this, consumer);
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
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
        if (apply instanceof f0) {
            return e0.g((f0) apply);
        }
        if (apply instanceof DoubleStream) {
            return d0.g((DoubleStream) apply);
        }
        if (apply instanceof LongStream) {
            return n1.g((LongStream) apply);
        }
        if (apply instanceof java.util.stream.LongStream) {
            return m1.g((java.util.stream.LongStream) apply);
        }
        j$.util.g.a(apply.getClass(), "java.util.stream.*Stream");
        throw null;
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function$-CC.$default$compose(this, function);
    }

    @Override // j$.time.temporal.l
    public final boolean e(j$.time.temporal.o oVar) {
        return false;
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        switch (this.a) {
            case 3:
                return ((j$.util.stream.a) this.b).N(0);
            default:
                return (Spliterator) this.b;
        }
    }

    @Override // java.util.function.BooleanSupplier
    public final boolean getAsBoolean() {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 9:
                m7 m7Var = (m7) obj;
                return m7Var.d.tryAdvance(m7Var.e);
            case 10:
                o7 o7Var = (o7) obj;
                return o7Var.d.tryAdvance(o7Var.e);
            case 11:
                q7 q7Var = (q7) obj;
                return q7Var.d.tryAdvance(q7Var.e);
            default:
                f8 f8Var = (f8) obj;
                return f8Var.d.tryAdvance(f8Var.e);
        }
    }

    @Override // j$.time.temporal.l
    public final /* synthetic */ int j(j$.time.temporal.o oVar) {
        return j$.time.temporal.p.a(this, oVar);
    }

    @Override // j$.time.temporal.l
    public final /* synthetic */ j$.time.temporal.s l(j$.time.temporal.o oVar) {
        return j$.time.temporal.p.d(this, oVar);
    }

    public final /* synthetic */ Predicate negate() {
        return Predicate$-CC.$default$negate(this);
    }

    public final /* synthetic */ Predicate or(Predicate predicate) {
        return Predicate$-CC.$default$or(this, predicate);
    }

    @Override // j$.time.temporal.l
    public final Object r(j$.time.format.a aVar) {
        return aVar == j$.time.temporal.p.a ? (ZoneId) this.b : j$.time.temporal.p.c(this, aVar);
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        return !((Predicate) this.b).test(obj);
    }

    @Override // j$.time.temporal.l
    public final long y(j$.time.temporal.o oVar) {
        throw new j$.time.temporal.r(d.a("Unsupported field: ", oVar));
    }

    public /* synthetic */ v(byte b) {
        this.a = b;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function$-CC.$default$andThen(this, function);
    }

    @Override // java.util.function.DoubleFunction
    public final Object apply(double d) {
        Object apply = ((DoubleFunction) this.b).apply(d);
        if (apply == null) {
            return null;
        }
        if (apply instanceof f0) {
            return e0.g((f0) apply);
        }
        if (apply instanceof DoubleStream) {
            return d0.g((DoubleStream) apply);
        }
        j$.util.g.a(apply.getClass(), "java.util.stream.DoubleStream");
        throw null;
    }

    @Override // java.util.function.LongFunction
    public final Object apply(long j) {
        Object apply = ((LongFunction) this.b).apply(j);
        if (apply == null) {
            return null;
        }
        if (apply instanceof LongStream) {
            return n1.g((LongStream) apply);
        }
        if (apply instanceof java.util.stream.LongStream) {
            return m1.g((java.util.stream.LongStream) apply);
        }
        j$.util.g.a(apply.getClass(), "java.util.stream.LongStream");
        throw null;
    }
}

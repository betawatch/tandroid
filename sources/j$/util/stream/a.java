package j$.util.stream;

import j$.util.Spliterator;
import j$.util.function.Consumer$-CC;
import j$.util.function.Function$-CC;
import j$.util.stream.IntStream;
import j$.util.stream.Stream;
import java.util.ArrayList;
import java.util.function.BooleanSupplier;
import java.util.function.Consumer;
import java.util.function.DoubleFunction;
import java.util.function.Function;
import java.util.function.LongFunction;
import java.util.function.Supplier;
import java.util.stream.DoubleStream;

/* loaded from: classes2.dex */
public final /* synthetic */ class a implements Supplier, Consumer, BooleanSupplier, DoubleFunction, Function, LongFunction {
    public final /* synthetic */ int a;
    public Object b;

    public /* synthetic */ a(int i) {
        this.a = i;
    }

    public /* synthetic */ a(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // java.util.function.Consumer
    public void accept(Object obj) {
        switch (this.a) {
            case 1:
                ((m2) this.b).accept((m2) obj);
                break;
            default:
                ((ArrayList) this.b).add(obj);
                break;
        }
    }

    public /* synthetic */ Consumer andThen(Consumer consumer) {
        switch (this.a) {
        }
        return Consumer$-CC.$default$andThen(this, consumer);
    }

    public /* synthetic */ Function andThen(Function function) {
        return Function$-CC.$default$andThen(this, function);
    }

    public /* synthetic */ Function compose(Function function) {
        return Function$-CC.$default$compose(this, function);
    }

    @Override // java.util.function.Supplier
    public Object get() {
        switch (this.a) {
            case 0:
                return ((b) this.b).L();
            default:
                return (Spliterator) this.b;
        }
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
        if (apply instanceof D) {
            return C.j((D) apply);
        }
        if (apply instanceof DoubleStream) {
            return B.j((DoubleStream) apply);
        }
        if (apply instanceof LongStream) {
            return l0.j((LongStream) apply);
        }
        if (apply instanceof java.util.stream.LongStream) {
            return k0.j((java.util.stream.LongStream) apply);
        }
        j$.util.f.a("java.util.stream.*Stream", apply.getClass());
        throw null;
    }

    @Override // java.util.function.DoubleFunction
    public Object apply(double d) {
        Object apply = ((DoubleFunction) this.b).apply(d);
        if (apply == null) {
            return null;
        }
        if (apply instanceof D) {
            return C.j((D) apply);
        }
        if (apply instanceof DoubleStream) {
            return B.j((DoubleStream) apply);
        }
        j$.util.f.a("java.util.stream.DoubleStream", apply.getClass());
        throw null;
    }

    @Override // java.util.function.LongFunction
    public Object apply(long j) {
        Object apply = ((LongFunction) this.b).apply(j);
        if (apply == null) {
            return null;
        }
        if (apply instanceof LongStream) {
            return l0.j((LongStream) apply);
        }
        if (apply instanceof java.util.stream.LongStream) {
            return k0.j((java.util.stream.LongStream) apply);
        }
        j$.util.f.a("java.util.stream.LongStream", apply.getClass());
        throw null;
    }

    @Override // java.util.function.BooleanSupplier
    public boolean getAsBoolean() {
        switch (this.a) {
            case 2:
                l3 l3Var = (l3) this.b;
                return l3Var.d.tryAdvance(l3Var.e);
            case 3:
                n3 n3Var = (n3) this.b;
                return n3Var.d.tryAdvance(n3Var.e);
            case 4:
                p3 p3Var = (p3) this.b;
                return p3Var.d.tryAdvance(p3Var.e);
            default:
                E3 e3 = (E3) this.b;
                return e3.d.tryAdvance(e3.e);
        }
    }
}

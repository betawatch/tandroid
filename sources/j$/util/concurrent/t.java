package j$.util.concurrent;

import j$.util.Spliterator;
import j$.util.function.BiConsumer$-CC;
import j$.util.function.BiFunction$-CC;
import j$.util.function.Consumer$-CC;
import j$.util.stream.b8;
import j$.util.stream.e7;
import j$.util.stream.m1;
import j$.util.stream.q1;
import j$.util.stream.r1;
import j$.util.stream.s1;
import j$.util.stream.t3;
import j$.util.stream.v6;
import j$.util.stream.w6;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

/* loaded from: classes2.dex */
public final /* synthetic */ class t implements BiConsumer, BiFunction, Consumer, Supplier, b8 {
    public final /* synthetic */ int a;
    public final Object b;
    public final Object c;

    public /* synthetic */ t(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    public /* synthetic */ t(BiFunction biFunction, Function function) {
        this.a = 2;
        this.c = biFunction;
        this.b = function;
    }

    public /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
        switch (this.a) {
        }
        return BiConsumer$-CC.$default$andThen(this, biConsumer);
    }

    public /* synthetic */ BiFunction andThen(Function function) {
        return BiFunction$-CC.$default$andThen(this, function);
    }

    public /* synthetic */ Consumer andThen(Consumer consumer) {
        switch (this.a) {
        }
        return Consumer$-CC.$default$andThen(this, consumer);
    }

    @Override // java.util.function.BiFunction
    public Object apply(Object obj, Object obj2) {
        return ((Function) this.b).apply(((BiFunction) this.c).apply(obj, obj2));
    }

    @Override // java.util.function.BiConsumer
    public void accept(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                ConcurrentMap concurrentMap = (ConcurrentMap) this.b;
                BiFunction biFunction = (BiFunction) this.c;
                while (!concurrentMap.replace(obj, obj2, biFunction.apply(obj, obj2)) && (obj2 = concurrentMap.get(obj)) != null) {
                }
            default:
                BiConsumer biConsumer = (BiConsumer) this.b;
                BiConsumer biConsumer2 = (BiConsumer) this.c;
                biConsumer.accept(obj, obj2);
                biConsumer2.accept(obj, obj2);
                break;
        }
    }

    @Override // java.util.function.Supplier
    public Object get() {
        return new m1((r1) this.b, (Predicate) this.c);
    }

    public t(w6 w6Var, r1 r1Var, Supplier supplier) {
        this.a = 6;
        this.b = r1Var;
        this.c = supplier;
    }

    @Override // j$.util.stream.b8
    public int v() {
        return v6.u | v6.r;
    }

    @Override // j$.util.stream.b8
    public Object f(j$.util.stream.a aVar, Spliterator spliterator) {
        q1 q1Var = (q1) ((Supplier) this.c).get();
        aVar.F0(spliterator, q1Var);
        return Boolean.valueOf(q1Var.b);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // j$.util.stream.b8
    public Object i(t3 t3Var, Spliterator spliterator) {
        return (Boolean) new s1(this, (j$.util.stream.a) t3Var, spliterator).invoke();
    }

    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public void x(Object obj) {
        switch (this.a) {
            case 3:
                Consumer consumer = (Consumer) this.b;
                Consumer consumer2 = (Consumer) this.c;
                consumer.x(obj);
                consumer2.x(obj);
                break;
            case 4:
                AtomicBoolean atomicBoolean = (AtomicBoolean) this.b;
                ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) this.c;
                if (obj != null) {
                    concurrentHashMap.putIfAbsent(obj, Boolean.TRUE);
                    break;
                } else {
                    atomicBoolean.set(true);
                    break;
                }
            case 5:
            case 6:
            default:
                e7 e7Var = (e7) this.b;
                Consumer consumer3 = (Consumer) this.c;
                if (e7Var.b.putIfAbsent(obj != null ? obj : e7.d, Boolean.TRUE) == null) {
                    consumer3.x(obj);
                    break;
                }
                break;
            case 7:
                ((BiConsumer) this.b).accept(this.c, obj);
                break;
        }
    }
}

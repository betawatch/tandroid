package j$.util.concurrent;

import j$.util.Spliterator;
import j$.util.function.BiConsumer$-CC;
import j$.util.function.BiFunction$-CC;
import j$.util.function.Consumer$-CC;
import j$.util.stream.S2;
import j$.util.stream.T2;
import j$.util.stream.b3;
import j$.util.stream.j0;
import j$.util.stream.n0;
import j$.util.stream.o0;
import j$.util.stream.p0;
import j$.util.stream.y3;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

/* loaded from: classes2.dex */
public final /* synthetic */ class t implements BiConsumer, BiFunction, Consumer, Supplier, y3 {
    public final /* synthetic */ int a;
    public final Object b;
    public final Object c;

    public /* synthetic */ t(int i, Object obj, Object obj2) {
        this.a = i;
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
                break;
            default:
                ((BiConsumer) this.b).accept(obj, obj2);
                ((BiConsumer) this.c).accept(obj, obj2);
                return;
        }
        do {
            Object apply = ((BiFunction) this.c).apply(obj, obj2);
            ConcurrentMap concurrentMap = (ConcurrentMap) this.b;
            if (concurrentMap.replace(obj, obj2, apply)) {
                return;
            } else {
                obj2 = concurrentMap.get(obj);
            }
        } while (obj2 != null);
    }

    @Override // java.util.function.Supplier
    public Object get() {
        return new j0((o0) this.b, (Predicate) this.c);
    }

    public t(T2 t2, o0 o0Var, Supplier supplier) {
        this.a = 6;
        this.b = o0Var;
        this.c = supplier;
    }

    @Override // j$.util.stream.y3
    public int d() {
        return S2.u | S2.r;
    }

    @Override // j$.util.stream.y3
    public Object b(j$.util.stream.a aVar, Spliterator spliterator) {
        n0 n0Var = (n0) ((Supplier) this.c).get();
        aVar.Q(spliterator, n0Var);
        return Boolean.valueOf(n0Var.b);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // j$.util.stream.y3
    public Object c(j$.util.stream.a aVar, Spliterator spliterator) {
        return (Boolean) new p0(this, aVar, spliterator).invoke();
    }

    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public void s(Object obj) {
        switch (this.a) {
            case 3:
                ((Consumer) this.b).s(obj);
                ((Consumer) this.c).s(obj);
                break;
            case 4:
                if (obj == null) {
                    ((AtomicBoolean) this.b).set(true);
                    break;
                } else {
                    ((ConcurrentHashMap) this.c).putIfAbsent(obj, Boolean.TRUE);
                    break;
                }
            case 5:
            case 6:
            default:
                b3 b3Var = (b3) this.b;
                b3Var.getClass();
                if (b3Var.b.putIfAbsent(obj != null ? obj : b3.d, Boolean.TRUE) == null) {
                    ((Consumer) this.c).s(obj);
                    break;
                }
                break;
            case 7:
                ((BiConsumer) this.b).accept(this.c, obj);
                break;
        }
    }
}

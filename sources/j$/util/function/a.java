package j$.util.function;

import j$.util.Spliterator;
import j$.util.stream.b7;
import j$.util.stream.c7;
import j$.util.stream.h8;
import j$.util.stream.k7;
import j$.util.stream.p1;
import j$.util.stream.t1;
import j$.util.stream.u1;
import j$.util.stream.v1;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes4.dex */
public final /* synthetic */ class a implements BiConsumer, BiFunction, Consumer, Supplier, h8 {
    public final /* synthetic */ byte a;
    public final Object b;
    public final Object c;

    public a(c7 c7Var, u1 u1Var, Supplier supplier) {
        this.a = (byte) 4;
        this.b = u1Var;
        this.c = supplier;
    }

    @Override // j$.util.stream.h8
    public final Object a(j$.util.stream.a aVar, Spliterator spliterator) {
        t1 t1Var = (t1) ((Supplier) this.c).get();
        aVar.Q(spliterator, t1Var);
        return Boolean.valueOf(t1Var.b);
    }

    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final void x(Object obj) {
        byte b = this.a;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (b) {
            case 2:
                ((Consumer) obj3).x(obj);
                ((Consumer) obj2).x(obj);
                break;
            case 5:
                ((BiConsumer) obj3).accept(obj2, obj);
                break;
            default:
                Consumer consumer = (Consumer) obj2;
                if (((k7) obj3).b.putIfAbsent(obj != null ? obj : k7.d, Boolean.TRUE) == null) {
                    consumer.x(obj);
                    break;
                }
                break;
        }
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        switch (this.a) {
            case 2:
                break;
            case 5:
                break;
        }
        return Consumer$-CC.$default$andThen(this, consumer);
    }

    @Override // java.util.function.BiFunction
    public final Object apply(Object obj, Object obj2) {
        return ((Function) this.c).apply(((BiFunction) this.b).apply(obj, obj2));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // j$.util.stream.h8
    public final Object b(j$.util.stream.a aVar, Spliterator spliterator) {
        return (Boolean) new v1(this, aVar, spliterator).invoke();
    }

    @Override // j$.util.stream.h8
    public final int c() {
        return b7.u | b7.r;
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        return new p1((u1) this.b, (Predicate) this.c);
    }

    public /* synthetic */ a(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    public final /* synthetic */ BiFunction andThen(Function function) {
        return BiFunction$-CC.$default$andThen(this, function);
    }

    public final /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
        return BiConsumer$-CC.$default$andThen(this, biConsumer);
    }

    @Override // java.util.function.BiConsumer
    public final void accept(Object obj, Object obj2) {
        BiConsumer biConsumer = (BiConsumer) this.b;
        BiConsumer biConsumer2 = (BiConsumer) this.c;
        biConsumer.accept(obj, obj2);
        biConsumer2.accept(obj, obj2);
    }
}

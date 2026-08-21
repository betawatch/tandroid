package j$.util.stream;

import j$.util.function.Consumer$-CC;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;

/* loaded from: classes2.dex */
public final class B1 extends N1 implements M1 {
    public final /* synthetic */ Object b;
    public final /* synthetic */ BiFunction c;
    public final /* synthetic */ BinaryOperator d;

    @Override // j$.util.stream.g2
    public final /* synthetic */ boolean C() {
        return false;
    }

    @Override // j$.util.stream.g2
    public final /* synthetic */ void accept(double d) {
        r1.a();
        throw null;
    }

    @Override // j$.util.stream.g2
    public final /* synthetic */ void accept(int i) {
        r1.k();
        throw null;
    }

    @Override // j$.util.stream.g2
    public final /* synthetic */ void accept(long j) {
        r1.l();
        throw null;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$-CC.$default$andThen(this, consumer);
    }

    @Override // j$.util.stream.g2
    public final /* synthetic */ void x() {
    }

    @Override // j$.util.stream.M1
    public final void n(M1 m1) {
        this.a = this.d.apply(this.a, ((B1) m1).a);
    }

    @Override // j$.util.stream.g2
    public final void y(long j) {
        this.a = this.b;
    }

    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final void s(Object obj) {
        this.a = this.c.apply(this.a, obj);
    }

    public B1(Object obj, BiFunction biFunction, BinaryOperator binaryOperator) {
        this.b = obj;
        this.c = biFunction;
        this.d = binaryOperator;
    }
}

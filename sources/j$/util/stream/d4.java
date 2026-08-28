package j$.util.stream;

import j$.util.function.Consumer$-CC;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;

/* loaded from: classes2.dex */
public final class d4 extends p4 implements o4 {
    public final /* synthetic */ Object b;
    public final /* synthetic */ BiFunction c;
    public final /* synthetic */ BinaryOperator d;

    @Override // j$.util.stream.j5
    public final /* synthetic */ void accept(double d) {
        t3.C();
        throw null;
    }

    @Override // j$.util.stream.j5, j$.util.stream.h5, java.util.function.IntConsumer
    public final /* synthetic */ void accept(int i9) {
        t3.J();
        throw null;
    }

    @Override // j$.util.stream.j5
    public final /* synthetic */ void accept(long j10) {
        t3.K();
        throw null;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$-CC.$default$andThen(this, consumer);
    }

    @Override // j$.util.stream.j5
    public final /* synthetic */ void end() {
    }

    @Override // j$.util.stream.j5
    public final /* synthetic */ boolean q() {
        return false;
    }

    @Override // j$.util.stream.o4
    public final void u(o4 o4Var) {
        this.a = this.d.apply(this.a, ((d4) o4Var).a);
    }

    @Override // j$.util.stream.j5
    public final void o(long j10) {
        this.a = this.b;
    }

    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final void x(Object obj) {
        this.a = this.c.apply(this.a, obj);
    }

    public d4(Object obj, BiFunction biFunction, BinaryOperator binaryOperator) {
        this.b = obj;
        this.c = biFunction;
        this.d = binaryOperator;
    }
}

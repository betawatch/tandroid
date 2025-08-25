package j$.util.stream;

import j$.util.Optional;
import j$.util.function.Consumer$-CC;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;

/* loaded from: classes2.dex */
final class I1 implements S1 {
    private boolean a;
    private Object b;
    final /* synthetic */ BinaryOperator c;

    @Override // j$.util.stream.m2, j$.util.stream.j2, java.util.function.DoubleConsumer
    public final /* synthetic */ void accept(double d) {
        w0.a();
        throw null;
    }

    @Override // j$.util.stream.m2
    public final /* synthetic */ void accept(int i) {
        w0.k();
        throw null;
    }

    @Override // j$.util.stream.m2
    public final /* synthetic */ void accept(long j) {
        w0.l();
        throw null;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$-CC.$default$andThen(this, consumer);
    }

    @Override // j$.util.stream.m2
    public final /* synthetic */ void k() {
    }

    @Override // j$.util.stream.m2
    public final /* synthetic */ boolean n() {
        return false;
    }

    I1(BinaryOperator binaryOperator) {
        this.c = binaryOperator;
    }

    @Override // j$.util.stream.S1
    public final void g(S1 s1) {
        I1 i1 = (I1) s1;
        if (i1.a) {
            return;
        }
        p(i1.b);
    }

    @Override // j$.util.stream.m2
    public final void l(long j) {
        this.a = true;
        this.b = null;
    }

    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final void p(Object obj) {
        if (this.a) {
            this.a = false;
            this.b = obj;
        } else {
            this.b = this.c.apply(this.b, obj);
        }
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        return this.a ? Optional.empty() : Optional.of(this.b);
    }
}

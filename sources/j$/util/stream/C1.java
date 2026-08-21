package j$.util.stream;

import j$.util.Optional;
import j$.util.function.Consumer$-CC;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;

/* loaded from: classes2.dex */
public final class C1 implements M1 {
    public boolean a;
    public Object b;
    public final /* synthetic */ BinaryOperator c;

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

    public C1(BinaryOperator binaryOperator) {
        this.c = binaryOperator;
    }

    @Override // j$.util.stream.M1
    public final void n(M1 m1) {
        C1 c1 = (C1) m1;
        if (c1.a) {
            return;
        }
        s(c1.b);
    }

    @Override // j$.util.stream.g2
    public final void y(long j) {
        this.a = true;
        this.b = null;
    }

    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final void s(Object obj) {
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

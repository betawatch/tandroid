package j$.util.stream;

import j$.util.Optional;
import j$.util.function.Consumer$-CC;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;

/* loaded from: classes2.dex */
public final class B1 implements L1 {
    public boolean a;
    public Object b;
    public final /* synthetic */ BinaryOperator c;

    @Override // j$.util.stream.f2
    public final /* synthetic */ boolean C() {
        return false;
    }

    @Override // j$.util.stream.f2
    public final /* synthetic */ void accept(double d) {
        q1.a();
        throw null;
    }

    @Override // j$.util.stream.f2
    public final /* synthetic */ void accept(int i) {
        q1.k();
        throw null;
    }

    @Override // j$.util.stream.f2
    public final /* synthetic */ void accept(long j) {
        q1.l();
        throw null;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$-CC.$default$andThen(this, consumer);
    }

    @Override // j$.util.stream.f2
    public final /* synthetic */ void x() {
    }

    public B1(BinaryOperator binaryOperator) {
        this.c = binaryOperator;
    }

    @Override // j$.util.stream.L1
    public final void n(L1 l1) {
        B1 b1 = (B1) l1;
        if (b1.a) {
            return;
        }
        s(b1.b);
    }

    @Override // j$.util.stream.f2
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

package j$.util.stream;

import j$.util.Optional;
import j$.util.function.Consumer$-CC;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes4.dex */
public final class h4 implements r4 {
    public boolean a;
    public Object b;
    public final /* synthetic */ BinaryOperator c;

    public h4(BinaryOperator binaryOperator) {
        this.c = binaryOperator;
    }

    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final void x(Object obj) {
        if (!this.a) {
            this.b = this.c.apply(this.b, obj);
        } else {
            this.a = false;
            this.b = obj;
        }
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$-CC.$default$andThen(this, consumer);
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        return this.a ? Optional.empty() : Optional.of(this.b);
    }

    @Override // j$.util.stream.n5
    public final void n(long j) {
        this.a = true;
        this.b = null;
    }

    @Override // j$.util.stream.n5
    public final boolean q() {
        return false;
    }

    @Override // j$.util.stream.r4
    public final void w(r4 r4Var) {
        h4 h4Var = (h4) r4Var;
        if (h4Var.a) {
            return;
        }
        x(h4Var.b);
    }

    @Override // j$.util.stream.n5
    public final /* synthetic */ void accept(int i) {
        w3.k();
        throw null;
    }

    @Override // j$.util.stream.n5
    public final /* synthetic */ void accept(long j) {
        w3.l();
        throw null;
    }

    @Override // j$.util.stream.n5, j$.util.stream.k5, java.util.function.DoubleConsumer
    public final /* synthetic */ void accept(double d) {
        w3.d();
        throw null;
    }

    @Override // j$.util.stream.n5
    public final void end() {
    }
}

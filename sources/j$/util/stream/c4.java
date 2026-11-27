package j$.util.stream;

import j$.util.function.Consumer$-CC;
import java.util.function.Consumer;
import java.util.function.DoubleBinaryOperator;
import java.util.function.DoubleConsumer;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes4.dex */
public final class c4 implements r4, k5 {
    public boolean a;
    public double b;
    public final /* synthetic */ DoubleBinaryOperator c;

    public c4(DoubleBinaryOperator doubleBinaryOperator) {
        this.c = doubleBinaryOperator;
    }

    @Override // j$.util.stream.k5
    public final /* synthetic */ void C(Double d) {
        w3.e(this, d);
    }

    @Override // j$.util.stream.n5, j$.util.stream.k5, java.util.function.DoubleConsumer
    public final void accept(double d) {
        if (!this.a) {
            this.b = this.c.applyAsDouble(this.b, d);
        } else {
            this.a = false;
            this.b = d;
        }
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$-CC.$default$andThen(this, consumer);
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        return this.a ? j$.util.b0.c : new j$.util.b0(this.b);
    }

    @Override // j$.util.stream.n5
    public final void n(long j) {
        this.a = true;
        this.b = 0.0d;
    }

    @Override // j$.util.stream.n5
    public final boolean q() {
        return false;
    }

    @Override // j$.util.stream.r4
    public final void w(r4 r4Var) {
        c4 c4Var = (c4) r4Var;
        if (c4Var.a) {
            return;
        }
        accept(c4Var.b);
    }

    public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer) {
        return j$.time.a.b(this, doubleConsumer);
    }

    @Override // j$.util.stream.n5
    public final /* synthetic */ void accept(long j) {
        w3.l();
        throw null;
    }

    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final /* bridge */ /* synthetic */ void x(Object obj) {
        C((Double) obj);
    }

    @Override // j$.util.stream.n5
    public final /* synthetic */ void accept(int i) {
        w3.k();
        throw null;
    }

    @Override // j$.util.stream.n5
    public final void end() {
    }
}

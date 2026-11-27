package j$.util.stream;

import j$.util.function.Consumer$-CC;
import java.util.function.Consumer;
import java.util.function.LongConsumer;
import java.util.function.ObjLongConsumer;
import java.util.function.Supplier;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes4.dex */
public final class y3 extends s4 implements r4, m5 {
    public final /* synthetic */ Supplier b;
    public final /* synthetic */ ObjLongConsumer c;
    public final /* synthetic */ r d;

    public y3(Supplier supplier, ObjLongConsumer objLongConsumer, r rVar) {
        this.b = supplier;
        this.c = objLongConsumer;
        this.d = rVar;
    }

    @Override // j$.util.stream.n5
    public final void accept(long j) {
        this.c.accept(this.a, j);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$-CC.$default$andThen(this, consumer);
    }

    @Override // j$.util.stream.n5
    public final void n(long j) {
        this.a = this.b.get();
    }

    @Override // j$.util.stream.n5
    public final boolean q() {
        return false;
    }

    @Override // j$.util.stream.r4
    public final void w(r4 r4Var) {
        this.a = this.d.apply(this.a, ((y3) r4Var).a);
    }

    @Override // j$.util.stream.m5
    public final /* synthetic */ void x(Long l) {
        w3.i(this, l);
    }

    public final /* synthetic */ LongConsumer andThen(LongConsumer longConsumer) {
        return j$.time.a.c(this, longConsumer);
    }

    @Override // j$.util.stream.n5
    public final /* synthetic */ void accept(int i) {
        w3.k();
        throw null;
    }

    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final /* bridge */ /* synthetic */ void x(Object obj) {
        x((Long) obj);
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

package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.DoubleConsumer;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes4.dex */
public final class o0 extends s0 implements k5 {
    public final DoubleConsumer b;

    public o0(DoubleConsumer doubleConsumer, boolean z) {
        super(z);
        this.b = doubleConsumer;
    }

    @Override // j$.util.stream.k5
    public final /* synthetic */ void C(Double d) {
        w3.e(this, d);
    }

    @Override // j$.util.stream.h8
    public final Object a(a aVar, Spliterator spliterator) {
        aVar.Q(spliterator, this);
        return null;
    }

    @Override // j$.util.stream.s0, j$.util.stream.n5, j$.util.stream.k5, java.util.function.DoubleConsumer
    public final void accept(double d) {
        this.b.accept(d);
    }

    public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer) {
        return j$.time.a.b(this, doubleConsumer);
    }

    @Override // j$.util.stream.h8
    public final /* bridge */ /* synthetic */ Object b(a aVar, Spliterator spliterator) {
        d(aVar, spliterator);
        return null;
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        return null;
    }

    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final /* bridge */ /* synthetic */ void x(Object obj) {
        C((Double) obj);
    }
}

package j$.util.stream;

import j$.util.Spliterator;
import j$.util.function.IntConsumer$-CC;
import java.util.function.IntConsumer;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes4.dex */
public final class p0 extends s0 implements l5 {
    public final IntConsumer b;

    public p0(IntConsumer intConsumer, boolean z) {
        super(z);
        this.b = intConsumer;
    }

    @Override // j$.util.stream.h8
    public final Object a(a aVar, Spliterator spliterator) {
        aVar.Q(spliterator, this);
        return null;
    }

    @Override // j$.util.stream.s0, j$.util.stream.n5
    public final void accept(int i) {
        this.b.accept(i);
    }

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return IntConsumer$-CC.$default$andThen(this, intConsumer);
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

    @Override // j$.util.stream.l5
    public final /* synthetic */ void o(Integer num) {
        w3.g(this, num);
    }

    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final /* bridge */ /* synthetic */ void x(Object obj) {
        o((Integer) obj);
    }
}

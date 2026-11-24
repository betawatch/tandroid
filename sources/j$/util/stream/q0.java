package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.LongConsumer;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes4.dex */
public final class q0 extends s0 implements m5 {
    public final LongConsumer b;

    public q0(LongConsumer longConsumer, boolean z) {
        super(z);
        this.b = longConsumer;
    }

    @Override // j$.util.stream.h8
    public final Object a(a aVar, Spliterator spliterator) {
        aVar.Q(spliterator, this);
        return null;
    }

    @Override // j$.util.stream.s0, j$.util.stream.n5
    public final void accept(long j) {
        this.b.accept(j);
    }

    public final /* synthetic */ LongConsumer andThen(LongConsumer longConsumer) {
        return j$.time.a.c(this, longConsumer);
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

    @Override // j$.util.stream.m5
    public final /* synthetic */ void x(Long l) {
        w3.i(this, l);
    }

    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final /* bridge */ /* synthetic */ void x(Object obj) {
        x((Long) obj);
    }
}

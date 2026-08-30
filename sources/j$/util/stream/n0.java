package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.LongConsumer;

/* loaded from: classes2.dex */
public final class n0 extends p0 implements i5 {
    public final LongConsumer b;

    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final /* bridge */ /* synthetic */ void x(Object obj) {
        x((Long) obj);
    }

    public final /* synthetic */ LongConsumer andThen(LongConsumer longConsumer) {
        return j$.com.android.tools.r8.a.d(this, longConsumer);
    }

    @Override // java.util.function.Supplier
    public final /* bridge */ /* synthetic */ Object get() {
        return null;
    }

    @Override // j$.util.stream.i5
    public final /* synthetic */ void x(Long l10) {
        t3.H(this, l10);
    }

    @Override // j$.util.stream.b8
    public final Object f(a aVar, Spliterator spliterator) {
        aVar.F0(spliterator, this);
        return null;
    }

    @Override // j$.util.stream.b8
    public final /* bridge */ /* synthetic */ Object i(t3 t3Var, Spliterator spliterator) {
        a(t3Var, spliterator);
        return null;
    }

    public n0(LongConsumer longConsumer, boolean z4) {
        super(z4);
        this.b = longConsumer;
    }

    @Override // j$.util.stream.p0, j$.util.stream.j5
    public final void accept(long j10) {
        this.b.accept(j10);
    }
}

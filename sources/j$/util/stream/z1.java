package j$.util.stream;

import j$.util.function.Consumer$-CC;
import java.util.function.Consumer;
import java.util.function.LongConsumer;
import java.util.function.ObjLongConsumer;
import java.util.function.Supplier;

/* loaded from: classes2.dex */
final class z1 extends T1 implements S1, l2 {
    final /* synthetic */ Supplier b;
    final /* synthetic */ ObjLongConsumer c;
    final /* synthetic */ q d;

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

    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final /* bridge */ /* synthetic */ void p(Object obj) {
        j((Long) obj);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$-CC.$default$andThen(this, consumer);
    }

    public final /* synthetic */ LongConsumer andThen(LongConsumer longConsumer) {
        return j$.com.android.tools.r8.a.c(this, longConsumer);
    }

    @Override // j$.util.stream.l2
    public final /* synthetic */ void j(Long l) {
        w0.i(this, l);
    }

    @Override // j$.util.stream.m2
    public final /* synthetic */ void k() {
    }

    @Override // j$.util.stream.m2
    public final /* synthetic */ boolean n() {
        return false;
    }

    @Override // j$.util.stream.S1
    public final void g(S1 s1) {
        this.a = this.d.apply(this.a, ((z1) s1).a);
    }

    @Override // j$.util.stream.m2
    public final void l(long j) {
        this.a = this.b.get();
    }

    @Override // j$.util.stream.m2
    public final void accept(long j) {
        this.c.accept(this.a, j);
    }

    z1(Supplier supplier, ObjLongConsumer objLongConsumer, q qVar) {
        this.b = supplier;
        this.c = objLongConsumer;
        this.d = qVar;
    }
}

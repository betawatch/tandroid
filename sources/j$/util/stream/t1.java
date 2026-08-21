package j$.util.stream;

import j$.util.function.Consumer$-CC;
import java.util.function.Consumer;
import java.util.function.LongConsumer;
import java.util.function.ObjLongConsumer;
import java.util.function.Supplier;

/* loaded from: classes2.dex */
public final class t1 extends N1 implements M1, f2 {
    public final /* synthetic */ Supplier b;
    public final /* synthetic */ ObjLongConsumer c;
    public final /* synthetic */ o d;

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

    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final /* bridge */ /* synthetic */ void s(Object obj) {
        s((Long) obj);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$-CC.$default$andThen(this, consumer);
    }

    public final /* synthetic */ LongConsumer andThen(LongConsumer longConsumer) {
        return j$.com.android.tools.r8.a.d(this, longConsumer);
    }

    @Override // j$.util.stream.f2
    public final /* synthetic */ void s(Long l) {
        r1.i(this, l);
    }

    @Override // j$.util.stream.g2
    public final /* synthetic */ void x() {
    }

    @Override // j$.util.stream.M1
    public final void n(M1 m1) {
        this.a = this.d.apply(this.a, ((t1) m1).a);
    }

    @Override // j$.util.stream.g2
    public final void y(long j) {
        this.a = this.b.get();
    }

    @Override // j$.util.stream.g2
    public final void accept(long j) {
        this.c.accept(this.a, j);
    }

    public t1(Supplier supplier, ObjLongConsumer objLongConsumer, o oVar) {
        this.b = supplier;
        this.c = objLongConsumer;
        this.d = oVar;
    }
}

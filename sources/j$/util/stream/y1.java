package j$.util.stream;

import j$.util.function.Consumer$-CC;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.ObjDoubleConsumer;
import java.util.function.Supplier;

/* loaded from: classes2.dex */
public final class y1 extends M1 implements L1, c2 {
    public final /* synthetic */ Supplier b;
    public final /* synthetic */ ObjDoubleConsumer c;
    public final /* synthetic */ n d;

    @Override // j$.util.stream.f2
    public final /* synthetic */ boolean C() {
        return false;
    }

    @Override // j$.util.stream.c2
    public final /* synthetic */ void E(Double d) {
        q1.e(this, d);
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

    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final /* bridge */ /* synthetic */ void s(Object obj) {
        E((Double) obj);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$-CC.$default$andThen(this, consumer);
    }

    public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer) {
        return j$.com.android.tools.r8.a.b(this, doubleConsumer);
    }

    @Override // j$.util.stream.f2
    public final /* synthetic */ void x() {
    }

    @Override // j$.util.stream.L1
    public final void n(L1 l1) {
        this.a = this.d.apply(this.a, ((y1) l1).a);
    }

    @Override // j$.util.stream.f2
    public final void y(long j) {
        this.a = this.b.get();
    }

    @Override // j$.util.stream.f2
    public final void accept(double d) {
        this.c.accept(this.a, d);
    }

    public y1(Supplier supplier, ObjDoubleConsumer objDoubleConsumer, n nVar) {
        this.b = supplier;
        this.c = objDoubleConsumer;
        this.d = nVar;
    }
}

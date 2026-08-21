package j$.util.stream;

import j$.util.function.Consumer$-CC;
import java.util.function.Consumer;
import java.util.function.IntConsumer;
import java.util.function.ObjIntConsumer;
import java.util.function.Supplier;

/* loaded from: classes2.dex */
public final class J1 extends N1 implements M1, e2 {
    public final /* synthetic */ Supplier b;
    public final /* synthetic */ ObjIntConsumer c;
    public final /* synthetic */ o d;

    @Override // j$.util.stream.e2
    public final /* synthetic */ void A(Integer num) {
        r1.g(this, num);
    }

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
    public final /* synthetic */ void accept(long j) {
        r1.l();
        throw null;
    }

    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final /* bridge */ /* synthetic */ void s(Object obj) {
        A((Integer) obj);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$-CC.$default$andThen(this, consumer);
    }

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return j$.com.android.tools.r8.a.c(this, intConsumer);
    }

    @Override // j$.util.stream.g2
    public final /* synthetic */ void x() {
    }

    @Override // j$.util.stream.M1
    public final void n(M1 m1) {
        this.a = this.d.apply(this.a, ((J1) m1).a);
    }

    @Override // j$.util.stream.g2
    public final void y(long j) {
        this.a = this.b.get();
    }

    @Override // j$.util.stream.g2
    public final void accept(int i) {
        this.c.accept(this.a, i);
    }

    public J1(Supplier supplier, ObjIntConsumer objIntConsumer, o oVar) {
        this.b = supplier;
        this.c = objIntConsumer;
        this.d = oVar;
    }
}

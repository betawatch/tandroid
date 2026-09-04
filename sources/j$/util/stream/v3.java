package j$.util.stream;

import j$.util.function.Consumer$-CC;
import java.util.function.Consumer;
import java.util.function.LongConsumer;
import java.util.function.ObjLongConsumer;
import java.util.function.Supplier;

/* loaded from: classes2.dex */
public final class v3 extends p4 implements o4, i5 {
    public final /* synthetic */ Supplier b;
    public final /* synthetic */ ObjLongConsumer c;
    public final /* synthetic */ o d;

    @Override // j$.util.stream.j5
    public final /* synthetic */ void accept(double d) {
        t3.C();
        throw null;
    }

    @Override // j$.util.stream.j5, j$.util.stream.h5, java.util.function.IntConsumer
    public final /* synthetic */ void accept(int i10) {
        t3.J();
        throw null;
    }

    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final /* bridge */ /* synthetic */ void x(Object obj) {
        x((Long) obj);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$-CC.$default$andThen(this, consumer);
    }

    public final /* synthetic */ LongConsumer andThen(LongConsumer longConsumer) {
        return j$.com.android.tools.r8.a.d(this, longConsumer);
    }

    @Override // j$.util.stream.j5
    public final /* synthetic */ void end() {
    }

    @Override // j$.util.stream.j5
    public final /* synthetic */ boolean q() {
        return false;
    }

    @Override // j$.util.stream.i5
    public final /* synthetic */ void x(Long l4) {
        t3.H(this, l4);
    }

    @Override // j$.util.stream.o4
    public final void u(o4 o4Var) {
        this.a = this.d.apply(this.a, ((v3) o4Var).a);
    }

    @Override // j$.util.stream.j5
    public final void o(long j3) {
        this.a = this.b.get();
    }

    @Override // j$.util.stream.j5
    public final void accept(long j3) {
        this.c.accept(this.a, j3);
    }

    public v3(Supplier supplier, ObjLongConsumer objLongConsumer, o oVar) {
        this.b = supplier;
        this.c = objLongConsumer;
        this.d = oVar;
    }
}

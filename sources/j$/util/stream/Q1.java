package j$.util.stream;

import j$.util.function.Consumer$-CC;
import java.util.function.Consumer;
import java.util.function.LongBinaryOperator;
import java.util.function.LongConsumer;

/* loaded from: classes2.dex */
final class Q1 implements S1, l2 {
    private long a;
    final /* synthetic */ long b;
    final /* synthetic */ LongBinaryOperator c;

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

    Q1(long j, LongBinaryOperator longBinaryOperator) {
        this.b = j;
        this.c = longBinaryOperator;
    }

    @Override // j$.util.stream.S1
    public final void g(S1 s1) {
        accept(((Q1) s1).a);
    }

    @Override // j$.util.stream.m2
    public final void l(long j) {
        this.a = this.b;
    }

    @Override // j$.util.stream.m2
    public final void accept(long j) {
        this.a = this.c.applyAsLong(this.a, j);
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        return Long.valueOf(this.a);
    }
}

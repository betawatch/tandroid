package j$.util.stream;

import j$.util.function.Consumer$-CC;
import java.util.function.Consumer;
import java.util.function.IntBinaryOperator;
import java.util.function.IntConsumer;

/* loaded from: classes2.dex */
public final class i4 implements o4, h5 {
    public int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ IntBinaryOperator c;

    @Override // j$.util.stream.j5
    public final /* synthetic */ void accept(double d) {
        t3.C();
        throw null;
    }

    @Override // j$.util.stream.j5
    public final /* synthetic */ void accept(long j10) {
        t3.K();
        throw null;
    }

    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final /* bridge */ /* synthetic */ void x(Object obj) {
        p((Integer) obj);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$-CC.$default$andThen(this, consumer);
    }

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return j$.com.android.tools.r8.a.c(this, intConsumer);
    }

    @Override // j$.util.stream.j5
    public final /* synthetic */ void end() {
    }

    @Override // j$.util.stream.h5
    public final /* synthetic */ void p(Integer num) {
        t3.F(this, num);
    }

    @Override // j$.util.stream.j5
    public final /* synthetic */ boolean q() {
        return false;
    }

    public i4(int i9, IntBinaryOperator intBinaryOperator) {
        this.b = i9;
        this.c = intBinaryOperator;
    }

    @Override // j$.util.stream.o4
    public final void u(o4 o4Var) {
        accept(((i4) o4Var).a);
    }

    @Override // j$.util.stream.j5
    public final void o(long j10) {
        this.a = this.b;
    }

    @Override // j$.util.stream.j5, j$.util.stream.h5, java.util.function.IntConsumer
    public final void accept(int i9) {
        this.a = this.c.applyAsInt(this.a, i9);
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        return Integer.valueOf(this.a);
    }
}

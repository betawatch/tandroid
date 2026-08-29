package j$.util.stream;

import j$.util.function.Consumer$-CC;
import java.util.function.Consumer;
import java.util.function.IntBinaryOperator;
import java.util.function.IntConsumer;

/* loaded from: classes2.dex */
public final class k4 implements o4, h5 {
    public boolean a;
    public int b;
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

    public k4(IntBinaryOperator intBinaryOperator) {
        this.c = intBinaryOperator;
    }

    @Override // j$.util.stream.o4
    public final void u(o4 o4Var) {
        k4 k4Var = (k4) o4Var;
        if (k4Var.a) {
            return;
        }
        accept(k4Var.b);
    }

    @Override // j$.util.stream.j5
    public final void o(long j10) {
        this.a = true;
        this.b = 0;
    }

    @Override // j$.util.stream.j5, j$.util.stream.h5, java.util.function.IntConsumer
    public final void accept(int i10) {
        if (this.a) {
            this.a = false;
            this.b = i10;
        } else {
            this.b = this.c.applyAsInt(this.b, i10);
        }
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        return this.a ? j$.util.c0.c : new j$.util.c0(this.b);
    }
}

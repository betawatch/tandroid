package j$.util.stream;

import j$.util.function.Consumer$-CC;
import java.util.function.Consumer;
import java.util.function.LongBinaryOperator;
import java.util.function.LongConsumer;

/* loaded from: classes2.dex */
public final class K1 implements L1, e2 {
    public boolean a;
    public long b;
    public final /* synthetic */ LongBinaryOperator c;

    @Override // j$.util.stream.f2
    public final /* synthetic */ boolean C() {
        return false;
    }

    @Override // j$.util.stream.f2
    public final /* synthetic */ void accept(double d) {
        q1.a();
        throw null;
    }

    @Override // j$.util.stream.f2
    public final /* synthetic */ void accept(int i) {
        q1.k();
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

    @Override // j$.util.stream.e2
    public final /* synthetic */ void s(Long l) {
        q1.i(this, l);
    }

    @Override // j$.util.stream.f2
    public final /* synthetic */ void x() {
    }

    public K1(LongBinaryOperator longBinaryOperator) {
        this.c = longBinaryOperator;
    }

    @Override // j$.util.stream.L1
    public final void n(L1 l1) {
        K1 k1 = (K1) l1;
        if (k1.a) {
            return;
        }
        accept(k1.b);
    }

    @Override // j$.util.stream.f2
    public final void y(long j) {
        this.a = true;
        this.b = 0L;
    }

    @Override // j$.util.stream.f2
    public final void accept(long j) {
        if (this.a) {
            this.a = false;
            this.b = j;
        } else {
            this.b = this.c.applyAsLong(this.b, j);
        }
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        return this.a ? j$.util.B.c : new j$.util.B(this.b);
    }
}

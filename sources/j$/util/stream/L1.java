package j$.util.stream;

import j$.util.function.Consumer$-CC;
import java.util.function.Consumer;
import java.util.function.LongBinaryOperator;
import java.util.function.LongConsumer;

/* loaded from: classes2.dex */
public final class L1 implements M1, f2 {
    public boolean a;
    public long b;
    public final /* synthetic */ LongBinaryOperator c;

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

    public L1(LongBinaryOperator longBinaryOperator) {
        this.c = longBinaryOperator;
    }

    @Override // j$.util.stream.M1
    public final void n(M1 m1) {
        L1 l1 = (L1) m1;
        if (l1.a) {
            return;
        }
        accept(l1.b);
    }

    @Override // j$.util.stream.g2
    public final void y(long j) {
        this.a = true;
        this.b = 0L;
    }

    @Override // j$.util.stream.g2
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

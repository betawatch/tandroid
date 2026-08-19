package j$.util.stream;

import j$.util.function.Consumer$-CC;
import java.util.function.Consumer;
import java.util.function.IntBinaryOperator;
import java.util.function.IntConsumer;

/* loaded from: classes2.dex */
public final class H1 implements L1, d2 {
    public boolean a;
    public int b;
    public final /* synthetic */ IntBinaryOperator c;

    @Override // j$.util.stream.d2
    public final /* synthetic */ void A(Integer num) {
        q1.g(this, num);
    }

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
    public final /* synthetic */ void accept(long j) {
        q1.l();
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

    @Override // j$.util.stream.f2
    public final /* synthetic */ void x() {
    }

    public H1(IntBinaryOperator intBinaryOperator) {
        this.c = intBinaryOperator;
    }

    @Override // j$.util.stream.L1
    public final void n(L1 l1) {
        H1 h1 = (H1) l1;
        if (h1.a) {
            return;
        }
        accept(h1.b);
    }

    @Override // j$.util.stream.f2
    public final void y(long j) {
        this.a = true;
        this.b = 0;
    }

    @Override // j$.util.stream.f2
    public final void accept(int i) {
        if (this.a) {
            this.a = false;
            this.b = i;
        } else {
            this.b = this.c.applyAsInt(this.b, i);
        }
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        return this.a ? j$.util.A.c : new j$.util.A(this.b);
    }
}

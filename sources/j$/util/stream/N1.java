package j$.util.stream;

import java.util.function.DoubleConsumer;

/* loaded from: classes2.dex */
public final class N1 extends R1 implements c2 {
    @Override // j$.util.stream.c2
    public final /* synthetic */ void E(Double d) {
        q1.e(this, d);
    }

    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final /* bridge */ /* synthetic */ void s(Object obj) {
        E((Double) obj);
    }

    public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer) {
        return j$.com.android.tools.r8.a.b(this, doubleConsumer);
    }

    @Override // j$.util.stream.M1, java.util.function.Supplier
    public final Object get() {
        return Long.valueOf(this.b);
    }

    @Override // j$.util.stream.L1
    public final void n(L1 l1) {
        this.b += ((R1) l1).b;
    }

    @Override // j$.util.stream.R1, j$.util.stream.f2
    public final void accept(double d) {
        this.b++;
    }
}

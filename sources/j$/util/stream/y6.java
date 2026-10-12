package j$.util.stream;

import java.util.function.DoubleConsumer;

/* loaded from: classes2.dex */
public final class y6 extends b7 implements DoubleConsumer {
    public final double[] c;

    public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer) {
        return j$.com.android.tools.r8.a.b(this, doubleConsumer);
    }

    public y6(int i10) {
        this.c = new double[i10];
    }

    @Override // j$.util.stream.b7
    public final void a(Object obj, long j10) {
        DoubleConsumer doubleConsumer = (DoubleConsumer) obj;
        for (int i10 = 0; i10 < j10; i10++) {
            doubleConsumer.accept(this.c[i10]);
        }
    }

    @Override // java.util.function.DoubleConsumer
    public final void accept(double d) {
        int i10 = this.b;
        this.b = i10 + 1;
        this.c[i10] = d;
    }
}

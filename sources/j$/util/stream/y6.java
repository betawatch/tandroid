package j$.util.stream;

import java.util.function.DoubleConsumer;

/* loaded from: classes2.dex */
public final class y6 extends b7 implements DoubleConsumer {
    public final double[] c;

    public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer) {
        return j$.com.android.tools.r8.a.b(this, doubleConsumer);
    }

    public y6(int i7) {
        this.c = new double[i7];
    }

    @Override // j$.util.stream.b7
    public final void a(Object obj, long j3) {
        DoubleConsumer doubleConsumer = (DoubleConsumer) obj;
        for (int i7 = 0; i7 < j3; i7++) {
            doubleConsumer.accept(this.c[i7]);
        }
    }

    @Override // java.util.function.DoubleConsumer
    public final void accept(double d) {
        int i7 = this.b;
        this.b = i7 + 1;
        this.c[i7] = d;
    }
}

package j$.util.stream;

import java.util.function.DoubleConsumer;

/* loaded from: classes2.dex */
public final class y6 extends b7 implements DoubleConsumer {
    public final double[] c;

    public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer) {
        return j$.com.android.tools.r8.a.b(this, doubleConsumer);
    }

    public y6(int i9) {
        this.c = new double[i9];
    }

    @Override // j$.util.stream.b7
    public final void a(Object obj, long j10) {
        DoubleConsumer doubleConsumer = (DoubleConsumer) obj;
        for (int i9 = 0; i9 < j10; i9++) {
            doubleConsumer.accept(this.c[i9]);
        }
    }

    @Override // java.util.function.DoubleConsumer
    public final void accept(double d) {
        int i9 = this.b;
        this.b = i9 + 1;
        this.c[i9] = d;
    }
}

package j$.util.stream;

import java.util.function.IntConsumer;

/* loaded from: classes2.dex */
public final class W2 extends Y2 implements IntConsumer {
    public final int[] c;

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return j$.com.android.tools.r8.a.c(this, intConsumer);
    }

    public W2(int i) {
        this.c = new int[i];
    }

    @Override // j$.util.stream.Y2
    public final void b(Object obj, long j) {
        IntConsumer intConsumer = (IntConsumer) obj;
        for (int i = 0; i < j; i++) {
            intConsumer.accept(this.c[i]);
        }
    }

    @Override // java.util.function.IntConsumer
    public final void accept(int i) {
        int i2 = this.b;
        this.b = i2 + 1;
        this.c[i2] = i;
    }
}

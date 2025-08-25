package j$.util.stream;

import java.util.function.IntConsumer;

/* loaded from: classes2.dex */
final class e3 extends g3 implements IntConsumer {
    final int[] c;

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return j$.com.android.tools.r8.a.b(this, intConsumer);
    }

    e3(int i) {
        this.c = new int[i];
    }

    @Override // j$.util.stream.g3
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

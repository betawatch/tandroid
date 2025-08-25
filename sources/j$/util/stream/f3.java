package j$.util.stream;

import java.util.function.LongConsumer;

/* loaded from: classes2.dex */
final class f3 extends g3 implements LongConsumer {
    final long[] c;

    public final /* synthetic */ LongConsumer andThen(LongConsumer longConsumer) {
        return j$.com.android.tools.r8.a.c(this, longConsumer);
    }

    f3(int i) {
        this.c = new long[i];
    }

    @Override // j$.util.stream.g3
    public final void b(Object obj, long j) {
        LongConsumer longConsumer = (LongConsumer) obj;
        for (int i = 0; i < j; i++) {
            longConsumer.accept(this.c[i]);
        }
    }

    @Override // java.util.function.LongConsumer
    public final void accept(long j) {
        int i = this.b;
        this.b = i + 1;
        this.c[i] = j;
    }
}

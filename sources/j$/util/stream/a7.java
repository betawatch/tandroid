package j$.util.stream;

import java.util.function.LongConsumer;

/* loaded from: classes2.dex */
public final class a7 extends b7 implements LongConsumer {
    public final long[] c;

    public final /* synthetic */ LongConsumer andThen(LongConsumer longConsumer) {
        return j$.com.android.tools.r8.a.d(this, longConsumer);
    }

    public a7(int i9) {
        this.c = new long[i9];
    }

    @Override // j$.util.stream.b7
    public final void a(Object obj, long j10) {
        LongConsumer longConsumer = (LongConsumer) obj;
        for (int i9 = 0; i9 < j10; i9++) {
            longConsumer.accept(this.c[i9]);
        }
    }

    @Override // java.util.function.LongConsumer
    public final void accept(long j10) {
        int i9 = this.b;
        this.b = i9 + 1;
        this.c[i9] = j10;
    }
}

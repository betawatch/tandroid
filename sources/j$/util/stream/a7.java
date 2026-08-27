package j$.util.stream;

import java.util.function.LongConsumer;

/* loaded from: classes2.dex */
public final class a7 extends b7 implements LongConsumer {
    public final long[] c;

    public final /* synthetic */ LongConsumer andThen(LongConsumer longConsumer) {
        return j$.com.android.tools.r8.a.d(this, longConsumer);
    }

    public a7(int i10) {
        this.c = new long[i10];
    }

    @Override // j$.util.stream.b7
    public final void a(Object obj, long j10) {
        LongConsumer longConsumer = (LongConsumer) obj;
        for (int i10 = 0; i10 < j10; i10++) {
            longConsumer.accept(this.c[i10]);
        }
    }

    @Override // java.util.function.LongConsumer
    public final void accept(long j10) {
        int i10 = this.b;
        this.b = i10 + 1;
        this.c[i10] = j10;
    }
}

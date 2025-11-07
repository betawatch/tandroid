package j$.util.stream;

import java.util.function.LongConsumer;

/* loaded from: classes2.dex */
public final /* synthetic */ class c0 implements LongConsumer {
    public final /* synthetic */ m2 a;

    @Override // java.util.function.LongConsumer
    public final void accept(long j) {
        this.a.accept(j);
    }

    public final /* synthetic */ LongConsumer andThen(LongConsumer longConsumer) {
        return j$.com.android.tools.r8.a.c(this, longConsumer);
    }
}

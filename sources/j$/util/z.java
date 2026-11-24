package j$.util;

import j$.util.function.IntConsumer$-CC;
import java.util.function.IntConsumer;
import java.util.function.LongConsumer;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes4.dex */
public final class z implements LongConsumer, IntConsumer {
    private long count;
    private long sum;
    private long min = Long.MAX_VALUE;
    private long max = Long.MIN_VALUE;

    public final void a(z zVar) {
        this.count += zVar.count;
        this.sum += zVar.sum;
        this.min = Math.min(this.min, zVar.min);
        this.max = Math.max(this.max, zVar.max);
    }

    @Override // java.util.function.LongConsumer
    public final void accept(long j) {
        this.count++;
        this.sum += j;
        this.min = Math.min(this.min, j);
        this.max = Math.max(this.max, j);
    }

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return IntConsumer$-CC.$default$andThen(this, intConsumer);
    }

    public final String toString() {
        String simpleName = z.class.getSimpleName();
        Long valueOf = Long.valueOf(this.count);
        Long valueOf2 = Long.valueOf(this.sum);
        Long valueOf3 = Long.valueOf(this.min);
        long j = this.count;
        return String.format("%s{count=%d, sum=%d, min=%d, average=%f, max=%d}", simpleName, valueOf, valueOf2, valueOf3, Double.valueOf(j > 0 ? this.sum / j : 0.0d), Long.valueOf(this.max));
    }

    public final /* synthetic */ LongConsumer andThen(LongConsumer longConsumer) {
        return j$.time.a.c(this, longConsumer);
    }

    @Override // java.util.function.IntConsumer
    public final void accept(int i) {
        accept(i);
    }
}

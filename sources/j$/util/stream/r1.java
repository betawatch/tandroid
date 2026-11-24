package j$.util.stream;

import java.util.function.LongConsumer;
import java.util.function.LongPredicate;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes4.dex */
public final class r1 extends t1 implements m5 {
    @Override // j$.util.stream.t1, j$.util.stream.n5
    public final void accept(long j) {
        if (this.a) {
            return;
        }
        LongPredicate longPredicate = null;
        longPredicate.test(j);
        throw null;
    }

    public final /* synthetic */ LongConsumer andThen(LongConsumer longConsumer) {
        return j$.time.a.c(this, longConsumer);
    }

    @Override // j$.util.stream.m5
    public final /* synthetic */ void x(Long l) {
        w3.i(this, l);
    }

    @Override // java.util.function.Consumer
    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        x((Long) obj);
    }
}

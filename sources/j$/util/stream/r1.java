package j$.util.stream;

import java.util.function.LongConsumer;
import java.util.function.LongPredicate;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
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

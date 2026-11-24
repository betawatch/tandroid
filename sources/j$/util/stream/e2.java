package j$.util.stream;

import java.util.function.LongConsumer;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes4.dex */
public final /* synthetic */ class e2 implements LongConsumer {
    public final /* synthetic */ byte a;

    public /* synthetic */ e2(byte b) {
        this.a = b;
    }

    @Override // java.util.function.LongConsumer
    public final void accept(long j) {
        byte b = this.a;
    }

    public final /* synthetic */ LongConsumer andThen(LongConsumer longConsumer) {
        switch (this.a) {
        }
        return j$.time.a.c(this, longConsumer);
    }

    private final void accept$j$$util$stream$Node$OfLong$0(long j) {
    }

    private final void accept$j$$util$stream$StreamSpliterators$SliceSpliterator$OfLong$0(long j) {
    }
}

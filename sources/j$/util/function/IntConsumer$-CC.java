package j$.util.function;

import j$.util.Objects;
import java.util.function.IntConsumer;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes4.dex */
public final /* synthetic */ class IntConsumer$-CC {
    public static IntConsumer $default$andThen(final IntConsumer intConsumer, final IntConsumer intConsumer2) {
        Objects.requireNonNull(intConsumer2);
        return new IntConsumer() { // from class: j$.util.function.e
            @Override // java.util.function.IntConsumer
            public final void accept(int i) {
                IntConsumer.this.accept(i);
                intConsumer2.accept(i);
            }

            public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer3) {
                return IntConsumer$-CC.$default$andThen(this, intConsumer3);
            }
        };
    }
}

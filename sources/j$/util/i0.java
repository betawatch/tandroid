package j$.util;

import j$.util.function.IntConsumer$-CC;
import j$.util.stream.n5;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes4.dex */
public final /* synthetic */ class i0 implements IntConsumer {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Consumer b;

    public /* synthetic */ i0(Consumer consumer, byte b) {
        this.a = b;
        this.b = consumer;
    }

    @Override // java.util.function.IntConsumer
    public final void accept(int i) {
        byte b = this.a;
        Consumer consumer = this.b;
        switch (b) {
            case 0:
                consumer.accept(Integer.valueOf(i));
                break;
            default:
                ((n5) consumer).accept(i);
                break;
        }
    }

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        switch (this.a) {
        }
        return IntConsumer$-CC.$default$andThen(this, intConsumer);
    }
}

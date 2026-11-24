package j$.util;

import j$.util.stream.n5;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes4.dex */
public final /* synthetic */ class e0 implements DoubleConsumer {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Consumer b;

    public /* synthetic */ e0(Consumer consumer, byte b) {
        this.a = b;
        this.b = consumer;
    }

    @Override // java.util.function.DoubleConsumer
    public final void accept(double d) {
        byte b = this.a;
        Consumer consumer = this.b;
        switch (b) {
            case 0:
                consumer.accept(Double.valueOf(d));
                break;
            default:
                ((n5) consumer).accept(d);
                break;
        }
    }

    public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer) {
        switch (this.a) {
        }
        return j$.time.a.b(this, doubleConsumer);
    }
}

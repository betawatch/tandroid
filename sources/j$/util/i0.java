package j$.util;

import j$.util.function.IntConsumer$-CC;
import j$.util.stream.j5;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* loaded from: classes2.dex */
public final /* synthetic */ class i0 implements IntConsumer {
    public final /* synthetic */ int a;
    public final /* synthetic */ Consumer b;

    public /* synthetic */ i0(Consumer consumer, int i7) {
        this.a = i7;
        this.b = consumer;
    }

    @Override // java.util.function.IntConsumer
    public final void accept(int i7) {
        switch (this.a) {
            case 0:
                this.b.accept(Integer.valueOf(i7));
                break;
            default:
                ((j5) this.b).accept(i7);
                break;
        }
    }

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        switch (this.a) {
        }
        return IntConsumer$-CC.$default$andThen(this, intConsumer);
    }
}

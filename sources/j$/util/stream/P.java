package j$.util.stream;

import j$.util.function.Consumer;
/* loaded from: classes2.dex */
final class P extends Q {
    final Consumer b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public P(Consumer consumer, boolean z) {
        super(z);
        this.b = consumer;
    }

    @Override // j$.util.function.Consumer
    public final void accept(Object obj) {
        this.b.accept(obj);
    }
}

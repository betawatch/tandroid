package j$.util.stream;

import j$.util.function.Consumer;

/* loaded from: classes2.dex */
final class O extends P {
    final Consumer b;

    O(Consumer consumer, boolean z) {
        super(z);
        this.b = consumer;
    }

    @Override // j$.util.function.Consumer
    /* renamed from: accept */
    public final void r(Object obj) {
        this.b.r(obj);
    }
}

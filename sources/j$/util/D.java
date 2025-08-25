package j$.util;

import java.util.function.Consumer;
import java.util.function.DoubleConsumer;

/* loaded from: classes2.dex */
public final /* synthetic */ class D implements DoubleConsumer {
    public final /* synthetic */ Consumer a;

    public /* synthetic */ D(Consumer consumer) {
        this.a = consumer;
    }

    @Override // java.util.function.DoubleConsumer
    public final void accept(double d) {
        this.a.accept(Double.valueOf(d));
    }

    public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer) {
        return j$.com.android.tools.r8.a.a(this, doubleConsumer);
    }
}

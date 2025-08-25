package j$.util;

import j$.util.function.Consumer$-CC;
import java.util.Map;
import java.util.function.Consumer;

/* loaded from: classes2.dex */
public final /* synthetic */ class p implements Consumer {
    public final /* synthetic */ Consumer a;

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$-CC.$default$andThen(this, consumer);
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        this.a.accept(new q((Map.Entry) obj));
    }
}

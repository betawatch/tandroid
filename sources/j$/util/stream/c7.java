package j$.util.stream;

import j$.util.function.Consumer$-CC;
import java.util.function.Consumer;

/* loaded from: classes2.dex */
public final class c7 extends d7 implements Consumer {
    public final Object[] b;

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$-CC.$default$andThen(this, consumer);
    }

    public c7(int i9) {
        this.b = new Object[i9];
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        int i9 = this.a;
        this.a = i9 + 1;
        this.b[i9] = obj;
    }
}

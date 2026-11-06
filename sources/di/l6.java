package di;

import j$.util.function.Consumer$-CC;
import java.util.List;
import java.util.function.Consumer;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final /* synthetic */ class l6 implements Consumer {
    public final /* synthetic */ m6 a;

    public /* synthetic */ l6(m6 m6Var) {
        this.a = m6Var;
    }

    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final void x(Object obj) {
        org.telegram.messenger.g0.h3(new z0(8, this.a, (List) obj));
    }

    public /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$-CC.$default$andThen(this, consumer);
    }
}

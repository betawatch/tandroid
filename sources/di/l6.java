package di;

import j$.util.function.Consumer$-CC;
import java.util.List;
import java.util.function.Consumer;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
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

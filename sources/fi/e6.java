package fi;

import j$.util.function.Consumer$-CC;
import java.util.List;
import java.util.function.Consumer;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class e6 implements Consumer {
    public final /* synthetic */ g6 a;

    public /* synthetic */ e6(g6 g6Var) {
        this.a = g6Var;
    }

    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final void x(Object obj) {
        org.telegram.messenger.g0.h3(new di.s2(29, this.a, (List) obj));
    }

    public /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$-CC.$default$andThen(this, consumer);
    }
}

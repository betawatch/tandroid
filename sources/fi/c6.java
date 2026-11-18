package fi;

import j$.util.function.Consumer$-CC;
import java.util.List;
import java.util.function.Consumer;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes4.dex */
public final /* synthetic */ class c6 implements Consumer {
    public final /* synthetic */ d6 a;

    public /* synthetic */ c6(d6 d6Var) {
        this.a = d6Var;
    }

    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final void x(Object obj) {
        org.telegram.messenger.g0.g3(new a6(1, this.a, (List) obj));
    }

    public /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$-CC.$default$andThen(this, consumer);
    }
}

package org.telegram.messenger;

import j$.util.function.Consumer$-CC;
import java.util.ArrayList;
import java.util.function.Consumer;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes.dex */
public final /* synthetic */ class rl implements Consumer {
    public final /* synthetic */ qp a;
    public final /* synthetic */ long b;

    public /* synthetic */ rl(qp qpVar, long j3) {
        this.a = qpVar;
        this.b = j3;
    }

    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final void x(Object obj) {
        qp qpVar = this.a;
        qpVar.getClass();
        g0.h3(new gk(qpVar, (ArrayList) obj, this.b, 2));
    }

    public /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$-CC.$default$andThen(this, consumer);
    }
}

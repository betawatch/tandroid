package org.telegram.messenger;

import j$.util.function.Consumer$-CC;
import java.util.ArrayList;
import java.util.function.Consumer;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
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
        g0.h3(new fk(qpVar, (ArrayList) obj, this.b, 2));
    }

    public /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$-CC.$default$andThen(this, consumer);
    }
}

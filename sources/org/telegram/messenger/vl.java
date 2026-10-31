package org.telegram.messenger;

import j$.util.function.Consumer$-CC;
import java.util.ArrayList;
import java.util.function.Consumer;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final /* synthetic */ class vl implements Consumer {
    public final /* synthetic */ vp a;
    public final /* synthetic */ long b;

    public /* synthetic */ vl(vp vpVar, long j10) {
        this.a = vpVar;
        this.b = j10;
    }

    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final void x(Object obj) {
        vp vpVar = this.a;
        vpVar.getClass();
        i0.g3(new ok(vpVar, (ArrayList) obj, this.b, 2));
    }

    public /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$-CC.$default$andThen(this, consumer);
    }
}

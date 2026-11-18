package org.telegram.messenger;

import j$.util.function.Consumer$-CC;
import java.util.ArrayList;
import java.util.function.Consumer;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes.dex */
public final /* synthetic */ class kl implements Consumer {
    public final /* synthetic */ mp a;
    public final /* synthetic */ long b;

    public /* synthetic */ kl(mp mpVar, long j3) {
        this.a = mpVar;
        this.b = j3;
    }

    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final void x(Object obj) {
        mp mpVar = this.a;
        mpVar.getClass();
        g0.g3(new ck(mpVar, (ArrayList) obj, this.b, 2));
    }

    public /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$-CC.$default$andThen(this, consumer);
    }
}

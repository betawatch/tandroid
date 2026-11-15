package org.telegram.messenger;

import j$.util.function.Consumer$-CC;
import java.util.ArrayList;
import java.util.function.Consumer;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes.dex */
public final /* synthetic */ class ol implements Consumer {
    public final /* synthetic */ np a;
    public final /* synthetic */ long b;

    public /* synthetic */ ol(np npVar, long j3) {
        this.a = npVar;
        this.b = j3;
    }

    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final void x(Object obj) {
        np npVar = this.a;
        npVar.getClass();
        g0.h3(new dk(npVar, (ArrayList) obj, this.b, 2));
    }

    public /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$-CC.$default$andThen(this, consumer);
    }
}

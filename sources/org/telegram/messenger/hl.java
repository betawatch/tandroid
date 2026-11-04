package org.telegram.messenger;

import j$.util.function.Consumer$-CC;
import java.util.ArrayList;
import java.util.function.Consumer;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final /* synthetic */ class hl implements Consumer {
    public final /* synthetic */ hp a;
    public final /* synthetic */ long b;

    public /* synthetic */ hl(hp hpVar, long j10) {
        this.a = hpVar;
        this.b = j10;
    }

    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final void x(Object obj) {
        hp hpVar = this.a;
        hpVar.getClass();
        g0.h3(new wj(hpVar, (ArrayList) obj, this.b, 2));
    }

    public /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$-CC.$default$andThen(this, consumer);
    }
}

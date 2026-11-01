package org.telegram.messenger;

import j$.util.function.Consumer$-CC;
import java.util.ArrayList;
import java.util.function.Consumer;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes.dex */
public final /* synthetic */ class wl implements Consumer {
    public final /* synthetic */ wp a;
    public final /* synthetic */ long b;

    public /* synthetic */ wl(wp wpVar, long j10) {
        this.a = wpVar;
        this.b = j10;
    }

    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final void x(Object obj) {
        wp wpVar = this.a;
        wpVar.getClass();
        i0.g3(new pk(wpVar, (ArrayList) obj, this.b, 2));
    }

    public /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$-CC.$default$andThen(this, consumer);
    }
}

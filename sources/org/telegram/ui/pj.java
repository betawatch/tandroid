package org.telegram.ui;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class pj implements Runnable {
    public final /* synthetic */ bn a;

    public pj(bn bnVar) {
        this.a = bnVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        bn bnVar = this.a;
        org.telegram.messenger.fj fjVar = bnVar.v5;
        if (fjVar == null || bnVar.l9 == null) {
            return;
        }
        int max = Math.max(0, fjVar.k.ttl_period - (bnVar.getConnectionsManager().getCurrentTime() - bnVar.v5.k.date));
        bnVar.l9.setSubtext(org.telegram.messenger.gd.a0(null, null, 2131753851, max < 86400 ? org.telegram.messenger.g0.g0(max, false, true) : org.telegram.messenger.gd.G(Math.round(max / 86400.0f), "Days", new Object[0])));
        org.telegram.messenger.g0.h3(bnVar.m9, 1000L);
    }
}

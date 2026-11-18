package org.telegram.ui;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
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

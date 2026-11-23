package org.telegram.ui;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final class pj implements Runnable {
    public final /* synthetic */ bn a;

    public pj(bn bnVar) {
        this.a = bnVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        bn bnVar = this.a;
        org.telegram.messenger.gj gjVar = bnVar.v5;
        if (gjVar == null || bnVar.l9 == null) {
            return;
        }
        int max = Math.max(0, gjVar.k.ttl_period - (bnVar.getConnectionsManager().getCurrentTime() - bnVar.v5.k.date));
        bnVar.l9.setSubtext(org.telegram.messenger.hd.a0(null, null, 2131753850, max < 86400 ? org.telegram.messenger.g0.g0(max, false, true) : org.telegram.messenger.hd.G(Math.round(max / 86400.0f), "Days", new Object[0])));
        org.telegram.messenger.g0.h3(bnVar.m9, 1000L);
    }
}

package org.telegram.ui;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class kj implements Runnable {
    public final /* synthetic */ wm a;

    public kj(wm wmVar) {
        this.a = wmVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        wm wmVar = this.a;
        org.telegram.messenger.zi ziVar = wmVar.u5;
        if (ziVar == null || wmVar.i9 == null) {
            return;
        }
        int max = Math.max(0, ziVar.k.ttl_period - (wmVar.getConnectionsManager().getCurrentTime() - wmVar.u5.k.date));
        wmVar.i9.setSubtext(org.telegram.messenger.bd.a0(null, null, 2131753853, max < 86400 ? org.telegram.messenger.g0.g0(max, false, true) : org.telegram.messenger.bd.G(Math.round(max / 86400.0f), "Days", new Object[0])));
        org.telegram.messenger.g0.i3(wmVar.j9, 1000L);
    }
}

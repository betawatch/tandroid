package org.telegram.ui;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class jk implements Runnable {
    public final /* synthetic */ un a;

    public jk(un unVar) {
        this.a = unVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        un unVar = this.a;
        org.telegram.messenger.kj kjVar = unVar.t5;
        if (kjVar == null || unVar.h9 == null) {
            return;
        }
        int max = Math.max(0, kjVar.k.ttl_period - (unVar.getConnectionsManager().getCurrentTime() - unVar.t5.k.date));
        unVar.h9.setSubtext(org.telegram.messenger.dd.a0(null, null, 2131753853, max < 86400 ? org.telegram.messenger.i0.g0(max, false, true) : org.telegram.messenger.dd.G(Math.round(max / 86400.0f), "Days", new Object[0])));
        org.telegram.messenger.i0.h3(unVar.i9, 1000L);
    }
}

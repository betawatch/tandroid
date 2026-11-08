package org.telegram.ui;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class oj implements Runnable {
    public final /* synthetic */ an a;

    public oj(an anVar) {
        this.a = anVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        an anVar = this.a;
        org.telegram.messenger.ij ijVar = anVar.t5;
        if (ijVar == null || anVar.h9 == null) {
            return;
        }
        int max = Math.max(0, ijVar.k.ttl_period - (anVar.getConnectionsManager().getCurrentTime() - anVar.t5.k.date));
        anVar.h9.setSubtext(org.telegram.messenger.id.a0(null, null, 2131753853, max < 86400 ? org.telegram.messenger.g0.g0(max, false, true) : org.telegram.messenger.id.G(Math.round(max / 86400.0f), "Days", new Object[0])));
        org.telegram.messenger.g0.i3(anVar.i9, 1000L);
    }
}

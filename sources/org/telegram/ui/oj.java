package org.telegram.ui;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
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

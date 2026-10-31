package org.telegram.ui;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class jk implements Runnable {
    public final /* synthetic */ un a;

    public jk(un unVar) {
        this.a = unVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        un unVar = this.a;
        org.telegram.messenger.jj jjVar = unVar.t5;
        if (jjVar == null || unVar.h9 == null) {
            return;
        }
        int max = Math.max(0, jjVar.k.ttl_period - (unVar.getConnectionsManager().getCurrentTime() - unVar.t5.k.date));
        unVar.h9.setSubtext(org.telegram.messenger.cd.a0(null, null, 2131753853, max < 86400 ? org.telegram.messenger.i0.g0(max, false, true) : org.telegram.messenger.cd.G(Math.round(max / 86400.0f), "Days", new Object[0])));
        org.telegram.messenger.i0.h3(unVar.i9, 1000L);
    }
}

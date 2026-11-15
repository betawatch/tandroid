package org.telegram.ui;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class oj implements Runnable {
    public final /* synthetic */ an a;

    public oj(an anVar) {
        this.a = anVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        an anVar = this.a;
        org.telegram.messenger.gj gjVar = anVar.u5;
        if (gjVar == null || anVar.k9 == null) {
            return;
        }
        int max = Math.max(0, gjVar.k.ttl_period - (anVar.getConnectionsManager().getCurrentTime() - anVar.u5.k.date));
        anVar.k9.setSubtext(org.telegram.messenger.hd.a0(null, null, 2131753853, max < 86400 ? org.telegram.messenger.g0.g0(max, false, true) : org.telegram.messenger.hd.G(Math.round(max / 86400.0f), "Days", new Object[0])));
        org.telegram.messenger.g0.i3(anVar.l9, 1000L);
    }
}

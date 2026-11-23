package org.telegram.ui;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final /* synthetic */ class cj implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ dj b;

    public /* synthetic */ cj(dj djVar, int i7) {
        this.a = i7;
        this.b = djVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                dj djVar = this.b;
                djVar.W = null;
                bn bnVar = djVar.X;
                if (bnVar.ea != -1) {
                    bnVar.getNotificationCenter().j(bnVar.ea);
                    bnVar.ea = -1;
                }
                if (org.telegram.messenger.s2.a) {
                    org.telegram.messenger.a8.b("chatItemAnimator enable notifications");
                    break;
                }
                break;
            default:
                dj djVar2 = this.b;
                djVar2.W = null;
                bn bnVar2 = djVar2.X;
                if (bnVar2.ea != -1) {
                    bnVar2.getNotificationCenter().j(bnVar2.ea);
                    bnVar2.ea = -1;
                }
                if (org.telegram.messenger.s2.a) {
                    org.telegram.messenger.a8.b("chatItemAnimator enable notifications");
                    break;
                }
                break;
        }
    }
}

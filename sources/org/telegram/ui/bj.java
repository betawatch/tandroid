package org.telegram.ui;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final /* synthetic */ class bj implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ cj b;

    public /* synthetic */ bj(cj cjVar, int i7) {
        this.a = i7;
        this.b = cjVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                cj cjVar = this.b;
                cjVar.W = null;
                an anVar = cjVar.X;
                if (anVar.da != -1) {
                    anVar.getNotificationCenter().j(anVar.da);
                    anVar.da = -1;
                }
                if (org.telegram.messenger.r2.a) {
                    org.telegram.messenger.a8.b("chatItemAnimator enable notifications");
                    break;
                }
                break;
            default:
                cj cjVar2 = this.b;
                cjVar2.W = null;
                an anVar2 = cjVar2.X;
                if (anVar2.da != -1) {
                    anVar2.getNotificationCenter().j(anVar2.da);
                    anVar2.da = -1;
                }
                if (org.telegram.messenger.r2.a) {
                    org.telegram.messenger.a8.b("chatItemAnimator enable notifications");
                    break;
                }
                break;
        }
    }
}

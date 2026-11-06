package org.telegram.ui;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
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
                if (anVar.aa != -1) {
                    anVar.getNotificationCenter().j(anVar.aa);
                    anVar.aa = -1;
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
                if (anVar2.aa != -1) {
                    anVar2.getNotificationCenter().j(anVar2.aa);
                    anVar2.aa = -1;
                }
                if (org.telegram.messenger.r2.a) {
                    org.telegram.messenger.a8.b("chatItemAnimator enable notifications");
                    break;
                }
                break;
        }
    }
}

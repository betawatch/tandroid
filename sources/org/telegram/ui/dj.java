package org.telegram.ui;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class dj implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ej b;

    public /* synthetic */ dj(ej ejVar, int i7) {
        this.a = i7;
        this.b = ejVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ej ejVar = this.b;
                ejVar.W = null;
                cn cnVar = ejVar.X;
                if (cnVar.ca != -1) {
                    cnVar.getNotificationCenter().j(cnVar.ca);
                    cnVar.ca = -1;
                }
                if (org.telegram.messenger.r2.a) {
                    org.telegram.messenger.a8.b("chatItemAnimator enable notifications");
                    break;
                }
                break;
            default:
                ej ejVar2 = this.b;
                ejVar2.W = null;
                cn cnVar2 = ejVar2.X;
                if (cnVar2.ca != -1) {
                    cnVar2.getNotificationCenter().j(cnVar2.ca);
                    cnVar2.ca = -1;
                }
                if (org.telegram.messenger.r2.a) {
                    org.telegram.messenger.a8.b("chatItemAnimator enable notifications");
                    break;
                }
                break;
        }
    }
}

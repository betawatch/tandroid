package org.telegram.ui;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class fh0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ gh0 b;

    public /* synthetic */ fh0(gh0 gh0Var, int i10) {
        this.a = i10;
        this.b = gh0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.W = null;
                if (org.telegram.messenger.v2.a) {
                    org.telegram.messenger.f8.b("chatItemAnimator enable notifications");
                    break;
                }
                break;
            default:
                this.b.W = null;
                if (org.telegram.messenger.v2.a) {
                    org.telegram.messenger.f8.b("chatItemAnimator enable notifications");
                    break;
                }
                break;
        }
    }
}

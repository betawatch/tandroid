package org.telegram.ui;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class bg0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ cg0 b;

    public /* synthetic */ bg0(cg0 cg0Var, int i7) {
        this.a = i7;
        this.b = cg0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.W = null;
                if (org.telegram.messenger.r2.a) {
                    org.telegram.messenger.a8.b("chatItemAnimator enable notifications");
                    break;
                }
                break;
            default:
                this.b.W = null;
                if (org.telegram.messenger.r2.a) {
                    org.telegram.messenger.a8.b("chatItemAnimator enable notifications");
                    break;
                }
                break;
        }
    }
}

package org.telegram.ui;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
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
                if (org.telegram.messenger.s2.a) {
                    org.telegram.messenger.a8.b("chatItemAnimator enable notifications");
                    break;
                }
                break;
            default:
                this.b.W = null;
                if (org.telegram.messenger.s2.a) {
                    org.telegram.messenger.a8.b("chatItemAnimator enable notifications");
                    break;
                }
                break;
        }
    }
}

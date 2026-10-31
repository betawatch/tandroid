package org.telegram.ui;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class hh0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ih0 b;

    public /* synthetic */ hh0(ih0 ih0Var, int i10) {
        this.a = i10;
        this.b = ih0Var;
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

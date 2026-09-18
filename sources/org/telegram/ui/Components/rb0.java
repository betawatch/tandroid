package org.telegram.ui.Components;

import org.telegram.messenger.NotificationCenter;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
/* loaded from: classes3.dex */
public final /* synthetic */ class rb0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ sb0 b;

    public /* synthetic */ rb0(sb0 sb0Var, int i10) {
        this.a = i10;
        this.b = sb0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                sb0 sb0Var = this.b;
                if (sb0Var.W != -1) {
                    NotificationCenter.getInstance(sb0Var.Y.c0.w).onAnimationFinish(sb0Var.W);
                    sb0Var.W = -1;
                    break;
                }
                break;
            case 1:
                this.b.Y.h();
                break;
            default:
                sb0 sb0Var2 = this.b;
                if (sb0Var2.W != -1) {
                    NotificationCenter.getInstance(sb0Var2.Y.c0.w).onAnimationFinish(sb0Var2.W);
                    sb0Var2.W = -1;
                    break;
                }
                break;
        }
    }
}

package org.telegram.ui.Components;

import org.telegram.messenger.NotificationCenter;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final /* synthetic */ class jc0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ kc0 b;

    public /* synthetic */ jc0(kc0 kc0Var, int i10) {
        this.a = i10;
        this.b = kc0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                kc0 kc0Var = this.b;
                if (kc0Var.W != -1) {
                    NotificationCenter.getInstance(kc0Var.Y.c0.w).onAnimationFinish(kc0Var.W);
                    kc0Var.W = -1;
                    break;
                }
                break;
            case 1:
                this.b.Y.h();
                break;
            default:
                kc0 kc0Var2 = this.b;
                if (kc0Var2.W != -1) {
                    NotificationCenter.getInstance(kc0Var2.Y.c0.w).onAnimationFinish(kc0Var2.W);
                    kc0Var2.W = -1;
                    break;
                }
                break;
        }
    }
}

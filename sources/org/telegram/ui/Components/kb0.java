package org.telegram.ui.Components;

import org.telegram.messenger.NotificationCenter;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final /* synthetic */ class kb0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ lb0 b;

    public /* synthetic */ kb0(lb0 lb0Var, int i10) {
        this.a = i10;
        this.b = lb0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                lb0 lb0Var = this.b;
                if (lb0Var.W != -1) {
                    NotificationCenter.getInstance(lb0Var.Y.W.w).onAnimationFinish(lb0Var.W);
                    lb0Var.W = -1;
                    break;
                }
                break;
            case 1:
                this.b.Y.h();
                break;
            default:
                lb0 lb0Var2 = this.b;
                if (lb0Var2.W != -1) {
                    NotificationCenter.getInstance(lb0Var2.Y.W.w).onAnimationFinish(lb0Var2.W);
                    lb0Var2.W = -1;
                    break;
                }
                break;
        }
    }
}

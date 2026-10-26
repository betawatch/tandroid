package org.telegram.ui.Components;

import org.telegram.messenger.NotificationCenter;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final /* synthetic */ class bc0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ cc0 b;

    public /* synthetic */ bc0(cc0 cc0Var, int i10) {
        this.a = i10;
        this.b = cc0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                cc0 cc0Var = this.b;
                if (cc0Var.W != -1) {
                    NotificationCenter.getInstance(cc0Var.Y.c0.w).onAnimationFinish(cc0Var.W);
                    cc0Var.W = -1;
                    break;
                }
                break;
            case 1:
                this.b.Y.i();
                break;
            default:
                cc0 cc0Var2 = this.b;
                if (cc0Var2.W != -1) {
                    NotificationCenter.getInstance(cc0Var2.Y.c0.w).onAnimationFinish(cc0Var2.W);
                    cc0Var2.W = -1;
                    break;
                }
                break;
        }
    }
}

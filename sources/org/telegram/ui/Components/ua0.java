package org.telegram.ui.Components;

import org.telegram.messenger.NotificationCenter;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ua0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ va0 b;

    public /* synthetic */ ua0(va0 va0Var, int i10) {
        this.a = i10;
        this.b = va0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                va0 va0Var = this.b;
                if (va0Var.W != -1) {
                    NotificationCenter.getInstance(va0Var.Y.V.w).onAnimationFinish(va0Var.W);
                    va0Var.W = -1;
                    break;
                }
                break;
            case 1:
                this.b.Y.h();
                break;
            default:
                va0 va0Var2 = this.b;
                if (va0Var2.W != -1) {
                    NotificationCenter.getInstance(va0Var2.Y.V.w).onAnimationFinish(va0Var2.W);
                    va0Var2.W = -1;
                    break;
                }
                break;
        }
    }
}

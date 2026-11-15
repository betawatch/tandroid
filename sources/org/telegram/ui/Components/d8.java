package org.telegram.ui.Components;

import org.telegram.ui.PremiumPreviewFragment;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class d8 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ q8 b;

    public /* synthetic */ d8(q8 q8Var, int i7) {
        this.a = i7;
        this.b = q8Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                q8 q8Var = this.b;
                if (!q8Var.V) {
                    if (q8Var.O <= 0.0f) {
                        q8Var.l0(!q8Var.a.w, true, false);
                        break;
                    } else {
                        if (q8Var.N != null) {
                            q8Var.F = 1.0f;
                            q8Var.G = true;
                        }
                        org.telegram.messenger.g0.v1(q8Var.fragmentView);
                        break;
                    }
                }
                break;
            default:
                q8 q8Var2 = this.b;
                q8Var2.getClass();
                q8Var2.presentFragment(new PremiumPreviewFragment(0, "avatar"));
                break;
        }
    }
}

package org.telegram.ui;

import android.view.WindowManager;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class b0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ i4 b;

    public /* synthetic */ b0(i4 i4Var, int i3) {
        this.a = i3;
        this.b = i4Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                i4 i4Var = this.b;
                try {
                    if (i4Var.g0.getParent() != null) {
                        ((WindowManager) i4Var.M.getSystemService("window")).removeView(i4Var.g0);
                        break;
                    }
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                    return;
                }
                break;
            case 1:
                i4 i4Var2 = this.b;
                l0 l0Var = i4Var2.h0;
                if (l0Var != null && i4Var2.g0 != null) {
                    l0Var.setLayerType(0, null);
                    i4Var2.a0 = 0;
                    org.telegram.messenger.g0.v1(i4Var2.M.getCurrentFocus());
                    break;
                }
                break;
            case 2:
                this.b.d0();
                break;
            case 3:
                i4 i4Var3 = this.b;
                float currentProgress = 0.7f - i4Var3.i0.e0.getCurrentProgress();
                if (currentProgress > 0.0f) {
                    float f10 = currentProgress < 0.25f ? 0.01f : 0.02f;
                    org.telegram.ui.Components.d70 d70Var = i4Var3.i0.e0;
                    d70Var.a(true, d70Var.getCurrentProgress() + f10);
                    org.telegram.messenger.g0.i3(i4Var3.k0, 100L);
                    break;
                }
                break;
            case 4:
                org.telegram.messenger.g0.h3(new b0(this.b, 2));
                break;
            case 5:
                org.telegram.messenger.g0.h3(new b0(this.b, 2));
                break;
            case 6:
                this.b.L.a(true);
                break;
            case 7:
                this.b.L.a(true);
                break;
            case 8:
                this.b.a0();
                break;
            case 9:
                this.b.f0();
                break;
            case 10:
                i4 i4Var4 = this.b;
                l0 l0Var2 = i4Var4.h0;
                if (l0Var2 != null) {
                    l0Var2.setLayerType(0, null);
                    i4Var4.a0 = 0;
                    i4Var4.K();
                    break;
                }
                break;
            default:
                org.telegram.ui.ActionBar.d2 T = LaunchActivity.T();
                if (T != null) {
                    org.telegram.ui.ActionBar.b2 b2Var = new org.telegram.ui.ActionBar.b2();
                    b2Var.a = true;
                    T.showAsSheet(new org.telegram.ui.web.m1(new q(this.b, 3)), b2Var);
                    break;
                }
                break;
        }
    }
}

package org.telegram.ui;

import android.view.WindowManager;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final /* synthetic */ class a0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ g4 b;

    public /* synthetic */ a0(g4 g4Var, int i7) {
        this.a = i7;
        this.b = g4Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                g4 g4Var = this.b;
                try {
                    if (g4Var.f0.getParent() != null) {
                        ((WindowManager) g4Var.L.getSystemService("window")).removeView(g4Var.f0);
                        break;
                    }
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                    return;
                }
                break;
            case 1:
                g4 g4Var2 = this.b;
                k0 k0Var = g4Var2.g0;
                if (k0Var != null && g4Var2.f0 != null) {
                    k0Var.setLayerType(0, null);
                    g4Var2.Z = 0;
                    org.telegram.messenger.g0.v1(g4Var2.L.getCurrentFocus());
                    break;
                }
                break;
            case 2:
                this.b.d0();
                break;
            case 3:
                g4 g4Var3 = this.b;
                float currentProgress = 0.7f - g4Var3.h0.d0.getCurrentProgress();
                if (currentProgress > 0.0f) {
                    float f10 = currentProgress < 0.25f ? 0.01f : 0.02f;
                    org.telegram.ui.Components.h70 h70Var = g4Var3.h0.d0;
                    h70Var.a(true, h70Var.getCurrentProgress() + f10);
                    org.telegram.messenger.g0.i3(g4Var3.j0, 100L);
                    break;
                }
                break;
            case 4:
                org.telegram.messenger.g0.h3(new a0(this.b, 2));
                break;
            case 5:
                org.telegram.messenger.g0.h3(new a0(this.b, 2));
                break;
            case 6:
                this.b.K.a(true);
                break;
            case 7:
                this.b.K.a(true);
                break;
            case 8:
                this.b.a0();
                break;
            case 9:
                this.b.f0();
                break;
            case 10:
                g4 g4Var4 = this.b;
                k0 k0Var2 = g4Var4.g0;
                if (k0Var2 != null) {
                    k0Var2.setLayerType(0, null);
                    g4Var4.Z = 0;
                    g4Var4.K();
                    break;
                }
                break;
            default:
                org.telegram.ui.ActionBar.f2 T = LaunchActivity.T();
                if (T != null) {
                    org.telegram.ui.ActionBar.d2 d2Var = new org.telegram.ui.ActionBar.d2();
                    d2Var.a = true;
                    T.showAsSheet(new org.telegram.ui.web.o1(new q(this.b, 3)), d2Var);
                    break;
                }
                break;
        }
    }
}

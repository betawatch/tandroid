package org.telegram.ui;

import android.graphics.Typeface;
import android.provider.Settings;
import org.telegram.messenger.voip.VoIPService;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class p00 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ x30 b;

    public /* synthetic */ p00(x30 x30Var, int i3) {
        this.a = i3;
        this.b = x30Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i3 = this.a;
        x30 x30Var = this.b;
        switch (i3) {
            case 0:
                if (x30Var.t1()) {
                    LaunchActivity launchActivity = x30Var.a2;
                    Typeface typeface = org.telegram.messenger.g0.a;
                    if (Settings.canDrawOverlays(launchActivity) && !org.telegram.ui.Components.voip.s0.e0.W) {
                        x30Var.dismiss();
                        org.telegram.messenger.g0.i3(new p00(x30Var, 4), 100L);
                        break;
                    }
                }
                break;
            case 1:
                if (x30Var.S2 != null && x30Var.J3 && VoIPService.getSharedInstance() != null) {
                    try {
                        x30Var.t1.performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                    x30Var.M1(1, true);
                    org.telegram.messenger.g0.i3(x30Var.p4, 80L);
                    x30Var.J3 = false;
                    x30Var.K3 = true;
                    break;
                }
                break;
            case 2:
                int i10 = x30Var.L3;
                if (i10 == 1 || i10 == 2 || i10 == 6 || i10 == 5) {
                    x30Var.Q1(true, false);
                    break;
                }
            case 3:
                x30Var.x1();
                break;
            case 4:
                org.telegram.ui.Components.voip.s0.h(x30Var.a2);
                break;
            case 5:
                x30Var.dismiss();
                break;
            case 6:
                x30Var.N1();
                org.telegram.messenger.g0.i3(x30Var.v3, 1000L);
                break;
            case 7:
                t20 t20Var = x30Var.j2;
                if (t20Var != null) {
                    t20Var.show();
                    break;
                }
                break;
            case 8:
                x30Var.a1();
                x30Var.X0();
                x30Var.W0();
                x30Var.x1.setTranslationY((-x30Var.u3.d()) + x30Var.b.getPaddingBottom());
                x30Var.y1.invalidate();
                x30Var.b1();
                x30Var.b.invalidate();
                break;
            case 9:
                org.telegram.messenger.hp.s1(x30Var.l1.a).l0(null);
                break;
            default:
                x30Var.p5 = null;
                x30Var.K1(true);
                break;
        }
    }
}

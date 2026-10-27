package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.voip.VoIPService;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final /* synthetic */ class j20 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ x50 b;

    public /* synthetic */ j20(x50 x50Var, int i10) {
        this.a = i10;
        this.b = x50Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                x50 x50Var = this.b;
                if (x50Var.r1() && AndroidUtilities.checkInlinePermissions(x50Var.i0) && !org.telegram.ui.Components.voip.i1.d0.V) {
                    x50Var.dismiss();
                    AndroidUtilities.runOnUIThread(new j20(x50Var, 4), 100L);
                    break;
                }
                break;
            case 1:
                x50 x50Var2 = this.b;
                if (x50Var2.a1 != null && x50Var2.R1 && VoIPService.getSharedInstance() != null) {
                    try {
                        x50Var2.w.performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                    x50Var2.K1(1, true);
                    AndroidUtilities.runOnUIThread(x50Var2.x2, 80L);
                    x50Var2.R1 = false;
                    x50Var2.S1 = true;
                    break;
                }
                break;
            case 2:
                x50 x50Var3 = this.b;
                int i10 = x50Var3.T1;
                if (i10 == 1 || i10 == 2 || i10 == 6 || i10 == 5) {
                    x50Var3.O1(true, false);
                    break;
                }
                break;
            case 3:
                this.b.v1();
                break;
            case 4:
                org.telegram.ui.Components.voip.i1.n(this.b.i0);
                break;
            case 5:
                this.b.dismiss();
                break;
            case 6:
                x50 x50Var4 = this.b;
                x50Var4.L1();
                AndroidUtilities.runOnUIThread(x50Var4.D1, 1000L);
                break;
            case 7:
                r40 r40Var = this.b.r0;
                if (r40Var != null) {
                    r40Var.show();
                    break;
                }
                break;
            case 8:
                x50.t(this.b);
                break;
            case 9:
                this.b.d.getMessagesController().deleteUserPhoto(null);
                break;
            default:
                x50 x50Var5 = this.b;
                x50Var5.x3 = null;
                x50Var5.I1(true);
                break;
        }
    }
}

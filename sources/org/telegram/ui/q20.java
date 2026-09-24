package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.voip.VoIPService;

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
/* loaded from: classes3.dex */
public final /* synthetic */ class q20 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ d60 b;

    public /* synthetic */ q20(d60 d60Var, int i10) {
        this.a = i10;
        this.b = d60Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                d60 d60Var = this.b;
                if (d60Var.r1() && AndroidUtilities.checkInlinePermissions(d60Var.i0) && !org.telegram.ui.Components.voip.k1.d0.V) {
                    d60Var.dismiss();
                    AndroidUtilities.runOnUIThread(new q20(d60Var, 4), 100L);
                    break;
                }
                break;
            case 1:
                d60 d60Var2 = this.b;
                if (d60Var2.a1 != null && d60Var2.R1 && VoIPService.getSharedInstance() != null) {
                    try {
                        d60Var2.w.performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                    d60Var2.J1(1, true);
                    AndroidUtilities.runOnUIThread(d60Var2.x2, 80L);
                    d60Var2.R1 = false;
                    d60Var2.S1 = true;
                    break;
                }
                break;
            case 2:
                d60 d60Var3 = this.b;
                int i10 = d60Var3.T1;
                if (i10 == 1 || i10 == 2 || i10 == 6 || i10 == 5) {
                    d60Var3.N1(true, false);
                    break;
                }
                break;
            case 3:
                this.b.v1();
                break;
            case 4:
                org.telegram.ui.Components.voip.k1.n(this.b.i0);
                break;
            case 5:
                this.b.dismiss();
                break;
            case 6:
                d60 d60Var4 = this.b;
                d60Var4.K1();
                AndroidUtilities.runOnUIThread(d60Var4.D1, 1000L);
                break;
            case 7:
                y40 y40Var = this.b.r0;
                if (y40Var != null) {
                    y40Var.show();
                    break;
                }
                break;
            case 8:
                d60.t(this.b);
                break;
            case 9:
                this.b.d.getMessagesController().deleteUserPhoto(null);
                break;
            default:
                d60 d60Var5 = this.b;
                d60Var5.x3 = null;
                d60Var5.H1(true);
                break;
        }
    }
}

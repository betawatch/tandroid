package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.voip.VoIPService;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final /* synthetic */ class p20 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ c60 b;

    public /* synthetic */ p20(c60 c60Var, int i10) {
        this.a = i10;
        this.b = c60Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                c60 c60Var = this.b;
                if (c60Var.r1() && AndroidUtilities.checkInlinePermissions(c60Var.f0) && !org.telegram.ui.Components.voip.g1.a0.S) {
                    c60Var.dismiss();
                    AndroidUtilities.runOnUIThread(new p20(c60Var, 4), 100L);
                    break;
                }
                break;
            case 1:
                c60 c60Var2 = this.b;
                if (c60Var2.X0 != null && c60Var2.O1 && VoIPService.getSharedInstance() != null) {
                    try {
                        c60Var2.w.performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                    c60Var2.J1(1, true);
                    AndroidUtilities.runOnUIThread(c60Var2.u2, 80L);
                    c60Var2.O1 = false;
                    c60Var2.P1 = true;
                    break;
                }
                break;
            case 2:
                c60 c60Var3 = this.b;
                int i10 = c60Var3.Q1;
                if (i10 == 1 || i10 == 2 || i10 == 6 || i10 == 5) {
                    c60Var3.N1(true, false);
                    break;
                }
                break;
            case 3:
                this.b.v1();
                break;
            case 4:
                org.telegram.ui.Components.voip.g1.n(this.b.f0);
                break;
            case 5:
                this.b.dismiss();
                break;
            case 6:
                c60 c60Var4 = this.b;
                c60Var4.K1();
                AndroidUtilities.runOnUIThread(c60Var4.A1, 1000L);
                break;
            case 7:
                y40 y40Var = this.b.o0;
                if (y40Var != null) {
                    y40Var.show();
                    break;
                }
                break;
            case 8:
                c60.t(this.b);
                break;
            case 9:
                this.b.d.getMessagesController().deleteUserPhoto(null);
                break;
            default:
                c60 c60Var5 = this.b;
                c60Var5.u3 = null;
                c60Var5.H1(true);
                break;
        }
    }
}

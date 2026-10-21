package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.voip.VoIPService;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes3.dex */
public final /* synthetic */ class c20 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ q50 b;

    public /* synthetic */ c20(q50 q50Var, int i10) {
        this.a = i10;
        this.b = q50Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                q50 q50Var = this.b;
                if (q50Var.s1() && AndroidUtilities.checkInlinePermissions(q50Var.i0) && !org.telegram.ui.Components.voip.h1.d0.V) {
                    q50Var.dismiss();
                    AndroidUtilities.runOnUIThread(new c20(q50Var, 4), 100L);
                    break;
                }
                break;
            case 1:
                q50 q50Var2 = this.b;
                if (q50Var2.a1 != null && q50Var2.R1 && VoIPService.getSharedInstance() != null) {
                    try {
                        q50Var2.w.performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                    q50Var2.K1(1, true);
                    AndroidUtilities.runOnUIThread(q50Var2.x2, 80L);
                    q50Var2.R1 = false;
                    q50Var2.S1 = true;
                    break;
                }
                break;
            case 2:
                q50 q50Var3 = this.b;
                int i10 = q50Var3.T1;
                if (i10 == 1 || i10 == 2 || i10 == 6 || i10 == 5) {
                    q50Var3.O1(true, false);
                    break;
                }
                break;
            case 3:
                this.b.w1();
                break;
            case 4:
                org.telegram.ui.Components.voip.h1.n(this.b.i0);
                break;
            case 5:
                this.b.dismiss();
                break;
            case 6:
                q50 q50Var4 = this.b;
                q50Var4.L1();
                AndroidUtilities.runOnUIThread(q50Var4.D1, 1000L);
                break;
            case 7:
                k40 k40Var = this.b.r0;
                if (k40Var != null) {
                    k40Var.show();
                    break;
                }
                break;
            case 8:
                q50.v(this.b);
                break;
            case 9:
                this.b.d.getMessagesController().deleteUserPhoto(null);
                break;
            default:
                q50 q50Var5 = this.b;
                q50Var5.x3 = null;
                q50Var5.I1(true);
                break;
        }
    }
}

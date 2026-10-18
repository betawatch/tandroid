package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.voip.VoIPService;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public final /* synthetic */ class e20 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ s50 b;

    public /* synthetic */ e20(s50 s50Var, int i10) {
        this.a = i10;
        this.b = s50Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                s50 s50Var = this.b;
                if (s50Var.s1() && AndroidUtilities.checkInlinePermissions(s50Var.i0) && !org.telegram.ui.Components.voip.h1.d0.V) {
                    s50Var.dismiss();
                    AndroidUtilities.runOnUIThread(new e20(s50Var, 4), 100L);
                    break;
                }
                break;
            case 1:
                s50 s50Var2 = this.b;
                if (s50Var2.a1 != null && s50Var2.R1 && VoIPService.getSharedInstance() != null) {
                    try {
                        s50Var2.w.performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                    s50Var2.K1(1, true);
                    AndroidUtilities.runOnUIThread(s50Var2.x2, 80L);
                    s50Var2.R1 = false;
                    s50Var2.S1 = true;
                    break;
                }
                break;
            case 2:
                s50 s50Var3 = this.b;
                int i10 = s50Var3.T1;
                if (i10 == 1 || i10 == 2 || i10 == 6 || i10 == 5) {
                    s50Var3.O1(true, false);
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
                s50 s50Var4 = this.b;
                s50Var4.L1();
                AndroidUtilities.runOnUIThread(s50Var4.D1, 1000L);
                break;
            case 7:
                m40 m40Var = this.b.r0;
                if (m40Var != null) {
                    m40Var.show();
                    break;
                }
                break;
            case 8:
                s50.v(this.b);
                break;
            case 9:
                this.b.d.getMessagesController().deleteUserPhoto(null);
                break;
            default:
                s50 s50Var5 = this.b;
                s50Var5.x3 = null;
                s50Var5.I1(true);
                break;
        }
    }
}

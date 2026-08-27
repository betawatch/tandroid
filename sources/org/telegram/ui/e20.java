package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.voip.VoIPService;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
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
                if (s50Var.r1() && AndroidUtilities.checkInlinePermissions(s50Var.e0) && !org.telegram.ui.Components.voip.g1.Z.R) {
                    s50Var.dismiss();
                    AndroidUtilities.runOnUIThread(new e20(s50Var, 4), 100L);
                    break;
                }
                break;
            case 1:
                s50 s50Var2 = this.b;
                if (s50Var2.W0 != null && s50Var2.N1 && VoIPService.getSharedInstance() != null) {
                    try {
                        s50Var2.w.performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                    s50Var2.J1(1, true);
                    AndroidUtilities.runOnUIThread(s50Var2.t2, 80L);
                    s50Var2.N1 = false;
                    s50Var2.O1 = true;
                    break;
                }
                break;
            case 2:
                s50 s50Var3 = this.b;
                int i10 = s50Var3.P1;
                if (i10 == 1 || i10 == 2 || i10 == 6 || i10 == 5) {
                    s50Var3.N1(true, false);
                    break;
                }
                break;
            case 3:
                this.b.v1();
                break;
            case 4:
                org.telegram.ui.Components.voip.g1.n(this.b.e0);
                break;
            case 5:
                this.b.dismiss();
                break;
            case 6:
                s50 s50Var4 = this.b;
                s50Var4.K1();
                AndroidUtilities.runOnUIThread(s50Var4.z1, 1000L);
                break;
            case 7:
                m40 m40Var = this.b.n0;
                if (m40Var != null) {
                    m40Var.show();
                    break;
                }
                break;
            case 8:
                s50.u(this.b);
                break;
            case 9:
                this.b.d.getMessagesController().deleteUserPhoto(null);
                break;
            default:
                s50 s50Var5 = this.b;
                s50Var5.t3 = null;
                s50Var5.H1(true);
                break;
        }
    }
}

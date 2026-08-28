package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.voip.VoIPService;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class b20 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ o50 b;

    public /* synthetic */ b20(o50 o50Var, int i9) {
        this.a = i9;
        this.b = o50Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                o50 o50Var = this.b;
                if (o50Var.r1() && AndroidUtilities.checkInlinePermissions(o50Var.e0) && !org.telegram.ui.Components.voip.g1.Z.R) {
                    o50Var.dismiss();
                    AndroidUtilities.runOnUIThread(new b20(o50Var, 4), 100L);
                    break;
                }
                break;
            case 1:
                o50 o50Var2 = this.b;
                if (o50Var2.W0 != null && o50Var2.N1 && VoIPService.getSharedInstance() != null) {
                    try {
                        o50Var2.w.performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                    o50Var2.J1(1, true);
                    AndroidUtilities.runOnUIThread(o50Var2.t2, 80L);
                    o50Var2.N1 = false;
                    o50Var2.O1 = true;
                    break;
                }
                break;
            case 2:
                o50 o50Var3 = this.b;
                int i9 = o50Var3.P1;
                if (i9 == 1 || i9 == 2 || i9 == 6 || i9 == 5) {
                    o50Var3.N1(true, false);
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
                o50 o50Var4 = this.b;
                o50Var4.K1();
                AndroidUtilities.runOnUIThread(o50Var4.z1, 1000L);
                break;
            case 7:
                j40 j40Var = this.b.n0;
                if (j40Var != null) {
                    j40Var.show();
                    break;
                }
                break;
            case 8:
                o50.t(this.b);
                break;
            case 9:
                this.b.d.getMessagesController().deleteUserPhoto(null);
                break;
            default:
                o50 o50Var5 = this.b;
                o50Var5.t3 = null;
                o50Var5.H1(true);
                break;
        }
    }
}

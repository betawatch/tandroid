package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.voip.VoIPService;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class d20 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ r50 b;

    public /* synthetic */ d20(r50 r50Var, int i10) {
        this.a = i10;
        this.b = r50Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                r50 r50Var = this.b;
                if (r50Var.r1() && AndroidUtilities.checkInlinePermissions(r50Var.e0) && !org.telegram.ui.Components.voip.h1.Z.R) {
                    r50Var.dismiss();
                    AndroidUtilities.runOnUIThread(new d20(r50Var, 4), 100L);
                    break;
                }
                break;
            case 1:
                r50 r50Var2 = this.b;
                if (r50Var2.W0 != null && r50Var2.N1 && VoIPService.getSharedInstance() != null) {
                    try {
                        r50Var2.w.performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                    r50Var2.J1(1, true);
                    AndroidUtilities.runOnUIThread(r50Var2.t2, 80L);
                    r50Var2.N1 = false;
                    r50Var2.O1 = true;
                    break;
                }
                break;
            case 2:
                r50 r50Var3 = this.b;
                int i10 = r50Var3.P1;
                if (i10 == 1 || i10 == 2 || i10 == 6 || i10 == 5) {
                    r50Var3.N1(true, false);
                    break;
                }
                break;
            case 3:
                this.b.v1();
                break;
            case 4:
                org.telegram.ui.Components.voip.h1.n(this.b.e0);
                break;
            case 5:
                this.b.dismiss();
                break;
            case 6:
                r50 r50Var4 = this.b;
                r50Var4.K1();
                AndroidUtilities.runOnUIThread(r50Var4.z1, 1000L);
                break;
            case 7:
                m40 m40Var = this.b.n0;
                if (m40Var != null) {
                    m40Var.show();
                    break;
                }
                break;
            case 8:
                r50.t(this.b);
                break;
            case 9:
                this.b.d.getMessagesController().deleteUserPhoto(null);
                break;
            default:
                r50 r50Var5 = this.b;
                r50Var5.t3 = null;
                r50Var5.H1(true);
                break;
        }
    }
}

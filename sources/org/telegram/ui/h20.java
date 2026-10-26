package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.voip.VoIPService;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final /* synthetic */ class h20 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ v50 b;

    public /* synthetic */ h20(v50 v50Var, int i10) {
        this.a = i10;
        this.b = v50Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                v50 v50Var = this.b;
                if (v50Var.r1() && AndroidUtilities.checkInlinePermissions(v50Var.i0) && !org.telegram.ui.Components.voip.i1.d0.V) {
                    v50Var.dismiss();
                    AndroidUtilities.runOnUIThread(new h20(v50Var, 4), 100L);
                    break;
                }
                break;
            case 1:
                v50 v50Var2 = this.b;
                if (v50Var2.a1 != null && v50Var2.R1 && VoIPService.getSharedInstance() != null) {
                    try {
                        v50Var2.w.performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                    v50Var2.K1(1, true);
                    AndroidUtilities.runOnUIThread(v50Var2.x2, 80L);
                    v50Var2.R1 = false;
                    v50Var2.S1 = true;
                    break;
                }
                break;
            case 2:
                v50 v50Var3 = this.b;
                int i10 = v50Var3.T1;
                if (i10 == 1 || i10 == 2 || i10 == 6 || i10 == 5) {
                    v50Var3.O1(true, false);
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
                v50 v50Var4 = this.b;
                v50Var4.L1();
                AndroidUtilities.runOnUIThread(v50Var4.D1, 1000L);
                break;
            case 7:
                p40 p40Var = this.b.r0;
                if (p40Var != null) {
                    p40Var.show();
                    break;
                }
                break;
            case 8:
                v50.t(this.b);
                break;
            case 9:
                this.b.d.getMessagesController().deleteUserPhoto(null);
                break;
            default:
                v50 v50Var5 = this.b;
                v50Var5.x3 = null;
                v50Var5.I1(true);
                break;
        }
    }
}

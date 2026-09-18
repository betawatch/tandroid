package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.voip.VoIPService;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes3.dex */
public final /* synthetic */ class di1 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ si1 b;

    public /* synthetic */ di1(si1 si1Var, int i10) {
        this.a = i10;
        this.b = si1Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        VoIPService sharedInstance;
        switch (this.a) {
            case 0:
                if (VoIPService.getSharedInstance() != null) {
                    si1 si1Var = this.b;
                    AndroidUtilities.cancelRunOnUIThread(si1Var.S0);
                    si1Var.R0 = false;
                    VoIPService.getSharedInstance().hangUp();
                    break;
                }
                break;
            case 1:
                si1 si1Var2 = this.b;
                if (si1Var2.n0 && si1Var2.m0 && System.currentTimeMillis() - si1Var2.K0 > 500) {
                    AndroidUtilities.cancelRunOnUIThread(si1Var2.S0);
                    si1Var2.R0 = false;
                    si1Var2.K0 = System.currentTimeMillis();
                    si1Var2.Z.setRelativePosition(si1Var2.Y);
                    si1Var2.a0 = true;
                    si1Var2.H0 = true;
                    si1Var2.q0 = si1Var2.p0;
                    si1Var2.H();
                    break;
                }
                break;
            case 2:
                si1 si1Var3 = this.b;
                if (si1Var3.H0 && System.currentTimeMillis() - si1Var3.K0 > 500) {
                    AndroidUtilities.cancelRunOnUIThread(si1Var3.S0);
                    si1Var3.R0 = false;
                    si1Var3.K0 = System.currentTimeMillis();
                    si1Var3.Y.setRelativePosition(si1Var3.Z);
                    si1Var3.a0 = false;
                    si1Var3.H0 = false;
                    si1Var3.q0 = si1Var3.p0;
                    si1Var3.H();
                    break;
                }
                break;
            case 3:
                long currentTimeMillis = System.currentTimeMillis();
                si1 si1Var4 = this.b;
                if (currentTimeMillis - si1Var4.K0 >= 500) {
                    si1Var4.K0 = System.currentTimeMillis();
                    boolean z10 = si1Var4.C0;
                    if (!z10 && si1Var4.B0) {
                        si1Var4.m(!z10);
                        break;
                    }
                }
                break;
            case 4:
                long currentTimeMillis2 = System.currentTimeMillis();
                si1 si1Var5 = this.b;
                if (currentTimeMillis2 - si1Var5.K0 >= 500) {
                    si1Var5.K0 = System.currentTimeMillis();
                    if (si1Var5.B0) {
                        si1Var5.m(!si1Var5.C0);
                        break;
                    }
                }
                break;
            case 5:
                si1 si1Var6 = this.b;
                if (si1Var6.K.getTag() != null && (sharedInstance = VoIPService.getSharedInstance()) != null) {
                    si1Var6.B();
                    sharedInstance.toggleSpeakerphoneOrShowRouteSheet(si1Var6.b, false, Integer.valueOf(sharedInstance.isBluetoothOn() ? 2 : sharedInstance.isSpeakerphoneOn() ? 0 : 1));
                    break;
                }
                break;
            default:
                this.b.p();
                break;
        }
    }
}

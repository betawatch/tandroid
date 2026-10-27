package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.voip.VoIPService;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ch1 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ rh1 b;

    public /* synthetic */ ch1(rh1 rh1Var, int i10) {
        this.a = i10;
        this.b = rh1Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        VoIPService sharedInstance;
        switch (this.a) {
            case 0:
                if (VoIPService.getSharedInstance() != null) {
                    rh1 rh1Var = this.b;
                    AndroidUtilities.cancelRunOnUIThread(rh1Var.S0);
                    rh1Var.R0 = false;
                    VoIPService.getSharedInstance().hangUp();
                    break;
                }
                break;
            case 1:
                rh1 rh1Var2 = this.b;
                if (rh1Var2.n0 && rh1Var2.m0 && System.currentTimeMillis() - rh1Var2.K0 > 500) {
                    AndroidUtilities.cancelRunOnUIThread(rh1Var2.S0);
                    rh1Var2.R0 = false;
                    rh1Var2.K0 = System.currentTimeMillis();
                    rh1Var2.Z.setRelativePosition(rh1Var2.Y);
                    rh1Var2.a0 = true;
                    rh1Var2.H0 = true;
                    rh1Var2.q0 = rh1Var2.p0;
                    rh1Var2.G();
                    break;
                }
                break;
            case 2:
                rh1 rh1Var3 = this.b;
                if (rh1Var3.H0 && System.currentTimeMillis() - rh1Var3.K0 > 500) {
                    AndroidUtilities.cancelRunOnUIThread(rh1Var3.S0);
                    rh1Var3.R0 = false;
                    rh1Var3.K0 = System.currentTimeMillis();
                    rh1Var3.Y.setRelativePosition(rh1Var3.Z);
                    rh1Var3.a0 = false;
                    rh1Var3.H0 = false;
                    rh1Var3.q0 = rh1Var3.p0;
                    rh1Var3.G();
                    break;
                }
                break;
            case 3:
                long currentTimeMillis = System.currentTimeMillis();
                rh1 rh1Var4 = this.b;
                if (currentTimeMillis - rh1Var4.K0 >= 500) {
                    rh1Var4.K0 = System.currentTimeMillis();
                    boolean z10 = rh1Var4.C0;
                    if (!z10 && rh1Var4.B0) {
                        rh1Var4.l(!z10);
                        break;
                    }
                }
                break;
            case 4:
                long currentTimeMillis2 = System.currentTimeMillis();
                rh1 rh1Var5 = this.b;
                if (currentTimeMillis2 - rh1Var5.K0 >= 500) {
                    rh1Var5.K0 = System.currentTimeMillis();
                    if (rh1Var5.B0) {
                        rh1Var5.l(!rh1Var5.C0);
                        break;
                    }
                }
                break;
            case 5:
                rh1 rh1Var6 = this.b;
                if (rh1Var6.K.getTag() != null && (sharedInstance = VoIPService.getSharedInstance()) != null) {
                    rh1Var6.A();
                    sharedInstance.toggleSpeakerphoneOrShowRouteSheet(rh1Var6.b, false, Integer.valueOf(sharedInstance.isBluetoothOn() ? 2 : sharedInstance.isSpeakerphoneOn() ? 0 : 1));
                    break;
                }
                break;
            default:
                this.b.o();
                break;
        }
    }
}

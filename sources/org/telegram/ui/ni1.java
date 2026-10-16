package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.voip.VoIPService;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ni1 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ cj1 b;

    public /* synthetic */ ni1(cj1 cj1Var, int i10) {
        this.a = i10;
        this.b = cj1Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        VoIPService sharedInstance;
        switch (this.a) {
            case 0:
                if (VoIPService.getSharedInstance() != null) {
                    cj1 cj1Var = this.b;
                    AndroidUtilities.cancelRunOnUIThread(cj1Var.S0);
                    cj1Var.R0 = false;
                    VoIPService.getSharedInstance().hangUp();
                    break;
                }
                break;
            case 1:
                cj1 cj1Var2 = this.b;
                if (cj1Var2.n0 && cj1Var2.m0 && System.currentTimeMillis() - cj1Var2.K0 > 500) {
                    AndroidUtilities.cancelRunOnUIThread(cj1Var2.S0);
                    cj1Var2.R0 = false;
                    cj1Var2.K0 = System.currentTimeMillis();
                    cj1Var2.Z.setRelativePosition(cj1Var2.Y);
                    cj1Var2.a0 = true;
                    cj1Var2.H0 = true;
                    cj1Var2.q0 = cj1Var2.p0;
                    cj1Var2.G();
                    break;
                }
                break;
            case 2:
                cj1 cj1Var3 = this.b;
                if (cj1Var3.H0 && System.currentTimeMillis() - cj1Var3.K0 > 500) {
                    AndroidUtilities.cancelRunOnUIThread(cj1Var3.S0);
                    cj1Var3.R0 = false;
                    cj1Var3.K0 = System.currentTimeMillis();
                    cj1Var3.Y.setRelativePosition(cj1Var3.Z);
                    cj1Var3.a0 = false;
                    cj1Var3.H0 = false;
                    cj1Var3.q0 = cj1Var3.p0;
                    cj1Var3.G();
                    break;
                }
                break;
            case 3:
                long currentTimeMillis = System.currentTimeMillis();
                cj1 cj1Var4 = this.b;
                if (currentTimeMillis - cj1Var4.K0 >= 500) {
                    cj1Var4.K0 = System.currentTimeMillis();
                    boolean z10 = cj1Var4.C0;
                    if (!z10 && cj1Var4.B0) {
                        cj1Var4.l(!z10);
                        break;
                    }
                }
                break;
            case 4:
                long currentTimeMillis2 = System.currentTimeMillis();
                cj1 cj1Var5 = this.b;
                if (currentTimeMillis2 - cj1Var5.K0 >= 500) {
                    cj1Var5.K0 = System.currentTimeMillis();
                    if (cj1Var5.B0) {
                        cj1Var5.l(!cj1Var5.C0);
                        break;
                    }
                }
                break;
            case 5:
                cj1 cj1Var6 = this.b;
                if (cj1Var6.K.getTag() != null && (sharedInstance = VoIPService.getSharedInstance()) != null) {
                    cj1Var6.A();
                    sharedInstance.toggleSpeakerphoneOrShowRouteSheet(cj1Var6.b, false, Integer.valueOf(sharedInstance.isBluetoothOn() ? 2 : sharedInstance.isSpeakerphoneOn() ? 0 : 1));
                    break;
                }
                break;
            default:
                this.b.o();
                break;
        }
    }
}

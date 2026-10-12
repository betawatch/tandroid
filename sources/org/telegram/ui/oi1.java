package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.voip.VoIPService;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final /* synthetic */ class oi1 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ dj1 b;

    public /* synthetic */ oi1(dj1 dj1Var, int i10) {
        this.a = i10;
        this.b = dj1Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        VoIPService sharedInstance;
        switch (this.a) {
            case 0:
                if (VoIPService.getSharedInstance() != null) {
                    dj1 dj1Var = this.b;
                    AndroidUtilities.cancelRunOnUIThread(dj1Var.S0);
                    dj1Var.R0 = false;
                    VoIPService.getSharedInstance().hangUp();
                    break;
                }
                break;
            case 1:
                dj1 dj1Var2 = this.b;
                if (dj1Var2.n0 && dj1Var2.m0 && System.currentTimeMillis() - dj1Var2.K0 > 500) {
                    AndroidUtilities.cancelRunOnUIThread(dj1Var2.S0);
                    dj1Var2.R0 = false;
                    dj1Var2.K0 = System.currentTimeMillis();
                    dj1Var2.Z.setRelativePosition(dj1Var2.Y);
                    dj1Var2.a0 = true;
                    dj1Var2.H0 = true;
                    dj1Var2.q0 = dj1Var2.p0;
                    dj1Var2.G();
                    break;
                }
                break;
            case 2:
                dj1 dj1Var3 = this.b;
                if (dj1Var3.H0 && System.currentTimeMillis() - dj1Var3.K0 > 500) {
                    AndroidUtilities.cancelRunOnUIThread(dj1Var3.S0);
                    dj1Var3.R0 = false;
                    dj1Var3.K0 = System.currentTimeMillis();
                    dj1Var3.Y.setRelativePosition(dj1Var3.Z);
                    dj1Var3.a0 = false;
                    dj1Var3.H0 = false;
                    dj1Var3.q0 = dj1Var3.p0;
                    dj1Var3.G();
                    break;
                }
                break;
            case 3:
                long currentTimeMillis = System.currentTimeMillis();
                dj1 dj1Var4 = this.b;
                if (currentTimeMillis - dj1Var4.K0 >= 500) {
                    dj1Var4.K0 = System.currentTimeMillis();
                    boolean z10 = dj1Var4.C0;
                    if (!z10 && dj1Var4.B0) {
                        dj1Var4.l(!z10);
                        break;
                    }
                }
                break;
            case 4:
                long currentTimeMillis2 = System.currentTimeMillis();
                dj1 dj1Var5 = this.b;
                if (currentTimeMillis2 - dj1Var5.K0 >= 500) {
                    dj1Var5.K0 = System.currentTimeMillis();
                    if (dj1Var5.B0) {
                        dj1Var5.l(!dj1Var5.C0);
                        break;
                    }
                }
                break;
            case 5:
                dj1 dj1Var6 = this.b;
                if (dj1Var6.K.getTag() != null && (sharedInstance = VoIPService.getSharedInstance()) != null) {
                    dj1Var6.A();
                    sharedInstance.toggleSpeakerphoneOrShowRouteSheet(dj1Var6.b, false, Integer.valueOf(sharedInstance.isBluetoothOn() ? 2 : sharedInstance.isSpeakerphoneOn() ? 0 : 1));
                    break;
                }
                break;
            default:
                this.b.o();
                break;
        }
    }
}

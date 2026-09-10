package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.voip.VoIPService;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final /* synthetic */ class ki1 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ zi1 b;

    public /* synthetic */ ki1(zi1 zi1Var, int i10) {
        this.a = i10;
        this.b = zi1Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        VoIPService sharedInstance;
        switch (this.a) {
            case 0:
                if (VoIPService.getSharedInstance() != null) {
                    zi1 zi1Var = this.b;
                    AndroidUtilities.cancelRunOnUIThread(zi1Var.S0);
                    zi1Var.R0 = false;
                    VoIPService.getSharedInstance().hangUp();
                    break;
                }
                break;
            case 1:
                zi1 zi1Var2 = this.b;
                if (zi1Var2.n0 && zi1Var2.m0 && System.currentTimeMillis() - zi1Var2.K0 > 500) {
                    AndroidUtilities.cancelRunOnUIThread(zi1Var2.S0);
                    zi1Var2.R0 = false;
                    zi1Var2.K0 = System.currentTimeMillis();
                    zi1Var2.Z.setRelativePosition(zi1Var2.Y);
                    zi1Var2.a0 = true;
                    zi1Var2.H0 = true;
                    zi1Var2.q0 = zi1Var2.p0;
                    zi1Var2.H();
                    break;
                }
                break;
            case 2:
                zi1 zi1Var3 = this.b;
                if (zi1Var3.H0 && System.currentTimeMillis() - zi1Var3.K0 > 500) {
                    AndroidUtilities.cancelRunOnUIThread(zi1Var3.S0);
                    zi1Var3.R0 = false;
                    zi1Var3.K0 = System.currentTimeMillis();
                    zi1Var3.Y.setRelativePosition(zi1Var3.Z);
                    zi1Var3.a0 = false;
                    zi1Var3.H0 = false;
                    zi1Var3.q0 = zi1Var3.p0;
                    zi1Var3.H();
                    break;
                }
                break;
            case 3:
                long currentTimeMillis = System.currentTimeMillis();
                zi1 zi1Var4 = this.b;
                if (currentTimeMillis - zi1Var4.K0 >= 500) {
                    zi1Var4.K0 = System.currentTimeMillis();
                    boolean z10 = zi1Var4.C0;
                    if (!z10 && zi1Var4.B0) {
                        zi1Var4.m(!z10);
                        break;
                    }
                }
                break;
            case 4:
                long currentTimeMillis2 = System.currentTimeMillis();
                zi1 zi1Var5 = this.b;
                if (currentTimeMillis2 - zi1Var5.K0 >= 500) {
                    zi1Var5.K0 = System.currentTimeMillis();
                    if (zi1Var5.B0) {
                        zi1Var5.m(!zi1Var5.C0);
                        break;
                    }
                }
                break;
            case 5:
                zi1 zi1Var6 = this.b;
                if (zi1Var6.K.getTag() != null && (sharedInstance = VoIPService.getSharedInstance()) != null) {
                    zi1Var6.B();
                    sharedInstance.toggleSpeakerphoneOrShowRouteSheet(zi1Var6.b, false, Integer.valueOf(sharedInstance.isBluetoothOn() ? 2 : sharedInstance.isSpeakerphoneOn() ? 0 : 1));
                    break;
                }
                break;
            default:
                this.b.p();
                break;
        }
    }
}

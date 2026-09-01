package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.voip.VoIPService;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class nh1 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ ci1 b;

    public /* synthetic */ nh1(ci1 ci1Var, int i10) {
        this.a = i10;
        this.b = ci1Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        VoIPService sharedInstance;
        switch (this.a) {
            case 0:
                if (VoIPService.getSharedInstance() != null) {
                    ci1 ci1Var = this.b;
                    AndroidUtilities.cancelRunOnUIThread(ci1Var.P0);
                    ci1Var.O0 = false;
                    VoIPService.getSharedInstance().hangUp();
                    break;
                }
                break;
            case 1:
                ci1 ci1Var2 = this.b;
                if (ci1Var2.k0 && ci1Var2.j0 && System.currentTimeMillis() - ci1Var2.H0 > 500) {
                    AndroidUtilities.cancelRunOnUIThread(ci1Var2.P0);
                    ci1Var2.O0 = false;
                    ci1Var2.H0 = System.currentTimeMillis();
                    ci1Var2.W.setRelativePosition(ci1Var2.V);
                    ci1Var2.X = true;
                    ci1Var2.E0 = true;
                    ci1Var2.n0 = ci1Var2.m0;
                    ci1Var2.H();
                    break;
                }
                break;
            case 2:
                ci1 ci1Var3 = this.b;
                if (ci1Var3.E0 && System.currentTimeMillis() - ci1Var3.H0 > 500) {
                    AndroidUtilities.cancelRunOnUIThread(ci1Var3.P0);
                    ci1Var3.O0 = false;
                    ci1Var3.H0 = System.currentTimeMillis();
                    ci1Var3.V.setRelativePosition(ci1Var3.W);
                    ci1Var3.X = false;
                    ci1Var3.E0 = false;
                    ci1Var3.n0 = ci1Var3.m0;
                    ci1Var3.H();
                    break;
                }
                break;
            case 3:
                long currentTimeMillis = System.currentTimeMillis();
                ci1 ci1Var4 = this.b;
                if (currentTimeMillis - ci1Var4.H0 >= 500) {
                    ci1Var4.H0 = System.currentTimeMillis();
                    boolean z4 = ci1Var4.z0;
                    if (!z4 && ci1Var4.y0) {
                        ci1Var4.m(!z4);
                        break;
                    }
                }
                break;
            case 4:
                long currentTimeMillis2 = System.currentTimeMillis();
                ci1 ci1Var5 = this.b;
                if (currentTimeMillis2 - ci1Var5.H0 >= 500) {
                    ci1Var5.H0 = System.currentTimeMillis();
                    if (ci1Var5.y0) {
                        ci1Var5.m(!ci1Var5.z0);
                        break;
                    }
                }
                break;
            case 5:
                ci1 ci1Var6 = this.b;
                if (ci1Var6.H.getTag() != null && (sharedInstance = VoIPService.getSharedInstance()) != null) {
                    ci1Var6.B();
                    sharedInstance.toggleSpeakerphoneOrShowRouteSheet(ci1Var6.b, false, Integer.valueOf(sharedInstance.isBluetoothOn() ? 2 : sharedInstance.isSpeakerphoneOn() ? 0 : 1));
                    break;
                }
                break;
            default:
                this.b.p();
                break;
        }
    }
}

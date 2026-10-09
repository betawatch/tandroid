package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.voip.VoIPService;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final /* synthetic */ class gi1 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ wi1 b;

    public /* synthetic */ gi1(wi1 wi1Var, int i10) {
        this.a = i10;
        this.b = wi1Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        VoIPService sharedInstance;
        switch (this.a) {
            case 0:
                if (VoIPService.getSharedInstance() != null) {
                    wi1 wi1Var = this.b;
                    AndroidUtilities.cancelRunOnUIThread(wi1Var.S0);
                    wi1Var.R0 = false;
                    VoIPService.getSharedInstance().hangUp();
                    break;
                }
                break;
            case 1:
                wi1 wi1Var2 = this.b;
                if (wi1Var2.n0 && wi1Var2.m0 && System.currentTimeMillis() - wi1Var2.K0 > 500) {
                    AndroidUtilities.cancelRunOnUIThread(wi1Var2.S0);
                    wi1Var2.R0 = false;
                    wi1Var2.K0 = System.currentTimeMillis();
                    wi1Var2.Z.setRelativePosition(wi1Var2.Y);
                    wi1Var2.a0 = true;
                    wi1Var2.H0 = true;
                    wi1Var2.q0 = wi1Var2.p0;
                    wi1Var2.G();
                    break;
                }
                break;
            case 2:
                wi1 wi1Var3 = this.b;
                if (wi1Var3.H0 && System.currentTimeMillis() - wi1Var3.K0 > 500) {
                    AndroidUtilities.cancelRunOnUIThread(wi1Var3.S0);
                    wi1Var3.R0 = false;
                    wi1Var3.K0 = System.currentTimeMillis();
                    wi1Var3.Y.setRelativePosition(wi1Var3.Z);
                    wi1Var3.a0 = false;
                    wi1Var3.H0 = false;
                    wi1Var3.q0 = wi1Var3.p0;
                    wi1Var3.G();
                    break;
                }
                break;
            case 3:
                long currentTimeMillis = System.currentTimeMillis();
                wi1 wi1Var4 = this.b;
                if (currentTimeMillis - wi1Var4.K0 >= 500) {
                    wi1Var4.K0 = System.currentTimeMillis();
                    boolean z10 = wi1Var4.C0;
                    if (!z10 && wi1Var4.B0) {
                        wi1Var4.l(!z10);
                        break;
                    }
                }
                break;
            case 4:
                long currentTimeMillis2 = System.currentTimeMillis();
                wi1 wi1Var5 = this.b;
                if (currentTimeMillis2 - wi1Var5.K0 >= 500) {
                    wi1Var5.K0 = System.currentTimeMillis();
                    if (wi1Var5.B0) {
                        wi1Var5.l(!wi1Var5.C0);
                        break;
                    }
                }
                break;
            case 5:
                wi1 wi1Var6 = this.b;
                if (wi1Var6.K.getTag() != null && (sharedInstance = VoIPService.getSharedInstance()) != null) {
                    wi1Var6.A();
                    sharedInstance.toggleSpeakerphoneOrShowRouteSheet(wi1Var6.b, false, Integer.valueOf(sharedInstance.isBluetoothOn() ? 2 : sharedInstance.isSpeakerphoneOn() ? 0 : 1));
                    break;
                }
                break;
            default:
                this.b.o();
                break;
        }
    }
}

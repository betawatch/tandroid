package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.voip.VoIPService;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final /* synthetic */ class fi1 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ ui1 b;

    public /* synthetic */ fi1(ui1 ui1Var, int i10) {
        this.a = i10;
        this.b = ui1Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        VoIPService sharedInstance;
        switch (this.a) {
            case 0:
                if (VoIPService.getSharedInstance() != null) {
                    ui1 ui1Var = this.b;
                    AndroidUtilities.cancelRunOnUIThread(ui1Var.S0);
                    ui1Var.R0 = false;
                    VoIPService.getSharedInstance().hangUp();
                    break;
                }
                break;
            case 1:
                ui1 ui1Var2 = this.b;
                if (ui1Var2.n0 && ui1Var2.m0 && System.currentTimeMillis() - ui1Var2.K0 > 500) {
                    AndroidUtilities.cancelRunOnUIThread(ui1Var2.S0);
                    ui1Var2.R0 = false;
                    ui1Var2.K0 = System.currentTimeMillis();
                    ui1Var2.Z.setRelativePosition(ui1Var2.Y);
                    ui1Var2.a0 = true;
                    ui1Var2.H0 = true;
                    ui1Var2.q0 = ui1Var2.p0;
                    ui1Var2.H();
                    break;
                }
                break;
            case 2:
                ui1 ui1Var3 = this.b;
                if (ui1Var3.H0 && System.currentTimeMillis() - ui1Var3.K0 > 500) {
                    AndroidUtilities.cancelRunOnUIThread(ui1Var3.S0);
                    ui1Var3.R0 = false;
                    ui1Var3.K0 = System.currentTimeMillis();
                    ui1Var3.Y.setRelativePosition(ui1Var3.Z);
                    ui1Var3.a0 = false;
                    ui1Var3.H0 = false;
                    ui1Var3.q0 = ui1Var3.p0;
                    ui1Var3.H();
                    break;
                }
                break;
            case 3:
                long currentTimeMillis = System.currentTimeMillis();
                ui1 ui1Var4 = this.b;
                if (currentTimeMillis - ui1Var4.K0 >= 500) {
                    ui1Var4.K0 = System.currentTimeMillis();
                    boolean z10 = ui1Var4.C0;
                    if (!z10 && ui1Var4.B0) {
                        ui1Var4.m(!z10);
                        break;
                    }
                }
                break;
            case 4:
                long currentTimeMillis2 = System.currentTimeMillis();
                ui1 ui1Var5 = this.b;
                if (currentTimeMillis2 - ui1Var5.K0 >= 500) {
                    ui1Var5.K0 = System.currentTimeMillis();
                    if (ui1Var5.B0) {
                        ui1Var5.m(!ui1Var5.C0);
                        break;
                    }
                }
                break;
            case 5:
                ui1 ui1Var6 = this.b;
                if (ui1Var6.K.getTag() != null && (sharedInstance = VoIPService.getSharedInstance()) != null) {
                    ui1Var6.B();
                    sharedInstance.toggleSpeakerphoneOrShowRouteSheet(ui1Var6.b, false, Integer.valueOf(sharedInstance.isBluetoothOn() ? 2 : sharedInstance.isSpeakerphoneOn() ? 0 : 1));
                    break;
                }
                break;
            default:
                this.b.p();
                break;
        }
    }
}

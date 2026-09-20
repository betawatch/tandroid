package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.voip.VoIPService;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public final /* synthetic */ class ei1 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ ti1 b;

    public /* synthetic */ ei1(ti1 ti1Var, int i10) {
        this.a = i10;
        this.b = ti1Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        VoIPService sharedInstance;
        switch (this.a) {
            case 0:
                if (VoIPService.getSharedInstance() != null) {
                    ti1 ti1Var = this.b;
                    AndroidUtilities.cancelRunOnUIThread(ti1Var.S0);
                    ti1Var.R0 = false;
                    VoIPService.getSharedInstance().hangUp();
                    break;
                }
                break;
            case 1:
                ti1 ti1Var2 = this.b;
                if (ti1Var2.n0 && ti1Var2.m0 && System.currentTimeMillis() - ti1Var2.K0 > 500) {
                    AndroidUtilities.cancelRunOnUIThread(ti1Var2.S0);
                    ti1Var2.R0 = false;
                    ti1Var2.K0 = System.currentTimeMillis();
                    ti1Var2.Z.setRelativePosition(ti1Var2.Y);
                    ti1Var2.a0 = true;
                    ti1Var2.H0 = true;
                    ti1Var2.q0 = ti1Var2.p0;
                    ti1Var2.H();
                    break;
                }
                break;
            case 2:
                ti1 ti1Var3 = this.b;
                if (ti1Var3.H0 && System.currentTimeMillis() - ti1Var3.K0 > 500) {
                    AndroidUtilities.cancelRunOnUIThread(ti1Var3.S0);
                    ti1Var3.R0 = false;
                    ti1Var3.K0 = System.currentTimeMillis();
                    ti1Var3.Y.setRelativePosition(ti1Var3.Z);
                    ti1Var3.a0 = false;
                    ti1Var3.H0 = false;
                    ti1Var3.q0 = ti1Var3.p0;
                    ti1Var3.H();
                    break;
                }
                break;
            case 3:
                long currentTimeMillis = System.currentTimeMillis();
                ti1 ti1Var4 = this.b;
                if (currentTimeMillis - ti1Var4.K0 >= 500) {
                    ti1Var4.K0 = System.currentTimeMillis();
                    boolean z10 = ti1Var4.C0;
                    if (!z10 && ti1Var4.B0) {
                        ti1Var4.m(!z10);
                        break;
                    }
                }
                break;
            case 4:
                long currentTimeMillis2 = System.currentTimeMillis();
                ti1 ti1Var5 = this.b;
                if (currentTimeMillis2 - ti1Var5.K0 >= 500) {
                    ti1Var5.K0 = System.currentTimeMillis();
                    if (ti1Var5.B0) {
                        ti1Var5.m(!ti1Var5.C0);
                        break;
                    }
                }
                break;
            case 5:
                ti1 ti1Var6 = this.b;
                if (ti1Var6.K.getTag() != null && (sharedInstance = VoIPService.getSharedInstance()) != null) {
                    ti1Var6.B();
                    sharedInstance.toggleSpeakerphoneOrShowRouteSheet(ti1Var6.b, false, Integer.valueOf(sharedInstance.isBluetoothOn() ? 2 : sharedInstance.isSpeakerphoneOn() ? 0 : 1));
                    break;
                }
                break;
            default:
                this.b.p();
                break;
        }
    }
}

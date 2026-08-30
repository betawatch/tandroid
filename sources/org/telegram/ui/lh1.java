package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.voip.VoIPService;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final /* synthetic */ class lh1 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ ai1 b;

    public /* synthetic */ lh1(ai1 ai1Var, int i10) {
        this.a = i10;
        this.b = ai1Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        VoIPService sharedInstance;
        switch (this.a) {
            case 0:
                if (VoIPService.getSharedInstance() != null) {
                    ai1 ai1Var = this.b;
                    AndroidUtilities.cancelRunOnUIThread(ai1Var.P0);
                    ai1Var.O0 = false;
                    VoIPService.getSharedInstance().hangUp();
                    break;
                }
                break;
            case 1:
                ai1 ai1Var2 = this.b;
                if (ai1Var2.k0 && ai1Var2.j0 && System.currentTimeMillis() - ai1Var2.H0 > 500) {
                    AndroidUtilities.cancelRunOnUIThread(ai1Var2.P0);
                    ai1Var2.O0 = false;
                    ai1Var2.H0 = System.currentTimeMillis();
                    ai1Var2.W.setRelativePosition(ai1Var2.V);
                    ai1Var2.X = true;
                    ai1Var2.E0 = true;
                    ai1Var2.n0 = ai1Var2.m0;
                    ai1Var2.H();
                    break;
                }
                break;
            case 2:
                ai1 ai1Var3 = this.b;
                if (ai1Var3.E0 && System.currentTimeMillis() - ai1Var3.H0 > 500) {
                    AndroidUtilities.cancelRunOnUIThread(ai1Var3.P0);
                    ai1Var3.O0 = false;
                    ai1Var3.H0 = System.currentTimeMillis();
                    ai1Var3.V.setRelativePosition(ai1Var3.W);
                    ai1Var3.X = false;
                    ai1Var3.E0 = false;
                    ai1Var3.n0 = ai1Var3.m0;
                    ai1Var3.H();
                    break;
                }
                break;
            case 3:
                long currentTimeMillis = System.currentTimeMillis();
                ai1 ai1Var4 = this.b;
                if (currentTimeMillis - ai1Var4.H0 >= 500) {
                    ai1Var4.H0 = System.currentTimeMillis();
                    boolean z4 = ai1Var4.z0;
                    if (!z4 && ai1Var4.y0) {
                        ai1Var4.m(!z4);
                        break;
                    }
                }
                break;
            case 4:
                long currentTimeMillis2 = System.currentTimeMillis();
                ai1 ai1Var5 = this.b;
                if (currentTimeMillis2 - ai1Var5.H0 >= 500) {
                    ai1Var5.H0 = System.currentTimeMillis();
                    if (ai1Var5.y0) {
                        ai1Var5.m(!ai1Var5.z0);
                        break;
                    }
                }
                break;
            case 5:
                ai1 ai1Var6 = this.b;
                if (ai1Var6.H.getTag() != null && (sharedInstance = VoIPService.getSharedInstance()) != null) {
                    ai1Var6.B();
                    sharedInstance.toggleSpeakerphoneOrShowRouteSheet(ai1Var6.b, false, Integer.valueOf(sharedInstance.isBluetoothOn() ? 2 : sharedInstance.isSpeakerphoneOn() ? 0 : 1));
                    break;
                }
                break;
            default:
                this.b.p();
                break;
        }
    }
}

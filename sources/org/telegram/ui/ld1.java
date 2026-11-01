package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.voip.VoIPService;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ld1 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ zd1 b;

    public /* synthetic */ ld1(zd1 zd1Var, int i10) {
        this.a = i10;
        this.b = zd1Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        VoIPService sharedInstance;
        switch (this.a) {
            case 0:
                if (VoIPService.getSharedInstance() != null) {
                    zd1 zd1Var = this.b;
                    org.telegram.messenger.i0.r(zd1Var.S0);
                    zd1Var.R0 = false;
                    VoIPService.getSharedInstance().hangUp();
                    break;
                }
                break;
            case 1:
                zd1 zd1Var2 = this.b;
                if (zd1Var2.n0 && zd1Var2.m0 && System.currentTimeMillis() - zd1Var2.K0 > 500) {
                    org.telegram.messenger.i0.r(zd1Var2.S0);
                    zd1Var2.R0 = false;
                    zd1Var2.K0 = System.currentTimeMillis();
                    zd1Var2.Z.setRelativePosition(zd1Var2.Y);
                    zd1Var2.a0 = true;
                    zd1Var2.H0 = true;
                    zd1Var2.q0 = zd1Var2.p0;
                    zd1Var2.G();
                    break;
                }
                break;
            case 2:
                zd1 zd1Var3 = this.b;
                if (zd1Var3.H0 && System.currentTimeMillis() - zd1Var3.K0 > 500) {
                    org.telegram.messenger.i0.r(zd1Var3.S0);
                    zd1Var3.R0 = false;
                    zd1Var3.K0 = System.currentTimeMillis();
                    zd1Var3.Y.setRelativePosition(zd1Var3.Z);
                    zd1Var3.a0 = false;
                    zd1Var3.H0 = false;
                    zd1Var3.q0 = zd1Var3.p0;
                    zd1Var3.G();
                    break;
                }
                break;
            case 3:
                long currentTimeMillis = System.currentTimeMillis();
                zd1 zd1Var4 = this.b;
                if (currentTimeMillis - zd1Var4.K0 >= 500) {
                    zd1Var4.K0 = System.currentTimeMillis();
                    boolean z10 = zd1Var4.C0;
                    if (!z10 && zd1Var4.B0) {
                        zd1Var4.e(!z10);
                        break;
                    }
                }
                break;
            case 4:
                long currentTimeMillis2 = System.currentTimeMillis();
                zd1 zd1Var5 = this.b;
                if (currentTimeMillis2 - zd1Var5.K0 >= 500) {
                    zd1Var5.K0 = System.currentTimeMillis();
                    if (zd1Var5.B0) {
                        zd1Var5.e(!zd1Var5.C0);
                        break;
                    }
                }
                break;
            case 5:
                zd1 zd1Var6 = this.b;
                if (zd1Var6.K.getTag() != null && (sharedInstance = VoIPService.getSharedInstance()) != null) {
                    zd1Var6.A();
                    sharedInstance.toggleSpeakerphoneOrShowRouteSheet(zd1Var6.b, false, Integer.valueOf(sharedInstance.isBluetoothOn() ? 2 : sharedInstance.isSpeakerphoneOn() ? 0 : 1));
                    break;
                }
                break;
            default:
                this.b.j();
                break;
        }
    }
}

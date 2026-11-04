package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.voip.VoIPService;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class lb1 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ zb1 b;

    public /* synthetic */ lb1(zb1 zb1Var, int i3) {
        this.a = i3;
        this.b = zb1Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        VoIPService sharedInstance;
        switch (this.a) {
            case 0:
                if (VoIPService.getSharedInstance() != null) {
                    zb1 zb1Var = this.b;
                    org.telegram.messenger.g0.r(zb1Var.T0);
                    zb1Var.S0 = false;
                    VoIPService.getSharedInstance().hangUp();
                    break;
                }
                break;
            case 1:
                zb1 zb1Var2 = this.b;
                if (zb1Var2.o0 && zb1Var2.n0 && System.currentTimeMillis() - zb1Var2.L0 > 500) {
                    org.telegram.messenger.g0.r(zb1Var2.T0);
                    zb1Var2.S0 = false;
                    zb1Var2.L0 = System.currentTimeMillis();
                    zb1Var2.a0.setRelativePosition(zb1Var2.Z);
                    zb1Var2.b0 = true;
                    zb1Var2.I0 = true;
                    zb1Var2.r0 = zb1Var2.q0;
                    zb1Var2.G();
                    break;
                }
                break;
            case 2:
                zb1 zb1Var3 = this.b;
                if (zb1Var3.I0 && System.currentTimeMillis() - zb1Var3.L0 > 500) {
                    org.telegram.messenger.g0.r(zb1Var3.T0);
                    zb1Var3.S0 = false;
                    zb1Var3.L0 = System.currentTimeMillis();
                    zb1Var3.Z.setRelativePosition(zb1Var3.a0);
                    zb1Var3.b0 = false;
                    zb1Var3.I0 = false;
                    zb1Var3.r0 = zb1Var3.q0;
                    zb1Var3.G();
                    break;
                }
                break;
            case 3:
                long currentTimeMillis = System.currentTimeMillis();
                zb1 zb1Var4 = this.b;
                if (currentTimeMillis - zb1Var4.L0 >= 500) {
                    zb1Var4.L0 = System.currentTimeMillis();
                    boolean z10 = zb1Var4.D0;
                    if (!z10 && zb1Var4.C0) {
                        zb1Var4.e(!z10);
                        break;
                    }
                }
                break;
            case 4:
                long currentTimeMillis2 = System.currentTimeMillis();
                zb1 zb1Var5 = this.b;
                if (currentTimeMillis2 - zb1Var5.L0 >= 500) {
                    zb1Var5.L0 = System.currentTimeMillis();
                    if (zb1Var5.C0) {
                        zb1Var5.e(!zb1Var5.D0);
                        break;
                    }
                }
                break;
            case 5:
                zb1 zb1Var6 = this.b;
                if (zb1Var6.L.getTag() != null && (sharedInstance = VoIPService.getSharedInstance()) != null) {
                    zb1Var6.A();
                    sharedInstance.toggleSpeakerphoneOrShowRouteSheet(zb1Var6.b, false, Integer.valueOf(sharedInstance.isBluetoothOn() ? 2 : sharedInstance.isSpeakerphoneOn() ? 0 : 1));
                    break;
                }
                break;
            default:
                this.b.j();
                break;
        }
    }
}

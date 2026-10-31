package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.voip.VoIPService;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class nd1 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ be1 b;

    public /* synthetic */ nd1(be1 be1Var, int i10) {
        this.a = i10;
        this.b = be1Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        VoIPService sharedInstance;
        switch (this.a) {
            case 0:
                if (VoIPService.getSharedInstance() != null) {
                    be1 be1Var = this.b;
                    org.telegram.messenger.i0.r(be1Var.S0);
                    be1Var.R0 = false;
                    VoIPService.getSharedInstance().hangUp();
                    break;
                }
                break;
            case 1:
                be1 be1Var2 = this.b;
                if (be1Var2.n0 && be1Var2.m0 && System.currentTimeMillis() - be1Var2.K0 > 500) {
                    org.telegram.messenger.i0.r(be1Var2.S0);
                    be1Var2.R0 = false;
                    be1Var2.K0 = System.currentTimeMillis();
                    be1Var2.Z.setRelativePosition(be1Var2.Y);
                    be1Var2.a0 = true;
                    be1Var2.H0 = true;
                    be1Var2.q0 = be1Var2.p0;
                    be1Var2.G();
                    break;
                }
                break;
            case 2:
                be1 be1Var3 = this.b;
                if (be1Var3.H0 && System.currentTimeMillis() - be1Var3.K0 > 500) {
                    org.telegram.messenger.i0.r(be1Var3.S0);
                    be1Var3.R0 = false;
                    be1Var3.K0 = System.currentTimeMillis();
                    be1Var3.Y.setRelativePosition(be1Var3.Z);
                    be1Var3.a0 = false;
                    be1Var3.H0 = false;
                    be1Var3.q0 = be1Var3.p0;
                    be1Var3.G();
                    break;
                }
                break;
            case 3:
                long currentTimeMillis = System.currentTimeMillis();
                be1 be1Var4 = this.b;
                if (currentTimeMillis - be1Var4.K0 >= 500) {
                    be1Var4.K0 = System.currentTimeMillis();
                    boolean z10 = be1Var4.C0;
                    if (!z10 && be1Var4.B0) {
                        be1Var4.e(!z10);
                        break;
                    }
                }
                break;
            case 4:
                long currentTimeMillis2 = System.currentTimeMillis();
                be1 be1Var5 = this.b;
                if (currentTimeMillis2 - be1Var5.K0 >= 500) {
                    be1Var5.K0 = System.currentTimeMillis();
                    if (be1Var5.B0) {
                        be1Var5.e(!be1Var5.C0);
                        break;
                    }
                }
                break;
            case 5:
                be1 be1Var6 = this.b;
                if (be1Var6.K.getTag() != null && (sharedInstance = VoIPService.getSharedInstance()) != null) {
                    be1Var6.A();
                    sharedInstance.toggleSpeakerphoneOrShowRouteSheet(be1Var6.b, false, Integer.valueOf(sharedInstance.isBluetoothOn() ? 2 : sharedInstance.isSpeakerphoneOn() ? 0 : 1));
                    break;
                }
                break;
            default:
                this.b.j();
                break;
        }
    }
}

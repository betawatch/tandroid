package org.telegram.ui;

import org.telegram.messenger.ChannelBoostsController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
/* loaded from: classes3.dex */
public final /* synthetic */ class hc1 implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ rd1 b;

    public /* synthetic */ hc1(rd1 rd1Var, int i10) {
        this.a = i10;
        this.b = rd1Var;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        switch (this.a) {
            case 0:
                rd1 rd1Var = this.b;
                rd1Var.getClass();
                rd1Var.n1 = ((Float) obj).floatValue();
                rd1Var.x0.invalidate();
                rd1Var.V0();
                break;
            case 1:
                rd1 rd1Var2 = this.b;
                rd1Var2.V1 = (TL_stories.TL_premium_boostsStatus) obj;
                rd1Var2.U1 = true;
                rd1Var2.h1(true);
                rd1Var2.T1 = false;
                break;
            default:
                rd1.S(this.b, (ChannelBoostsController.CanApplyBoost) obj);
                break;
        }
    }
}

package org.telegram.ui;

import org.telegram.messenger.ChannelBoostsController;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final /* synthetic */ class db1 implements d5.d {
    public final /* synthetic */ int a;
    public final /* synthetic */ nc1 b;

    public /* synthetic */ db1(nc1 nc1Var, int i10) {
        this.a = i10;
        this.b = nc1Var;
    }

    @Override // d5.d
    public final void accept(Object obj) {
        switch (this.a) {
            case 0:
                nc1 nc1Var = this.b;
                nc1Var.R1 = (TL_stories.TL_premium_boostsStatus) obj;
                nc1Var.Q1 = true;
                nc1Var.h1(true);
                nc1Var.P1 = false;
                break;
            default:
                nc1.X(this.b, (ChannelBoostsController.CanApplyBoost) obj);
                break;
        }
    }
}

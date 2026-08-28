package org.telegram.ui;

import org.telegram.messenger.ChannelBoostsController;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class fb1 implements d5.d {
    public final /* synthetic */ int a;
    public final /* synthetic */ oc1 b;

    public /* synthetic */ fb1(oc1 oc1Var, int i9) {
        this.a = i9;
        this.b = oc1Var;
    }

    @Override // d5.d
    public final void accept(Object obj) {
        switch (this.a) {
            case 0:
                oc1 oc1Var = this.b;
                oc1Var.R1 = (TL_stories.TL_premium_boostsStatus) obj;
                oc1Var.Q1 = true;
                oc1Var.h1(true);
                oc1Var.P1 = false;
                break;
            default:
                oc1.W(this.b, (ChannelBoostsController.CanApplyBoost) obj);
                break;
        }
    }
}

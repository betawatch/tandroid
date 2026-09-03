package org.telegram.ui;

import org.telegram.messenger.ChannelBoostsController;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final /* synthetic */ class bc1 implements h5.d {
    public final /* synthetic */ int a;
    public final /* synthetic */ jd1 b;

    public /* synthetic */ bc1(jd1 jd1Var, int i10) {
        this.a = i10;
        this.b = jd1Var;
    }

    @Override // h5.d
    public final void accept(Object obj) {
        switch (this.a) {
            case 0:
                jd1 jd1Var = this.b;
                jd1Var.S1 = (TL_stories.TL_premium_boostsStatus) obj;
                jd1Var.R1 = true;
                jd1Var.h1(true);
                jd1Var.Q1 = false;
                break;
            default:
                jd1.X(this.b, (ChannelBoostsController.CanApplyBoost) obj);
                break;
        }
    }
}

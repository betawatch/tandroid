package org.telegram.ui;

import org.telegram.messenger.ChannelBoostsController;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ec implements h5.d {
    public final /* synthetic */ int a;
    public final /* synthetic */ bd b;

    public /* synthetic */ ec(bd bdVar, int i10) {
        this.a = i10;
        this.b = bdVar;
    }

    @Override // h5.d
    public final void accept(Object obj) {
        switch (this.a) {
            case 0:
                bd.W(this.b, (ChannelBoostsController.CanApplyBoost) obj);
                break;
            default:
                this.b.W0((TL_stories.TL_premium_boostsStatus) obj);
                break;
        }
    }
}

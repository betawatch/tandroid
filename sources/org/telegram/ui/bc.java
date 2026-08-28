package org.telegram.ui;

import org.telegram.messenger.ChannelBoostsController;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class bc implements d5.d {
    public final /* synthetic */ int a;
    public final /* synthetic */ xc b;

    public /* synthetic */ bc(xc xcVar, int i9) {
        this.a = i9;
        this.b = xcVar;
    }

    @Override // d5.d
    public final void accept(Object obj) {
        switch (this.a) {
            case 0:
                xc.V(this.b, (ChannelBoostsController.CanApplyBoost) obj);
                break;
            default:
                this.b.W0((TL_stories.TL_premium_boostsStatus) obj);
                break;
        }
    }
}

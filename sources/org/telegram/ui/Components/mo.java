package org.telegram.ui.Components;

import org.telegram.messenger.ChannelBoostsController;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class mo implements d5.d {
    public final /* synthetic */ int a;
    public final /* synthetic */ cp b;

    public /* synthetic */ mo(cp cpVar, int i9) {
        this.a = i9;
        this.b = cpVar;
    }

    @Override // d5.d
    public final void accept(Object obj) {
        switch (this.a) {
            case 0:
                cp cpVar = this.b;
                cpVar.b0 = (TL_stories.TL_premium_boostsStatus) obj;
                cpVar.a0 = true;
                cpVar.E(true);
                cpVar.Z = false;
                break;
            default:
                cp.m(this.b, (ChannelBoostsController.CanApplyBoost) obj);
                break;
        }
    }
}

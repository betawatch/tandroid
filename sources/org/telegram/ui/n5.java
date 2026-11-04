package org.telegram.ui;

import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class n5 implements org.telegram.messenger.u10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ v5 b;

    public /* synthetic */ n5(v5 v5Var, int i3) {
        this.a = i3;
        this.b = v5Var;
    }

    @Override // org.telegram.messenger.u10
    public final void a(Object obj) {
        switch (this.a) {
            case 0:
                this.b.V = (org.telegram.messenger.e3) obj;
                break;
            default:
                org.telegram.messenger.g0.h3(new org.telegram.messenger.voip.l0(15, this.b, (TL_stories.TL_premium_boostsStatus) obj));
                break;
        }
    }
}

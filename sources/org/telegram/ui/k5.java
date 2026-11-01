package org.telegram.ui;

import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class k5 implements org.telegram.messenger.r20 {
    public final /* synthetic */ int a;
    public final /* synthetic */ t5 b;

    public /* synthetic */ k5(t5 t5Var, int i10) {
        this.a = i10;
        this.b = t5Var;
    }

    @Override // org.telegram.messenger.r20
    public final void a(Object obj) {
        switch (this.a) {
            case 0:
                this.b.U = (org.telegram.messenger.h3) obj;
                break;
            default:
                org.telegram.messenger.i0.g3(new h0(4, this.b, (TL_stories.TL_premium_boostsStatus) obj));
                break;
        }
    }
}

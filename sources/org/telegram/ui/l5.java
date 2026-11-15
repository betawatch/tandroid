package org.telegram.ui;

import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class l5 implements org.telegram.messenger.z10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ t5 b;

    public /* synthetic */ l5(t5 t5Var, int i7) {
        this.a = i7;
        this.b = t5Var;
    }

    @Override // org.telegram.messenger.z10
    public final void a(Object obj) {
        switch (this.a) {
            case 0:
                this.b.V = (org.telegram.messenger.e3) obj;
                break;
            default:
                org.telegram.messenger.g0.h3(new oi.u4(29, this.b, (TL_stories.TL_premium_boostsStatus) obj));
                break;
        }
    }
}

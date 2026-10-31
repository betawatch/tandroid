package org.telegram.ui;

import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class k5 implements org.telegram.messenger.q20 {
    public final /* synthetic */ int a;
    public final /* synthetic */ t5 b;

    public /* synthetic */ k5(t5 t5Var, int i10) {
        this.a = i10;
        this.b = t5Var;
    }

    @Override // org.telegram.messenger.q20
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

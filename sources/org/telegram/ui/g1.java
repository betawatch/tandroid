package org.telegram.ui;

import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final class g1 extends g.p {
    public final /* synthetic */ k1 c;

    public g1(k1 k1Var) {
        this.c = k1Var;
    }

    @Override // g.p
    public final int i(int i10) {
        k1 k1Var = this.c;
        return ((MessageObject.GroupedMessagePosition) k1Var.v.b.get(k1Var.s.items.get((r1.size() - i10) - 1))).spanSize;
    }
}

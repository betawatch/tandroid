package org.telegram.ui;

import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
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

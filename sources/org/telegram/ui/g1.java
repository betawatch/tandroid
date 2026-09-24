package org.telegram.ui;

import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
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

package org.telegram.ui;

import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class f1 extends g.p {
    public final /* synthetic */ j1 c;

    public f1(j1 j1Var) {
        this.c = j1Var;
    }

    @Override // g.p
    public final int i(int i10) {
        j1 j1Var = this.c;
        return ((MessageObject.GroupedMessagePosition) j1Var.v.b.get(j1Var.s.items.get((r1.size() - i10) - 1))).spanSize;
    }
}

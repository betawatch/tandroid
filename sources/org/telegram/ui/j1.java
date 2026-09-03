package org.telegram.ui;

import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class j1 extends f2.v {
    public final /* synthetic */ n1 c;

    public j1(n1 n1Var) {
        this.c = n1Var;
    }

    @Override // f2.v
    public final int i(int i10) {
        n1 n1Var = this.c;
        return ((MessageObject.GroupedMessagePosition) n1Var.v.b.get(n1Var.s.items.get((r1.size() - i10) - 1))).spanSize;
    }
}

package org.telegram.ui;

import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes3.dex */
public final class i1 extends g.o {
    public final /* synthetic */ m1 c;

    public i1(m1 m1Var) {
        this.c = m1Var;
    }

    @Override // g.o
    public final int i(int i10) {
        m1 m1Var = this.c;
        return ((MessageObject.GroupedMessagePosition) m1Var.v.b.get(m1Var.s.items.get((r1.size() - i10) - 1))).spanSize;
    }
}

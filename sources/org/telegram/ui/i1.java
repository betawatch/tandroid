package org.telegram.ui;

import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
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

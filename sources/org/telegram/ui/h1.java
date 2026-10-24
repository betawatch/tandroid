package org.telegram.ui;

import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final class h1 extends g.o {
    public final /* synthetic */ l1 c;

    public h1(l1 l1Var) {
        this.c = l1Var;
    }

    @Override // g.o
    public final int i(int i10) {
        l1 l1Var = this.c;
        return ((MessageObject.GroupedMessagePosition) l1Var.v.b.get(l1Var.s.items.get((r1.size() - i10) - 1))).spanSize;
    }
}

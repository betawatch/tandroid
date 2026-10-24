package org.telegram.ui;

import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
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

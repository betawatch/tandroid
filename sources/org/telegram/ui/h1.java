package org.telegram.ui;

import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class h1 extends g.p {
    public final /* synthetic */ l1 c;

    public h1(l1 l1Var) {
        this.c = l1Var;
    }

    @Override // g.p
    public final int i(int i10) {
        l1 l1Var = this.c;
        return ((MessageObject.GroupedMessagePosition) l1Var.v.b.get(l1Var.s.items.get((r1.size() - i10) - 1))).spanSize;
    }
}

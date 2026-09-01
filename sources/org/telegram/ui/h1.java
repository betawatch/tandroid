package org.telegram.ui;

import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class h1 extends f2.v {
    public final /* synthetic */ l1 c;

    public h1(l1 l1Var) {
        this.c = l1Var;
    }

    @Override // f2.v
    public final int i(int i10) {
        l1 l1Var = this.c;
        return ((MessageObject.GroupedMessagePosition) l1Var.v.b.get(l1Var.s.items.get((r1.size() - i10) - 1))).spanSize;
    }
}

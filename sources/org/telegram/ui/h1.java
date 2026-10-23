package org.telegram.ui;

import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
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

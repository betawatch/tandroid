package org.telegram.ui;

import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class j1 extends f2.w {
    public final /* synthetic */ n1 c;

    public j1(n1 n1Var) {
        this.c = n1Var;
    }

    @Override // f2.w
    public final int i(int i10) {
        n1 n1Var = this.c;
        return ((MessageObject.GroupedMessagePosition) n1Var.v.b.get(n1Var.s.items.get((r1.size() - i10) - 1))).spanSize;
    }
}

package org.telegram.ui;

import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class f1 extends g.o {
    public final /* synthetic */ j1 c;

    public f1(j1 j1Var) {
        this.c = j1Var;
    }

    @Override // g.o
    public final int i(int i10) {
        j1 j1Var = this.c;
        return ((MessageObject.GroupedMessagePosition) j1Var.v.b.get(j1Var.s.items.get((r1.size() - i10) - 1))).spanSize;
    }
}

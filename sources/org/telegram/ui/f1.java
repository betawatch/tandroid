package org.telegram.ui;

import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes3.dex */
public final class f1 extends g.p {
    public final /* synthetic */ j1 c;

    public f1(j1 j1Var) {
        this.c = j1Var;
    }

    @Override // g.p
    public final int i(int i10) {
        j1 j1Var = this.c;
        return ((MessageObject.GroupedMessagePosition) j1Var.v.b.get(j1Var.s.items.get((r1.size() - i10) - 1))).spanSize;
    }
}

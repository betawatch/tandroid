package org.telegram.ui;

import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class i1 extends f2.x {
    public final /* synthetic */ m1 c;

    public i1(m1 m1Var) {
        this.c = m1Var;
    }

    @Override // f2.x
    public final int i(int i9) {
        m1 m1Var = this.c;
        return ((MessageObject.GroupedMessagePosition) m1Var.v.b.get(m1Var.s.items.get((r1.size() - i9) - 1))).spanSize;
    }
}

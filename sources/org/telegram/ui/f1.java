package org.telegram.ui;

import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
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

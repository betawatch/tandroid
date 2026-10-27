package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class p71 extends vz {
    public final /* synthetic */ s71 X;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p71(s71 s71Var, int i10) {
        super(i10, false);
        this.X = s71Var;
    }

    @Override // s4.c0
    public final int W0(s4.b1 b1Var) {
        return this.X.i3 ? AndroidUtilities.displaySize.y : super.W0(b1Var);
    }
}

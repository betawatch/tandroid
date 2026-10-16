package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class f71 extends zz {
    public final /* synthetic */ i71 X;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f71(i71 i71Var, int i10) {
        super(i10, false);
        this.X = i71Var;
    }

    @Override // s4.b0
    public final int W0(s4.y0 y0Var) {
        return this.X.Y2 ? AndroidUtilities.displaySize.y : super.W0(y0Var);
    }
}

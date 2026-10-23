package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
/* loaded from: classes3.dex */
public final class z61 extends wz {
    public final /* synthetic */ c71 X;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z61(c71 c71Var, int i10) {
        super(i10, false);
        this.X = c71Var;
    }

    @Override // s4.b0
    public final int W0(s4.y0 y0Var) {
        return this.X.Y2 ? AndroidUtilities.displaySize.y : super.W0(y0Var);
    }
}

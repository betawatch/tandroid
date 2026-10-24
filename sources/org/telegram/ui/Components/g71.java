package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final class g71 extends wz {
    public final /* synthetic */ j71 X;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g71(j71 j71Var, int i10) {
        super(i10, false);
        this.X = j71Var;
    }

    @Override // s4.b0
    public final int W0(s4.y0 y0Var) {
        return this.X.b3 ? AndroidUtilities.displaySize.y : super.W0(y0Var);
    }
}

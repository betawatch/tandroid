package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final class f71 extends s4.b0 {
    public final /* synthetic */ j71 I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f71(j71 j71Var, int i10) {
        super(i10, false);
        this.I = j71Var;
    }

    @Override // s4.b0
    public final int W0(s4.y0 y0Var) {
        return this.I.b3 ? AndroidUtilities.displaySize.y : super.W0(y0Var);
    }
}

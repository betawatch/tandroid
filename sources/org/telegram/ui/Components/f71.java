package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
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

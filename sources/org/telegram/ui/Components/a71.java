package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final class a71 extends s4.c0 {
    public final /* synthetic */ e71 I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a71(e71 e71Var, int i10) {
        super(i10, false);
        this.I = e71Var;
    }

    @Override // s4.c0
    public final int W0(s4.z0 z0Var) {
        return this.I.h3 ? AndroidUtilities.displaySize.y : super.W0(z0Var);
    }
}

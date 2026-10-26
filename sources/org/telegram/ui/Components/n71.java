package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class n71 extends s4.c0 {
    public final /* synthetic */ r71 I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n71(r71 r71Var, int i10) {
        super(i10, false);
        this.I = r71Var;
    }

    @Override // s4.c0
    public final int W0(s4.b1 b1Var) {
        return this.I.i3 ? AndroidUtilities.displaySize.y : super.W0(b1Var);
    }
}

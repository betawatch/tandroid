package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.LiteMode;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class ez extends by0 {
    public final /* synthetic */ int H3;
    public final /* synthetic */ fz I3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ez(fz fzVar, Context context, int i10, org.telegram.ui.ActionBar.u6 u6Var, int i11) {
        super(context, i10, u6Var);
        this.I3 = fzVar;
        this.H3 = i11;
    }

    @Override // org.telegram.ui.Components.by0
    public final boolean G1() {
        return LiteMode.isEnabled(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS);
    }

    @Override // org.telegram.ui.Components.by0
    public final void K1(int i10) {
        dx dxVar;
        ux uxVar;
        super.K1(i10);
        fz fzVar = this.I3;
        sz szVar = fzVar.G;
        ez ezVar = fzVar.r;
        boolean z10 = ezVar.getSelectedCategory() == null;
        int i11 = sz.S2;
        szVar.M(z10);
        int i12 = this.H3;
        if (i12 == 1 && (uxVar = szVar.I) != null) {
            uxVar.n(ezVar.getSelectedCategory() == null);
        } else if (i12 == 0 && (dxVar = szVar.B0) != null) {
            dxVar.o0 = ezVar.getSelectedCategory() == null;
            dxVar.invalidate();
        }
        fzVar.g(false);
    }
}

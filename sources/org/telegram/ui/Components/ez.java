package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.LiteMode;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class ez extends cy0 {
    public final /* synthetic */ int H3;
    public final /* synthetic */ fz I3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ez(fz fzVar, Context context, int i10, org.telegram.ui.ActionBar.u6 u6Var, int i11) {
        super(context, i10, u6Var);
        this.I3 = fzVar;
        this.H3 = i11;
    }

    @Override // org.telegram.ui.Components.cy0
    public final boolean G1() {
        return LiteMode.isEnabled(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS);
    }

    @Override // org.telegram.ui.Components.cy0
    public final void K1(int i10) {
        dx dxVar;
        ux uxVar;
        super.K1(i10);
        fz fzVar = this.I3;
        sz szVar = fzVar.G;
        ez ezVar = fzVar.r;
        boolean z10 = ezVar.getSelectedCategory() == null;
        int i11 = sz.U2;
        szVar.N(z10);
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

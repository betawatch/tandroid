package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.LiteMode;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final class xy extends gx0 {
    public final /* synthetic */ yy A3;
    public final /* synthetic */ int z3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xy(yy yyVar, Context context, int i10, org.telegram.ui.ActionBar.d6 d6Var, int i11) {
        super(context, i10, d6Var);
        this.A3 = yyVar;
        this.z3 = i11;
    }

    @Override // org.telegram.ui.Components.gx0
    public final boolean A1() {
        return LiteMode.isEnabled(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS);
    }

    @Override // org.telegram.ui.Components.gx0
    public final void E1(int i10) {
        yw ywVar;
        px pxVar;
        super.E1(i10);
        yy yyVar = this.A3;
        lz lzVar = yyVar.G;
        xy xyVar = yyVar.r;
        boolean z10 = xyVar.getSelectedCategory() == null;
        int i11 = lz.O2;
        lzVar.M(z10);
        int i12 = this.z3;
        if (i12 == 1 && (pxVar = lzVar.I) != null) {
            pxVar.n(xyVar.getSelectedCategory() == null);
        } else if (i12 == 0 && (ywVar = lzVar.B0) != null) {
            ywVar.o0 = xyVar.getSelectedCategory() == null;
            ywVar.invalidate();
        }
        yyVar.g(false);
    }
}

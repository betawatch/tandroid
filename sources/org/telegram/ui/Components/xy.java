package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.LiteMode;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class xy extends xw0 {
    public final /* synthetic */ int w3;
    public final /* synthetic */ yy x3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xy(yy yyVar, Context context, int i10, org.telegram.ui.ActionBar.g6 g6Var, int i11) {
        super(context, i10, g6Var);
        this.x3 = yyVar;
        this.w3 = i11;
    }

    @Override // org.telegram.ui.Components.xw0
    public final void D1(int i10) {
        vw vwVar;
        hw hwVar;
        super.D1(i10);
        yy yyVar = this.x3;
        mz mzVar = yyVar.D;
        xy xyVar = yyVar.r;
        boolean z4 = xyVar.getSelectedCategory() == null;
        int i11 = mz.L2;
        mzVar.O(z4);
        int i12 = this.w3;
        if (i12 == 1 && (hwVar = mzVar.F) != null) {
            hwVar.n(xyVar.getSelectedCategory() == null);
        } else if (i12 == 0 && (vwVar = mzVar.y0) != null) {
            vwVar.l0 = xyVar.getSelectedCategory() == null;
            vwVar.invalidate();
        }
        yyVar.g(false);
    }

    @Override // org.telegram.ui.Components.xw0
    public final boolean z1() {
        return LiteMode.isEnabled(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS);
    }
}

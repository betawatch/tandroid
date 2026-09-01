package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.LiteMode;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class xy extends yw0 {
    public final /* synthetic */ int w3;
    public final /* synthetic */ yy x3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xy(yy yyVar, Context context, int i10, org.telegram.ui.ActionBar.g6 g6Var, int i11) {
        super(context, i10, g6Var);
        this.x3 = yyVar;
        this.w3 = i11;
    }

    @Override // org.telegram.ui.Components.yw0
    public final boolean A1() {
        return LiteMode.isEnabled(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS);
    }

    @Override // org.telegram.ui.Components.yw0
    public final void E1(int i10) {
        vw vwVar;
        hw hwVar;
        super.E1(i10);
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
}

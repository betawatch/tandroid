package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.LiteMode;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class xy extends vw0 {
    public final /* synthetic */ yy A3;
    public final /* synthetic */ int z3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xy(yy yyVar, Context context, int i10, org.telegram.ui.ActionBar.d6 d6Var, int i11) {
        super(context, i10, d6Var);
        this.A3 = yyVar;
        this.z3 = i11;
    }

    @Override // org.telegram.ui.Components.vw0
    public final boolean A1() {
        return LiteMode.isEnabled(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS);
    }

    @Override // org.telegram.ui.Components.vw0
    public final void E1(int i10) {
        xw xwVar;
        ox oxVar;
        super.E1(i10);
        yy yyVar = this.A3;
        lz lzVar = yyVar.G;
        xy xyVar = yyVar.r;
        boolean z10 = xyVar.getSelectedCategory() == null;
        int i11 = lz.O2;
        lzVar.M(z10);
        int i12 = this.z3;
        if (i12 == 1 && (oxVar = lzVar.I) != null) {
            oxVar.n(xyVar.getSelectedCategory() == null);
        } else if (i12 == 0 && (xwVar = lzVar.B0) != null) {
            xwVar.o0 = xyVar.getSelectedCategory() == null;
            xwVar.invalidate();
        }
        yyVar.g(false);
    }
}

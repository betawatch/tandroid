package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.LiteMode;

/* compiled from: r8-map-id-c7458e893fd6f3e0a6fbf27724068aa00f1caa233b10a33d542967499303009b */
/* loaded from: classes3.dex */
public final class yy extends ix0 {
    public final /* synthetic */ zy A3;
    public final /* synthetic */ int z3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yy(zy zyVar, Context context, int i10, org.telegram.ui.ActionBar.d6 d6Var, int i11) {
        super(context, i10, d6Var);
        this.A3 = zyVar;
        this.z3 = i11;
    }

    @Override // org.telegram.ui.Components.ix0
    public final boolean A1() {
        return LiteMode.isEnabled(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS);
    }

    @Override // org.telegram.ui.Components.ix0
    public final void E1(int i10) {
        zw zwVar;
        qx qxVar;
        super.E1(i10);
        zy zyVar = this.A3;
        mz mzVar = zyVar.G;
        yy yyVar = zyVar.r;
        boolean z10 = yyVar.getSelectedCategory() == null;
        int i11 = mz.O2;
        mzVar.M(z10);
        int i12 = this.z3;
        if (i12 == 1 && (qxVar = mzVar.I) != null) {
            qxVar.n(yyVar.getSelectedCategory() == null);
        } else if (i12 == 0 && (zwVar = mzVar.B0) != null) {
            zwVar.o0 = yyVar.getSelectedCategory() == null;
            zwVar.invalidate();
        }
        zyVar.g(false);
    }
}

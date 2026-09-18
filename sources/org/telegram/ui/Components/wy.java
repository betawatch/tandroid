package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.LiteMode;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
/* loaded from: classes3.dex */
public final class wy extends ix0 {
    public final /* synthetic */ xy A3;
    public final /* synthetic */ int z3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wy(xy xyVar, Context context, int i10, org.telegram.ui.ActionBar.e6 e6Var, int i11) {
        super(context, i10, e6Var);
        this.A3 = xyVar;
        this.z3 = i11;
    }

    @Override // org.telegram.ui.Components.ix0
    public final boolean B1() {
        return LiteMode.isEnabled(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS);
    }

    @Override // org.telegram.ui.Components.ix0
    public final void F1(int i10) {
        xw xwVar;
        ox oxVar;
        super.F1(i10);
        xy xyVar = this.A3;
        kz kzVar = xyVar.G;
        wy wyVar = xyVar.r;
        boolean z10 = wyVar.getSelectedCategory() == null;
        int i11 = kz.O2;
        kzVar.M(z10);
        int i12 = this.z3;
        if (i12 == 1 && (oxVar = kzVar.I) != null) {
            oxVar.n(wyVar.getSelectedCategory() == null);
        } else if (i12 == 0 && (xwVar = kzVar.B0) != null) {
            xwVar.o0 = wyVar.getSelectedCategory() == null;
            xwVar.invalidate();
        }
        xyVar.g(false);
    }
}

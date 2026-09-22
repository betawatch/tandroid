package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.LiteMode;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class wy extends ww0 {
    public final /* synthetic */ xy A3;
    public final /* synthetic */ int z3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wy(xy xyVar, Context context, int i10, org.telegram.ui.ActionBar.e6 e6Var, int i11) {
        super(context, i10, e6Var);
        this.A3 = xyVar;
        this.z3 = i11;
    }

    @Override // org.telegram.ui.Components.ww0
    public final boolean A1() {
        return LiteMode.isEnabled(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS);
    }

    @Override // org.telegram.ui.Components.ww0
    public final void E1(int i10) {
        ww wwVar;
        nx nxVar;
        super.E1(i10);
        xy xyVar = this.A3;
        kz kzVar = xyVar.G;
        wy wyVar = xyVar.r;
        boolean z10 = wyVar.getSelectedCategory() == null;
        int i11 = kz.O2;
        kzVar.M(z10);
        int i12 = this.z3;
        if (i12 == 1 && (nxVar = kzVar.I) != null) {
            nxVar.n(wyVar.getSelectedCategory() == null);
        } else if (i12 == 0 && (wwVar = kzVar.B0) != null) {
            wwVar.o0 = wyVar.getSelectedCategory() == null;
            wwVar.invalidate();
        }
        xyVar.g(false);
    }
}

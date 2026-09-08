package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.LiteMode;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class wy extends vw0 {
    public final /* synthetic */ xy A3;
    public final /* synthetic */ int z3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wy(xy xyVar, Context context, int i10, org.telegram.ui.ActionBar.f6 f6Var, int i11) {
        super(context, i10, f6Var);
        this.A3 = xyVar;
        this.z3 = i11;
    }

    @Override // org.telegram.ui.Components.vw0
    public final void D1(int i10) {
        xw xwVar;
        jw jwVar;
        super.D1(i10);
        xy xyVar = this.A3;
        kz kzVar = xyVar.G;
        wy wyVar = xyVar.r;
        boolean z10 = wyVar.getSelectedCategory() == null;
        int i11 = kz.O2;
        kzVar.O(z10);
        int i12 = this.z3;
        if (i12 == 1 && (jwVar = kzVar.I) != null) {
            jwVar.n(wyVar.getSelectedCategory() == null);
        } else if (i12 == 0 && (xwVar = kzVar.B0) != null) {
            xwVar.o0 = wyVar.getSelectedCategory() == null;
            xwVar.invalidate();
        }
        xyVar.g(false);
    }

    @Override // org.telegram.ui.Components.vw0
    public final boolean z1() {
        return LiteMode.isEnabled(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS);
    }
}

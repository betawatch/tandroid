package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.LiteMode;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public final class wy extends hx0 {
    public final /* synthetic */ xy A3;
    public final /* synthetic */ int z3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wy(xy xyVar, Context context, int i10, org.telegram.ui.ActionBar.f6 f6Var, int i11) {
        super(context, i10, f6Var);
        this.A3 = xyVar;
        this.z3 = i11;
    }

    @Override // org.telegram.ui.Components.hx0
    public final boolean B1() {
        return LiteMode.isEnabled(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS);
    }

    @Override // org.telegram.ui.Components.hx0
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

package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.LiteMode;

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
/* loaded from: classes3.dex */
public final class zy extends rx0 {
    public final /* synthetic */ int G3;
    public final /* synthetic */ az H3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zy(az azVar, Context context, int i10, org.telegram.ui.ActionBar.d6 d6Var, int i11) {
        super(context, i10, d6Var);
        this.H3 = azVar;
        this.G3 = i11;
    }

    @Override // org.telegram.ui.Components.rx0
    public final boolean C1() {
        return LiteMode.isEnabled(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS);
    }

    @Override // org.telegram.ui.Components.rx0
    public final void G1(int i10) {
        ax axVar;
        rx rxVar;
        super.G1(i10);
        az azVar = this.H3;
        nz nzVar = azVar.G;
        zy zyVar = azVar.r;
        boolean z10 = zyVar.getSelectedCategory() == null;
        int i11 = nz.M2;
        nzVar.K(z10);
        int i12 = this.G3;
        if (i12 == 1 && (rxVar = nzVar.I) != null) {
            rxVar.n(zyVar.getSelectedCategory() == null);
        } else if (i12 == 0 && (axVar = nzVar.B0) != null) {
            axVar.o0 = zyVar.getSelectedCategory() == null;
            axVar.invalidate();
        }
        azVar.g(false);
    }
}

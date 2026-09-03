package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.LiteMode;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class vy extends xw0 {
    public final /* synthetic */ int w3;
    public final /* synthetic */ wy x3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vy(wy wyVar, Context context, int i10, org.telegram.ui.ActionBar.f6 f6Var, int i11) {
        super(context, i10, f6Var);
        this.x3 = wyVar;
        this.w3 = i11;
    }

    @Override // org.telegram.ui.Components.xw0
    public final void D1(int i10) {
        tw twVar;
        fw fwVar;
        super.D1(i10);
        wy wyVar = this.x3;
        kz kzVar = wyVar.D;
        vy vyVar = wyVar.r;
        boolean z4 = vyVar.getSelectedCategory() == null;
        int i11 = kz.L2;
        kzVar.O(z4);
        int i12 = this.w3;
        if (i12 == 1 && (fwVar = kzVar.F) != null) {
            fwVar.n(vyVar.getSelectedCategory() == null);
        } else if (i12 == 0 && (twVar = kzVar.y0) != null) {
            twVar.l0 = vyVar.getSelectedCategory() == null;
            twVar.invalidate();
        }
        wyVar.g(false);
    }

    @Override // org.telegram.ui.Components.xw0
    public final boolean z1() {
        return LiteMode.isEnabled(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS);
    }
}

package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.LiteMode;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final class fz extends ux0 {
    public final /* synthetic */ int A3;
    public final /* synthetic */ gz B3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fz(gz gzVar, Context context, int i10, org.telegram.ui.ActionBar.g6 g6Var, int i11) {
        super(context, i10, g6Var);
        this.B3 = gzVar;
        this.A3 = i11;
    }

    @Override // org.telegram.ui.Components.ux0
    public final boolean G1() {
        return LiteMode.isEnabled(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS);
    }

    @Override // org.telegram.ui.Components.ux0
    public final void K1(int i10) {
        ex exVar;
        vx vxVar;
        super.K1(i10);
        gz gzVar = this.B3;
        tz tzVar = gzVar.G;
        fz fzVar = gzVar.r;
        boolean z10 = fzVar.getSelectedCategory() == null;
        int i11 = tz.U2;
        tzVar.M(z10);
        int i12 = this.A3;
        if (i12 == 1 && (vxVar = tzVar.I) != null) {
            vxVar.n(fzVar.getSelectedCategory() == null);
        } else if (i12 == 0 && (exVar = tzVar.B0) != null) {
            exVar.o0 = fzVar.getSelectedCategory() == null;
            exVar.invalidate();
        }
        gzVar.g(false);
    }
}

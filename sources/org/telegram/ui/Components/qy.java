package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.LiteMode;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class qy extends ow0 {
    public final /* synthetic */ int v3;
    public final /* synthetic */ ry w3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qy(ry ryVar, Context context, int i10, org.telegram.ui.ActionBar.c6 c6Var, int i11) {
        super(context, i10, c6Var);
        this.w3 = ryVar;
        this.v3 = i11;
    }

    @Override // org.telegram.ui.Components.ow0
    public final boolean A1() {
        return LiteMode.isEnabled(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS);
    }

    @Override // org.telegram.ui.Components.ow0
    public final void E1(int i10) {
        pw pwVar;
        bw bwVar;
        super.E1(i10);
        ry ryVar = this.w3;
        fz fzVar = ryVar.C;
        qy qyVar = ryVar.r;
        boolean z10 = qyVar.getSelectedCategory() == null;
        int i11 = fz.K2;
        fzVar.O(z10);
        int i12 = this.v3;
        if (i12 == 1 && (bwVar = fzVar.E) != null) {
            bwVar.n(qyVar.getSelectedCategory() == null);
        } else if (i12 == 0 && (pwVar = fzVar.x0) != null) {
            pwVar.k0 = qyVar.getSelectedCategory() == null;
            pwVar.invalidate();
        }
        ryVar.g(false);
    }
}

package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.LiteMode;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
/* loaded from: classes3.dex */
public final class fz extends rx0 {
    public final /* synthetic */ int x3;
    public final /* synthetic */ gz y3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fz(gz gzVar, Context context, int i10, org.telegram.ui.ActionBar.d6 d6Var, int i11) {
        super(context, i10, d6Var);
        this.y3 = gzVar;
        this.x3 = i11;
    }

    @Override // org.telegram.ui.Components.rx0
    public final boolean B1() {
        return LiteMode.isEnabled(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS);
    }

    @Override // org.telegram.ui.Components.rx0
    public final void F1(int i10) {
        ex exVar;
        vx vxVar;
        super.F1(i10);
        gz gzVar = this.y3;
        tz tzVar = gzVar.G;
        fz fzVar = gzVar.r;
        boolean z10 = fzVar.getSelectedCategory() == null;
        int i11 = tz.O2;
        tzVar.M(z10);
        int i12 = this.x3;
        if (i12 == 1 && (vxVar = tzVar.I) != null) {
            vxVar.n(fzVar.getSelectedCategory() == null);
        } else if (i12 == 0 && (exVar = tzVar.B0) != null) {
            exVar.o0 = fzVar.getSelectedCategory() == null;
            exVar.invalidate();
        }
        gzVar.g(false);
    }
}

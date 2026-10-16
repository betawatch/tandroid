package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.LiteMode;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class hz extends ux0 {
    public final /* synthetic */ int x3;
    public final /* synthetic */ iz y3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hz(iz izVar, Context context, int i10, org.telegram.ui.ActionBar.c6 c6Var, int i11) {
        super(context, i10, c6Var);
        this.y3 = izVar;
        this.x3 = i11;
    }

    @Override // org.telegram.ui.Components.ux0
    public final boolean B1() {
        return LiteMode.isEnabled(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS);
    }

    @Override // org.telegram.ui.Components.ux0
    public final void F1(int i10) {
        ix ixVar;
        zx zxVar;
        super.F1(i10);
        iz izVar = this.y3;
        wz wzVar = izVar.G;
        hz hzVar = izVar.r;
        boolean z10 = hzVar.getSelectedCategory() == null;
        int i11 = wz.O2;
        wzVar.M(z10);
        int i12 = this.x3;
        if (i12 == 1 && (zxVar = wzVar.I) != null) {
            zxVar.n(hzVar.getSelectedCategory() == null);
        } else if (i12 == 0 && (ixVar = wzVar.B0) != null) {
            ixVar.o0 = hzVar.getSelectedCategory() == null;
            ixVar.invalidate();
        }
        izVar.g(false);
    }
}

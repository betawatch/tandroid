package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.LiteMode;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class jy extends gw0 {
    public final /* synthetic */ int v3;
    public final /* synthetic */ ky w3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jy(ky kyVar, Context context, int i10, org.telegram.ui.ActionBar.c6 c6Var, int i11) {
        super(context, i10, c6Var);
        this.w3 = kyVar;
        this.v3 = i11;
    }

    @Override // org.telegram.ui.Components.gw0
    public final boolean A1() {
        return LiteMode.isEnabled(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS);
    }

    @Override // org.telegram.ui.Components.gw0
    public final void E1(int i10) {
        iw iwVar;
        uv uvVar;
        super.E1(i10);
        ky kyVar = this.w3;
        yy yyVar = kyVar.C;
        jy jyVar = kyVar.r;
        boolean z10 = jyVar.getSelectedCategory() == null;
        int i11 = yy.K2;
        yyVar.O(z10);
        int i12 = this.v3;
        if (i12 == 1 && (uvVar = yyVar.E) != null) {
            uvVar.n(jyVar.getSelectedCategory() == null);
        } else if (i12 == 0 && (iwVar = yyVar.x0) != null) {
            iwVar.k0 = jyVar.getSelectedCategory() == null;
            iwVar.invalidate();
        }
        kyVar.g(false);
    }
}

package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.LiteMode;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class iy extends ew0 {
    public final /* synthetic */ int v3;
    public final /* synthetic */ jy w3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iy(jy jyVar, Context context, int i9, org.telegram.ui.ActionBar.b6 b6Var, int i10) {
        super(context, i9, b6Var);
        this.w3 = jyVar;
        this.v3 = i10;
    }

    @Override // org.telegram.ui.Components.ew0
    public final boolean A1() {
        return LiteMode.isEnabled(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS);
    }

    @Override // org.telegram.ui.Components.ew0
    public final void E1(int i9) {
        jw jwVar;
        vv vvVar;
        super.E1(i9);
        jy jyVar = this.w3;
        wy wyVar = jyVar.C;
        iy iyVar = jyVar.r;
        boolean z10 = iyVar.getSelectedCategory() == null;
        int i10 = wy.K2;
        wyVar.N(z10);
        int i11 = this.v3;
        if (i11 == 1 && (vvVar = wyVar.E) != null) {
            vvVar.n(iyVar.getSelectedCategory() == null);
        } else if (i11 == 0 && (jwVar = wyVar.x0) != null) {
            jwVar.k0 = iyVar.getSelectedCategory() == null;
            jwVar.invalidate();
        }
        jyVar.g(false);
    }
}

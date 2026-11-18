package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class dy extends iv0 {
    public final /* synthetic */ int H3;
    public final /* synthetic */ ey I3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dy(ey eyVar, Context context, int i7, org.telegram.ui.ActionBar.i6 i6Var, int i10) {
        super(i7, context, i6Var);
        this.I3 = eyVar;
        this.H3 = i10;
    }

    @Override // org.telegram.ui.Components.iv0
    public final boolean D1() {
        return org.telegram.messenger.pc.e(8200);
    }

    @Override // org.telegram.ui.Components.iv0
    public final void H1(int i7) {
        fw fwVar;
        ww wwVar;
        super.H1(i7);
        ey eyVar = this.I3;
        ry ryVar = eyVar.H;
        dy dyVar = eyVar.r;
        boolean z10 = dyVar.getSelectedCategory() == null;
        int i10 = ry.V2;
        ryVar.N(z10);
        int i11 = this.H3;
        if (i11 == 1 && (wwVar = ryVar.J) != null) {
            wwVar.n(dyVar.getSelectedCategory() == null);
        } else if (i11 == 0 && (fwVar = ryVar.C0) != null) {
            fwVar.p0 = dyVar.getSelectedCategory() == null;
            fwVar.invalidate();
        }
        eyVar.g(false);
    }
}

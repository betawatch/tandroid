package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.LiteMode;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class dz extends hx0 {
    public final /* synthetic */ ez A3;
    public final /* synthetic */ int z3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dz(ez ezVar, Context context, int i10, org.telegram.ui.ActionBar.f6 f6Var, int i11) {
        super(context, i10, f6Var);
        this.A3 = ezVar;
        this.z3 = i11;
    }

    @Override // org.telegram.ui.Components.hx0
    public final void D1(int i10) {
        cx cxVar;
        ow owVar;
        super.D1(i10);
        ez ezVar = this.A3;
        rz rzVar = ezVar.G;
        dz dzVar = ezVar.r;
        boolean z10 = dzVar.getSelectedCategory() == null;
        int i11 = rz.O2;
        rzVar.O(z10);
        int i12 = this.z3;
        if (i12 == 1 && (owVar = rzVar.I) != null) {
            owVar.n(dzVar.getSelectedCategory() == null);
        } else if (i12 == 0 && (cxVar = rzVar.B0) != null) {
            cxVar.o0 = dzVar.getSelectedCategory() == null;
            cxVar.invalidate();
        }
        ezVar.g(false);
    }

    @Override // org.telegram.ui.Components.hx0
    public final boolean z1() {
        return LiteMode.isEnabled(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS);
    }
}

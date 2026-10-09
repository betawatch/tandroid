package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.LiteMode;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class lz extends yx0 {
    public final /* synthetic */ int x3;
    public final /* synthetic */ mz y3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lz(mz mzVar, Context context, int i10, org.telegram.ui.ActionBar.e6 e6Var, int i11) {
        super(context, i10, e6Var);
        this.y3 = mzVar;
        this.x3 = i11;
    }

    @Override // org.telegram.ui.Components.yx0
    public final boolean B1() {
        return LiteMode.isEnabled(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS);
    }

    @Override // org.telegram.ui.Components.yx0
    public final void F1(int i10) {
        mx mxVar;
        ey eyVar;
        super.F1(i10);
        mz mzVar = this.y3;
        a00 a00Var = mzVar.G;
        lz lzVar = mzVar.r;
        boolean z10 = lzVar.getSelectedCategory() == null;
        int i11 = a00.O2;
        a00Var.M(z10);
        int i12 = this.x3;
        if (i12 == 1 && (eyVar = a00Var.I) != null) {
            eyVar.n(lzVar.getSelectedCategory() == null);
        } else if (i12 == 0 && (mxVar = a00Var.B0) != null) {
            mxVar.o0 = lzVar.getSelectedCategory() == null;
            mxVar.invalidate();
        }
        mzVar.g(false);
    }
}

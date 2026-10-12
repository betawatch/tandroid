package org.telegram.ui;

import android.content.Context;
import org.telegram.ui.Components.FragmentContextView;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class mk extends FragmentContextView {
    public final /* synthetic */ int R0;
    public final /* synthetic */ fo S0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mk(fo foVar, Context context, fo foVar2, org.telegram.ui.ActionBar.c6 c6Var, int i10) {
        super(context, foVar2, null, true, c6Var);
        this.R0 = i10;
        switch (i10) {
            case 1:
                this.S0 = foVar;
                super(context, foVar2, null, false, c6Var);
                break;
            default:
                this.S0 = foVar;
                break;
        }
    }

    @Override // org.telegram.ui.Components.FragmentContextView, android.view.View
    public final void setVisibility(int i10) {
        switch (this.R0) {
            case 0:
                fo foVar = this.S0;
                foVar.M0.i(foVar.a2, i10 == 0, true);
                break;
            default:
                fo foVar2 = this.S0;
                foVar2.M0.i(foVar2.Y1, i10 == 0, true);
                break;
        }
    }
}

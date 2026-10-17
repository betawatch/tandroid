package org.telegram.ui;

import android.content.Context;
import org.telegram.ui.Components.FragmentContextView;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes3.dex */
public final class bk extends FragmentContextView {
    public final /* synthetic */ int R0;
    public final /* synthetic */ sn S0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bk(sn snVar, Context context, sn snVar2, org.telegram.ui.ActionBar.d6 d6Var, int i10) {
        super(context, snVar2, null, true, d6Var);
        this.R0 = i10;
        switch (i10) {
            case 1:
                this.S0 = snVar;
                super(context, snVar2, null, false, d6Var);
                break;
            default:
                this.S0 = snVar;
                break;
        }
    }

    @Override // org.telegram.ui.Components.FragmentContextView, android.view.View
    public final void setVisibility(int i10) {
        switch (this.R0) {
            case 0:
                sn snVar = this.S0;
                snVar.M0.i(snVar.a2, i10 == 0, true);
                break;
            default:
                sn snVar2 = this.S0;
                snVar2.M0.i(snVar2.Y1, i10 == 0, true);
                break;
        }
    }
}

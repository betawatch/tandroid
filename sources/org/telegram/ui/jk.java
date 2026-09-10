package org.telegram.ui;

import android.content.Context;
import org.telegram.ui.Components.FragmentContextView;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class jk extends FragmentContextView {
    public final /* synthetic */ int N0;
    public final /* synthetic */ eo O0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jk(eo eoVar, Context context, eo eoVar2, org.telegram.ui.ActionBar.f6 f6Var, int i10) {
        super(context, eoVar2, null, true, f6Var);
        this.N0 = i10;
        switch (i10) {
            case 1:
                this.O0 = eoVar;
                super(context, eoVar2, null, false, f6Var);
                break;
            default:
                this.O0 = eoVar;
                break;
        }
    }

    @Override // org.telegram.ui.Components.FragmentContextView, android.view.View
    public final void setVisibility(int i10) {
        switch (this.N0) {
            case 0:
                eo eoVar = this.O0;
                eoVar.M0.i(eoVar.a2, i10 == 0, true);
                break;
            default:
                eo eoVar2 = this.O0;
                eoVar2.M0.i(eoVar2.Y1, i10 == 0, true);
                break;
        }
    }
}

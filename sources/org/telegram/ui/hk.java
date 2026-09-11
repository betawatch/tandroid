package org.telegram.ui;

import android.content.Context;
import org.telegram.ui.Components.FragmentContextView;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes3.dex */
public final class hk extends FragmentContextView {
    public final /* synthetic */ int N0;
    public final /* synthetic */ co O0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hk(co coVar, Context context, co coVar2, org.telegram.ui.ActionBar.f6 f6Var, int i10) {
        super(context, coVar2, null, true, f6Var);
        this.N0 = i10;
        switch (i10) {
            case 1:
                this.O0 = coVar;
                super(context, coVar2, null, false, f6Var);
                break;
            default:
                this.O0 = coVar;
                break;
        }
    }

    @Override // org.telegram.ui.Components.FragmentContextView, android.view.View
    public final void setVisibility(int i10) {
        switch (this.N0) {
            case 0:
                co coVar = this.O0;
                coVar.M0.i(coVar.a2, i10 == 0, true);
                break;
            default:
                co coVar2 = this.O0;
                coVar2.M0.i(coVar2.Y1, i10 == 0, true);
                break;
        }
    }
}

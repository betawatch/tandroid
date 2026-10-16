package org.telegram.ui;

import android.content.Context;
import org.telegram.ui.Components.FragmentContextView;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class hx extends FragmentContextView {
    public final /* synthetic */ int R0;
    public final /* synthetic */ yy S0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hx(yy yyVar, Context context, yy yyVar2, int i10) {
        super(context, yyVar2, true);
        this.R0 = i10;
        switch (i10) {
            case 1:
                this.S0 = yyVar;
                super(context, yyVar2, false);
                break;
            default:
                this.S0 = yyVar;
                break;
        }
    }

    @Override // org.telegram.ui.Components.FragmentContextView, android.view.View
    public final void setVisibility(int i10) {
        switch (this.R0) {
            case 0:
                yy yyVar = this.S0;
                yyVar.J1.i(yyVar.G1, i10 == 0, true);
                break;
            default:
                yy yyVar2 = this.S0;
                yyVar2.J1.i(yyVar2.I1, i10 == 0, true);
                break;
        }
    }
}

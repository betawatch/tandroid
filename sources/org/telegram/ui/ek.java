package org.telegram.ui;

import android.content.Context;
import org.telegram.ui.Components.FragmentContextView;

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
/* loaded from: classes3.dex */
public final class ek extends FragmentContextView {
    public final /* synthetic */ int P0;
    public final /* synthetic */ wn Q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ek(wn wnVar, Context context, wn wnVar2, org.telegram.ui.ActionBar.d6 d6Var, int i10) {
        super(context, wnVar2, null, true, d6Var);
        this.P0 = i10;
        switch (i10) {
            case 1:
                this.Q0 = wnVar;
                super(context, wnVar2, null, false, d6Var);
                break;
            default:
                this.Q0 = wnVar;
                break;
        }
    }

    @Override // org.telegram.ui.Components.FragmentContextView, android.view.View
    public final void setVisibility(int i10) {
        switch (this.P0) {
            case 0:
                wn wnVar = this.Q0;
                wnVar.M0.i(wnVar.a2, i10 == 0, true);
                break;
            default:
                wn wnVar2 = this.Q0;
                wnVar2.M0.i(wnVar2.Y1, i10 == 0, true);
                break;
        }
    }
}

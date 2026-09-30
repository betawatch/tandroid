package org.telegram.ui;

import android.content.Context;
import org.telegram.ui.Components.FragmentContextView;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
/* loaded from: classes3.dex */
public final class ek extends FragmentContextView {
    public final /* synthetic */ int Q0;
    public final /* synthetic */ wn R0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ek(wn wnVar, Context context, wn wnVar2, org.telegram.ui.ActionBar.d6 d6Var, int i10) {
        super(context, wnVar2, null, true, d6Var);
        this.Q0 = i10;
        switch (i10) {
            case 1:
                this.R0 = wnVar;
                super(context, wnVar2, null, false, d6Var);
                break;
            default:
                this.R0 = wnVar;
                break;
        }
    }

    @Override // org.telegram.ui.Components.FragmentContextView, android.view.View
    public final void setVisibility(int i10) {
        switch (this.Q0) {
            case 0:
                wn wnVar = this.R0;
                wnVar.M0.i(wnVar.a2, i10 == 0, true);
                break;
            default:
                wn wnVar2 = this.R0;
                wnVar2.M0.i(wnVar2.Y1, i10 == 0, true);
                break;
        }
    }
}

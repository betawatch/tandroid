package org.telegram.ui;

import android.content.Context;
import org.telegram.ui.Components.FragmentContextView;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class dk extends FragmentContextView {
    public final /* synthetic */ int X0;
    public final /* synthetic */ wn Y0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dk(wn wnVar, Context context, wn wnVar2, org.telegram.ui.ActionBar.u6 u6Var, int i10) {
        super(context, wnVar2, null, true, u6Var);
        this.X0 = i10;
        switch (i10) {
            case 1:
                this.Y0 = wnVar;
                super(context, wnVar2, null, false, u6Var);
                break;
            default:
                this.Y0 = wnVar;
                break;
        }
    }

    @Override // org.telegram.ui.Components.FragmentContextView, android.view.View
    public final void setVisibility(int i10) {
        switch (this.X0) {
            case 0:
                wn wnVar = this.Y0;
                wnVar.Y0.i(wnVar.m2, i10 == 0, true);
                break;
            default:
                wn wnVar2 = this.Y0;
                wnVar2.Y0.i(wnVar2.k2, i10 == 0, true);
                break;
        }
    }
}

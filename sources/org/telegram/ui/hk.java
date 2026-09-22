package org.telegram.ui;

import android.content.Context;
import org.telegram.ui.Components.FragmentContextView;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final class hk extends FragmentContextView {
    public final /* synthetic */ int P0;
    public final /* synthetic */ zn Q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hk(zn znVar, Context context, zn znVar2, org.telegram.ui.ActionBar.f6 f6Var, int i10) {
        super(context, znVar2, null, true, f6Var);
        this.P0 = i10;
        switch (i10) {
            case 1:
                this.Q0 = znVar;
                super(context, znVar2, null, false, f6Var);
                break;
            default:
                this.Q0 = znVar;
                break;
        }
    }

    @Override // org.telegram.ui.Components.FragmentContextView, android.view.View
    public final void setVisibility(int i10) {
        switch (this.P0) {
            case 0:
                zn znVar = this.Q0;
                znVar.M0.i(znVar.a2, i10 == 0, true);
                break;
            default:
                zn znVar2 = this.Q0;
                znVar2.M0.i(znVar2.Y1, i10 == 0, true);
                break;
        }
    }
}

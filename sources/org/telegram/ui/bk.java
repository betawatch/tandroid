package org.telegram.ui;

import android.content.Context;
import org.telegram.ui.Components.FragmentContextView;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class bk extends FragmentContextView {
    public final /* synthetic */ int X0;
    public final /* synthetic */ un Y0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bk(un unVar, Context context, un unVar2, org.telegram.ui.ActionBar.u6 u6Var, int i10) {
        super(context, unVar2, null, true, u6Var);
        this.X0 = i10;
        switch (i10) {
            case 1:
                this.Y0 = unVar;
                super(context, unVar2, null, false, u6Var);
                break;
            default:
                this.Y0 = unVar;
                break;
        }
    }

    @Override // org.telegram.ui.Components.FragmentContextView, android.view.View
    public final void setVisibility(int i10) {
        switch (this.X0) {
            case 0:
                un unVar = this.Y0;
                unVar.Y0.i(unVar.m2, i10 == 0, true);
                break;
            default:
                un unVar2 = this.Y0;
                unVar2.Y0.i(unVar2.k2, i10 == 0, true);
                break;
        }
    }
}

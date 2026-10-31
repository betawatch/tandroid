package org.telegram.ui;

import android.content.Context;
import org.telegram.ui.Components.FragmentContextView;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class gk extends FragmentContextView {
    public final /* synthetic */ int X0;
    public final /* synthetic */ un Y0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gk(un unVar, Context context, un unVar2, org.telegram.ui.ActionBar.p6 p6Var, int i10) {
        super(context, unVar2, null, true, p6Var);
        this.X0 = i10;
        switch (i10) {
            case 1:
                this.Y0 = unVar;
                super(context, unVar2, null, false, p6Var);
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
                unVar.a1.i(unVar.o2, i10 == 0, true);
                break;
            default:
                un unVar2 = this.Y0;
                unVar2.a1.i(unVar2.m2, i10 == 0, true);
                break;
        }
    }
}

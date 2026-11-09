package org.telegram.ui;

import android.content.Context;
import org.telegram.ui.Components.FragmentContextView;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class nj extends FragmentContextView {
    public final /* synthetic */ int X0;
    public final /* synthetic */ cn Y0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nj(cn cnVar, Context context, cn cnVar2, org.telegram.ui.ActionBar.g6 g6Var, int i7) {
        super(context, cnVar2, null, true, g6Var);
        this.X0 = i7;
        switch (i7) {
            case 1:
                this.Y0 = cnVar;
                super(context, cnVar2, null, false, g6Var);
                break;
            default:
                this.Y0 = cnVar;
                break;
        }
    }

    @Override // org.telegram.ui.Components.FragmentContextView, android.view.View
    public final void setVisibility(int i7) {
        switch (this.X0) {
            case 0:
                cn cnVar = this.Y0;
                cnVar.a1.i(cnVar.o2, i7 == 0, true);
                break;
            default:
                cn cnVar2 = this.Y0;
                cnVar2.a1.i(cnVar2.m2, i7 == 0, true);
                break;
        }
    }
}

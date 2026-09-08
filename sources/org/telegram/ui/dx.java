package org.telegram.ui;

import android.content.Context;
import org.telegram.ui.Components.FragmentContextView;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class dx extends FragmentContextView {
    public final /* synthetic */ int N0;
    public final /* synthetic */ uy O0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dx(uy uyVar, Context context, uy uyVar2, int i10) {
        super(context, uyVar2, true);
        this.N0 = i10;
        switch (i10) {
            case 1:
                this.O0 = uyVar;
                super(context, uyVar2, false);
                break;
            default:
                this.O0 = uyVar;
                break;
        }
    }

    @Override // org.telegram.ui.Components.FragmentContextView, android.view.View
    public final void setVisibility(int i10) {
        switch (this.N0) {
            case 0:
                uy uyVar = this.O0;
                uyVar.J1.i(uyVar.G1, i10 == 0, true);
                break;
            default:
                uy uyVar2 = this.O0;
                uyVar2.J1.i(uyVar2.I1, i10 == 0, true);
                break;
        }
    }
}

package org.telegram.ui.Components;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class uk extends f2.a1 {
    public final /* synthetic */ cl a;

    public uk(cl clVar) {
        this.a = clVar;
    }

    @Override // f2.a1
    public final void a(RecyclerView recyclerView, int i10) {
        fl0 fl0Var;
        cl clVar = this.a;
        mh.d1 d1Var = clVar.M;
        mi miVar = clVar.b;
        boolean z4 = i10 != 0;
        clVar.I = z4;
        if (!z4 && clVar.G != null) {
            clVar.G = null;
        }
        if (i10 == 0) {
            int dp = AndroidUtilities.dp(13.0f);
            int backgroundPaddingTop = miVar.getBackgroundPaddingTop();
            if (((miVar.Y1[0] - backgroundPaddingTop) - dp) + backgroundPaddingTop >= org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() || (fl0Var = (fl0) d1Var.K(0)) == null) {
                return;
            }
            View view = fl0Var.a;
            if (view.getTop() > clVar.x0 - clVar.w0) {
                d1Var.v0(0, view.getTop() - (clVar.x0 - clVar.w0), null);
            }
        }
    }

    @Override // f2.a1
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        cl clVar = this.a;
        clVar.e0();
        if (clVar.G != null) {
            clVar.H += i11;
        }
        clVar.b.X1(clVar, i11);
    }
}

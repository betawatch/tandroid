package org.telegram.ui.Components;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class ql extends s4.t0 {
    public final /* synthetic */ xl a;

    public ql(xl xlVar) {
        this.a = xlVar;
    }

    @Override // s4.t0
    public final void a(RecyclerView recyclerView, int i10) {
        am0 am0Var;
        xl xlVar = this.a;
        ai.w0 w0Var = xlVar.P;
        yi yiVar = xlVar.b;
        boolean z10 = i10 != 0;
        xlVar.L = z10;
        if (!z10 && xlVar.J != null) {
            xlVar.J = null;
        }
        if (i10 == 0) {
            int dp = AndroidUtilities.dp(13.0f);
            int backgroundPaddingTop = yiVar.getBackgroundPaddingTop();
            if (((yiVar.e2[0] - backgroundPaddingTop) - dp) + backgroundPaddingTop >= org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() || (am0Var = (am0) w0Var.K(0)) == null) {
                return;
            }
            View view = am0Var.a;
            if (view.getTop() > xlVar.A0 - xlVar.z0) {
                w0Var.v0(0, view.getTop() - (xlVar.A0 - xlVar.z0), null);
            }
        }
    }

    @Override // s4.t0
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        xl xlVar = this.a;
        xlVar.h0();
        if (xlVar.J != null) {
            xlVar.K += i11;
        }
        xlVar.b.b2(xlVar, i11);
    }
}

package org.telegram.ui.Components;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class el extends s4.s0 {
    public final /* synthetic */ ll a;

    public el(ll llVar) {
        this.a = llVar;
    }

    @Override // s4.s0
    public final void a(RecyclerView recyclerView, int i10) {
        fl0 fl0Var;
        ll llVar = this.a;
        bi.y1 y1Var = llVar.P;
        yi yiVar = llVar.b;
        boolean z10 = i10 != 0;
        llVar.L = z10;
        if (!z10 && llVar.J != null) {
            llVar.J = null;
        }
        if (i10 == 0) {
            int dp = AndroidUtilities.dp(13.0f);
            int backgroundPaddingTop = yiVar.getBackgroundPaddingTop();
            if (((yiVar.b2[0] - backgroundPaddingTop) - dp) + backgroundPaddingTop >= org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() || (fl0Var = (fl0) y1Var.K(0)) == null) {
                return;
            }
            View view = fl0Var.a;
            if (view.getTop() > llVar.A0 - llVar.z0) {
                y1Var.v0(0, view.getTop() - (llVar.A0 - llVar.z0), null);
            }
        }
    }

    @Override // s4.s0
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        ll llVar = this.a;
        llVar.e0();
        if (llVar.J != null) {
            llVar.K += i11;
        }
        llVar.b.X1(llVar, i11);
    }
}

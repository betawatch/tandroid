package org.telegram.ui.Components;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class nl extends s4.r0 {
    public final /* synthetic */ ul a;

    public nl(ul ulVar) {
        this.a = ulVar;
    }

    @Override // s4.r0
    public final void a(RecyclerView recyclerView, int i10) {
        wl0 wl0Var;
        ul ulVar = this.a;
        bi.o0 o0Var = ulVar.P;
        vi viVar = ulVar.b;
        boolean z10 = i10 != 0;
        ulVar.L = z10;
        if (!z10 && ulVar.J != null) {
            ulVar.J = null;
        }
        if (i10 == 0) {
            int dp = AndroidUtilities.dp(13.0f);
            int backgroundPaddingTop = viVar.getBackgroundPaddingTop();
            if (((viVar.e2[0] - backgroundPaddingTop) - dp) + backgroundPaddingTop >= org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() || (wl0Var = (wl0) o0Var.K(0)) == null) {
                return;
            }
            View view = wl0Var.a;
            if (view.getTop() > ulVar.A0 - ulVar.z0) {
                o0Var.v0(0, view.getTop() - (ulVar.A0 - ulVar.z0), null);
            }
        }
    }

    @Override // s4.r0
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        ul ulVar = this.a;
        ulVar.h0();
        if (ulVar.J != null) {
            ulVar.K += i11;
        }
        ulVar.b.b2(ulVar, i11);
    }
}

package org.telegram.ui.Components;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public final class kl extends s4.r0 {
    public final /* synthetic */ rl a;

    public kl(rl rlVar) {
        this.a = rlVar;
    }

    @Override // s4.r0
    public final void a(RecyclerView recyclerView, int i10) {
        sl0 sl0Var;
        rl rlVar = this.a;
        ai.u1 u1Var = rlVar.P;
        ti tiVar = rlVar.b;
        boolean z10 = i10 != 0;
        rlVar.L = z10;
        if (!z10 && rlVar.J != null) {
            rlVar.J = null;
        }
        if (i10 == 0) {
            int dp = AndroidUtilities.dp(13.0f);
            int backgroundPaddingTop = tiVar.getBackgroundPaddingTop();
            if (((tiVar.e2[0] - backgroundPaddingTop) - dp) + backgroundPaddingTop >= org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() || (sl0Var = (sl0) u1Var.K(0)) == null) {
                return;
            }
            View view = sl0Var.a;
            if (view.getTop() > rlVar.A0 - rlVar.z0) {
                u1Var.v0(0, view.getTop() - (rlVar.A0 - rlVar.z0), null);
            }
        }
    }

    @Override // s4.r0
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        rl rlVar = this.a;
        rlVar.h0();
        if (rlVar.J != null) {
            rlVar.K += i11;
        }
        rlVar.b.b2(rlVar, i11);
    }
}

package org.telegram.ui.Components;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes3.dex */
public final class kl extends s4.r0 {
    public final /* synthetic */ rl a;

    public kl(rl rlVar) {
        this.a = rlVar;
    }

    @Override // s4.r0
    public final void a(RecyclerView recyclerView, int i10) {
        wl0 wl0Var;
        rl rlVar = this.a;
        ai.u1 u1Var = rlVar.N;
        ti tiVar = rlVar.b;
        boolean z10 = i10 != 0;
        rlVar.J = z10;
        if (!z10 && rlVar.H != null) {
            rlVar.H = null;
        }
        if (i10 == 0) {
            int dp = AndroidUtilities.dp(13.0f);
            int backgroundPaddingTop = tiVar.getBackgroundPaddingTop();
            if (((tiVar.e2[0] - backgroundPaddingTop) - dp) + backgroundPaddingTop >= org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() || (wl0Var = (wl0) u1Var.K(0)) == null) {
                return;
            }
            View view = wl0Var.a;
            if (view.getTop() > rlVar.y0 - rlVar.x0) {
                u1Var.v0(0, view.getTop() - (rlVar.y0 - rlVar.x0), null);
            }
        }
    }

    @Override // s4.r0
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        rl rlVar = this.a;
        rlVar.i0();
        if (rlVar.H != null) {
            rlVar.I += i11;
        }
        rlVar.b.f2(rlVar, i11);
    }
}

package org.telegram.ui.Components;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class ml extends s4.r0 {
    public final /* synthetic */ tl a;

    public ml(tl tlVar) {
        this.a = tlVar;
    }

    @Override // s4.r0
    public final void a(RecyclerView recyclerView, int i10) {
        wl0 wl0Var;
        tl tlVar = this.a;
        bi.o0 o0Var = tlVar.P;
        vi viVar = tlVar.b;
        boolean z10 = i10 != 0;
        tlVar.L = z10;
        if (!z10 && tlVar.J != null) {
            tlVar.J = null;
        }
        if (i10 == 0) {
            int dp = AndroidUtilities.dp(13.0f);
            int backgroundPaddingTop = viVar.getBackgroundPaddingTop();
            if (((viVar.e2[0] - backgroundPaddingTop) - dp) + backgroundPaddingTop >= org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() || (wl0Var = (wl0) o0Var.K(0)) == null) {
                return;
            }
            View view = wl0Var.a;
            if (view.getTop() > tlVar.A0 - tlVar.z0) {
                o0Var.v0(0, view.getTop() - (tlVar.A0 - tlVar.z0), null);
            }
        }
    }

    @Override // s4.r0
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        tl tlVar = this.a;
        tlVar.h0();
        if (tlVar.J != null) {
            tlVar.K += i11;
        }
        tlVar.b.b2(tlVar, i11);
    }
}

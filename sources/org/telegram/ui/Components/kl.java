package org.telegram.ui.Components;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class kl extends s4.u0 {
    public final /* synthetic */ sl a;

    public kl(sl slVar) {
        this.a = slVar;
    }

    @Override // s4.u0
    public final void a(RecyclerView recyclerView, int i10) {
        vl0 vl0Var;
        sl slVar = this.a;
        bi.r1 r1Var = slVar.N;
        ti tiVar = slVar.b;
        boolean z10 = i10 != 0;
        slVar.J = z10;
        if (!z10 && slVar.H != null) {
            slVar.H = null;
        }
        if (i10 == 0) {
            int dp = AndroidUtilities.dp(13.0f);
            int backgroundPaddingTop = tiVar.getBackgroundPaddingTop();
            if (((tiVar.e2[0] - backgroundPaddingTop) - dp) + backgroundPaddingTop >= org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() || (vl0Var = (vl0) r1Var.K(0)) == null) {
                return;
            }
            View view = vl0Var.a;
            if (view.getTop() > slVar.x0 - slVar.w0) {
                r1Var.w0(0, view.getTop() - (slVar.x0 - slVar.w0), null);
            }
        }
    }

    @Override // s4.u0
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        sl slVar = this.a;
        slVar.h0();
        if (slVar.H != null) {
            slVar.I += i11;
        }
        slVar.b.e2(slVar, i11);
    }
}

package org.telegram.ui.Components;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-c7458e893fd6f3e0a6fbf27724068aa00f1caa233b10a33d542967499303009b */
/* loaded from: classes3.dex */
public final class bl extends s4.s0 {
    public final /* synthetic */ il a;

    public bl(il ilVar) {
        this.a = ilVar;
    }

    @Override // s4.s0
    public final void a(RecyclerView recyclerView, int i10) {
        il0 il0Var;
        il ilVar = this.a;
        ai.w0 w0Var = ilVar.P;
        wi wiVar = ilVar.b;
        boolean z10 = i10 != 0;
        ilVar.L = z10;
        if (!z10 && ilVar.J != null) {
            ilVar.J = null;
        }
        if (i10 == 0) {
            int dp = AndroidUtilities.dp(13.0f);
            int backgroundPaddingTop = wiVar.getBackgroundPaddingTop();
            if (((wiVar.b2[0] - backgroundPaddingTop) - dp) + backgroundPaddingTop >= org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() || (il0Var = (il0) w0Var.K(0)) == null) {
                return;
            }
            View view = il0Var.a;
            if (view.getTop() > ilVar.A0 - ilVar.z0) {
                w0Var.v0(0, view.getTop() - (ilVar.A0 - ilVar.z0), null);
            }
        }
    }

    @Override // s4.s0
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        il ilVar = this.a;
        ilVar.e0();
        if (ilVar.J != null) {
            ilVar.K += i11;
        }
        ilVar.b.X1(ilVar, i11);
    }
}

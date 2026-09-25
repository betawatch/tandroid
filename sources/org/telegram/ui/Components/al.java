package org.telegram.ui.Components;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final class al extends s4.s0 {
    public final /* synthetic */ hl a;

    public al(hl hlVar) {
        this.a = hlVar;
    }

    @Override // s4.s0
    public final void a(RecyclerView recyclerView, int i10) {
        gl0 gl0Var;
        hl hlVar = this.a;
        ai.w0 w0Var = hlVar.P;
        wi wiVar = hlVar.b;
        boolean z10 = i10 != 0;
        hlVar.L = z10;
        if (!z10 && hlVar.J != null) {
            hlVar.J = null;
        }
        if (i10 == 0) {
            int dp = AndroidUtilities.dp(13.0f);
            int backgroundPaddingTop = wiVar.getBackgroundPaddingTop();
            if (((wiVar.b2[0] - backgroundPaddingTop) - dp) + backgroundPaddingTop >= org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() || (gl0Var = (gl0) w0Var.K(0)) == null) {
                return;
            }
            View view = gl0Var.a;
            if (view.getTop() > hlVar.A0 - hlVar.z0) {
                w0Var.v0(0, view.getTop() - (hlVar.A0 - hlVar.z0), null);
            }
        }
    }

    @Override // s4.s0
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        hl hlVar = this.a;
        hlVar.e0();
        if (hlVar.J != null) {
            hlVar.K += i11;
        }
        hlVar.b.X1(hlVar, i11);
    }
}

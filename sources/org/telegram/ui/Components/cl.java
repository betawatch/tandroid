package org.telegram.ui.Components;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final class cl extends s4.s0 {
    public final /* synthetic */ jl a;

    public cl(jl jlVar) {
        this.a = jlVar;
    }

    @Override // s4.s0
    public final void a(RecyclerView recyclerView, int i10) {
        il0 il0Var;
        jl jlVar = this.a;
        ai.w0 w0Var = jlVar.P;
        xi xiVar = jlVar.b;
        boolean z10 = i10 != 0;
        jlVar.L = z10;
        if (!z10 && jlVar.J != null) {
            jlVar.J = null;
        }
        if (i10 == 0) {
            int dp = AndroidUtilities.dp(13.0f);
            int backgroundPaddingTop = xiVar.getBackgroundPaddingTop();
            if (((xiVar.b2[0] - backgroundPaddingTop) - dp) + backgroundPaddingTop >= org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() || (il0Var = (il0) w0Var.K(0)) == null) {
                return;
            }
            View view = il0Var.a;
            if (view.getTop() > jlVar.A0 - jlVar.z0) {
                w0Var.w0(0, view.getTop() - (jlVar.A0 - jlVar.z0), null);
            }
        }
    }

    @Override // s4.s0
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        jl jlVar = this.a;
        jlVar.e0();
        if (jlVar.J != null) {
            jlVar.K += i11;
        }
        jlVar.b.W1(jlVar, i11);
    }
}

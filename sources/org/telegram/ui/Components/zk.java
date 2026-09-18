package org.telegram.ui.Components;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
/* loaded from: classes3.dex */
public final class zk extends s4.s0 {
    public final /* synthetic */ gl a;

    public zk(gl glVar) {
        this.a = glVar;
    }

    @Override // s4.s0
    public final void a(RecyclerView recyclerView, int i10) {
        gl0 gl0Var;
        gl glVar = this.a;
        ai.w0 w0Var = glVar.P;
        vi viVar = glVar.b;
        boolean z10 = i10 != 0;
        glVar.L = z10;
        if (!z10 && glVar.J != null) {
            glVar.J = null;
        }
        if (i10 == 0) {
            int dp = AndroidUtilities.dp(13.0f);
            int backgroundPaddingTop = viVar.getBackgroundPaddingTop();
            if (((viVar.b2[0] - backgroundPaddingTop) - dp) + backgroundPaddingTop >= org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() || (gl0Var = (gl0) w0Var.L(0)) == null) {
                return;
            }
            View view = gl0Var.a;
            if (view.getTop() > glVar.A0 - glVar.z0) {
                w0Var.w0(0, view.getTop() - (glVar.A0 - glVar.z0), null);
            }
        }
    }

    @Override // s4.s0
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        gl glVar = this.a;
        glVar.e0();
        if (glVar.J != null) {
            glVar.K += i11;
        }
        glVar.b.X1(glVar, i11);
    }
}

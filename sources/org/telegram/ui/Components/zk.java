package org.telegram.ui.Components;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class zk extends s4.s0 {
    public final /* synthetic */ gl a;

    public zk(gl glVar) {
        this.a = glVar;
    }

    @Override // s4.s0
    public final void a(RecyclerView recyclerView, int i10) {
        vk0 vk0Var;
        gl glVar = this.a;
        bi.o0 o0Var = glVar.P;
        vi viVar = glVar.b;
        boolean z10 = i10 != 0;
        glVar.L = z10;
        if (!z10 && glVar.J != null) {
            glVar.J = null;
        }
        if (i10 == 0) {
            int dp = AndroidUtilities.dp(13.0f);
            int backgroundPaddingTop = viVar.getBackgroundPaddingTop();
            if (((viVar.b2[0] - backgroundPaddingTop) - dp) + backgroundPaddingTop >= org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() || (vk0Var = (vk0) o0Var.K(0)) == null) {
                return;
            }
            View view = vk0Var.a;
            if (view.getTop() > glVar.A0 - glVar.z0) {
                o0Var.v0(0, view.getTop() - (glVar.A0 - glVar.z0), null);
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

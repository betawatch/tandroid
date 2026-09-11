package org.telegram.ui.Components;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
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

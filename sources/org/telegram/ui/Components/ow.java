package org.telegram.ui.Components;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public final class ow extends s4.n0 {
    public final /* synthetic */ kz a;

    public ow(kz kzVar) {
        this.a = kzVar;
    }

    @Override // s4.n0
    public final void a(Rect rect, View view, RecyclerView recyclerView, s4.z0 z0Var) {
        recyclerView.getClass();
        int R = RecyclerView.R(view);
        kz kzVar = this.a;
        s4.h0 adapter = kzVar.h0.getAdapter();
        py pyVar = kzVar.n0;
        if (adapter == pyVar && R == pyVar.I) {
            rect.set(0, 0, 0, 0);
            return;
        }
        if (R == 0) {
            pyVar.getClass();
        }
        rect.left = 0;
        rect.bottom = 0;
        rect.top = AndroidUtilities.dp(2.0f);
        qy qyVar = kzVar.i0;
        pyVar.getClass();
        rect.right = qyVar.E1(R) ? 0 : AndroidUtilities.dp(2.0f);
    }
}

package org.telegram.ui.Components;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
/* loaded from: classes3.dex */
public final class rw extends s4.n0 {
    public final /* synthetic */ nz a;

    public rw(nz nzVar) {
        this.a = nzVar;
    }

    @Override // s4.n0
    public final void a(Rect rect, View view, RecyclerView recyclerView, s4.z0 z0Var) {
        recyclerView.getClass();
        int R = RecyclerView.R(view);
        nz nzVar = this.a;
        s4.h0 adapter = nzVar.h0.getAdapter();
        sy syVar = nzVar.n0;
        if (adapter == syVar && R == syVar.I) {
            rect.set(0, 0, 0, 0);
            return;
        }
        if (R == 0) {
            syVar.getClass();
        }
        rect.left = 0;
        rect.bottom = 0;
        rect.top = AndroidUtilities.dp(2.0f);
        ty tyVar = nzVar.i0;
        syVar.getClass();
        rect.right = tyVar.E1(R) ? 0 : AndroidUtilities.dp(2.0f);
    }
}

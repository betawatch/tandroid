package org.telegram.ui.Components;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class gw extends f2.v0 {
    public final /* synthetic */ fz a;

    public gw(fz fzVar) {
        this.a = fzVar;
    }

    @Override // f2.v0
    public final void a(Rect rect, View view, RecyclerView recyclerView, f2.k1 k1Var) {
        recyclerView.getClass();
        int R = RecyclerView.R(view);
        fz fzVar = this.a;
        f2.p0 adapter = fzVar.d0.getAdapter();
        jy jyVar = fzVar.j0;
        if (adapter == jyVar && R == jyVar.E) {
            rect.set(0, 0, 0, 0);
            return;
        }
        if (R == 0) {
            jyVar.getClass();
        }
        rect.left = 0;
        rect.bottom = 0;
        rect.top = AndroidUtilities.dp(2.0f);
        ky kyVar = fzVar.e0;
        jyVar.getClass();
        rect.right = kyVar.E1(R) ? 0 : AndroidUtilities.dp(2.0f);
    }
}

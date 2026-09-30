package org.telegram.ui.Components;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
/* loaded from: classes3.dex */
public final class qw extends s4.n0 {
    public final /* synthetic */ mz a;

    public qw(mz mzVar) {
        this.a = mzVar;
    }

    @Override // s4.n0
    public final void a(Rect rect, View view, RecyclerView recyclerView, s4.z0 z0Var) {
        recyclerView.getClass();
        int R = RecyclerView.R(view);
        mz mzVar = this.a;
        s4.h0 adapter = mzVar.h0.getAdapter();
        ry ryVar = mzVar.n0;
        if (adapter == ryVar && R == ryVar.I) {
            rect.set(0, 0, 0, 0);
            return;
        }
        if (R == 0) {
            ryVar.getClass();
        }
        rect.left = 0;
        rect.bottom = 0;
        rect.top = AndroidUtilities.dp(2.0f);
        sy syVar = mzVar.i0;
        ryVar.getClass();
        rect.right = syVar.E1(R) ? 0 : AndroidUtilities.dp(2.0f);
    }
}

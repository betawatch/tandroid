package org.telegram.ui.Components;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class vw extends s4.n0 {
    public final /* synthetic */ sz a;

    public vw(sz szVar) {
        this.a = szVar;
    }

    @Override // s4.n0
    public final void d(Rect rect, View view, RecyclerView recyclerView, s4.b1 b1Var) {
        int R = RecyclerView.R(view);
        sz szVar = this.a;
        s4.h0 adapter = szVar.h0.getAdapter();
        xy xyVar = szVar.n0;
        if (adapter == xyVar && R == xyVar.I) {
            rect.set(0, 0, 0, 0);
            return;
        }
        if (R == 0) {
            xyVar.getClass();
        }
        rect.left = 0;
        rect.bottom = 0;
        rect.top = AndroidUtilities.dp(2.0f);
        yy yyVar = szVar.i0;
        xyVar.getClass();
        rect.right = yyVar.F1(R) ? 0 : AndroidUtilities.dp(2.0f);
    }
}

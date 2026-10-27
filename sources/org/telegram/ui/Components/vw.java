package org.telegram.ui.Components;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
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

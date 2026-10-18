package org.telegram.ui.Components;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public final class vw extends s4.m0 {
    public final /* synthetic */ tz a;

    public vw(tz tzVar) {
        this.a = tzVar;
    }

    @Override // s4.m0
    public final void a(Rect rect, View view, RecyclerView recyclerView, s4.y0 y0Var) {
        recyclerView.getClass();
        int R = RecyclerView.R(view);
        tz tzVar = this.a;
        s4.g0 adapter = tzVar.h0.getAdapter();
        yy yyVar = tzVar.n0;
        if (adapter == yyVar && R == yyVar.I) {
            rect.set(0, 0, 0, 0);
            return;
        }
        if (R == 0) {
            yyVar.getClass();
        }
        rect.left = 0;
        rect.bottom = 0;
        rect.top = AndroidUtilities.dp(2.0f);
        zy zyVar = tzVar.i0;
        yyVar.getClass();
        rect.right = zyVar.E1(R) ? 0 : AndroidUtilities.dp(2.0f);
    }
}

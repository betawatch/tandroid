package org.telegram.ui.Components;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
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

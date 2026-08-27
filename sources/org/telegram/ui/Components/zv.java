package org.telegram.ui.Components;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class zv extends f2.w0 {
    public final /* synthetic */ yy a;

    public zv(yy yyVar) {
        this.a = yyVar;
    }

    @Override // f2.w0
    public final void a(Rect rect, View view, RecyclerView recyclerView, f2.l1 l1Var) {
        recyclerView.getClass();
        int R = RecyclerView.R(view);
        yy yyVar = this.a;
        f2.q0 adapter = yyVar.d0.getAdapter();
        cy cyVar = yyVar.j0;
        if (adapter == cyVar && R == cyVar.E) {
            rect.set(0, 0, 0, 0);
            return;
        }
        if (R == 0) {
            cyVar.getClass();
        }
        rect.left = 0;
        rect.bottom = 0;
        rect.top = AndroidUtilities.dp(2.0f);
        dy dyVar = yyVar.e0;
        cyVar.getClass();
        rect.right = dyVar.E1(R) ? 0 : AndroidUtilities.dp(2.0f);
    }
}

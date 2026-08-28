package org.telegram.ui.Components;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class aw extends f2.y0 {
    public final /* synthetic */ wy a;

    public aw(wy wyVar) {
        this.a = wyVar;
    }

    @Override // f2.y0
    public final void a(Rect rect, View view, RecyclerView recyclerView, f2.n1 n1Var) {
        recyclerView.getClass();
        int R = RecyclerView.R(view);
        wy wyVar = this.a;
        f2.r0 adapter = wyVar.d0.getAdapter();
        ay ayVar = wyVar.j0;
        if (adapter == ayVar && R == ayVar.E) {
            rect.set(0, 0, 0, 0);
            return;
        }
        if (R == 0) {
            ayVar.getClass();
        }
        rect.left = 0;
        rect.bottom = 0;
        rect.top = AndroidUtilities.dp(2.0f);
        cy cyVar = wyVar.e0;
        ayVar.getClass();
        rect.right = cyVar.E1(R) ? 0 : AndroidUtilities.dp(2.0f);
    }
}

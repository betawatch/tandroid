package org.telegram.ui.Components;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class tw extends s4.n0 {
    public final /* synthetic */ rz a;

    public tw(rz rzVar) {
        this.a = rzVar;
    }

    @Override // s4.n0
    public final void a(Rect rect, View view, RecyclerView recyclerView, s4.z0 z0Var) {
        recyclerView.getClass();
        int R = RecyclerView.R(view);
        rz rzVar = this.a;
        s4.h0 adapter = rzVar.h0.getAdapter();
        wy wyVar = rzVar.n0;
        if (adapter == wyVar && R == wyVar.I) {
            rect.set(0, 0, 0, 0);
            return;
        }
        if (R == 0) {
            wyVar.getClass();
        }
        rect.left = 0;
        rect.bottom = 0;
        rect.top = AndroidUtilities.dp(2.0f);
        xy xyVar = rzVar.i0;
        wyVar.getClass();
        rect.right = xyVar.E1(R) ? 0 : AndroidUtilities.dp(2.0f);
    }
}

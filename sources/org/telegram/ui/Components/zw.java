package org.telegram.ui.Components;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class zw extends s4.m0 {
    public final /* synthetic */ wz a;

    public zw(wz wzVar) {
        this.a = wzVar;
    }

    @Override // s4.m0
    public final void a(Rect rect, View view, RecyclerView recyclerView, s4.y0 y0Var) {
        recyclerView.getClass();
        int R = RecyclerView.R(view);
        wz wzVar = this.a;
        s4.g0 adapter = wzVar.h0.getAdapter();
        az azVar = wzVar.n0;
        if (adapter == azVar && R == azVar.I) {
            rect.set(0, 0, 0, 0);
            return;
        }
        if (R == 0) {
            azVar.getClass();
        }
        rect.left = 0;
        rect.bottom = 0;
        rect.top = AndroidUtilities.dp(2.0f);
        bz bzVar = wzVar.i0;
        azVar.getClass();
        rect.right = bzVar.E1(R) ? 0 : AndroidUtilities.dp(2.0f);
    }
}

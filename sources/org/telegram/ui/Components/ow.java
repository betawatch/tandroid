package org.telegram.ui.Components;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class ow extends s4.n0 {
    public final /* synthetic */ lz a;

    public ow(lz lzVar) {
        this.a = lzVar;
    }

    @Override // s4.n0
    public final void a(Rect rect, View view, RecyclerView recyclerView, s4.z0 z0Var) {
        recyclerView.getClass();
        int R = RecyclerView.R(view);
        lz lzVar = this.a;
        s4.h0 adapter = lzVar.h0.getAdapter();
        qy qyVar = lzVar.n0;
        if (adapter == qyVar && R == qyVar.I) {
            rect.set(0, 0, 0, 0);
            return;
        }
        if (R == 0) {
            qyVar.getClass();
        }
        rect.left = 0;
        rect.bottom = 0;
        rect.top = AndroidUtilities.dp(2.0f);
        ry ryVar = lzVar.i0;
        qyVar.getClass();
        rect.right = ryVar.E1(R) ? 0 : AndroidUtilities.dp(2.0f);
    }
}

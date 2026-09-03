package org.telegram.ui.Components;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class mw extends f2.v0 {
    public final /* synthetic */ mz a;

    public mw(mz mzVar) {
        this.a = mzVar;
    }

    @Override // f2.v0
    public final void a(Rect rect, View view, RecyclerView recyclerView, f2.j1 j1Var) {
        recyclerView.getClass();
        int R = RecyclerView.R(view);
        mz mzVar = this.a;
        f2.p0 adapter = mzVar.e0.getAdapter();
        qy qyVar = mzVar.k0;
        if (adapter == qyVar && R == qyVar.F) {
            rect.set(0, 0, 0, 0);
            return;
        }
        if (R == 0) {
            qyVar.getClass();
        }
        rect.left = 0;
        rect.bottom = 0;
        rect.top = AndroidUtilities.dp(2.0f);
        ry ryVar = mzVar.f0;
        qyVar.getClass();
        rect.right = ryVar.E1(R) ? 0 : AndroidUtilities.dp(2.0f);
    }
}

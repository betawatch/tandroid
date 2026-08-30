package org.telegram.ui.Components;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class kw extends f2.u0 {
    public final /* synthetic */ kz a;

    public kw(kz kzVar) {
        this.a = kzVar;
    }

    @Override // f2.u0
    public final void a(Rect rect, View view, RecyclerView recyclerView, f2.i1 i1Var) {
        recyclerView.getClass();
        int R = RecyclerView.R(view);
        kz kzVar = this.a;
        f2.o0 adapter = kzVar.e0.getAdapter();
        oy oyVar = kzVar.k0;
        if (adapter == oyVar && R == oyVar.F) {
            rect.set(0, 0, 0, 0);
            return;
        }
        if (R == 0) {
            oyVar.getClass();
        }
        rect.left = 0;
        rect.bottom = 0;
        rect.top = AndroidUtilities.dp(2.0f);
        py pyVar = kzVar.f0;
        oyVar.getClass();
        rect.right = pyVar.E1(R) ? 0 : AndroidUtilities.dp(2.0f);
    }
}

package org.telegram.ui;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class c10 extends u4.n0 {
    public final /* synthetic */ x30 a;

    public c10(x30 x30Var) {
        this.a = x30Var;
    }

    @Override // u4.n0
    public final void e(Rect rect, View view, RecyclerView recyclerView, u4.a1 a1Var) {
        int R = RecyclerView.R(view);
        if (R >= 0) {
            rect.setEmpty();
            r30 r30Var = this.a.H1;
            int i3 = r30Var.H;
            if (R < i3 || R >= r30Var.I) {
                return;
            }
            int i10 = R - i3;
            int i11 = x30.x5 ? 6 : 2;
            int i12 = i10 % i11;
            if (i12 == 0) {
                rect.right = org.telegram.messenger.g0.L(2.0f);
            } else if (i12 == i11 - 1) {
                rect.left = org.telegram.messenger.g0.L(2.0f);
            } else {
                rect.left = org.telegram.messenger.g0.L(1.0f);
            }
        }
    }
}

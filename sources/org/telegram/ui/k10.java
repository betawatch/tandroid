package org.telegram.ui;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class k10 extends v4.m0 {
    public final /* synthetic */ f40 a;

    public k10(f40 f40Var) {
        this.a = f40Var;
    }

    @Override // v4.m0
    public final void e(Rect rect, View view, RecyclerView recyclerView, v4.a1 a1Var) {
        int R = RecyclerView.R(view);
        if (R >= 0) {
            rect.setEmpty();
            z30 z30Var = this.a.J1;
            int i7 = z30Var.G;
            if (R < i7 || R >= z30Var.H) {
                return;
            }
            int i10 = R - i7;
            int i11 = f40.z5 ? 6 : 2;
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

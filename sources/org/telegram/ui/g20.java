package org.telegram.ui;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class g20 extends s4.m0 {
    public final /* synthetic */ b50 a;

    public g20(b50 b50Var) {
        this.a = b50Var;
    }

    @Override // s4.m0
    public final void c(Rect rect, View view, RecyclerView recyclerView, s4.z0 z0Var) {
        int R = RecyclerView.R(view);
        if (R >= 0) {
            rect.setEmpty();
            v40 v40Var = this.a.G1;
            int i10 = v40Var.G;
            if (R < i10 || R >= v40Var.H) {
                return;
            }
            int i11 = R - i10;
            int i12 = b50.w5 ? 6 : 2;
            int i13 = i11 % i12;
            if (i13 == 0) {
                rect.right = org.telegram.messenger.i0.L(2.0f);
            } else if (i13 == i12 - 1) {
                rect.left = org.telegram.messenger.i0.L(2.0f);
            } else {
                rect.left = org.telegram.messenger.i0.L(1.0f);
            }
        }
    }
}

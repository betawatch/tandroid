package org.telegram.ui;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class f20 extends s4.m0 {
    public final /* synthetic */ a50 a;

    public f20(a50 a50Var) {
        this.a = a50Var;
    }

    @Override // s4.m0
    public final void c(Rect rect, View view, RecyclerView recyclerView, s4.z0 z0Var) {
        int R = RecyclerView.R(view);
        if (R >= 0) {
            rect.setEmpty();
            u40 u40Var = this.a.G1;
            int i10 = u40Var.G;
            if (R < i10 || R >= u40Var.H) {
                return;
            }
            int i11 = R - i10;
            int i12 = a50.w5 ? 6 : 2;
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

package org.telegram.ui;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final class g10 extends v4.m0 {
    public final /* synthetic */ c40 a;

    public g10(c40 c40Var) {
        this.a = c40Var;
    }

    @Override // v4.m0
    public final void e(Rect rect, View view, RecyclerView recyclerView, v4.a1 a1Var) {
        int R = RecyclerView.R(view);
        if (R >= 0) {
            rect.setEmpty();
            w30 w30Var = this.a.G1;
            int i7 = w30Var.G;
            if (R < i7 || R >= w30Var.H) {
                return;
            }
            int i10 = R - i7;
            int i11 = c40.w5 ? 6 : 2;
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

package org.telegram.ui;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
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

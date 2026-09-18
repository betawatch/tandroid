package org.telegram.ui;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class k30 extends s4.n0 {
    public final /* synthetic */ k60 a;

    public k30(k60 k60Var) {
        this.a = k60Var;
    }

    @Override // s4.n0
    public final void a(Rect rect, View view, RecyclerView recyclerView, s4.z0 z0Var) {
        recyclerView.getClass();
        int S = RecyclerView.S(view);
        if (S >= 0) {
            rect.setEmpty();
            e60 e60Var = this.a.P;
            int i10 = e60Var.G;
            if (S < i10 || S >= e60Var.H) {
                return;
            }
            int i11 = S - i10;
            int i12 = k60.F3 ? 6 : 2;
            int i13 = i11 % i12;
            if (i13 == 0) {
                rect.right = AndroidUtilities.dp(2.0f);
            } else if (i13 == i12 - 1) {
                rect.left = AndroidUtilities.dp(2.0f);
            } else {
                rect.left = AndroidUtilities.dp(1.0f);
            }
        }
    }
}

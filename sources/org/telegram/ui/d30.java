package org.telegram.ui;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final class d30 extends s4.n0 {
    public final /* synthetic */ d60 a;

    public d30(d60 d60Var) {
        this.a = d60Var;
    }

    @Override // s4.n0
    public final void a(Rect rect, View view, RecyclerView recyclerView, s4.z0 z0Var) {
        recyclerView.getClass();
        int R = RecyclerView.R(view);
        if (R >= 0) {
            rect.setEmpty();
            x50 x50Var = this.a.P;
            int i10 = x50Var.G;
            if (R < i10 || R >= x50Var.H) {
                return;
            }
            int i11 = R - i10;
            int i12 = d60.F3 ? 6 : 2;
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

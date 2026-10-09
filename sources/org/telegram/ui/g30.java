package org.telegram.ui;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class g30 extends s4.o0 {
    public final /* synthetic */ g60 a;

    public g30(g60 g60Var) {
        this.a = g60Var;
    }

    @Override // s4.o0
    public final void a(Rect rect, View view, RecyclerView recyclerView, s4.a1 a1Var) {
        recyclerView.getClass();
        int R = RecyclerView.R(view);
        if (R >= 0) {
            rect.setEmpty();
            a60 a60Var = this.a.P;
            int i10 = a60Var.G;
            if (R < i10 || R >= a60Var.H) {
                return;
            }
            int i11 = R - i10;
            int i12 = g60.F3 ? 6 : 2;
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

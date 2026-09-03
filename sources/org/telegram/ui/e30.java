package org.telegram.ui;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class e30 extends f2.v0 {
    public final /* synthetic */ d60 a;

    public e30(d60 d60Var) {
        this.a = d60Var;
    }

    @Override // f2.v0
    public final void a(Rect rect, View view, RecyclerView recyclerView, f2.j1 j1Var) {
        recyclerView.getClass();
        int R = RecyclerView.R(view);
        if (R >= 0) {
            rect.setEmpty();
            x50 x50Var = this.a.M;
            int i10 = x50Var.D;
            if (R < i10 || R >= x50Var.E) {
                return;
            }
            int i11 = R - i10;
            int i12 = d60.C3 ? 6 : 2;
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

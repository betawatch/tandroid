package org.telegram.ui;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class f30 extends f2.u0 {
    public final /* synthetic */ e60 a;

    public f30(e60 e60Var) {
        this.a = e60Var;
    }

    @Override // f2.u0
    public final void a(Rect rect, View view, RecyclerView recyclerView, f2.i1 i1Var) {
        recyclerView.getClass();
        int R = RecyclerView.R(view);
        if (R >= 0) {
            rect.setEmpty();
            y50 y50Var = this.a.M;
            int i10 = y50Var.D;
            if (R < i10 || R >= y50Var.E) {
                return;
            }
            int i11 = R - i10;
            int i12 = e60.C3 ? 6 : 2;
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

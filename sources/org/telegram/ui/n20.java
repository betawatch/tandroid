package org.telegram.ui;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class n20 extends f2.y0 {
    public final /* synthetic */ o50 a;

    public n20(o50 o50Var) {
        this.a = o50Var;
    }

    @Override // f2.y0
    public final void a(Rect rect, View view, RecyclerView recyclerView, f2.n1 n1Var) {
        recyclerView.getClass();
        int R = RecyclerView.R(view);
        if (R >= 0) {
            rect.setEmpty();
            i50 i50Var = this.a.L;
            int i9 = i50Var.C;
            if (R < i9 || R >= i50Var.D) {
                return;
            }
            int i10 = R - i9;
            int i11 = o50.B3 ? 6 : 2;
            int i12 = i10 % i11;
            if (i12 == 0) {
                rect.right = AndroidUtilities.dp(2.0f);
            } else if (i12 == i11 - 1) {
                rect.left = AndroidUtilities.dp(2.0f);
            } else {
                rect.left = AndroidUtilities.dp(1.0f);
            }
        }
    }
}

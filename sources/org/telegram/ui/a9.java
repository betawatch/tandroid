package org.telegram.ui;

import android.os.Build;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class a9 extends s4.r0 {
    public boolean a;
    public final /* synthetic */ n9 b;

    public a9(n9 n9Var) {
        this.b = n9Var;
    }

    @Override // s4.r0
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        bh.f fVar;
        n9 n9Var = this.b;
        ArrayList arrayList = n9Var.G;
        int L0 = n9Var.c.L0();
        int abs = L0 == -1 ? 0 : Math.abs(n9Var.c.N0() - L0) + 1;
        if (abs > 0) {
            int size = n9Var.d.W2.x.size();
            if (!n9Var.J && !n9Var.H && !arrayList.isEmpty() && abs + L0 >= size - 5) {
                AndroidUtilities.runOnUIThread(new org.telegram.messenger.voip.p0(18, this, (j9) i2.d.h(1, arrayList)));
            }
        }
        View childAt = recyclerView.getChildAt(0);
        int top = childAt != null ? childAt.getTop() : 0;
        if (i11 != 0 && this.a) {
            n9Var.f.e(i11 < 0, true);
        }
        this.a = true;
        n9Var.r.b(L0 != 0 || top < n9Var.d.getPaddingTop(), true);
        if (Build.VERSION.SDK_INT < 31 || (fVar = n9Var.Y) == null) {
            return;
        }
        fVar.f(i10, i11);
        n9Var.f0();
    }
}

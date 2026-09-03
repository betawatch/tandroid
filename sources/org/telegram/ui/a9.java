package org.telegram.ui;

import android.os.Build;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class a9 extends f2.z0 {
    public boolean a;
    public final /* synthetic */ n9 b;

    public a9(n9 n9Var) {
        this.b = n9Var;
    }

    @Override // f2.z0
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        ng.e eVar;
        n9 n9Var = this.b;
        ArrayList arrayList = n9Var.D;
        int L0 = n9Var.c.L0();
        int abs = L0 == -1 ? 0 : Math.abs(n9Var.c.N0() - L0) + 1;
        if (abs > 0) {
            int size = n9Var.d.V2.x.size();
            if (!n9Var.G && !n9Var.E && !arrayList.isEmpty() && abs + L0 >= size - 5) {
                AndroidUtilities.runOnUIThread(new org.telegram.messenger.voip.h(22, this, (j9) kf.k0.i(1, arrayList)));
            }
        }
        View childAt = recyclerView.getChildAt(0);
        int top = childAt != null ? childAt.getTop() : 0;
        if (i11 != 0 && this.a) {
            n9Var.f.e(i11 < 0, true);
        }
        this.a = true;
        n9Var.r.b(L0 != 0 || top < n9Var.d.getPaddingTop(), true);
        if (Build.VERSION.SDK_INT < 31 || (eVar = n9Var.V) == null) {
            return;
        }
        eVar.f(i10, i11);
        n9Var.f0();
    }
}

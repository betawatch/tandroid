package org.telegram.ui;

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class b9 extends s4.u0 {
    public boolean a;
    public final /* synthetic */ o9 b;

    public b9(o9 o9Var) {
        this.b = o9Var;
    }

    @Override // s4.u0
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        o9 o9Var = this.b;
        ArrayList arrayList = o9Var.w;
        int L0 = o9Var.b.L0();
        int abs = L0 == -1 ? 0 : Math.abs(o9Var.b.N0() - L0) + 1;
        if (abs > 0) {
            int size = o9Var.c.g3.y.size();
            if (!o9Var.E && !o9Var.x && !arrayList.isEmpty() && L0 + abs >= size - 5) {
                AndroidUtilities.runOnUIThread(new org.telegram.messenger.voip.m0(18, this, (k9) ic.a.g(1, arrayList)));
            }
        }
        if (i11 != 0 && this.a) {
            o9Var.f.e(i11 < 0, true);
        }
        this.a = true;
    }
}

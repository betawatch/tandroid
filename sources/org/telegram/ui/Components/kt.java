package org.telegram.ui.Components;

import android.widget.EdgeEffect;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class kt extends f2.s0 {
    public final jt[] a = new jt[4];
    public final ArrayList b = new ArrayList();

    @Override // f2.s0
    public final EdgeEffect a(RecyclerView recyclerView, int i10) {
        jt jtVar = new jt(recyclerView, i10, new ht(this, 0));
        this.a[i10] = jtVar;
        return jtVar;
    }
}

package org.telegram.ui.Components;

import android.widget.EdgeEffect;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class ot extends s4.l0 {
    public final nt[] a = new nt[4];
    public final ArrayList b = new ArrayList();

    @Override // s4.l0
    public final EdgeEffect a(RecyclerView recyclerView, int i10) {
        nt ntVar = new nt(recyclerView, i10, new lt(this, 0));
        this.a[i10] = ntVar;
        return ntVar;
    }
}

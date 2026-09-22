package org.telegram.ui.Components;

import android.widget.EdgeEffect;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
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

package org.telegram.ui.Components;

import android.widget.EdgeEffect;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class ft extends f2.t0 {
    public final et[] a = new et[4];
    public final ArrayList b = new ArrayList();

    @Override // f2.t0
    public final EdgeEffect a(RecyclerView recyclerView, int i10) {
        et etVar = new et(recyclerView, i10, new dt(this, 0));
        this.a[i10] = etVar;
        return etVar;
    }
}

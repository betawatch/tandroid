package org.telegram.ui.Components;

import android.widget.EdgeEffect;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class mt extends s4.l0 {
    public final lt[] a = new lt[4];
    public final ArrayList b = new ArrayList();

    @Override // s4.l0
    public final EdgeEffect a(RecyclerView recyclerView, int i10) {
        lt ltVar = new lt(recyclerView, i10, new kt(this, 0));
        this.a[i10] = ltVar;
        return ltVar;
    }
}

package org.telegram.ui.Components;

import android.widget.EdgeEffect;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class jt extends f2.s0 {
    public final ht[] a = new ht[4];
    public final ArrayList b = new ArrayList();

    @Override // f2.s0
    public final EdgeEffect a(RecyclerView recyclerView, int i10) {
        ht htVar = new ht(recyclerView, i10, new gt(this, 0));
        this.a[i10] = htVar;
        return htVar;
    }
}

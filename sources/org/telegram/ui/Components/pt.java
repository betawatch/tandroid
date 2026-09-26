package org.telegram.ui.Components;

import android.widget.EdgeEffect;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final class pt extends s4.l0 {
    public final ot[] a = new ot[4];
    public final ArrayList b = new ArrayList();

    @Override // s4.l0
    public final EdgeEffect a(RecyclerView recyclerView, int i10) {
        ot otVar = new ot(recyclerView, i10, new mt(this, 0));
        this.a[i10] = otVar;
        return otVar;
    }
}

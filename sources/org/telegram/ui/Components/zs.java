package org.telegram.ui.Components;

import android.widget.EdgeEffect;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class zs extends f2.u0 {
    public final ys[] a = new ys[4];
    public final ArrayList b = new ArrayList();

    @Override // f2.u0
    public final EdgeEffect a(RecyclerView recyclerView, int i10) {
        ys ysVar = new ys(recyclerView, i10, new xs(this, 0));
        this.a[i10] = ysVar;
        return ysVar;
    }
}

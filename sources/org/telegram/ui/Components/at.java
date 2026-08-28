package org.telegram.ui.Components;

import android.widget.EdgeEffect;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class at extends f2.v0 {
    public final zs[] a = new zs[4];
    public final ArrayList b = new ArrayList();

    @Override // f2.v0
    public final EdgeEffect a(RecyclerView recyclerView, int i9) {
        zs zsVar = new zs(recyclerView, i9, new ys(this, 0));
        this.a[i9] = zsVar;
        return zsVar;
    }
}

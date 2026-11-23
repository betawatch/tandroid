package org.telegram.ui.Components;

import android.os.Build;
import android.widget.EdgeEffect;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class at extends v4.m0 {
    public final zs[] a = new zs[4];
    public final ArrayList b = new ArrayList();

    @Override // v4.m0
    public final EdgeEffect a(RecyclerView recyclerView, int i7) {
        zs zsVar = new zs(recyclerView, i7, new xs(this, 0));
        this.a[i7] = zsVar;
        return zsVar;
    }

    public final float b(int i7) {
        zs zsVar = this.a[i7];
        if (Build.VERSION.SDK_INT < 31 || zsVar == null || zsVar.isFinished()) {
            return 0.0f;
        }
        return zsVar.getDistance();
    }
}

package org.telegram.ui.Components;

import android.os.Build;
import android.widget.EdgeEffect;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class bt extends v4.m0 {
    public final at[] a = new at[4];
    public final ArrayList b = new ArrayList();

    @Override // v4.m0
    public final EdgeEffect a(RecyclerView recyclerView, int i7) {
        at atVar = new at(recyclerView, i7, new ys(this, 0));
        this.a[i7] = atVar;
        return atVar;
    }

    public final float b(int i7) {
        at atVar = this.a[i7];
        if (Build.VERSION.SDK_INT < 31 || atVar == null || atVar.isFinished()) {
            return 0.0f;
        }
        return atVar.getDistance();
    }
}

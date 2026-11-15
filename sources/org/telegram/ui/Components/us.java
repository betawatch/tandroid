package org.telegram.ui.Components;

import android.os.Build;
import android.widget.EdgeEffect;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class us extends v4.l0 {
    public final ts[] a = new ts[4];
    public final ArrayList b = new ArrayList();

    @Override // v4.l0
    public final EdgeEffect a(RecyclerView recyclerView, int i7) {
        ts tsVar = new ts(recyclerView, i7, new rs(this, 0));
        this.a[i7] = tsVar;
        return tsVar;
    }

    public final float b(int i7) {
        ts tsVar = this.a[i7];
        if (Build.VERSION.SDK_INT < 31 || tsVar == null || tsVar.isFinished()) {
            return 0.0f;
        }
        return tsVar.getDistance();
    }
}

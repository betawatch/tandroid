package org.telegram.ui.Components;

import android.os.Build;
import android.widget.EdgeEffect;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class zs extends s4.k0 {
    public final ys[] a = new ys[4];
    public final ArrayList b = new ArrayList();

    @Override // s4.k0
    public final EdgeEffect a(RecyclerView recyclerView, int i10) {
        ys ysVar = new ys(recyclerView, i10, new ws(this, 0));
        this.a[i10] = ysVar;
        return ysVar;
    }

    public final float b(int i10) {
        ys ysVar = this.a[i10];
        if (Build.VERSION.SDK_INT < 31 || ysVar == null || ysVar.isFinished()) {
            return 0.0f;
        }
        return ysVar.getDistance();
    }
}

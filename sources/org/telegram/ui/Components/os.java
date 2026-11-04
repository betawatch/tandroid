package org.telegram.ui.Components;

import android.os.Build;
import android.widget.EdgeEffect;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class os extends u4.l0 {
    public final ns[] a = new ns[4];
    public final ArrayList b = new ArrayList();

    @Override // u4.l0
    public final EdgeEffect a(RecyclerView recyclerView, int i3) {
        ns nsVar = new ns(recyclerView, i3, new ls(this, 0));
        this.a[i3] = nsVar;
        return nsVar;
    }

    public final float b(int i3) {
        ns nsVar = this.a[i3];
        if (Build.VERSION.SDK_INT < 31 || nsVar == null || nsVar.isFinished()) {
            return 0.0f;
        }
        return nsVar.getDistance();
    }
}

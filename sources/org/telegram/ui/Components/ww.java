package org.telegram.ui.Components;

import android.os.Build;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final class ww extends sz {
    public final /* synthetic */ tz d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ww(tz tzVar) {
        super(tzVar, 2);
        this.d = tzVar;
    }

    @Override // org.telegram.ui.Components.sz, s4.r0
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        bh.f fVar;
        super.b(recyclerView, i10, i11);
        if (Build.VERSION.SDK_INT < 31 || (fVar = this.d.j2) == null) {
            return;
        }
        fVar.f(i10, i11);
    }
}

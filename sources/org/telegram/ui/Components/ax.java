package org.telegram.ui.Components;

import android.os.Build;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class ax extends vz {
    public final /* synthetic */ wz d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ax(wz wzVar) {
        super(wzVar, 2);
        this.d = wzVar;
    }

    @Override // org.telegram.ui.Components.vz, s4.r0
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        bh.f fVar;
        super.b(recyclerView, i10, i11);
        if (Build.VERSION.SDK_INT < 31 || (fVar = this.d.j2) == null) {
            return;
        }
        fVar.f(i10, i11);
    }
}

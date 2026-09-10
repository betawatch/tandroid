package org.telegram.ui.Components;

import android.os.Build;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class uw extends qz {
    public final /* synthetic */ rz d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uw(rz rzVar) {
        super(rzVar, 2);
        this.d = rzVar;
    }

    @Override // org.telegram.ui.Components.qz, s4.s0
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        rz rzVar;
        zg.e eVar;
        super.b(recyclerView, i10, i11);
        if (Build.VERSION.SDK_INT < 31 || (eVar = (rzVar = this.d).j2) == null) {
            return;
        }
        eVar.f(i10, i11);
        rzVar.C();
    }
}

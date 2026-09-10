package org.telegram.ui.Components;

import android.os.Build;
import androidx.recyclerview.widget.RecyclerView;
import j$.util.Objects;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class tx extends qz {
    public final /* synthetic */ rz d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tx(rz rzVar) {
        super(rzVar, 1);
        this.d = rzVar;
    }

    @Override // org.telegram.ui.Components.qz, s4.s0
    public final void a(RecyclerView recyclerView, int i10) {
        if (i10 == 0) {
            this.d.f0 = false;
        }
        super.a(recyclerView, i10);
    }

    @Override // org.telegram.ui.Components.qz, s4.s0
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        zg.e eVar;
        rz rzVar = this.d;
        ry ryVar = rzVar.S;
        qx qxVar = rzVar.Q;
        rzVar.W(qxVar.I0());
        if (Build.VERSION.SDK_INT >= 31 && (eVar = rzVar.j2) != null) {
            eVar.f(i10, i11);
            rzVar.C();
        }
        super.b(recyclerView, i10, i11);
        if (ryVar == null || rzVar.P.getAdapter() != ryVar) {
            return;
        }
        ry ryVar2 = ryVar.x.a;
        if (ryVar2.F.V.F || ryVar2.E) {
            return;
        }
        if (qxVar.N0() + 20 > ryVar.h()) {
            qy qyVar = ryVar.x;
            Objects.requireNonNull(qyVar);
            AndroidUtilities.runOnUIThread(new xw(qyVar, 1));
        }
    }
}

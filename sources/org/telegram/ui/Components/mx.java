package org.telegram.ui.Components;

import android.os.Build;
import androidx.recyclerview.widget.RecyclerView;
import j$.util.Objects;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class mx extends jz {
    public final /* synthetic */ kz d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mx(kz kzVar) {
        super(kzVar, 1);
        this.d = kzVar;
    }

    @Override // org.telegram.ui.Components.jz, s4.s0
    public final void a(RecyclerView recyclerView, int i10) {
        if (i10 == 0) {
            this.d.f0 = false;
        }
        super.a(recyclerView, i10);
    }

    @Override // org.telegram.ui.Components.jz, s4.s0
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        ah.i iVar;
        kz kzVar = this.d;
        jy jyVar = kzVar.S;
        jx jxVar = kzVar.Q;
        kzVar.U(jxVar.I0());
        if (Build.VERSION.SDK_INT >= 31 && (iVar = kzVar.j2) != null) {
            iVar.f(i10, i11);
        }
        super.b(recyclerView, i10, i11);
        if (jyVar == null || kzVar.P.getAdapter() != jyVar) {
            return;
        }
        jy jyVar2 = jyVar.x.a;
        if (jyVar2.F.V.F || jyVar2.E) {
            return;
        }
        if (jxVar.N0() + 20 > jyVar.h()) {
            iy iyVar = jyVar.x;
            Objects.requireNonNull(iyVar);
            AndroidUtilities.runOnUIThread(new rw(iyVar, 1));
        }
    }
}

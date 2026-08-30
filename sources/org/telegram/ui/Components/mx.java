package org.telegram.ui.Components;

import android.os.Build;
import androidx.recyclerview.widget.RecyclerView;
import j$.util.Objects;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class mx extends jz {
    public final /* synthetic */ kz d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mx(kz kzVar) {
        super(kzVar, 1);
        this.d = kzVar;
    }

    @Override // org.telegram.ui.Components.jz, f2.z0
    public final void a(RecyclerView recyclerView, int i10) {
        if (i10 == 0) {
            this.d.c0 = false;
        }
        super.a(recyclerView, i10);
    }

    @Override // org.telegram.ui.Components.jz, f2.z0
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        ng.e eVar;
        kz kzVar = this.d;
        jy jyVar = kzVar.P;
        jx jxVar = kzVar.N;
        kzVar.W(jxVar.I0());
        if (Build.VERSION.SDK_INT >= 31 && (eVar = kzVar.g2) != null) {
            eVar.f(i10, i11);
            kzVar.C();
        }
        super.b(recyclerView, i10, i11);
        if (jyVar == null || kzVar.M.getAdapter() != jyVar) {
            return;
        }
        jy jyVar2 = jyVar.x.a;
        if (jyVar2.C.S.C || jyVar2.B) {
            return;
        }
        if (jxVar.N0() + 20 > jyVar.h()) {
            iy iyVar = jyVar.x;
            Objects.requireNonNull(iyVar);
            AndroidUtilities.runOnUIThread(new ow(iyVar, 1));
        }
    }
}

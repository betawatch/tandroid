package org.telegram.ui.Components;

import android.os.Build;
import androidx.recyclerview.widget.RecyclerView;
import j$.util.Objects;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class ox extends lz {
    public final /* synthetic */ mz d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ox(mz mzVar) {
        super(mzVar, 1);
        this.d = mzVar;
    }

    @Override // org.telegram.ui.Components.lz, f2.a1
    public final void a(RecyclerView recyclerView, int i10) {
        if (i10 == 0) {
            this.d.c0 = false;
        }
        super.a(recyclerView, i10);
    }

    @Override // org.telegram.ui.Components.lz, f2.a1
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        og.e eVar;
        mz mzVar = this.d;
        ly lyVar = mzVar.P;
        lx lxVar = mzVar.N;
        mzVar.W(lxVar.I0());
        if (Build.VERSION.SDK_INT >= 31 && (eVar = mzVar.g2) != null) {
            eVar.f(i10, i11);
            mzVar.C();
        }
        super.b(recyclerView, i10, i11);
        if (lyVar == null || mzVar.M.getAdapter() != lyVar) {
            return;
        }
        ly lyVar2 = lyVar.x.a;
        if (lyVar2.C.S.C || lyVar2.B) {
            return;
        }
        if (lxVar.N0() + 20 > lyVar.h()) {
            ky kyVar = lyVar.x;
            Objects.requireNonNull(kyVar);
            AndroidUtilities.runOnUIThread(new qw(kyVar, 1));
        }
    }
}

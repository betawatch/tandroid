package org.telegram.ui.Components;

import android.os.Build;
import androidx.recyclerview.widget.RecyclerView;
import j$.util.Objects;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
/* loaded from: classes3.dex */
public final class px extends lz {
    public final /* synthetic */ mz d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public px(mz mzVar) {
        super(mzVar, 1);
        this.d = mzVar;
    }

    @Override // org.telegram.ui.Components.lz, s4.s0
    public final void a(RecyclerView recyclerView, int i10) {
        if (i10 == 0) {
            this.d.f0 = false;
        }
        super.a(recyclerView, i10);
    }

    @Override // org.telegram.ui.Components.lz, s4.s0
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        ah.h hVar;
        mz mzVar = this.d;
        my myVar = mzVar.S;
        mx mxVar = mzVar.Q;
        mzVar.U(mxVar.I0());
        if (Build.VERSION.SDK_INT >= 31 && (hVar = mzVar.j2) != null) {
            hVar.f(i10, i11);
        }
        super.b(recyclerView, i10, i11);
        if (myVar == null || mzVar.P.getAdapter() != myVar) {
            return;
        }
        my myVar2 = myVar.x.a;
        if (myVar2.F.V.F || myVar2.E) {
            return;
        }
        if (mxVar.N0() + 20 > myVar.h()) {
            ly lyVar = myVar.x;
            Objects.requireNonNull(lyVar);
            AndroidUtilities.runOnUIThread(new uw(lyVar, 1));
        }
    }
}

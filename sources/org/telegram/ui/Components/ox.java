package org.telegram.ui.Components;

import android.os.Build;
import androidx.recyclerview.widget.RecyclerView;
import j$.util.Objects;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes3.dex */
public final class ox extends jz {
    public final /* synthetic */ kz d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ox(kz kzVar) {
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
        bh.f fVar;
        kz kzVar = this.d;
        ky kyVar = kzVar.S;
        lx lxVar = kzVar.Q;
        kzVar.W(lxVar.I0());
        if (Build.VERSION.SDK_INT >= 31 && (fVar = kzVar.j2) != null) {
            fVar.f(i10, i11);
            kzVar.C();
        }
        super.b(recyclerView, i10, i11);
        if (kyVar == null || kzVar.P.getAdapter() != kyVar) {
            return;
        }
        ky kyVar2 = kyVar.x.a;
        if (kyVar2.F.V.F || kyVar2.E) {
            return;
        }
        if (lxVar.N0() + 20 > kyVar.h()) {
            jy jyVar = kyVar.x;
            Objects.requireNonNull(jyVar);
            AndroidUtilities.runOnUIThread(new sw(jyVar, 1));
        }
    }
}

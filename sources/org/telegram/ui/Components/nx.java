package org.telegram.ui.Components;

import android.os.Build;
import androidx.recyclerview.widget.RecyclerView;
import j$.util.Objects;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class nx extends kz {
    public final /* synthetic */ lz d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nx(lz lzVar) {
        super(lzVar, 1);
        this.d = lzVar;
    }

    @Override // org.telegram.ui.Components.kz, s4.s0
    public final void a(RecyclerView recyclerView, int i10) {
        if (i10 == 0) {
            this.d.f0 = false;
        }
        super.a(recyclerView, i10);
    }

    @Override // org.telegram.ui.Components.kz, s4.s0
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        ah.h hVar;
        lz lzVar = this.d;
        ky kyVar = lzVar.S;
        kx kxVar = lzVar.Q;
        lzVar.U(kxVar.I0());
        if (Build.VERSION.SDK_INT >= 31 && (hVar = lzVar.j2) != null) {
            hVar.f(i10, i11);
        }
        super.b(recyclerView, i10, i11);
        if (kyVar == null || lzVar.P.getAdapter() != kyVar) {
            return;
        }
        ky kyVar2 = kyVar.x.a;
        if (kyVar2.F.V.F || kyVar2.E) {
            return;
        }
        if (kxVar.N0() + 20 > kyVar.h()) {
            jy jyVar = kyVar.x;
            Objects.requireNonNull(jyVar);
            AndroidUtilities.runOnUIThread(new sw(jyVar, 1));
        }
    }
}

package org.telegram.ui.Components;

import android.os.Build;
import androidx.recyclerview.widget.RecyclerView;
import j$.util.Objects;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final class ox extends kz {
    public final /* synthetic */ lz d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ox(lz lzVar) {
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
        ly lyVar = lzVar.S;
        lx lxVar = lzVar.Q;
        lzVar.U(lxVar.I0());
        if (Build.VERSION.SDK_INT >= 31 && (hVar = lzVar.j2) != null) {
            hVar.f(i10, i11);
        }
        super.b(recyclerView, i10, i11);
        if (lyVar == null || lzVar.P.getAdapter() != lyVar) {
            return;
        }
        ly lyVar2 = lyVar.x.a;
        if (lyVar2.F.V.F || lyVar2.E) {
            return;
        }
        if (lxVar.N0() + 20 > lyVar.h()) {
            ky kyVar = lyVar.x;
            Objects.requireNonNull(kyVar);
            AndroidUtilities.runOnUIThread(new sw(kyVar, 1));
        }
    }
}

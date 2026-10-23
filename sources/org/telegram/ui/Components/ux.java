package org.telegram.ui.Components;

import android.os.Build;
import androidx.recyclerview.widget.RecyclerView;
import j$.util.Objects;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes3.dex */
public final class ux extends sz {
    public final /* synthetic */ tz d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ux(tz tzVar) {
        super(tzVar, 1);
        this.d = tzVar;
    }

    @Override // org.telegram.ui.Components.sz, s4.r0
    public final void a(RecyclerView recyclerView, int i10) {
        if (i10 == 0) {
            this.d.f0 = false;
        }
        super.a(recyclerView, i10);
    }

    @Override // org.telegram.ui.Components.sz, s4.r0
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        bh.f fVar;
        tz tzVar = this.d;
        ty tyVar = tzVar.S;
        rx rxVar = tzVar.Q;
        tzVar.U(rxVar.I0());
        if (Build.VERSION.SDK_INT >= 31 && (fVar = tzVar.j2) != null) {
            fVar.f(i10, i11);
        }
        super.b(recyclerView, i10, i11);
        if (tyVar == null || tzVar.P.getAdapter() != tyVar) {
            return;
        }
        ty tyVar2 = tyVar.x.a;
        if (tyVar2.F.V.F || tyVar2.E) {
            return;
        }
        if (rxVar.N0() + 20 > tyVar.h()) {
            sy syVar = tyVar.x;
            Objects.requireNonNull(syVar);
            AndroidUtilities.runOnUIThread(new zw(syVar, 1));
        }
    }
}

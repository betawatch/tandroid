package org.telegram.ui.Components;

import android.os.Build;
import androidx.recyclerview.widget.RecyclerView;
import j$.util.Objects;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class yx extends vz {
    public final /* synthetic */ wz d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yx(wz wzVar) {
        super(wzVar, 1);
        this.d = wzVar;
    }

    @Override // org.telegram.ui.Components.vz, s4.r0
    public final void a(RecyclerView recyclerView, int i10) {
        if (i10 == 0) {
            this.d.f0 = false;
        }
        super.a(recyclerView, i10);
    }

    @Override // org.telegram.ui.Components.vz, s4.r0
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        bh.f fVar;
        wz wzVar = this.d;
        vy vyVar = wzVar.S;
        vx vxVar = wzVar.Q;
        wzVar.U(vxVar.I0());
        if (Build.VERSION.SDK_INT >= 31 && (fVar = wzVar.j2) != null) {
            fVar.f(i10, i11);
        }
        super.b(recyclerView, i10, i11);
        if (vyVar == null || wzVar.P.getAdapter() != vyVar) {
            return;
        }
        vy vyVar2 = vyVar.x.a;
        if (vyVar2.F.V.F || vyVar2.E) {
            return;
        }
        if (vxVar.N0() + 20 > vyVar.h()) {
            uy uyVar = vyVar.x;
            Objects.requireNonNull(uyVar);
            AndroidUtilities.runOnUIThread(new dx(uyVar, 1));
        }
    }
}

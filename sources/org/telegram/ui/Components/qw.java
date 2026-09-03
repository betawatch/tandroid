package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class qw extends f2.w {
    public final /* synthetic */ kz Q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qw(kz kzVar) {
        super(5);
        this.Q = kzVar;
    }

    @Override // f2.w, f2.i0, f2.v0
    public final int o0(int i10, af.h hVar, f2.i1 i1Var) {
        int o02 = super.o0(i10, hVar, i1Var);
        kz kzVar = this.Q;
        if (o02 != 0 && kzVar.A0.getScrollState() == 1) {
            kzVar.U1 = false;
            kzVar.a0();
        }
        if (kzVar.Q0 == null) {
            zw zwVar = new zw(kzVar, kzVar.Z0, kzVar.q1.a(), kzVar.q1.f(), 0);
            kzVar.Q0 = zwVar;
            zwVar.a();
        }
        kzVar.Q0.b();
        return o02;
    }

    @Override // f2.i0, f2.v0
    public final void v0(RecyclerView recyclerView, f2.i1 i1Var, int i10) {
        try {
            wh.o oVar = new wh.o(recyclerView.getContext(), 2);
            oVar.a = i10;
            w0(oVar);
        } catch (Exception e) {
            FileLog.e(e);
        }
    }
}

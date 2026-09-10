package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class qx extends s4.s {
    public final /* synthetic */ rz Q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qx(rz rzVar) {
        super(8);
        this.Q = rzVar;
    }

    @Override // s4.c0, s4.o0
    public final void v0(RecyclerView recyclerView, s4.z0 z0Var, int i10) {
        try {
            bi.t1 t1Var = new bi.t1(this, recyclerView.getContext(), 2);
            t1Var.a = i10;
            w0(t1Var);
        } catch (Exception e) {
            FileLog.e(e);
        }
    }
}

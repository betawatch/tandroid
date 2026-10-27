package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class qx extends s4.t {
    public final /* synthetic */ sz Q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qx(sz szVar) {
        super(8);
        this.Q = szVar;
    }

    @Override // s4.c0, s4.p0
    public final void v0(RecyclerView recyclerView, s4.b1 b1Var, int i10) {
        try {
            fi.k1 k1Var = new fi.k1(this, recyclerView.getContext(), 2);
            k1Var.a = i10;
            w0(k1Var);
        } catch (Exception e) {
            FileLog.e(e);
        }
    }
}
